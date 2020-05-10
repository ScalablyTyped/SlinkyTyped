package typingsSlinky.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpcConfigurationUpdate extends js.Object {
  /**
    * Describes updates to the array of SecurityGroup IDs used by the VPC configuration.
    */
  var SecurityGroupIdUpdates: js.UndefOr[SecurityGroupIds] = js.native
  /**
    * Describes updates to the array of Subnet IDs used by the VPC configuration.
    */
  var SubnetIdUpdates: js.UndefOr[SubnetIds] = js.native
  /**
    * Describes an update to the ID of the VPC configuration.
    */
  var VpcConfigurationId: Id = js.native
}

object VpcConfigurationUpdate {
  @scala.inline
  def apply(VpcConfigurationId: Id): VpcConfigurationUpdate = {
    val __obj = js.Dynamic.literal(VpcConfigurationId = VpcConfigurationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcConfigurationUpdate]
  }
  @scala.inline
  implicit class VpcConfigurationUpdateOps[Self <: VpcConfigurationUpdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVpcConfigurationId(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcConfigurationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecurityGroupIdUpdates(value: SecurityGroupIds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecurityGroupIdUpdates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityGroupIdUpdates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecurityGroupIdUpdates")(js.undefined)
        ret
    }
    @scala.inline
    def withSubnetIdUpdates(value: SubnetIds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubnetIdUpdates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubnetIdUpdates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubnetIdUpdates")(js.undefined)
        ret
    }
  }
  
}

