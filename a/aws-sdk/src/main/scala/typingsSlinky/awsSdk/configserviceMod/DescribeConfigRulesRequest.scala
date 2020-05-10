package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeConfigRulesRequest extends js.Object {
  /**
    * The names of the AWS Config rules for which you want details. If you do not specify any names, AWS Config returns details for all your rules.
    */
  var ConfigRuleNames: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.ConfigRuleNames] = js.native
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object DescribeConfigRulesRequest {
  @scala.inline
  def apply(): DescribeConfigRulesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeConfigRulesRequest]
  }
  @scala.inline
  implicit class DescribeConfigRulesRequestOps[Self <: DescribeConfigRulesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigRuleNames(value: ConfigRuleNames): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigRuleNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigRuleNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigRuleNames")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: String): Self = {
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
  }
  
}

