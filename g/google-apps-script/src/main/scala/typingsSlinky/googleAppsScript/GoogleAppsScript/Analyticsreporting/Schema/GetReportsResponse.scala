package typingsSlinky.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetReportsResponse extends js.Object {
  var queryCost: js.UndefOr[Double] = js.native
  var reports: js.UndefOr[js.Array[Report]] = js.native
  var resourceQuotasRemaining: js.UndefOr[ResourceQuotasRemaining] = js.native
}

object GetReportsResponse {
  @scala.inline
  def apply(): GetReportsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetReportsResponse]
  }
  @scala.inline
  implicit class GetReportsResponseOps[Self <: GetReportsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQueryCost(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryCost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryCost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryCost")(js.undefined)
        ret
    }
    @scala.inline
    def withReports(value: js.Array[Report]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReports: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reports")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceQuotasRemaining(value: ResourceQuotasRemaining): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceQuotasRemaining")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceQuotasRemaining: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceQuotasRemaining")(js.undefined)
        ret
    }
  }
  
}

