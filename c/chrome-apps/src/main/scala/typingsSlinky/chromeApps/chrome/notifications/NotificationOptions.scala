package typingsSlinky.chromeApps.chrome.notifications

import typingsSlinky.chromeApps.AnonBASIC
import typingsSlinky.chromeApps.chrome.ToStringLiteral
import typingsSlinky.chromeApps.chrome.double
import typingsSlinky.chromeApps.chrome.integer
import typingsSlinky.chromeApps.chromeAppsNumbers.`-1`
import typingsSlinky.chromeApps.chromeAppsNumbers.`-2`
import typingsSlinky.chromeApps.chromeAppsNumbers.`0`
import typingsSlinky.chromeApps.chromeAppsNumbers.`1`
import typingsSlinky.chromeApps.chromeAppsNumbers.`2`
import typingsSlinky.chromeApps.chromeAppsStrings.BASIC
import typingsSlinky.chromeApps.chromeAppsStrings.IMAGE
import typingsSlinky.chromeApps.chromeAppsStrings.LIST
import typingsSlinky.chromeApps.chromeAppsStrings.PROGRESS
import typingsSlinky.chromeApps.chromeAppsStrings.basic_
import typingsSlinky.chromeApps.chromeAppsStrings.image_
import typingsSlinky.chromeApps.chromeAppsStrings.list_
import typingsSlinky.chromeApps.chromeAppsStrings.progress_
import typingsSlinky.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationOptions extends js.Object {
  /**
    * @deprecated since Chrome 59. The app icon mask is not visible for Mac OS X users.
    * A URL to the app icon mask. URLs have the same restrictions as iconUrl.
    * The app icon mask should be in alpha channel,
    * as only the alpha channel of the image will be considered.
    */
  var appIconMaskUrl: js.UndefOr[String] = js.native
  /** Text and icons for up to two notification action buttons. */
  var buttons: js.UndefOr[js.Array[ButtonOptions]] = js.native
  /**
    * Alternate notification content with a lower-weight font.
    * @since Chrome 31.
    */
  var contextMessage: js.UndefOr[String] = js.native
  /** A timestamp associated with the notification, in milliseconds past the epoch (e.g. Date.now() + n). */
  var eventTime: js.UndefOr[double] = js.native
  /**
    * Optional.
    * A URL to the sender's avatar, app icon, or a thumbnail for image notifications.
    * URLs can be a data URL, a blob URL, or a URL relative to a resource within this app's .crx file Required for notifications.create method.
    */
  var iconUrl: String = js.native
  /**
    * @deprecated Deprecated since Chrome 59. The image is not visible for Mac OS X users.
    * A URL to the image thumbnail for image-type notifications.
    * URLs have the same restrictions as iconUrl.
    */
  var imageUrl: js.UndefOr[String] = js.native
  /**
    * @deprecated Deprecated since Chrome 67. This UI hint is ignored as of Chrome 67
    * @description Whether to show UI indicating that the app will visibly respond to clicks on the body of a notification.
    */
  var isClickable: js.UndefOr[Boolean] = js.native
  /**
    * Items for multi-item notifications.
    * Items for multi-item notifications. Users on Mac OS X only see the first item.
    */
  var items: js.UndefOr[js.Array[ItemOptions]] = js.native
  /** Main notification content. Required for notifications.create method. */
  var message: String = js.native
  /**
    * Priority ranges from -2 to 2. -2 is lowest priority. 2 is highest.
    * On platforms that don't support a notification center (Windows, Linux & Mac),
    * -2 and -1 result in an error as notifications with those priorities will not be shown at all.
    * @default 0
    */
  var priority: js.UndefOr[`-2` | `-1` | `0` | `1` | `2`] = js.native
  /**
    * Current progress ranges from 0 to 100.
    * @since Chrome 30.
    */
  var progress: js.UndefOr[integer] = js.native
  /**
    * Indicates that the notification should remain visible
    * on screen until the user activates or dismisses the notification.
    * This defaults to false.
    * @since Chrome 50
    */
  var requireInteraction: js.UndefOr[Boolean] = js.native
  /**
    * @since Chrome 70.
    * @description Indicates that no sounds or vibrations should be made when the notification is being shown.
    * @default false
    */
  var silent: js.UndefOr[Boolean] = js.native
  /** Title of the notification (e.g. sender name for email). Required for notifications.create method. */
  var title: String = js.native
  /**
    * Which type of notification to display. Required for notifications.create method.
    * @see enum TemplateType
    */
  var `type`: ToStringLiteral[
    AnonBASIC, 
    /* keyof chrome-apps.AnonBASIC */ BASIC | IMAGE | LIST | PROGRESS, 
    Exclude[
      /* keyof chrome-apps.AnonBASIC */ BASIC | IMAGE | LIST | PROGRESS, 
      basic_ | image_ | list_ | progress_
    ]
  ] = js.native
}

object NotificationOptions {
  @scala.inline
  def apply(
    iconUrl: String,
    message: String,
    title: String,
    `type`: ToStringLiteral[
      AnonBASIC, 
      /* keyof chrome-apps.AnonBASIC */ BASIC | IMAGE | LIST | PROGRESS, 
      Exclude[
        /* keyof chrome-apps.AnonBASIC */ BASIC | IMAGE | LIST | PROGRESS, 
        basic_ | image_ | list_ | progress_
      ]
    ]
  ): NotificationOptions = {
    val __obj = js.Dynamic.literal(iconUrl = iconUrl.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationOptions]
  }
  @scala.inline
  implicit class NotificationOptionsOps[Self <: NotificationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIconUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconUrl")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withType(
      value: ToStringLiteral[
          AnonBASIC, 
          /* keyof chrome-apps.AnonBASIC */ BASIC | IMAGE | LIST | PROGRESS, 
          Exclude[
            /* keyof chrome-apps.AnonBASIC */ BASIC | IMAGE | LIST | PROGRESS, 
            basic_ | image_ | list_ | progress_
          ]
        ]
    ): Self = {
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
    def withButtons(value: js.Array[ButtonOptions]): Self = {
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
    def withEventTime(value: double): Self = {
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
    def withItems(value: js.Array[ItemOptions]): Self = {
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
    def withPriority(value: `-2` | `-1` | `0` | `1` | `2`): Self = {
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
    def withProgress(value: integer): Self = {
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
  }
  
}

