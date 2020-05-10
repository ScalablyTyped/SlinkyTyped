package typingsSlinky.awsSdk.resourcegroupstaggingapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetComplianceSummaryInput extends js.Object {
  /**
    * A list of attributes to group the counts of noncompliant resources by. If supplied, the counts are sorted by those attributes.
    */
  var GroupBy: js.UndefOr[typingsSlinky.awsSdk.resourcegroupstaggingapiMod.GroupBy] = js.native
  /**
    * A limit that restricts the number of results that are returned per page.
    */
  var MaxResults: js.UndefOr[MaxResultsGetComplianceSummary] = js.native
  /**
    * A string that indicates that additional data is available. Leave this value empty for your initial request. If the response includes a PaginationToken, use that string for this value to request an additional page of data.
    */
  var PaginationToken: js.UndefOr[typingsSlinky.awsSdk.resourcegroupstaggingapiMod.PaginationToken] = js.native
  /**
    * A list of Regions to limit the output by. If you use this parameter, the count of returned noncompliant resources includes only resources in the specified Regions.
    */
  var RegionFilters: js.UndefOr[RegionFilterList] = js.native
  /**
    * The constraints on the resources that you want returned. The format of each resource type is service[:resourceType]. For example, specifying a resource type of ec2 returns all Amazon EC2 resources (which includes EC2 instances). Specifying a resource type of ec2:instance returns only EC2 instances.  The string for each service name and resource type is the same as that embedded in a resource's Amazon Resource Name (ARN). Consult the AWS General Reference for the following:   For a list of service name strings, see AWS Service Namespaces.   For resource type strings, see Example ARNs.   For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces.   You can specify multiple resource types by using an array. The array can include up to 100 items. Note that the length constraint requirement applies to each resource type filter. 
    */
  var ResourceTypeFilters: js.UndefOr[ResourceTypeFilterList] = js.native
  /**
    * A list of tag keys to limit the output by. If you use this parameter, the count of returned noncompliant resources includes only resources that have the specified tag keys.
    */
  var TagKeyFilters: js.UndefOr[TagKeyFilterList] = js.native
  /**
    * The target identifiers (usually, specific account IDs) to limit the output by. If you use this parameter, the count of returned noncompliant resources includes only resources with the specified target IDs.
    */
  var TargetIdFilters: js.UndefOr[TargetIdFilterList] = js.native
}

object GetComplianceSummaryInput {
  @scala.inline
  def apply(): GetComplianceSummaryInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetComplianceSummaryInput]
  }
  @scala.inline
  implicit class GetComplianceSummaryInputOps[Self <: GetComplianceSummaryInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroupBy(value: GroupBy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupBy")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxResults(value: MaxResultsGetComplianceSummary): Self = {
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
    def withPaginationToken(value: PaginationToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PaginationToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaginationToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PaginationToken")(js.undefined)
        ret
    }
    @scala.inline
    def withRegionFilters(value: RegionFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegionFilters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegionFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegionFilters")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceTypeFilters(value: ResourceTypeFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceTypeFilters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceTypeFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceTypeFilters")(js.undefined)
        ret
    }
    @scala.inline
    def withTagKeyFilters(value: TagKeyFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TagKeyFilters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagKeyFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TagKeyFilters")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetIdFilters(value: TargetIdFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetIdFilters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetIdFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetIdFilters")(js.undefined)
        ret
    }
  }
  
}

