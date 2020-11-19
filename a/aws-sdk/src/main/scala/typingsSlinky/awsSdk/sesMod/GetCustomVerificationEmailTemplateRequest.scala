package typingsSlinky.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCustomVerificationEmailTemplateRequest extends js.Object {
  
  /**
    * The name of the custom verification email template that you want to retrieve.
    */
  var TemplateName: typingsSlinky.awsSdk.sesMod.TemplateName = js.native
}
object GetCustomVerificationEmailTemplateRequest {
  
  @scala.inline
  def apply(TemplateName: TemplateName): GetCustomVerificationEmailTemplateRequest = {
    val __obj = js.Dynamic.literal(TemplateName = TemplateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCustomVerificationEmailTemplateRequest]
  }
  
  @scala.inline
  implicit class GetCustomVerificationEmailTemplateRequestOps[Self <: GetCustomVerificationEmailTemplateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTemplateName(value: TemplateName): Self = this.set("TemplateName", value.asInstanceOf[js.Any])
  }
}
