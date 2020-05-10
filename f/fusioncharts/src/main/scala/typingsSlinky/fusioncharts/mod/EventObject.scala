package typingsSlinky.fusioncharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventObject extends js.Object {
  var cancelled: Boolean = js.native
  var detached: Boolean = js.native
  var eventId: Double = js.native
  var prevented: Boolean = js.native
  var sender: FusionCharts = js.native
  var `type`: String = js.native
  def detachHandler(): Unit = js.native
  def preventDefault(): Unit = js.native
  def stopPropagation(): Unit = js.native
}

object EventObject {
  @scala.inline
  def apply(
    cancelled: Boolean,
    detachHandler: () => Unit,
    detached: Boolean,
    eventId: Double,
    preventDefault: () => Unit,
    prevented: Boolean,
    sender: FusionCharts,
    stopPropagation: () => Unit,
    `type`: String
  ): EventObject = {
    val __obj = js.Dynamic.literal(cancelled = cancelled.asInstanceOf[js.Any], detachHandler = js.Any.fromFunction0(detachHandler), detached = detached.asInstanceOf[js.Any], eventId = eventId.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), prevented = prevented.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], stopPropagation = js.Any.fromFunction0(stopPropagation))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventObject]
  }
  @scala.inline
  implicit class EventObjectOps[Self <: EventObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancelled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDetachHandler(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detachHandler")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDetached(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detached")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreventDefault(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDefault")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPrevented(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevented")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSender(value: FusionCharts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStopPropagation(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopPropagation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

