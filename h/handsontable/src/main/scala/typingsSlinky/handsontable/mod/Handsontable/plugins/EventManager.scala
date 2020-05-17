package typingsSlinky.handsontable.mod.Handsontable.plugins

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventManager extends js.Object {
  var context: js.UndefOr[js.Object] = js.native
  def addEventListener(element: Element, eventName: String, callback: js.Function1[/* event */ Event, Unit]): js.Function0[Unit] = js.native
  def clear(): Unit = js.native
  def clearEvents(): Unit = js.native
  def destroy(): Unit = js.native
  def extendEvent(context: js.Object, event: Event): js.Any = js.native
  def fireEvent(element: Element, eventName: String): Unit = js.native
  def removeEventListener(element: Element, eventName: String, callback: js.Function1[/* event */ Event, Unit]): Unit = js.native
}

object EventManager {
  @scala.inline
  def apply(
    addEventListener: (Element, String, js.Function1[/* event */ Event, Unit]) => js.Function0[Unit],
    clear: () => Unit,
    clearEvents: () => Unit,
    destroy: () => Unit,
    extendEvent: (js.Object, Event) => js.Any,
    fireEvent: (Element, String) => Unit,
    removeEventListener: (Element, String, js.Function1[/* event */ Event, Unit]) => Unit
  ): EventManager = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction3(addEventListener), clear = js.Any.fromFunction0(clear), clearEvents = js.Any.fromFunction0(clearEvents), destroy = js.Any.fromFunction0(destroy), extendEvent = js.Any.fromFunction2(extendEvent), fireEvent = js.Any.fromFunction2(fireEvent), removeEventListener = js.Any.fromFunction3(removeEventListener))
    __obj.asInstanceOf[EventManager]
  }
  @scala.inline
  implicit class EventManagerOps[Self <: EventManager] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddEventListener(value: (Element, String, js.Function1[/* event */ Event, Unit]) => js.Function0[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addEventListener")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withClear(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withClearEvents(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearEvents")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withExtendEvent(value: (js.Object, Event) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extendEvent")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withFireEvent(value: (Element, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fireEvent")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRemoveEventListener(value: (Element, String, js.Function1[/* event */ Event, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeEventListener")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withContext(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
  }
  
}

