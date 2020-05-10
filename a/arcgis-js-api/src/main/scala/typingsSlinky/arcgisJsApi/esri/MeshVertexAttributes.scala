package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MeshVertexAttributes extends AnonymousAccessor {
  /**
    * **Since: 4.9**    A flat array of the vertex colors (4 elements per vertex ranging from 0 to 255). Vertex colors are multiplied by the component material color (if any is defined).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#vertexAttributes)
    */
  var color: js.UndefOr[js.typedarray.Uint8Array] = js.native
  /**
    * A flat array of the vertex normals (3 elements per vertex ranging from -1 to 1).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#vertexAttributes)
    */
  var normal: js.UndefOr[js.typedarray.Float32Array] = js.native
  /**
    * A flat array of vertex positions. Vertex positions have x, y and z coordinates and they should be in the spatial reference system of the geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#vertexAttributes)
    */
  var position: js.typedarray.Float64Array = js.native
  /**
    * **Since: 4.11**    A flat array of the vertex tangents (4 elements per vertex ranging from -1 to 1. The 4th element is a sign value (-1 or +1) indicating handedness of the tangent basis). Vertex tangents are used for normal mapping, see [MeshMaterial.normalTexture](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterial.html#normalTexture).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#vertexAttributes)
    */
  var tangent: js.UndefOr[js.typedarray.Float32Array] = js.native
  /**
    * A flat array of vertex uv coordinates (2 elements per vertex).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#vertexAttributes)
    */
  var uv: js.UndefOr[js.typedarray.Float32Array] = js.native
}

object MeshVertexAttributes {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    position: js.typedarray.Float64Array,
    propertyIsEnumerable: PropertyKey => Boolean
  ): MeshVertexAttributes = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), position = position.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[MeshVertexAttributes]
  }
  @scala.inline
  implicit class MeshVertexAttributesOps[Self <: MeshVertexAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPosition(value: js.typedarray.Float64Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColor(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withNormal(value: js.typedarray.Float32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNormal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normal")(js.undefined)
        ret
    }
    @scala.inline
    def withTangent(value: js.typedarray.Float32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tangent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTangent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tangent")(js.undefined)
        ret
    }
    @scala.inline
    def withUv(value: js.typedarray.Float32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uv")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uv")(js.undefined)
        ret
    }
  }
  
}

