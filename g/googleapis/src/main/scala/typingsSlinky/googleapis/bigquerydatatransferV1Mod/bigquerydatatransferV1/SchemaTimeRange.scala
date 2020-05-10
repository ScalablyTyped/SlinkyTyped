package typingsSlinky.googleapis.bigquerydatatransferV1Mod.bigquerydatatransferV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A specification for a time range, this will request transfer runs with
  * run_time between start_time (inclusive) and end_time (exclusive).
  */
@js.native
trait SchemaTimeRange extends js.Object {
  /**
    * End time of the range of transfer runs. For example,
    * `&quot;2017-05-30T00:00:00+00:00&quot;`. The end_time must not be in the
    * future. Creates transfer runs where run_time is in the range betwen
    * start_time (inclusive) and end_time (exlusive).
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    * Start time of the range of transfer runs. For example,
    * `&quot;2017-05-25T00:00:00+00:00&quot;`. The start_time must be strictly
    * less than the end_time. Creates transfer runs where run_time is in the
    * range betwen start_time (inclusive) and end_time (exlusive).
    */
  var startTime: js.UndefOr[String] = js.native
}

object SchemaTimeRange {
  @scala.inline
  def apply(): SchemaTimeRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTimeRange]
  }
  @scala.inline
  implicit class SchemaTimeRangeOps[Self <: SchemaTimeRange] (val x: Self) extends AnyVal {
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

