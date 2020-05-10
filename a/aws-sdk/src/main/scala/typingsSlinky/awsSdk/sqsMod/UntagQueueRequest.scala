package typingsSlinky.awsSdk.sqsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UntagQueueRequest extends js.Object {
  /**
    * The URL of the queue.
    */
  var QueueUrl: String = js.native
  /**
    * The list of tags to be removed from the specified queue.
    */
  var TagKeys: TagKeyList = js.native
}

object UntagQueueRequest {
  @scala.inline
  def apply(QueueUrl: String, TagKeys: TagKeyList): UntagQueueRequest = {
    val __obj = js.Dynamic.literal(QueueUrl = QueueUrl.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagQueueRequest]
  }
  @scala.inline
  implicit class UntagQueueRequestOps[Self <: UntagQueueRequest] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withTagKeys(value: TagKeyList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TagKeys")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

