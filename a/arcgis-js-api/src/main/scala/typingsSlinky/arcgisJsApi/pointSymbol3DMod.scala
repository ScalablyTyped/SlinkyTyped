package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.PointSymbol3D
import typingsSlinky.arcgisJsApi.esri.PointSymbol3DConstructor
import typingsSlinky.arcgisJsApi.esri.PointSymbol3DProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pointSymbol3DMod extends Shortcut {
  
  @JSImport("esri/symbols/PointSymbol3D", JSImport.Namespace)
  @js.native
  val ^ : PointSymbol3DConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/symbols/PointSymbol3D", JSImport.Namespace)
  @js.native
  /**
    * PointSymbol3D is used to render features with [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) geometry in a 3D [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PointSymbol3D.html)
    */
  class Class () extends PointSymbol3D {
    def this(properties: PointSymbol3DProperties) = this()
  }
  
  type _To = PointSymbol3DConstructor
  
  /* This means you don't have to write `^`, but can instead just say `pointSymbol3DMod.foo` */
  override def _to: PointSymbol3DConstructor = ^
}
