package typingsSlinky.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListActivatedRulesInRuleGroupResponse extends js.Object {
  /**
    * An array of ActivatedRules objects.
    */
  var ActivatedRules: js.UndefOr[typingsSlinky.awsSdk.wafMod.ActivatedRules] = js.native
  /**
    * If you have more ActivatedRules than the number that you specified for Limit in the request, the response includes a NextMarker value. To list more ActivatedRules, submit another ListActivatedRulesInRuleGroup request, and specify the NextMarker value from the response in the NextMarker value in the next request.
    */
  var NextMarker: js.UndefOr[typingsSlinky.awsSdk.wafMod.NextMarker] = js.native
}

object ListActivatedRulesInRuleGroupResponse {
  @scala.inline
  def apply(): ListActivatedRulesInRuleGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListActivatedRulesInRuleGroupResponse]
  }
  @scala.inline
  implicit class ListActivatedRulesInRuleGroupResponseOps[Self <: ListActivatedRulesInRuleGroupResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivatedRules(value: ActivatedRules): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActivatedRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivatedRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActivatedRules")(js.undefined)
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

