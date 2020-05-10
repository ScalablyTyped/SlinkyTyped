package typingsSlinky.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSqlInjectionMatchSetsResponse extends js.Object {
  /**
    * If you have more SqlInjectionMatchSet objects than the number that you specified for Limit in the request, the response includes a NextMarker value. To list more SqlInjectionMatchSet objects, submit another ListSqlInjectionMatchSets request, and specify the NextMarker value from the response in the NextMarker value in the next request.
    */
  var NextMarker: js.UndefOr[typingsSlinky.awsSdk.wafMod.NextMarker] = js.native
  /**
    * An array of SqlInjectionMatchSetSummary objects.
    */
  var SqlInjectionMatchSets: js.UndefOr[SqlInjectionMatchSetSummaries] = js.native
}

object ListSqlInjectionMatchSetsResponse {
  @scala.inline
  def apply(): ListSqlInjectionMatchSetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSqlInjectionMatchSetsResponse]
  }
  @scala.inline
  implicit class ListSqlInjectionMatchSetsResponseOps[Self <: ListSqlInjectionMatchSetsResponse] (val x: Self) extends AnyVal {
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
    def withSqlInjectionMatchSets(value: SqlInjectionMatchSetSummaries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SqlInjectionMatchSets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSqlInjectionMatchSets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SqlInjectionMatchSets")(js.undefined)
        ret
    }
  }
  
}

