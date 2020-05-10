package typingsSlinky.gapiClientAdexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFilteringCount extends js.Object {
  /** The number of times the creative was filtered for the status. The count is aggregated across all publishers on the exchange. */
  var filteringCount: js.UndefOr[String] = js.native
  /** The filtering status code as defined in  creative-status-codes.txt. */
  var filteringStatus: js.UndefOr[Double] = js.native
}

object AnonFilteringCount {
  @scala.inline
  def apply(): AnonFilteringCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonFilteringCount]
  }
  @scala.inline
  implicit class AnonFilteringCountOps[Self <: AnonFilteringCount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilteringCount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filteringCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilteringCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filteringCount")(js.undefined)
        ret
    }
    @scala.inline
    def withFilteringStatus(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filteringStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilteringStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filteringStatus")(js.undefined)
        ret
    }
  }
  
}

