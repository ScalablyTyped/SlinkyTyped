package typingsSlinky.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkspaceDirectory extends js.Object {
  /**
    * The directory alias.
    */
  var Alias: js.UndefOr[typingsSlinky.awsSdk.workspacesMod.Alias] = js.native
  /**
    * The user name for the service account.
    */
  var CustomerUserName: js.UndefOr[UserName] = js.native
  /**
    * The directory identifier.
    */
  var DirectoryId: js.UndefOr[typingsSlinky.awsSdk.workspacesMod.DirectoryId] = js.native
  /**
    * The name of the directory.
    */
  var DirectoryName: js.UndefOr[typingsSlinky.awsSdk.workspacesMod.DirectoryName] = js.native
  /**
    * The directory type.
    */
  var DirectoryType: js.UndefOr[WorkspaceDirectoryType] = js.native
  /**
    * The IP addresses of the DNS servers for the directory.
    */
  var DnsIpAddresses: js.UndefOr[typingsSlinky.awsSdk.workspacesMod.DnsIpAddresses] = js.native
  /**
    * The identifier of the IAM role. This is the role that allows Amazon WorkSpaces to make calls to other services, such as Amazon EC2, on your behalf.
    */
  var IamRoleId: js.UndefOr[ARN] = js.native
  /**
    * The registration code for the directory. This is the code that users enter in their Amazon WorkSpaces client application to connect to the directory.
    */
  var RegistrationCode: js.UndefOr[typingsSlinky.awsSdk.workspacesMod.RegistrationCode] = js.native
  /**
    * The default self-service permissions for WorkSpaces in the directory.
    */
  var SelfservicePermissions: js.UndefOr[typingsSlinky.awsSdk.workspacesMod.SelfservicePermissions] = js.native
  /**
    * The state of the directory's registration with Amazon WorkSpaces.
    */
  var State: js.UndefOr[WorkspaceDirectoryState] = js.native
  /**
    * The identifiers of the subnets used with the directory.
    */
  var SubnetIds: js.UndefOr[typingsSlinky.awsSdk.workspacesMod.SubnetIds] = js.native
  /**
    * Specifies whether the directory is dedicated or shared. To use Bring Your Own License (BYOL), this value must be set to DEDICATED. For more information, see Bring Your Own Windows Desktop Images.
    */
  var Tenancy: js.UndefOr[typingsSlinky.awsSdk.workspacesMod.Tenancy] = js.native
  /**
    * The devices and operating systems that users can use to access WorkSpaces.
    */
  var WorkspaceAccessProperties: js.UndefOr[typingsSlinky.awsSdk.workspacesMod.WorkspaceAccessProperties] = js.native
  /**
    * The default creation properties for all WorkSpaces in the directory.
    */
  var WorkspaceCreationProperties: js.UndefOr[DefaultWorkspaceCreationProperties] = js.native
  /**
    * The identifier of the security group that is assigned to new WorkSpaces.
    */
  var WorkspaceSecurityGroupId: js.UndefOr[SecurityGroupId] = js.native
  /**
    * The identifiers of the IP access control groups associated with the directory.
    */
  var ipGroupIds: js.UndefOr[IpGroupIdList] = js.native
}

object WorkspaceDirectory {
  @scala.inline
  def apply(): WorkspaceDirectory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceDirectory]
  }
  @scala.inline
  implicit class WorkspaceDirectoryOps[Self <: WorkspaceDirectory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlias(value: Alias): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Alias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlias: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Alias")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomerUserName(value: UserName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomerUserName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomerUserName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomerUserName")(js.undefined)
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
    def withDirectoryName(value: DirectoryName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DirectoryName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectoryName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DirectoryName")(js.undefined)
        ret
    }
    @scala.inline
    def withDirectoryType(value: WorkspaceDirectoryType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DirectoryType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectoryType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DirectoryType")(js.undefined)
        ret
    }
    @scala.inline
    def withDnsIpAddresses(value: DnsIpAddresses): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DnsIpAddresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDnsIpAddresses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DnsIpAddresses")(js.undefined)
        ret
    }
    @scala.inline
    def withIamRoleId(value: ARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IamRoleId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIamRoleId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IamRoleId")(js.undefined)
        ret
    }
    @scala.inline
    def withRegistrationCode(value: RegistrationCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegistrationCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegistrationCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegistrationCode")(js.undefined)
        ret
    }
    @scala.inline
    def withSelfservicePermissions(value: SelfservicePermissions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SelfservicePermissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelfservicePermissions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SelfservicePermissions")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: WorkspaceDirectoryState): Self = {
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
    @scala.inline
    def withWorkspaceAccessProperties(value: WorkspaceAccessProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkspaceAccessProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkspaceAccessProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkspaceAccessProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkspaceCreationProperties(value: DefaultWorkspaceCreationProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkspaceCreationProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkspaceCreationProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkspaceCreationProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkspaceSecurityGroupId(value: SecurityGroupId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkspaceSecurityGroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkspaceSecurityGroupId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkspaceSecurityGroupId")(js.undefined)
        ret
    }
    @scala.inline
    def withIpGroupIds(value: IpGroupIdList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipGroupIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpGroupIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipGroupIds")(js.undefined)
        ret
    }
  }
  
}

