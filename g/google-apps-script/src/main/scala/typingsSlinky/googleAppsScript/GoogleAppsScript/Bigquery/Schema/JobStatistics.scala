package typingsSlinky.googleAppsScript.GoogleAppsScript.Bigquery.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobStatistics extends js.Object {
  var completionRatio: js.UndefOr[Double] = js.native
  var creationTime: js.UndefOr[String] = js.native
  var endTime: js.UndefOr[String] = js.native
  var extract: js.UndefOr[JobStatistics4] = js.native
  var load: js.UndefOr[JobStatistics3] = js.native
  var numChildJobs: js.UndefOr[String] = js.native
  var parentJobId: js.UndefOr[String] = js.native
  var query: js.UndefOr[JobStatistics2] = js.native
  var quotaDeferments: js.UndefOr[js.Array[String]] = js.native
  var reservationUsage: js.UndefOr[js.Array[JobStatisticsReservationUsage]] = js.native
  var startTime: js.UndefOr[String] = js.native
  var totalBytesProcessed: js.UndefOr[String] = js.native
  var totalSlotMs: js.UndefOr[String] = js.native
}

object JobStatistics {
  @scala.inline
  def apply(): JobStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobStatistics]
  }
  @scala.inline
  implicit class JobStatisticsOps[Self <: JobStatistics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompletionRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completionRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompletionRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completionRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withCreationTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationTime")(js.undefined)
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
    def withExtract(value: JobStatistics4): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extract")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtract: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extract")(js.undefined)
        ret
    }
    @scala.inline
    def withLoad(value: JobStatistics3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(js.undefined)
        ret
    }
    @scala.inline
    def withNumChildJobs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numChildJobs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumChildJobs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numChildJobs")(js.undefined)
        ret
    }
    @scala.inline
    def withParentJobId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentJobId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentJobId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentJobId")(js.undefined)
        ret
    }
    @scala.inline
    def withQuery(value: JobStatistics2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(js.undefined)
        ret
    }
    @scala.inline
    def withQuotaDeferments(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quotaDeferments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuotaDeferments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quotaDeferments")(js.undefined)
        ret
    }
    @scala.inline
    def withReservationUsage(value: js.Array[JobStatisticsReservationUsage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reservationUsage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReservationUsage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reservationUsage")(js.undefined)
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
    @scala.inline
    def withTotalBytesProcessed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalBytesProcessed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalBytesProcessed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalBytesProcessed")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalSlotMs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalSlotMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalSlotMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalSlotMs")(js.undefined)
        ret
    }
  }
  
}

