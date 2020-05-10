package typingsSlinky.awsSdk.servicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiscoverInstancesRequest extends js.Object {
  /**
    * The health status of the instances that you want to discover.
    */
  var HealthStatus: js.UndefOr[HealthStatusFilter] = js.native
  /**
    * The maximum number of instances that you want Cloud Map to return in the response to a DiscoverInstances request. If you don't specify a value for MaxResults, Cloud Map returns up to 100 instances.
    */
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.servicediscoveryMod.MaxResults] = js.native
  /**
    * The name of the namespace that you specified when you registered the instance.
    */
  var NamespaceName: typingsSlinky.awsSdk.servicediscoveryMod.NamespaceName = js.native
  /**
    * A string map that contains attributes with values that you can use to filter instances by any custom attribute that you specified when you registered the instance. Only instances that match all the specified key/value pairs will be returned.
    */
  var QueryParameters: js.UndefOr[Attributes] = js.native
  /**
    * The name of the service that you specified when you registered the instance.
    */
  var ServiceName: typingsSlinky.awsSdk.servicediscoveryMod.ServiceName = js.native
}

object DiscoverInstancesRequest {
  @scala.inline
  def apply(NamespaceName: NamespaceName, ServiceName: ServiceName): DiscoverInstancesRequest = {
    val __obj = js.Dynamic.literal(NamespaceName = NamespaceName.asInstanceOf[js.Any], ServiceName = ServiceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiscoverInstancesRequest]
  }
  @scala.inline
  implicit class DiscoverInstancesRequestOps[Self <: DiscoverInstancesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNamespaceName(value: NamespaceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NamespaceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServiceName(value: ServiceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHealthStatus(value: HealthStatusFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HealthStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHealthStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HealthStatus")(js.undefined)
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
    def withQueryParameters(value: Attributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QueryParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QueryParameters")(js.undefined)
        ret
    }
  }
  
}

