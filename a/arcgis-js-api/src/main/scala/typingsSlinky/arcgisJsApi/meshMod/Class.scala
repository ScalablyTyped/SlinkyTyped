package typingsSlinky.arcgisJsApi.meshMod

import typingsSlinky.arcgisJsApi.esri.Mesh
import typingsSlinky.arcgisJsApi.esri.MeshProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("esri/geometry/Mesh", JSImport.Namespace)
@js.native
/**
  * A mesh is a general, client-side 3D [geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Geometry.html) type composed of [vertices with attributes](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#vertexAttributes). The vertices include geographic position, normals that affect lighting/shading and uv coordinates that can be used to map images to the mesh. Vertices are combined into 3D primitives to render the mesh in the scene (only triangle primitives are currently supported).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html)
  */
class Class () extends Mesh {
  def this(properties: MeshProperties) = this()
}
