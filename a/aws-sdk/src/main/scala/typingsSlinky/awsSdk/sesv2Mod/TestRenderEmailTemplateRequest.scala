package typingsSlinky.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestRenderEmailTemplateRequest extends StObject {
  
  /**
    * A list of replacement values to apply to the template. This parameter is a JSON object, typically consisting of key-value pairs in which the keys correspond to replacement tags in the email template.
    */
  var TemplateData: EmailTemplateData = js.native
  
  /**
    * The name of the template that you want to render.
    */
  var TemplateName: EmailTemplateName = js.native
}
object TestRenderEmailTemplateRequest {
  
  @scala.inline
  def apply(TemplateData: EmailTemplateData, TemplateName: EmailTemplateName): TestRenderEmailTemplateRequest = {
    val __obj = js.Dynamic.literal(TemplateData = TemplateData.asInstanceOf[js.Any], TemplateName = TemplateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestRenderEmailTemplateRequest]
  }
  
  @scala.inline
  implicit class TestRenderEmailTemplateRequestMutableBuilder[Self <: TestRenderEmailTemplateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTemplateData(value: EmailTemplateData): Self = StObject.set(x, "TemplateData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateName(value: EmailTemplateName): Self = StObject.set(x, "TemplateName", value.asInstanceOf[js.Any])
  }
}
