package typingsSlinky.googlemaps.google.maps

import typingsSlinky.googlemaps.googlemapsStrings.rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MarkerShapeRect extends MarkerShape {
  /**
    * Coords is **[x1,y1,x2,y2]** where x1,y1 are the coordinates of the
    * upper-left corner of the rectangle and x2,y2 are the coordinates of the
    * lower-right coordinates of the rectangle.
    */
  var coords: js.Tuple4[Double, Double, Double, Double] = js.native
  var `type`: rect = js.native
}

object MarkerShapeRect {
  @scala.inline
  def apply(coords: js.Tuple4[Double, Double, Double, Double], `type`: rect): MarkerShapeRect = {
    val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerShapeRect]
  }
  @scala.inline
  implicit class MarkerShapeRectOps[Self <: MarkerShapeRect] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCoords(value: js.Tuple4[Double, Double, Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: rect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

