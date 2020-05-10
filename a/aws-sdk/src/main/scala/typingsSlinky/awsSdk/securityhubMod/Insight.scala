package typingsSlinky.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Insight extends js.Object {
  /**
    * One or more attributes used to filter the findings included in the insight. The insight only includes findings that match the criteria defined in the filters.
    */
  var Filters: AwsSecurityFindingFilters = js.native
  /**
    * The attribute that the insight's findings are grouped by. This attribute is used as a findings aggregator for the purposes of viewing and managing multiple related findings under a single operand.
    */
  var GroupByAttribute: NonEmptyString = js.native
  /**
    * The ARN of a Security Hub insight.
    */
  var InsightArn: NonEmptyString = js.native
  /**
    * The name of a Security Hub insight.
    */
  var Name: NonEmptyString = js.native
}

object Insight {
  @scala.inline
  def apply(
    Filters: AwsSecurityFindingFilters,
    GroupByAttribute: NonEmptyString,
    InsightArn: NonEmptyString,
    Name: NonEmptyString
  ): Insight = {
    val __obj = js.Dynamic.literal(Filters = Filters.asInstanceOf[js.Any], GroupByAttribute = GroupByAttribute.asInstanceOf[js.Any], InsightArn = InsightArn.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Insight]
  }
  @scala.inline
  implicit class InsightOps[Self <: Insight] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilters(value: AwsSecurityFindingFilters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupByAttribute(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupByAttribute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInsightArn(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InsightArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

