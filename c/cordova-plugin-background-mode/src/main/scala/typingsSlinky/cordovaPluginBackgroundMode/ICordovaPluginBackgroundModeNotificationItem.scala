package typingsSlinky.cordovaPluginBackgroundMode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICordovaPluginBackgroundModeNotificationItem extends js.Object {
  /**
    * Handles if app is coming to foreground when tapping on the notification
    */
  var resume: js.UndefOr[Boolean] = js.native
  /**
    * Handles if there is a notification when background is activated
    */
  var silent: js.UndefOr[Boolean] = js.native
  /**
    * The body of the notification displayed in background mode
    */
  var text: js.UndefOr[String] = js.native
  /**
    * The ticker of the notification displayed in background mode
    */
  var ticker: js.UndefOr[String] = js.native
  /**
    * The title of the notification displayed in background mode
    */
  var title: js.UndefOr[String] = js.native
}

object ICordovaPluginBackgroundModeNotificationItem {
  @scala.inline
  def apply(): ICordovaPluginBackgroundModeNotificationItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICordovaPluginBackgroundModeNotificationItem]
  }
  @scala.inline
  implicit class ICordovaPluginBackgroundModeNotificationItemOps[Self <: ICordovaPluginBackgroundModeNotificationItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResume(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resume")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResume: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resume")(js.undefined)
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
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
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
  }
  
}

