package typingsSlinky.googlemaps.google.maps

import typingsSlinky.googlemaps.googlemapsStrings.circle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MarkerShapeCircle extends MarkerShape {
  /**
    * Coords is **[x1,y1,r]** where x1,y2 are the coordinates of the center of
    * the circle, and r is the radius of the circle.
    */
  var coords: js.Tuple3[Double, Double, Double] = js.native
  var `type`: circle = js.native
}

object MarkerShapeCircle {
  @scala.inline
  def apply(coords: js.Tuple3[Double, Double, Double], `type`: circle): MarkerShapeCircle = {
    val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerShapeCircle]
  }
  @scala.inline
  implicit class MarkerShapeCircleOps[Self <: MarkerShapeCircle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCoords(value: js.Tuple3[Double, Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: circle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

