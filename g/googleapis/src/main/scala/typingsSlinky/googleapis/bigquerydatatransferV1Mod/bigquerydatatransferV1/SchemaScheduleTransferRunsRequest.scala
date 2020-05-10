package typingsSlinky.googleapis.bigquerydatatransferV1Mod.bigquerydatatransferV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A request to schedule transfer runs for a time range.
  */
@js.native
trait SchemaScheduleTransferRunsRequest extends js.Object {
  /**
    * End time of the range of transfer runs. For example,
    * `&quot;2017-05-30T00:00:00+00:00&quot;`.
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    * Start time of the range of transfer runs. For example,
    * `&quot;2017-05-25T00:00:00+00:00&quot;`.
    */
  var startTime: js.UndefOr[String] = js.native
}

object SchemaScheduleTransferRunsRequest {
  @scala.inline
  def apply(): SchemaScheduleTransferRunsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaScheduleTransferRunsRequest]
  }
  @scala.inline
  implicit class SchemaScheduleTransferRunsRequestOps[Self <: SchemaScheduleTransferRunsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(js.undefined)
        ret
    }
  }
  
}

