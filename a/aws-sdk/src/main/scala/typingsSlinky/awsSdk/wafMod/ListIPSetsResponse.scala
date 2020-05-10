package typingsSlinky.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListIPSetsResponse extends js.Object {
  /**
    * An array of IPSetSummary objects.
    */
  var IPSets: js.UndefOr[IPSetSummaries] = js.native
  /**
    * To list more IPSet objects, submit another ListIPSets request, and in the next request use the NextMarker response value as the NextMarker value.
    */
  var NextMarker: js.UndefOr[typingsSlinky.awsSdk.wafMod.NextMarker] = js.native
}

object ListIPSetsResponse {
  @scala.inline
  def apply(): ListIPSetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListIPSetsResponse]
  }
  @scala.inline
  implicit class ListIPSetsResponseOps[Self <: ListIPSetsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIPSets(value: IPSetSummaries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IPSets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIPSets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IPSets")(js.undefined)
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

