package typingsSlinky.reactNativePermissions.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationSettings extends js.Object {
  var alert: js.UndefOr[Boolean] = js.native
  var badge: js.UndefOr[Boolean] = js.native
  var carPlay: js.UndefOr[Boolean] = js.native
  var criticalAlert: js.UndefOr[Boolean] = js.native
  var lockScreen: js.UndefOr[Boolean] = js.native
  var notificationCenter: js.UndefOr[Boolean] = js.native
  var sound: js.UndefOr[Boolean] = js.native
}

object NotificationSettings {
  @scala.inline
  def apply(): NotificationSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotificationSettings]
  }
  @scala.inline
  implicit class NotificationSettingsOps[Self <: NotificationSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlert(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alert")(js.undefined)
        ret
    }
    @scala.inline
    def withBadge(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBadge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badge")(js.undefined)
        ret
    }
    @scala.inline
    def withCarPlay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("carPlay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCarPlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("carPlay")(js.undefined)
        ret
    }
    @scala.inline
    def withCriticalAlert(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("criticalAlert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCriticalAlert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("criticalAlert")(js.undefined)
        ret
    }
    @scala.inline
    def withLockScreen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockScreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLockScreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockScreen")(js.undefined)
        ret
    }
    @scala.inline
    def withNotificationCenter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationCenter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotificationCenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationCenter")(js.undefined)
        ret
    }
    @scala.inline
    def withSound(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sound")(js.undefined)
        ret
    }
  }
  
}

