package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.LabelSymbol3D
import typingsSlinky.arcgisJsApi.esri.LabelSymbol3DConstructor
import typingsSlinky.arcgisJsApi.esri.LabelSymbol3DProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object labelSymbol3DMod extends Shortcut {
  
  @JSImport("esri/symbols/LabelSymbol3D", JSImport.Namespace)
  @js.native
  val ^ : LabelSymbol3DConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/symbols/LabelSymbol3D", JSImport.Namespace)
  @js.native
  /**
    * LabelSymbol3D is used to render labels for features from a [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) in a 3D [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LabelSymbol3D.html)
    */
  class Class () extends LabelSymbol3D {
    def this(properties: LabelSymbol3DProperties) = this()
  }
  
  type _To = LabelSymbol3DConstructor
  
  /* This means you don't have to write `^`, but can instead just say `labelSymbol3DMod.foo` */
  override def _to: LabelSymbol3DConstructor = ^
}
