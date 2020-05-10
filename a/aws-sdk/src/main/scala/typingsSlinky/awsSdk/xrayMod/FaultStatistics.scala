package typingsSlinky.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FaultStatistics extends js.Object {
  /**
    * The number of requests that failed with untracked 5xx Server Error status codes.
    */
  var OtherCount: js.UndefOr[NullableLong] = js.native
  /**
    * The total number of requests that failed with a 5xx Server Error status code.
    */
  var TotalCount: js.UndefOr[NullableLong] = js.native
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
    def withOtherCount(value: NullableLong): Self = {
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
    def withTotalCount(value: NullableLong): Self = {
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

