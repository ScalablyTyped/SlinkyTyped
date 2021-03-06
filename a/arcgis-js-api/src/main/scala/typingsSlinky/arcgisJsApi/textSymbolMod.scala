package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.TextSymbol
import typingsSlinky.arcgisJsApi.esri.TextSymbolConstructor
import typingsSlinky.arcgisJsApi.esri.TextSymbolProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textSymbolMod extends Shortcut {
  
  @JSImport("esri/symbols/TextSymbol", JSImport.Namespace)
  @js.native
  val ^ : TextSymbolConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/symbols/TextSymbol", JSImport.Namespace)
  @js.native
  /**
    * Text symbols are used to define the graphic for displaying labels on a [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html), [CSVLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html), [Sublayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html), and [StreamLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html) in a 2D [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html)
    */
  class Class () extends TextSymbol {
    def this(properties: TextSymbolProperties) = this()
  }
  
  type _To = TextSymbolConstructor
  
  /* This means you don't have to write `^`, but can instead just say `textSymbolMod.foo` */
  override def _to: TextSymbolConstructor = ^
}
