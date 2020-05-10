package typingsSlinky.gapiClientCloudtrace.gapi.client.cloudtrace

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeEvents extends js.Object {
  /**
    * The number of dropped annotations in all the included time events.
    * If the value is 0, then no annotations were dropped.
    */
  var droppedAnnotationsCount: js.UndefOr[Double] = js.native
  /**
    * The number of dropped network events in all the included time events.
    * If the value is 0, then no network events were dropped.
    */
  var droppedNetworkEventsCount: js.UndefOr[Double] = js.native
  /** A collection of `TimeEvent`s. */
  var timeEvent: js.UndefOr[js.Array[TimeEvent]] = js.native
}

object TimeEvents {
  @scala.inline
  def apply(): TimeEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeEvents]
  }
  @scala.inline
  implicit class TimeEventsOps[Self <: TimeEvents] (val x: Self) extends AnyVal {
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
    def withDroppedNetworkEventsCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("droppedNetworkEventsCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDroppedNetworkEventsCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("droppedNetworkEventsCount")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeEvent(value: js.Array[TimeEvent]): Self = {
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

