package typingsSlinky.awsSdk.servicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateServiceRequest extends js.Object {
  /**
    * A unique string that identifies the request and that allows failed CreateService requests to be retried without the risk of executing the operation twice. CreatorRequestId can be any unique string, for example, a date/time stamp.
    */
  var CreatorRequestId: js.UndefOr[ResourceId] = js.native
  /**
    * A description for the service.
    */
  var Description: js.UndefOr[ResourceDescription] = js.native
  /**
    * A complex type that contains information about the Amazon Route 53 records that you want AWS Cloud Map to create when you register an instance. 
    */
  var DnsConfig: js.UndefOr[typingsSlinky.awsSdk.servicediscoveryMod.DnsConfig] = js.native
  /**
    *  Public DNS namespaces only. A complex type that contains settings for an optional Route 53 health check. If you specify settings for a health check, AWS Cloud Map associates the health check with all the Route 53 DNS records that you specify in DnsConfig.  If you specify a health check configuration, you can specify either HealthCheckCustomConfig or HealthCheckConfig but not both.  For information about the charges for health checks, see AWS Cloud Map Pricing.
    */
  var HealthCheckConfig: js.UndefOr[typingsSlinky.awsSdk.servicediscoveryMod.HealthCheckConfig] = js.native
  /**
    * A complex type that contains information about an optional custom health check.  If you specify a health check configuration, you can specify either HealthCheckCustomConfig or HealthCheckConfig but not both. 
    */
  var HealthCheckCustomConfig: js.UndefOr[typingsSlinky.awsSdk.servicediscoveryMod.HealthCheckCustomConfig] = js.native
  /**
    * The name that you want to assign to the service.
    */
  var Name: ServiceName = js.native
  /**
    * The ID of the namespace that you want to use to create the service.
    */
  var NamespaceId: js.UndefOr[ResourceId] = js.native
}

object CreateServiceRequest {
  @scala.inline
  def apply(Name: ServiceName): CreateServiceRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateServiceRequest]
  }
  @scala.inline
  implicit class CreateServiceRequestOps[Self <: CreateServiceRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: ServiceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreatorRequestId(value: ResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatorRequestId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatorRequestId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatorRequestId")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: ResourceDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withDnsConfig(value: DnsConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DnsConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDnsConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DnsConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withHealthCheckConfig(value: HealthCheckConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HealthCheckConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHealthCheckConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HealthCheckConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withHealthCheckCustomConfig(value: HealthCheckCustomConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HealthCheckCustomConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHealthCheckCustomConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HealthCheckCustomConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withNamespaceId(value: ResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NamespaceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamespaceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NamespaceId")(js.undefined)
        ret
    }
  }
  
}

