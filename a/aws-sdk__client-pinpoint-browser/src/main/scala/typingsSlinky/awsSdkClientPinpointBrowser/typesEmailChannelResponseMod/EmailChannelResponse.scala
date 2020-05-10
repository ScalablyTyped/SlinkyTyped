package typingsSlinky.awsSdkClientPinpointBrowser.typesEmailChannelResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmailChannelResponse extends js.Object {
  /**
    * The unique ID of the application to which the email channel belongs.
    */
  var ApplicationId: js.UndefOr[String] = js.native
  /**
    * The configuration set that you want to use when you send email using the Pinpoint Email API.
    */
  var ConfigurationSet: js.UndefOr[String] = js.native
  /**
    * The date that the settings were last updated in ISO 8601 format.
    */
  var CreationDate: js.UndefOr[String] = js.native
  /**
    * If the channel is enabled for sending messages.
    */
  var Enabled: js.UndefOr[Boolean] = js.native
  /**
    * The email address used to send emails from.
    */
  var FromAddress: js.UndefOr[String] = js.native
  /**
    * Not used. Retained for backwards compatibility.
    */
  var HasCredential: js.UndefOr[Boolean] = js.native
  /**
    * Channel ID. Not used, only for backwards compatibility.
    */
  var Id: js.UndefOr[String] = js.native
  /**
    * The ARN of an identity verified with SES.
    */
  var Identity: js.UndefOr[String] = js.native
  /**
    * Is this channel archived
    */
  var IsArchived: js.UndefOr[Boolean] = js.native
  /**
    * Who last updated this entry
    */
  var LastModifiedBy: js.UndefOr[String] = js.native
  /**
    * Last date this was updated
    */
  var LastModifiedDate: js.UndefOr[String] = js.native
  /**
    * Messages per second that can be sent
    */
  var MessagesPerSecond: js.UndefOr[Double] = js.native
  /**
    * Platform type. Will be "EMAIL"
    */
  var Platform: js.UndefOr[String] = js.native
  /**
    * The ARN of an IAM Role used to submit events to Mobile Analytics' event ingestion service
    */
  var RoleArn: js.UndefOr[String] = js.native
  /**
    * Version of channel
    */
  var Version: js.UndefOr[Double] = js.native
}

object EmailChannelResponse {
  @scala.inline
  def apply(): EmailChannelResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmailChannelResponse]
  }
  @scala.inline
  implicit class EmailChannelResponseOps[Self <: EmailChannelResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationId")(js.undefined)
        ret
    }
    @scala.inline
    def withConfigurationSet(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigurationSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigurationSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigurationSet")(js.undefined)
        ret
    }
    @scala.inline
    def withCreationDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationDate")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withFromAddress(value: String): Self = {
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
    def withHasCredential(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HasCredential")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasCredential: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HasCredential")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(js.undefined)
        ret
    }
    @scala.inline
    def withIdentity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Identity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdentity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Identity")(js.undefined)
        ret
    }
    @scala.inline
    def withIsArchived(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsArchived")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsArchived: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsArchived")(js.undefined)
        ret
    }
    @scala.inline
    def withLastModifiedBy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModifiedBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedBy")(js.undefined)
        ret
    }
    @scala.inline
    def withLastModifiedDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModifiedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedDate")(js.undefined)
        ret
    }
    @scala.inline
    def withMessagesPerSecond(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MessagesPerSecond")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessagesPerSecond: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MessagesPerSecond")(js.undefined)
        ret
    }
    @scala.inline
    def withPlatform(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Platform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Platform")(js.undefined)
        ret
    }
    @scala.inline
    def withRoleArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleArn")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Version")(js.undefined)
        ret
    }
  }
  
}

