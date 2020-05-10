package typingsSlinky.phonegapPluginPush

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonClearBadge extends js.Object {
  /**
  			 * If true the icon badge will be cleared on init and before push messages are processed. Default is false.
  			 */
  var clearBadge: js.UndefOr[Boolean] = js.native
  /**
  			 * If true the app clears all pending notifications when it is closed. Default is true.
  			 */
  var clearNotifications: js.UndefOr[Boolean] = js.native
  /**
  			 * If true will always show a notification, even when the app is on the foreground. Default is false.
  			 */
  var forceShow: js.UndefOr[Boolean] = js.native
  /**
  			 * The name of a drawable resource to use as the small-icon. The name should not include the extension.
  			 */
  var icon: js.UndefOr[String] = js.native
  /**
  			 * Sets the background color of the small icon on Android 5.0 and greater.
  			 * Supported Formats - http://developer.android.com/reference/android/graphics/Color.html#parseColor(java.lang.String)
  			 */
  var iconColor: js.UndefOr[String] = js.native
  /**
  			 * The key to search for text of notification. Default is 'message'.
  			 */
  var messageKey: js.UndefOr[String] = js.native
  /**
  			 * If true it plays the sound specified in the push data or the default system sound. Default is true.
  			 */
  var sound: js.UndefOr[Boolean] = js.native
  /**
  			 * The key to search for title of notification. Default is 'title'.
  			 */
  var titleKey: js.UndefOr[String] = js.native
  /**
  			 * If the array contains one or more strings each string will be used to subscribe to a GcmPubSub topic.
  			 */
  var topics: js.UndefOr[js.Array[String]] = js.native
  /**
  			 * If true the device vibrates on receipt of notification. Default is true.
  			 */
  var vibrate: js.UndefOr[Boolean] = js.native
}

object AnonClearBadge {
  @scala.inline
  def apply(): AnonClearBadge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonClearBadge]
  }
  @scala.inline
  implicit class AnonClearBadgeOps[Self <: AnonClearBadge] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClearBadge(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearBadge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearBadge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearBadge")(js.undefined)
        ret
    }
    @scala.inline
    def withClearNotifications(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearNotifications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearNotifications: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearNotifications")(js.undefined)
        ret
    }
    @scala.inline
    def withForceShow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceShow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceShow")(js.undefined)
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
    def withIconColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconColor")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageKey")(js.undefined)
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
    @scala.inline
    def withTitleKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleKey")(js.undefined)
        ret
    }
    @scala.inline
    def withTopics(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topics")(js.undefined)
        ret
    }
    @scala.inline
    def withVibrate(value: Boolean): Self = {
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

