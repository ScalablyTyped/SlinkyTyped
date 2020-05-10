package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifySnapshotAttributeRequest extends js.Object {
  /**
    * The snapshot attribute to modify. Only volume creation permissions can be modified.
    */
  var Attribute: js.UndefOr[SnapshotAttributeName] = js.native
  /**
    * A JSON representation of the snapshot attribute modification.
    */
  var CreateVolumePermission: js.UndefOr[CreateVolumePermissionModifications] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The group to modify for the snapshot.
    */
  var GroupNames: js.UndefOr[GroupNameStringList] = js.native
  /**
    * The type of operation to perform to the attribute.
    */
  var OperationType: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.OperationType] = js.native
  /**
    * The ID of the snapshot.
    */
  var SnapshotId: typingsSlinky.awsSdk.ec2Mod.SnapshotId = js.native
  /**
    * The account ID to modify for the snapshot.
    */
  var UserIds: js.UndefOr[UserIdStringList] = js.native
}

object ModifySnapshotAttributeRequest {
  @scala.inline
  def apply(SnapshotId: SnapshotId): ModifySnapshotAttributeRequest = {
    val __obj = js.Dynamic.literal(SnapshotId = SnapshotId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifySnapshotAttributeRequest]
  }
  @scala.inline
  implicit class ModifySnapshotAttributeRequestOps[Self <: ModifySnapshotAttributeRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSnapshotId(value: SnapshotId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnapshotId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttribute(value: SnapshotAttributeName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attribute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttribute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attribute")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateVolumePermission(value: CreateVolumePermissionModifications): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreateVolumePermission")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateVolumePermission: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreateVolumePermission")(js.undefined)
        ret
    }
    @scala.inline
    def withDryRun(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DryRun")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDryRun: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DryRun")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupNames(value: GroupNameStringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupNames")(js.undefined)
        ret
    }
    @scala.inline
    def withOperationType(value: OperationType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OperationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperationType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OperationType")(js.undefined)
        ret
    }
    @scala.inline
    def withUserIds(value: UserIdStringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserIds")(js.undefined)
        ret
    }
  }
  
}

