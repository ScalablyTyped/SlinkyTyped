package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateLaunchTemplateVersionResult extends js.Object {
  /**
    * Information about the launch template version.
    */
  var LaunchTemplateVersion: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.LaunchTemplateVersion] = js.native
}

object CreateLaunchTemplateVersionResult {
  @scala.inline
  def apply(): CreateLaunchTemplateVersionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateLaunchTemplateVersionResult]
  }
  @scala.inline
  implicit class CreateLaunchTemplateVersionResultOps[Self <: CreateLaunchTemplateVersionResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLaunchTemplateVersion(value: LaunchTemplateVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LaunchTemplateVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLaunchTemplateVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LaunchTemplateVersion")(js.undefined)
        ret
    }
  }
  
}

