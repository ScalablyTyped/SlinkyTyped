package typingsSlinky.googleapis.bigquerydatatransferV1Mod.bigquerydatatransferV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options customizing the data transfer schedule.
  */
@js.native
trait SchemaScheduleOptions extends js.Object {
  /**
    * If true, automatic scheduling of data transfer runs for this
    * configuration will be disabled. The runs can be started on ad-hoc basis
    * using StartManualTransferRuns API. When automatic scheduling is disabled,
    * the TransferConfig.schedule field will be ignored.
    */
  var disableAutoScheduling: js.UndefOr[Boolean] = js.native
  /**
    * Defines time to stop scheduling transfer runs. A transfer run cannot be
    * scheduled at or after the end time. The end time can be changed at any
    * moment. The time when a data transfer can be trigerred manually is not
    * limited by this option.
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    * Specifies time to start scheduling transfer runs. The first run will be
    * scheduled at or after the start time according to a recurrence pattern
    * defined in the schedule string. The start time can be changed at any
    * moment. The time when a data transfer can be trigerred manually is not
    * limited by this option.
    */
  var startTime: js.UndefOr[String] = js.native
}

object SchemaScheduleOptions {
  @scala.inline
  def apply(): SchemaScheduleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaScheduleOptions]
  }
  @scala.inline
  implicit class SchemaScheduleOptionsOps[Self <: SchemaScheduleOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisableAutoScheduling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableAutoScheduling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableAutoScheduling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableAutoScheduling")(js.undefined)
        ret
    }
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

