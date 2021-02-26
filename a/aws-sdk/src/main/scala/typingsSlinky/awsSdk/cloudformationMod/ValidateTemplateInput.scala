package typingsSlinky.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidateTemplateInput extends StObject {
  
  /**
    * Structure containing the template body with a minimum length of 1 byte and a maximum length of 51,200 bytes. For more information, go to Template Anatomy in the AWS CloudFormation User Guide. Conditional: You must pass TemplateURL or TemplateBody. If both are passed, only TemplateBody is used.
    */
  var TemplateBody: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.TemplateBody] = js.native
  
  /**
    * Location of file containing the template body. The URL must point to a template (max size: 460,800 bytes) that is located in an Amazon S3 bucket. For more information, go to Template Anatomy in the AWS CloudFormation User Guide. Conditional: You must pass TemplateURL or TemplateBody. If both are passed, only TemplateBody is used.
    */
  var TemplateURL: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.TemplateURL] = js.native
}
object ValidateTemplateInput {
  
  @scala.inline
  def apply(): ValidateTemplateInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidateTemplateInput]
  }
  
  @scala.inline
  implicit class ValidateTemplateInputMutableBuilder[Self <: ValidateTemplateInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTemplateBody(value: TemplateBody): Self = StObject.set(x, "TemplateBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateBodyUndefined: Self = StObject.set(x, "TemplateBody", js.undefined)
    
    @scala.inline
    def setTemplateURL(value: TemplateURL): Self = StObject.set(x, "TemplateURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateURLUndefined: Self = StObject.set(x, "TemplateURL", js.undefined)
  }
}
