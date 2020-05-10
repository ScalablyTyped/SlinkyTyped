package typingsSlinky.awsSdk.route53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewBillingRequest extends js.Object {
  /**
    * The end date and time for the time period for which you want a list of billing records. Specify the date and time in Coordinated Universal time (UTC).
    */
  var End: js.UndefOr[js.Date] = js.native
  /**
    * For an initial request for a list of billing records, omit this element. If the number of billing records that are associated with the current AWS account during the specified period is greater than the value that you specified for MaxItems, you can use Marker to return additional billing records. Get the value of NextPageMarker from the previous response, and submit another request that includes the value of NextPageMarker in the Marker element.  Constraints: The marker must match the value of NextPageMarker that was returned in the previous response.
    */
  var Marker: js.UndefOr[PageMarker] = js.native
  /**
    * The number of billing records to be returned. Default: 20
    */
  var MaxItems: js.UndefOr[PageMaxItems] = js.native
  /**
    * The beginning date and time for the time period for which you want a list of billing records. Specify the date and time in Coordinated Universal time (UTC).
    */
  var Start: js.UndefOr[js.Date] = js.native
}

object ViewBillingRequest {
  @scala.inline
  def apply(): ViewBillingRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewBillingRequest]
  }
  @scala.inline
  implicit class ViewBillingRequestOps[Self <: ViewBillingRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnd(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("End")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("End")(js.undefined)
        ret
    }
    @scala.inline
    def withMarker(value: PageMarker): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Marker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Marker")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxItems(value: PageMaxItems): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxItems")(js.undefined)
        ret
    }
    @scala.inline
    def withStart(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Start")(js.undefined)
        ret
    }
  }
  
}

