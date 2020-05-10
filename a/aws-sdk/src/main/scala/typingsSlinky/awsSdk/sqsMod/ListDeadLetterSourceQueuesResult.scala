package typingsSlinky.awsSdk.sqsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDeadLetterSourceQueuesResult extends js.Object {
  /**
    * A list of source queue URLs that have the RedrivePolicy queue attribute configured with a dead-letter queue.
    */
  var queueUrls: QueueUrlList = js.native
}

object ListDeadLetterSourceQueuesResult {
  @scala.inline
  def apply(queueUrls: QueueUrlList): ListDeadLetterSourceQueuesResult = {
    val __obj = js.Dynamic.literal(queueUrls = queueUrls.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDeadLetterSourceQueuesResult]
  }
  @scala.inline
  implicit class ListDeadLetterSourceQueuesResultOps[Self <: ListDeadLetterSourceQueuesResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQueueUrls(value: QueueUrlList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queueUrls")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

