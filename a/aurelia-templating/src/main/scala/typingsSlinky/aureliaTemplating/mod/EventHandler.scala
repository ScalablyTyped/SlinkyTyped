package typingsSlinky.aureliaTemplating.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventHandler extends js.Object {
  var bubbles: Boolean = js.native
  var capture: Boolean = js.native
  var dispose: js.Function = js.native
  var eventName: String = js.native
  var handler: js.Function = js.native
}

object EventHandler {
  @scala.inline
  def apply(bubbles: Boolean, capture: Boolean, dispose: js.Function, eventName: String, handler: js.Function): EventHandler = {
    val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], capture = capture.asInstanceOf[js.Any], dispose = dispose.asInstanceOf[js.Any], eventName = eventName.asInstanceOf[js.Any], handler = handler.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventHandler]
  }
  @scala.inline
  implicit class EventHandlerOps[Self <: EventHandler] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBubbles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bubbles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCapture(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDispose(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHandler(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handler")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

