package typingsSlinky.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListByteMatchSetsRequest extends js.Object {
  /**
    * Specifies the number of ByteMatchSet objects that you want AWS WAF to return for this request. If you have more ByteMatchSets objects than the number you specify for Limit, the response includes a NextMarker value that you can use to get another batch of ByteMatchSet objects.
    */
  var Limit: js.UndefOr[PaginationLimit] = js.native
  /**
    * If you specify a value for Limit and you have more ByteMatchSets than the value of Limit, AWS WAF returns a NextMarker value in the response that allows you to list another group of ByteMatchSets. For the second and subsequent ListByteMatchSets requests, specify the value of NextMarker from the previous response to get information about another batch of ByteMatchSets.
    */
  var NextMarker: js.UndefOr[typingsSlinky.awsSdk.wafMod.NextMarker] = js.native
}

object ListByteMatchSetsRequest {
  @scala.inline
  def apply(): ListByteMatchSetsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListByteMatchSetsRequest]
  }
  @scala.inline
  implicit class ListByteMatchSetsRequestOps[Self <: ListByteMatchSetsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLimit(value: PaginationLimit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Limit")(js.undefined)
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

