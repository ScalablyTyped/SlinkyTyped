package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateVpcEndpointServiceConfigurationResult extends js.Object {
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var ClientToken: js.UndefOr[String] = js.native
  /**
    * Information about the service configuration.
    */
  var ServiceConfiguration: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.ServiceConfiguration] = js.native
}

object CreateVpcEndpointServiceConfigurationResult {
  @scala.inline
  def apply(): CreateVpcEndpointServiceConfigurationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateVpcEndpointServiceConfigurationResult]
  }
  @scala.inline
  implicit class CreateVpcEndpointServiceConfigurationResultOps[Self <: CreateVpcEndpointServiceConfigurationResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientToken")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceConfiguration(value: ServiceConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceConfiguration")(js.undefined)
        ret
    }
  }
  
}

