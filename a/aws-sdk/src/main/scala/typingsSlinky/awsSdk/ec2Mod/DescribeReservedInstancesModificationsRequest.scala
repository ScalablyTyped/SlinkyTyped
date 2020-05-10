package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeReservedInstancesModificationsRequest extends js.Object {
  /**
    * One or more filters.    client-token - The idempotency token for the modification request.    create-date - The time when the modification request was created.    effective-date - The time when the modification becomes effective.    modification-result.reserved-instances-id - The ID for the Reserved Instances created as part of the modification request. This ID is only available when the status of the modification is fulfilled.    modification-result.target-configuration.availability-zone - The Availability Zone for the new Reserved Instances.    modification-result.target-configuration.instance-count  - The number of new Reserved Instances.    modification-result.target-configuration.instance-type - The instance type of the new Reserved Instances.    modification-result.target-configuration.platform - The network platform of the new Reserved Instances (EC2-Classic | EC2-VPC).    reserved-instances-id - The ID of the Reserved Instances modified.    reserved-instances-modification-id - The ID of the modification request.    status - The status of the Reserved Instances modification request (processing | fulfilled | failed).    status-message - The reason for the status.    update-date - The time when the modification request was last updated.  
    */
  var Filters: js.UndefOr[FilterList] = js.native
  /**
    * The token to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * IDs for the submitted modification request.
    */
  var ReservedInstancesModificationIds: js.UndefOr[ReservedInstancesModificationIdStringList] = js.native
}

object DescribeReservedInstancesModificationsRequest {
  @scala.inline
  def apply(): DescribeReservedInstancesModificationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeReservedInstancesModificationsRequest]
  }
  @scala.inline
  implicit class DescribeReservedInstancesModificationsRequestOps[Self <: DescribeReservedInstancesModificationsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilters(value: FilterList): Self = {
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
    @scala.inline
    def withReservedInstancesModificationIds(value: ReservedInstancesModificationIdStringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReservedInstancesModificationIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReservedInstancesModificationIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReservedInstancesModificationIds")(js.undefined)
        ret
    }
  }
  
}

