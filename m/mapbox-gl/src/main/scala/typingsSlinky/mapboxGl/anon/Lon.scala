package typingsSlinky.mapboxGl.anon

import typingsSlinky.mapboxGl.mod.LngLatLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Lon extends LngLatLike {
  var lat: Double = js.native
  var lon: Double = js.native
}

object Lon {
  @scala.inline
  def apply(lat: Double, lon: Double): Lon = {
    val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any], lon = lon.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lon]
  }
  @scala.inline
  implicit class LonOps[Self <: Lon] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLat(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLon(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lon")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

