package typingsSlinky.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListGeoMatchSetsResponse extends js.Object {
  /**
    * An array of GeoMatchSetSummary objects.
    */
  var GeoMatchSets: js.UndefOr[GeoMatchSetSummaries] = js.native
  /**
    * If you have more GeoMatchSet objects than the number that you specified for Limit in the request, the response includes a NextMarker value. To list more GeoMatchSet objects, submit another ListGeoMatchSets request, and specify the NextMarker value from the response in the NextMarker value in the next request.
    */
  var NextMarker: js.UndefOr[typingsSlinky.awsSdk.wafMod.NextMarker] = js.native
}

object ListGeoMatchSetsResponse {
  @scala.inline
  def apply(): ListGeoMatchSetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGeoMatchSetsResponse]
  }
  @scala.inline
  implicit class ListGeoMatchSetsResponseOps[Self <: ListGeoMatchSetsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGeoMatchSets(value: GeoMatchSetSummaries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GeoMatchSets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeoMatchSets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GeoMatchSets")(js.undefined)
        ret
    }
    @scala.inline
    def withNextMarker(value: NextMarker): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextMarker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextMarker")(js.undefined)
        ret
    }
  }
  
}

