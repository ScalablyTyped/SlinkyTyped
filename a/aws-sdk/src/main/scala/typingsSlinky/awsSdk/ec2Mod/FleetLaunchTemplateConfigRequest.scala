package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FleetLaunchTemplateConfigRequest extends js.Object {
  /**
    * The launch template to use. You must specify either the launch template ID or launch template name in the request. 
    */
  var LaunchTemplateSpecification: js.UndefOr[FleetLaunchTemplateSpecificationRequest] = js.native
  /**
    * Any parameters that you specify override the same parameters in the launch template.
    */
  var Overrides: js.UndefOr[FleetLaunchTemplateOverridesListRequest] = js.native
}

object FleetLaunchTemplateConfigRequest {
  @scala.inline
  def apply(): FleetLaunchTemplateConfigRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FleetLaunchTemplateConfigRequest]
  }
  @scala.inline
  implicit class FleetLaunchTemplateConfigRequestOps[Self <: FleetLaunchTemplateConfigRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLaunchTemplateSpecification(value: FleetLaunchTemplateSpecificationRequest): Self = {
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
    def withOverrides(value: FleetLaunchTemplateOverridesListRequest): Self = {
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

