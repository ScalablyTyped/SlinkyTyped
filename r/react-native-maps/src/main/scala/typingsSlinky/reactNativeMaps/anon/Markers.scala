package typingsSlinky.reactNativeMaps.anon

import typingsSlinky.reactNativeMaps.mod.KmlMarker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Markers extends js.Object {
  var markers: js.Array[KmlMarker] = js.native
}

object Markers {
  @scala.inline
  def apply(markers: js.Array[KmlMarker]): Markers = {
    val __obj = js.Dynamic.literal(markers = markers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Markers]
  }
  @scala.inline
  implicit class MarkersOps[Self <: Markers] (val x: Self) extends AnyVal {
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

