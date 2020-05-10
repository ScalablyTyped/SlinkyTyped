package typingsSlinky.awsSdk.sqsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteQueueRequest extends js.Object {
  /**
    * The URL of the Amazon SQS queue to delete. Queue URLs and names are case-sensitive.
    */
  var QueueUrl: String = js.native
}

object DeleteQueueRequest {
  @scala.inline
  def apply(QueueUrl: String): DeleteQueueRequest = {
    val __obj = js.Dynamic.literal(QueueUrl = QueueUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteQueueRequest]
  }
  @scala.inline
  implicit class DeleteQueueRequestOps[Self <: DeleteQueueRequest] (val x: Self) extends AnyVal {
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

