package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`backward-diagonal`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`diagonal-cross`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`forward-diagonal`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`simple-fill`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.cross
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.horizontal
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.none
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.solid
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.arcgisJsApi.esri.Symbol2D3D because Already inherited
- typingsSlinky.arcgisJsApi.esri.symbols.Symbol2D3D because Already inherited */ @js.native
trait SimpleFillSymbol
  extends Symbol2D
     with FillSymbol
     with typingsSlinky.arcgisJsApi.esri.symbols.FillSymbol
     with typingsSlinky.arcgisJsApi.esri.symbols.Symbol2D
     with symbolsFillSymbol {
  
  /**
    * The fill style.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleFillSymbol.html#style)
    */
  var style: `backward-diagonal` | cross | `diagonal-cross` | `forward-diagonal` | horizontal | none | solid | vertical = js.native
  
  /**
    * The symbol type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleFillSymbol.html#type)
    */
  @JSName("type")
  val type_SimpleFillSymbol: `simple-fill` = js.native
}
