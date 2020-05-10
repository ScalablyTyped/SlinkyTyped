package typingsSlinky.reactNativeMaps

import typingsSlinky.reactNativeMaps.mod.KmlMarker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMarkers extends js.Object {
  var markers: js.Array[KmlMarker] = js.native
}

object AnonMarkers {
  @scala.inline
  def apply(markers: js.Array[KmlMarker]): AnonMarkers = {
    val __obj = js.Dynamic.literal(markers = markers.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMarkers]
  }
  @scala.inline
  implicit class AnonMarkersOps[Self <: AnonMarkers] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMarkers(value: js.Array[KmlMarker]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markers")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

