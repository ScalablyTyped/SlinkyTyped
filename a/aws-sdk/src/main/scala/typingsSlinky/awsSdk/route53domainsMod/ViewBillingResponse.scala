package typingsSlinky.awsSdk.route53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewBillingResponse extends js.Object {
  /**
    * A summary of billing records.
    */
  var BillingRecords: js.UndefOr[typingsSlinky.awsSdk.route53domainsMod.BillingRecords] = js.native
  /**
    * If there are more billing records than you specified for MaxItems in the request, submit another request and include the value of NextPageMarker in the value of Marker.
    */
  var NextPageMarker: js.UndefOr[PageMarker] = js.native
}

object ViewBillingResponse {
  @scala.inline
  def apply(): ViewBillingResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewBillingResponse]
  }
  @scala.inline
  implicit class ViewBillingResponseOps[Self <: ViewBillingResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBillingRecords(value: BillingRecords): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BillingRecords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBillingRecords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BillingRecords")(js.undefined)
        ret
    }
    @scala.inline
    def withNextPageMarker(value: PageMarker): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextPageMarker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextPageMarker")(js.undefined)
        ret
    }
  }
  
}

