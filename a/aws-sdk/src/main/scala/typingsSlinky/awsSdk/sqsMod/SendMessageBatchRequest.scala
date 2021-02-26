package typingsSlinky.awsSdk.sqsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendMessageBatchRequest extends StObject {
  
  /**
    * A list of  SendMessageBatchRequestEntry  items.
    */
  var Entries: SendMessageBatchRequestEntryList = js.native
  
  /**
    * The URL of the Amazon SQS queue to which batched messages are sent. Queue URLs and names are case-sensitive.
    */
  var QueueUrl: String = js.native
}
object SendMessageBatchRequest {
  
  @scala.inline
  def apply(Entries: SendMessageBatchRequestEntryList, QueueUrl: String): SendMessageBatchRequest = {
    val __obj = js.Dynamic.literal(Entries = Entries.asInstanceOf[js.Any], QueueUrl = QueueUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendMessageBatchRequest]
  }
  
  @scala.inline
  implicit class SendMessageBatchRequestMutableBuilder[Self <: SendMessageBatchRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntries(value: SendMessageBatchRequestEntryList): Self = StObject.set(x, "Entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntriesVarargs(value: SendMessageBatchRequestEntry*): Self = StObject.set(x, "Entries", js.Array(value :_*))
    
    @scala.inline
    def setQueueUrl(value: String): Self = StObject.set(x, "QueueUrl", value.asInstanceOf[js.Any])
  }
}
