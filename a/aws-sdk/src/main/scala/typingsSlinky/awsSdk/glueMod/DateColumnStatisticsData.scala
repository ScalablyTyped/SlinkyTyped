package typingsSlinky.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateColumnStatisticsData extends StObject {
  
  /**
    * The highest value in the column.
    */
  var MaximumValue: js.UndefOr[js.Date] = js.native
  
  /**
    * The lowest value in the column.
    */
  var MinimumValue: js.UndefOr[js.Date] = js.native
  
  /**
    * The number of distinct values in a column.
    */
  var NumberOfDistinctValues: NonNegativeLong = js.native
  
  /**
    * The number of null values in the column.
    */
  var NumberOfNulls: NonNegativeLong = js.native
}
object DateColumnStatisticsData {
  
  @scala.inline
  def apply(NumberOfDistinctValues: NonNegativeLong, NumberOfNulls: NonNegativeLong): DateColumnStatisticsData = {
    val __obj = js.Dynamic.literal(NumberOfDistinctValues = NumberOfDistinctValues.asInstanceOf[js.Any], NumberOfNulls = NumberOfNulls.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateColumnStatisticsData]
  }
  
  @scala.inline
  implicit class DateColumnStatisticsDataMutableBuilder[Self <: DateColumnStatisticsData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaximumValue(value: js.Date): Self = StObject.set(x, "MaximumValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumValueUndefined: Self = StObject.set(x, "MaximumValue", js.undefined)
    
    @scala.inline
    def setMinimumValue(value: js.Date): Self = StObject.set(x, "MinimumValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumValueUndefined: Self = StObject.set(x, "MinimumValue", js.undefined)
    
    @scala.inline
    def setNumberOfDistinctValues(value: NonNegativeLong): Self = StObject.set(x, "NumberOfDistinctValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfNulls(value: NonNegativeLong): Self = StObject.set(x, "NumberOfNulls", value.asInstanceOf[js.Any])
  }
}
