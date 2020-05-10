package typingsSlinky.googleapis.pubsubV1beta2Mod.pubsubV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request for the Publish method.
  */
@js.native
trait SchemaPublishRequest extends js.Object {
  /**
    * The messages to publish.
    */
  var messages: js.UndefOr[js.Array[SchemaPubsubMessage]] = js.native
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
  }
  
}

