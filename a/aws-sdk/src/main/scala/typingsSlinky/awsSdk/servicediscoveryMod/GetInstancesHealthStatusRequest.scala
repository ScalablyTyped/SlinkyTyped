package typingsSlinky.awsSdk.servicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInstancesHealthStatusRequest extends js.Object {
  /**
    * An array that contains the IDs of all the instances that you want to get the health status for. If you omit Instances, AWS Cloud Map returns the health status for all the instances that are associated with the specified service.  To get the IDs for the instances that you've registered by using a specified service, submit a ListInstances request. 
    */
  var Instances: js.UndefOr[InstanceIdList] = js.native
  /**
    * The maximum number of instances that you want AWS Cloud Map to return in the response to a GetInstancesHealthStatus request. If you don't specify a value for MaxResults, AWS Cloud Map returns up to 100 instances.
    */
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.servicediscoveryMod.MaxResults] = js.native
  /**
    * For the first GetInstancesHealthStatus request, omit this value. If more than MaxResults instances match the specified criteria, you can submit another GetInstancesHealthStatus request to get the next group of results. Specify the value of NextToken from the previous response in the next request.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.servicediscoveryMod.NextToken] = js.native
  /**
    * The ID of the service that the instance is associated with.
    */
  var ServiceId: ResourceId = js.native
}

object GetInstancesHealthStatusRequest {
  @scala.inline
  def apply(ServiceId: ResourceId): GetInstancesHealthStatusRequest = {
    val __obj = js.Dynamic.literal(ServiceId = ServiceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInstancesHealthStatusRequest]
  }
  @scala.inline
  implicit class GetInstancesHealthStatusRequestOps[Self <: GetInstancesHealthStatusRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withServiceId(value: ResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstances(value: InstanceIdList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Instances")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstances: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Instances")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxResults(value: MaxResults): Self = {
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
  }
  
}

