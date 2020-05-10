package typingsSlinky.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchTemplateSpecification extends js.Object {
  /**
    * The ID of the launch template. You must specify either a template ID or a template name.
    */
  var LaunchTemplateId: js.UndefOr[XmlStringMaxLen255] = js.native
  /**
    * The name of the launch template. You must specify either a template name or a template ID.
    */
  var LaunchTemplateName: js.UndefOr[typingsSlinky.awsSdk.autoscalingMod.LaunchTemplateName] = js.native
  /**
    * The version number, $Latest, or $Default. If the value is $Latest, Amazon EC2 Auto Scaling selects the latest version of the launch template when launching instances. If the value is $Default, Amazon EC2 Auto Scaling selects the default version of the launch template when launching instances. The default value is $Default.
    */
  var Version: js.UndefOr[XmlStringMaxLen255] = js.native
}

object LaunchTemplateSpecification {
  @scala.inline
  def apply(): LaunchTemplateSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplateSpecification]
  }
  @scala.inline
  implicit class LaunchTemplateSpecificationOps[Self <: LaunchTemplateSpecification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLaunchTemplateId(value: XmlStringMaxLen255): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LaunchTemplateId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLaunchTemplateId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LaunchTemplateId")(js.undefined)
        ret
    }
    @scala.inline
    def withLaunchTemplateName(value: LaunchTemplateName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LaunchTemplateName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLaunchTemplateName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LaunchTemplateName")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: XmlStringMaxLen255): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Version")(js.undefined)
        ret
    }
  }
  
}

