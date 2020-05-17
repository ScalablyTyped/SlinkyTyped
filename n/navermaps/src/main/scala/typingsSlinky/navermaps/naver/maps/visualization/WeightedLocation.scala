package typingsSlinky.navermaps.naver.maps.visualization

import typingsSlinky.navermaps.naver.maps.LatLng
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WeightedLocation extends js.Object {
  def getLocation(): LatLng = js.native
  def getWeight(): Double = js.native
  def lat(): Double = js.native
  def lng(): Double = js.native
}

object WeightedLocation {
  @scala.inline
  def apply(getLocation: () => LatLng, getWeight: () => Double, lat: () => Double, lng: () => Double): WeightedLocation = {
    val __obj = js.Dynamic.literal(getLocation = js.Any.fromFunction0(getLocation), getWeight = js.Any.fromFunction0(getWeight), lat = js.Any.fromFunction0(lat), lng = js.Any.fromFunction0(lng))
    __obj.asInstanceOf[WeightedLocation]
  }
  @scala.inline
  implicit class WeightedLocationOps[Self <: WeightedLocation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetLocation(value: () => LatLng): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLocation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetWeight(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWeight")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLat(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lat")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLng(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lng")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

