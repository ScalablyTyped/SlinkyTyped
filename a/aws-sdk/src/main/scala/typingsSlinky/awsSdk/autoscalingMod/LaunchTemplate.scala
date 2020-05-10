package typingsSlinky.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchTemplate extends js.Object {
  /**
    * The launch template to use. You must specify either the launch template ID or launch template name in the request.
    */
  var LaunchTemplateSpecification: js.UndefOr[typingsSlinky.awsSdk.autoscalingMod.LaunchTemplateSpecification] = js.native
  /**
    * An optional setting. Any parameters that you specify override the same parameters in the launch template. Currently, the only supported override is instance type. You can specify between 1 and 20 instance types.
    */
  var Overrides: js.UndefOr[typingsSlinky.awsSdk.autoscalingMod.Overrides] = js.native
}

object LaunchTemplate {
  @scala.inline
  def apply(): LaunchTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplate]
  }
  @scala.inline
  implicit class LaunchTemplateOps[Self <: LaunchTemplate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLaunchTemplateSpecification(value: LaunchTemplateSpecification): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LaunchTemplateSpecification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLaunchTemplateSpecification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LaunchTemplateSpecification")(js.undefined)
        ret
    }
    @scala.inline
    def withOverrides(value: Overrides): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Overrides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverrides: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Overrides")(js.undefined)
        ret
    }
  }
  
}

