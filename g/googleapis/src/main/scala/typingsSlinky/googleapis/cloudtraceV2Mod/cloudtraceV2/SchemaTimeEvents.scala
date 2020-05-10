package typingsSlinky.googleapis.cloudtraceV2Mod.cloudtraceV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A collection of `TimeEvent`s. A `TimeEvent` is a time-stamped annotation on
  * the span, consisting of either user-supplied key:value pairs, or details of
  * a message sent/received between Spans.
  */
@js.native
trait SchemaTimeEvents extends js.Object {
  /**
    * The number of dropped annotations in all the included time events. If the
    * value is 0, then no annotations were dropped.
    */
  var droppedAnnotationsCount: js.UndefOr[Double] = js.native
  /**
    * The number of dropped message events in all the included time events. If
    * the value is 0, then no message events were dropped.
    */
  var droppedMessageEventsCount: js.UndefOr[Double] = js.native
  /**
    * A collection of `TimeEvent`s.
    */
  var timeEvent: js.UndefOr[js.Array[SchemaTimeEvent]] = js.native
}

object SchemaTimeEvents {
  @scala.inline
  def apply(): SchemaTimeEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTimeEvents]
  }
  @scala.inline
  implicit class SchemaTimeEventsOps[Self <: SchemaTimeEvents] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDroppedAnnotationsCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("droppedAnnotationsCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDroppedAnnotationsCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("droppedAnnotationsCount")(js.undefined)
        ret
    }
    @scala.inline
    def withDroppedMessageEventsCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("droppedMessageEventsCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDroppedMessageEventsCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("droppedMessageEventsCount")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeEvent(value: js.Array[SchemaTimeEvent]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeEvent")(js.undefined)
        ret
    }
  }
  
}

