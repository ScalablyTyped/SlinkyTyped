package typingsSlinky.maximMazurokGapiClientGmail.gapi.client.gmail

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait History extends StObject {
  
  /** The mailbox sequence ID. */
  var id: js.UndefOr[String] = js.native
  
  /** Labels added to messages in this history record. */
  var labelsAdded: js.UndefOr[js.Array[HistoryLabelAdded]] = js.native
  
  /** Labels removed from messages in this history record. */
  var labelsRemoved: js.UndefOr[js.Array[HistoryLabelRemoved]] = js.native
  
  /**
    * List of messages changed in this history record. The fields for specific change types, such as `messagesAdded` may duplicate messages in this field. We recommend using the specific
    * change-type fields instead of this.
    */
  var messages: js.UndefOr[js.Array[Message]] = js.native
  
  /** Messages added to the mailbox in this history record. */
  var messagesAdded: js.UndefOr[js.Array[HistoryMessageAdded]] = js.native
  
  /** Messages deleted (not Trashed) from the mailbox in this history record. */
  var messagesDeleted: js.UndefOr[js.Array[HistoryMessageDeleted]] = js.native
}
object History {
  
  @scala.inline
  def apply(): History = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[History]
  }
  
  @scala.inline
  implicit class HistoryMutableBuilder[Self <: History] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setLabelsAdded(value: js.Array[HistoryLabelAdded]): Self = StObject.set(x, "labelsAdded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsAddedUndefined: Self = StObject.set(x, "labelsAdded", js.undefined)
    
    @scala.inline
    def setLabelsAddedVarargs(value: HistoryLabelAdded*): Self = StObject.set(x, "labelsAdded", js.Array(value :_*))
    
    @scala.inline
    def setLabelsRemoved(value: js.Array[HistoryLabelRemoved]): Self = StObject.set(x, "labelsRemoved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsRemovedUndefined: Self = StObject.set(x, "labelsRemoved", js.undefined)
    
    @scala.inline
    def setLabelsRemovedVarargs(value: HistoryLabelRemoved*): Self = StObject.set(x, "labelsRemoved", js.Array(value :_*))
    
    @scala.inline
    def setMessages(value: js.Array[Message]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesAdded(value: js.Array[HistoryMessageAdded]): Self = StObject.set(x, "messagesAdded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesAddedUndefined: Self = StObject.set(x, "messagesAdded", js.undefined)
    
    @scala.inline
    def setMessagesAddedVarargs(value: HistoryMessageAdded*): Self = StObject.set(x, "messagesAdded", js.Array(value :_*))
    
    @scala.inline
    def setMessagesDeleted(value: js.Array[HistoryMessageDeleted]): Self = StObject.set(x, "messagesDeleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesDeletedUndefined: Self = StObject.set(x, "messagesDeleted", js.undefined)
    
    @scala.inline
    def setMessagesDeletedVarargs(value: HistoryMessageDeleted*): Self = StObject.set(x, "messagesDeleted", js.Array(value :_*))
    
    @scala.inline
    def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    @scala.inline
    def setMessagesVarargs(value: Message*): Self = StObject.set(x, "messages", js.Array(value :_*))
  }
}
