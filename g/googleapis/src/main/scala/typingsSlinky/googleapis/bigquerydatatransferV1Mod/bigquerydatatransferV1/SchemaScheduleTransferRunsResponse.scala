package typingsSlinky.googleapis.bigquerydatatransferV1Mod.bigquerydatatransferV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A response to schedule transfer runs for a time range.
  */
@js.native
trait SchemaScheduleTransferRunsResponse extends js.Object {
  /**
    * The transfer runs that were scheduled.
    */
  var runs: js.UndefOr[js.Array[SchemaTransferRun]] = js.native
}

object SchemaScheduleTransferRunsResponse {
  @scala.inline
  def apply(): SchemaScheduleTransferRunsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaScheduleTransferRunsResponse]
  }
  @scala.inline
  implicit class SchemaScheduleTransferRunsResponseOps[Self <: SchemaScheduleTransferRunsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRuns(value: js.Array[SchemaTransferRun]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runs")(js.undefined)
        ret
    }
  }
  
}

