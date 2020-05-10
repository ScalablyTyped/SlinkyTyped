package typingsSlinky.firebaseAdmin.admin.messaging

import typingsSlinky.firebaseAdmin.firebaseAdminStrings.`private`
import typingsSlinky.firebaseAdmin.firebaseAdminStrings.default
import typingsSlinky.firebaseAdmin.firebaseAdminStrings.high
import typingsSlinky.firebaseAdmin.firebaseAdminStrings.low
import typingsSlinky.firebaseAdmin.firebaseAdminStrings.max
import typingsSlinky.firebaseAdmin.firebaseAdminStrings.min
import typingsSlinky.firebaseAdmin.firebaseAdminStrings.public
import typingsSlinky.firebaseAdmin.firebaseAdminStrings.secret
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the Android-specific notification options that can be included in
  * {@link admin.messaging.AndroidConfig}.
  */
@js.native
trait AndroidNotification extends js.Object {
  /**
    * Body of the Android notification. When provided, overrides the body set via
    * `admin.messaging.Notification`.
    */
  var body: js.UndefOr[String] = js.native
  /**
    * An array of resource keys that will be used in place of the format
    * specifiers in `bodyLocKey`.
    */
  var bodyLocArgs: js.UndefOr[js.Array[String]] = js.native
  /**
    * Key of the body string in the app's string resource to use to localize the
    * body text.
    *
    */
  var bodyLocKey: js.UndefOr[String] = js.native
  /**
    * The Android notification channel ID (new in Android O). The app must create
    * a channel with this channel ID before any notification with this channel ID
    * can be received. If you don't send this channel ID in the request, or if the
    * channel ID provided has not yet been created by the app, FCM uses the channel
    * ID specified in the app manifest.
    */
  var channelId: js.UndefOr[String] = js.native
  /**
    * Action associated with a user click on the notification. If specified, an
    * activity with a matching Intent Filter is launched when a user clicks on the
    * notification.
    */
  var clickAction: js.UndefOr[String] = js.native
  /**
    * Notification icon color in `#rrggbb` format.
    */
  var color: js.UndefOr[String] = js.native
  /**
    * If set to `true`, use the Android framework's default LED light settings
    * for the notification. Default values are specified in [`config.xml`](https://android.googlesource.com/platform/frameworks/base/+/master/core/res/res/values/config.xml).
    * If `default_light_settings` is set to `true` and `light_settings` is also set,
    * the user-specified `light_settings` is used instead of the default value.
    */
  var defaultLightSettings: js.UndefOr[Boolean] = js.native
  /**
    * If set to `true`, use the Android framework's default sound for the notification.
    * Default values are specified in [`config.xml`](https://android.googlesource.com/platform/frameworks/base/+/master/core/res/res/values/config.xml).
    */
  var defaultSound: js.UndefOr[Boolean] = js.native
  /**
    * If set to `true`, use the Android framework's default vibrate pattern for the
    * notification. Default values are specified in [`config.xml`](https://android.googlesource.com/platform/frameworks/base/+/master/core/res/res/values/config.xml).
    * If `default_vibrate_timings` is set to `true` and `vibrate_timings` is also set,
    * the default value is used instead of the user-specified `vibrate_timings`.
    */
  var defaultVibrateTimings: js.UndefOr[Boolean] = js.native
  /**
    * For notifications that inform users about events with an absolute time reference, sets
    * the time that the event in the notification occurred. Notifications
    * in the panel are sorted by this time.
    */
  var eventTimestamp: js.UndefOr[js.Date] = js.native
  /**
    * Icon resource for the Android notification.
    */
  var icon: js.UndefOr[String] = js.native
  /**
    * URL of an image to be displayed in the notification.
    */
  var imageUrl: js.UndefOr[String] = js.native
  /**
    * Settings to control the notification's LED blinking rate and color if LED is
    * available on the device. The total blinking time is controlled by the OS.
    */
  var lightSettings: js.UndefOr[LightSettings] = js.native
  /**
    * Sets whether or not this notification is relevant only to the current device.
    * Some notifications can be bridged to other devices for remote display, such as
    * a Wear OS watch. This hint can be set to recommend this notification not be bridged.
    * See [Wear OS guides](https://developer.android.com/training/wearables/notifications/bridger#existing-method-of-preventing-bridging)
    */
  var localOnly: js.UndefOr[Boolean] = js.native
  /**
    * Sets the number of items this notification represents. May be displayed as a
    * badge count for Launchers that support badging. See [`NotificationBadge`(https://developer.android.com/training/notify-user/badges).
    * For example, this might be useful if you're using just one notification to
    * represent multiple new messages but you want the count here to represent
    * the number of total new messages. If zero or unspecified, systems
    * that support badging use the default, which is to increment a number
    * displayed on the long-press menu each time a new notification arrives.
    */
  var notificationCount: js.UndefOr[Double] = js.native
  /**
    * Sets the relative priority for this notification. Low-priority notifications
    * may be hidden from the user in certain situations. Note this priority differs
    * from `AndroidMessagePriority`. This priority is processed by the client after
    * the message has been delivered. Whereas `AndroidMessagePriority` is an FCM concept
    * that controls when the message is delivered.
    */
  var priority: js.UndefOr[min | low | default | high | max] = js.native
  /**
    * File name of the sound to be played when the device receives the
    * notification.
    */
  var sound: js.UndefOr[String] = js.native
  /**
    * When set to `false` or unset, the notification is automatically dismissed when
    * the user clicks it in the panel. When set to `true`, the notification persists
    * even when the user clicks it.
    */
  var sticky: js.UndefOr[Boolean] = js.native
  /**
    * Notification tag. This is an identifier used to replace existing
    * notifications in the notification drawer. If not specified, each request
    * creates a new notification.
    */
  var tag: js.UndefOr[String] = js.native
  /**
    * Sets the "ticker" text, which is sent to accessibility services. Prior to
    * API level 21 (Lollipop), sets the text that is displayed in the status bar
    * when the notification first arrives.
    */
  var ticker: js.UndefOr[String] = js.native
  /**
    * Title of the Android notification. When provided, overrides the title set via
    * `admin.messaging.Notification`.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * An array of resource keys that will be used in place of the format
    * specifiers in `titleLocKey`.
    */
  var titleLocArgs: js.UndefOr[js.Array[String]] = js.native
  /**
    * Key of the title string in the app's string resource to use to localize the
    * title text.
    */
  var titleLocKey: js.UndefOr[String] = js.native
  /**
    * Sets the vibration pattern to use. Pass in an array of milliseconds to
    * turn the vibrator on or off. The first value indicates the duration to wait before
    * turning the vibrator on. The next value indicates the duration to keep the
    * vibrator on. Subsequent values alternate between duration to turn the vibrator
    * off and to turn the vibrator on. If `vibrate_timings` is set and `default_vibrate_timings`
    * is set to `true`, the default value is used instead of the user-specified `vibrate_timings`.
    */
  var vibrateTimingsMillis: js.UndefOr[js.Array[Double]] = js.native
  /**
    * Sets the visibility of the notification. Must be either `private`, `public`,
    * or `secret`. If unspecified, defaults to `private`.
    */
  var visibility: js.UndefOr[`private` | public | secret] = js.native
}

object AndroidNotification {
  @scala.inline
  def apply(): AndroidNotification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AndroidNotification]
  }
  @scala.inline
  implicit class AndroidNotificationOps[Self <: AndroidNotification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withBodyLocArgs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyLocArgs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBodyLocArgs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyLocArgs")(js.undefined)
        ret
    }
    @scala.inline
    def withBodyLocKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyLocKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBodyLocKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyLocKey")(js.undefined)
        ret
    }
    @scala.inline
    def withChannelId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannelId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelId")(js.undefined)
        ret
    }
    @scala.inline
    def withClickAction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClickAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickAction")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultLightSettings(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultLightSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultLightSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultLightSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultSound(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultSound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSound")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultVibrateTimings(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultVibrateTimings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultVibrateTimings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultVibrateTimings")(js.undefined)
        ret
    }
    @scala.inline
    def withEventTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventTimestamp")(js.undefined)
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
    def withImageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withLightSettings(value: LightSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lightSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLightSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lightSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withNotificationCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotificationCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationCount")(js.undefined)
        ret
    }
    @scala.inline
    def withPriority(value: min | low | default | high | max): Self = {
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
    def withSound(value: String): Self = {
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
    @scala.inline
    def withSticky(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sticky")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSticky: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sticky")(js.undefined)
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
    def withTicker(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTicker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticker")(js.undefined)
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
    def withTitleLocArgs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleLocArgs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleLocArgs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleLocArgs")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleLocKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleLocKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleLocKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleLocKey")(js.undefined)
        ret
    }
    @scala.inline
    def withVibrateTimingsMillis(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vibrateTimingsMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVibrateTimingsMillis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vibrateTimingsMillis")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibility(value: `private` | public | secret): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibility")(js.undefined)
        ret
    }
  }
  
}

