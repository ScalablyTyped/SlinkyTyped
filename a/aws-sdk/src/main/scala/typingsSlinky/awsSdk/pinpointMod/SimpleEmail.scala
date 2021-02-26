package typingsSlinky.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SimpleEmail extends StObject {
  
  /**
    * The body of the email message, in HTML format. We recommend using HTML format for email clients that render HTML content. You can include links, formatted text, and more in an HTML message.
    */
  var HtmlPart: js.UndefOr[SimpleEmailPart] = js.native
  
  /**
    * The subject line, or title, of the email.
    */
  var Subject: js.UndefOr[SimpleEmailPart] = js.native
  
  /**
    * The body of the email message, in plain text format. We recommend using plain text format for email clients that don't render HTML content and clients that are connected to high-latency networks, such as mobile devices.
    */
  var TextPart: js.UndefOr[SimpleEmailPart] = js.native
}
object SimpleEmail {
  
  @scala.inline
  def apply(): SimpleEmail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SimpleEmail]
  }
  
  @scala.inline
  implicit class SimpleEmailMutableBuilder[Self <: SimpleEmail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHtmlPart(value: SimpleEmailPart): Self = StObject.set(x, "HtmlPart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlPartUndefined: Self = StObject.set(x, "HtmlPart", js.undefined)
    
    @scala.inline
    def setSubject(value: SimpleEmailPart): Self = StObject.set(x, "Subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubjectUndefined: Self = StObject.set(x, "Subject", js.undefined)
    
    @scala.inline
    def setTextPart(value: SimpleEmailPart): Self = StObject.set(x, "TextPart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextPartUndefined: Self = StObject.set(x, "TextPart", js.undefined)
  }
}
