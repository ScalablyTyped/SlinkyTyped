package typingsSlinky.awsSdk.sqsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangeMessageVisibilityBatchRequest extends js.Object {
  /**
    * A list of receipt handles of the messages for which the visibility timeout must be changed.
    */
  var Entries: ChangeMessageVisibilityBatchRequestEntryList = js.native
  /**
    * The URL of the Amazon SQS queue whose messages' visibility is changed. Queue URLs and names are case-sensitive.
    */
  var QueueUrl: String = js.native
}

object ChangeMessageVisibilityBatchRequest {
  @scala.inline
  def apply(Entries: ChangeMessageVisibilityBatchRequestEntryList, QueueUrl: String): ChangeMessageVisibilityBatchRequest = {
    val __obj = js.Dynamic.literal(Entries = Entries.asInstanceOf[js.Any], QueueUrl = QueueUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeMessageVisibilityBatchRequest]
  }
  @scala.inline
  implicit class ChangeMessageVisibilityBatchRequestOps[Self <: ChangeMessageVisibilityBatchRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntries(value: ChangeMessageVisibilityBatchRequestEntryList): Self = {
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

