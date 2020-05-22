package typingsSlinky.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeRange extends js.Object {
  /**
    * The end time of the time range.  Specify null to leave the end time open-ended. 
    */
  var end: js.UndefOr[js.Date] = js.native
  /**
    * The start time of the time range.  Specify null to leave the start time open-ended. 
    */
  var start: js.UndefOr[js.Date] = js.native
}

object TimeRange {
  @scala.inline
  def apply(end: js.Date = null, start: js.Date = null): TimeRange = {
    val __obj = js.Dynamic.literal()
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeRange]
  }
}

