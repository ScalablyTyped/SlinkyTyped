package typingsSlinky.pulumiAws.inputMod.autoscaling

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupMixedInstancesPolicyLaunchTemplate extends js.Object {
  /**
    * Nested argument defines the Launch Template. Defined below.
    */
  var launchTemplateSpecification: Input[GroupMixedInstancesPolicyLaunchTemplateLaunchTemplateSpecification] = js.native
  /**
    * List of nested arguments provides the ability to specify multiple instance types. This will override the same parameter in the launch template. For on-demand instances, Auto Scaling considers the order of preference of instance types to launch based on the order specified in the overrides list. Defined below.
    */
  var overrides: js.UndefOr[Input[js.Array[Input[GroupMixedInstancesPolicyLaunchTemplateOverride]]]] = js.native
}

object GroupMixedInstancesPolicyLaunchTemplate {
  @scala.inline
  def apply(
    launchTemplateSpecification: Input[GroupMixedInstancesPolicyLaunchTemplateLaunchTemplateSpecification]
  ): GroupMixedInstancesPolicyLaunchTemplate = {
    val __obj = js.Dynamic.literal(launchTemplateSpecification = launchTemplateSpecification.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupMixedInstancesPolicyLaunchTemplate]
  }
  @scala.inline
  implicit class GroupMixedInstancesPolicyLaunchTemplateOps[Self <: GroupMixedInstancesPolicyLaunchTemplate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLaunchTemplateSpecification(value: Input[GroupMixedInstancesPolicyLaunchTemplateLaunchTemplateSpecification]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launchTemplateSpecification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverrides(value: Input[js.Array[Input[GroupMixedInstancesPolicyLaunchTemplateOverride]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverrides: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrides")(js.undefined)
        ret
    }
  }
  
}

