package typingsSlinky.pulumiAws.outputMod.directoryservice

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDirectoryConnectSetting extends js.Object {
  /**
    * The DNS IP addresses of the domain to connect to.
    */
  var customerDnsIps: js.Array[String] = js.native
  /**
    * The username corresponding to the password provided.
    */
  var customerUsername: String = js.native
  /**
    * The identifiers of the subnets for the connector servers (2 subnets in 2 different AZs).
    */
  var subnetIds: js.Array[String] = js.native
  /**
    * The ID of the VPC that the connector is in.
    */
  var vpcId: String = js.native
}

object GetDirectoryConnectSetting {
  @scala.inline
  def apply(
    customerDnsIps: js.Array[String],
    customerUsername: String,
    subnetIds: js.Array[String],
    vpcId: String
  ): GetDirectoryConnectSetting = {
    val __obj = js.Dynamic.literal(customerDnsIps = customerDnsIps.asInstanceOf[js.Any], customerUsername = customerUsername.asInstanceOf[js.Any], subnetIds = subnetIds.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDirectoryConnectSetting]
  }
  @scala.inline
  implicit class GetDirectoryConnectSettingOps[Self <: GetDirectoryConnectSetting] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomerDnsIps(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customerDnsIps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomerUsername(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customerUsername")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubnetIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnetIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVpcId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpcId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

