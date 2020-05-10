package typingsSlinky.googleapis.v1beta1aMod.pubsubV1beta1a

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request for the ModifyAckDeadline method.
  */
@js.native
trait SchemaModifyAckDeadlineRequest extends js.Object {
  /**
    * The new ack deadline with respect to the time this request was sent to
    * the Pub/Sub system. Must be &gt;= 0. For example, if the value is 10, the
    * new ack deadline will expire 10 seconds after the ModifyAckDeadline call
    * was made. Specifying zero may immediately make the message available for
    * another pull request.
    */
  var ackDeadlineSeconds: js.UndefOr[Double] = js.native
  /**
    * The acknowledgment ID. Either this or ack_ids must be populated, not
    * both.
    */
  var ackId: js.UndefOr[String] = js.native
  /**
    * List of acknowledgment IDs. Either this field or ack_id should be
    * populated, not both.
    */
  var ackIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Next Index: 5 The name of the subscription from which messages are being
    * pulled.
    */
  var subscription: js.UndefOr[String] = js.native
}

object SchemaModifyAckDeadlineRequest {
  @scala.inline
  def apply(): SchemaModifyAckDeadlineRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaModifyAckDeadlineRequest]
  }
  @scala.inline
  implicit class SchemaModifyAckDeadlineRequestOps[Self <: SchemaModifyAckDeadlineRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAckDeadlineSeconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ackDeadlineSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAckDeadlineSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ackDeadlineSeconds")(js.undefined)
        ret
    }
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
    def withAckIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ackIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAckIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ackIds")(js.undefined)
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

