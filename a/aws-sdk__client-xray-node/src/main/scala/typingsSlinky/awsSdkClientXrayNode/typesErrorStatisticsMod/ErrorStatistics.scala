package typingsSlinky.awsSdkClientXrayNode.typesErrorStatisticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorStatistics extends js.Object {
  /**
    * <p>The number of requests that failed with untracked 4xx Client Error status codes.</p>
    */
  var OtherCount: js.UndefOr[Double] = js.native
  /**
    * <p>The number of requests that failed with a 419 throttling status code.</p>
    */
  var ThrottleCount: js.UndefOr[Double] = js.native
  /**
    * <p>The total number of requests that failed with a 4xx Client Error status code.</p>
    */
  var TotalCount: js.UndefOr[Double] = js.native
}

object ErrorStatistics {
  @scala.inline
  def apply(): ErrorStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorStatistics]
  }
  @scala.inline
  implicit class ErrorStatisticsOps[Self <: ErrorStatistics] (val x: Self) extends AnyVal {
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
    def withThrottleCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThrottleCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThrottleCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThrottleCount")(js.undefined)
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

