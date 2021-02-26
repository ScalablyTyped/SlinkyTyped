package typingsSlinky.inboxsdk.mod.Conversations

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConversationsInstance extends StObject {
  
  def registerFileAttachmentCardViewHandler(handler: js.Function1[/* attachmentCardView */ AttachmentCardView, Unit]): js.Function0[Unit] = js.native
  
  def registerMessageViewHandler(handler: js.Function1[/* messageView */ MessageView, Unit]): js.Function0[Unit] = js.native
  
  def registerMessageViewHandlerAll(handler: js.Function1[/* messageView */ MessageView, Unit]): js.Function0[Unit] = js.native
  
  def registerThreadViewHandler(handler: js.Function1[/* threadView */ ThreadView, Unit]): js.Function0[Unit] = js.native
}
object ConversationsInstance {
  
  @scala.inline
  def apply(
    registerFileAttachmentCardViewHandler: js.Function1[/* attachmentCardView */ AttachmentCardView, Unit] => js.Function0[Unit],
    registerMessageViewHandler: js.Function1[/* messageView */ MessageView, Unit] => js.Function0[Unit],
    registerMessageViewHandlerAll: js.Function1[/* messageView */ MessageView, Unit] => js.Function0[Unit],
    registerThreadViewHandler: js.Function1[/* threadView */ ThreadView, Unit] => js.Function0[Unit]
  ): ConversationsInstance = {
    val __obj = js.Dynamic.literal(registerFileAttachmentCardViewHandler = js.Any.fromFunction1(registerFileAttachmentCardViewHandler), registerMessageViewHandler = js.Any.fromFunction1(registerMessageViewHandler), registerMessageViewHandlerAll = js.Any.fromFunction1(registerMessageViewHandlerAll), registerThreadViewHandler = js.Any.fromFunction1(registerThreadViewHandler))
    __obj.asInstanceOf[ConversationsInstance]
  }
  
  @scala.inline
  implicit class ConversationsInstanceMutableBuilder[Self <: ConversationsInstance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRegisterFileAttachmentCardViewHandler(value: js.Function1[/* attachmentCardView */ AttachmentCardView, Unit] => js.Function0[Unit]): Self = StObject.set(x, "registerFileAttachmentCardViewHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRegisterMessageViewHandler(value: js.Function1[/* messageView */ MessageView, Unit] => js.Function0[Unit]): Self = StObject.set(x, "registerMessageViewHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRegisterMessageViewHandlerAll(value: js.Function1[/* messageView */ MessageView, Unit] => js.Function0[Unit]): Self = StObject.set(x, "registerMessageViewHandlerAll", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRegisterThreadViewHandler(value: js.Function1[/* threadView */ ThreadView, Unit] => js.Function0[Unit]): Self = StObject.set(x, "registerThreadViewHandler", js.Any.fromFunction1(value))
  }
}
