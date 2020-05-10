package typingsSlinky.cesium

import typingsSlinky.cesium.mod.BoundingSphere
import typingsSlinky.cesium.mod.Cartesian3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBoundingSphere extends js.Object {
  var boundingSphere: BoundingSphere = js.native
  var childTileMask: js.UndefOr[Double] = js.native
  var createdByUpsampling: js.UndefOr[Boolean] = js.native
  var eastIndices: js.Array[Double] = js.native
  var eastSkirtHeight: Double = js.native
  var encodedNormals: js.UndefOr[js.typedarray.Uint8Array] = js.native
  var horizonOcclusionPoint: Cartesian3 = js.native
  var indices: js.typedarray.Uint16Array | js.typedarray.Uint32Array = js.native
  var maximumHeight: Double = js.native
  var minimumHeight: Double = js.native
  var northIndices: js.Array[Double] = js.native
  var northSkirtHeight: Double = js.native
  var quantizedVertices: js.typedarray.Uint16Array = js.native
  var southIndices: js.Array[Double] = js.native
  var southSkirtHeight: Double = js.native
  var waterMask: js.UndefOr[js.typedarray.Uint8Array] = js.native
  var westIndices: js.Array[Double] = js.native
  var westSkirtHeight: Double = js.native
}

object AnonBoundingSphere {
  @scala.inline
  def apply(
    boundingSphere: BoundingSphere,
    eastIndices: js.Array[Double],
    eastSkirtHeight: Double,
    horizonOcclusionPoint: Cartesian3,
    indices: js.typedarray.Uint16Array | js.typedarray.Uint32Array,
    maximumHeight: Double,
    minimumHeight: Double,
    northIndices: js.Array[Double],
    northSkirtHeight: Double,
    quantizedVertices: js.typedarray.Uint16Array,
    southIndices: js.Array[Double],
    southSkirtHeight: Double,
    westIndices: js.Array[Double],
    westSkirtHeight: Double
  ): AnonBoundingSphere = {
    val __obj = js.Dynamic.literal(boundingSphere = boundingSphere.asInstanceOf[js.Any], eastIndices = eastIndices.asInstanceOf[js.Any], eastSkirtHeight = eastSkirtHeight.asInstanceOf[js.Any], horizonOcclusionPoint = horizonOcclusionPoint.asInstanceOf[js.Any], indices = indices.asInstanceOf[js.Any], maximumHeight = maximumHeight.asInstanceOf[js.Any], minimumHeight = minimumHeight.asInstanceOf[js.Any], northIndices = northIndices.asInstanceOf[js.Any], northSkirtHeight = northSkirtHeight.asInstanceOf[js.Any], quantizedVertices = quantizedVertices.asInstanceOf[js.Any], southIndices = southIndices.asInstanceOf[js.Any], southSkirtHeight = southSkirtHeight.asInstanceOf[js.Any], westIndices = westIndices.asInstanceOf[js.Any], westSkirtHeight = westSkirtHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBoundingSphere]
  }
  @scala.inline
  implicit class AnonBoundingSphereOps[Self <: AnonBoundingSphere] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBoundingSphere(value: BoundingSphere): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundingSphere")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEastIndices(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eastIndices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEastSkirtHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eastSkirtHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHorizonOcclusionPoint(value: Cartesian3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizonOcclusionPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndicesUint32Array(value: js.typedarray.Uint32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndicesUint16Array(value: js.typedarray.Uint16Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndices(value: js.typedarray.Uint16Array | js.typedarray.Uint32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaximumHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinimumHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNorthIndices(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("northIndices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNorthSkirtHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("northSkirtHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuantizedVertices(value: js.typedarray.Uint16Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantizedVertices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSouthIndices(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("southIndices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSouthSkirtHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("southSkirtHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWestIndices(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("westIndices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWestSkirtHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("westSkirtHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildTileMask(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childTileMask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildTileMask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childTileMask")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedByUpsampling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdByUpsampling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedByUpsampling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdByUpsampling")(js.undefined)
        ret
    }
    @scala.inline
    def withEncodedNormals(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encodedNormals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncodedNormals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encodedNormals")(js.undefined)
        ret
    }
    @scala.inline
    def withWaterMask(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waterMask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaterMask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waterMask")(js.undefined)
        ret
    }
  }
  
}

