package typingsSlinky.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BooleanColumnStatisticsData extends StObject {
  
  /**
    * The number of false values in the column.
    */
  var NumberOfFalses: NonNegativeLong = js.native
  
  /**
    * The number of null values in the column.
    */
  var NumberOfNulls: NonNegativeLong = js.native
  
  /**
    * The number of true values in the column.
    */
  var NumberOfTrues: NonNegativeLong = js.native
}
object BooleanColumnStatisticsData {
  
  @scala.inline
  def apply(NumberOfFalses: NonNegativeLong, NumberOfNulls: NonNegativeLong, NumberOfTrues: NonNegativeLong): BooleanColumnStatisticsData = {
    val __obj = js.Dynamic.literal(NumberOfFalses = NumberOfFalses.asInstanceOf[js.Any], NumberOfNulls = NumberOfNulls.asInstanceOf[js.Any], NumberOfTrues = NumberOfTrues.asInstanceOf[js.Any])
    __obj.asInstanceOf[BooleanColumnStatisticsData]
  }
  
  @scala.inline
  implicit class BooleanColumnStatisticsDataMutableBuilder[Self <: BooleanColumnStatisticsData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNumberOfFalses(value: NonNegativeLong): Self = StObject.set(x, "NumberOfFalses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfNulls(value: NonNegativeLong): Self = StObject.set(x, "NumberOfNulls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfTrues(value: NonNegativeLong): Self = StObject.set(x, "NumberOfTrues", value.asInstanceOf[js.Any])
  }
}
