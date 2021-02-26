package typingsSlinky.awsSdk.kinesisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DecreaseStreamRetentionPeriodInput extends StObject {
  
  /**
    * The new retention period of the stream, in hours. Must be less than the current retention period.
    */
  var RetentionPeriodHours: typingsSlinky.awsSdk.kinesisMod.RetentionPeriodHours = js.native
  
  /**
    * The name of the stream to modify.
    */
  var StreamName: typingsSlinky.awsSdk.kinesisMod.StreamName = js.native
}
object DecreaseStreamRetentionPeriodInput {
  
  @scala.inline
  def apply(RetentionPeriodHours: RetentionPeriodHours, StreamName: StreamName): DecreaseStreamRetentionPeriodInput = {
    val __obj = js.Dynamic.literal(RetentionPeriodHours = RetentionPeriodHours.asInstanceOf[js.Any], StreamName = StreamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecreaseStreamRetentionPeriodInput]
  }
  
  @scala.inline
  implicit class DecreaseStreamRetentionPeriodInputMutableBuilder[Self <: DecreaseStreamRetentionPeriodInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRetentionPeriodHours(value: RetentionPeriodHours): Self = StObject.set(x, "RetentionPeriodHours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamName(value: StreamName): Self = StObject.set(x, "StreamName", value.asInstanceOf[js.Any])
  }
}
