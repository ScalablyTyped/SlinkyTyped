package typingsSlinky.pulumiAws.outputMod.autoscaling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupMixedInstancesPolicyLaunchTemplateLaunchTemplateSpecification extends js.Object {
  /**
    * The ID of the launch template. Conflicts with `launchTemplateName`.
    */
  var launchTemplateId: String = js.native
  /**
    * The name of the launch template. Conflicts with `launchTemplateId`.
    */
  var launchTemplateName: String = js.native
  /**
    * Template version. Can be version number, `$Latest`, or `$Default`. (Default: `$Default`).
    */
  var version: js.UndefOr[String] = js.native
}

object GroupMixedInstancesPolicyLaunchTemplateLaunchTemplateSpecification {
  @scala.inline
  def apply(launchTemplateId: String, launchTemplateName: String): GroupMixedInstancesPolicyLaunchTemplateLaunchTemplateSpecification = {
    val __obj = js.Dynamic.literal(launchTemplateId = launchTemplateId.asInstanceOf[js.Any], launchTemplateName = launchTemplateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupMixedInstancesPolicyLaunchTemplateLaunchTemplateSpecification]
  }
  @scala.inline
  implicit class GroupMixedInstancesPolicyLaunchTemplateLaunchTemplateSpecificationOps[Self <: GroupMixedInstancesPolicyLaunchTemplateLaunchTemplateSpecification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLaunchTemplateId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launchTemplateId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLaunchTemplateName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launchTemplateName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

