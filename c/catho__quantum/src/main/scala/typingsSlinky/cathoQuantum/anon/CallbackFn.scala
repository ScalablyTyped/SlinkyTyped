package typingsSlinky.cathoQuantum.anon

import org.scalajs.dom.raw.HTMLButtonElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CallbackFn extends js.Object {
  var callbackFn: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.native
  var title: js.UndefOr[String] = js.native
}

object CallbackFn {
  @scala.inline
  def apply(): CallbackFn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallbackFn]
  }
  @scala.inline
  implicit class CallbackFnOps[Self <: CallbackFn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallbackFn(value: SyntheticMouseEvent[HTMLButtonElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbackFn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCallbackFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbackFn")(js.undefined)
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

