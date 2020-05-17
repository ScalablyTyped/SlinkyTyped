package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AcceptInvitation extends js.Object {
  var acceptInvitation: ParamsInvitationidRequired = js.native
  var addCollaborator: ParamsOwnerPermission = js.native
  var addDeployKey: ParamsReadonly = js.native
  var addProtectedBranchAdminEnforcement: ParamsBranchOwner = js.native
  var addProtectedBranchAppRestrictions: ParamsApps = js.native
  var addProtectedBranchRequiredSignatures: MethodStringParamsBranchOwner = js.native
  var addProtectedBranchRequiredStatusChecksContexts: ParamsContexts = js.native
  var addProtectedBranchTeamRestrictions: ParamsTeams = js.native
  var addProtectedBranchUserRestrictions: ParamsUsers = js.native
  var checkCollaborator: ParamsRepoUsername = js.native
  var checkVulnerabilityAlerts: ParamsRepo = js.native
  var compareCommits: ParamsBaseHead = js.native
  var createCommitComment: ParamsLine = js.native
  var createDeployment: ParamsAutomerge = js.native
  var createDeploymentStatus: ParamsAutoinactive = js.native
  var createDispatchEvent: ParamsClientpayload = js.native
  var createFile: ParamsAuthoremail = js.native
  var createForAuthenticatedUser: ParamsAllowmergecommit = js.native
  var createFork: ParamsOrganization = js.native
  var createHook: ParamsConfigcontenttype = js.native
  var createInOrg: ParamsAllowrebasemerge = js.native
  var createOrUpdateFile: MethodStringParamsAuthoremail = js.native
  var createRelease: ParamsPrerelease = js.native
  var createStatus: ParamsTargeturl = js.native
  var createUsingTemplate: ParamsPrivate = js.native
  var declineInvitation: ParamsInvitationidRequired = js.native
  var delete: Url = js.native
  var deleteCommitComment: ParamsCommentidOwner = js.native
  var deleteDownload: ParamsDownloadid = js.native
  var deleteFile: ParamsAuthorname = js.native
  var deleteHook: ParamsHookidOwner = js.native
  var deleteInvitation: ParamsInvitationidOwner = js.native
  var deleteRelease: ParamsReleaseid = js.native
  var deleteReleaseAsset: ParamsAssetid = js.native
  var disableAutomatedSecurityFixes: ParamsRepo = js.native
  var disablePagesSite: ParamsRepo = js.native
  var disableVulnerabilityAlerts: ParamsRepo = js.native
  var enableAutomatedSecurityFixes: ParamsRepo = js.native
  var enablePagesSite: ParamsSource = js.native
  var enableVulnerabilityAlerts: ParamsRepo = js.native
  var get: Url = js.native
  var getAppsWithAccessToProtectedBranch: ParamsBranchOwner = js.native
  var getArchiveLink: ParamsArchiveformatOwner = js.native
  var getBranch: ParamsBranchOwner = js.native
  var getBranchProtection: ParamsBranchOwner = js.native
  var getClones: ParamsPer = js.native
  var getCodeFrequencyStats: Url = js.native
  var getCollaboratorPermissionLevel: ParamsRepoUsername = js.native
  var getCombinedStatusForRef: ParamsOwnerRef = js.native
  var getCommit: ParamsCommitshaOwner = js.native
  var getCommitActivityStats: Url = js.native
  var getCommitComment: ParamsCommentidOwner = js.native
  var getCommitRefSha: DeprecatedStringHeadersAccept = js.native
  var getContents: ParamsPath = js.native
  var getContributorsStats: Url = js.native
  var getDeployKey: ParamsKeyid = js.native
  var getDeployment: ParamsDeploymentid = js.native
  var getDeploymentStatus: ParamsStatusid = js.native
  var getDownload: ParamsDownloadid = js.native
  var getHook: ParamsHookidOwner = js.native
  var getLatestPagesBuild: Url = js.native
  var getLatestRelease: Url = js.native
  var getPages: Url = js.native
  var getPagesBuild: ParamsBuildid = js.native
  var getParticipationStats: Url = js.native
  var getProtectedBranchAdminEnforcement: ParamsBranchOwner = js.native
  var getProtectedBranchPullRequestReviewEnforcement: ParamsBranchOwner = js.native
  var getProtectedBranchRequiredSignatures: MethodStringParamsBranchOwner = js.native
  var getProtectedBranchRequiredStatusChecks: ParamsBranchOwner = js.native
  var getProtectedBranchRestrictions: ParamsBranchOwner = js.native
  var getPunchCardStats: Url = js.native
  var getReadme: ParamsRefRepo = js.native
  var getRelease: ParamsReleaseid = js.native
  var getReleaseAsset: ParamsAssetid = js.native
  var getReleaseByTag: ParamsTag = js.native
  var getTeamsWithAccessToProtectedBranch: ParamsBranchOwner = js.native
  var getTopPaths: Url = js.native
  var getTopReferrers: Url = js.native
  var getUsersWithAccessToProtectedBranch: ParamsBranchOwner = js.native
  var getViews: ParamsPer = js.native
  var list: ParamsVisibility = js.native
  var listAppsWithAccessToProtectedBranch: ParamsBranchOwnerUrlString = js.native
  var listAssetsForRelease: ParamsPerpageReleaseid = js.native
  var listBranches: ParamsProtected = js.native
  var listBranchesForHeadCommit: MethodStringParamsCommitsha = js.native
  var listCollaborators: ParamsAffiliationOwner = js.native
  var listCommentsForCommit: ParamsCommitshaOwnerPage = js.native
  var listCommitComments: ParamsOwnerPage = js.native
  var listCommits: ParamsUntil = js.native
  var listContributors: ParamsAnon = js.native
  var listDeployKeys: ParamsOwnerPage = js.native
  var listDeploymentStatuses: ParamsDeploymentidOwner = js.native
  var listDeployments: ParamsEnvironment = js.native
  var listDownloads: ParamsOwnerPage = js.native
  var listForOrg: ParamsDirectionOrg = js.native
  var listForUser: ParamsDirectionPage = js.native
  var listForks: ParamsOwnerPagePerpage = js.native
  var listHooks: ParamsOwnerPage = js.native
  var listInvitations: ParamsOwnerPage = js.native
  var listInvitationsForAuthenticatedUser: ParamsPagePerpage = js.native
  var listLanguages: Url = js.native
  var listPagesBuilds: ParamsOwnerPage = js.native
  var listProtectedBranchRequiredStatusChecksContexts: ParamsBranchOwner = js.native
  var listProtectedBranchTeamRestrictions: ParamsBranchOwnerUrlString = js.native
  var listProtectedBranchUserRestrictions: ParamsBranchOwnerUrlString = js.native
  var listPublic: ParamsSince = js.native
  var listPullRequestsAssociatedWithCommit: ParamsPagePerpageRepo = js.native
  var listReleases: ParamsOwnerPage = js.native
  var listStatusesForRef: ParamsPerpageRef = js.native
  var listTags: ParamsOwnerPage = js.native
  var listTeams: ParamsOwnerPage = js.native
  var listTeamsWithAccessToProtectedBranch: ParamsBranchOwnerUrlString = js.native
  var listTopics: ParamsRepo = js.native
  var listUsersWithAccessToProtectedBranch: ParamsBranchOwnerUrlString = js.native
  var merge: ParamsBaseCommitmessage = js.native
  var pingHook: ParamsHookidOwner = js.native
  var removeBranchProtection: ParamsBranchOwner = js.native
  var removeCollaborator: ParamsRepoUsername = js.native
  var removeDeployKey: ParamsKeyid = js.native
  var removeProtectedBranchAdminEnforcement: ParamsBranchOwner = js.native
  var removeProtectedBranchAppRestrictions: ParamsApps = js.native
  var removeProtectedBranchPullRequestReviewEnforcement: ParamsBranchOwner = js.native
  var removeProtectedBranchRequiredSignatures: MethodStringParamsBranchOwner = js.native
  var removeProtectedBranchRequiredStatusChecks: ParamsBranchOwner = js.native
  var removeProtectedBranchRequiredStatusChecksContexts: ParamsContexts = js.native
  var removeProtectedBranchRestrictions: ParamsBranchOwner = js.native
  var removeProtectedBranchTeamRestrictions: ParamsTeams = js.native
  var removeProtectedBranchUserRestrictions: ParamsUsers = js.native
  var replaceProtectedBranchAppRestrictions: ParamsApps = js.native
  var replaceProtectedBranchRequiredStatusChecksContexts: ParamsContexts = js.native
  var replaceProtectedBranchTeamRestrictions: ParamsTeams = js.native
  var replaceProtectedBranchUserRestrictions: ParamsUsers = js.native
  var replaceTopics: ParamsNames = js.native
  var requestPageBuild: Url = js.native
  var retrieveCommunityProfileMetrics: Url = js.native
  var testPushHook: ParamsHookidOwner = js.native
  var transfer: ParamsNewowner = js.native
  var update: ParamsAllowsquashmerge = js.native
  var updateBranchProtection: ParamsAllowdeletions = js.native
  var updateCommitComment: ParamsOwnerRepo = js.native
  var updateFile: ParamsAuthoremail = js.native
  var updateHook: ParamsAddevents = js.native
  var updateInformationAboutPagesSite: ParamsCname = js.native
  var updateInvitation: ParamsOwnerPermissions = js.native
  var updateProtectedBranchPullRequestReviewEnforcement: ParamsDismissalrestrictions = js.native
  var updateProtectedBranchRequiredStatusChecks: ParamsStrict = js.native
  var updateRelease: ParamsTagname = js.native
  var updateReleaseAsset: ParamsLabel = js.native
  var uploadReleaseAsset: ParamsFile = js.native
}

object AcceptInvitation {
  @scala.inline
  def apply(
    acceptInvitation: ParamsInvitationidRequired,
    addCollaborator: ParamsOwnerPermission,
    addDeployKey: ParamsReadonly,
    addProtectedBranchAdminEnforcement: ParamsBranchOwner,
    addProtectedBranchAppRestrictions: ParamsApps,
    addProtectedBranchRequiredSignatures: MethodStringParamsBranchOwner,
    addProtectedBranchRequiredStatusChecksContexts: ParamsContexts,
    addProtectedBranchTeamRestrictions: ParamsTeams,
    addProtectedBranchUserRestrictions: ParamsUsers,
    checkCollaborator: ParamsRepoUsername,
    checkVulnerabilityAlerts: ParamsRepo,
    compareCommits: ParamsBaseHead,
    createCommitComment: ParamsLine,
    createDeployment: ParamsAutomerge,
    createDeploymentStatus: ParamsAutoinactive,
    createDispatchEvent: ParamsClientpayload,
    createFile: ParamsAuthoremail,
    createForAuthenticatedUser: ParamsAllowmergecommit,
    createFork: ParamsOrganization,
    createHook: ParamsConfigcontenttype,
    createInOrg: ParamsAllowrebasemerge,
    createOrUpdateFile: MethodStringParamsAuthoremail,
    createRelease: ParamsPrerelease,
    createStatus: ParamsTargeturl,
    createUsingTemplate: ParamsPrivate,
    declineInvitation: ParamsInvitationidRequired,
    delete: Url,
    deleteCommitComment: ParamsCommentidOwner,
    deleteDownload: ParamsDownloadid,
    deleteFile: ParamsAuthorname,
    deleteHook: ParamsHookidOwner,
    deleteInvitation: ParamsInvitationidOwner,
    deleteRelease: ParamsReleaseid,
    deleteReleaseAsset: ParamsAssetid,
    disableAutomatedSecurityFixes: ParamsRepo,
    disablePagesSite: ParamsRepo,
    disableVulnerabilityAlerts: ParamsRepo,
    enableAutomatedSecurityFixes: ParamsRepo,
    enablePagesSite: ParamsSource,
    enableVulnerabilityAlerts: ParamsRepo,
    get: Url,
    getAppsWithAccessToProtectedBranch: ParamsBranchOwner,
    getArchiveLink: ParamsArchiveformatOwner,
    getBranch: ParamsBranchOwner,
    getBranchProtection: ParamsBranchOwner,
    getClones: ParamsPer,
    getCodeFrequencyStats: Url,
    getCollaboratorPermissionLevel: ParamsRepoUsername,
    getCombinedStatusForRef: ParamsOwnerRef,
    getCommit: ParamsCommitshaOwner,
    getCommitActivityStats: Url,
    getCommitComment: ParamsCommentidOwner,
    getCommitRefSha: DeprecatedStringHeadersAccept,
    getContents: ParamsPath,
    getContributorsStats: Url,
    getDeployKey: ParamsKeyid,
    getDeployment: ParamsDeploymentid,
    getDeploymentStatus: ParamsStatusid,
    getDownload: ParamsDownloadid,
    getHook: ParamsHookidOwner,
    getLatestPagesBuild: Url,
    getLatestRelease: Url,
    getPages: Url,
    getPagesBuild: ParamsBuildid,
    getParticipationStats: Url,
    getProtectedBranchAdminEnforcement: ParamsBranchOwner,
    getProtectedBranchPullRequestReviewEnforcement: ParamsBranchOwner,
    getProtectedBranchRequiredSignatures: MethodStringParamsBranchOwner,
    getProtectedBranchRequiredStatusChecks: ParamsBranchOwner,
    getProtectedBranchRestrictions: ParamsBranchOwner,
    getPunchCardStats: Url,
    getReadme: ParamsRefRepo,
    getRelease: ParamsReleaseid,
    getReleaseAsset: ParamsAssetid,
    getReleaseByTag: ParamsTag,
    getTeamsWithAccessToProtectedBranch: ParamsBranchOwner,
    getTopPaths: Url,
    getTopReferrers: Url,
    getUsersWithAccessToProtectedBranch: ParamsBranchOwner,
    getViews: ParamsPer,
    list: ParamsVisibility,
    listAppsWithAccessToProtectedBranch: ParamsBranchOwnerUrlString,
    listAssetsForRelease: ParamsPerpageReleaseid,
    listBranches: ParamsProtected,
    listBranchesForHeadCommit: MethodStringParamsCommitsha,
    listCollaborators: ParamsAffiliationOwner,
    listCommentsForCommit: ParamsCommitshaOwnerPage,
    listCommitComments: ParamsOwnerPage,
    listCommits: ParamsUntil,
    listContributors: ParamsAnon,
    listDeployKeys: ParamsOwnerPage,
    listDeploymentStatuses: ParamsDeploymentidOwner,
    listDeployments: ParamsEnvironment,
    listDownloads: ParamsOwnerPage,
    listForOrg: ParamsDirectionOrg,
    listForUser: ParamsDirectionPage,
    listForks: ParamsOwnerPagePerpage,
    listHooks: ParamsOwnerPage,
    listInvitations: ParamsOwnerPage,
    listInvitationsForAuthenticatedUser: ParamsPagePerpage,
    listLanguages: Url,
    listPagesBuilds: ParamsOwnerPage,
    listProtectedBranchRequiredStatusChecksContexts: ParamsBranchOwner,
    listProtectedBranchTeamRestrictions: ParamsBranchOwnerUrlString,
    listProtectedBranchUserRestrictions: ParamsBranchOwnerUrlString,
    listPublic: ParamsSince,
    listPullRequestsAssociatedWithCommit: ParamsPagePerpageRepo,
    listReleases: ParamsOwnerPage,
    listStatusesForRef: ParamsPerpageRef,
    listTags: ParamsOwnerPage,
    listTeams: ParamsOwnerPage,
    listTeamsWithAccessToProtectedBranch: ParamsBranchOwnerUrlString,
    listTopics: ParamsRepo,
    listUsersWithAccessToProtectedBranch: ParamsBranchOwnerUrlString,
    merge: ParamsBaseCommitmessage,
    pingHook: ParamsHookidOwner,
    removeBranchProtection: ParamsBranchOwner,
    removeCollaborator: ParamsRepoUsername,
    removeDeployKey: ParamsKeyid,
    removeProtectedBranchAdminEnforcement: ParamsBranchOwner,
    removeProtectedBranchAppRestrictions: ParamsApps,
    removeProtectedBranchPullRequestReviewEnforcement: ParamsBranchOwner,
    removeProtectedBranchRequiredSignatures: MethodStringParamsBranchOwner,
    removeProtectedBranchRequiredStatusChecks: ParamsBranchOwner,
    removeProtectedBranchRequiredStatusChecksContexts: ParamsContexts,
    removeProtectedBranchRestrictions: ParamsBranchOwner,
    removeProtectedBranchTeamRestrictions: ParamsTeams,
    removeProtectedBranchUserRestrictions: ParamsUsers,
    replaceProtectedBranchAppRestrictions: ParamsApps,
    replaceProtectedBranchRequiredStatusChecksContexts: ParamsContexts,
    replaceProtectedBranchTeamRestrictions: ParamsTeams,
    replaceProtectedBranchUserRestrictions: ParamsUsers,
    replaceTopics: ParamsNames,
    requestPageBuild: Url,
    retrieveCommunityProfileMetrics: Url,
    testPushHook: ParamsHookidOwner,
    transfer: ParamsNewowner,
    update: ParamsAllowsquashmerge,
    updateBranchProtection: ParamsAllowdeletions,
    updateCommitComment: ParamsOwnerRepo,
    updateFile: ParamsAuthoremail,
    updateHook: ParamsAddevents,
    updateInformationAboutPagesSite: ParamsCname,
    updateInvitation: ParamsOwnerPermissions,
    updateProtectedBranchPullRequestReviewEnforcement: ParamsDismissalrestrictions,
    updateProtectedBranchRequiredStatusChecks: ParamsStrict,
    updateRelease: ParamsTagname,
    updateReleaseAsset: ParamsLabel,
    uploadReleaseAsset: ParamsFile
  ): AcceptInvitation = {
    val __obj = js.Dynamic.literal(acceptInvitation = acceptInvitation.asInstanceOf[js.Any], addCollaborator = addCollaborator.asInstanceOf[js.Any], addDeployKey = addDeployKey.asInstanceOf[js.Any], addProtectedBranchAdminEnforcement = addProtectedBranchAdminEnforcement.asInstanceOf[js.Any], addProtectedBranchAppRestrictions = addProtectedBranchAppRestrictions.asInstanceOf[js.Any], addProtectedBranchRequiredSignatures = addProtectedBranchRequiredSignatures.asInstanceOf[js.Any], addProtectedBranchRequiredStatusChecksContexts = addProtectedBranchRequiredStatusChecksContexts.asInstanceOf[js.Any], addProtectedBranchTeamRestrictions = addProtectedBranchTeamRestrictions.asInstanceOf[js.Any], addProtectedBranchUserRestrictions = addProtectedBranchUserRestrictions.asInstanceOf[js.Any], checkCollaborator = checkCollaborator.asInstanceOf[js.Any], checkVulnerabilityAlerts = checkVulnerabilityAlerts.asInstanceOf[js.Any], compareCommits = compareCommits.asInstanceOf[js.Any], createCommitComment = createCommitComment.asInstanceOf[js.Any], createDeployment = createDeployment.asInstanceOf[js.Any], createDeploymentStatus = createDeploymentStatus.asInstanceOf[js.Any], createDispatchEvent = createDispatchEvent.asInstanceOf[js.Any], createFile = createFile.asInstanceOf[js.Any], createForAuthenticatedUser = createForAuthenticatedUser.asInstanceOf[js.Any], createFork = createFork.asInstanceOf[js.Any], createHook = createHook.asInstanceOf[js.Any], createInOrg = createInOrg.asInstanceOf[js.Any], createOrUpdateFile = createOrUpdateFile.asInstanceOf[js.Any], createRelease = createRelease.asInstanceOf[js.Any], createStatus = createStatus.asInstanceOf[js.Any], createUsingTemplate = createUsingTemplate.asInstanceOf[js.Any], declineInvitation = declineInvitation.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], deleteCommitComment = deleteCommitComment.asInstanceOf[js.Any], deleteDownload = deleteDownload.asInstanceOf[js.Any], deleteFile = deleteFile.asInstanceOf[js.Any], deleteHook = deleteHook.asInstanceOf[js.Any], deleteInvitation = deleteInvitation.asInstanceOf[js.Any], deleteRelease = deleteRelease.asInstanceOf[js.Any], deleteReleaseAsset = deleteReleaseAsset.asInstanceOf[js.Any], disableAutomatedSecurityFixes = disableAutomatedSecurityFixes.asInstanceOf[js.Any], disablePagesSite = disablePagesSite.asInstanceOf[js.Any], disableVulnerabilityAlerts = disableVulnerabilityAlerts.asInstanceOf[js.Any], enableAutomatedSecurityFixes = enableAutomatedSecurityFixes.asInstanceOf[js.Any], enablePagesSite = enablePagesSite.asInstanceOf[js.Any], enableVulnerabilityAlerts = enableVulnerabilityAlerts.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], getAppsWithAccessToProtectedBranch = getAppsWithAccessToProtectedBranch.asInstanceOf[js.Any], getArchiveLink = getArchiveLink.asInstanceOf[js.Any], getBranch = getBranch.asInstanceOf[js.Any], getBranchProtection = getBranchProtection.asInstanceOf[js.Any], getClones = getClones.asInstanceOf[js.Any], getCodeFrequencyStats = getCodeFrequencyStats.asInstanceOf[js.Any], getCollaboratorPermissionLevel = getCollaboratorPermissionLevel.asInstanceOf[js.Any], getCombinedStatusForRef = getCombinedStatusForRef.asInstanceOf[js.Any], getCommit = getCommit.asInstanceOf[js.Any], getCommitActivityStats = getCommitActivityStats.asInstanceOf[js.Any], getCommitComment = getCommitComment.asInstanceOf[js.Any], getCommitRefSha = getCommitRefSha.asInstanceOf[js.Any], getContents = getContents.asInstanceOf[js.Any], getContributorsStats = getContributorsStats.asInstanceOf[js.Any], getDeployKey = getDeployKey.asInstanceOf[js.Any], getDeployment = getDeployment.asInstanceOf[js.Any], getDeploymentStatus = getDeploymentStatus.asInstanceOf[js.Any], getDownload = getDownload.asInstanceOf[js.Any], getHook = getHook.asInstanceOf[js.Any], getLatestPagesBuild = getLatestPagesBuild.asInstanceOf[js.Any], getLatestRelease = getLatestRelease.asInstanceOf[js.Any], getPages = getPages.asInstanceOf[js.Any], getPagesBuild = getPagesBuild.asInstanceOf[js.Any], getParticipationStats = getParticipationStats.asInstanceOf[js.Any], getProtectedBranchAdminEnforcement = getProtectedBranchAdminEnforcement.asInstanceOf[js.Any], getProtectedBranchPullRequestReviewEnforcement = getProtectedBranchPullRequestReviewEnforcement.asInstanceOf[js.Any], getProtectedBranchRequiredSignatures = getProtectedBranchRequiredSignatures.asInstanceOf[js.Any], getProtectedBranchRequiredStatusChecks = getProtectedBranchRequiredStatusChecks.asInstanceOf[js.Any], getProtectedBranchRestrictions = getProtectedBranchRestrictions.asInstanceOf[js.Any], getPunchCardStats = getPunchCardStats.asInstanceOf[js.Any], getReadme = getReadme.asInstanceOf[js.Any], getRelease = getRelease.asInstanceOf[js.Any], getReleaseAsset = getReleaseAsset.asInstanceOf[js.Any], getReleaseByTag = getReleaseByTag.asInstanceOf[js.Any], getTeamsWithAccessToProtectedBranch = getTeamsWithAccessToProtectedBranch.asInstanceOf[js.Any], getTopPaths = getTopPaths.asInstanceOf[js.Any], getTopReferrers = getTopReferrers.asInstanceOf[js.Any], getUsersWithAccessToProtectedBranch = getUsersWithAccessToProtectedBranch.asInstanceOf[js.Any], getViews = getViews.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], listAppsWithAccessToProtectedBranch = listAppsWithAccessToProtectedBranch.asInstanceOf[js.Any], listAssetsForRelease = listAssetsForRelease.asInstanceOf[js.Any], listBranches = listBranches.asInstanceOf[js.Any], listBranchesForHeadCommit = listBranchesForHeadCommit.asInstanceOf[js.Any], listCollaborators = listCollaborators.asInstanceOf[js.Any], listCommentsForCommit = listCommentsForCommit.asInstanceOf[js.Any], listCommitComments = listCommitComments.asInstanceOf[js.Any], listCommits = listCommits.asInstanceOf[js.Any], listContributors = listContributors.asInstanceOf[js.Any], listDeployKeys = listDeployKeys.asInstanceOf[js.Any], listDeploymentStatuses = listDeploymentStatuses.asInstanceOf[js.Any], listDeployments = listDeployments.asInstanceOf[js.Any], listDownloads = listDownloads.asInstanceOf[js.Any], listForOrg = listForOrg.asInstanceOf[js.Any], listForUser = listForUser.asInstanceOf[js.Any], listForks = listForks.asInstanceOf[js.Any], listHooks = listHooks.asInstanceOf[js.Any], listInvitations = listInvitations.asInstanceOf[js.Any], listInvitationsForAuthenticatedUser = listInvitationsForAuthenticatedUser.asInstanceOf[js.Any], listLanguages = listLanguages.asInstanceOf[js.Any], listPagesBuilds = listPagesBuilds.asInstanceOf[js.Any], listProtectedBranchRequiredStatusChecksContexts = listProtectedBranchRequiredStatusChecksContexts.asInstanceOf[js.Any], listProtectedBranchTeamRestrictions = listProtectedBranchTeamRestrictions.asInstanceOf[js.Any], listProtectedBranchUserRestrictions = listProtectedBranchUserRestrictions.asInstanceOf[js.Any], listPublic = listPublic.asInstanceOf[js.Any], listPullRequestsAssociatedWithCommit = listPullRequestsAssociatedWithCommit.asInstanceOf[js.Any], listReleases = listReleases.asInstanceOf[js.Any], listStatusesForRef = listStatusesForRef.asInstanceOf[js.Any], listTags = listTags.asInstanceOf[js.Any], listTeams = listTeams.asInstanceOf[js.Any], listTeamsWithAccessToProtectedBranch = listTeamsWithAccessToProtectedBranch.asInstanceOf[js.Any], listTopics = listTopics.asInstanceOf[js.Any], listUsersWithAccessToProtectedBranch = listUsersWithAccessToProtectedBranch.asInstanceOf[js.Any], merge = merge.asInstanceOf[js.Any], pingHook = pingHook.asInstanceOf[js.Any], removeBranchProtection = removeBranchProtection.asInstanceOf[js.Any], removeCollaborator = removeCollaborator.asInstanceOf[js.Any], removeDeployKey = removeDeployKey.asInstanceOf[js.Any], removeProtectedBranchAdminEnforcement = removeProtectedBranchAdminEnforcement.asInstanceOf[js.Any], removeProtectedBranchAppRestrictions = removeProtectedBranchAppRestrictions.asInstanceOf[js.Any], removeProtectedBranchPullRequestReviewEnforcement = removeProtectedBranchPullRequestReviewEnforcement.asInstanceOf[js.Any], removeProtectedBranchRequiredSignatures = removeProtectedBranchRequiredSignatures.asInstanceOf[js.Any], removeProtectedBranchRequiredStatusChecks = removeProtectedBranchRequiredStatusChecks.asInstanceOf[js.Any], removeProtectedBranchRequiredStatusChecksContexts = removeProtectedBranchRequiredStatusChecksContexts.asInstanceOf[js.Any], removeProtectedBranchRestrictions = removeProtectedBranchRestrictions.asInstanceOf[js.Any], removeProtectedBranchTeamRestrictions = removeProtectedBranchTeamRestrictions.asInstanceOf[js.Any], removeProtectedBranchUserRestrictions = removeProtectedBranchUserRestrictions.asInstanceOf[js.Any], replaceProtectedBranchAppRestrictions = replaceProtectedBranchAppRestrictions.asInstanceOf[js.Any], replaceProtectedBranchRequiredStatusChecksContexts = replaceProtectedBranchRequiredStatusChecksContexts.asInstanceOf[js.Any], replaceProtectedBranchTeamRestrictions = replaceProtectedBranchTeamRestrictions.asInstanceOf[js.Any], replaceProtectedBranchUserRestrictions = replaceProtectedBranchUserRestrictions.asInstanceOf[js.Any], replaceTopics = replaceTopics.asInstanceOf[js.Any], requestPageBuild = requestPageBuild.asInstanceOf[js.Any], retrieveCommunityProfileMetrics = retrieveCommunityProfileMetrics.asInstanceOf[js.Any], testPushHook = testPushHook.asInstanceOf[js.Any], transfer = transfer.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any], updateBranchProtection = updateBranchProtection.asInstanceOf[js.Any], updateCommitComment = updateCommitComment.asInstanceOf[js.Any], updateFile = updateFile.asInstanceOf[js.Any], updateHook = updateHook.asInstanceOf[js.Any], updateInformationAboutPagesSite = updateInformationAboutPagesSite.asInstanceOf[js.Any], updateInvitation = updateInvitation.asInstanceOf[js.Any], updateProtectedBranchPullRequestReviewEnforcement = updateProtectedBranchPullRequestReviewEnforcement.asInstanceOf[js.Any], updateProtectedBranchRequiredStatusChecks = updateProtectedBranchRequiredStatusChecks.asInstanceOf[js.Any], updateRelease = updateRelease.asInstanceOf[js.Any], updateReleaseAsset = updateReleaseAsset.asInstanceOf[js.Any], uploadReleaseAsset = uploadReleaseAsset.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceptInvitation]
  }
  @scala.inline
  implicit class AcceptInvitationOps[Self <: AcceptInvitation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcceptInvitation(value: ParamsInvitationidRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptInvitation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddCollaborator(value: ParamsOwnerPermission): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addCollaborator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddDeployKey(value: ParamsReadonly): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addDeployKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddProtectedBranchAdminEnforcement(value: ParamsBranchOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addProtectedBranchAdminEnforcement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddProtectedBranchAppRestrictions(value: ParamsApps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addProtectedBranchAppRestrictions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddProtectedBranchRequiredSignatures(value: MethodStringParamsBranchOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addProtectedBranchRequiredSignatures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddProtectedBranchRequiredStatusChecksContexts(value: ParamsContexts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addProtectedBranchRequiredStatusChecksContexts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddProtectedBranchTeamRestrictions(value: ParamsTeams): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addProtectedBranchTeamRestrictions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddProtectedBranchUserRestrictions(value: ParamsUsers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addProtectedBranchUserRestrictions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheckCollaborator(value: ParamsRepoUsername): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkCollaborator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheckVulnerabilityAlerts(value: ParamsRepo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkVulnerabilityAlerts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompareCommits(value: ParamsBaseHead): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compareCommits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateCommitComment(value: ParamsLine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createCommitComment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateDeployment(value: ParamsAutomerge): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createDeployment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateDeploymentStatus(value: ParamsAutoinactive): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createDeploymentStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateDispatchEvent(value: ParamsClientpayload): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createDispatchEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateFile(value: ParamsAuthoremail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateForAuthenticatedUser(value: ParamsAllowmergecommit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createForAuthenticatedUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateFork(value: ParamsOrganization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createFork")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateHook(value: ParamsConfigcontenttype): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createHook")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateInOrg(value: ParamsAllowrebasemerge): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createInOrg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateOrUpdateFile(value: MethodStringParamsAuthoremail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createOrUpdateFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateRelease(value: ParamsPrerelease): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createRelease")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateStatus(value: ParamsTargeturl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateUsingTemplate(value: ParamsPrivate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createUsingTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeclineInvitation(value: ParamsInvitationidRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("declineInvitation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelete(value: Url): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteCommitComment(value: ParamsCommentidOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteCommitComment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteDownload(value: ParamsDownloadid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteDownload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteFile(value: ParamsAuthorname): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteHook(value: ParamsHookidOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteHook")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteInvitation(value: ParamsInvitationidOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteInvitation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteRelease(value: ParamsReleaseid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteRelease")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteReleaseAsset(value: ParamsAssetid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteReleaseAsset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisableAutomatedSecurityFixes(value: ParamsRepo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableAutomatedSecurityFixes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisablePagesSite(value: ParamsRepo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disablePagesSite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisableVulnerabilityAlerts(value: ParamsRepo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableVulnerabilityAlerts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnableAutomatedSecurityFixes(value: ParamsRepo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAutomatedSecurityFixes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnablePagesSite(value: ParamsSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePagesSite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnableVulnerabilityAlerts(value: ParamsRepo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableVulnerabilityAlerts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGet(value: Url): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetAppsWithAccessToProtectedBranch(value: ParamsBranchOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAppsWithAccessToProtectedBranch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetArchiveLink(value: ParamsArchiveformatOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getArchiveLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetBranch(value: ParamsBranchOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBranch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetBranchProtection(value: ParamsBranchOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBranchProtection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetClones(value: ParamsPer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getClones")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetCodeFrequencyStats(value: Url): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCodeFrequencyStats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetCollaboratorPermissionLevel(value: ParamsRepoUsername): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCollaboratorPermissionLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetCombinedStatusForRef(value: ParamsOwnerRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCombinedStatusForRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetCommit(value: ParamsCommitshaOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCommit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetCommitActivityStats(value: Url): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCommitActivityStats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetCommitComment(value: ParamsCommentidOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCommitComment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetCommitRefSha(value: DeprecatedStringHeadersAccept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCommitRefSha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetContents(value: ParamsPath): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetContributorsStats(value: Url): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContributorsStats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetDeployKey(value: ParamsKeyid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDeployKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetDeployment(value: ParamsDeploymentid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDeployment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetDeploymentStatus(value: ParamsStatusid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDeploymentStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetDownload(value: ParamsDownloadid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDownload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetHook(value: ParamsHookidOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHook")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetLatestPagesBuild(value: Url): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLatestPagesBuild")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetLatestRelease(value: Url): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLatestRelease")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetPages(value: Url): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetPagesBuild(value: ParamsBuildid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPagesBuild")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetParticipationStats(value: Url): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getParticipationStats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetProtectedBranchAdminEnforcement(value: ParamsBranchOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getProtectedBranchAdminEnforcement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetProtectedBranchPullRequestReviewEnforcement(value: ParamsBranchOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getProtectedBranchPullRequestReviewEnforcement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetProtectedBranchRequiredSignatures(value: MethodStringParamsBranchOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getProtectedBranchRequiredSignatures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetProtectedBranchRequiredStatusChecks(value: ParamsBranchOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getProtectedBranchRequiredStatusChecks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetProtectedBranchRestrictions(value: ParamsBranchOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getProtectedBranchRestrictions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetPunchCardStats(value: Url): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPunchCardStats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetReadme(value: ParamsRefRepo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getReadme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetRelease(value: ParamsReleaseid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRelease")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetReleaseAsset(value: ParamsAssetid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getReleaseAsset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetReleaseByTag(value: ParamsTag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getReleaseByTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetTeamsWithAccessToProtectedBranch(value: ParamsBranchOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTeamsWithAccessToProtectedBranch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetTopPaths(value: Url): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTopPaths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetTopReferrers(value: Url): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTopReferrers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetUsersWithAccessToProtectedBranch(value: ParamsBranchOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUsersWithAccessToProtectedBranch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetViews(value: ParamsPer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getViews")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withList(value: ParamsVisibility): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListAppsWithAccessToProtectedBranch(value: ParamsBranchOwnerUrlString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listAppsWithAccessToProtectedBranch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListAssetsForRelease(value: ParamsPerpageReleaseid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listAssetsForRelease")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListBranches(value: ParamsProtected): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listBranches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListBranchesForHeadCommit(value: MethodStringParamsCommitsha): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listBranchesForHeadCommit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListCollaborators(value: ParamsAffiliationOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listCollaborators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListCommentsForCommit(value: ParamsCommitshaOwnerPage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listCommentsForCommit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListCommitComments(value: ParamsOwnerPage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listCommitComments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListCommits(value: ParamsUntil): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listCommits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListContributors(value: ParamsAnon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listContributors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListDeployKeys(value: ParamsOwnerPage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listDeployKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListDeploymentStatuses(value: ParamsDeploymentidOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listDeploymentStatuses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListDeployments(value: ParamsEnvironment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listDeployments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListDownloads(value: ParamsOwnerPage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listDownloads")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListForOrg(value: ParamsDirectionOrg): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listForOrg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListForUser(value: ParamsDirectionPage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listForUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListForks(value: ParamsOwnerPagePerpage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listForks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListHooks(value: ParamsOwnerPage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listHooks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListInvitations(value: ParamsOwnerPage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listInvitations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListInvitationsForAuthenticatedUser(value: ParamsPagePerpage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listInvitationsForAuthenticatedUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListLanguages(value: Url): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listLanguages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListPagesBuilds(value: ParamsOwnerPage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listPagesBuilds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListProtectedBranchRequiredStatusChecksContexts(value: ParamsBranchOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listProtectedBranchRequiredStatusChecksContexts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListProtectedBranchTeamRestrictions(value: ParamsBranchOwnerUrlString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listProtectedBranchTeamRestrictions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListProtectedBranchUserRestrictions(value: ParamsBranchOwnerUrlString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listProtectedBranchUserRestrictions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListPublic(value: ParamsSince): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listPublic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListPullRequestsAssociatedWithCommit(value: ParamsPagePerpageRepo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listPullRequestsAssociatedWithCommit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListReleases(value: ParamsOwnerPage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listReleases")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListStatusesForRef(value: ParamsPerpageRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listStatusesForRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListTags(value: ParamsOwnerPage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListTeams(value: ParamsOwnerPage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listTeams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListTeamsWithAccessToProtectedBranch(value: ParamsBranchOwnerUrlString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listTeamsWithAccessToProtectedBranch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListTopics(value: ParamsRepo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listTopics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListUsersWithAccessToProtectedBranch(value: ParamsBranchOwnerUrlString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listUsersWithAccessToProtectedBranch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMerge(value: ParamsBaseCommitmessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPingHook(value: ParamsHookidOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pingHook")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveBranchProtection(value: ParamsBranchOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeBranchProtection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveCollaborator(value: ParamsRepoUsername): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeCollaborator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveDeployKey(value: ParamsKeyid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeDeployKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveProtectedBranchAdminEnforcement(value: ParamsBranchOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeProtectedBranchAdminEnforcement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveProtectedBranchAppRestrictions(value: ParamsApps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeProtectedBranchAppRestrictions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveProtectedBranchPullRequestReviewEnforcement(value: ParamsBranchOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeProtectedBranchPullRequestReviewEnforcement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveProtectedBranchRequiredSignatures(value: MethodStringParamsBranchOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeProtectedBranchRequiredSignatures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveProtectedBranchRequiredStatusChecks(value: ParamsBranchOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeProtectedBranchRequiredStatusChecks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveProtectedBranchRequiredStatusChecksContexts(value: ParamsContexts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeProtectedBranchRequiredStatusChecksContexts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveProtectedBranchRestrictions(value: ParamsBranchOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeProtectedBranchRestrictions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveProtectedBranchTeamRestrictions(value: ParamsTeams): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeProtectedBranchTeamRestrictions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveProtectedBranchUserRestrictions(value: ParamsUsers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeProtectedBranchUserRestrictions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReplaceProtectedBranchAppRestrictions(value: ParamsApps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceProtectedBranchAppRestrictions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReplaceProtectedBranchRequiredStatusChecksContexts(value: ParamsContexts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceProtectedBranchRequiredStatusChecksContexts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReplaceProtectedBranchTeamRestrictions(value: ParamsTeams): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceProtectedBranchTeamRestrictions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReplaceProtectedBranchUserRestrictions(value: ParamsUsers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceProtectedBranchUserRestrictions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReplaceTopics(value: ParamsNames): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceTopics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestPageBuild(value: Url): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestPageBuild")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRetrieveCommunityProfileMetrics(value: Url): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retrieveCommunityProfileMetrics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestPushHook(value: ParamsHookidOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testPushHook")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransfer(value: ParamsNewowner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transfer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdate(value: ParamsAllowsquashmerge): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateBranchProtection(value: ParamsAllowdeletions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateBranchProtection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateCommitComment(value: ParamsOwnerRepo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateCommitComment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateFile(value: ParamsAuthoremail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateHook(value: ParamsAddevents): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateHook")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateInformationAboutPagesSite(value: ParamsCname): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateInformationAboutPagesSite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateInvitation(value: ParamsOwnerPermissions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateInvitation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateProtectedBranchPullRequestReviewEnforcement(value: ParamsDismissalrestrictions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateProtectedBranchPullRequestReviewEnforcement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateProtectedBranchRequiredStatusChecks(value: ParamsStrict): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateProtectedBranchRequiredStatusChecks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateRelease(value: ParamsTagname): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateRelease")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateReleaseAsset(value: ParamsLabel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateReleaseAsset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUploadReleaseAsset(value: ParamsFile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadReleaseAsset")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

