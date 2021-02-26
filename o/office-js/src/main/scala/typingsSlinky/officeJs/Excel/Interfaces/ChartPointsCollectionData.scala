package typingsSlinky.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `chartPointsCollection.toJSON()`. */
@js.native
trait ChartPointsCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[ChartPointData]] = js.native
}
object ChartPointsCollectionData {
  
  @scala.inline
  def apply(): ChartPointsCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartPointsCollectionData]
  }
  
  @scala.inline
  implicit class ChartPointsCollectionDataMutableBuilder[Self <: ChartPointsCollectionData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[ChartPointData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: ChartPointData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
