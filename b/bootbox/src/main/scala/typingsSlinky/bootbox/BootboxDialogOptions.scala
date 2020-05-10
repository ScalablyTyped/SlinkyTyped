package typingsSlinky.bootbox

import org.scalajs.dom.raw.DocumentFragment
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.Text
import typingsSlinky.jquery.JQuery_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Bootbox options available for custom modals */
@js.native
trait BootboxDialogOptions[T] extends BootboxBaseOptions[T] {
  var centerVertical: js.UndefOr[Boolean] = js.native
  var message: JQuery_[HTMLElement] | js.Array[_] | Element | DocumentFragment | Text | String | (js.Function2[/* index */ Double, /* html */ String, String | Element | JQuery_[HTMLElement]]) = js.native
  var swapButtonOrder: js.UndefOr[Boolean] = js.native
}

object BootboxDialogOptions {
  @scala.inline
  def apply[T](
    message: JQuery_[HTMLElement] | js.Array[_] | Element | DocumentFragment | Text | String | (js.Function2[/* index */ Double, /* html */ String, String | Element | JQuery_[HTMLElement]])
  ): BootboxDialogOptions[T] = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootboxDialogOptions[T]]
  }
  @scala.inline
  implicit class BootboxDialogOptionsOps[Self[t] <: BootboxDialogOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withMessageDocumentFragment(value: DocumentFragment): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(
      value: JQuery_[HTMLElement] | js.Array[_] | Element | DocumentFragment | Text | String | (js.Function2[/* index */ Double, /* html */ String, String | Element | JQuery_[HTMLElement]])
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessageElement(value: Element): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessageText(value: Text): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessageFunction2(value: (/* index */ Double, /* html */ String) => String | Element | JQuery_[HTMLElement]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCenterVertical(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerVertical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCenterVertical: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerVertical")(js.undefined)
        ret
    }
    @scala.inline
    def withSwapButtonOrder(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swapButtonOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwapButtonOrder: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swapButtonOrder")(js.undefined)
        ret
    }
  }
  
}

