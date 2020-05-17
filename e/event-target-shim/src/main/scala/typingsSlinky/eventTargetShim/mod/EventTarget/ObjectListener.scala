package typingsSlinky.eventTargetShim.mod.EventTarget

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectListener[TEvent] extends Listener[TEvent] {
  def handleEvent(event: TEvent): Unit = js.native
}

object ObjectListener {
  @scala.inline
  def apply[TEvent](handleEvent: TEvent => Unit): ObjectListener[TEvent] = {
    val __obj = js.Dynamic.literal(handleEvent = js.Any.fromFunction1(handleEvent))
    __obj.asInstanceOf[ObjectListener[TEvent]]
  }
  @scala.inline
  implicit class ObjectListenerOps[Self[tevent] <: ObjectListener[tevent], TEvent] (val x: Self[TEvent]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TEvent] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TEvent]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TEvent] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TEvent] with Other]
    @scala.inline
    def withHandleEvent(value: TEvent => Unit): Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleEvent")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

