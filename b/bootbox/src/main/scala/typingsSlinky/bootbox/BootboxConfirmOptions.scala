package typingsSlinky.bootbox

import org.scalajs.dom.raw.DocumentFragment
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.Text
import typingsSlinky.jquery.JQuery_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Bootbox options available for confirm modals */
@js.native
trait BootboxConfirmOptions extends BootboxDialogOptions[Boolean] {
  @JSName("buttons")
  var buttons_BootboxConfirmOptions: js.UndefOr[BootboxConfirmPromptButtonMap] = js.native
  @JSName("callback")
  def callback_MBootboxConfirmOptions(result: Boolean): js.Any = js.native
}

object BootboxConfirmOptions {
  @scala.inline
  def apply(
    callback: Boolean => js.Any,
    message: JQuery_[HTMLElement] | js.Array[_] | Element | DocumentFragment | Text | String | (js.Function2[/* index */ Double, /* html */ String, String | Element | JQuery_[HTMLElement]])
  ): BootboxConfirmOptions = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootboxConfirmOptions]
  }
  @scala.inline
  implicit class BootboxConfirmOptionsOps[Self <: BootboxConfirmOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallback(value: Boolean => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withButtons(value: BootboxConfirmPromptButtonMap): Self = {
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
  }
  
}

