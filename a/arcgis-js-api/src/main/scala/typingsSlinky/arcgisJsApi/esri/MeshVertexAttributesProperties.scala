package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MeshVertexAttributesProperties extends Object {
  /**
    * **Since: 4.9**    A flat array of the vertex colors (4 elements per vertex ranging from 0 to 255). Vertex colors are multiplied by the component material color (if any is defined).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#vertexAttributes)
    */
  var color: js.UndefOr[
    scala.scalajs.js.typedarray.Uint8Array | js.Array[Double] | scala.scalajs.js.typedarray.Uint8ClampedArray
  ] = js.undefined
  /**
    * A flat array of the vertex normals (3 elements per vertex ranging from -1 to 1).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#vertexAttributes)
    */
  var normal: js.UndefOr[
    scala.scalajs.js.typedarray.Float32Array | js.Array[Double] | scala.scalajs.js.typedarray.Float64Array
  ] = js.undefined
  /**
    * A flat array of vertex positions. Vertex positions have x, y and z coordinates and they should be in the spatial reference system of the geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#vertexAttributes)
    */
  var position: js.UndefOr[
    scala.scalajs.js.typedarray.Float64Array | js.Array[Double] | scala.scalajs.js.typedarray.Float32Array
  ] = js.undefined
  /**
    * **Since: 4.11**    A flat array of the vertex tangents (4 elements per vertex ranging from -1 to 1. The 4th element is a sign value (-1 or +1) indicating handedness of the tangent basis). Vertex tangents are used for normal mapping, see [MeshMaterial.normalTexture](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterial.html#normalTexture).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#vertexAttributes)
    */
  var tangent: js.UndefOr[
    scala.scalajs.js.typedarray.Float32Array | js.Array[Double] | scala.scalajs.js.typedarray.Float64Array
  ] = js.undefined
  /**
    * A flat array of vertex uv coordinates (2 elements per vertex).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#vertexAttributes)
    */
  var uv: js.UndefOr[
    scala.scalajs.js.typedarray.Float32Array | js.Array[Double] | scala.scalajs.js.typedarray.Float64Array
  ] = js.undefined
}

object MeshVertexAttributesProperties {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    color: scala.scalajs.js.typedarray.Uint8Array | js.Array[Double] | scala.scalajs.js.typedarray.Uint8ClampedArray = null,
    normal: scala.scalajs.js.typedarray.Float32Array | js.Array[Double] | scala.scalajs.js.typedarray.Float64Array = null,
    position: scala.scalajs.js.typedarray.Float64Array | js.Array[Double] | scala.scalajs.js.typedarray.Float32Array = null,
    tangent: scala.scalajs.js.typedarray.Float32Array | js.Array[Double] | scala.scalajs.js.typedarray.Float64Array = null,
    uv: scala.scalajs.js.typedarray.Float32Array | js.Array[Double] | scala.scalajs.js.typedarray.Float64Array = null
  ): MeshVertexAttributesProperties = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (normal != null) __obj.updateDynamic("normal")(normal.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (tangent != null) __obj.updateDynamic("tangent")(tangent.asInstanceOf[js.Any])
    if (uv != null) __obj.updateDynamic("uv")(uv.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeshVertexAttributesProperties]
  }
}

