package typingsSlinky.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSkillsRequest extends js.Object {
  /**
    * Whether the skill is enabled under the user's account.
    */
  var EnablementType: js.UndefOr[EnablementTypeFilter] = js.native
  /**
    * The maximum number of results to include in the response. If more results exist than the specified MaxResults value, a token is included in the response so that the remaining results can be retrieved.
    */
  var MaxResults: js.UndefOr[SkillListMaxResults] = js.native
  /**
    * An optional token returned from a prior request. Use this token for pagination of results from this action. If this parameter is specified, the response includes only results beyond the token, up to the value specified by MaxResults.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.NextToken] = js.native
  /**
    * The ARN of the skill group for which to list enabled skills.
    */
  var SkillGroupArn: js.UndefOr[Arn] = js.native
  /**
    * Whether the skill is publicly available or is a private skill.
    */
  var SkillType: js.UndefOr[SkillTypeFilter] = js.native
}

object ListSkillsRequest {
  @scala.inline
  def apply(): ListSkillsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSkillsRequest]
  }
  @scala.inline
  implicit class ListSkillsRequestOps[Self <: ListSkillsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnablementType(value: EnablementTypeFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnablementType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnablementType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnablementType")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxResults(value: SkillListMaxResults): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxResults")(js.undefined)
        ret
    }
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
    def withSkillGroupArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SkillGroupArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkillGroupArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SkillGroupArn")(js.undefined)
        ret
    }
    @scala.inline
    def withSkillType(value: SkillTypeFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SkillType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkillType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SkillType")(js.undefined)
        ret
    }
  }
  
}

