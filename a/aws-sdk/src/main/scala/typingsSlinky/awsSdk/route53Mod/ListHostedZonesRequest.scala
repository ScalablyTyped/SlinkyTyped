package typingsSlinky.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListHostedZonesRequest extends js.Object {
  /**
    * If you're using reusable delegation sets and you want to list all of the hosted zones that are associated with a reusable delegation set, specify the ID of that reusable delegation set. 
    */
  var DelegationSetId: js.UndefOr[ResourceId] = js.native
  /**
    * If the value of IsTruncated in the previous response was true, you have more hosted zones. To get more hosted zones, submit another ListHostedZones request.  For the value of marker, specify the value of NextMarker from the previous response, which is the ID of the first hosted zone that Amazon Route 53 will return if you submit another request. If the value of IsTruncated in the previous response was false, there are no more hosted zones to get.
    */
  var Marker: js.UndefOr[PageMarker] = js.native
  /**
    * (Optional) The maximum number of hosted zones that you want Amazon Route 53 to return. If you have more than maxitems hosted zones, the value of IsTruncated in the response is true, and the value of NextMarker is the hosted zone ID of the first hosted zone that Route 53 will return if you submit another request.
    */
  var MaxItems: js.UndefOr[PageMaxItems] = js.native
}

object ListHostedZonesRequest {
  @scala.inline
  def apply(): ListHostedZonesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListHostedZonesRequest]
  }
  @scala.inline
  implicit class ListHostedZonesRequestOps[Self <: ListHostedZonesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelegationSetId(value: ResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DelegationSetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelegationSetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DelegationSetId")(js.undefined)
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
  }
  
}

