package typingsSlinky.jqrangeslider

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQRangeSliderDateRange extends StObject {
  
  var max: js.UndefOr[js.Date] = js.native
  
  var min: js.UndefOr[js.Date] = js.native
}
object JQRangeSliderDateRange {
  
  @scala.inline
  def apply(): JQRangeSliderDateRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQRangeSliderDateRange]
  }
  
  @scala.inline
  implicit class JQRangeSliderDateRangeMutableBuilder[Self <: JQRangeSliderDateRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMax(value: js.Date): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: js.Date): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
  }
}
