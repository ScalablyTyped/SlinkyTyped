package typingsSlinky.googleAppsScript.GoogleAppsScript.Bigquery.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobStatisticsReservationUsage extends js.Object {
  var name: js.UndefOr[String] = js.native
  var slotMs: js.UndefOr[String] = js.native
}

object JobStatisticsReservationUsage {
  @scala.inline
  def apply(): JobStatisticsReservationUsage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobStatisticsReservationUsage]
  }
  @scala.inline
  implicit class JobStatisticsReservationUsageOps[Self <: JobStatisticsReservationUsage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withSlotMs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slotMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlotMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slotMs")(js.undefined)
        ret
    }
  }
  
}

