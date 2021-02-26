package typingsSlinky.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplyListener extends StObject {
  
  def callback(msg: Message): Unit = js.native
  
  var chatId: Double | String = js.native
  
  var id: Double = js.native
  
  var messageId: Double | String = js.native
}
object ReplyListener {
  
  @scala.inline
  def apply(callback: Message => Unit, chatId: Double | String, id: Double, messageId: Double | String): ReplyListener = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), chatId = chatId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], messageId = messageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplyListener]
  }
  
  @scala.inline
  implicit class ReplyListenerMutableBuilder[Self <: ReplyListener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallback(value: Message => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChatId(value: Double | String): Self = StObject.set(x, "chatId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageId(value: Double | String): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
  }
}
