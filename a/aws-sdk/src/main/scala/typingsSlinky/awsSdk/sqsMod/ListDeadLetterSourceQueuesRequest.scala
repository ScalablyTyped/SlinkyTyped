package typingsSlinky.awsSdk.sqsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDeadLetterSourceQueuesRequest extends js.Object {
  /**
    * The URL of a dead-letter queue. Queue URLs and names are case-sensitive.
    */
  var QueueUrl: String = js.native
}

object ListDeadLetterSourceQueuesRequest {
  @scala.inline
  def apply(QueueUrl: String): ListDeadLetterSourceQueuesRequest = {
    val __obj = js.Dynamic.literal(QueueUrl = QueueUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDeadLetterSourceQueuesRequest]
  }
  @scala.inline
  implicit class ListDeadLetterSourceQueuesRequestOps[Self <: ListDeadLetterSourceQueuesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQueueUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QueueUrl")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

