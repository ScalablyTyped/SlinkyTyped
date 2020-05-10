package typingsSlinky.googleapis.v1beta1aMod.pubsubV1beta1a

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request for the PublishBatch method.
  */
@js.native
trait SchemaPublishBatchRequest extends js.Object {
  /**
    * The messages to publish.
    */
  var messages: js.UndefOr[js.Array[SchemaPubsubMessage]] = js.native
  /**
    * The messages in the request will be published on this topic.
    */
  var topic: js.UndefOr[String] = js.native
}

object SchemaPublishBatchRequest {
  @scala.inline
  def apply(): SchemaPublishBatchRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPublishBatchRequest]
  }
  @scala.inline
  implicit class SchemaPublishBatchRequestOps[Self <: SchemaPublishBatchRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessages(value: js.Array[SchemaPubsubMessage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messages")(js.undefined)
        ret
    }
    @scala.inline
    def withTopic(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topic")(js.undefined)
        ret
    }
  }
  
}

