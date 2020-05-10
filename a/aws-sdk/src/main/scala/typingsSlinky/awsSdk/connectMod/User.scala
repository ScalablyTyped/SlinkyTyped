package typingsSlinky.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait User extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the user account.
    */
  var Arn: js.UndefOr[ARN] = js.native
  /**
    * The identifier of the user account in the directory used for identity management.
    */
  var DirectoryUserId: js.UndefOr[typingsSlinky.awsSdk.connectMod.DirectoryUserId] = js.native
  /**
    * The identifier of the hierarchy group for the user.
    */
  var HierarchyGroupId: js.UndefOr[typingsSlinky.awsSdk.connectMod.HierarchyGroupId] = js.native
  /**
    * The identifier of the user account.
    */
  var Id: js.UndefOr[UserId] = js.native
  /**
    * Information about the user identity.
    */
  var IdentityInfo: js.UndefOr[UserIdentityInfo] = js.native
  /**
    * Information about the phone configuration for the user.
    */
  var PhoneConfig: js.UndefOr[UserPhoneConfig] = js.native
  /**
    * The identifier of the routing profile for the user.
    */
  var RoutingProfileId: js.UndefOr[typingsSlinky.awsSdk.connectMod.RoutingProfileId] = js.native
  /**
    * The identifiers of the security profiles for the user.
    */
  var SecurityProfileIds: js.UndefOr[typingsSlinky.awsSdk.connectMod.SecurityProfileIds] = js.native
  /**
    * The tags.
    */
  var Tags: js.UndefOr[TagMap] = js.native
  /**
    * The user name assigned to the user account.
    */
  var Username: js.UndefOr[AgentUsername] = js.native
}

object User {
  @scala.inline
  def apply(): User = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[User]
  }
  @scala.inline
  implicit class UserOps[Self <: User] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: ARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(js.undefined)
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
    def withId(value: UserId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(js.undefined)
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
    def withPhoneConfig(value: UserPhoneConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PhoneConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhoneConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PhoneConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withRoutingProfileId(value: RoutingProfileId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoutingProfileId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoutingProfileId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoutingProfileId")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurityProfileIds(value: SecurityProfileIds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecurityProfileIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityProfileIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecurityProfileIds")(js.undefined)
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
    @scala.inline
    def withUsername(value: AgentUsername): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Username")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsername: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Username")(js.undefined)
        ret
    }
  }
  
}

