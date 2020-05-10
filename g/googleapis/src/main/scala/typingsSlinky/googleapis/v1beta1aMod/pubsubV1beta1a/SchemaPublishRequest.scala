package typingsSlinky.googleapis.v1beta1aMod.pubsubV1beta1a

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request for the Publish method.
  */
@js.native
trait SchemaPublishRequest extends js.Object {
  /**
    * The message to publish.
    */
  var message: js.UndefOr[SchemaPubsubMessage] = js.native
  /**
    * The message in the request will be published on this topic.
    */
  var topic: js.UndefOr[String] = js.native
}

object SchemaPublishRequest {
  @scala.inline
  def apply(): SchemaPublishRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPublishRequest]
  }
  @scala.inline
  implicit class SchemaPublishRequestOps[Self <: SchemaPublishRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessage(value: SchemaPubsubMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
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

