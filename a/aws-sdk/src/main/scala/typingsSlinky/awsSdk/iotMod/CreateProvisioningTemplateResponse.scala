package typingsSlinky.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateProvisioningTemplateResponse extends StObject {
  
  /**
    * The default version of the fleet provisioning template.
    */
  var defaultVersionId: js.UndefOr[TemplateVersionId] = js.native
  
  /**
    * The ARN that identifies the provisioning template.
    */
  var templateArn: js.UndefOr[TemplateArn] = js.native
  
  /**
    * The name of the fleet provisioning template.
    */
  var templateName: js.UndefOr[TemplateName] = js.native
}
object CreateProvisioningTemplateResponse {
  
  @scala.inline
  def apply(): CreateProvisioningTemplateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateProvisioningTemplateResponse]
  }
  
  @scala.inline
  implicit class CreateProvisioningTemplateResponseMutableBuilder[Self <: CreateProvisioningTemplateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultVersionId(value: TemplateVersionId): Self = StObject.set(x, "defaultVersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultVersionIdUndefined: Self = StObject.set(x, "defaultVersionId", js.undefined)
    
    @scala.inline
    def setTemplateArn(value: TemplateArn): Self = StObject.set(x, "templateArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateArnUndefined: Self = StObject.set(x, "templateArn", js.undefined)
    
    @scala.inline
    def setTemplateName(value: TemplateName): Self = StObject.set(x, "templateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateNameUndefined: Self = StObject.set(x, "templateName", js.undefined)
  }
}
