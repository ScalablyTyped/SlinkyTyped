package typingsSlinky.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListRuleGroupsResponse extends js.Object {
  /**
    * If you have more RuleGroups than the number that you specified for Limit in the request, the response includes a NextMarker value. To list more RuleGroups, submit another ListRuleGroups request, and specify the NextMarker value from the response in the NextMarker value in the next request.
    */
  var NextMarker: js.UndefOr[typingsSlinky.awsSdk.wafregionalMod.NextMarker] = js.native
  /**
    * An array of RuleGroup objects.
    */
  var RuleGroups: js.UndefOr[RuleGroupSummaries] = js.native
}

object ListRuleGroupsResponse {
  @scala.inline
  def apply(): ListRuleGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRuleGroupsResponse]
  }
  @scala.inline
  implicit class ListRuleGroupsResponseOps[Self <: ListRuleGroupsResponse] (val x: Self) extends AnyVal {
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
    def withRuleGroups(value: RuleGroupSummaries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RuleGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuleGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RuleGroups")(js.undefined)
        ret
    }
  }
  
}

