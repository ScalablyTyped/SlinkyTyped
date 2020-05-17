package typingsSlinky.jsoneditoronline.anon

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddEventListener extends js.Object {
  def addEventListener(
    element: HTMLElement,
    action: String,
    listener: js.Function1[/* event */ js.UndefOr[Event], Unit],
    useCapture: Boolean
  ): js.Function1[/* event */ js.UndefOr[Event], Unit] = js.native
  def preventDefault(event: Event): Unit = js.native
  def removeEventListener(
    element: HTMLElement,
    action: String,
    listener: js.Function1[/* event */ js.UndefOr[Event], Unit],
    useCapture: Boolean
  ): Unit = js.native
  def stopPropagation(event: Event): Unit = js.native
}

object AddEventListener {
  @scala.inline
  def apply(
    addEventListener: (HTMLElement, String, js.Function1[/* event */ js.UndefOr[Event], Unit], Boolean) => js.Function1[/* event */ js.UndefOr[Event], Unit],
    preventDefault: Event => Unit,
    removeEventListener: (HTMLElement, String, js.Function1[/* event */ js.UndefOr[Event], Unit], Boolean) => Unit,
    stopPropagation: Event => Unit
  ): AddEventListener = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction4(addEventListener), preventDefault = js.Any.fromFunction1(preventDefault), removeEventListener = js.Any.fromFunction4(removeEventListener), stopPropagation = js.Any.fromFunction1(stopPropagation))
    __obj.asInstanceOf[AddEventListener]
  }
  @scala.inline
  implicit class AddEventListenerOps[Self <: AddEventListener] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddEventListener(
      value: (HTMLElement, String, js.Function1[/* event */ js.UndefOr[Event], Unit], Boolean) => js.Function1[/* event */ js.UndefOr[Event], Unit]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addEventListener")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withPreventDefault(value: Event => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDefault")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveEventListener(value: (HTMLElement, String, js.Function1[/* event */ js.UndefOr[Event], Unit], Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeEventListener")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withStopPropagation(value: Event => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopPropagation")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

