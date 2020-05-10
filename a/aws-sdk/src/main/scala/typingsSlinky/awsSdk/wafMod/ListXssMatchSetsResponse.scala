package typingsSlinky.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListXssMatchSetsResponse extends js.Object {
  /**
    * If you have more XssMatchSet objects than the number that you specified for Limit in the request, the response includes a NextMarker value. To list more XssMatchSet objects, submit another ListXssMatchSets request, and specify the NextMarker value from the response in the NextMarker value in the next request.
    */
  var NextMarker: js.UndefOr[typingsSlinky.awsSdk.wafMod.NextMarker] = js.native
  /**
    * An array of XssMatchSetSummary objects.
    */
  var XssMatchSets: js.UndefOr[XssMatchSetSummaries] = js.native
}

object ListXssMatchSetsResponse {
  @scala.inline
  def apply(): ListXssMatchSetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListXssMatchSetsResponse]
  }
  @scala.inline
  implicit class ListXssMatchSetsResponseOps[Self <: ListXssMatchSetsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withXssMatchSets(value: XssMatchSetSummaries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("XssMatchSets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXssMatchSets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("XssMatchSets")(js.undefined)
        ret
    }
  }
  
}

