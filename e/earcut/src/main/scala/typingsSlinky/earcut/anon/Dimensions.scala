package typingsSlinky.earcut.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dimensions extends js.Object {
  var dimensions: Double = js.native
  var holes: js.Array[Double] = js.native
  var vertices: js.Array[Double] = js.native
}

object Dimensions {
  @scala.inline
  def apply(dimensions: Double, holes: js.Array[Double], vertices: js.Array[Double]): Dimensions = {
    val __obj = js.Dynamic.literal(dimensions = dimensions.asInstanceOf[js.Any], holes = holes.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dimensions]
  }
  @scala.inline
  implicit class DimensionsOps[Self <: Dimensions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDimensions(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHoles(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("holes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVertices(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertices")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

