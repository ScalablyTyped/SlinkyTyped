package typingsSlinky.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventTarget extends js.Object {
  def addEventListener(`type`: String, listener: js.Function): EventTarget = js.native
  def dispatchEvent(event: IEvent): IEvent = js.native
  def hasEventListener(`type`: String, listener: js.Function): Boolean = js.native
  def removeEventListener(`type`: String, listener: js.Function): EventTarget = js.native
}

object EventTarget {
  @scala.inline
  def apply(
    addEventListener: (String, js.Function) => EventTarget,
    dispatchEvent: IEvent => IEvent,
    hasEventListener: (String, js.Function) => Boolean,
    removeEventListener: (String, js.Function) => EventTarget
  ): EventTarget = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), dispatchEvent = js.Any.fromFunction1(dispatchEvent), hasEventListener = js.Any.fromFunction2(hasEventListener), removeEventListener = js.Any.fromFunction2(removeEventListener))
    __obj.asInstanceOf[EventTarget]
  }
  @scala.inline
  implicit class EventTargetOps[Self <: EventTarget] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddEventListener(value: (String, js.Function) => EventTarget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addEventListener")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDispatchEvent(value: IEvent => IEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispatchEvent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHasEventListener(value: (String, js.Function) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasEventListener")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRemoveEventListener(value: (String, js.Function) => EventTarget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeEventListener")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

