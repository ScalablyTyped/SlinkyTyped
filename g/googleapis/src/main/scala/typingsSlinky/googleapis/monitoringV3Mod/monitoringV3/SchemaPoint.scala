package typingsSlinky.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A single data point in a time series.
  */
@js.native
trait SchemaPoint extends StObject {
  
  /**
    * The time interval to which the data point applies. For GAUGE metrics,
    * only the end time of the interval is used. For DELTA metrics, the start
    * and end time should specify a non-zero interval, with subsequent points
    * specifying contiguous and non-overlapping intervals. For CUMULATIVE
    * metrics, the start and end time should specify a non-zero interval, with
    * subsequent points specifying the same start time and increasing end
    * times, until an event resets the cumulative value to zero and sets a new
    * start time for the following points.
    */
  var interval: js.UndefOr[SchemaTimeInterval] = js.native
  
  /**
    * The value of the data point.
    */
  var value: js.UndefOr[SchemaTypedValue] = js.native
}
object SchemaPoint {
  
  @scala.inline
  def apply(): SchemaPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPoint]
  }
  
  @scala.inline
  implicit class SchemaPointMutableBuilder[Self <: SchemaPoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInterval(value: SchemaTimeInterval): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    @scala.inline
    def setValue(value: SchemaTypedValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
