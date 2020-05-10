package typingsSlinky.googleapis.v1beta1aMod.pubsubV1beta1a

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request for the Acknowledge method.
  */
@js.native
trait SchemaAcknowledgeRequest extends js.Object {
  /**
    * The acknowledgment ID for the message being acknowledged. This was
    * returned by the Pub/Sub system in the Pull response.
    */
  var ackId: js.UndefOr[js.Array[String]] = js.native
  /**
    * The subscription whose message is being acknowledged.
    */
  var subscription: js.UndefOr[String] = js.native
}

object SchemaAcknowledgeRequest {
  @scala.inline
  def apply(): SchemaAcknowledgeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAcknowledgeRequest]
  }
  @scala.inline
  implicit class SchemaAcknowledgeRequestOps[Self <: SchemaAcknowledgeRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAckId(value: js.Array[String]): Self = {
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
    def withSubscription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubscription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscription")(js.undefined)
        ret
    }
  }
  
}

