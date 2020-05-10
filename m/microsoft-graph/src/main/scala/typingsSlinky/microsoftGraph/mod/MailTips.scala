package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MailTips extends js.Object {
  // Mail tips for automatic reply if it has been set up by the recipient.
  var automaticReplies: js.UndefOr[AutomaticRepliesMailTips] = js.native
  // A custom mail tip that can be set on the recipient's mailbox.
  var customMailTip: js.UndefOr[String] = js.native
  /**
    * Whether the recipient's mailbox is restricted, for example, accepting messages from only a predefined list of senders,
    * rejecting messages from a predefined list of senders, or accepting messages from only authenticated senders.
    */
  var deliveryRestricted: js.UndefOr[Boolean] = js.native
  // The email address of the recipient to get mailtips for.
  var emailAddress: js.UndefOr[EmailAddress] = js.native
  // Errors that occur during the getMailTips action.
  var error: js.UndefOr[MailTipsError] = js.native
  // The number of external members if the recipient is a distribution list.
  var externalMemberCount: js.UndefOr[Double] = js.native
  /**
    * Whether sending messages to the recipient requires approval. For example, if the recipient is a large distribution list
    * and a moderator has been set up to approve messages sent to that distribution list, or if sending messages to a
    * recipient requires approval of the recipient's manager.
    */
  var isModerated: js.UndefOr[Boolean] = js.native
  // The mailbox full status of the recipient.
  var mailboxFull: js.UndefOr[Boolean] = js.native
  // The maximum message size that has been configured for the recipient's organization or mailbox.
  var maxMessageSize: js.UndefOr[Double] = js.native
  /**
    * The scope of the recipient. Possible values are: none, internal, external, externalPartner, externalNonParther. For
    * example, an administrator can set another organization to be its 'partner'. The scope is useful if an administrator
    * wants certain mailtips to be accessible to certain scopes. It's also useful to senders to inform them that their
    * message may leave the organization, helping them make the correct decisions about wording, tone and content.
    */
  var recipientScope: js.UndefOr[RecipientScopeType] = js.native
  // Recipients suggested based on previous contexts where they appear in the same message.
  var recipientSuggestions: js.UndefOr[js.Array[Recipient]] = js.native
  // The number of members if the recipient is a distribution list.
  var totalMemberCount: js.UndefOr[Double] = js.native
}

object MailTips {
  @scala.inline
  def apply(): MailTips = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MailTips]
  }
  @scala.inline
  implicit class MailTipsOps[Self <: MailTips] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutomaticReplies(value: AutomaticRepliesMailTips): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automaticReplies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutomaticReplies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automaticReplies")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomMailTip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customMailTip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomMailTip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customMailTip")(js.undefined)
        ret
    }
    @scala.inline
    def withDeliveryRestricted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deliveryRestricted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeliveryRestricted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deliveryRestricted")(js.undefined)
        ret
    }
    @scala.inline
    def withEmailAddress(value: EmailAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmailAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withError(value: MailTipsError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withExternalMemberCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalMemberCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternalMemberCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalMemberCount")(js.undefined)
        ret
    }
    @scala.inline
    def withIsModerated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isModerated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsModerated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isModerated")(js.undefined)
        ret
    }
    @scala.inline
    def withMailboxFull(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mailboxFull")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMailboxFull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mailboxFull")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxMessageSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxMessageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxMessageSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxMessageSize")(js.undefined)
        ret
    }
    @scala.inline
    def withRecipientScope(value: RecipientScopeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipientScope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecipientScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipientScope")(js.undefined)
        ret
    }
    @scala.inline
    def withRecipientSuggestions(value: js.Array[Recipient]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipientSuggestions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecipientSuggestions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipientSuggestions")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalMemberCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalMemberCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalMemberCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalMemberCount")(js.undefined)
        ret
    }
  }
  
}

