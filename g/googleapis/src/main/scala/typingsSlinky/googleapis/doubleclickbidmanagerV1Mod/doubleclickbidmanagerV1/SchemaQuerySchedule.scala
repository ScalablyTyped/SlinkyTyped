package typingsSlinky.googleapis.doubleclickbidmanagerV1Mod.doubleclickbidmanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information on how frequently and when to run a query.
  */
@js.native
trait SchemaQuerySchedule extends js.Object {
  /**
    * Datetime to periodically run the query until.
    */
  var endTimeMs: js.UndefOr[String] = js.native
  /**
    * How often the query is run.
    */
  var frequency: js.UndefOr[String] = js.native
  /**
    * Time of day at which a new report will be generated, represented as
    * minutes past midnight. Range is 0 to 1439. Only applies to scheduled
    * reports.
    */
  var nextRunMinuteOfDay: js.UndefOr[Double] = js.native
  /**
    * Canonical timezone code for report generation time. Defaults to
    * America/New_York.
    */
  var nextRunTimezoneCode: js.UndefOr[String] = js.native
}

object SchemaQuerySchedule {
  @scala.inline
  def apply(): SchemaQuerySchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQuerySchedule]
  }
  @scala.inline
  implicit class SchemaQueryScheduleOps[Self <: SchemaQuerySchedule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndTimeMs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTimeMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndTimeMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTimeMs")(js.undefined)
        ret
    }
    @scala.inline
    def withFrequency(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frequency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrequency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frequency")(js.undefined)
        ret
    }
    @scala.inline
    def withNextRunMinuteOfDay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextRunMinuteOfDay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextRunMinuteOfDay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextRunMinuteOfDay")(js.undefined)
        ret
    }
    @scala.inline
    def withNextRunTimezoneCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextRunTimezoneCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextRunTimezoneCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextRunTimezoneCode")(js.undefined)
        ret
    }
  }
  
}

