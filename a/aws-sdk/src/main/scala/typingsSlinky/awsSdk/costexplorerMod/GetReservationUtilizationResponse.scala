package typingsSlinky.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetReservationUtilizationResponse extends js.Object {
  /**
    * The token for the next set of retrievable results. AWS provides the token when the response from a previous call has more results than the maximum page size.
    */
  var NextPageToken: js.UndefOr[typingsSlinky.awsSdk.costexplorerMod.NextPageToken] = js.native
  /**
    * The total amount of time that you used your RIs.
    */
  var Total: js.UndefOr[ReservationAggregates] = js.native
  /**
    * The amount of time that you used your RIs.
    */
  var UtilizationsByTime: typingsSlinky.awsSdk.costexplorerMod.UtilizationsByTime = js.native
}

object GetReservationUtilizationResponse {
  @scala.inline
  def apply(UtilizationsByTime: UtilizationsByTime): GetReservationUtilizationResponse = {
    val __obj = js.Dynamic.literal(UtilizationsByTime = UtilizationsByTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetReservationUtilizationResponse]
  }
  @scala.inline
  implicit class GetReservationUtilizationResponseOps[Self <: GetReservationUtilizationResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUtilizationsByTime(value: UtilizationsByTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UtilizationsByTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextPageToken(value: NextPageToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextPageToken")(js.undefined)
        ret
    }
    @scala.inline
    def withTotal(value: ReservationAggregates): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Total")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Total")(js.undefined)
        ret
    }
  }
  
}

