package typingsSlinky.chromeApps

import typingsSlinky.chromeApps.chrome.ToStringLiteral
import typingsSlinky.chromeApps.chrome.double
import typingsSlinky.chromeApps.chrome.integer
import typingsSlinky.chromeApps.chrome.notifications.ButtonOptions
import typingsSlinky.chromeApps.chrome.notifications.ItemOptions
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

/* Inlined std.Partial<chrome-apps.chrome.notifications.NotificationOptions> */
@js.native
trait PartialNotificationOption extends js.Object {
  var appIconMaskUrl: js.UndefOr[String] = js.native
  var buttons: js.UndefOr[js.Array[ButtonOptions]] = js.native
  var contextMessage: js.UndefOr[String] = js.native
  var eventTime: js.UndefOr[double] = js.native
  var iconUrl: js.UndefOr[String] = js.native
  var imageUrl: js.UndefOr[String] = js.native
  var isClickable: js.UndefOr[Boolean] = js.native
  var items: js.UndefOr[js.Array[ItemOptions]] = js.native
  var message: js.UndefOr[String] = js.native
  var priority: js.UndefOr[`-2` | `-1` | `0` | `1` | `2`] = js.native
  var progress: js.UndefOr[integer] = js.native
  var requireInteraction: js.UndefOr[Boolean] = js.native
  var silent: js.UndefOr[Boolean] = js.native
  var title: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[
    ToStringLiteral[
      AnonBASIC, 
      /* keyof chrome-apps.AnonBASIC */ BASIC | IMAGE | LIST | PROGRESS, 
      Exclude[
        /* keyof chrome-apps.AnonBASIC */ BASIC | IMAGE | LIST | PROGRESS, 
        basic_ | image_ | list_ | progress_
      ]
    ]
  ] = js.native
}

object PartialNotificationOption {
  @scala.inline
  def apply(): PartialNotificationOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialNotificationOption]
  }
  @scala.inline
  implicit class PartialNotificationOptionOps[Self <: PartialNotificationOption] (val x: Self) extends AnyVal {
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
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

