package typingsSlinky.firebaseAdmin.admin.messaging

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface representing an FCM legacy API notification message payload.
  * Notification messages let developers send up to 4KB of predefined
  * key-value pairs. Accepted keys are outlined below.
  *
  * See [Build send requests](/docs/cloud-messaging/send-message)
  * for code samples and detailed documentation.
  */
@js.native
trait NotificationMessagePayload
  extends /* key */ StringDictionary[js.UndefOr[String]] {
  /**
    * The value of the badge on the home screen app icon.
    *
    * If not specified, the badge is not changed.
    *
    * If set to `0`, the badge is removed.
    *
    * **Platforms:** iOS
    */
  var badge: js.UndefOr[String] = js.native
  /**
    * The notification's body text.
    *
    * **Platforms:** iOS, Android, Web
    */
  var body: js.UndefOr[String] = js.native
  /**
    * Variable string values to be used in place of the format specifiers in
    * `body_loc_key` to use to localize the body text to the user's current
    * localization.
    *
    * The value should be a stringified JSON array.
    *
    * **iOS:** Corresponds to `loc-args` in the APNs payload. See
    * [Payload Key Reference](https://developer.apple.com/library/content/documentation/NetworkingInternet/Conceptual/RemoteNotificationsPG/PayloadKeyReference.html)
    * and
    * [Localizing the Content of Your Remote Notifications](https://developer.apple.com/library/content/documentation/NetworkingInternet/Conceptual/RemoteNotificationsPG/CreatingtheNotificationPayload.html#//apple_ref/doc/uid/TP40008194-CH10-SW9)
    * for more information.
    *
    * **Android:** See
    * [Formatting and Styling](http://developer.android.com/guide/topics/resources/string-resource.html#FormattingAndStyling)
    * for more information.
    *
    * **Platforms:** iOS, Android
    */
  var bodyLocArgs: js.UndefOr[String] = js.native
  /**
    * The key to the body string in the app's string resources to use to localize
    * the body text to the user's current localization.
    *
    * **iOS:** Corresponds to `loc-key` in the APNs payload. See
    * [Payload Key Reference](https://developer.apple.com/library/content/documentation/NetworkingInternet/Conceptual/RemoteNotificationsPG/PayloadKeyReference.html)
    * and
    * [Localizing the Content of Your Remote Notifications](https://developer.apple.com/library/content/documentation/NetworkingInternet/Conceptual/RemoteNotificationsPG/CreatingtheNotificationPayload.html#//apple_ref/doc/uid/TP40008194-CH10-SW9)
    * for more information.
    *
    * **Android:** See
    * [String Resources](http://developer.android.com/guide/topics/resources/string-resource.html)      * for more information.
    *
    * **Platforms:** iOS, Android
    */
  var bodyLocKey: js.UndefOr[String] = js.native
  /**
    * Action associated with a user click on the notification. If specified, an
    * activity with a matching Intent Filter is launched when a user clicks on the
    * notification.
    *
    *   * **Platforms:** Android
    */
  var clickAction: js.UndefOr[String] = js.native
  /**
    * The notification icon's color, expressed in `#rrggbb` format.
    *
    * **Platforms:** Android
    */
  var color: js.UndefOr[String] = js.native
  /**
    * The notification's icon.
    *
    * **Android:** Sets the notification icon to `myicon` for drawable resource
    * `myicon`. If you don't send this key in the request, FCM displays the
    * launcher icon specified in your app manifest.
    *
    * **Web:** The URL to use for the notification's icon.
    *
    * **Platforms:** Android, Web
    */
  var icon: js.UndefOr[String] = js.native
  /**
    * Identifier used to replace existing notifications in the notification drawer.
    *
    * If not specified, each request creates a new notification.
    *
    * If specified and a notification with the same tag is already being shown,
    * the new notification replaces the existing one in the notification drawer.
    *
    * **Platforms:** Android
    */
  var sound: js.UndefOr[String] = js.native
  var tag: js.UndefOr[String] = js.native
  /**
    * The notification's title.
    *
    * **Platforms:** iOS, Android, Web
    */
  var title: js.UndefOr[String] = js.native
  /**
    * Variable string values to be used in place of the format specifiers in
    * `title_loc_key` to use to localize the title text to the user's current
    * localization.
    *
    * The value should be a stringified JSON array.
    *
    * **iOS:** Corresponds to `title-loc-args` in the APNs payload. See
    * [Payload Key Reference](https://developer.apple.com/library/content/documentation/NetworkingInternet/Conceptual/RemoteNotificationsPG/PayloadKeyReference.html)
    * and
    * [Localizing the Content of Your Remote Notifications](https://developer.apple.com/library/content/documentation/NetworkingInternet/Conceptual/RemoteNotificationsPG/CreatingtheNotificationPayload.html#//apple_ref/doc/uid/TP40008194-CH10-SW9)
    * for more information.
    *
    * **Android:** See
    * [Formatting and Styling](http://developer.android.com/guide/topics/resources/string-resource.html#FormattingAndStyling)
    * for more information.
    *
    * **Platforms:** iOS, Android
    */
  var titleLocArgs: js.UndefOr[String] = js.native
  /**
    * The key to the title string in the app's string resources to use to localize
    * the title text to the user's current localization.
    *
    * **iOS:** Corresponds to `title-loc-key` in the APNs payload. See
    * [Payload Key Reference](https://developer.apple.com/library/content/documentation/NetworkingInternet/Conceptual/RemoteNotificationsPG/PayloadKeyReference.html)
    * and
    * [Localizing the Content of Your Remote Notifications](https://developer.apple.com/library/content/documentation/NetworkingInternet/Conceptual/RemoteNotificationsPG/CreatingtheNotificationPayload.html#//apple_ref/doc/uid/TP40008194-CH10-SW9)
    * for more information.
    *
    * **Android:** See
    * [String Resources](http://developer.android.com/guide/topics/resources/string-resource.html)
    * for more information.
    *
    * **Platforms:** iOS, Android
    */
  var titleLocKey: js.UndefOr[String] = js.native
}

object NotificationMessagePayload {
  @scala.inline
  def apply(): NotificationMessagePayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotificationMessagePayload]
  }
  @scala.inline
  implicit class NotificationMessagePayloadOps[Self <: NotificationMessagePayload] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withBodyLocArgs(value: String): Self = {
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
    def withTitleLocArgs(value: String): Self = {
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
  }
  
}

