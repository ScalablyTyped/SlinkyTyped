package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.MeshComponent
import typingsSlinky.arcgisJsApi.esri.MeshComponentConstructor
import typingsSlinky.arcgisJsApi.esri.MeshComponentProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object meshComponentMod extends Shortcut {
  
  @JSImport("esri/geometry/support/MeshComponent", JSImport.Namespace)
  @js.native
  val ^ : MeshComponentConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/geometry/support/MeshComponent", JSImport.Namespace)
  @js.native
  /**
    * The MeshComponent class is used to apply one or more materials to a single [Mesh](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshComponent.html)
    */
  class Class () extends MeshComponent {
    def this(properties: MeshComponentProperties) = this()
  }
  
  type _To = MeshComponentConstructor
  
  /* This means you don't have to write `^`, but can instead just say `meshComponentMod.foo` */
  override def _to: MeshComponentConstructor = ^
}
