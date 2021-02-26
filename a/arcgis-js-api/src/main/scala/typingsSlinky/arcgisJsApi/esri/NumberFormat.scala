package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NumberFormat extends Object {
  
  /**
    * Indicates if the number should be formatted with a thousands separator.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-intl.html#NumberFormat)
    */
  var digitSeparator: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies the number of decimal places that should appear in the formatted number.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-intl.html#NumberFormat)
    */
  var places: js.UndefOr[Double] = js.native
}
object NumberFormat {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): NumberFormat = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[NumberFormat]
  }
  
  @scala.inline
  implicit class NumberFormatMutableBuilder[Self <: NumberFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDigitSeparator(value: Boolean): Self = StObject.set(x, "digitSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDigitSeparatorUndefined: Self = StObject.set(x, "digitSeparator", js.undefined)
    
    @scala.inline
    def setPlaces(value: Double): Self = StObject.set(x, "places", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacesUndefined: Self = StObject.set(x, "places", js.undefined)
  }
}
