package typingsSlinky.googleapis.pubsubV1beta2Mod.pubsubV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for the `Pull` method.
  */
@js.native
trait SchemaPullResponse extends js.Object {
  /**
    * Received Pub/Sub messages. The Pub/Sub system will return zero messages
    * if there are no more available in the backlog. The Pub/Sub system may
    * return fewer than the `maxMessages` requested even if there are more
    * messages available in the backlog.
    */
  var receivedMessages: js.UndefOr[js.Array[SchemaReceivedMessage]] = js.native
}

object SchemaPullResponse {
  @scala.inline
  def apply(): SchemaPullResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPullResponse]
  }
  @scala.inline
  implicit class SchemaPullResponseOps[Self <: SchemaPullResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReceivedMessages(value: js.Array[SchemaReceivedMessage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receivedMessages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReceivedMessages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receivedMessages")(js.undefined)
        ret
    }
  }
  
}

