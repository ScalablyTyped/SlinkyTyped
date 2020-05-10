package typingsSlinky.mfiles

import typingsSlinky.mfiles.MFiles.MFImportContentFlag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IImportContentJob extends js.Object {
  var ActivateAutomaticPermissionsForNewOrChangedDefinitions: Boolean = js.native
  var DisableImportedExternalObjectTypeConnections: Boolean = js.native
  var DisableImportedExternalUserGroups: Boolean = js.native
  var DisableImportedVaultEventHandlers: Boolean = js.native
  var Flags: MFImportContentFlag = js.native
  var IgnoreAutomaticPermissionsDefinedByObjects: Boolean = js.native
  var Impersonation: IImpersonation = js.native
  var MetadataStructureSelectors: IMetadataStructureSelectors = js.native
  var Permissions: IAccessControlList = js.native
  var ResetExportTimestamps: Boolean = js.native
  var SourceLocation: String = js.native
  var UseDefaultObjectTypePermissions: Boolean = js.native
  var UseNamesAsAliases: Boolean = js.native
  var UsePermissions: Boolean = js.native
  def Clone(): IImportContentJob = js.native
}

object IImportContentJob {
  @scala.inline
  def apply(
    ActivateAutomaticPermissionsForNewOrChangedDefinitions: Boolean,
    Clone: () => IImportContentJob,
    DisableImportedExternalObjectTypeConnections: Boolean,
    DisableImportedExternalUserGroups: Boolean,
    DisableImportedVaultEventHandlers: Boolean,
    Flags: MFImportContentFlag,
    IgnoreAutomaticPermissionsDefinedByObjects: Boolean,
    Impersonation: IImpersonation,
    MetadataStructureSelectors: IMetadataStructureSelectors,
    Permissions: IAccessControlList,
    ResetExportTimestamps: Boolean,
    SourceLocation: String,
    UseDefaultObjectTypePermissions: Boolean,
    UseNamesAsAliases: Boolean,
    UsePermissions: Boolean
  ): IImportContentJob = {
    val __obj = js.Dynamic.literal(ActivateAutomaticPermissionsForNewOrChangedDefinitions = ActivateAutomaticPermissionsForNewOrChangedDefinitions.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), DisableImportedExternalObjectTypeConnections = DisableImportedExternalObjectTypeConnections.asInstanceOf[js.Any], DisableImportedExternalUserGroups = DisableImportedExternalUserGroups.asInstanceOf[js.Any], DisableImportedVaultEventHandlers = DisableImportedVaultEventHandlers.asInstanceOf[js.Any], Flags = Flags.asInstanceOf[js.Any], IgnoreAutomaticPermissionsDefinedByObjects = IgnoreAutomaticPermissionsDefinedByObjects.asInstanceOf[js.Any], Impersonation = Impersonation.asInstanceOf[js.Any], MetadataStructureSelectors = MetadataStructureSelectors.asInstanceOf[js.Any], Permissions = Permissions.asInstanceOf[js.Any], ResetExportTimestamps = ResetExportTimestamps.asInstanceOf[js.Any], SourceLocation = SourceLocation.asInstanceOf[js.Any], UseDefaultObjectTypePermissions = UseDefaultObjectTypePermissions.asInstanceOf[js.Any], UseNamesAsAliases = UseNamesAsAliases.asInstanceOf[js.Any], UsePermissions = UsePermissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[IImportContentJob]
  }
  @scala.inline
  implicit class IImportContentJobOps[Self <: IImportContentJob] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivateAutomaticPermissionsForNewOrChangedDefinitions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActivateAutomaticPermissionsForNewOrChangedDefinitions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClone(value: () => IImportContentJob): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDisableImportedExternalObjectTypeConnections(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisableImportedExternalObjectTypeConnections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisableImportedExternalUserGroups(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisableImportedExternalUserGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisableImportedVaultEventHandlers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisableImportedVaultEventHandlers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlags(value: MFImportContentFlag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Flags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIgnoreAutomaticPermissionsDefinedByObjects(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IgnoreAutomaticPermissionsDefinedByObjects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImpersonation(value: IImpersonation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Impersonation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetadataStructureSelectors(value: IMetadataStructureSelectors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MetadataStructureSelectors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPermissions(value: IAccessControlList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Permissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResetExportTimestamps(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResetExportTimestamps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseDefaultObjectTypePermissions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UseDefaultObjectTypePermissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseNamesAsAliases(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UseNamesAsAliases")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsePermissions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UsePermissions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

