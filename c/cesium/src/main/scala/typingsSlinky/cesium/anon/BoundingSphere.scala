package typingsSlinky.cesium.anon

import typingsSlinky.cesium.mod.Cartesian3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoundingSphere extends js.Object {
  var boundingSphere: typingsSlinky.cesium.mod.BoundingSphere
  var childTileMask: js.UndefOr[Double] = js.undefined
  var createdByUpsampling: js.UndefOr[Boolean] = js.undefined
  var eastIndices: js.Array[Double]
  var eastSkirtHeight: Double
  var encodedNormals: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
  var horizonOcclusionPoint: Cartesian3
  var indices: js.typedarray.Uint16Array | js.typedarray.Uint32Array
  var maximumHeight: Double
  var minimumHeight: Double
  var northIndices: js.Array[Double]
  var northSkirtHeight: Double
  var quantizedVertices: js.typedarray.Uint16Array
  var southIndices: js.Array[Double]
  var southSkirtHeight: Double
  var waterMask: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
  var westIndices: js.Array[Double]
  var westSkirtHeight: Double
}

object BoundingSphere {
  @scala.inline
  def apply(
    boundingSphere: typingsSlinky.cesium.mod.BoundingSphere,
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
    westSkirtHeight: Double,
    childTileMask: js.UndefOr[Double] = js.undefined,
    createdByUpsampling: js.UndefOr[Boolean] = js.undefined,
    encodedNormals: js.typedarray.Uint8Array = null,
    waterMask: js.typedarray.Uint8Array = null
  ): BoundingSphere = {
    val __obj = js.Dynamic.literal(boundingSphere = boundingSphere.asInstanceOf[js.Any], eastIndices = eastIndices.asInstanceOf[js.Any], eastSkirtHeight = eastSkirtHeight.asInstanceOf[js.Any], horizonOcclusionPoint = horizonOcclusionPoint.asInstanceOf[js.Any], indices = indices.asInstanceOf[js.Any], maximumHeight = maximumHeight.asInstanceOf[js.Any], minimumHeight = minimumHeight.asInstanceOf[js.Any], northIndices = northIndices.asInstanceOf[js.Any], northSkirtHeight = northSkirtHeight.asInstanceOf[js.Any], quantizedVertices = quantizedVertices.asInstanceOf[js.Any], southIndices = southIndices.asInstanceOf[js.Any], southSkirtHeight = southSkirtHeight.asInstanceOf[js.Any], westIndices = westIndices.asInstanceOf[js.Any], westSkirtHeight = westSkirtHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(childTileMask)) __obj.updateDynamic("childTileMask")(childTileMask.get.asInstanceOf[js.Any])
    if (!js.isUndefined(createdByUpsampling)) __obj.updateDynamic("createdByUpsampling")(createdByUpsampling.get.asInstanceOf[js.Any])
    if (encodedNormals != null) __obj.updateDynamic("encodedNormals")(encodedNormals.asInstanceOf[js.Any])
    if (waterMask != null) __obj.updateDynamic("waterMask")(waterMask.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoundingSphere]
  }
}

