package typingsSlinky.imgurRestApi.ImgurRestApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Message extends StObject {
  
  var account_id: Double = js.native
  
  var body: String = js.native
  
  var conversation_id: Double = js.native
  
  var datetime: Double = js.native
  
  var from: String = js.native
  
  var id: Double = js.native
  
  var sender_id: Double = js.native
}
object Message {
  
  @scala.inline
  def apply(
    account_id: Double,
    body: String,
    conversation_id: Double,
    datetime: Double,
    from: String,
    id: Double,
    sender_id: Double
  ): Message = {
    val __obj = js.Dynamic.literal(account_id = account_id.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], conversation_id = conversation_id.asInstanceOf[js.Any], datetime = datetime.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], sender_id = sender_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
  
  @scala.inline
  implicit class MessageMutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccount_id(value: Double): Self = StObject.set(x, "account_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConversation_id(value: Double): Self = StObject.set(x, "conversation_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatetime(value: Double): Self = StObject.set(x, "datetime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSender_id(value: Double): Self = StObject.set(x, "sender_id", value.asInstanceOf[js.Any])
  }
}
