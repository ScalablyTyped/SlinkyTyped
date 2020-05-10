package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeNetworkInterfacePermissionsRequest extends js.Object {
  /**
    * One or more filters.    network-interface-permission.network-interface-permission-id - The ID of the permission.    network-interface-permission.network-interface-id - The ID of the network interface.    network-interface-permission.aws-account-id - The AWS account ID.    network-interface-permission.aws-service - The AWS service.    network-interface-permission.permission - The type of permission (INSTANCE-ATTACH | EIP-ASSOCIATE).  
    */
  var Filters: js.UndefOr[FilterList] = js.native
  /**
    * The maximum number of results to return in a single call. To retrieve the remaining results, make another call with the returned NextToken value. If this parameter is not specified, up to 50 results are returned by default.
    */
  var MaxResults: js.UndefOr[DescribeNetworkInterfacePermissionsMaxResults] = js.native
  /**
    * One or more network interface permission IDs.
    */
  var NetworkInterfacePermissionIds: js.UndefOr[NetworkInterfacePermissionIdList] = js.native
  /**
    * The token to request the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object DescribeNetworkInterfacePermissionsRequest {
  @scala.inline
  def apply(): DescribeNetworkInterfacePermissionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeNetworkInterfacePermissionsRequest]
  }
  @scala.inline
  implicit class DescribeNetworkInterfacePermissionsRequestOps[Self <: DescribeNetworkInterfacePermissionsRequest] (val x: Self) extends AnyVal {
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
    def withMaxResults(value: DescribeNetworkInterfacePermissionsMaxResults): Self = {
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
    def withNetworkInterfacePermissionIds(value: NetworkInterfacePermissionIdList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkInterfacePermissionIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkInterfacePermissionIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkInterfacePermissionIds")(js.undefined)
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

