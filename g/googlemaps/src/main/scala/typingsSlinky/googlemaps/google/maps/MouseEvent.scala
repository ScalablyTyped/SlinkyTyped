package typingsSlinky.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This object is returned from various mouse events on the map and overlays,
  * and contains all the fields shown below.
  */
@js.native
trait MouseEvent extends js.Object {
  /**
    * The latitude/longitude that was below the cursor when the event
    * occurred.
    */
  var latLng: LatLng = js.native
  /** Prevents this event from propagating further. */
  def stop(): Unit = js.native
}

object MouseEvent {
  @scala.inline
  def apply(latLng: LatLng, stop: () => Unit): MouseEvent = {
    val __obj = js.Dynamic.literal(latLng = latLng.asInstanceOf[js.Any], stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[MouseEvent]
  }
  @scala.inline
  implicit class MouseEventOps[Self <: MouseEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLatLng(value: LatLng): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latLng")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStop(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

