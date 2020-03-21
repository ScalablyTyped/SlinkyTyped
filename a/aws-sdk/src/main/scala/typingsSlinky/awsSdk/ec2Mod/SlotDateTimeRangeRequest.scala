package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SlotDateTimeRangeRequest extends js.Object {
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
}

