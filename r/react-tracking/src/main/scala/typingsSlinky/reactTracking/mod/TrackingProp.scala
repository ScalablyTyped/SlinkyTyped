package typingsSlinky.reactTracking.mod

import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrackingProp[P] extends js.Object {
  /**
    * This method returns all of the contextual tracking data up until this point in the component hierarchy.
    */
  def getTrackingData(): js.Object = js.native
  def trackEvent(data: Partial[P]): js.Any = js.native
}

object TrackingProp {
  @scala.inline
  def apply[P](getTrackingData: () => js.Object, trackEvent: Partial[P] => js.Any): TrackingProp[P] = {
    val __obj = js.Dynamic.literal(getTrackingData = js.Any.fromFunction0(getTrackingData), trackEvent = js.Any.fromFunction1(trackEvent))
    __obj.asInstanceOf[TrackingProp[P]]
  }
  @scala.inline
  implicit class TrackingPropOps[Self[p] <: TrackingProp[p], P] (val x: Self[P]) extends AnyVal {
    @scala.inline
    def duplicate: Self[P] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[P]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[P] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[P] with Other]
    @scala.inline
    def withGetTrackingData(value: () => js.Object): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTrackingData")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTrackEvent(value: Partial[P] => js.Any): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackEvent")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

