package typingsSlinky.gapiClientGmail.gapi.client.gmail

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendAs extends js.Object {
  /**
    * A name that appears in the "From:" header for mail sent using this alias. For custom "from" addresses, when this is empty, Gmail will populate the
    * "From:" header with the name that is used for the primary address associated with the account.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * Whether this address is selected as the default "From:" address in situations such as composing a new message or sending a vacation auto-reply. Every
    * Gmail account has exactly one default send-as address, so the only legal value that clients may write to this field is true. Changing this from false
    * to true for an address will result in this field becoming false for the other previous default address.
    */
  var isDefault: js.UndefOr[Boolean] = js.native
  /**
    * Whether this address is the primary address used to login to the account. Every Gmail account has exactly one primary address, and it cannot be deleted
    * from the collection of send-as aliases. This field is read-only.
    */
  var isPrimary: js.UndefOr[Boolean] = js.native
  /**
    * An optional email address that is included in a "Reply-To:" header for mail sent using this alias. If this is empty, Gmail will not generate a
    * "Reply-To:" header.
    */
  var replyToAddress: js.UndefOr[String] = js.native
  /** The email address that appears in the "From:" header for mail sent using this alias. This is read-only for all operations except create. */
  var sendAsEmail: js.UndefOr[String] = js.native
  /** An optional HTML signature that is included in messages composed with this alias in the Gmail web UI. */
  var signature: js.UndefOr[String] = js.native
  /**
    * An optional SMTP service that will be used as an outbound relay for mail sent using this alias. If this is empty, outbound mail will be sent directly
    * from Gmail's servers to the destination SMTP service. This setting only applies to custom "from" aliases.
    */
  var smtpMsa: js.UndefOr[SmtpMsa] = js.native
  /** Whether Gmail should  treat this address as an alias for the user's primary email address. This setting only applies to custom "from" aliases. */
  var treatAsAlias: js.UndefOr[Boolean] = js.native
  /** Indicates whether this address has been verified for use as a send-as alias. Read-only. This setting only applies to custom "from" aliases. */
  var verificationStatus: js.UndefOr[String] = js.native
}

object SendAs {
  @scala.inline
  def apply(): SendAs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendAs]
  }
  @scala.inline
  implicit class SendAsOps[Self <: SendAs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withIsDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDefault")(js.undefined)
        ret
    }
    @scala.inline
    def withIsPrimary(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPrimary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsPrimary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPrimary")(js.undefined)
        ret
    }
    @scala.inline
    def withReplyToAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replyToAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplyToAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replyToAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withSendAsEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendAsEmail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSendAsEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendAsEmail")(js.undefined)
        ret
    }
    @scala.inline
    def withSignature(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignature: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signature")(js.undefined)
        ret
    }
    @scala.inline
    def withSmtpMsa(value: SmtpMsa): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smtpMsa")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmtpMsa: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smtpMsa")(js.undefined)
        ret
    }
    @scala.inline
    def withTreatAsAlias(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treatAsAlias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTreatAsAlias: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treatAsAlias")(js.undefined)
        ret
    }
    @scala.inline
    def withVerificationStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verificationStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerificationStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verificationStatus")(js.undefined)
        ret
    }
  }
  
}

