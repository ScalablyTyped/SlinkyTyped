package typingsSlinky.nodePushnotifications.mod

import typingsSlinky.nodePushnotifications.anon.AccessToken
import typingsSlinky.nodePushnotifications.anon.Address
import typingsSlinky.nodePushnotifications.anon.Clientid
import typingsSlinky.nodePushnotifications.anon.Id
import typingsSlinky.nodePushnotifications.anon.Options
import typingsSlinky.webPush.mod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Settings extends js.Object {
  /** Amazon Device Messaging */
  var adm: js.UndefOr[Clientid] = js.native
  /** Apple Push Notifications */
  var apn: js.UndefOr[Address] = js.native
  /** Google Cloud Messaging  */
  var gcm: js.UndefOr[Id] = js.native
  /** Always use FCM? */
  var isAlwaysUseFCM: js.UndefOr[Boolean] = js.native
  /** Microsoft Push Notification Service */
  var mpns: js.UndefOr[Options] = js.native
  /** Web */
  var web: js.UndefOr[RequestOptions] = js.native
  /** Windows Push Notifications */
  var wns: js.UndefOr[AccessToken] = js.native
}

object Settings {
  @scala.inline
  def apply(): Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Settings]
  }
  @scala.inline
  implicit class SettingsOps[Self <: Settings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdm(value: Clientid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adm")(js.undefined)
        ret
    }
    @scala.inline
    def withApn(value: Address): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apn")(js.undefined)
        ret
    }
    @scala.inline
    def withGcm(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gcm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGcm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gcm")(js.undefined)
        ret
    }
    @scala.inline
    def withIsAlwaysUseFCM(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAlwaysUseFCM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsAlwaysUseFCM: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAlwaysUseFCM")(js.undefined)
        ret
    }
    @scala.inline
    def withMpns(value: Options): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mpns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMpns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mpns")(js.undefined)
        ret
    }
    @scala.inline
    def withWeb(value: RequestOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("web")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("web")(js.undefined)
        ret
    }
    @scala.inline
    def withWns(value: AccessToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wns")(js.undefined)
        ret
    }
  }
  
}

