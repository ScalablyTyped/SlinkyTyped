package typingsSlinky.kendoUi.kendo.dataviz.map

import typingsSlinky.kendoUi.kendo.Class
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Location extends Class {
  var lat: Double = js.native
  var lng: Double = js.native
  var options: LocationOptions = js.native
  def destination(destination: Location, bearing: Double): Double = js.native
  def distanceTo(distance: Double, bearing: Double): Location = js.native
  def equals(location: Location): Boolean = js.native
  def round(digits: Double): Location = js.native
  def toArray(): js.Any = js.native
  def wrap(): Location = js.native
}

object Location {
  @scala.inline
  def apply(
    destination: (Location, Double) => Double,
    distanceTo: (Double, Double) => Location,
    equals: Location => Boolean,
    lat: Double,
    lng: Double,
    options: LocationOptions,
    round: Double => Location,
    toArray: () => js.Any,
    wrap: () => Location
  ): Location = {
    val __obj = js.Dynamic.literal(destination = js.Any.fromFunction2(destination), distanceTo = js.Any.fromFunction2(distanceTo), equals = js.Any.fromFunction1(equals), lat = lat.asInstanceOf[js.Any], lng = lng.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], round = js.Any.fromFunction1(round), toArray = js.Any.fromFunction0(toArray), wrap = js.Any.fromFunction0(wrap))
    __obj.asInstanceOf[Location]
  }
  @scala.inline
  implicit class LocationOps[Self <: Location] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestination(value: (Location, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDistanceTo(value: (Double, Double) => Location): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distanceTo")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withEquals(value: Location => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equals")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLat(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLng(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lng")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: LocationOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRound(value: Double => Location): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("round")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withToArray(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toArray")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withWrap(value: () => Location): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrap")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

