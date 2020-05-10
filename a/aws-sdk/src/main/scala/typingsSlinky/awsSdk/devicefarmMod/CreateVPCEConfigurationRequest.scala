package typingsSlinky.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateVPCEConfigurationRequest extends js.Object {
  /**
    * The DNS name of the service running in your VPC that you want Device Farm to test.
    */
  var serviceDnsName: ServiceDnsName = js.native
  /**
    * An optional description that provides details about your VPC endpoint configuration.
    */
  var vpceConfigurationDescription: js.UndefOr[VPCEConfigurationDescription] = js.native
  /**
    * The friendly name you give to your VPC endpoint configuration, to manage your configurations more easily.
    */
  var vpceConfigurationName: VPCEConfigurationName = js.native
  /**
    * The name of the VPC endpoint service running in your AWS account that you want Device Farm to test.
    */
  var vpceServiceName: VPCEServiceName = js.native
}

object CreateVPCEConfigurationRequest {
  @scala.inline
  def apply(
    serviceDnsName: ServiceDnsName,
    vpceConfigurationName: VPCEConfigurationName,
    vpceServiceName: VPCEServiceName
  ): CreateVPCEConfigurationRequest = {
    val __obj = js.Dynamic.literal(serviceDnsName = serviceDnsName.asInstanceOf[js.Any], vpceConfigurationName = vpceConfigurationName.asInstanceOf[js.Any], vpceServiceName = vpceServiceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVPCEConfigurationRequest]
  }
  @scala.inline
  implicit class CreateVPCEConfigurationRequestOps[Self <: CreateVPCEConfigurationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withServiceDnsName(value: ServiceDnsName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceDnsName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVpceConfigurationName(value: VPCEConfigurationName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpceConfigurationName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVpceServiceName(value: VPCEServiceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpceServiceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVpceConfigurationDescription(value: VPCEConfigurationDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpceConfigurationDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpceConfigurationDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpceConfigurationDescription")(js.undefined)
        ret
    }
  }
  
}

