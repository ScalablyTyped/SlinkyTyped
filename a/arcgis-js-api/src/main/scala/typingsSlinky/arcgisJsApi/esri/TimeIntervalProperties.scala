package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.centuries
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.days
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.decades
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.hours
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.milliseconds
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.minutes
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.months
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.seconds
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.weeks
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.years
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeIntervalProperties extends StObject {
  
  /**
    * Temporal units.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeInterval.html#unit)
    */
  var unit: js.UndefOr[
    milliseconds | seconds | minutes | hours | days | weeks | months | years | decades | centuries
  ] = js.native
  
  /**
    * The numerical value of the time extent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeInterval.html#value)
    */
  var value: js.UndefOr[Double] = js.native
}
object TimeIntervalProperties {
  
  @scala.inline
  def apply(): TimeIntervalProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeIntervalProperties]
  }
  
  @scala.inline
  implicit class TimeIntervalPropertiesMutableBuilder[Self <: TimeIntervalProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUnit(
      value: milliseconds | seconds | minutes | hours | days | weeks | months | years | decades | centuries
    ): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
