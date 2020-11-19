package typingsSlinky.cesium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "TerrainMesh")
@js.native
class TerrainMesh protected () extends js.Object {
  def this(
    center: Cartesian3,
    vertices: js.typedarray.Float32Array,
    indices: js.typedarray.Uint16Array,
    minimumHeight: Double,
    maximumHeight: Double,
    boundingSphere3D: BoundingSphere,
    occludeePointInScaledSpace: Cartesian3
  ) = this()
  def this(
    center: Cartesian3,
    vertices: js.typedarray.Float32Array,
    indices: js.typedarray.Uint32Array,
    minimumHeight: Double,
    maximumHeight: Double,
    boundingSphere3D: BoundingSphere,
    occludeePointInScaledSpace: Cartesian3
  ) = this()
  def this(
    center: Cartesian3,
    vertices: js.typedarray.Float32Array,
    indices: js.typedarray.Uint16Array,
    minimumHeight: Double,
    maximumHeight: Double,
    boundingSphere3D: BoundingSphere,
    occludeePointInScaledSpace: Cartesian3,
    vertexStride: Double
  ) = this()
  def this(
    center: Cartesian3,
    vertices: js.typedarray.Float32Array,
    indices: js.typedarray.Uint32Array,
    minimumHeight: Double,
    maximumHeight: Double,
    boundingSphere3D: BoundingSphere,
    occludeePointInScaledSpace: Cartesian3,
    vertexStride: Double
  ) = this()
  
  var boundingSphere3D: BoundingSphere = js.native
  
  var center: Cartesian3 = js.native
  
  var indices: js.typedarray.Uint16Array | js.typedarray.Uint32Array = js.native
  
  var maximumHeight: Double = js.native
  
  var minimumHeight: Double = js.native
  
  var occludeePointInScaledSpace: Cartesian3 = js.native
  
  var stride: Double = js.native
  
  var vertices: js.typedarray.Float32Array = js.native
}
