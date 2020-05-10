package typingsSlinky.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonChangedAttributesSinceTimestamp extends js.Object {
  var changedAttributesSinceTimestamp: js.UndefOr[String] = js.native
  var changedMetricsSinceTimestamp: js.UndefOr[String] = js.native
  var endDate: js.UndefOr[String] = js.native
  var startDate: js.UndefOr[String] = js.native
}

object AnonChangedAttributesSinceTimestamp {
  @scala.inline
  def apply(): AnonChangedAttributesSinceTimestamp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonChangedAttributesSinceTimestamp]
  }
  @scala.inline
  implicit class AnonChangedAttributesSinceTimestampOps[Self <: AnonChangedAttributesSinceTimestamp] (val x: Self) extends AnyVal {
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

