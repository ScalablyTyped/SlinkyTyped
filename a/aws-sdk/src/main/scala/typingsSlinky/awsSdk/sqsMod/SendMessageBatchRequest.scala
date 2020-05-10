package typingsSlinky.awsSdk.sqsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendMessageBatchRequest extends js.Object {
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
  implicit class SendMessageBatchRequestOps[Self <: SendMessageBatchRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntries(value: SendMessageBatchRequestEntryList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Entries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueueUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QueueUrl")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

