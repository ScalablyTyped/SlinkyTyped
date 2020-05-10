package typingsSlinky.onesignalCordovaPlugin.OneSignalCordovaPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OSNotificationPayload extends js.Object {
  var actionButtons: js.Array[OSActionButton] = js.native
  var additionalData: js.UndefOr[js.Any] = js.native
  var backgroundImageLayout: js.UndefOr[OSBackgroundImageLayout] = js.native
  var bigPicture: js.UndefOr[String] = js.native
  var body: String = js.native
  var fromProjectNumber: js.UndefOr[String] = js.native
  var groupKey: js.UndefOr[String] = js.native
  var groupMessage: js.UndefOr[String] = js.native
  var largeIcon: js.UndefOr[String] = js.native
  var launchURL: js.UndefOr[String] = js.native
  var ledColor: js.UndefOr[String] = js.native
  var lockScreenVisibility: js.UndefOr[OSLockScreenVisibility] = js.native
  var notificationID: String = js.native
  var priority: js.UndefOr[Double] = js.native
  var rawPayload: String = js.native
  var smallIcon: js.UndefOr[String] = js.native
  var smallIconAccentColor: js.UndefOr[String] = js.native
  var sound: String = js.native
  var title: String = js.native
}

object OSNotificationPayload {
  @scala.inline
  def apply(
    actionButtons: js.Array[OSActionButton],
    body: String,
    notificationID: String,
    rawPayload: String,
    sound: String,
    title: String
  ): OSNotificationPayload = {
    val __obj = js.Dynamic.literal(actionButtons = actionButtons.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], notificationID = notificationID.asInstanceOf[js.Any], rawPayload = rawPayload.asInstanceOf[js.Any], sound = sound.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[OSNotificationPayload]
  }
  @scala.inline
  implicit class OSNotificationPayloadOps[Self <: OSNotificationPayload] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionButtons(value: js.Array[OSActionButton]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionButtons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBody(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotificationID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRawPayload(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawPayload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSound(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdditionalData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalData")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundImageLayout(value: OSBackgroundImageLayout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundImageLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundImageLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundImageLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withBigPicture(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bigPicture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBigPicture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bigPicture")(js.undefined)
        ret
    }
    @scala.inline
    def withFromProjectNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromProjectNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFromProjectNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromProjectNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupKey")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withLargeIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("largeIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLargeIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("largeIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withLaunchURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launchURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLaunchURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launchURL")(js.undefined)
        ret
    }
    @scala.inline
    def withLedColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ledColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLedColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ledColor")(js.undefined)
        ret
    }
    @scala.inline
    def withLockScreenVisibility(value: OSLockScreenVisibility): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockScreenVisibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLockScreenVisibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockScreenVisibility")(js.undefined)
        ret
    }
    @scala.inline
    def withPriority(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPriority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(js.undefined)
        ret
    }
    @scala.inline
    def withSmallIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smallIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmallIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smallIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withSmallIconAccentColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smallIconAccentColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmallIconAccentColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smallIconAccentColor")(js.undefined)
        ret
    }
  }
  
}

