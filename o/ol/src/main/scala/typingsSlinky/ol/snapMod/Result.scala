package typingsSlinky.ol.snapMod

import typingsSlinky.ol.coordinateMod.Coordinate
import typingsSlinky.ol.pixelMod.Pixel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Result extends js.Object {
  var snapped: Boolean = js.native
  var vertex: Coordinate = js.native
  var vertexPixel: Pixel = js.native
}

object Result {
  @scala.inline
  def apply(snapped: Boolean, vertex: Coordinate, vertexPixel: Pixel): Result = {
    val __obj = js.Dynamic.literal(snapped = snapped.asInstanceOf[js.Any], vertex = vertex.asInstanceOf[js.Any], vertexPixel = vertexPixel.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
  @scala.inline
  implicit class ResultOps[Self <: Result] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSnapped(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVertex(value: Coordinate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVertexPixel(value: Pixel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertexPixel")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

