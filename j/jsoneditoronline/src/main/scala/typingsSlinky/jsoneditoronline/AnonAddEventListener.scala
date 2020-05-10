package typingsSlinky.jsoneditoronline

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAddEventListener extends js.Object {
  def addEventListener(
    element: HTMLElement,
    action: String,
    listener: js.Function1[/* event */ js.UndefOr[Event_], Unit],
    useCapture: Boolean
  ): js.Function1[/* event */ js.UndefOr[Event_], Unit] = js.native
  def preventDefault(event: Event_): Unit = js.native
  def removeEventListener(
    element: HTMLElement,
    action: String,
    listener: js.Function1[/* event */ js.UndefOr[Event_], Unit],
    useCapture: Boolean
  ): Unit = js.native
  def stopPropagation(event: Event_): Unit = js.native
}

object AnonAddEventListener {
  @scala.inline
  def apply(
    addEventListener: (HTMLElement, String, js.Function1[/* event */ js.UndefOr[Event_], Unit], Boolean) => js.Function1[/* event */ js.UndefOr[Event_], Unit],
    preventDefault: Event_ => Unit,
    removeEventListener: (HTMLElement, String, js.Function1[/* event */ js.UndefOr[Event_], Unit], Boolean) => Unit,
    stopPropagation: Event_ => Unit
  ): AnonAddEventListener = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction4(addEventListener), preventDefault = js.Any.fromFunction1(preventDefault), removeEventListener = js.Any.fromFunction4(removeEventListener), stopPropagation = js.Any.fromFunction1(stopPropagation))
    __obj.asInstanceOf[AnonAddEventListener]
  }
  @scala.inline
  implicit class AnonAddEventListenerOps[Self <: AnonAddEventListener] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddEventListener(
      value: (HTMLElement, String, js.Function1[/* event */ js.UndefOr[Event_], Unit], Boolean) => js.Function1[/* event */ js.UndefOr[Event_], Unit]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addEventListener")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withPreventDefault(value: Event_ => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDefault")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveEventListener(value: (HTMLElement, String, js.Function1[/* event */ js.UndefOr[Event_], Unit], Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeEventListener")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withStopPropagation(value: Event_ => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopPropagation")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

