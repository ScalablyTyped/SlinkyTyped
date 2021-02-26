package typingsSlinky.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateProvisioningTemplateRequest extends StObject {
  
  /**
    * The description of the fleet provisioning template.
    */
  var description: js.UndefOr[TemplateDescription] = js.native
  
  /**
    * True to enable the fleet provisioning template, otherwise false.
    */
  var enabled: js.UndefOr[Enabled] = js.native
  
  /**
    * Creates a pre-provisioning hook template.
    */
  var preProvisioningHook: js.UndefOr[ProvisioningHook] = js.native
  
  /**
    * The role ARN for the role associated with the fleet provisioning template. This IoT role grants permission to provision a device.
    */
  var provisioningRoleArn: RoleArn = js.native
  
  /**
    * Metadata which can be used to manage the fleet provisioning template.  For URI Request parameters use format: ...key1=value1&amp;key2=value2... For the CLI command-line parameter use format: &amp;&amp;tags "key1=value1&amp;key2=value2..." For the cli-input-json file use format: "tags": "key1=value1&amp;key2=value2..." 
    */
  var tags: js.UndefOr[TagList] = js.native
  
  /**
    * The JSON formatted contents of the fleet provisioning template.
    */
  var templateBody: TemplateBody = js.native
  
  /**
    * The name of the fleet provisioning template.
    */
  var templateName: TemplateName = js.native
}
object CreateProvisioningTemplateRequest {
  
  @scala.inline
  def apply(provisioningRoleArn: RoleArn, templateBody: TemplateBody, templateName: TemplateName): CreateProvisioningTemplateRequest = {
    val __obj = js.Dynamic.literal(provisioningRoleArn = provisioningRoleArn.asInstanceOf[js.Any], templateBody = templateBody.asInstanceOf[js.Any], templateName = templateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProvisioningTemplateRequest]
  }
  
  @scala.inline
  implicit class CreateProvisioningTemplateRequestMutableBuilder[Self <: CreateProvisioningTemplateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: TemplateDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setEnabled(value: Enabled): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setPreProvisioningHook(value: ProvisioningHook): Self = StObject.set(x, "preProvisioningHook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreProvisioningHookUndefined: Self = StObject.set(x, "preProvisioningHook", js.undefined)
    
    @scala.inline
    def setProvisioningRoleArn(value: RoleArn): Self = StObject.set(x, "provisioningRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    @scala.inline
    def setTemplateBody(value: TemplateBody): Self = StObject.set(x, "templateBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateName(value: TemplateName): Self = StObject.set(x, "templateName", value.asInstanceOf[js.Any])
  }
}
