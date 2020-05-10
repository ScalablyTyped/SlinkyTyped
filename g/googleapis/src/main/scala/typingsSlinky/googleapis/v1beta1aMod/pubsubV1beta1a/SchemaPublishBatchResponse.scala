package typingsSlinky.googleapis.v1beta1aMod.pubsubV1beta1a

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for the PublishBatch method.
  */
@js.native
trait SchemaPublishBatchResponse extends js.Object {
  /**
    * The server-assigned ID of each published message, in the same order as
    * the messages in the request. IDs are guaranteed to be unique within the
    * topic.
    */
  var messageIds: js.UndefOr[js.Array[String]] = js.native
}

object SchemaPublishBatchResponse {
  @scala.inline
  def apply(): SchemaPublishBatchResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPublishBatchResponse]
  }
  @scala.inline
  implicit class SchemaPublishBatchResponseOps[Self <: SchemaPublishBatchResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessageIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageIds")(js.undefined)
        ret
    }
  }
  
}

