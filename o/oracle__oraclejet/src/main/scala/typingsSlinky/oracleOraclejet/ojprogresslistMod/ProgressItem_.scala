package typingsSlinky.oracleOraclejet.ojprogresslistMod

import typingsSlinky.oracleOraclejet.ojprogresslistMod.ProgressItem.EventType
import typingsSlinky.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProgressItem_ extends js.Object {
  def addEventListener(eventType: EventType, listener: EventListener): Unit = js.native
  def removeEventListener(eventType: EventType, listener: EventListener): Unit = js.native
}

object ProgressItem_ {
  @scala.inline
  def apply(
    addEventListener: (EventType, EventListener) => Unit,
    removeEventListener: (EventType, EventListener) => Unit
  ): ProgressItem_ = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), removeEventListener = js.Any.fromFunction2(removeEventListener))
    __obj.asInstanceOf[ProgressItem_]
  }
  @scala.inline
  implicit class ProgressItem_Ops[Self <: ProgressItem_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddEventListener(value: (EventType, EventListener) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addEventListener")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRemoveEventListener(value: (EventType, EventListener) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeEventListener")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

