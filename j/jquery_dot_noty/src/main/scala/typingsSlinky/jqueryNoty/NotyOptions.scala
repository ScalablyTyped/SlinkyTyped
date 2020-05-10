package typingsSlinky.jqueryNoty

import typingsSlinky.jqueryNoty.jqueryNotyStrings.backdrop
import typingsSlinky.jqueryNoty.jqueryNotyStrings.button
import typingsSlinky.jqueryNoty.jqueryNotyStrings.click
import typingsSlinky.jqueryNoty.jqueryNotyStrings.hover
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotyOptions extends js.Object {
  var animation: js.UndefOr[NotyAnimationOptions] = js.native
  /** an array of buttons, for creating confirmation dialogs. */
  var buttons: js.UndefOr[js.Any] = js.native
  var callback: js.UndefOr[NotyCallbackOptions] = js.native
  /** backdrop click will close all notifications */
  var closeWith: js.UndefOr[js.Array[click | button | hover | backdrop]] = js.native
  /** If you want to use queue feature set this true. */
  var dismissQueue: js.UndefOr[Boolean] = js.native
  /** adds notification to the beginning of queue when set to true */
  var force: js.UndefOr[Boolean] = js.native
  /** if true closes all notifications and shows itself */
  var killer: js.UndefOr[Boolean] = js.native
  var layout: js.UndefOr[String] = js.native
  /** You can set max visible notification for dismissQueue true option */
  var maxVisible: js.UndefOr[Double] = js.native
  /** if true adds an overlay */
  var modal: js.UndefOr[Boolean] = js.native
  /** displays a progress bar */
  var progressBar: js.UndefOr[Boolean] = js.native
  /** The note`s optional template like '<div class="noty_message"><span class="noty_text"></span><div class="noty_close"></div></div>' */
  var template: js.UndefOr[String] = js.native
  /** Text to show. Can be html or string. */
  var text: js.UndefOr[String] = js.native
  var theme: js.UndefOr[String] = js.native
  /** Delay for closing event. Set false for sticky notifications */
  var timeout: js.UndefOr[js.Any] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object NotyOptions {
  @scala.inline
  def apply(): NotyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotyOptions]
  }
  @scala.inline
  implicit class NotyOptionsOps[Self <: NotyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimation(value: NotyAnimationOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(js.undefined)
        ret
    }
    @scala.inline
    def withButtons(value: js.Any): Self = {
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
    def withCallback(value: NotyCallbackOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseWith(value: js.Array[click | button | hover | backdrop]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeWith")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseWith: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeWith")(js.undefined)
        ret
    }
    @scala.inline
    def withDismissQueue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dismissQueue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDismissQueue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dismissQueue")(js.undefined)
        ret
    }
    @scala.inline
    def withForce(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("force")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("force")(js.undefined)
        ret
    }
    @scala.inline
    def withKiller(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("killer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKiller: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("killer")(js.undefined)
        ret
    }
    @scala.inline
    def withLayout(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxVisible(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withModal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modal")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressBar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressBar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressBar")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(js.undefined)
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
    def withTimeout(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
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

