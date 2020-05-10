package typingsSlinky.awsSdkClientXrayNode.typesFaultStatisticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FaultStatistics extends js.Object {
  /**
    * <p>The number of requests that failed with untracked 5xx Server Error status codes.</p>
    */
  var OtherCount: js.UndefOr[Double] = js.native
  /**
    * <p>The total number of requests that failed with a 5xx Server Error status code.</p>
    */
  var TotalCount: js.UndefOr[Double] = js.native
}

object FaultStatistics {
  @scala.inline
  def apply(): FaultStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FaultStatistics]
  }
  @scala.inline
  implicit class FaultStatisticsOps[Self <: FaultStatistics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOtherCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OtherCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOtherCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OtherCount")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalCount")(js.undefined)
        ret
    }
  }
  
}

