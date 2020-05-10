package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICopyVaultJob extends js.Object {
  var CopyflagAllData: Boolean = js.native
  var CopyflagAllExceptData: Boolean = js.native
  var CopyflagApplications: Boolean = js.native
  var CopyflagDataSets: Boolean = js.native
  var CopyflagDocumentProfiles: Boolean = js.native
  var CopyflagDocuments: Boolean = js.native
  var CopyflagEventLog: Boolean = js.native
  var CopyflagExternalLocations: Boolean = js.native
  var CopyflagFiles: Boolean = js.native
  var CopyflagInternalEventHandlers: Boolean = js.native
  var CopyflagLanguagesAndTranslations: Boolean = js.native
  var CopyflagPropertyDefinitions: Boolean = js.native
  var CopyflagScheduledExportAndImportJobs: Boolean = js.native
  var CopyflagUseTargetGUID: Boolean = js.native
  var CopyflagUserAccounts: Boolean = js.native
  var CopyflagValueListContent: Boolean = js.native
  var CopyflagValueLists: Boolean = js.native
  var CopyflagViews: Boolean = js.native
  var CopyflagWorkflows: Boolean = js.native
  var VaultGUID: String = js.native
  var VaultProperties: IVaultProperties = js.native
  def Clone(): ICopyVaultJob = js.native
}

object ICopyVaultJob {
  @scala.inline
  def apply(
    Clone: () => ICopyVaultJob,
    CopyflagAllData: Boolean,
    CopyflagAllExceptData: Boolean,
    CopyflagApplications: Boolean,
    CopyflagDataSets: Boolean,
    CopyflagDocumentProfiles: Boolean,
    CopyflagDocuments: Boolean,
    CopyflagEventLog: Boolean,
    CopyflagExternalLocations: Boolean,
    CopyflagFiles: Boolean,
    CopyflagInternalEventHandlers: Boolean,
    CopyflagLanguagesAndTranslations: Boolean,
    CopyflagPropertyDefinitions: Boolean,
    CopyflagScheduledExportAndImportJobs: Boolean,
    CopyflagUseTargetGUID: Boolean,
    CopyflagUserAccounts: Boolean,
    CopyflagValueListContent: Boolean,
    CopyflagValueLists: Boolean,
    CopyflagViews: Boolean,
    CopyflagWorkflows: Boolean,
    VaultGUID: String,
    VaultProperties: IVaultProperties
  ): ICopyVaultJob = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), CopyflagAllData = CopyflagAllData.asInstanceOf[js.Any], CopyflagAllExceptData = CopyflagAllExceptData.asInstanceOf[js.Any], CopyflagApplications = CopyflagApplications.asInstanceOf[js.Any], CopyflagDataSets = CopyflagDataSets.asInstanceOf[js.Any], CopyflagDocumentProfiles = CopyflagDocumentProfiles.asInstanceOf[js.Any], CopyflagDocuments = CopyflagDocuments.asInstanceOf[js.Any], CopyflagEventLog = CopyflagEventLog.asInstanceOf[js.Any], CopyflagExternalLocations = CopyflagExternalLocations.asInstanceOf[js.Any], CopyflagFiles = CopyflagFiles.asInstanceOf[js.Any], CopyflagInternalEventHandlers = CopyflagInternalEventHandlers.asInstanceOf[js.Any], CopyflagLanguagesAndTranslations = CopyflagLanguagesAndTranslations.asInstanceOf[js.Any], CopyflagPropertyDefinitions = CopyflagPropertyDefinitions.asInstanceOf[js.Any], CopyflagScheduledExportAndImportJobs = CopyflagScheduledExportAndImportJobs.asInstanceOf[js.Any], CopyflagUseTargetGUID = CopyflagUseTargetGUID.asInstanceOf[js.Any], CopyflagUserAccounts = CopyflagUserAccounts.asInstanceOf[js.Any], CopyflagValueListContent = CopyflagValueListContent.asInstanceOf[js.Any], CopyflagValueLists = CopyflagValueLists.asInstanceOf[js.Any], CopyflagViews = CopyflagViews.asInstanceOf[js.Any], CopyflagWorkflows = CopyflagWorkflows.asInstanceOf[js.Any], VaultGUID = VaultGUID.asInstanceOf[js.Any], VaultProperties = VaultProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICopyVaultJob]
  }
  @scala.inline
  implicit class ICopyVaultJobOps[Self <: ICopyVaultJob] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClone(value: () => ICopyVaultJob): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCopyflagAllData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CopyflagAllData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCopyflagAllExceptData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CopyflagAllExceptData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCopyflagApplications(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CopyflagApplications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCopyflagDataSets(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CopyflagDataSets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCopyflagDocumentProfiles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CopyflagDocumentProfiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCopyflagDocuments(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CopyflagDocuments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCopyflagEventLog(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CopyflagEventLog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCopyflagExternalLocations(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CopyflagExternalLocations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCopyflagFiles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CopyflagFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCopyflagInternalEventHandlers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CopyflagInternalEventHandlers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCopyflagLanguagesAndTranslations(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CopyflagLanguagesAndTranslations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCopyflagPropertyDefinitions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CopyflagPropertyDefinitions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCopyflagScheduledExportAndImportJobs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CopyflagScheduledExportAndImportJobs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCopyflagUseTargetGUID(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CopyflagUseTargetGUID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCopyflagUserAccounts(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CopyflagUserAccounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCopyflagValueListContent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CopyflagValueListContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCopyflagValueLists(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CopyflagValueLists")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCopyflagViews(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CopyflagViews")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCopyflagWorkflows(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CopyflagWorkflows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVaultGUID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VaultGUID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVaultProperties(value: IVaultProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VaultProperties")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

