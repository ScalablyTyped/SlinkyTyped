package typingsSlinky.naverWhale.whale.notifications

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationOptions extends js.Object {
  /**
    * Optional.
    * A URL to the app icon mask. URLs have the same restrictions as iconUrl. The app icon mask should be in alpha channel, as only the alpha channel of the image will be considered.
    * @since Chrome 38.
    */
  var appIconMaskUrl: js.UndefOr[String] = js.native
  /** Optional. Text and icons for up to two notification action buttons. */
  var buttons: js.UndefOr[js.Array[typingsSlinky.chrome.chrome.notifications.ButtonOptions]] = js.native
  /**
    * Optional.
    * Alternate notification content with a lower-weight font.
    * @since Chrome 31.
    */
  var contextMessage: js.UndefOr[String] = js.native
  /** Optional. A timestamp associated with the notification, in milliseconds past the epoch (e.g. Date.now() + n). */
  var eventTime: js.UndefOr[Double] = js.native
  /**
    * Optional.
    * A URL to the sender's avatar, app icon, or a thumbnail for image notifications.
    * URLs can be a data URL, a blob URL, or a URL relative to a resource within this extension's .crx file Required for notifications.create method.
    */
  var iconUrl: js.UndefOr[String] = js.native
  /** Optional. A URL to the image thumbnail for image-type notifications. URLs have the same restrictions as iconUrl. */
  var imageUrl: js.UndefOr[String] = js.native
  /**
    * Optional.
    * Whether to show UI indicating that the app will visibly respond to clicks on the body of a notification.
    * @since Chrome 32.
    */
  var isClickable: js.UndefOr[Boolean] = js.native
  /** Optional. Items for multi-item notifications. */
  var items: js.UndefOr[js.Array[typingsSlinky.chrome.chrome.notifications.ItemOptions]] = js.native
  /** Optional. Main notification content. Required for notifications.create method. */
  var message: js.UndefOr[String] = js.native
  /** Optional. Priority ranges from -2 to 2. -2 is lowest priority. 2 is highest. Zero is default. */
  var priority: js.UndefOr[Double] = js.native
  /**
    * Optional.
    * Current progress ranges from 0 to 100.
    * @since Chrome 30.
    */
  var progress: js.UndefOr[Double] = js.native
  /**
    * Indicates that the notification should remain visible on screen until the user activates or dismisses the notification.
    * This defaults to false.
    * @since Chrome 50
    */
  var requireInteraction: js.UndefOr[Boolean] = js.native
  /**
    * Optional.
    * Indicates that no sounds or vibrations should be made when the notification is being shown. This defaults to false.
    * @since Chrome 70
    */
  var silent: js.UndefOr[Boolean] = js.native
  /** Optional. Title of the notification (e.g. sender name for email). Required for notifications.create method. */
  var title: js.UndefOr[String] = js.native
  /** Optional. Which type of notification to display. Required for notifications.create method. */
  var `type`: js.UndefOr[String] = js.native
}

object NotificationOptions {
  @scala.inline
  def apply(): NotificationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotificationOptions]
  }
  @scala.inline
  implicit class NotificationOptionsOps[Self <: NotificationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppIconMaskUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appIconMaskUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppIconMaskUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appIconMaskUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withButtons(value: js.Array[typingsSlinky.chrome.chrome.notifications.ButtonOptions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttons")(js.undefined)
        ret
    }
    @scala.inline
    def withContextMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContextMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withEventTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventTime")(js.undefined)
        ret
    }
    @scala.inline
    def withIconUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconUrl")(js.undefined)
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
    def withIsClickable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isClickable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsClickable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isClickable")(js.undefined)
        ret
    }
    @scala.inline
    def withItems(value: js.Array[typingsSlinky.chrome.chrome.notifications.ItemOptions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
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
    def withProgress(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(js.undefined)
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
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

