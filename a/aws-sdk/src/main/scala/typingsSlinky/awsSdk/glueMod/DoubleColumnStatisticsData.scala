package typingsSlinky.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DoubleColumnStatisticsData extends StObject {
  
  /**
    * The highest value in the column.
    */
  var MaximumValue: js.UndefOr[Double] = js.native
  
  /**
    * The lowest value in the column.
    */
  var MinimumValue: js.UndefOr[Double] = js.native
  
  /**
    * The number of distinct values in a column.
    */
  var NumberOfDistinctValues: NonNegativeLong = js.native
  
  /**
    * The number of null values in the column.
    */
  var NumberOfNulls: NonNegativeLong = js.native
}
object DoubleColumnStatisticsData {
  
  @scala.inline
  def apply(NumberOfDistinctValues: NonNegativeLong, NumberOfNulls: NonNegativeLong): DoubleColumnStatisticsData = {
    val __obj = js.Dynamic.literal(NumberOfDistinctValues = NumberOfDistinctValues.asInstanceOf[js.Any], NumberOfNulls = NumberOfNulls.asInstanceOf[js.Any])
    __obj.asInstanceOf[DoubleColumnStatisticsData]
  }
  
  @scala.inline
  implicit class DoubleColumnStatisticsDataMutableBuilder[Self <: DoubleColumnStatisticsData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaximumValue(value: Double): Self = StObject.set(x, "MaximumValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumValueUndefined: Self = StObject.set(x, "MaximumValue", js.undefined)
    
    @scala.inline
    def setMinimumValue(value: Double): Self = StObject.set(x, "MinimumValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumValueUndefined: Self = StObject.set(x, "MinimumValue", js.undefined)
    
    @scala.inline
    def setNumberOfDistinctValues(value: NonNegativeLong): Self = StObject.set(x, "NumberOfDistinctValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfNulls(value: NonNegativeLong): Self = StObject.set(x, "NumberOfNulls", value.asInstanceOf[js.Any])
  }
}
