package typingsSlinky.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateProvisioningClaimRequest extends StObject {
  
  /**
    * The name of the provisioning template to use.
    */
  var templateName: TemplateName = js.native
}
object CreateProvisioningClaimRequest {
  
  @scala.inline
  def apply(templateName: TemplateName): CreateProvisioningClaimRequest = {
    val __obj = js.Dynamic.literal(templateName = templateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProvisioningClaimRequest]
  }
  
  @scala.inline
  implicit class CreateProvisioningClaimRequestMutableBuilder[Self <: CreateProvisioningClaimRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTemplateName(value: TemplateName): Self = StObject.set(x, "templateName", value.asInstanceOf[js.Any])
  }
}
