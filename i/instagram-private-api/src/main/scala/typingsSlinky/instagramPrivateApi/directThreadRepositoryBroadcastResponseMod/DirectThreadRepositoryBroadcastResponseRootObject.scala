package typingsSlinky.instagramPrivateApi.directThreadRepositoryBroadcastResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectThreadRepositoryBroadcastResponseRootObject extends js.Object {
  var action: String = js.native
  var message_metadata: js.Array[DirectThreadRepositoryBroadcastResponseMessageMetadata] = js.native
  var payload: DirectThreadRepositoryBroadcastResponsePayload = js.native
  var status: String = js.native
  var status_code: String = js.native
}

object DirectThreadRepositoryBroadcastResponseRootObject {
  @scala.inline
  def apply(
    action: String,
    message_metadata: js.Array[DirectThreadRepositoryBroadcastResponseMessageMetadata],
    payload: DirectThreadRepositoryBroadcastResponsePayload,
    status: String,
    status_code: String
  ): DirectThreadRepositoryBroadcastResponseRootObject = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], message_metadata = message_metadata.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], status_code = status_code.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectThreadRepositoryBroadcastResponseRootObject]
  }
  @scala.inline
  implicit class DirectThreadRepositoryBroadcastResponseRootObjectOps[Self <: DirectThreadRepositoryBroadcastResponseRootObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage_metadata(value: js.Array[DirectThreadRepositoryBroadcastResponseMessageMetadata]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message_metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPayload(value: DirectThreadRepositoryBroadcastResponsePayload): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus_code(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status_code")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

