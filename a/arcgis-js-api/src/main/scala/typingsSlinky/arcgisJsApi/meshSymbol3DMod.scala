package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.MeshSymbol3D
import typingsSlinky.arcgisJsApi.esri.MeshSymbol3DConstructor
import typingsSlinky.arcgisJsApi.esri.MeshSymbol3DProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object meshSymbol3DMod extends Shortcut {
  
  @JSImport("esri/symbols/MeshSymbol3D", JSImport.Namespace)
  @js.native
  val ^ : MeshSymbol3DConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/symbols/MeshSymbol3D", JSImport.Namespace)
  @js.native
  /**
    * MeshSymbol3D is used to render 3D mesh features in a [SceneLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html) in a 3D [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-MeshSymbol3D.html)
    */
  class Class () extends MeshSymbol3D {
    def this(properties: MeshSymbol3DProperties) = this()
  }
  
  type _To = MeshSymbol3DConstructor
  
  /* This means you don't have to write `^`, but can instead just say `meshSymbol3DMod.foo` */
  override def _to: MeshSymbol3DConstructor = ^
}
