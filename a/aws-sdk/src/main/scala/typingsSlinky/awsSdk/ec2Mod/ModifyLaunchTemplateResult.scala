package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyLaunchTemplateResult extends js.Object {
  /**
    * Information about the launch template.
    */
  var LaunchTemplate: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.LaunchTemplate] = js.native
}

object ModifyLaunchTemplateResult {
  @scala.inline
  def apply(): ModifyLaunchTemplateResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyLaunchTemplateResult]
  }
  @scala.inline
  implicit class ModifyLaunchTemplateResultOps[Self <: ModifyLaunchTemplateResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLaunchTemplate(value: LaunchTemplate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LaunchTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLaunchTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LaunchTemplate")(js.undefined)
        ret
    }
  }
  
}

