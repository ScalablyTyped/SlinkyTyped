package typingsSlinky.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SlotDateTimeRangeRequest extends StObject {
  
  /**
    * The earliest date and time, in UTC, for the Scheduled Instance to start.
    */
  var EarliestTime: js.Date = js.native
  
  /**
    * The latest date and time, in UTC, for the Scheduled Instance to start. This value must be later than or equal to the earliest date and at most three months in the future.
    */
  var LatestTime: js.Date = js.native
}
object SlotDateTimeRangeRequest {
  
  @scala.inline
  def apply(EarliestTime: js.Date, LatestTime: js.Date): SlotDateTimeRangeRequest = {
    val __obj = js.Dynamic.literal(EarliestTime = EarliestTime.asInstanceOf[js.Any], LatestTime = LatestTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlotDateTimeRangeRequest]
  }
  
  @scala.inline
  implicit class SlotDateTimeRangeRequestMutableBuilder[Self <: SlotDateTimeRangeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEarliestTime(value: js.Date): Self = StObject.set(x, "EarliestTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatestTime(value: js.Date): Self = StObject.set(x, "LatestTime", value.asInstanceOf[js.Any])
  }
}
