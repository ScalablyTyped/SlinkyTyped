package typingsSlinky.awsSdk.pinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainDeliverabilityCampaign extends js.Object {
  /**
    * The unique identifier for the campaign. Amazon Pinpoint automatically generates and assigns this identifier to a campaign. This value is not the same as the campaign identifier that Amazon Pinpoint assigns to campaigns that you create and manage by using the Amazon Pinpoint API or the Amazon Pinpoint console.
    */
  var CampaignId: js.UndefOr[typingsSlinky.awsSdk.pinpointemailMod.CampaignId] = js.native
  /**
    * The percentage of email messages that were deleted by recipients, without being opened first. Due to technical limitations, this value only includes recipients who opened the message by using an email client that supports images.
    */
  var DeleteRate: js.UndefOr[Percentage] = js.native
  /**
    * The major email providers who handled the email message.
    */
  var Esps: js.UndefOr[typingsSlinky.awsSdk.pinpointemailMod.Esps] = js.native
  /**
    * The first time, in Unix time format, when the email message was delivered to any recipient's inbox. This value can help you determine how long it took for a campaign to deliver an email message.
    */
  var FirstSeenDateTime: js.UndefOr[js.Date] = js.native
  /**
    * The verified email address that the email message was sent from.
    */
  var FromAddress: js.UndefOr[Identity] = js.native
  /**
    * The URL of an image that contains a snapshot of the email message that was sent.
    */
  var ImageUrl: js.UndefOr[typingsSlinky.awsSdk.pinpointemailMod.ImageUrl] = js.native
  /**
    * The number of email messages that were delivered to recipients’ inboxes.
    */
  var InboxCount: js.UndefOr[Volume] = js.native
  /**
    * The last time, in Unix time format, when the email message was delivered to any recipient's inbox. This value can help you determine how long it took for a campaign to deliver an email message.
    */
  var LastSeenDateTime: js.UndefOr[js.Date] = js.native
  /**
    * The projected number of recipients that the email message was sent to.
    */
  var ProjectedVolume: js.UndefOr[Volume] = js.native
  /**
    * The percentage of email messages that were opened and then deleted by recipients. Due to technical limitations, this value only includes recipients who opened the message by using an email client that supports images.
    */
  var ReadDeleteRate: js.UndefOr[Percentage] = js.native
  /**
    * The percentage of email messages that were opened by recipients. Due to technical limitations, this value only includes recipients who opened the message by using an email client that supports images.
    */
  var ReadRate: js.UndefOr[Percentage] = js.native
  /**
    * The IP addresses that were used to send the email message.
    */
  var SendingIps: js.UndefOr[IpList] = js.native
  /**
    * The number of email messages that were delivered to recipients' spam or junk mail folders.
    */
  var SpamCount: js.UndefOr[Volume] = js.native
  /**
    * The subject line, or title, of the email message.
    */
  var Subject: js.UndefOr[typingsSlinky.awsSdk.pinpointemailMod.Subject] = js.native
}

object DomainDeliverabilityCampaign {
  @scala.inline
  def apply(): DomainDeliverabilityCampaign = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainDeliverabilityCampaign]
  }
  @scala.inline
  implicit class DomainDeliverabilityCampaignOps[Self <: DomainDeliverabilityCampaign] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCampaignId(value: CampaignId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CampaignId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCampaignId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CampaignId")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleteRate(value: Percentage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeleteRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeleteRate")(js.undefined)
        ret
    }
    @scala.inline
    def withEsps(value: Esps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Esps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEsps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Esps")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstSeenDateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FirstSeenDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstSeenDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FirstSeenDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withFromAddress(value: Identity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FromAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFromAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FromAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withImageUrl(value: ImageUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImageUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withInboxCount(value: Volume): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InboxCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInboxCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InboxCount")(js.undefined)
        ret
    }
    @scala.inline
    def withLastSeenDateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastSeenDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastSeenDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastSeenDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withProjectedVolume(value: Volume): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProjectedVolume")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjectedVolume: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProjectedVolume")(js.undefined)
        ret
    }
    @scala.inline
    def withReadDeleteRate(value: Percentage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReadDeleteRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadDeleteRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReadDeleteRate")(js.undefined)
        ret
    }
    @scala.inline
    def withReadRate(value: Percentage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReadRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReadRate")(js.undefined)
        ret
    }
    @scala.inline
    def withSendingIps(value: IpList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SendingIps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSendingIps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SendingIps")(js.undefined)
        ret
    }
    @scala.inline
    def withSpamCount(value: Volume): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpamCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpamCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpamCount")(js.undefined)
        ret
    }
    @scala.inline
    def withSubject(value: Subject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Subject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Subject")(js.undefined)
        ret
    }
  }
  
}

