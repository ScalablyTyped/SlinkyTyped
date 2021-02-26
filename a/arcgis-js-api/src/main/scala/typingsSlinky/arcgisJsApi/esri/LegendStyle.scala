package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`side-by-side`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.auto
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.card
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.classic
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.stack
import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LegendStyle extends Object {
  
  /**
    * When a `card` type is specified, you can specify one of the following layout options.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html#style)
    */
  var layout: js.UndefOr[auto | `side-by-side` | stack] = js.native
  
  /**
    * Specifies the style of the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html#style)
    */
  var `type`: classic | card = js.native
}
object LegendStyle {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    `type`: classic | card
  ): LegendStyle = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegendStyle]
  }
  
  @scala.inline
  implicit class LegendStyleMutableBuilder[Self <: LegendStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLayout(value: auto | `side-by-side` | stack): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    @scala.inline
    def setType(value: classic | card): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
