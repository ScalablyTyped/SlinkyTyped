package typingsSlinky.mfiles

import typingsSlinky.mfiles.MFiles.MFACLMode
import typingsSlinky.mfiles.MFiles.MFAuthType
import typingsSlinky.mfiles.MFiles.MFObjectAccess
import typingsSlinky.mfiles.MFiles.MFObjectTypeAccess
import typingsSlinky.mfiles.MFiles.MFProductMode
import typingsSlinky.mfiles.MFiles.MFPropertyDefAccess
import typingsSlinky.mfiles.MFiles.MFVaultAccess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISessionInfo extends js.Object {
  val ACLMode: MFACLMode = js.native
  val AccountName: String = js.native
  val AuthenticationType: MFAuthType = js.native
  val CanCreateObjects: Boolean = js.native
  val CanForceUndoCheckout: Boolean = js.native
  val CanManageCommonUISettings: Boolean = js.native
  val CanManageCommonViews: Boolean = js.native
  val CanManageTraditionalFolders: Boolean = js.native
  val CanMaterializeViews: Boolean = js.native
  val CanSeeAllObjects: Boolean = js.native
  val CanSeeDeletedObjects: Boolean = js.native
  val ClientCulture: String = js.native
  val InternalUser: Boolean = js.native
  val IsSharingPublicLinksAllowed: Boolean = js.native
  val IsSharingPublicLinksToLatestVersionAllowed: Boolean = js.native
  val KeepAliveIntervalInSeconds: Double = js.native
  val Language: Double = js.native
  val LicenseAllowsModifications: Boolean = js.native
  val LocalComputerName: String = js.native
  val ProductMode: MFProductMode = js.native
  val ServerVersion: Double = js.native
  val TimeZoneInfo: ITimeZoneInformation = js.native
  val UserAndGroupMemberships: IUserOrUserGroupIDs = js.native
  val UserAndSubstitutedByMe: IUserOrUserGroupIDs = js.native
  val UserID: Double = js.native
  val VaultGUID: String = js.native
  def CheckObjectAccess(ObjectAccessControlList: IAccessControlList, DesiredObjectAccess: MFObjectAccess): Boolean = js.native
  def CheckObjectTypeAccess(ObjectTypeAccessControlList: IAccessControlList, DesiredObjectTypeAccess: MFObjectTypeAccess): Boolean = js.native
  def CheckPropertyDefAccess(PropertyDefAccessControlList: IAccessControlList, DesiredPropertyDefAccess: MFPropertyDefAccess): Boolean = js.native
  def CheckVaultAccess(DesiredVaultAccess: MFVaultAccess): Boolean = js.native
  def CloneFrom(SessionInfo: ISessionInfo): Unit = js.native
  def IsLoggedOnUserSubstituteOfUser(UserID: Double): Boolean = js.native
}

object ISessionInfo {
  @scala.inline
  def apply(
    ACLMode: MFACLMode,
    AccountName: String,
    AuthenticationType: MFAuthType,
    CanCreateObjects: Boolean,
    CanForceUndoCheckout: Boolean,
    CanManageCommonUISettings: Boolean,
    CanManageCommonViews: Boolean,
    CanManageTraditionalFolders: Boolean,
    CanMaterializeViews: Boolean,
    CanSeeAllObjects: Boolean,
    CanSeeDeletedObjects: Boolean,
    CheckObjectAccess: (IAccessControlList, MFObjectAccess) => Boolean,
    CheckObjectTypeAccess: (IAccessControlList, MFObjectTypeAccess) => Boolean,
    CheckPropertyDefAccess: (IAccessControlList, MFPropertyDefAccess) => Boolean,
    CheckVaultAccess: MFVaultAccess => Boolean,
    ClientCulture: String,
    CloneFrom: ISessionInfo => Unit,
    InternalUser: Boolean,
    IsLoggedOnUserSubstituteOfUser: Double => Boolean,
    IsSharingPublicLinksAllowed: Boolean,
    IsSharingPublicLinksToLatestVersionAllowed: Boolean,
    KeepAliveIntervalInSeconds: Double,
    Language: Double,
    LicenseAllowsModifications: Boolean,
    LocalComputerName: String,
    ProductMode: MFProductMode,
    ServerVersion: Double,
    TimeZoneInfo: ITimeZoneInformation,
    UserAndGroupMemberships: IUserOrUserGroupIDs,
    UserAndSubstitutedByMe: IUserOrUserGroupIDs,
    UserID: Double,
    VaultGUID: String
  ): ISessionInfo = {
    val __obj = js.Dynamic.literal(ACLMode = ACLMode.asInstanceOf[js.Any], AccountName = AccountName.asInstanceOf[js.Any], AuthenticationType = AuthenticationType.asInstanceOf[js.Any], CanCreateObjects = CanCreateObjects.asInstanceOf[js.Any], CanForceUndoCheckout = CanForceUndoCheckout.asInstanceOf[js.Any], CanManageCommonUISettings = CanManageCommonUISettings.asInstanceOf[js.Any], CanManageCommonViews = CanManageCommonViews.asInstanceOf[js.Any], CanManageTraditionalFolders = CanManageTraditionalFolders.asInstanceOf[js.Any], CanMaterializeViews = CanMaterializeViews.asInstanceOf[js.Any], CanSeeAllObjects = CanSeeAllObjects.asInstanceOf[js.Any], CanSeeDeletedObjects = CanSeeDeletedObjects.asInstanceOf[js.Any], CheckObjectAccess = js.Any.fromFunction2(CheckObjectAccess), CheckObjectTypeAccess = js.Any.fromFunction2(CheckObjectTypeAccess), CheckPropertyDefAccess = js.Any.fromFunction2(CheckPropertyDefAccess), CheckVaultAccess = js.Any.fromFunction1(CheckVaultAccess), ClientCulture = ClientCulture.asInstanceOf[js.Any], CloneFrom = js.Any.fromFunction1(CloneFrom), InternalUser = InternalUser.asInstanceOf[js.Any], IsLoggedOnUserSubstituteOfUser = js.Any.fromFunction1(IsLoggedOnUserSubstituteOfUser), IsSharingPublicLinksAllowed = IsSharingPublicLinksAllowed.asInstanceOf[js.Any], IsSharingPublicLinksToLatestVersionAllowed = IsSharingPublicLinksToLatestVersionAllowed.asInstanceOf[js.Any], KeepAliveIntervalInSeconds = KeepAliveIntervalInSeconds.asInstanceOf[js.Any], Language = Language.asInstanceOf[js.Any], LicenseAllowsModifications = LicenseAllowsModifications.asInstanceOf[js.Any], LocalComputerName = LocalComputerName.asInstanceOf[js.Any], ProductMode = ProductMode.asInstanceOf[js.Any], ServerVersion = ServerVersion.asInstanceOf[js.Any], TimeZoneInfo = TimeZoneInfo.asInstanceOf[js.Any], UserAndGroupMemberships = UserAndGroupMemberships.asInstanceOf[js.Any], UserAndSubstitutedByMe = UserAndSubstitutedByMe.asInstanceOf[js.Any], UserID = UserID.asInstanceOf[js.Any], VaultGUID = VaultGUID.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISessionInfo]
  }
  @scala.inline
  implicit class ISessionInfoOps[Self <: ISessionInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withACLMode(value: MFACLMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ACLMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccountName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthenticationType(value: MFAuthType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthenticationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanCreateObjects(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CanCreateObjects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanForceUndoCheckout(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CanForceUndoCheckout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanManageCommonUISettings(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CanManageCommonUISettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanManageCommonViews(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CanManageCommonViews")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanManageTraditionalFolders(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CanManageTraditionalFolders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanMaterializeViews(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CanMaterializeViews")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanSeeAllObjects(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CanSeeAllObjects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanSeeDeletedObjects(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CanSeeDeletedObjects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheckObjectAccess(value: (IAccessControlList, MFObjectAccess) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CheckObjectAccess")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCheckObjectTypeAccess(value: (IAccessControlList, MFObjectTypeAccess) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CheckObjectTypeAccess")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCheckPropertyDefAccess(value: (IAccessControlList, MFPropertyDefAccess) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CheckPropertyDefAccess")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCheckVaultAccess(value: MFVaultAccess => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CheckVaultAccess")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withClientCulture(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientCulture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCloneFrom(value: ISessionInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloneFrom")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInternalUser(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InternalUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsLoggedOnUserSubstituteOfUser(value: Double => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsLoggedOnUserSubstituteOfUser")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsSharingPublicLinksAllowed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsSharingPublicLinksAllowed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSharingPublicLinksToLatestVersionAllowed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsSharingPublicLinksToLatestVersionAllowed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeepAliveIntervalInSeconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeepAliveIntervalInSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanguage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLicenseAllowsModifications(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LicenseAllowsModifications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocalComputerName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocalComputerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProductMode(value: MFProductMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProductMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServerVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServerVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeZoneInfo(value: ITimeZoneInformation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimeZoneInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserAndGroupMemberships(value: IUserOrUserGroupIDs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserAndGroupMemberships")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserAndSubstitutedByMe(value: IUserOrUserGroupIDs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserAndSubstitutedByMe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVaultGUID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VaultGUID")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

