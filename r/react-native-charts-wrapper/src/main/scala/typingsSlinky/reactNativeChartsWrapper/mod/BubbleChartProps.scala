package typingsSlinky.reactNativeChartsWrapper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BubbleChartProps extends BarLineChartBase {
  
  var data: js.UndefOr[BubbleData] = js.native
}
object BubbleChartProps {
  
  @scala.inline
  def apply(): BubbleChartProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BubbleChartProps]
  }
  
  @scala.inline
  implicit class BubbleChartPropsMutableBuilder[Self <: BubbleChartProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: BubbleData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
