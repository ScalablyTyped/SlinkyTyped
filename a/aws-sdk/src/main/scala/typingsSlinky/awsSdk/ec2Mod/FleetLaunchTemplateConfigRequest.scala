package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLaunchTemplateSpecification(value: FleetLaunchTemplateSpecificationRequest): Self = this.set("LaunchTemplateSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLaunchTemplateSpecification: Self = this.set("LaunchTemplateSpecification", js.undefined)
    
    @scala.inline
    def setOverridesVarargs(value: FleetLaunchTemplateOverridesRequest*): Self = this.set("Overrides", js.Array(value :_*))
    
    @scala.inline
    def setOverrides(value: FleetLaunchTemplateOverridesListRequest): Self = this.set("Overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverrides: Self = this.set("Overrides", js.undefined)
  }
}
