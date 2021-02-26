package typingsSlinky.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimestreamTimestamp extends StObject {
  
  /**
    * The precision of the timestamp value that results from the expression described in value. Valid values: SECONDS | MILLISECONDS | MICROSECONDS | NANOSECONDS. The default is MILLISECONDS.
    */
  var unit: TimestreamTimestampUnit = js.native
  
  /**
    * An expression that returns a long epoch time value.
    */
  var value: TimestreamTimestampValue = js.native
}
object TimestreamTimestamp {
  
  @scala.inline
  def apply(unit: TimestreamTimestampUnit, value: TimestreamTimestampValue): TimestreamTimestamp = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimestreamTimestamp]
  }
  
  @scala.inline
  implicit class TimestreamTimestampMutableBuilder[Self <: TimestreamTimestamp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUnit(value: TimestreamTimestampUnit): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: TimestreamTimestampValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
