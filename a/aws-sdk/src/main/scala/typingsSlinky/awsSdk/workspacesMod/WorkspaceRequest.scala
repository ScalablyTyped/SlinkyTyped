package typingsSlinky.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkspaceRequest extends js.Object {
  /**
    * The identifier of the bundle for the WorkSpace. You can use DescribeWorkspaceBundles to list the available bundles.
    */
  var BundleId: typingsSlinky.awsSdk.workspacesMod.BundleId = js.native
  /**
    * The identifier of the AWS Directory Service directory for the WorkSpace. You can use DescribeWorkspaceDirectories to list the available directories.
    */
  var DirectoryId: typingsSlinky.awsSdk.workspacesMod.DirectoryId = js.native
  /**
    * Indicates whether the data stored on the root volume is encrypted.
    */
  var RootVolumeEncryptionEnabled: js.UndefOr[BooleanObject] = js.native
  /**
    * The tags for the WorkSpace.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The user name of the user for the WorkSpace. This user name must exist in the AWS Directory Service directory for the WorkSpace.
    */
  var UserName: typingsSlinky.awsSdk.workspacesMod.UserName = js.native
  /**
    * Indicates whether the data stored on the user volume is encrypted.
    */
  var UserVolumeEncryptionEnabled: js.UndefOr[BooleanObject] = js.native
  /**
    * The symmetric AWS KMS customer master key (CMK) used to encrypt data stored on your WorkSpace. Amazon WorkSpaces does not support asymmetric CMKs.
    */
  var VolumeEncryptionKey: js.UndefOr[typingsSlinky.awsSdk.workspacesMod.VolumeEncryptionKey] = js.native
  /**
    * The WorkSpace properties.
    */
  var WorkspaceProperties: js.UndefOr[typingsSlinky.awsSdk.workspacesMod.WorkspaceProperties] = js.native
}

object WorkspaceRequest {
  @scala.inline
  def apply(BundleId: BundleId, DirectoryId: DirectoryId, UserName: UserName): WorkspaceRequest = {
    val __obj = js.Dynamic.literal(BundleId = BundleId.asInstanceOf[js.Any], DirectoryId = DirectoryId.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkspaceRequest]
  }
  @scala.inline
  implicit class WorkspaceRequestOps[Self <: WorkspaceRequest] (val x: Self) extends AnyVal {
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
    def withDirectoryId(value: DirectoryId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DirectoryId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserName(value: UserName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserName")(value.asInstanceOf[js.Any])
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
    def withTags(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
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

