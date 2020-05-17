package typingsSlinky.firebaseAdmin.admin.messaging

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.firebaseAdmin.anon.Action
import typingsSlinky.firebaseAdmin.firebaseAdminStrings.auto
import typingsSlinky.firebaseAdmin.firebaseAdminStrings.ltr
import typingsSlinky.firebaseAdmin.firebaseAdminStrings.rtl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the WebPush-specific notification options that can be included in
  * {@link admin.messaging.WebpushConfig}. This supports most of the standard
  * options as defined in the Web Notification
  * [specification](https://developer.mozilla.org/en-US/docs/Web/API/notification/Notification).
  */
@js.native
trait WebpushNotification
  extends /* customData */ StringDictionary[js.Any] {
  /**
    * An array of notification actions representing the actions
    * available to the user when the notification is presented.
    */
  var actions: js.UndefOr[js.Array[Action]] = js.native
  /**
    * URL of the image used to represent the notification when there is
    * not enough space to display the notification itself.
    */
  var badge: js.UndefOr[String] = js.native
  /**
    * Body text of the notification.
    */
  var body: js.UndefOr[String] = js.native
  /**
    * Arbitrary data that you want associated with the notification.
    * This can be of any data type.
    */
  var data: js.UndefOr[js.Any] = js.native
  /**
    * The direction in which to display the notification. Must be one
    * of `auto`, `ltr` or `rtl`.
    */
  var dir: js.UndefOr[auto | ltr | rtl] = js.native
  /**
    * URL to the notification icon.
    */
  var icon: js.UndefOr[String] = js.native
  /**
    * URL of an image to be displayed in the notification.
    */
  var image: js.UndefOr[String] = js.native
  /**
    * The notification's language as a BCP 47 language tag.
    */
  var lang: js.UndefOr[String] = js.native
  /**
    * A boolean specifying whether the user should be notified after a
    * new notification replaces an old one. Defaults to false.
    */
  var renotify: js.UndefOr[Boolean] = js.native
  /**
    * Indicates that a notification should remain active until the user
    * clicks or dismisses it, rather than closing automatically.
    * Defaults to false.
    */
  var requireInteraction: js.UndefOr[Boolean] = js.native
  /**
    * A boolean specifying whether the notification should be silent.
    * Defaults to false.
    */
  var silent: js.UndefOr[Boolean] = js.native
  /**
    * An identifying tag for the notification.
    */
  var tag: js.UndefOr[String] = js.native
  /**
    * Timestamp of the notification. Refer to
    * https://developer.mozilla.org/en-US/docs/Web/API/notification/timestamp
    * for details.
    */
  var timestamp: js.UndefOr[Double] = js.native
  /**
    * Title text of the notification.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * A vibration pattern for the device's vibration hardware to emit
    * when the notification fires.
    */
  var vibrate: js.UndefOr[Double | js.Array[Double]] = js.native
}

object WebpushNotification {
  @scala.inline
  def apply(): WebpushNotification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebpushNotification]
  }
  @scala.inline
  implicit class WebpushNotificationOps[Self <: WebpushNotification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActions(value: js.Array[Action]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(js.undefined)
        ret
    }
    @scala.inline
    def withBadge(value: String): Self = {
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
    def withBody(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withDir(value: auto | ltr | rtl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dir")(js.undefined)
        ret
    }
    @scala.inline
    def withIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.undefined)
        ret
    }
    @scala.inline
    def withImage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(js.undefined)
        ret
    }
    @scala.inline
    def withLang(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lang")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLang: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lang")(js.undefined)
        ret
    }
    @scala.inline
    def withRenotify(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renotify")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenotify: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renotify")(js.undefined)
        ret
    }
    @scala.inline
    def withRequireInteraction(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireInteraction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequireInteraction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireInteraction")(js.undefined)
        ret
    }
    @scala.inline
    def withSilent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSilent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(js.undefined)
        ret
    }
    @scala.inline
    def withTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(js.undefined)
        ret
    }
    @scala.inline
    def withTimestamp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withVibrate(value: Double | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vibrate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVibrate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vibrate")(js.undefined)
        ret
    }
  }
  
}

