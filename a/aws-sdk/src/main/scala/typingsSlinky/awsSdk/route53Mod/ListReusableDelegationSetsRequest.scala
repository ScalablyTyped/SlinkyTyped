package typingsSlinky.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListReusableDelegationSetsRequest extends js.Object {
  /**
    * If the value of IsTruncated in the previous response was true, you have more reusable delegation sets. To get another group, submit another ListReusableDelegationSets request.  For the value of marker, specify the value of NextMarker from the previous response, which is the ID of the first reusable delegation set that Amazon Route 53 will return if you submit another request. If the value of IsTruncated in the previous response was false, there are no more reusable delegation sets to get.
    */
  var Marker: js.UndefOr[PageMarker] = js.native
  /**
    * The number of reusable delegation sets that you want Amazon Route 53 to return in the response to this request. If you specify a value greater than 100, Route 53 returns only the first 100 reusable delegation sets.
    */
  var MaxItems: js.UndefOr[PageMaxItems] = js.native
}

object ListReusableDelegationSetsRequest {
  @scala.inline
  def apply(): ListReusableDelegationSetsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListReusableDelegationSetsRequest]
  }
  @scala.inline
  implicit class ListReusableDelegationSetsRequestOps[Self <: ListReusableDelegationSetsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

