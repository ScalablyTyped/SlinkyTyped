package typingsSlinky.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AggregatedValue extends StObject {
  
  /**
    * The quality of the aggregated data.
    */
  var quality: js.UndefOr[Quality] = js.native
  
  /**
    * The date the aggregating computations occurred, in Unix epoch time.
    */
  var timestamp: js.Date = js.native
  
  /**
    * The value of the aggregates.
    */
  var value: Aggregates = js.native
}
object AggregatedValue {
  
  @scala.inline
  def apply(timestamp: js.Date, value: Aggregates): AggregatedValue = {
    val __obj = js.Dynamic.literal(timestamp = timestamp.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregatedValue]
  }
  
  @scala.inline
  implicit class AggregatedValueMutableBuilder[Self <: AggregatedValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQuality(value: Quality): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
    
    @scala.inline
    def setTimestamp(value: js.Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Aggregates): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
