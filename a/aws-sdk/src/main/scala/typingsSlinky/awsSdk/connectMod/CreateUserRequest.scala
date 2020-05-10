package typingsSlinky.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateUserRequest extends js.Object {
  /**
    * The identifier of the user account in the directory used for identity management. If Amazon Connect cannot access the directory, you can specify this identifier to authenticate users. If you include the identifier, we assume that Amazon Connect cannot access the directory. Otherwise, the identity information is used to authenticate users from your directory. This parameter is required if you are using an existing directory for identity management in Amazon Connect when Amazon Connect cannot access your directory to authenticate users. If you are using SAML for identity management and include this parameter, an error is returned.
    */
  var DirectoryUserId: js.UndefOr[typingsSlinky.awsSdk.connectMod.DirectoryUserId] = js.native
  /**
    * The identifier of the hierarchy group for the user.
    */
  var HierarchyGroupId: js.UndefOr[typingsSlinky.awsSdk.connectMod.HierarchyGroupId] = js.native
  /**
    * The information about the identity of the user.
    */
  var IdentityInfo: js.UndefOr[UserIdentityInfo] = js.native
  /**
    * The identifier of the Amazon Connect instance.
    */
  var InstanceId: typingsSlinky.awsSdk.connectMod.InstanceId = js.native
  /**
    * The password for the user account. A password is required if you are using Amazon Connect for identity management. Otherwise, it is an error to include a password.
    */
  var Password: js.UndefOr[typingsSlinky.awsSdk.connectMod.Password] = js.native
  /**
    * The phone settings for the user.
    */
  var PhoneConfig: UserPhoneConfig = js.native
  /**
    * The identifier of the routing profile for the user.
    */
  var RoutingProfileId: typingsSlinky.awsSdk.connectMod.RoutingProfileId = js.native
  /**
    * The identifier of the security profile for the user.
    */
  var SecurityProfileIds: typingsSlinky.awsSdk.connectMod.SecurityProfileIds = js.native
  /**
    * One or more tags.
    */
  var Tags: js.UndefOr[TagMap] = js.native
  /**
    * The user name for the account. For instances not using SAML for identity management, the user name can include up to 20 characters. If you are using SAML for identity management, the user name can include up to 64 characters from [a-zA-Z0-9_-.\@]+.
    */
  var Username: AgentUsername = js.native
}

object CreateUserRequest {
  @scala.inline
  def apply(
    InstanceId: InstanceId,
    PhoneConfig: UserPhoneConfig,
    RoutingProfileId: RoutingProfileId,
    SecurityProfileIds: SecurityProfileIds,
    Username: AgentUsername
  ): CreateUserRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], PhoneConfig = PhoneConfig.asInstanceOf[js.Any], RoutingProfileId = RoutingProfileId.asInstanceOf[js.Any], SecurityProfileIds = SecurityProfileIds.asInstanceOf[js.Any], Username = Username.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUserRequest]
  }
  @scala.inline
  implicit class CreateUserRequestOps[Self <: CreateUserRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstanceId(value: InstanceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhoneConfig(value: UserPhoneConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PhoneConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoutingProfileId(value: RoutingProfileId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoutingProfileId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecurityProfileIds(value: SecurityProfileIds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecurityProfileIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsername(value: AgentUsername): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Username")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirectoryUserId(value: DirectoryUserId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DirectoryUserId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectoryUserId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DirectoryUserId")(js.undefined)
        ret
    }
    @scala.inline
    def withHierarchyGroupId(value: HierarchyGroupId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HierarchyGroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHierarchyGroupId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HierarchyGroupId")(js.undefined)
        ret
    }
    @scala.inline
    def withIdentityInfo(value: UserIdentityInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IdentityInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdentityInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IdentityInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withPassword(value: Password): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Password")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: TagMap): Self = {
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
  }
  
}

