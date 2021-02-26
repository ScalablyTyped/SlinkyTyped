package typingsSlinky.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Template extends StObject {
  
  /**
    * The HTML body of the email.
    */
  var HtmlPart: js.UndefOr[typingsSlinky.awsSdk.sesMod.HtmlPart] = js.native
  
  /**
    * The subject line of the email.
    */
  var SubjectPart: js.UndefOr[typingsSlinky.awsSdk.sesMod.SubjectPart] = js.native
  
  /**
    * The name of the template. You will refer to this name when you send email using the SendTemplatedEmail or SendBulkTemplatedEmail operations.
    */
  var TemplateName: typingsSlinky.awsSdk.sesMod.TemplateName = js.native
  
  /**
    * The email body that will be visible to recipients whose email clients do not display HTML.
    */
  var TextPart: js.UndefOr[typingsSlinky.awsSdk.sesMod.TextPart] = js.native
}
object Template {
  
  @scala.inline
  def apply(TemplateName: TemplateName): Template = {
    val __obj = js.Dynamic.literal(TemplateName = TemplateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Template]
  }
  
  @scala.inline
  implicit class TemplateMutableBuilder[Self <: Template] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHtmlPart(value: HtmlPart): Self = StObject.set(x, "HtmlPart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlPartUndefined: Self = StObject.set(x, "HtmlPart", js.undefined)
    
    @scala.inline
    def setSubjectPart(value: SubjectPart): Self = StObject.set(x, "SubjectPart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubjectPartUndefined: Self = StObject.set(x, "SubjectPart", js.undefined)
    
    @scala.inline
    def setTemplateName(value: TemplateName): Self = StObject.set(x, "TemplateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextPart(value: TextPart): Self = StObject.set(x, "TextPart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextPartUndefined: Self = StObject.set(x, "TextPart", js.undefined)
  }
}
