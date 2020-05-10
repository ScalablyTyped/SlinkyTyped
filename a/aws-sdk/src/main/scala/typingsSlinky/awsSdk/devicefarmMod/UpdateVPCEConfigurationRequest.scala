package typingsSlinky.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateVPCEConfigurationRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the VPC endpoint configuration you want to update.
    */
  var arn: AmazonResourceName = js.native
  /**
    * The DNS (domain) name used to connect to your private service in your VPC. The DNS name must not already be in use on the internet.
    */
  var serviceDnsName: js.UndefOr[ServiceDnsName] = js.native
  /**
    * An optional description that provides details about your VPC endpoint configuration.
    */
  var vpceConfigurationDescription: js.UndefOr[VPCEConfigurationDescription] = js.native
  /**
    * The friendly name you give to your VPC endpoint configuration to manage your configurations more easily.
    */
  var vpceConfigurationName: js.UndefOr[VPCEConfigurationName] = js.native
  /**
    * The name of the VPC endpoint service running in your AWS account that you want Device Farm to test.
    */
  var vpceServiceName: js.UndefOr[VPCEServiceName] = js.native
}

object UpdateVPCEConfigurationRequest {
  @scala.inline
  def apply(arn: AmazonResourceName): UpdateVPCEConfigurationRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateVPCEConfigurationRequest]
  }
  @scala.inline
  implicit class UpdateVPCEConfigurationRequestOps[Self <: UpdateVPCEConfigurationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: AmazonResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServiceDnsName(value: ServiceDnsName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceDnsName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceDnsName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceDnsName")(js.undefined)
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
    @scala.inline
    def withVpceConfigurationName(value: VPCEConfigurationName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpceConfigurationName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpceConfigurationName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpceConfigurationName")(js.undefined)
        ret
    }
    @scala.inline
    def withVpceServiceName(value: VPCEServiceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpceServiceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpceServiceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpceServiceName")(js.undefined)
        ret
    }
  }
  
}

