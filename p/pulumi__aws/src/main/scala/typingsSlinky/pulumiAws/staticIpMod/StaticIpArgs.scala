package typingsSlinky.pulumiAws.staticIpMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StaticIpArgs extends js.Object {
  /**
    * The name for the allocated static IP
    */
  val name: js.UndefOr[Input[String]] = js.native
}

object StaticIpArgs {
  @scala.inline
  def apply(): StaticIpArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StaticIpArgs]
  }
  @scala.inline
  implicit class StaticIpArgsOps[Self <: StaticIpArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
  }
  
}

