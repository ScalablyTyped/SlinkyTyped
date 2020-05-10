package typingsSlinky.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpcConfiguration extends js.Object {
  /**
    * The array of SecurityGroup IDs used by the VPC configuration.
    */
  var SecurityGroupIds: typingsSlinky.awsSdk.kinesisanalyticsv2Mod.SecurityGroupIds = js.native
  /**
    * The array of Subnet IDs used by the VPC configuration.
    */
  var SubnetIds: typingsSlinky.awsSdk.kinesisanalyticsv2Mod.SubnetIds = js.native
}

object VpcConfiguration {
  @scala.inline
  def apply(SecurityGroupIds: SecurityGroupIds, SubnetIds: SubnetIds): VpcConfiguration = {
    val __obj = js.Dynamic.literal(SecurityGroupIds = SecurityGroupIds.asInstanceOf[js.Any], SubnetIds = SubnetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcConfiguration]
  }
  @scala.inline
  implicit class VpcConfigurationOps[Self <: VpcConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSecurityGroupIds(value: SecurityGroupIds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecurityGroupIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubnetIds(value: SubnetIds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubnetIds")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

