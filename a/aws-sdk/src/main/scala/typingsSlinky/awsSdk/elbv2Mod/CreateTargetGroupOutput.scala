package typingsSlinky.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTargetGroupOutput extends js.Object {
  /**
    * Information about the target group.
    */
  var TargetGroups: js.UndefOr[typingsSlinky.awsSdk.elbv2Mod.TargetGroups] = js.native
}

object CreateTargetGroupOutput {
  @scala.inline
  def apply(): CreateTargetGroupOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTargetGroupOutput]
  }
  @scala.inline
  implicit class CreateTargetGroupOutputOps[Self <: CreateTargetGroupOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTargetGroups(value: TargetGroups): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetGroups")(js.undefined)
        ret
    }
  }
  
}

