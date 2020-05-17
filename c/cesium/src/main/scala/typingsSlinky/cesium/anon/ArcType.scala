package typingsSlinky.cesium.anon

import typingsSlinky.cesium.mod.Cartesian3
import typingsSlinky.cesium.mod.VertexFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArcType extends js.Object {
  var arcType: js.UndefOr[typingsSlinky.cesium.mod.ArcType] = js.native
  var colors: js.UndefOr[js.Array[typingsSlinky.cesium.mod.Color]] = js.native
  var colorsPerVertex: js.UndefOr[Boolean] = js.native
  var ellipsoid: js.UndefOr[typingsSlinky.cesium.mod.Ellipsoid] = js.native
  var granularity: js.UndefOr[Double] = js.native
  var positions: js.Array[Cartesian3] = js.native
  var vertexFormat: js.UndefOr[VertexFormat] = js.native
  var width: js.UndefOr[Double] = js.native
}

object ArcType {
  @scala.inline
  def apply(positions: js.Array[Cartesian3]): ArcType = {
    val __obj = js.Dynamic.literal(positions = positions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArcType]
  }
  @scala.inline
  implicit class ArcTypeOps[Self <: ArcType] (val x: Self) extends AnyVal {
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
    def withArcType(value: typingsSlinky.cesium.mod.ArcType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arcType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArcType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arcType")(js.undefined)
        ret
    }
    @scala.inline
    def withColors(value: js.Array[typingsSlinky.cesium.mod.Color]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(js.undefined)
        ret
    }
    @scala.inline
    def withColorsPerVertex(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorsPerVertex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorsPerVertex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorsPerVertex")(js.undefined)
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
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

