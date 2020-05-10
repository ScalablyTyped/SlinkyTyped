package typingsSlinky.juiCore.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.jquery.JQuery_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UIEvent extends UICore {
  /**
    * Get the child element of the root element
    */
  def find(selector: js.Any): JQuery_[HTMLElement] = js.native
}

object UIEvent {
  @scala.inline
  def apply(
    addValid: (String, js.Array[_]) => Unit,
    callAfter: (String, js.Function0[Unit]) => Unit,
    callBefore: (String, js.Function0[Unit]) => Unit,
    callDelay: (String, js.Function0[Unit]) => Unit,
    destroy: () => Unit,
    emit: (String, js.Function0[Unit]) => js.Any,
    find: js.Any => JQuery_[HTMLElement],
    off: String => Unit,
    on: (String, js.Function0[Unit]) => Unit,
    setOption: (String, js.Any) => Unit,
    setTpl: (String, String) => Unit
  ): UIEvent = {
    val __obj = js.Dynamic.literal(addValid = js.Any.fromFunction2(addValid), callAfter = js.Any.fromFunction2(callAfter), callBefore = js.Any.fromFunction2(callBefore), callDelay = js.Any.fromFunction2(callDelay), destroy = js.Any.fromFunction0(destroy), emit = js.Any.fromFunction2(emit), find = js.Any.fromFunction1(find), off = js.Any.fromFunction1(off), on = js.Any.fromFunction2(on), setOption = js.Any.fromFunction2(setOption), setTpl = js.Any.fromFunction2(setTpl))
    __obj.asInstanceOf[UIEvent]
  }
  @scala.inline
  implicit class UIEventOps[Self <: UIEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFind(value: js.Any => JQuery_[HTMLElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("find")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

