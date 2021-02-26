package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.MeshMaterial
import typingsSlinky.arcgisJsApi.esri.MeshMaterialConstructor
import typingsSlinky.arcgisJsApi.esri.MeshMaterialProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object meshMaterialMod extends Shortcut {
  
  @JSImport("esri/geometry/support/MeshMaterial", JSImport.Namespace)
  @js.native
  val ^ : MeshMaterialConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/geometry/support/MeshMaterial", JSImport.Namespace)
  @js.native
  /**
    * The material determines how a [MeshComponent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshComponent.html) is visualized.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterial.html)
    */
  class Class () extends MeshMaterial {
    def this(properties: MeshMaterialProperties) = this()
  }
  
  type _To = MeshMaterialConstructor
  
  /* This means you don't have to write `^`, but can instead just say `meshMaterialMod.foo` */
  override def _to: MeshMaterialConstructor = ^
}
