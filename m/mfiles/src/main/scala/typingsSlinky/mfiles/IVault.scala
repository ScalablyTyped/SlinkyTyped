package typingsSlinky.mfiles

import typingsSlinky.mfiles.MFiles.MFMetadataStructureItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVault extends js.Object {
  val Async: IVaultAsync = js.native
  val ClassGroupOperations: IVaultClassGroupOperations = js.native
  val ClassOperations: IVaultClassOperations = js.native
  val ClientOperations: IVaultClientOperations = js.native
  val CurrentLoggedInUserID: Double = js.native
  val CustomApplicationManagementOperations: IVaultCustomApplicationManagementOperations = js.native
  val DataSetOperations: IVaultDataSetOperations = js.native
  val ElectronicSignatureOperations: IVaultElectronicSignatureOperations = js.native
  val EventLogOperations: IVaultEventLogOperations = js.native
  val ExtensionMethodOperations: IVaultExtensionMethodOperations = js.native
  val ExternalObjectOperations: IVaultExternalObjectOperations = js.native
  val LoggedIn: Boolean = js.native
  val LoginAccountOperations: IVaultLoginAccountOperations = js.native
  val LoginSessionID: String = js.native
  val ManagementOperations: IVaultManagementOperations = js.native
  val Name: String = js.native
  val NamedACLOperations: IVaultNamedACLOperations = js.native
  val NamedValueStorageOperations: IVaultNamedValueStorageOperations = js.native
  val NotificationOperations: IVaultNotificationOperations = js.native
  val ObjectFileOperations: IVaultObjectFileOperations = js.native
  val ObjectOperations: IVaultObjectOperations = js.native
  val ObjectPropertyOperations: IVaultObjectPropertyOperations = js.native
  val ObjectSearchOperations: IVaultObjectSearchOperations = js.native
  val ObjectTypeOperations: IVaultObjectTypeOperations = js.native
  val PropertyDefOperations: IVaultPropertyDefOperations = js.native
  val ReadOnlyAccess: Boolean = js.native
  val ScheduledJobManagementOperations: IVaultScheduledJobManagementOperations = js.native
  val ServerDataPushOperations: IVaultServerDataPushOperations = js.native
  val SessionInfo: ISessionInfo = js.native
  val SharedLinkOperations: IVaultSharedLinkOperations = js.native
  val TraditionalFolderOperations: IVaultTraditionalFolderOperations = js.native
  val UserGroupOperations: IVaultUserGroupOperations = js.native
  val UserOperations: IVaultUserOperations = js.native
  val UserSettingOperations: IVaultUserSettingOperations = js.native
  val ValueListItemOperations: IVaultValueListItemOperations = js.native
  val ValueListOperations: IVaultValueListOperations = js.native
  val VaultLanguages: ILanguages = js.native
  val ViewOperations: IVaultViewOperations = js.native
  val WorkflowOperations: IVaultWorkflowOperations = js.native
  def ChangePassword(OldPassword: String, NewPassword: String): Unit = js.native
  def GetAllTranslations(): String = js.native
  def GetGUID(): String = js.native
  def GetMFilesURLForVaultRoot(): String = js.native
  def GetMetadataStructureItemIDByAlias(MetadataStructureItemType: MFMetadataStructureItem, Alias: String, Unused: Boolean): Double = js.native
  def GetMetadataStructureVersionID(): Double = js.native
  def GetServerLicenseStatus(): ILicenseStatus = js.native
  def GetServerVersionOfVault(): IMFilesVersion = js.native
  def LogOutSilent(): Unit = js.native
  def LogOutWithDialogs(ParentWindow: Double): Boolean = js.native
  def TestConnectionToServer(): Unit = js.native
  def TestConnectionToVault(): Unit = js.native
  def TestConnectionToVaultWithTimeout(TimeoutInMilliseconds: Double): Unit = js.native
}

object IVault {
  @scala.inline
  def apply(
    Async: IVaultAsync,
    ChangePassword: (String, String) => Unit,
    ClassGroupOperations: IVaultClassGroupOperations,
    ClassOperations: IVaultClassOperations,
    ClientOperations: IVaultClientOperations,
    CurrentLoggedInUserID: Double,
    CustomApplicationManagementOperations: IVaultCustomApplicationManagementOperations,
    DataSetOperations: IVaultDataSetOperations,
    ElectronicSignatureOperations: IVaultElectronicSignatureOperations,
    EventLogOperations: IVaultEventLogOperations,
    ExtensionMethodOperations: IVaultExtensionMethodOperations,
    ExternalObjectOperations: IVaultExternalObjectOperations,
    GetAllTranslations: () => String,
    GetGUID: () => String,
    GetMFilesURLForVaultRoot: () => String,
    GetMetadataStructureItemIDByAlias: (MFMetadataStructureItem, String, Boolean) => Double,
    GetMetadataStructureVersionID: () => Double,
    GetServerLicenseStatus: () => ILicenseStatus,
    GetServerVersionOfVault: () => IMFilesVersion,
    LogOutSilent: () => Unit,
    LogOutWithDialogs: Double => Boolean,
    LoggedIn: Boolean,
    LoginAccountOperations: IVaultLoginAccountOperations,
    LoginSessionID: String,
    ManagementOperations: IVaultManagementOperations,
    Name: String,
    NamedACLOperations: IVaultNamedACLOperations,
    NamedValueStorageOperations: IVaultNamedValueStorageOperations,
    NotificationOperations: IVaultNotificationOperations,
    ObjectFileOperations: IVaultObjectFileOperations,
    ObjectOperations: IVaultObjectOperations,
    ObjectPropertyOperations: IVaultObjectPropertyOperations,
    ObjectSearchOperations: IVaultObjectSearchOperations,
    ObjectTypeOperations: IVaultObjectTypeOperations,
    PropertyDefOperations: IVaultPropertyDefOperations,
    ReadOnlyAccess: Boolean,
    ScheduledJobManagementOperations: IVaultScheduledJobManagementOperations,
    ServerDataPushOperations: IVaultServerDataPushOperations,
    SessionInfo: ISessionInfo,
    SharedLinkOperations: IVaultSharedLinkOperations,
    TestConnectionToServer: () => Unit,
    TestConnectionToVault: () => Unit,
    TestConnectionToVaultWithTimeout: Double => Unit,
    TraditionalFolderOperations: IVaultTraditionalFolderOperations,
    UserGroupOperations: IVaultUserGroupOperations,
    UserOperations: IVaultUserOperations,
    UserSettingOperations: IVaultUserSettingOperations,
    ValueListItemOperations: IVaultValueListItemOperations,
    ValueListOperations: IVaultValueListOperations,
    VaultLanguages: ILanguages,
    ViewOperations: IVaultViewOperations,
    WorkflowOperations: IVaultWorkflowOperations
  ): IVault = {
    val __obj = js.Dynamic.literal(Async = Async.asInstanceOf[js.Any], ChangePassword = js.Any.fromFunction2(ChangePassword), ClassGroupOperations = ClassGroupOperations.asInstanceOf[js.Any], ClassOperations = ClassOperations.asInstanceOf[js.Any], ClientOperations = ClientOperations.asInstanceOf[js.Any], CurrentLoggedInUserID = CurrentLoggedInUserID.asInstanceOf[js.Any], CustomApplicationManagementOperations = CustomApplicationManagementOperations.asInstanceOf[js.Any], DataSetOperations = DataSetOperations.asInstanceOf[js.Any], ElectronicSignatureOperations = ElectronicSignatureOperations.asInstanceOf[js.Any], EventLogOperations = EventLogOperations.asInstanceOf[js.Any], ExtensionMethodOperations = ExtensionMethodOperations.asInstanceOf[js.Any], ExternalObjectOperations = ExternalObjectOperations.asInstanceOf[js.Any], GetAllTranslations = js.Any.fromFunction0(GetAllTranslations), GetGUID = js.Any.fromFunction0(GetGUID), GetMFilesURLForVaultRoot = js.Any.fromFunction0(GetMFilesURLForVaultRoot), GetMetadataStructureItemIDByAlias = js.Any.fromFunction3(GetMetadataStructureItemIDByAlias), GetMetadataStructureVersionID = js.Any.fromFunction0(GetMetadataStructureVersionID), GetServerLicenseStatus = js.Any.fromFunction0(GetServerLicenseStatus), GetServerVersionOfVault = js.Any.fromFunction0(GetServerVersionOfVault), LogOutSilent = js.Any.fromFunction0(LogOutSilent), LogOutWithDialogs = js.Any.fromFunction1(LogOutWithDialogs), LoggedIn = LoggedIn.asInstanceOf[js.Any], LoginAccountOperations = LoginAccountOperations.asInstanceOf[js.Any], LoginSessionID = LoginSessionID.asInstanceOf[js.Any], ManagementOperations = ManagementOperations.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NamedACLOperations = NamedACLOperations.asInstanceOf[js.Any], NamedValueStorageOperations = NamedValueStorageOperations.asInstanceOf[js.Any], NotificationOperations = NotificationOperations.asInstanceOf[js.Any], ObjectFileOperations = ObjectFileOperations.asInstanceOf[js.Any], ObjectOperations = ObjectOperations.asInstanceOf[js.Any], ObjectPropertyOperations = ObjectPropertyOperations.asInstanceOf[js.Any], ObjectSearchOperations = ObjectSearchOperations.asInstanceOf[js.Any], ObjectTypeOperations = ObjectTypeOperations.asInstanceOf[js.Any], PropertyDefOperations = PropertyDefOperations.asInstanceOf[js.Any], ReadOnlyAccess = ReadOnlyAccess.asInstanceOf[js.Any], ScheduledJobManagementOperations = ScheduledJobManagementOperations.asInstanceOf[js.Any], ServerDataPushOperations = ServerDataPushOperations.asInstanceOf[js.Any], SessionInfo = SessionInfo.asInstanceOf[js.Any], SharedLinkOperations = SharedLinkOperations.asInstanceOf[js.Any], TestConnectionToServer = js.Any.fromFunction0(TestConnectionToServer), TestConnectionToVault = js.Any.fromFunction0(TestConnectionToVault), TestConnectionToVaultWithTimeout = js.Any.fromFunction1(TestConnectionToVaultWithTimeout), TraditionalFolderOperations = TraditionalFolderOperations.asInstanceOf[js.Any], UserGroupOperations = UserGroupOperations.asInstanceOf[js.Any], UserOperations = UserOperations.asInstanceOf[js.Any], UserSettingOperations = UserSettingOperations.asInstanceOf[js.Any], ValueListItemOperations = ValueListItemOperations.asInstanceOf[js.Any], ValueListOperations = ValueListOperations.asInstanceOf[js.Any], VaultLanguages = VaultLanguages.asInstanceOf[js.Any], ViewOperations = ViewOperations.asInstanceOf[js.Any], WorkflowOperations = WorkflowOperations.asInstanceOf[js.Any])
    __obj.asInstanceOf[IVault]
  }
  @scala.inline
  implicit class IVaultOps[Self <: IVault] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAsync(value: IVaultAsync): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Async")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChangePassword(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChangePassword")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withClassGroupOperations(value: IVaultClassGroupOperations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClassGroupOperations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClassOperations(value: IVaultClassOperations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClassOperations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientOperations(value: IVaultClientOperations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientOperations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentLoggedInUserID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentLoggedInUserID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomApplicationManagementOperations(value: IVaultCustomApplicationManagementOperations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomApplicationManagementOperations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataSetOperations(value: IVaultDataSetOperations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataSetOperations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElectronicSignatureOperations(value: IVaultElectronicSignatureOperations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ElectronicSignatureOperations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventLogOperations(value: IVaultEventLogOperations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventLogOperations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtensionMethodOperations(value: IVaultExtensionMethodOperations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExtensionMethodOperations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExternalObjectOperations(value: IVaultExternalObjectOperations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExternalObjectOperations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetAllTranslations(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetAllTranslations")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetGUID(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetGUID")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMFilesURLForVaultRoot(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetMFilesURLForVaultRoot")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMetadataStructureItemIDByAlias(value: (MFMetadataStructureItem, String, Boolean) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetMetadataStructureItemIDByAlias")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withGetMetadataStructureVersionID(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetMetadataStructureVersionID")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetServerLicenseStatus(value: () => ILicenseStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetServerLicenseStatus")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetServerVersionOfVault(value: () => IMFilesVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetServerVersionOfVault")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLogOutSilent(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogOutSilent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLogOutWithDialogs(value: Double => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogOutWithDialogs")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLoggedIn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoggedIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoginAccountOperations(value: IVaultLoginAccountOperations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoginAccountOperations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoginSessionID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoginSessionID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withManagementOperations(value: IVaultManagementOperations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ManagementOperations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNamedACLOperations(value: IVaultNamedACLOperations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NamedACLOperations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNamedValueStorageOperations(value: IVaultNamedValueStorageOperations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NamedValueStorageOperations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotificationOperations(value: IVaultNotificationOperations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotificationOperations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjectFileOperations(value: IVaultObjectFileOperations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectFileOperations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjectOperations(value: IVaultObjectOperations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectOperations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjectPropertyOperations(value: IVaultObjectPropertyOperations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectPropertyOperations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjectSearchOperations(value: IVaultObjectSearchOperations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectSearchOperations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjectTypeOperations(value: IVaultObjectTypeOperations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectTypeOperations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPropertyDefOperations(value: IVaultPropertyDefOperations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PropertyDefOperations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReadOnlyAccess(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReadOnlyAccess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScheduledJobManagementOperations(value: IVaultScheduledJobManagementOperations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScheduledJobManagementOperations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServerDataPushOperations(value: IVaultServerDataPushOperations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServerDataPushOperations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSessionInfo(value: ISessionInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SessionInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSharedLinkOperations(value: IVaultSharedLinkOperations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SharedLinkOperations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestConnectionToServer(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TestConnectionToServer")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTestConnectionToVault(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TestConnectionToVault")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTestConnectionToVaultWithTimeout(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TestConnectionToVaultWithTimeout")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTraditionalFolderOperations(value: IVaultTraditionalFolderOperations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TraditionalFolderOperations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserGroupOperations(value: IVaultUserGroupOperations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserGroupOperations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserOperations(value: IVaultUserOperations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserOperations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserSettingOperations(value: IVaultUserSettingOperations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserSettingOperations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValueListItemOperations(value: IVaultValueListItemOperations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValueListItemOperations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValueListOperations(value: IVaultValueListOperations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValueListOperations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVaultLanguages(value: ILanguages): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VaultLanguages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewOperations(value: IVaultViewOperations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ViewOperations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkflowOperations(value: IVaultWorkflowOperations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkflowOperations")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

