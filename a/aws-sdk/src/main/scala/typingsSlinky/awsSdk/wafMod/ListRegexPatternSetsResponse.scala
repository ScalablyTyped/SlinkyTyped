package typingsSlinky.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListRegexPatternSetsResponse extends js.Object {
  /**
    * If you have more RegexPatternSet objects than the number that you specified for Limit in the request, the response includes a NextMarker value. To list more RegexPatternSet objects, submit another ListRegexPatternSets request, and specify the NextMarker value from the response in the NextMarker value in the next request.
    */
  var NextMarker: js.UndefOr[typingsSlinky.awsSdk.wafMod.NextMarker] = js.native
  /**
    * An array of RegexPatternSetSummary objects.
    */
  var RegexPatternSets: js.UndefOr[RegexPatternSetSummaries] = js.native
}

object ListRegexPatternSetsResponse {
  @scala.inline
  def apply(): ListRegexPatternSetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRegexPatternSetsResponse]
  }
  @scala.inline
  implicit class ListRegexPatternSetsResponseOps[Self <: ListRegexPatternSetsResponse] (val x: Self) extends AnyVal {
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
    def withRegexPatternSets(value: RegexPatternSetSummaries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegexPatternSets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegexPatternSets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegexPatternSets")(js.undefined)
        ret
    }
  }
  
}

