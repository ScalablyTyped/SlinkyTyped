package typingsSlinky.gapiClientDfareporting

import typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting.Recipient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEmailOwner extends js.Object {
  /** Whether the report should be emailed to the report owner. */
  var emailOwner: js.UndefOr[Boolean] = js.native
  /** The type of delivery for the owner to receive, if enabled. */
  var emailOwnerDeliveryType: js.UndefOr[String] = js.native
  /** The message to be sent with each email. */
  var message: js.UndefOr[String] = js.native
  /** The list of recipients to which to email the report. */
  var recipients: js.UndefOr[js.Array[Recipient]] = js.native
}

object AnonEmailOwner {
  @scala.inline
  def apply(): AnonEmailOwner = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonEmailOwner]
  }
  @scala.inline
  implicit class AnonEmailOwnerOps[Self <: AnonEmailOwner] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmailOwner(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailOwner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmailOwner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailOwner")(js.undefined)
        ret
    }
    @scala.inline
    def withEmailOwnerDeliveryType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailOwnerDeliveryType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmailOwnerDeliveryType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailOwnerDeliveryType")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
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
    def withRecipients(value: js.Array[Recipient]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipients")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecipients: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipients")(js.undefined)
        ret
    }
  }
  
}

