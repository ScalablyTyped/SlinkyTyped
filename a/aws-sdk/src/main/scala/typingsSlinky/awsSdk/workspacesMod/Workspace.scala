package typingsSlinky.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Workspace extends js.Object {
  /**
    * The identifier of the bundle used to create the WorkSpace.
    */
  var BundleId: js.UndefOr[typingsSlinky.awsSdk.workspacesMod.BundleId] = js.native
  /**
    * The name of the WorkSpace, as seen by the operating system.
    */
  var ComputerName: js.UndefOr[typingsSlinky.awsSdk.workspacesMod.ComputerName] = js.native
  /**
    * The identifier of the AWS Directory Service directory for the WorkSpace.
    */
  var DirectoryId: js.UndefOr[typingsSlinky.awsSdk.workspacesMod.DirectoryId] = js.native
  /**
    * The error code that is returned if the WorkSpace cannot be created.
    */
  var ErrorCode: js.UndefOr[WorkspaceErrorCode] = js.native
  /**
    * The text of the error message that is returned if the WorkSpace cannot be created.
    */
  var ErrorMessage: js.UndefOr[Description] = js.native
  /**
    * The IP address of the WorkSpace.
    */
  var IpAddress: js.UndefOr[typingsSlinky.awsSdk.workspacesMod.IpAddress] = js.native
  /**
    * The modification states of the WorkSpace.
    */
  var ModificationStates: js.UndefOr[ModificationStateList] = js.native
  /**
    * Indicates whether the data stored on the root volume is encrypted.
    */
  var RootVolumeEncryptionEnabled: js.UndefOr[BooleanObject] = js.native
  /**
    * The operational state of the WorkSpace.
    */
  var State: js.UndefOr[WorkspaceState] = js.native
  /**
    * The identifier of the subnet for the WorkSpace.
    */
  var SubnetId: js.UndefOr[typingsSlinky.awsSdk.workspacesMod.SubnetId] = js.native
  /**
    * The user for the WorkSpace.
    */
  var UserName: js.UndefOr[typingsSlinky.awsSdk.workspacesMod.UserName] = js.native
  /**
    * Indicates whether the data stored on the user volume is encrypted.
    */
  var UserVolumeEncryptionEnabled: js.UndefOr[BooleanObject] = js.native
  /**
    * The symmetric AWS KMS customer master key (CMK) used to encrypt data stored on your WorkSpace. Amazon WorkSpaces does not support asymmetric CMKs.
    */
  var VolumeEncryptionKey: js.UndefOr[typingsSlinky.awsSdk.workspacesMod.VolumeEncryptionKey] = js.native
  /**
    * The identifier of the WorkSpace.
    */
  var WorkspaceId: js.UndefOr[typingsSlinky.awsSdk.workspacesMod.WorkspaceId] = js.native
  /**
    * The properties of the WorkSpace.
    */
  var WorkspaceProperties: js.UndefOr[typingsSlinky.awsSdk.workspacesMod.WorkspaceProperties] = js.native
}

object Workspace {
  @scala.inline
  def apply(): Workspace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Workspace]
  }
  @scala.inline
  implicit class WorkspaceOps[Self <: Workspace] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBundleId(value: BundleId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BundleId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBundleId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BundleId")(js.undefined)
        ret
    }
    @scala.inline
    def withComputerName(value: ComputerName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComputerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComputerName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComputerName")(js.undefined)
        ret
    }
    @scala.inline
    def withDirectoryId(value: DirectoryId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DirectoryId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectoryId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DirectoryId")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorCode(value: WorkspaceErrorCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorCode")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorMessage(value: Description): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withIpAddress(value: IpAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IpAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IpAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withModificationStates(value: ModificationStateList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModificationStates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModificationStates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModificationStates")(js.undefined)
        ret
    }
    @scala.inline
    def withRootVolumeEncryptionEnabled(value: BooleanObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RootVolumeEncryptionEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootVolumeEncryptionEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RootVolumeEncryptionEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: WorkspaceState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(js.undefined)
        ret
    }
    @scala.inline
    def withSubnetId(value: SubnetId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubnetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubnetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubnetId")(js.undefined)
        ret
    }
    @scala.inline
    def withUserName(value: UserName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserName")(js.undefined)
        ret
    }
    @scala.inline
    def withUserVolumeEncryptionEnabled(value: BooleanObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserVolumeEncryptionEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserVolumeEncryptionEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserVolumeEncryptionEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withVolumeEncryptionKey(value: VolumeEncryptionKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VolumeEncryptionKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolumeEncryptionKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VolumeEncryptionKey")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkspaceId(value: WorkspaceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkspaceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkspaceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkspaceId")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkspaceProperties(value: WorkspaceProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkspaceProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkspaceProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkspaceProperties")(js.undefined)
        ret
    }
  }
  
}

