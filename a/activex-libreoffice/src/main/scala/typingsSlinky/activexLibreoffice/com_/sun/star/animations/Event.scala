package typingsSlinky.activexLibreoffice.com_.sun.star.animations

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * an event has a source that causes an event to be fired and a trigger that defines under which condition an event should be raised and an offset if the
  * event should be raised a defined amount of time after the event is triggered.
  */
@js.native
trait Event extends js.Object {
  /** an optional offset in seconds or Timing::INDEFINITE. This is the timespan between the triggering of the event and actually raising the event */
  var Offset: js.Any = js.native
  /** an option repeat value. If the {@link Trigger} is {@link EventTrigger} , this is the number of repeats after which the event is initially raised. */
  var Repeat: Double = js.native
  /** this is the source for this event. */
  var Source: js.Any = js.native
  /** this is the trigger that fires this event. */
  var Trigger: Double = js.native
}

object Event {
  @scala.inline
  def apply(Offset: js.Any, Repeat: Double, Source: js.Any, Trigger: Double): Event = {
    val __obj = js.Dynamic.literal(Offset = Offset.asInstanceOf[js.Any], Repeat = Repeat.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any], Trigger = Trigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  @scala.inline
  implicit class EventOps[Self <: Event] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOffset(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepeat(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Repeat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrigger(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Trigger")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

