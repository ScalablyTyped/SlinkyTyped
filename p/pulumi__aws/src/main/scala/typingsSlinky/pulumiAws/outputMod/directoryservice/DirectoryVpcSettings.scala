package typingsSlinky.pulumiAws.outputMod.directoryservice

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectoryVpcSettings extends js.Object {
  /**
    * The identifiers of the subnets for the directory servers (2 subnets in 2 different AZs).
    */
  var subnetIds: js.Array[String] = js.native
  /**
    * The identifier of the VPC that the directory is in.
    */
  var vpcId: String = js.native
}

object DirectoryVpcSettings {
  @scala.inline
  def apply(subnetIds: js.Array[String], vpcId: String): DirectoryVpcSettings = {
    val __obj = js.Dynamic.literal(subnetIds = subnetIds.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectoryVpcSettings]
  }
  @scala.inline
  implicit class DirectoryVpcSettingsOps[Self <: DirectoryVpcSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

