package typingsSlinky.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateInsightRequest extends js.Object {
  /**
    * The updated filters that define this insight.
    */
  var Filters: js.UndefOr[AwsSecurityFindingFilters] = js.native
  /**
    * The updated GroupBy attribute that defines this insight.
    */
  var GroupByAttribute: js.UndefOr[NonEmptyString] = js.native
  /**
    * The ARN of the insight that you want to update.
    */
  var InsightArn: NonEmptyString = js.native
  /**
    * The updated name for the insight.
    */
  var Name: js.UndefOr[NonEmptyString] = js.native
}

object UpdateInsightRequest {
  @scala.inline
  def apply(InsightArn: NonEmptyString): UpdateInsightRequest = {
    val __obj = js.Dynamic.literal(InsightArn = InsightArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateInsightRequest]
  }
  @scala.inline
  implicit class UpdateInsightRequestOps[Self <: UpdateInsightRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInsightArn(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InsightArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilters(value: AwsSecurityFindingFilters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Filters")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupByAttribute(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupByAttribute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupByAttribute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupByAttribute")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
  }
  
}

