package typingsSlinky.awsSdk.servicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Service extends js.Object {
  /**
    * The Amazon Resource Name (ARN) that AWS Cloud Map assigns to the service when you create it.
    */
  var Arn: js.UndefOr[typingsSlinky.awsSdk.servicediscoveryMod.Arn] = js.native
  /**
    * The date and time that the service was created, in Unix format and Coordinated Universal Time (UTC). The value of CreateDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
    */
  var CreateDate: js.UndefOr[js.Date] = js.native
  /**
    * A unique string that identifies the request and that allows failed requests to be retried without the risk of executing the operation twice. CreatorRequestId can be any unique string, for example, a date/time stamp.
    */
  var CreatorRequestId: js.UndefOr[ResourceId] = js.native
  /**
    * The description of the service.
    */
  var Description: js.UndefOr[ResourceDescription] = js.native
  /**
    * A complex type that contains information about the Route 53 DNS records that you want AWS Cloud Map to create when you register an instance.
    */
  var DnsConfig: js.UndefOr[typingsSlinky.awsSdk.servicediscoveryMod.DnsConfig] = js.native
  /**
    *  Public DNS namespaces only. A complex type that contains settings for an optional health check. If you specify settings for a health check, AWS Cloud Map associates the health check with the records that you specify in DnsConfig. For information about the charges for health checks, see Amazon Route 53 Pricing.
    */
  var HealthCheckConfig: js.UndefOr[typingsSlinky.awsSdk.servicediscoveryMod.HealthCheckConfig] = js.native
  /**
    * A complex type that contains information about an optional custom health check.  If you specify a health check configuration, you can specify either HealthCheckCustomConfig or HealthCheckConfig but not both. 
    */
  var HealthCheckCustomConfig: js.UndefOr[typingsSlinky.awsSdk.servicediscoveryMod.HealthCheckCustomConfig] = js.native
  /**
    * The ID that AWS Cloud Map assigned to the service when you created it.
    */
  var Id: js.UndefOr[ResourceId] = js.native
  /**
    * The number of instances that are currently associated with the service. Instances that were previously associated with the service but that have been deleted are not included in the count.
    */
  var InstanceCount: js.UndefOr[ResourceCount] = js.native
  /**
    * The name of the service.
    */
  var Name: js.UndefOr[ServiceName] = js.native
  /**
    * The ID of the namespace that was used to create the service.
    */
  var NamespaceId: js.UndefOr[ResourceId] = js.native
}

object Service {
  @scala.inline
  def apply(): Service = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Service]
  }
  @scala.inline
  implicit class ServiceOps[Self <: Service] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreateDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreateDate")(js.undefined)
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
    def withId(value: ResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceCount(value: ResourceCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceCount")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: ServiceName): Self = {
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

