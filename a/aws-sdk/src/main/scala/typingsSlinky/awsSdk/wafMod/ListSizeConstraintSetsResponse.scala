package typingsSlinky.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSizeConstraintSetsResponse extends js.Object {
  /**
    * If you have more SizeConstraintSet objects than the number that you specified for Limit in the request, the response includes a NextMarker value. To list more SizeConstraintSet objects, submit another ListSizeConstraintSets request, and specify the NextMarker value from the response in the NextMarker value in the next request.
    */
  var NextMarker: js.UndefOr[typingsSlinky.awsSdk.wafMod.NextMarker] = js.native
  /**
    * An array of SizeConstraintSetSummary objects.
    */
  var SizeConstraintSets: js.UndefOr[SizeConstraintSetSummaries] = js.native
}

object ListSizeConstraintSetsResponse {
  @scala.inline
  def apply(): ListSizeConstraintSetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSizeConstraintSetsResponse]
  }
  @scala.inline
  implicit class ListSizeConstraintSetsResponseOps[Self <: ListSizeConstraintSetsResponse] (val x: Self) extends AnyVal {
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
    def withSizeConstraintSets(value: SizeConstraintSetSummaries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SizeConstraintSets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizeConstraintSets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SizeConstraintSets")(js.undefined)
        ret
    }
  }
  
}

