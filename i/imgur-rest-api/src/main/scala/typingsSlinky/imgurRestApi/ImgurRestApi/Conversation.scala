package typingsSlinky.imgurRestApi.ImgurRestApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Conversation extends StObject {
  
  var datetime: Double = js.native
  
  var done: js.UndefOr[Boolean] = js.native
  
  var id: Double = js.native
  
  var last_message_preview: String = js.native
  
  var message_count: Double = js.native
  
  var messages: js.UndefOr[js.Array[Message]] = js.native
  
  var page: js.UndefOr[Double] = js.native
  
  var with_account: String = js.native
  
  var with_account_id: Double = js.native
}
object Conversation {
  
  @scala.inline
  def apply(
    datetime: Double,
    id: Double,
    last_message_preview: String,
    message_count: Double,
    with_account: String,
    with_account_id: Double
  ): Conversation = {
    val __obj = js.Dynamic.literal(datetime = datetime.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], last_message_preview = last_message_preview.asInstanceOf[js.Any], message_count = message_count.asInstanceOf[js.Any], with_account = with_account.asInstanceOf[js.Any], with_account_id = with_account_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Conversation]
  }
  
  @scala.inline
  implicit class ConversationMutableBuilder[Self <: Conversation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatetime(value: Double): Self = StObject.set(x, "datetime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDone(value: Boolean): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast_message_preview(value: String): Self = StObject.set(x, "last_message_preview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage_count(value: Double): Self = StObject.set(x, "message_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessages(value: js.Array[Message]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    @scala.inline
    def setMessagesVarargs(value: Message*): Self = StObject.set(x, "messages", js.Array(value :_*))
    
    @scala.inline
    def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    @scala.inline
    def setWith_account(value: String): Self = StObject.set(x, "with_account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWith_account_id(value: Double): Self = StObject.set(x, "with_account_id", value.asInstanceOf[js.Any])
  }
}
