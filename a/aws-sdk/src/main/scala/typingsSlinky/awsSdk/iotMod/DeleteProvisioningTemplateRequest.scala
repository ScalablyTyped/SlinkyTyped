package typingsSlinky.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteProvisioningTemplateRequest extends StObject {
  
  /**
    * The name of the fleet provision template to delete.
    */
  var templateName: TemplateName = js.native
}
object DeleteProvisioningTemplateRequest {
  
  @scala.inline
  def apply(templateName: TemplateName): DeleteProvisioningTemplateRequest = {
    val __obj = js.Dynamic.literal(templateName = templateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteProvisioningTemplateRequest]
  }
  
  @scala.inline
  implicit class DeleteProvisioningTemplateRequestMutableBuilder[Self <: DeleteProvisioningTemplateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTemplateName(value: TemplateName): Self = StObject.set(x, "templateName", value.asInstanceOf[js.Any])
  }
}
