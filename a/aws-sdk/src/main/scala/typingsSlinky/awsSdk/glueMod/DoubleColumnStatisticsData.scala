package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DoubleColumnStatisticsData extends js.Object {
  
  /**
    * Maximum value of the column.
    */
  var MaximumValue: js.UndefOr[Double] = js.native
  
  /**
    * Minimum value of the column.
    */
  var MinimumValue: js.UndefOr[Double] = js.native
  
  /**
    * Number of distinct values.
    */
  var NumberOfDistinctValues: NonNegativeLong = js.native
  
  /**
    * Number of nulls.
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
  implicit class DoubleColumnStatisticsDataOps[Self <: DoubleColumnStatisticsData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNumberOfDistinctValues(value: NonNegativeLong): Self = this.set("NumberOfDistinctValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfNulls(value: NonNegativeLong): Self = this.set("NumberOfNulls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumValue(value: Double): Self = this.set("MaximumValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumValue: Self = this.set("MaximumValue", js.undefined)
    
    @scala.inline
    def setMinimumValue(value: Double): Self = this.set("MinimumValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumValue: Self = this.set("MinimumValue", js.undefined)
  }
}
