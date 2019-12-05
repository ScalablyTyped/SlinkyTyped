package typingsSlinky.mfiles.MFiles

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.mfiles.ILanguages
import typingsSlinky.mfiles.ILicenseStatus
import typingsSlinky.mfiles.IMFilesVersion
import typingsSlinky.mfiles.ISessionInfo
import typingsSlinky.mfiles.IVault
import typingsSlinky.mfiles.IVaultAsync
import typingsSlinky.mfiles.IVaultClassGroupOperations
import typingsSlinky.mfiles.IVaultClassOperations
import typingsSlinky.mfiles.IVaultClientOperations
import typingsSlinky.mfiles.IVaultCustomApplicationManagementOperations
import typingsSlinky.mfiles.IVaultDataSetOperations
import typingsSlinky.mfiles.IVaultElectronicSignatureOperations
import typingsSlinky.mfiles.IVaultEventLogOperations
import typingsSlinky.mfiles.IVaultExtensionMethodOperations
import typingsSlinky.mfiles.IVaultExternalObjectOperations
import typingsSlinky.mfiles.IVaultLoginAccountOperations
import typingsSlinky.mfiles.IVaultManagementOperations
import typingsSlinky.mfiles.IVaultNamedACLOperations
import typingsSlinky.mfiles.IVaultNamedValueStorageOperations
import typingsSlinky.mfiles.IVaultNotificationOperations
import typingsSlinky.mfiles.IVaultObjectFileOperations
import typingsSlinky.mfiles.IVaultObjectOperations
import typingsSlinky.mfiles.IVaultObjectPropertyOperations
import typingsSlinky.mfiles.IVaultObjectSearchOperations
import typingsSlinky.mfiles.IVaultObjectTypeOperations
import typingsSlinky.mfiles.IVaultPropertyDefOperations
import typingsSlinky.mfiles.IVaultScheduledJobManagementOperations
import typingsSlinky.mfiles.IVaultServerDataPushOperations
import typingsSlinky.mfiles.IVaultSharedLinkOperations
import typingsSlinky.mfiles.IVaultTraditionalFolderOperations
import typingsSlinky.mfiles.IVaultUserGroupOperations
import typingsSlinky.mfiles.IVaultUserOperations
import typingsSlinky.mfiles.IVaultUserSettingOperations
import typingsSlinky.mfiles.IVaultValueListItemOperations
import typingsSlinky.mfiles.IVaultValueListOperations
import typingsSlinky.mfiles.IVaultViewOperations
import typingsSlinky.mfiles.IVaultWorkflowOperations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.Vault")
@js.native
class Vault () extends IVault {
  /* CompleteClass */
  override val Async: IVaultAsync = js.native
  /* CompleteClass */
  override val ClassGroupOperations: IVaultClassGroupOperations = js.native
  /* CompleteClass */
  override val ClassOperations: IVaultClassOperations = js.native
  /* CompleteClass */
  override val ClientOperations: IVaultClientOperations = js.native
  /* CompleteClass */
  override val CurrentLoggedInUserID: Double = js.native
  /* CompleteClass */
  override val CustomApplicationManagementOperations: IVaultCustomApplicationManagementOperations = js.native
  /* CompleteClass */
  override val DataSetOperations: IVaultDataSetOperations = js.native
  /* CompleteClass */
  override val ElectronicSignatureOperations: IVaultElectronicSignatureOperations = js.native
  /* CompleteClass */
  override val EventLogOperations: IVaultEventLogOperations = js.native
  /* CompleteClass */
  override val ExtensionMethodOperations: IVaultExtensionMethodOperations = js.native
  /* CompleteClass */
  override val ExternalObjectOperations: IVaultExternalObjectOperations = js.native
  /* CompleteClass */
  override val LoggedIn: Boolean = js.native
  /* CompleteClass */
  override val LoginAccountOperations: IVaultLoginAccountOperations = js.native
  /* CompleteClass */
  override val LoginSessionID: String = js.native
  /* CompleteClass */
  override val ManagementOperations: IVaultManagementOperations = js.native
  /* CompleteClass */
  override val Name: String = js.native
  /* CompleteClass */
  override val NamedACLOperations: IVaultNamedACLOperations = js.native
  /* CompleteClass */
  override val NamedValueStorageOperations: IVaultNamedValueStorageOperations = js.native
  /* CompleteClass */
  override val NotificationOperations: IVaultNotificationOperations = js.native
  /* CompleteClass */
  override val ObjectFileOperations: IVaultObjectFileOperations = js.native
  /* CompleteClass */
  override val ObjectOperations: IVaultObjectOperations = js.native
  /* CompleteClass */
  override val ObjectPropertyOperations: IVaultObjectPropertyOperations = js.native
  /* CompleteClass */
  override val ObjectSearchOperations: IVaultObjectSearchOperations = js.native
  /* CompleteClass */
  override val ObjectTypeOperations: IVaultObjectTypeOperations = js.native
  /* CompleteClass */
  override val PropertyDefOperations: IVaultPropertyDefOperations = js.native
  /* CompleteClass */
  override val ReadOnlyAccess: Boolean = js.native
  /* CompleteClass */
  override val ScheduledJobManagementOperations: IVaultScheduledJobManagementOperations = js.native
  /* CompleteClass */
  override val ServerDataPushOperations: IVaultServerDataPushOperations = js.native
  /* CompleteClass */
  override val SessionInfo: ISessionInfo = js.native
  /* CompleteClass */
  override val SharedLinkOperations: IVaultSharedLinkOperations = js.native
  /* CompleteClass */
  override val TraditionalFolderOperations: IVaultTraditionalFolderOperations = js.native
  /* CompleteClass */
  override val UserGroupOperations: IVaultUserGroupOperations = js.native
  /* CompleteClass */
  override val UserOperations: IVaultUserOperations = js.native
  /* CompleteClass */
  override val UserSettingOperations: IVaultUserSettingOperations = js.native
  /* CompleteClass */
  override val ValueListItemOperations: IVaultValueListItemOperations = js.native
  /* CompleteClass */
  override val ValueListOperations: IVaultValueListOperations = js.native
  /* CompleteClass */
  override val VaultLanguages: ILanguages = js.native
  /* CompleteClass */
  override val ViewOperations: IVaultViewOperations = js.native
  /* CompleteClass */
  override val WorkflowOperations: IVaultWorkflowOperations = js.native
  /* CompleteClass */
  override def ChangePassword(OldPassword: String, NewPassword: String): Unit = js.native
  /* CompleteClass */
  override def GetAllTranslations(): String = js.native
  /* CompleteClass */
  override def GetGUID(): String = js.native
  /* CompleteClass */
  override def GetMFilesURLForVaultRoot(): String = js.native
  /* CompleteClass */
  override def GetMetadataStructureItemIDByAlias(MetadataStructureItemType: MFMetadataStructureItem, Alias: String, Unused: Boolean): Double = js.native
  /* CompleteClass */
  override def GetMetadataStructureVersionID(): Double = js.native
  /* CompleteClass */
  override def GetServerLicenseStatus(): ILicenseStatus = js.native
  /* CompleteClass */
  override def GetServerVersionOfVault(): IMFilesVersion = js.native
  /* CompleteClass */
  override def LogOutSilent(): Unit = js.native
  /* CompleteClass */
  override def LogOutWithDialogs(ParentWindow: Double): Boolean = js.native
  /* CompleteClass */
  override def TestConnectionToServer(): Unit = js.native
  /* CompleteClass */
  override def TestConnectionToVault(): Unit = js.native
  /* CompleteClass */
  override def TestConnectionToVaultWithTimeout(TimeoutInMilliseconds: Double): Unit = js.native
}

@JSGlobal("MFiles.Vault")
@js.native
object Vault extends Instantiable0[IVault]

