package typingsSlinky.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeCommandsResult extends js.Object {
  /**
    * An array of Command objects that describe each of the specified commands.
    */
  var Commands: js.UndefOr[typingsSlinky.awsSdk.opsworksMod.Commands] = js.native
}

object DescribeCommandsResult {
  @scala.inline
  def apply(): DescribeCommandsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCommandsResult]
  }
  @scala.inline
  implicit class DescribeCommandsResultOps[Self <: DescribeCommandsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommands(value: Commands): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Commands")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommands: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Commands")(js.undefined)
        ret
    }
  }
  
}

