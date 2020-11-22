package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MeshVertexAttributesProperties extends Object {
  
  /**
    * **Since: 4.9**    A flat array of the vertex colors (4 elements per vertex ranging from 0 to 255).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#vertexAttributes)
    */
  var color: js.UndefOr[js.typedarray.Uint8Array | js.Array[Double] | js.typedarray.Uint8ClampedArray] = js.native
  
  /**
    * A flat array of the vertex normals (3 elements per vertex ranging from -1 to 1).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#vertexAttributes)
    */
  var normal: js.UndefOr[js.typedarray.Float32Array | js.Array[Double] | js.typedarray.Float64Array] = js.native
  
  /**
    * A flat array of vertex positions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#vertexAttributes)
    */
  var position: js.UndefOr[js.typedarray.Float64Array | js.Array[Double] | js.typedarray.Float32Array] = js.native
  
  /**
    * **Since: 4.11**    A flat array of the vertex tangents (4 elements per vertex ranging from -1 to 1.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#vertexAttributes)
    */
  var tangent: js.UndefOr[js.typedarray.Float32Array | js.Array[Double] | js.typedarray.Float64Array] = js.native
  
  /**
    * A flat array of vertex uv coordinates (2 elements per vertex).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#vertexAttributes)
    */
  var uv: js.UndefOr[js.typedarray.Float32Array | js.Array[Double] | js.typedarray.Float64Array] = js.native
}
object MeshVertexAttributesProperties {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): MeshVertexAttributesProperties = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[MeshVertexAttributesProperties]
  }
  
  @scala.inline
  implicit class MeshVertexAttributesPropertiesOps[Self <: MeshVertexAttributesProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setColorVarargs(value: Double*): Self = this.set("color", js.Array(value :_*))
    
    @scala.inline
    def setColorUint8Array(value: js.typedarray.Uint8Array): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUint8ClampedArray(value: js.typedarray.Uint8ClampedArray): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: js.typedarray.Uint8Array | js.Array[Double] | js.typedarray.Uint8ClampedArray): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setNormalFloat32Array(value: js.typedarray.Float32Array): Self = this.set("normal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalVarargs(value: Double*): Self = this.set("normal", js.Array(value :_*))
    
    @scala.inline
    def setNormalFloat64Array(value: js.typedarray.Float64Array): Self = this.set("normal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormal(value: js.typedarray.Float32Array | js.Array[Double] | js.typedarray.Float64Array): Self = this.set("normal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNormal: Self = this.set("normal", js.undefined)
    
    @scala.inline
    def setPositionFloat32Array(value: js.typedarray.Float32Array): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionVarargs(value: Double*): Self = this.set("position", js.Array(value :_*))
    
    @scala.inline
    def setPositionFloat64Array(value: js.typedarray.Float64Array): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: js.typedarray.Float64Array | js.Array[Double] | js.typedarray.Float32Array): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setTangentFloat32Array(value: js.typedarray.Float32Array): Self = this.set("tangent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTangentVarargs(value: Double*): Self = this.set("tangent", js.Array(value :_*))
    
    @scala.inline
    def setTangentFloat64Array(value: js.typedarray.Float64Array): Self = this.set("tangent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTangent(value: js.typedarray.Float32Array | js.Array[Double] | js.typedarray.Float64Array): Self = this.set("tangent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTangent: Self = this.set("tangent", js.undefined)
    
    @scala.inline
    def setUvFloat32Array(value: js.typedarray.Float32Array): Self = this.set("uv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUvVarargs(value: Double*): Self = this.set("uv", js.Array(value :_*))
    
    @scala.inline
    def setUvFloat64Array(value: js.typedarray.Float64Array): Self = this.set("uv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUv(value: js.typedarray.Float32Array | js.Array[Double] | js.typedarray.Float64Array): Self = this.set("uv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUv: Self = this.set("uv", js.undefined)
  }
}
