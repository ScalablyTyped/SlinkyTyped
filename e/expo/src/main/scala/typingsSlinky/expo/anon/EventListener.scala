package typingsSlinky.expo.anon

import typingsSlinky.expo.updatesMod.UpdateEvent
import typingsSlinky.expo.updatesMod.UpdateEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventListener extends js.Object {
  var eventListener: js.UndefOr[UpdateEventListener] = js.native
}

object EventListener {
  @scala.inline
  def apply(): EventListener = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventListener]
  }
  @scala.inline
  implicit class EventListenerOps[Self <: EventListener] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEventListener(value: /* event */ UpdateEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventListener")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutEventListener: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventListener")(js.undefined)
        ret
    }
  }
  
}

