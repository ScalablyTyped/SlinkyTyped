package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelImport extends js.Object {
  var cancelImport: Url = js.native
  var deleteArchiveForAuthenticatedUser: ParamsMigrationid = js.native
  var deleteArchiveForOrg: ParamsMigrationidOrg = js.native
  var downloadArchiveForOrg: ParamsMigrationidOrg = js.native
  var getArchiveForAuthenticatedUser: ParamsMigrationid = js.native
  var getArchiveForOrg: DeprecatedHeadersMethodParamsUrl = js.native
  var getCommitAuthors: ParamsRepoSince = js.native
  var getImportProgress: Url = js.native
  var getLargeFiles: Url = js.native
  var getStatusForAuthenticatedUser: ParamsMigrationid = js.native
  var getStatusForOrg: ParamsMigrationidOrg = js.native
  var listForAuthenticatedUser: MethodStringParamsPagePerpage = js.native
  var listForOrg: MethodStringParamsOrgPage = js.native
  var listReposForOrg: ParamsMigrationidOrgPage = js.native
  var listReposForUser: ParamsMigrationidPage = js.native
  var mapCommitAuthor: ParamsAuthorid = js.native
  var setLfsPreference: ParamsUselfs = js.native
  var startForAuthenticatedUser: ParamsExcludeattachments = js.native
  var startForOrg: ParamsLockrepositories = js.native
  var startImport: ParamsTfvcproject = js.native
  var unlockRepoForAuthenticatedUser: ParamsReponame = js.native
  var unlockRepoForOrg: ParamsOrgReponame = js.native
  var updateImport: ParamsVcspassword = js.native
}

object CancelImport {
  @scala.inline
  def apply(
    cancelImport: Url,
    deleteArchiveForAuthenticatedUser: ParamsMigrationid,
    deleteArchiveForOrg: ParamsMigrationidOrg,
    downloadArchiveForOrg: ParamsMigrationidOrg,
    getArchiveForAuthenticatedUser: ParamsMigrationid,
    getArchiveForOrg: DeprecatedHeadersMethodParamsUrl,
    getCommitAuthors: ParamsRepoSince,
    getImportProgress: Url,
    getLargeFiles: Url,
    getStatusForAuthenticatedUser: ParamsMigrationid,
    getStatusForOrg: ParamsMigrationidOrg,
    listForAuthenticatedUser: MethodStringParamsPagePerpage,
    listForOrg: MethodStringParamsOrgPage,
    listReposForOrg: ParamsMigrationidOrgPage,
    listReposForUser: ParamsMigrationidPage,
    mapCommitAuthor: ParamsAuthorid,
    setLfsPreference: ParamsUselfs,
    startForAuthenticatedUser: ParamsExcludeattachments,
    startForOrg: ParamsLockrepositories,
    startImport: ParamsTfvcproject,
    unlockRepoForAuthenticatedUser: ParamsReponame,
    unlockRepoForOrg: ParamsOrgReponame,
    updateImport: ParamsVcspassword
  ): CancelImport = {
    val __obj = js.Dynamic.literal(cancelImport = cancelImport.asInstanceOf[js.Any], deleteArchiveForAuthenticatedUser = deleteArchiveForAuthenticatedUser.asInstanceOf[js.Any], deleteArchiveForOrg = deleteArchiveForOrg.asInstanceOf[js.Any], downloadArchiveForOrg = downloadArchiveForOrg.asInstanceOf[js.Any], getArchiveForAuthenticatedUser = getArchiveForAuthenticatedUser.asInstanceOf[js.Any], getArchiveForOrg = getArchiveForOrg.asInstanceOf[js.Any], getCommitAuthors = getCommitAuthors.asInstanceOf[js.Any], getImportProgress = getImportProgress.asInstanceOf[js.Any], getLargeFiles = getLargeFiles.asInstanceOf[js.Any], getStatusForAuthenticatedUser = getStatusForAuthenticatedUser.asInstanceOf[js.Any], getStatusForOrg = getStatusForOrg.asInstanceOf[js.Any], listForAuthenticatedUser = listForAuthenticatedUser.asInstanceOf[js.Any], listForOrg = listForOrg.asInstanceOf[js.Any], listReposForOrg = listReposForOrg.asInstanceOf[js.Any], listReposForUser = listReposForUser.asInstanceOf[js.Any], mapCommitAuthor = mapCommitAuthor.asInstanceOf[js.Any], setLfsPreference = setLfsPreference.asInstanceOf[js.Any], startForAuthenticatedUser = startForAuthenticatedUser.asInstanceOf[js.Any], startForOrg = startForOrg.asInstanceOf[js.Any], startImport = startImport.asInstanceOf[js.Any], unlockRepoForAuthenticatedUser = unlockRepoForAuthenticatedUser.asInstanceOf[js.Any], unlockRepoForOrg = unlockRepoForOrg.asInstanceOf[js.Any], updateImport = updateImport.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelImport]
  }
  @scala.inline
  implicit class CancelImportOps[Self <: CancelImport] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancelImport(value: Url): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelImport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteArchiveForAuthenticatedUser(value: ParamsMigrationid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteArchiveForAuthenticatedUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteArchiveForOrg(value: ParamsMigrationidOrg): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteArchiveForOrg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDownloadArchiveForOrg(value: ParamsMigrationidOrg): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadArchiveForOrg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetArchiveForAuthenticatedUser(value: ParamsMigrationid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getArchiveForAuthenticatedUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetArchiveForOrg(value: DeprecatedHeadersMethodParamsUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getArchiveForOrg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetCommitAuthors(value: ParamsRepoSince): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCommitAuthors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetImportProgress(value: Url): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getImportProgress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetLargeFiles(value: Url): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLargeFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetStatusForAuthenticatedUser(value: ParamsMigrationid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStatusForAuthenticatedUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetStatusForOrg(value: ParamsMigrationidOrg): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStatusForOrg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListForAuthenticatedUser(value: MethodStringParamsPagePerpage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listForAuthenticatedUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListForOrg(value: MethodStringParamsOrgPage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listForOrg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListReposForOrg(value: ParamsMigrationidOrgPage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listReposForOrg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListReposForUser(value: ParamsMigrationidPage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listReposForUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMapCommitAuthor(value: ParamsAuthorid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapCommitAuthor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetLfsPreference(value: ParamsUselfs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLfsPreference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartForAuthenticatedUser(value: ParamsExcludeattachments): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startForAuthenticatedUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartForOrg(value: ParamsLockrepositories): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startForOrg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartImport(value: ParamsTfvcproject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startImport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnlockRepoForAuthenticatedUser(value: ParamsReponame): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unlockRepoForAuthenticatedUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnlockRepoForOrg(value: ParamsOrgReponame): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unlockRepoForOrg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateImport(value: ParamsVcspassword): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateImport")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

