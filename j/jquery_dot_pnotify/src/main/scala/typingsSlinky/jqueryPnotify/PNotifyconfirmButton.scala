package typingsSlinky.jqueryPnotify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PNotifyconfirmButton extends js.Object {
  var addClass: js.UndefOr[String] = js.native
  /**
    *  Whether to trigger this button when the user hits enter in a single line prompt.
    */
  var promptTrigger: js.UndefOr[Boolean] = js.native
  var text: js.UndefOr[String] = js.native
  def click(notice: PNotify, value: js.Any): Unit = js.native
}

object PNotifyconfirmButton {
  @scala.inline
  def apply(click: (PNotify, js.Any) => Unit): PNotifyconfirmButton = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction2(click))
    __obj.asInstanceOf[PNotifyconfirmButton]
  }
  @scala.inline
  implicit class PNotifyconfirmButtonOps[Self <: PNotifyconfirmButton] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClick(value: (PNotify, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAddClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addClass")(js.undefined)
        ret
    }
    @scala.inline
    def withPromptTrigger(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promptTrigger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPromptTrigger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promptTrigger")(js.undefined)
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
  }
  
}

