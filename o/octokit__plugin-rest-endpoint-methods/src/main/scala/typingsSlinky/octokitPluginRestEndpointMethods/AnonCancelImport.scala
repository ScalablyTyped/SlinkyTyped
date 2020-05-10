package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCancelImport extends js.Object {
  var cancelImport: AnonUrl = js.native
  var deleteArchiveForAuthenticatedUser: AnonParamsAnonMigrationid = js.native
  var deleteArchiveForOrg: AnonParamsAnonMigrationidOrg = js.native
  var downloadArchiveForOrg: AnonParamsAnonMigrationidOrg = js.native
  var getArchiveForAuthenticatedUser: AnonParamsAnonMigrationid = js.native
  var getArchiveForOrg: AnonDeprecatedHeadersMethodParamsUrl = js.native
  var getCommitAuthors: AnonParamsAnonRepoSince = js.native
  var getImportProgress: AnonUrl = js.native
  var getLargeFiles: AnonUrl = js.native
  var getStatusForAuthenticatedUser: AnonParamsAnonMigrationid = js.native
  var getStatusForOrg: AnonParamsAnonMigrationidOrg = js.native
  var listForAuthenticatedUser: AnonMethodStringParamsAnonPagePerpage = js.native
  var listForOrg: AnonMethodStringParamsAnonOrgPage = js.native
  var listReposForOrg: AnonParamsAnonMigrationidOrgPage = js.native
  var listReposForUser: AnonParamsAnonMigrationidPage = js.native
  var mapCommitAuthor: AnonParamsAnonAuthorid = js.native
  var setLfsPreference: AnonParamsAnonUselfs = js.native
  var startForAuthenticatedUser: AnonParamsAnonExcludeattachments = js.native
  var startForOrg: AnonParamsAnonLockrepositories = js.native
  var startImport: AnonParamsAnonTfvcproject = js.native
  var unlockRepoForAuthenticatedUser: AnonParamsAnonReponame = js.native
  var unlockRepoForOrg: AnonParamsAnonOrgReponame = js.native
  var updateImport: AnonParamsAnonVcspassword = js.native
}

object AnonCancelImport {
  @scala.inline
  def apply(
    cancelImport: AnonUrl,
    deleteArchiveForAuthenticatedUser: AnonParamsAnonMigrationid,
    deleteArchiveForOrg: AnonParamsAnonMigrationidOrg,
    downloadArchiveForOrg: AnonParamsAnonMigrationidOrg,
    getArchiveForAuthenticatedUser: AnonParamsAnonMigrationid,
    getArchiveForOrg: AnonDeprecatedHeadersMethodParamsUrl,
    getCommitAuthors: AnonParamsAnonRepoSince,
    getImportProgress: AnonUrl,
    getLargeFiles: AnonUrl,
    getStatusForAuthenticatedUser: AnonParamsAnonMigrationid,
    getStatusForOrg: AnonParamsAnonMigrationidOrg,
    listForAuthenticatedUser: AnonMethodStringParamsAnonPagePerpage,
    listForOrg: AnonMethodStringParamsAnonOrgPage,
    listReposForOrg: AnonParamsAnonMigrationidOrgPage,
    listReposForUser: AnonParamsAnonMigrationidPage,
    mapCommitAuthor: AnonParamsAnonAuthorid,
    setLfsPreference: AnonParamsAnonUselfs,
    startForAuthenticatedUser: AnonParamsAnonExcludeattachments,
    startForOrg: AnonParamsAnonLockrepositories,
    startImport: AnonParamsAnonTfvcproject,
    unlockRepoForAuthenticatedUser: AnonParamsAnonReponame,
    unlockRepoForOrg: AnonParamsAnonOrgReponame,
    updateImport: AnonParamsAnonVcspassword
  ): AnonCancelImport = {
    val __obj = js.Dynamic.literal(cancelImport = cancelImport.asInstanceOf[js.Any], deleteArchiveForAuthenticatedUser = deleteArchiveForAuthenticatedUser.asInstanceOf[js.Any], deleteArchiveForOrg = deleteArchiveForOrg.asInstanceOf[js.Any], downloadArchiveForOrg = downloadArchiveForOrg.asInstanceOf[js.Any], getArchiveForAuthenticatedUser = getArchiveForAuthenticatedUser.asInstanceOf[js.Any], getArchiveForOrg = getArchiveForOrg.asInstanceOf[js.Any], getCommitAuthors = getCommitAuthors.asInstanceOf[js.Any], getImportProgress = getImportProgress.asInstanceOf[js.Any], getLargeFiles = getLargeFiles.asInstanceOf[js.Any], getStatusForAuthenticatedUser = getStatusForAuthenticatedUser.asInstanceOf[js.Any], getStatusForOrg = getStatusForOrg.asInstanceOf[js.Any], listForAuthenticatedUser = listForAuthenticatedUser.asInstanceOf[js.Any], listForOrg = listForOrg.asInstanceOf[js.Any], listReposForOrg = listReposForOrg.asInstanceOf[js.Any], listReposForUser = listReposForUser.asInstanceOf[js.Any], mapCommitAuthor = mapCommitAuthor.asInstanceOf[js.Any], setLfsPreference = setLfsPreference.asInstanceOf[js.Any], startForAuthenticatedUser = startForAuthenticatedUser.asInstanceOf[js.Any], startForOrg = startForOrg.asInstanceOf[js.Any], startImport = startImport.asInstanceOf[js.Any], unlockRepoForAuthenticatedUser = unlockRepoForAuthenticatedUser.asInstanceOf[js.Any], unlockRepoForOrg = unlockRepoForOrg.asInstanceOf[js.Any], updateImport = updateImport.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCancelImport]
  }
  @scala.inline
  implicit class AnonCancelImportOps[Self <: AnonCancelImport] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancelImport(value: AnonUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelImport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteArchiveForAuthenticatedUser(value: AnonParamsAnonMigrationid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteArchiveForAuthenticatedUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteArchiveForOrg(value: AnonParamsAnonMigrationidOrg): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteArchiveForOrg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDownloadArchiveForOrg(value: AnonParamsAnonMigrationidOrg): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadArchiveForOrg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetArchiveForAuthenticatedUser(value: AnonParamsAnonMigrationid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getArchiveForAuthenticatedUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetArchiveForOrg(value: AnonDeprecatedHeadersMethodParamsUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getArchiveForOrg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetCommitAuthors(value: AnonParamsAnonRepoSince): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCommitAuthors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetImportProgress(value: AnonUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getImportProgress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetLargeFiles(value: AnonUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLargeFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetStatusForAuthenticatedUser(value: AnonParamsAnonMigrationid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStatusForAuthenticatedUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetStatusForOrg(value: AnonParamsAnonMigrationidOrg): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStatusForOrg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListForAuthenticatedUser(value: AnonMethodStringParamsAnonPagePerpage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listForAuthenticatedUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListForOrg(value: AnonMethodStringParamsAnonOrgPage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listForOrg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListReposForOrg(value: AnonParamsAnonMigrationidOrgPage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listReposForOrg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListReposForUser(value: AnonParamsAnonMigrationidPage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listReposForUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMapCommitAuthor(value: AnonParamsAnonAuthorid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapCommitAuthor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetLfsPreference(value: AnonParamsAnonUselfs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLfsPreference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartForAuthenticatedUser(value: AnonParamsAnonExcludeattachments): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startForAuthenticatedUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartForOrg(value: AnonParamsAnonLockrepositories): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startForOrg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartImport(value: AnonParamsAnonTfvcproject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startImport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnlockRepoForAuthenticatedUser(value: AnonParamsAnonReponame): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unlockRepoForAuthenticatedUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnlockRepoForOrg(value: AnonParamsAnonOrgReponame): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unlockRepoForOrg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateImport(value: AnonParamsAnonVcspassword): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateImport")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

