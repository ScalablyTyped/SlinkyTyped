package typingsSlinky.cesium

import typingsSlinky.cesium.mod.Cartesian3
import typingsSlinky.cesium.mod.Ellipsoid
import typingsSlinky.cesium.mod.Rectangle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHeightmap extends js.Object {
  var ellipsoid: js.UndefOr[Ellipsoid] = js.native
  var height: Double = js.native
  var heightmap: js.typedarray.Int8Array | js.typedarray.Uint8Array | js.typedarray.Int16Array | js.typedarray.Uint16Array | js.typedarray.Float32Array | js.typedarray.Float64Array = js.native
  var isGeographic: js.UndefOr[Boolean] = js.native
  var nativeRectangle: Rectangle = js.native
  var rectangle: js.UndefOr[Rectangle] = js.native
  var relativetoCenter: js.UndefOr[Cartesian3] = js.native
  var skirtHeight: Double = js.native
  var structure: js.UndefOr[js.Any] = js.native
  var structureelementMultiplier: js.UndefOr[Double] = js.native
  var structureelementsPerHeight: js.UndefOr[Double] = js.native
  var structureheightOffset: js.UndefOr[Double] = js.native
  var structureheightScale: js.UndefOr[Double] = js.native
  var structureisBigEndian: js.UndefOr[Boolean] = js.native
  var structurestride: js.UndefOr[Double] = js.native
  var vertices: js.Array[_] | js.typedarray.Float32Array = js.native
  var width: Double = js.native
}

object AnonHeightmap {
  @scala.inline
  def apply(
    height: Double,
    heightmap: js.typedarray.Int8Array | js.typedarray.Uint8Array | js.typedarray.Int16Array | js.typedarray.Uint16Array | js.typedarray.Float32Array | js.typedarray.Float64Array,
    nativeRectangle: Rectangle,
    skirtHeight: Double,
    vertices: js.Array[_] | js.typedarray.Float32Array,
    width: Double
  ): AnonHeightmap = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], heightmap = heightmap.asInstanceOf[js.Any], nativeRectangle = nativeRectangle.asInstanceOf[js.Any], skirtHeight = skirtHeight.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHeightmap]
  }
  @scala.inline
  implicit class AnonHeightmapOps[Self <: AnonHeightmap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeightmapInt8Array(value: js.typedarray.Int8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heightmap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeightmapUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heightmap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeightmapUint16Array(value: js.typedarray.Uint16Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heightmap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeightmapFloat32Array(value: js.typedarray.Float32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heightmap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeightmap(
      value: js.typedarray.Int8Array | js.typedarray.Uint8Array | js.typedarray.Int16Array | js.typedarray.Uint16Array | js.typedarray.Float32Array | js.typedarray.Float64Array
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heightmap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeightmapInt16Array(value: js.typedarray.Int16Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heightmap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeightmapFloat64Array(value: js.typedarray.Float64Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heightmap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNativeRectangle(value: Rectangle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nativeRectangle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSkirtHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skirtHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerticesFloat32Array(value: js.typedarray.Float32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVertices(value: js.Array[_] | js.typedarray.Float32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEllipsoid(value: Ellipsoid): Self = {
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
    def withIsGeographic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isGeographic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsGeographic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isGeographic")(js.undefined)
        ret
    }
    @scala.inline
    def withRectangle(value: Rectangle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rectangle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRectangle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rectangle")(js.undefined)
        ret
    }
    @scala.inline
    def withRelativetoCenter(value: Cartesian3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativetoCenter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelativetoCenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativetoCenter")(js.undefined)
        ret
    }
    @scala.inline
    def withStructure(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("structure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStructure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("structure")(js.undefined)
        ret
    }
    @scala.inline
    def withStructureelementMultiplier(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("structureelementMultiplier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStructureelementMultiplier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("structureelementMultiplier")(js.undefined)
        ret
    }
    @scala.inline
    def withStructureelementsPerHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("structureelementsPerHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStructureelementsPerHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("structureelementsPerHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withStructureheightOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("structureheightOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStructureheightOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("structureheightOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withStructureheightScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("structureheightScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStructureheightScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("structureheightScale")(js.undefined)
        ret
    }
    @scala.inline
    def withStructureisBigEndian(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("structureisBigEndian")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStructureisBigEndian: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("structureisBigEndian")(js.undefined)
        ret
    }
    @scala.inline
    def withStructurestride(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("structurestride")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStructurestride: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("structurestride")(js.undefined)
        ret
    }
  }
  
}

