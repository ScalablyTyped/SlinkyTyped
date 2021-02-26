package typingsSlinky.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProductUnitPricingMeasure extends StObject {
  
  /** The unit of the measure. */
  var unit: js.UndefOr[String] = js.native
  
  /** The measure of an item. */
  var value: js.UndefOr[Double] = js.native
}
object ProductUnitPricingMeasure {
  
  @scala.inline
  def apply(): ProductUnitPricingMeasure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductUnitPricingMeasure]
  }
  
  @scala.inline
  implicit class ProductUnitPricingMeasureMutableBuilder[Self <: ProductUnitPricingMeasure] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
