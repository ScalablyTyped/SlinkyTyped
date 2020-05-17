package typingsSlinky.cesium.anon

import typingsSlinky.cesium.mod.Cartesian3
import typingsSlinky.cesium.mod.VertexFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CornerType extends js.Object {
  var cornerType: js.UndefOr[typingsSlinky.cesium.mod.CornerType] = js.native
  var ellipsoid: js.UndefOr[typingsSlinky.cesium.mod.Ellipsoid] = js.native
  var extrudedHeight: js.UndefOr[Double] = js.native
  var granularity: js.UndefOr[Double] = js.native
  var height: js.UndefOr[Double] = js.native
  var positions: js.Array[Cartesian3] = js.native
  var vertexFormat: js.UndefOr[VertexFormat] = js.native
  var width: Double = js.native
}

object CornerType {
  @scala.inline
  def apply(positions: js.Array[Cartesian3], width: Double): CornerType = {
    val __obj = js.Dynamic.literal(positions = positions.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[CornerType]
  }
  @scala.inline
  implicit class CornerTypeOps[Self <: CornerType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPositions(value: js.Array[Cartesian3]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCornerType(value: typingsSlinky.cesium.mod.CornerType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cornerType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCornerType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cornerType")(js.undefined)
        ret
    }
    @scala.inline
    def withEllipsoid(value: typingsSlinky.cesium.mod.Ellipsoid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ellipsoid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEllipsoid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ellipsoid")(js.undefined)
        ret
    }
    @scala.inline
    def withExtrudedHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extrudedHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtrudedHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extrudedHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withGranularity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("granularity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGranularity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("granularity")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
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

