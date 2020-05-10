package typingsSlinky.awsSdk.sqsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteMessageBatchRequest extends js.Object {
  /**
    * A list of receipt handles for the messages to be deleted.
    */
  var Entries: DeleteMessageBatchRequestEntryList = js.native
  /**
    * The URL of the Amazon SQS queue from which messages are deleted. Queue URLs and names are case-sensitive.
    */
  var QueueUrl: String = js.native
}

object DeleteMessageBatchRequest {
  @scala.inline
  def apply(Entries: DeleteMessageBatchRequestEntryList, QueueUrl: String): DeleteMessageBatchRequest = {
    val __obj = js.Dynamic.literal(Entries = Entries.asInstanceOf[js.Any], QueueUrl = QueueUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMessageBatchRequest]
  }
  @scala.inline
  implicit class DeleteMessageBatchRequestOps[Self <: DeleteMessageBatchRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntries(value: DeleteMessageBatchRequestEntryList): Self = {
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

