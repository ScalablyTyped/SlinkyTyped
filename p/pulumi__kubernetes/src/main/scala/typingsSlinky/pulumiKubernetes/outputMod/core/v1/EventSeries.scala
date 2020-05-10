package typingsSlinky.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * EventSeries contain information on series of events, i.e. thing that was/is happening
  * continuously for some time.
  */
@js.native
trait EventSeries extends js.Object {
  /**
    * Number of occurrences in this series up to the last heartbeat time
    */
  val count: Double = js.native
  /**
    * Time of the last occurrence observed
    */
  val lastObservedTime: String = js.native
  /**
    * State of this Series: Ongoing or Finished Deprecated. Planned removal for 1.18
    */
  val state: String = js.native
}

object EventSeries {
  @scala.inline
  def apply(count: Double, lastObservedTime: String, state: String): EventSeries = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], lastObservedTime = lastObservedTime.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventSeries]
  }
  @scala.inline
  implicit class EventSeriesOps[Self <: EventSeries] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastObservedTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastObservedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

