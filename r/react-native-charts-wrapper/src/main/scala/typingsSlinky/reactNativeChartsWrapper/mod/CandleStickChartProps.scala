package typingsSlinky.reactNativeChartsWrapper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CandleStickChartProps extends BarLineChartBase {
  
  var data: js.UndefOr[CandleStickData] = js.native
}
object CandleStickChartProps {
  
  @scala.inline
  def apply(): CandleStickChartProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CandleStickChartProps]
  }
  
  @scala.inline
  implicit class CandleStickChartPropsMutableBuilder[Self <: CandleStickChartProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: CandleStickData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
