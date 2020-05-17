package typingsSlinky.gapiClientDoubleclicksearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangedAttributesSinceTimestamp extends js.Object {
  /** Inclusive UTC timestamp in RFC format, e.g., 2013-07-16T10:16:23.555Z. See additional references on how changed attribute reports work. */
  var changedAttributesSinceTimestamp: js.UndefOr[String] = js.native
  /** Inclusive UTC timestamp in RFC format, e.g., 2013-07-16T10:16:23.555Z. See additional references on how changed metrics reports work. */
  var changedMetricsSinceTimestamp: js.UndefOr[String] = js.native
  /** Inclusive date in YYYY-MM-DD format. */
  var endDate: js.UndefOr[String] = js.native
  /** Inclusive date in YYYY-MM-DD format. */
  var startDate: js.UndefOr[String] = js.native
}

object ChangedAttributesSinceTimestamp {
  @scala.inline
  def apply(): ChangedAttributesSinceTimestamp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChangedAttributesSinceTimestamp]
  }
  @scala.inline
  implicit class ChangedAttributesSinceTimestampOps[Self <: ChangedAttributesSinceTimestamp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChangedAttributesSinceTimestamp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changedAttributesSinceTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChangedAttributesSinceTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changedAttributesSinceTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withChangedMetricsSinceTimestamp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changedMetricsSinceTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChangedMetricsSinceTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changedMetricsSinceTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withEndDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDate")(js.undefined)
        ret
    }
    @scala.inline
    def withStartDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDate")(js.undefined)
        ret
    }
  }
  
}

