package typingsSlinky.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListRateBasedRulesRequest extends js.Object {
  /**
    * Specifies the number of Rules that you want AWS WAF to return for this request. If you have more Rules than the number that you specify for Limit, the response includes a NextMarker value that you can use to get another batch of Rules.
    */
  var Limit: js.UndefOr[PaginationLimit] = js.native
  /**
    * If you specify a value for Limit and you have more Rules than the value of Limit, AWS WAF returns a NextMarker value in the response that allows you to list another group of Rules. For the second and subsequent ListRateBasedRules requests, specify the value of NextMarker from the previous response to get information about another batch of Rules.
    */
  var NextMarker: js.UndefOr[typingsSlinky.awsSdk.wafregionalMod.NextMarker] = js.native
}

object ListRateBasedRulesRequest {
  @scala.inline
  def apply(): ListRateBasedRulesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRateBasedRulesRequest]
  }
  @scala.inline
  implicit class ListRateBasedRulesRequestOps[Self <: ListRateBasedRulesRequest] (val x: Self) extends AnyVal {
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

