package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelImport extends js.Object {
  var cancelImport: Url
  var deleteArchiveForAuthenticatedUser: ParamsMigrationid
  var deleteArchiveForOrg: ParamsMigrationidOrg
  var downloadArchiveForOrg: ParamsMigrationidOrg
  var getArchiveForAuthenticatedUser: ParamsMigrationid
  var getArchiveForOrg: DeprecatedHeadersMethodParamsUrl
  var getCommitAuthors: ParamsRepoSince
  var getImportProgress: Url
  var getLargeFiles: Url
  var getStatusForAuthenticatedUser: ParamsMigrationid
  var getStatusForOrg: ParamsMigrationidOrg
  var listForAuthenticatedUser: MethodStringParamsPagePerpage
  var listForOrg: MethodStringParamsOrgPage
  var listReposForOrg: ParamsMigrationidOrgPage
  var listReposForUser: ParamsMigrationidPage
  var mapCommitAuthor: ParamsAuthorid
  var setLfsPreference: ParamsUselfs
  var startForAuthenticatedUser: ParamsExcludeattachments
  var startForOrg: ParamsLockrepositories
  var startImport: ParamsTfvcproject
  var unlockRepoForAuthenticatedUser: ParamsReponame
  var unlockRepoForOrg: ParamsOrgReponame
  var updateImport: ParamsVcspassword
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
}

