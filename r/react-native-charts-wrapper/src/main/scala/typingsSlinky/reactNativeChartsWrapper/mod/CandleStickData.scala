package typingsSlinky.reactNativeChartsWrapper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CandleStickData extends StObject {
  
  var dataSets: js.UndefOr[js.Array[CandleStickDataset]] = js.native
}
object CandleStickData {
  
  @scala.inline
  def apply(): CandleStickData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CandleStickData]
  }
  
  @scala.inline
  implicit class CandleStickDataMutableBuilder[Self <: CandleStickData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataSets(value: js.Array[CandleStickDataset]): Self = StObject.set(x, "dataSets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSetsUndefined: Self = StObject.set(x, "dataSets", js.undefined)
    
    @scala.inline
    def setDataSetsVarargs(value: CandleStickDataset*): Self = StObject.set(x, "dataSets", js.Array(value :_*))
  }
}
