package typingsSlinky.arcgisJsApi.meshMaterialMetallicRoughnessMod

import typingsSlinky.arcgisJsApi.esri.MeshMaterialMetallicRoughness
import typingsSlinky.arcgisJsApi.esri.MeshMaterialMetallicRoughnessProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("esri/geometry/support/MeshMaterialMetallicRoughness", JSImport.Namespace)
@js.native
/**
  * A material determines how a [MeshComponent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshComponent.html) is visualized. This particular material (based on [MeshMaterial](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterial.html)) uses the metallic/roughness lighting model to enable physically based lighting. The metallic and roughness properties can be used to model various realistic materials including metals and plastics.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterialMetallicRoughness.html)
  */
class Class () extends MeshMaterialMetallicRoughness {
  def this(properties: MeshMaterialMetallicRoughnessProperties) = this()
}
