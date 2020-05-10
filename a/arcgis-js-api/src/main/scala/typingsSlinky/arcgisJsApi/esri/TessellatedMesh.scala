package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TessellatedMesh extends Object {
  /**
    * The indices of the triangles that connect vertices together; each consecutive triplet of indices denotes a triangle.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#TessellatedMesh)
    */
  var indices: js.Array[Double] = js.native
  /**
    * The vertices that make up the mesh. Each element is a module:esri/views/2d/layers/BaseLayerViewGL2D#MeshVertex.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#TessellatedMesh)
    */
  var vertices: js.Array[MeshVertex] = js.native
}

object TessellatedMesh {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    indices: js.Array[Double],
    propertyIsEnumerable: PropertyKey => Boolean,
    vertices: js.Array[MeshVertex]
  ): TessellatedMesh = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), indices = indices.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), vertices = vertices.asInstanceOf[js.Any])
    __obj.asInstanceOf[TessellatedMesh]
  }
  @scala.inline
  implicit class TessellatedMeshOps[Self <: TessellatedMesh] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndices(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVertices(value: js.Array[MeshVertex]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertices")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

