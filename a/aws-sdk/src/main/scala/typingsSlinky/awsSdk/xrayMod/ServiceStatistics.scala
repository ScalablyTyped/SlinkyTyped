package typingsSlinky.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceStatistics extends js.Object {
  /**
    * Information about requests that failed with a 4xx Client Error status code.
    */
  var ErrorStatistics: js.UndefOr[typingsSlinky.awsSdk.xrayMod.ErrorStatistics] = js.native
  /**
    * Information about requests that failed with a 5xx Server Error status code.
    */
  var FaultStatistics: js.UndefOr[typingsSlinky.awsSdk.xrayMod.FaultStatistics] = js.native
  /**
    * The number of requests that completed with a 2xx Success status code.
    */
  var OkCount: js.UndefOr[NullableLong] = js.native
  /**
    * The total number of completed requests.
    */
  var TotalCount: js.UndefOr[NullableLong] = js.native
  /**
    * The aggregate response time of completed requests.
    */
  var TotalResponseTime: js.UndefOr[NullableDouble] = js.native
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
    def withOkCount(value: NullableLong): Self = {
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
    @scala.inline
    def withTotalResponseTime(value: NullableDouble): Self = {
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

