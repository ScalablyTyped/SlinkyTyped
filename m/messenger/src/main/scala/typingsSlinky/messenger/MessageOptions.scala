package typingsSlinky.messenger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageOptions extends js.Object {
  /**
    * Hide the message after the provided number of seconds.
    */
  var hideAfter: js.UndefOr[Double] = js.native
  /**
    * Hide the message if Backbone client-side navigation occurs.
    */
  var hideOnNavigate: js.UndefOr[Boolean] = js.native
  /**
    * A unique id. If supplied, only one message with that ID will be shown at a time.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The text of the message.
    */
  var message: String = js.native
  /**
    * Should a close button be added to the message?
    */
  var showCloseButton: js.UndefOr[Boolean] = js.native
  /**
    * Hide the newer message if there is an id collision, as opposed to the older message.
    */
  var singleton: js.UndefOr[Boolean] = js.native
  /**
    * What theme class should be applied to the message? Defaults to the theme set for Messenger in general.
    */
  var theme: js.UndefOr[String] = js.native
  /**
    * "info", "error" or "success" are understood by the provided themes. You can also pass your own string, and that class will be added.
    */
  var `type`: js.UndefOr[String] = js.native
}

object MessageOptions {
  @scala.inline
  def apply(message: String): MessageOptions = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageOptions]
  }
  @scala.inline
  implicit class MessageOptionsOps[Self <: MessageOptions] (val x: Self) extends AnyVal {
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
    def withHideAfter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideAfter")(js.undefined)
        ret
    }
    @scala.inline
    def withHideOnNavigate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideOnNavigate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideOnNavigate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideOnNavigate")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withShowCloseButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCloseButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowCloseButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCloseButton")(js.undefined)
        ret
    }
    @scala.inline
    def withSingleton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSingleton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleton")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
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

