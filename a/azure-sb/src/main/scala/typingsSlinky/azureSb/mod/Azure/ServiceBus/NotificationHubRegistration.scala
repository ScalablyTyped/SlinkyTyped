package typingsSlinky.azureSb.mod.Azure.ServiceBus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationHubRegistration extends js.Object {
  var BodyTemplate: js.UndefOr[js.Any] = js.native
  var ChannelUri: js.UndefOr[String] = js.native
  var DeviceToken: js.UndefOr[String] = js.native
  var Expiry: js.UndefOr[js.Date] = js.native
  var MpnsHeaders: js.UndefOr[js.Any] = js.native
  var RegistrationId: String = js.native
  var Tags: js.UndefOr[String] = js.native
  var WnsHeaders: js.UndefOr[js.Any] = js.native
  var gcmRegistrationId: js.UndefOr[String] = js.native
}

object NotificationHubRegistration {
  @scala.inline
  def apply(RegistrationId: String): NotificationHubRegistration = {
    val __obj = js.Dynamic.literal(RegistrationId = RegistrationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationHubRegistration]
  }
  @scala.inline
  implicit class NotificationHubRegistrationOps[Self <: NotificationHubRegistration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRegistrationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegistrationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBodyTemplate(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BodyTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBodyTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BodyTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withChannelUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChannelUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannelUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChannelUri")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceToken")(js.undefined)
        ret
    }
    @scala.inline
    def withExpiry(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Expiry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpiry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Expiry")(js.undefined)
        ret
    }
    @scala.inline
    def withMpnsHeaders(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MpnsHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMpnsHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MpnsHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
    @scala.inline
    def withWnsHeaders(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WnsHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWnsHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WnsHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withGcmRegistrationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gcmRegistrationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGcmRegistrationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gcmRegistrationId")(js.undefined)
        ret
    }
  }
  
}

