package typingsSlinky.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateInsightRequest extends js.Object {
  /**
    * One or more attributes used to filter the findings included in the insight. The insight only includes findings that match the criteria defined in the filters.
    */
  var Filters: AwsSecurityFindingFilters = js.native
  /**
    * The attribute used as the aggregator to group related findings for the insight.
    */
  var GroupByAttribute: NonEmptyString = js.native
  /**
    * The name of the custom insight to create.
    */
  var Name: NonEmptyString = js.native
}

object CreateInsightRequest {
  @scala.inline
  def apply(Filters: AwsSecurityFindingFilters, GroupByAttribute: NonEmptyString, Name: NonEmptyString): CreateInsightRequest = {
    val __obj = js.Dynamic.literal(Filters = Filters.asInstanceOf[js.Any], GroupByAttribute = GroupByAttribute.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateInsightRequest]
  }
  @scala.inline
  implicit class CreateInsightRequestOps[Self <: CreateInsightRequest] (val x: Self) extends AnyVal {
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
    def withName(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

