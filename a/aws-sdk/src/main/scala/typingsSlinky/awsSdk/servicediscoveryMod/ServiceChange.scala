package typingsSlinky.awsSdk.servicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceChange extends js.Object {
  /**
    * A description for the service.
    */
  var Description: js.UndefOr[ResourceDescription] = js.native
  /**
    * A complex type that contains information about the Route 53 DNS records that you want AWS Cloud Map to create when you register an instance.
    */
  var DnsConfig: DnsConfigChange = js.native
  var HealthCheckConfig: js.UndefOr[typingsSlinky.awsSdk.servicediscoveryMod.HealthCheckConfig] = js.native
}

object ServiceChange {
  @scala.inline
  def apply(DnsConfig: DnsConfigChange): ServiceChange = {
    val __obj = js.Dynamic.literal(DnsConfig = DnsConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceChange]
  }
  @scala.inline
  implicit class ServiceChangeOps[Self <: ServiceChange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDnsConfig(value: DnsConfigChange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DnsConfig")(value.asInstanceOf[js.Any])
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
  }
  
}

