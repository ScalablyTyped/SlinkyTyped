package typingsSlinky.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Timing extends js.Object {
  /**
    * The time, in Unix epoch format, that the transcoding job finished
    */
  var FinishTime: js.UndefOr[js.Date] = js.native
  /**
    * The time, in Unix epoch format, that transcoding for the job began.
    */
  var StartTime: js.UndefOr[js.Date] = js.native
  /**
    * The time, in Unix epoch format, that you submitted the job.
    */
  var SubmitTime: js.UndefOr[js.Date] = js.native
}

object Timing {
  @scala.inline
  def apply(FinishTime: js.Date = null, StartTime: js.Date = null, SubmitTime: js.Date = null): Timing = {
    val __obj = js.Dynamic.literal()
    if (FinishTime != null) __obj.updateDynamic("FinishTime")(FinishTime.asInstanceOf[js.Any])
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime.asInstanceOf[js.Any])
    if (SubmitTime != null) __obj.updateDynamic("SubmitTime")(SubmitTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Timing]
  }
}

