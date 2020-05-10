package typingsSlinky.nodemailer.smtpConnectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SentMessageInfo extends js.Object {
  /** an array of accepted recipient addresses. Normally this array should contain at least one address except when in LMTP mode. In this case the message itself might have succeeded but all recipients were rejected after sending the message. */
  var accepted: js.Array[String] = js.native
  /** how long was envelope prepared */
  var envelopeTime: Double = js.native
  /** how many bytes were streamed */
  var messageSize: Double = js.native
  /** how long was send stream prepared */
  var messageTime: Double = js.native
  /** an array of rejected recipient addresses. This array includes both the addresses that were rejected before sending the message and addresses rejected after sending it if using LMTP */
  var rejected: js.Array[String] = js.native
  /** if some recipients were rejected then this property holds an array of error objects for the rejected recipients */
  var rejectedErrors: js.UndefOr[js.Array[SMTPError]] = js.native
  /** the last response received from the server */
  var response: String = js.native
}

object SentMessageInfo {
  @scala.inline
  def apply(
    accepted: js.Array[String],
    envelopeTime: Double,
    messageSize: Double,
    messageTime: Double,
    rejected: js.Array[String],
    response: String
  ): SentMessageInfo = {
    val __obj = js.Dynamic.literal(accepted = accepted.asInstanceOf[js.Any], envelopeTime = envelopeTime.asInstanceOf[js.Any], messageSize = messageSize.asInstanceOf[js.Any], messageTime = messageTime.asInstanceOf[js.Any], rejected = rejected.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[SentMessageInfo]
  }
  @scala.inline
  implicit class SentMessageInfoOps[Self <: SentMessageInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccepted(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accepted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnvelopeTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("envelopeTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessageSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessageTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRejected(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResponse(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("response")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRejectedErrors(value: js.Array[SMTPError]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejectedErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRejectedErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejectedErrors")(js.undefined)
        ret
    }
  }
  
}

