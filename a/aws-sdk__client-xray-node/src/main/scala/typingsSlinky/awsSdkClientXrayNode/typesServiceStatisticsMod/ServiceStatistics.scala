package typingsSlinky.awsSdkClientXrayNode.typesServiceStatisticsMod

import typingsSlinky.awsSdkClientXrayNode.typesErrorStatisticsMod.ErrorStatistics
import typingsSlinky.awsSdkClientXrayNode.typesFaultStatisticsMod.FaultStatistics
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceStatistics extends js.Object {
  /**
    * <p>Information about requests that failed with a 4xx Client Error status code.</p>
    */
  var ErrorStatistics: js.UndefOr[typingsSlinky.awsSdkClientXrayNode.typesErrorStatisticsMod.ErrorStatistics] = js.native
  /**
    * <p>Information about requests that failed with a 5xx Server Error status code.</p>
    */
  var FaultStatistics: js.UndefOr[typingsSlinky.awsSdkClientXrayNode.typesFaultStatisticsMod.FaultStatistics] = js.native
  /**
    * <p>The number of requests that completed with a 2xx Success status code.</p>
    */
  var OkCount: js.UndefOr[Double] = js.native
  /**
    * <p>The total number of completed requests.</p>
    */
  var TotalCount: js.UndefOr[Double] = js.native
  /**
    * <p>The aggregate response time of completed requests.</p>
    */
  var TotalResponseTime: js.UndefOr[Double] = js.native
}

object ServiceStatistics {
  @scala.inline
  def apply(): ServiceStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceStatistics]
  }
  @scala.inline
  implicit class ServiceStatisticsOps[Self <: ServiceStatistics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorStatistics(value: ErrorStatistics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorStatistics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorStatistics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorStatistics")(js.undefined)
        ret
    }
    @scala.inline
    def withFaultStatistics(value: FaultStatistics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FaultStatistics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFaultStatistics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FaultStatistics")(js.undefined)
        ret
    }
    @scala.inline
    def withOkCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OkCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOkCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OkCount")(js.undefined)
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
    @scala.inline
    def withTotalResponseTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalResponseTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalResponseTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalResponseTime")(js.undefined)
        ret
    }
  }
  
}

