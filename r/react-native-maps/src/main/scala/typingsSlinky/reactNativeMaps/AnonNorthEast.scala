package typingsSlinky.reactNativeMaps

import typingsSlinky.reactNativeMaps.mod.LatLng
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonNorthEast extends js.Object {
  var northEast: LatLng = js.native
  var southWest: LatLng = js.native
}

object AnonNorthEast {
  @scala.inline
  def apply(northEast: LatLng, southWest: LatLng): AnonNorthEast = {
    val __obj = js.Dynamic.literal(northEast = northEast.asInstanceOf[js.Any], southWest = southWest.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNorthEast]
  }
  @scala.inline
  implicit class AnonNorthEastOps[Self <: AnonNorthEast] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNorthEast(value: LatLng): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("northEast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSouthWest(value: LatLng): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("southWest")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

