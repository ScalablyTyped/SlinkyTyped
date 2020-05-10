package typingsSlinky.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchSkillGroupsResponse extends js.Object {
  /**
    * The token returned to indicate that there is more data available.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.NextToken] = js.native
  /**
    * The skill groups that meet the filter criteria, in sort order.
    */
  var SkillGroups: js.UndefOr[SkillGroupDataList] = js.native
  /**
    * The total number of skill groups returned.
    */
  var TotalCount: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.TotalCount] = js.native
}

object SearchSkillGroupsResponse {
  @scala.inline
  def apply(): SearchSkillGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchSkillGroupsResponse]
  }
  @scala.inline
  implicit class SearchSkillGroupsResponseOps[Self <: SearchSkillGroupsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
    @scala.inline
    def withSkillGroups(value: SkillGroupDataList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SkillGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkillGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SkillGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalCount(value: TotalCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalCount")(js.undefined)
        ret
    }
  }
  
}

