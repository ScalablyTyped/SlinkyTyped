package typingsSlinky.jqueryPnotify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PNotifyconfirm extends js.Object {
  /**
    * Where to align the buttons. (right, center, left, justify)
    */
  var align: js.UndefOr[String] = js.native
  /**
    * The buttons to display, and their callbacks.
    */
  var buttons: js.UndefOr[js.Array[PNotifyconfirmButton]] = js.native
  /**
    * Make a confirmation box.
    */
  var confirm: js.UndefOr[Boolean] = js.native
  /**
    * Make a prompt.
    */
  var prompt: js.UndefOr[Boolean] = js.native
  /**
    * Classes to add to the input element of the prompt.
    */
  var prompt_class: js.UndefOr[String] = js.native
  /**
    * The default value of the prompt.
    */
  var prompt_default: js.UndefOr[String] = js.native
  /**
    * Whether the prompt should accept multiple lines of text.
    */
  var prompt_multi_line: js.UndefOr[Boolean] = js.native
}

object PNotifyconfirm {
  @scala.inline
  def apply(): PNotifyconfirm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PNotifyconfirm]
  }
  @scala.inline
  implicit class PNotifyconfirmOps[Self <: PNotifyconfirm] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlign(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(js.undefined)
        ret
    }
    @scala.inline
    def withButtons(value: js.Array[PNotifyconfirmButton]): Self = {
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
    def withConfirm(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfirm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirm")(js.undefined)
        ret
    }
    @scala.inline
    def withPrompt(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prompt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrompt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prompt")(js.undefined)
        ret
    }
    @scala.inline
    def withPrompt_class(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prompt_class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrompt_class: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prompt_class")(js.undefined)
        ret
    }
    @scala.inline
    def withPrompt_default(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prompt_default")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrompt_default: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prompt_default")(js.undefined)
        ret
    }
    @scala.inline
    def withPrompt_multi_line(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prompt_multi_line")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrompt_multi_line: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prompt_multi_line")(js.undefined)
        ret
    }
  }
  
}

