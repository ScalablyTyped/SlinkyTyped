package typingsSlinky.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateStackResult extends js.Object {
  /**
    * The stack ID, which is an opaque string that you use to identify the stack when performing actions such as DescribeStacks.
    */
  var StackId: js.UndefOr[String] = js.native
}

object CreateStackResult {
  @scala.inline
  def apply(): CreateStackResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateStackResult]
  }
  @scala.inline
  implicit class CreateStackResultOps[Self <: CreateStackResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStackId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackId")(js.undefined)
        ret
    }
  }
  
}

