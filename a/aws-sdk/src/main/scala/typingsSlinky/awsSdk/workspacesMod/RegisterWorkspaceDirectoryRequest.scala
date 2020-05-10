package typingsSlinky.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterWorkspaceDirectoryRequest extends js.Object {
  /**
    * The identifier of the directory. You cannot register a directory if it does not have a status of Active. If the directory does not have a status of Active, you will receive an InvalidResourceStateException error. If you have already registered the maximum number of directories that you can register with Amazon WorkSpaces, you will receive a ResourceLimitExceededException error. Deregister directories that you are not using for WorkSpaces, and try again.
    */
  var DirectoryId: typingsSlinky.awsSdk.workspacesMod.DirectoryId = js.native
  /**
    * Indicates whether self-service capabilities are enabled or disabled.
    */
  var EnableSelfService: js.UndefOr[BooleanObject] = js.native
  /**
    * Indicates whether Amazon WorkDocs is enabled or disabled. If you have enabled this parameter and WorkDocs is not available in the Region, you will receive an OperationNotSupportedException error. Set EnableWorkDocs to disabled, and try again.
    */
  var EnableWorkDocs: BooleanObject = js.native
  /**
    * The identifiers of the subnets for your virtual private cloud (VPC). Make sure that the subnets are in supported Availability Zones. The subnets must also be in separate Availability Zones. If these conditions are not met, you will receive an OperationNotSupportedException error.
    */
  var SubnetIds: js.UndefOr[typingsSlinky.awsSdk.workspacesMod.SubnetIds] = js.native
  /**
    * The tags associated with the directory.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * Indicates whether your WorkSpace directory is dedicated or shared. To use Bring Your Own License (BYOL) images, this value must be set to DEDICATED and your AWS account must be enabled for BYOL. If your account has not been enabled for BYOL, you will receive an InvalidParameterValuesException error. For more information about BYOL images, see Bring Your Own Windows Desktop Images.
    */
  var Tenancy: js.UndefOr[typingsSlinky.awsSdk.workspacesMod.Tenancy] = js.native
}

object RegisterWorkspaceDirectoryRequest {
  @scala.inline
  def apply(DirectoryId: DirectoryId, EnableWorkDocs: BooleanObject): RegisterWorkspaceDirectoryRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId.asInstanceOf[js.Any], EnableWorkDocs = EnableWorkDocs.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterWorkspaceDirectoryRequest]
  }
  @scala.inline
  implicit class RegisterWorkspaceDirectoryRequestOps[Self <: RegisterWorkspaceDirectoryRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirectoryId(value: DirectoryId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DirectoryId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnableWorkDocs(value: BooleanObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnableWorkDocs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnableSelfService(value: BooleanObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnableSelfService")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableSelfService: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnableSelfService")(js.undefined)
        ret
    }
    @scala.inline
    def withSubnetIds(value: SubnetIds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubnetIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubnetIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubnetIds")(js.undefined)
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
    def withTenancy(value: Tenancy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tenancy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTenancy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tenancy")(js.undefined)
        ret
    }
  }
  
}

