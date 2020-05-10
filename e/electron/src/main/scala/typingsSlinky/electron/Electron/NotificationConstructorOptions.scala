package typingsSlinky.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationConstructorOptions extends js.Object {
  /**
    * Actions to add to the notification. Please read the available actions and
    * limitations in the NotificationAction documentation.
    */
  var actions: js.UndefOr[js.Array[NotificationAction]] = js.native
  /**
    * The body text of the notification, which will be displayed below the title or
    * subtitle.
    */
  var body: String = js.native
  /**
    * A custom title for the close button of an alert. An empty string will cause the
    * default localized text to be used.
    */
  var closeButtonText: js.UndefOr[String] = js.native
  /**
    * Whether or not to add an inline reply option to the notification.
    */
  var hasReply: js.UndefOr[Boolean] = js.native
  /**
    * An icon to use in the notification.
    */
  var icon: js.UndefOr[String | NativeImage_] = js.native
  /**
    * The placeholder to write in the inline reply input field.
    */
  var replyPlaceholder: js.UndefOr[String] = js.native
  /**
    * Whether or not to emit an OS notification noise when showing the notification.
    */
  var silent: js.UndefOr[Boolean] = js.native
  /**
    * The name of the sound file to play when the notification is shown.
    */
  var sound: js.UndefOr[String] = js.native
  /**
    * A subtitle for the notification, which will be displayed below the title.
    */
  var subtitle: js.UndefOr[String] = js.native
  /**
    * A title for the notification, which will be shown at the top of the notification
    * window when it is shown.
    */
  var title: String = js.native
}

object NotificationConstructorOptions {
  @scala.inline
  def apply(body: String, title: String): NotificationConstructorOptions = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationConstructorOptions]
  }
  @scala.inline
  implicit class NotificationConstructorOptionsOps[Self <: NotificationConstructorOptions] (val x: Self) extends AnyVal {
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
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActions(value: js.Array[NotificationAction]): Self = {
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
    def withCloseButtonText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeButtonText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseButtonText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeButtonText")(js.undefined)
        ret
    }
    @scala.inline
    def withHasReply(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasReply")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasReply: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasReply")(js.undefined)
        ret
    }
    @scala.inline
    def withIcon(value: String | NativeImage_): Self = {
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
    def withReplyPlaceholder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replyPlaceholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplyPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replyPlaceholder")(js.undefined)
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
    def withSubtitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubtitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitle")(js.undefined)
        ret
    }
  }
  
}

