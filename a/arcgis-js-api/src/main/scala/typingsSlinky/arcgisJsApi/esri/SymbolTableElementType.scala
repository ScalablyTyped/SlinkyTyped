package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.arcgisJsApi.esri.ImageSymbolTableElementInfo
  - typingsSlinky.arcgisJsApi.esri.SymbolTableElementInfo
*/
trait SymbolTableElementType extends StObject
object SymbolTableElementType {
  
  @scala.inline
  def ImageSymbolTableElementInfo(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    opacity: Double,
    propertyIsEnumerable: PropertyKey => Boolean,
    src: String
  ): typingsSlinky.arcgisJsApi.esri.ImageSymbolTableElementInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), opacity = opacity.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.arcgisJsApi.esri.ImageSymbolTableElementInfo]
  }
  
  @scala.inline
  def SymbolTableElementInfo(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    label: String | RampTitle,
    propertyIsEnumerable: PropertyKey => Boolean,
    symbol: Symbol
  ): typingsSlinky.arcgisJsApi.esri.SymbolTableElementInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), label = label.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.arcgisJsApi.esri.SymbolTableElementInfo]
  }
}
