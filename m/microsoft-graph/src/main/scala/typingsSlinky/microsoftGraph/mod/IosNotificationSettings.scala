package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IosNotificationSettings extends js.Object {
  // Indicates the type of alert for notifications for this app. Possible values are: deviceDefault, banner, modal, none.
  var alertType: js.UndefOr[IosNotificationAlertType] = js.native
  // Application name to be associated with the bundleID.
  var appName: js.UndefOr[String] = js.native
  // Indicates whether badges are allowed for this app.
  var badgesEnabled: js.UndefOr[Boolean] = js.native
  // Bundle id of app to which to apply these notification settings.
  var bundleID: js.UndefOr[String] = js.native
  // Indicates whether notifications are allowed for this app.
  var enabled: js.UndefOr[Boolean] = js.native
  // Publisher to be associated with the bundleID.
  var publisher: js.UndefOr[String] = js.native
  // Indicates whether notifications can be shown in notification center.
  var showInNotificationCenter: js.UndefOr[Boolean] = js.native
  // Indicates whether notifications can be shown on the lock screen.
  var showOnLockScreen: js.UndefOr[Boolean] = js.native
  // Indicates whether sounds are allowed for this app.
  var soundsEnabled: js.UndefOr[Boolean] = js.native
}

object IosNotificationSettings {
  @scala.inline
  def apply(): IosNotificationSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosNotificationSettings]
  }
  @scala.inline
  implicit class IosNotificationSettingsOps[Self <: IosNotificationSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlertType(value: IosNotificationAlertType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alertType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlertType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alertType")(js.undefined)
        ret
    }
    @scala.inline
    def withAppName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appName")(js.undefined)
        ret
    }
    @scala.inline
    def withBadgesEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badgesEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBadgesEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badgesEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withBundleID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bundleID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBundleID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bundleID")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withPublisher(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publisher")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublisher: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publisher")(js.undefined)
        ret
    }
    @scala.inline
    def withShowInNotificationCenter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showInNotificationCenter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowInNotificationCenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showInNotificationCenter")(js.undefined)
        ret
    }
    @scala.inline
    def withShowOnLockScreen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showOnLockScreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowOnLockScreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showOnLockScreen")(js.undefined)
        ret
    }
    @scala.inline
    def withSoundsEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("soundsEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSoundsEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("soundsEnabled")(js.undefined)
        ret
    }
  }
  
}

