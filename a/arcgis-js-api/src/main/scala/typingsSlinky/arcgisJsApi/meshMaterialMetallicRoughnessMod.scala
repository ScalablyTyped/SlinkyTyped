package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.MeshMaterialMetallicRoughness
import typingsSlinky.arcgisJsApi.esri.MeshMaterialMetallicRoughnessConstructor
import typingsSlinky.arcgisJsApi.esri.MeshMaterialMetallicRoughnessProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object meshMaterialMetallicRoughnessMod extends Shortcut {
  
  @JSImport("esri/geometry/support/MeshMaterialMetallicRoughness", JSImport.Namespace)
  @js.native
  val ^ : MeshMaterialMetallicRoughnessConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/geometry/support/MeshMaterialMetallicRoughness", JSImport.Namespace)
  @js.native
  /**
    * A material determines how a [MeshComponent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshComponent.html) is visualized.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterialMetallicRoughness.html)
    */
  class Class () extends MeshMaterialMetallicRoughness {
    def this(properties: MeshMaterialMetallicRoughnessProperties) = this()
  }
  
  type _To = MeshMaterialMetallicRoughnessConstructor
  
  /* This means you don't have to write `^`, but can instead just say `meshMaterialMetallicRoughnessMod.foo` */
  override def _to: MeshMaterialMetallicRoughnessConstructor = ^
}
