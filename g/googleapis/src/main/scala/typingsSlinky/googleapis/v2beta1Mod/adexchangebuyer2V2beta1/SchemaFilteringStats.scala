package typingsSlinky.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @OutputOnly Filtering reasons for this creative during a period of a single
  * day (from midnight to midnight Pacific).
  */
@js.native
trait SchemaFilteringStats extends js.Object {
  /**
    * The day during which the data was collected. The data is collected from
    * 00:00:00 to 23:59:59 PT. During switches from PST to PDT and back, the
    * day may contain 23 or 25 hours of data instead of the usual 24.
    */
  var date: js.UndefOr[SchemaDate] = js.native
  /**
    * The set of filtering reasons for this date.
    */
  var reasons: js.UndefOr[js.Array[SchemaReason]] = js.native
}

object SchemaFilteringStats {
  @scala.inline
  def apply(): SchemaFilteringStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFilteringStats]
  }
  @scala.inline
  implicit class SchemaFilteringStatsOps[Self <: SchemaFilteringStats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDate(value: SchemaDate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(js.undefined)
        ret
    }
    @scala.inline
    def withReasons(value: js.Array[SchemaReason]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reasons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReasons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reasons")(js.undefined)
        ret
    }
  }
  
}

