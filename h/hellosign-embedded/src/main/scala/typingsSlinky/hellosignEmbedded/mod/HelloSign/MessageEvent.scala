package typingsSlinky.hellosignEmbedded.mod.HelloSign

import typingsSlinky.hellosignEmbedded.anon.Ccemailaddresses
import typingsSlinky.hellosignEmbedded.anon.Ccroles
import typingsSlinky.hellosignEmbedded.hellosignEmbeddedStrings.error
import typingsSlinky.hellosignEmbedded.hellosignEmbeddedStrings.signature_request_canceled
import typingsSlinky.hellosignEmbedded.hellosignEmbeddedStrings.signature_request_declined
import typingsSlinky.hellosignEmbedded.hellosignEmbeddedStrings.signature_request_sent
import typingsSlinky.hellosignEmbedded.hellosignEmbeddedStrings.signature_request_signed
import typingsSlinky.hellosignEmbedded.hellosignEmbeddedStrings.template_created
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.hellosignEmbedded.mod.HelloSign.SignedMessageEvent
  - typingsSlinky.hellosignEmbedded.mod.HelloSign.DeclinedMessageEvent
  - typingsSlinky.hellosignEmbedded.mod.HelloSign.CanceledMessageEvent
  - typingsSlinky.hellosignEmbedded.mod.HelloSign.SentMessageEvent
  - typingsSlinky.hellosignEmbedded.mod.HelloSign.TemplateCreatedMessageEvent
  - typingsSlinky.hellosignEmbedded.mod.HelloSign.ErrorMessageEvent
*/
trait MessageEvent extends js.Object
object MessageEvent {
  
  @scala.inline
  def DeclinedMessageEvent(event: signature_request_declined, signature_id: String): MessageEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], signature_id = signature_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageEvent]
  }
  
  @scala.inline
  def SignedMessageEvent(event: signature_request_signed, signature_id: String): MessageEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], signature_id = signature_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageEvent]
  }
  
  @scala.inline
  def SentMessageEvent(
    event: signature_request_sent,
    signature_request_id: String,
    signature_request_info: Ccemailaddresses
  ): MessageEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], signature_request_id = signature_request_id.asInstanceOf[js.Any], signature_request_info = signature_request_info.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageEvent]
  }
  
  @scala.inline
  def ErrorMessageEvent(description: String, event: error): MessageEvent = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageEvent]
  }
  
  @scala.inline
  def CanceledMessageEvent(event: signature_request_canceled): MessageEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageEvent]
  }
  
  @scala.inline
  def TemplateCreatedMessageEvent(event: template_created, template_id: String, template_info: Ccroles): MessageEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], template_id = template_id.asInstanceOf[js.Any], template_info = template_info.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageEvent]
  }
}
