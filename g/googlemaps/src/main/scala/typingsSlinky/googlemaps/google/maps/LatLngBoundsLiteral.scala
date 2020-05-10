package typingsSlinky.googlemaps.google.maps

import typingsSlinky.googlemaps.google.maps.places._LocationBias
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LatLngBoundsLiteral extends _LocationBias {
  var east: Double = js.native
  var north: Double = js.native
  var south: Double = js.native
  var west: Double = js.native
}

object LatLngBoundsLiteral {
  @scala.inline
  def apply(east: Double, north: Double, south: Double, west: Double): LatLngBoundsLiteral = {
    val __obj = js.Dynamic.literal(east = east.asInstanceOf[js.Any], north = north.asInstanceOf[js.Any], south = south.asInstanceOf[js.Any], west = west.asInstanceOf[js.Any])
    __obj.asInstanceOf[LatLngBoundsLiteral]
  }
  @scala.inline
  implicit class LatLngBoundsLiteralOps[Self <: LatLngBoundsLiteral] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEast(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("east")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNorth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("north")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSouth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("south")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWest(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("west")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

