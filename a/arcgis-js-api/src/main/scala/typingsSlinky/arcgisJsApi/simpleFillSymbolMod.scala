package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.SimpleFillSymbol
import typingsSlinky.arcgisJsApi.esri.SimpleFillSymbolConstructor
import typingsSlinky.arcgisJsApi.esri.SimpleFillSymbolProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object simpleFillSymbolMod extends Shortcut {
  
  @JSImport("esri/symbols/SimpleFillSymbol", JSImport.Namespace)
  @js.native
  val ^ : SimpleFillSymbolConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/symbols/SimpleFillSymbol", JSImport.Namespace)
  @js.native
  /**
    * SimpleFillSymbol is used for rendering 2D polygons in either a [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleFillSymbol.html)
    */
  class Class () extends SimpleFillSymbol {
    def this(properties: SimpleFillSymbolProperties) = this()
  }
  
  type _To = SimpleFillSymbolConstructor
  
  /* This means you don't have to write `^`, but can instead just say `simpleFillSymbolMod.foo` */
  override def _to: SimpleFillSymbolConstructor = ^
}
