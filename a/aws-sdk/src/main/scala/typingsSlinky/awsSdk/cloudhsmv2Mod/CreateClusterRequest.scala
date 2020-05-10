package typingsSlinky.awsSdk.cloudhsmv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateClusterRequest extends js.Object {
  /**
    * The type of HSM to use in the cluster. Currently the only allowed value is hsm1.medium.
    */
  var HsmType: typingsSlinky.awsSdk.cloudhsmv2Mod.HsmType = js.native
  /**
    * The identifier (ID) of the cluster backup to restore. Use this value to restore the cluster from a backup instead of creating a new cluster. To find the backup ID, use DescribeBackups.
    */
  var SourceBackupId: js.UndefOr[BackupId] = js.native
  /**
    * The identifiers (IDs) of the subnets where you are creating the cluster. You must specify at least one subnet. If you specify multiple subnets, they must meet the following criteria:   All subnets must be in the same virtual private cloud (VPC).   You can specify only one subnet per Availability Zone.  
    */
  var SubnetIds: typingsSlinky.awsSdk.cloudhsmv2Mod.SubnetIds = js.native
  var TagList: js.UndefOr[typingsSlinky.awsSdk.cloudhsmv2Mod.TagList] = js.native
}

object CreateClusterRequest {
  @scala.inline
  def apply(HsmType: HsmType, SubnetIds: SubnetIds): CreateClusterRequest = {
    val __obj = js.Dynamic.literal(HsmType = HsmType.asInstanceOf[js.Any], SubnetIds = SubnetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateClusterRequest]
  }
  @scala.inline
  implicit class CreateClusterRequestOps[Self <: CreateClusterRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHsmType(value: HsmType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HsmType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubnetIds(value: SubnetIds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubnetIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceBackupId(value: BackupId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceBackupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceBackupId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceBackupId")(js.undefined)
        ret
    }
    @scala.inline
    def withTagList(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TagList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TagList")(js.undefined)
        ret
    }
  }
  
}

