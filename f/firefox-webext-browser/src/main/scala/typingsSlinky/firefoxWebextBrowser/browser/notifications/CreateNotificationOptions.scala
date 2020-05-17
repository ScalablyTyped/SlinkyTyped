package typingsSlinky.firefoxWebextBrowser.browser.notifications

import typingsSlinky.firefoxWebextBrowser.anon.IconUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateNotificationOptions extends js.Object {
  /** A URL to the app icon mask. */
  var appIconMaskUrl: js.UndefOr[String] = js.native
  /**
    * Text and icons for up to two notification action buttons.
    * @deprecated Unsupported on Firefox at this time.
    */
  var buttons: js.UndefOr[js.Array[IconUrl]] = js.native
  /** Alternate notification content with a lower-weight font. */
  var contextMessage: js.UndefOr[String] = js.native
  /** A timestamp associated with the notification, in milliseconds past the epoch. */
  var eventTime: js.UndefOr[Double] = js.native
  /** A URL to the sender's avatar, app icon, or a thumbnail for image notifications. */
  var iconUrl: js.UndefOr[String] = js.native
  /** A URL to the image thumbnail for image-type notifications. */
  var imageUrl: js.UndefOr[String] = js.native
  /**
    * Whether to show UI indicating that the app will visibly respond to clicks on the body of a notification.
    */
  var isClickable: js.UndefOr[Boolean] = js.native
  /** Items for multi-item notifications. */
  var items: js.UndefOr[js.Array[NotificationItem]] = js.native
  /** Main notification content. */
  var message: String = js.native
  /** Priority ranges from -2 to 2\. -2 is lowest priority. 2 is highest. Zero is default. */
  var priority: js.UndefOr[Double] = js.native
  /** Current progress ranges from 0 to 100. */
  var progress: js.UndefOr[Double] = js.native
  /** Title of the notification (e.g. sender name for email). */
  var title: String = js.native
  /** Which type of notification to display. */
  var `type`: TemplateType = js.native
}

object CreateNotificationOptions {
  @scala.inline
  def apply(message: String, title: String, `type`: TemplateType): CreateNotificationOptions = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateNotificationOptions]
  }
  @scala.inline
  implicit class CreateNotificationOptionsOps[Self <: CreateNotificationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: TemplateType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withButtons(value: js.Array[IconUrl]): Self = {
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
    def withItems(value: js.Array[NotificationItem]): Self = {
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
  }
  
}

