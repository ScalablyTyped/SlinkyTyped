package typingsSlinky.pulumiAws.inputMod.directoryservice

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectoryConnectSettings extends js.Object {
  /**
    * The DNS IP addresses of the domain to connect to.
    */
  var customerDnsIps: Input[js.Array[Input[String]]] = js.native
  /**
    * The username corresponding to the password provided.
    */
  var customerUsername: Input[String] = js.native
  /**
    * The identifiers of the subnets for the directory servers (2 subnets in 2 different AZs).
    */
  var subnetIds: Input[js.Array[Input[String]]] = js.native
  /**
    * The identifier of the VPC that the directory is in.
    */
  var vpcId: Input[String] = js.native
}

object DirectoryConnectSettings {
  @scala.inline
  def apply(
    customerDnsIps: Input[js.Array[Input[String]]],
    customerUsername: Input[String],
    subnetIds: Input[js.Array[Input[String]]],
    vpcId: Input[String]
  ): DirectoryConnectSettings = {
    val __obj = js.Dynamic.literal(customerDnsIps = customerDnsIps.asInstanceOf[js.Any], customerUsername = customerUsername.asInstanceOf[js.Any], subnetIds = subnetIds.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectoryConnectSettings]
  }
  @scala.inline
  implicit class DirectoryConnectSettingsOps[Self <: DirectoryConnectSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomerDnsIps(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customerDnsIps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomerUsername(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customerUsername")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubnetIds(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnetIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVpcId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpcId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

