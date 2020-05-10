package typingsSlinky.googleapis.pubsubV1beta2Mod.pubsubV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A message and its corresponding acknowledgment ID.
  */
@js.native
trait SchemaReceivedMessage extends js.Object {
  /**
    * This ID can be used to acknowledge the received message.
    */
  var ackId: js.UndefOr[String] = js.native
  /**
    * The message.
    */
  var message: js.UndefOr[SchemaPubsubMessage] = js.native
}

object SchemaReceivedMessage {
  @scala.inline
  def apply(): SchemaReceivedMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReceivedMessage]
  }
  @scala.inline
  implicit class SchemaReceivedMessageOps[Self <: SchemaReceivedMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAckId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ackId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAckId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ackId")(js.undefined)
        ret
    }
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
  }
  
}

