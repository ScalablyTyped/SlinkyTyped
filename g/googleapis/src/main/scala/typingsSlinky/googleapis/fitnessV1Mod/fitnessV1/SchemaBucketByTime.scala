package typingsSlinky.googleapis.fitnessV1Mod.fitnessV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaBucketByTime extends js.Object {
  /**
    * Specifies that result buckets aggregate data by exactly durationMillis
    * time frames. Time frames that contain no data will be included in the
    * response with an empty dataset.
    */
  var durationMillis: js.UndefOr[String] = js.native
  var period: js.UndefOr[SchemaBucketByTimePeriod] = js.native
}

object SchemaBucketByTime {
  @scala.inline
  def apply(): SchemaBucketByTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBucketByTime]
  }
  @scala.inline
  implicit class SchemaBucketByTimeOps[Self <: SchemaBucketByTime] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDurationMillis(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDurationMillis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationMillis")(js.undefined)
        ret
    }
    @scala.inline
    def withPeriod(value: SchemaBucketByTimePeriod): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("period")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("period")(js.undefined)
        ret
    }
  }
  
}

