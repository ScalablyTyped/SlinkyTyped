package typingsSlinky.azureSb.mod.Azure.ServiceBus

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.azureSb.anon.Body
import typingsSlinky.azureSb.anon.PushChannel
import typingsSlinky.azureSb.azureSbStrings.adm
import typingsSlinky.azureSb.azureSbStrings.apns
import typingsSlinky.azureSb.azureSbStrings.gcm
import typingsSlinky.azureSb.azureSbStrings.mpns
import typingsSlinky.azureSb.azureSbStrings.wns
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationHubInstallation extends js.Object {
  val expirationTime: js.UndefOr[String] = js.native
  val expiredPushChannel: js.UndefOr[String] = js.native
  var installationId: String = js.native
  val lastActiveOn: js.UndefOr[String] = js.native
  val lastUpdate: js.UndefOr[String] = js.native
  var platform: apns | wns | mpns | adm | gcm = js.native
  var pushChannel: String = js.native
  var secondaryTile: js.UndefOr[StringDictionary[PushChannel]] = js.native
  var tags: js.UndefOr[js.Array[String]] = js.native
  var templates: js.UndefOr[StringDictionary[Body]] = js.native
}

object NotificationHubInstallation {
  @scala.inline
  def apply(installationId: String, platform: apns | wns | mpns | adm | gcm, pushChannel: String): NotificationHubInstallation = {
    val __obj = js.Dynamic.literal(installationId = installationId.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], pushChannel = pushChannel.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationHubInstallation]
  }
  @scala.inline
  implicit class NotificationHubInstallationOps[Self <: NotificationHubInstallation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstallationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlatform(value: apns | wns | mpns | adm | gcm): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPushChannel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pushChannel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpirationTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expirationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpirationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expirationTime")(js.undefined)
        ret
    }
    @scala.inline
    def withExpiredPushChannel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiredPushChannel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpiredPushChannel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiredPushChannel")(js.undefined)
        ret
    }
    @scala.inline
    def withLastActiveOn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastActiveOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastActiveOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastActiveOn")(js.undefined)
        ret
    }
    @scala.inline
    def withLastUpdate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withSecondaryTile(value: StringDictionary[PushChannel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondaryTile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecondaryTile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondaryTile")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplates(value: StringDictionary[Body]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templates")(js.undefined)
        ret
    }
  }
  
}

