package typingsSlinky.cesium.anon

import typingsSlinky.cesium.mod.VertexFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BottomRadius extends js.Object {
  var bottomRadius: Double = js.native
  var length: Double = js.native
  var slices: js.UndefOr[Double] = js.native
  var topRadius: Double = js.native
  var vertexFormat: js.UndefOr[VertexFormat] = js.native
}

object BottomRadius {
  @scala.inline
  def apply(bottomRadius: Double, length: Double, topRadius: Double): BottomRadius = {
    val __obj = js.Dynamic.literal(bottomRadius = bottomRadius.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], topRadius = topRadius.asInstanceOf[js.Any])
    __obj.asInstanceOf[BottomRadius]
  }
  @scala.inline
  implicit class BottomRadiusOps[Self <: BottomRadius] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBottomRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTopRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlices(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slices")(js.undefined)
        ret
    }
    @scala.inline
    def withVertexFormat(value: VertexFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertexFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVertexFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertexFormat")(js.undefined)
        ret
    }
  }
  
}

