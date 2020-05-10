package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAcceptInvitation extends js.Object {
  var acceptInvitation: AnonParamsAnonInvitationidAnonRequired = js.native
  var addCollaborator: AnonParamsAnonOwnerPermission = js.native
  var addDeployKey: AnonParamsAnonReadonly = js.native
  var addProtectedBranchAdminEnforcement: AnonParamsAnonBranchOwner = js.native
  var addProtectedBranchAppRestrictions: AnonParamsAnonApps = js.native
  var addProtectedBranchRequiredSignatures: AnonMethodStringParamsAnonBranchOwner = js.native
  var addProtectedBranchRequiredStatusChecksContexts: AnonParamsAnonContexts = js.native
  var addProtectedBranchTeamRestrictions: AnonParamsAnonTeams = js.native
  var addProtectedBranchUserRestrictions: AnonParamsAnonUsers = js.native
  var checkCollaborator: AnonParamsAnonRepoUsername = js.native
  var checkVulnerabilityAlerts: AnonParamsAnonRepo = js.native
  var compareCommits: AnonParamsAnonBaseHead = js.native
  var createCommitComment: AnonParamsAnonLine = js.native
  var createDeployment: AnonParamsAnonAutomerge = js.native
  var createDeploymentStatus: AnonParamsAnonAutoinactive = js.native
  var createDispatchEvent: AnonParamsAnonClientpayload = js.native
  var createFile: AnonParamsAnonAuthoremail = js.native
  var createForAuthenticatedUser: AnonParamsAnonAllowmergecommit = js.native
  var createFork: AnonParamsAnonOrganization = js.native
  var createHook: AnonParamsAnonConfigcontenttype = js.native
  var createInOrg: AnonParamsAnonAllowrebasemerge = js.native
  var createOrUpdateFile: AnonMethodStringParamsAnonAuthoremail = js.native
  var createRelease: AnonParamsAnonPrerelease = js.native
  var createStatus: AnonParamsAnonTargeturl = js.native
  var createUsingTemplate: AnonParamsAnonPrivate = js.native
  var declineInvitation: AnonParamsAnonInvitationidAnonRequired = js.native
  var delete: AnonUrl = js.native
  var deleteCommitComment: AnonParamsAnonCommentidOwner = js.native
  var deleteDownload: AnonParamsAnonDownloadid = js.native
  var deleteFile: AnonParamsAnonAuthorname = js.native
  var deleteHook: AnonParamsAnonHookidOwner = js.native
  var deleteInvitation: AnonParamsAnonInvitationidOwner = js.native
  var deleteRelease: AnonParamsAnonReleaseid = js.native
  var deleteReleaseAsset: AnonParamsAnonAssetid = js.native
  var disableAutomatedSecurityFixes: AnonParamsAnonRepo = js.native
  var disablePagesSite: AnonParamsAnonRepo = js.native
  var disableVulnerabilityAlerts: AnonParamsAnonRepo = js.native
  var enableAutomatedSecurityFixes: AnonParamsAnonRepo = js.native
  var enablePagesSite: AnonParamsAnonSource = js.native
  var enableVulnerabilityAlerts: AnonParamsAnonRepo = js.native
  var get: AnonUrl = js.native
  var getAppsWithAccessToProtectedBranch: AnonParamsAnonBranchOwner = js.native
  var getArchiveLink: AnonParamsAnonArchiveformatOwner = js.native
  var getBranch: AnonParamsAnonBranchOwner = js.native
  var getBranchProtection: AnonParamsAnonBranchOwner = js.native
  var getClones: AnonParamsAnonPer = js.native
  var getCodeFrequencyStats: AnonUrl = js.native
  var getCollaboratorPermissionLevel: AnonParamsAnonRepoUsername = js.native
  var getCombinedStatusForRef: AnonParamsAnonOwnerRef = js.native
  var getCommit: AnonParamsAnonCommitshaOwner = js.native
  var getCommitActivityStats: AnonUrl = js.native
  var getCommitComment: AnonParamsAnonCommentidOwner = js.native
  var getCommitRefSha: AnonDeprecatedStringHeadersAnonAccept = js.native
  var getContents: AnonParamsAnonPath = js.native
  var getContributorsStats: AnonUrl = js.native
  var getDeployKey: AnonParamsAnonKeyid = js.native
  var getDeployment: AnonParamsAnonDeploymentid = js.native
  var getDeploymentStatus: AnonParamsAnonStatusid = js.native
  var getDownload: AnonParamsAnonDownloadid = js.native
  var getHook: AnonParamsAnonHookidOwner = js.native
  var getLatestPagesBuild: AnonUrl = js.native
  var getLatestRelease: AnonUrl = js.native
  var getPages: AnonUrl = js.native
  var getPagesBuild: AnonParamsAnonBuildid = js.native
  var getParticipationStats: AnonUrl = js.native
  var getProtectedBranchAdminEnforcement: AnonParamsAnonBranchOwner = js.native
  var getProtectedBranchPullRequestReviewEnforcement: AnonParamsAnonBranchOwner = js.native
  var getProtectedBranchRequiredSignatures: AnonMethodStringParamsAnonBranchOwner = js.native
  var getProtectedBranchRequiredStatusChecks: AnonParamsAnonBranchOwner = js.native
  var getProtectedBranchRestrictions: AnonParamsAnonBranchOwner = js.native
  var getPunchCardStats: AnonUrl = js.native
  var getReadme: AnonParamsAnonRefRepo = js.native
  var getRelease: AnonParamsAnonReleaseid = js.native
  var getReleaseAsset: AnonParamsAnonAssetid = js.native
  var getReleaseByTag: AnonParamsAnonTag = js.native
  var getTeamsWithAccessToProtectedBranch: AnonParamsAnonBranchOwner = js.native
  var getTopPaths: AnonUrl = js.native
  var getTopReferrers: AnonUrl = js.native
  var getUsersWithAccessToProtectedBranch: AnonParamsAnonBranchOwner = js.native
  var getViews: AnonParamsAnonPer = js.native
  var list: AnonParamsAnonVisibility = js.native
  var listAppsWithAccessToProtectedBranch: AnonParamsAnonBranchOwnerUrlString = js.native
  var listAssetsForRelease: AnonParamsAnonPerpageReleaseid = js.native
  var listBranches: AnonParamsAnonProtected = js.native
  var listBranchesForHeadCommit: AnonMethodStringParamsAnonCommitsha = js.native
  var listCollaborators: AnonParamsAnonAffiliationOwner = js.native
  var listCommentsForCommit: AnonParamsAnonCommitshaOwnerPage = js.native
  var listCommitComments: AnonParamsAnonOwnerPage = js.native
  var listCommits: AnonParamsAnonUntil = js.native
  var listContributors: AnonParamsAnonAnon = js.native
  var listDeployKeys: AnonParamsAnonOwnerPage = js.native
  var listDeploymentStatuses: AnonParamsAnonDeploymentidOwner = js.native
  var listDeployments: AnonParamsAnonEnvironment = js.native
  var listDownloads: AnonParamsAnonOwnerPage = js.native
  var listForOrg: AnonParamsAnonDirectionOrg = js.native
  var listForUser: AnonParamsAnonDirectionPage = js.native
  var listForks: AnonParamsAnonOwnerPagePerpage = js.native
  var listHooks: AnonParamsAnonOwnerPage = js.native
  var listInvitations: AnonParamsAnonOwnerPage = js.native
  var listInvitationsForAuthenticatedUser: AnonParamsAnonPagePerpage = js.native
  var listLanguages: AnonUrl = js.native
  var listPagesBuilds: AnonParamsAnonOwnerPage = js.native
  var listProtectedBranchRequiredStatusChecksContexts: AnonParamsAnonBranchOwner = js.native
  var listProtectedBranchTeamRestrictions: AnonParamsAnonBranchOwnerUrlString = js.native
  var listProtectedBranchUserRestrictions: AnonParamsAnonBranchOwnerUrlString = js.native
  var listPublic: AnonParamsAnonSince = js.native
  var listPullRequestsAssociatedWithCommit: AnonParamsAnonPagePerpageRepo = js.native
  var listReleases: AnonParamsAnonOwnerPage = js.native
  var listStatusesForRef: AnonParamsAnonPerpageRef = js.native
  var listTags: AnonParamsAnonOwnerPage = js.native
  var listTeams: AnonParamsAnonOwnerPage = js.native
  var listTeamsWithAccessToProtectedBranch: AnonParamsAnonBranchOwnerUrlString = js.native
  var listTopics: AnonParamsAnonRepo = js.native
  var listUsersWithAccessToProtectedBranch: AnonParamsAnonBranchOwnerUrlString = js.native
  var merge: AnonParamsAnonBaseCommitmessage = js.native
  var pingHook: AnonParamsAnonHookidOwner = js.native
  var removeBranchProtection: AnonParamsAnonBranchOwner = js.native
  var removeCollaborator: AnonParamsAnonRepoUsername = js.native
  var removeDeployKey: AnonParamsAnonKeyid = js.native
  var removeProtectedBranchAdminEnforcement: AnonParamsAnonBranchOwner = js.native
  var removeProtectedBranchAppRestrictions: AnonParamsAnonApps = js.native
  var removeProtectedBranchPullRequestReviewEnforcement: AnonParamsAnonBranchOwner = js.native
  var removeProtectedBranchRequiredSignatures: AnonMethodStringParamsAnonBranchOwner = js.native
  var removeProtectedBranchRequiredStatusChecks: AnonParamsAnonBranchOwner = js.native
  var removeProtectedBranchRequiredStatusChecksContexts: AnonParamsAnonContexts = js.native
  var removeProtectedBranchRestrictions: AnonParamsAnonBranchOwner = js.native
  var removeProtectedBranchTeamRestrictions: AnonParamsAnonTeams = js.native
  var removeProtectedBranchUserRestrictions: AnonParamsAnonUsers = js.native
  var replaceProtectedBranchAppRestrictions: AnonParamsAnonApps = js.native
  var replaceProtectedBranchRequiredStatusChecksContexts: AnonParamsAnonContexts = js.native
  var replaceProtectedBranchTeamRestrictions: AnonParamsAnonTeams = js.native
  var replaceProtectedBranchUserRestrictions: AnonParamsAnonUsers = js.native
  var replaceTopics: AnonParamsAnonNames = js.native
  var requestPageBuild: AnonUrl = js.native
  var retrieveCommunityProfileMetrics: AnonUrl = js.native
  var testPushHook: AnonParamsAnonHookidOwner = js.native
  var transfer: AnonParamsAnonNewowner = js.native
  var update: AnonParamsAnonAllowsquashmerge = js.native
  var updateBranchProtection: AnonParamsAnonAllowdeletions = js.native
  var updateCommitComment: AnonParamsAnonOwnerRepo = js.native
  var updateFile: AnonParamsAnonAuthoremail = js.native
  var updateHook: AnonParamsAnonAddevents = js.native
  var updateInformationAboutPagesSite: AnonParamsAnonCname = js.native
  var updateInvitation: AnonParamsAnonOwnerPermissions = js.native
  var updateProtectedBranchPullRequestReviewEnforcement: AnonParamsAnonDismissalrestrictions = js.native
  var updateProtectedBranchRequiredStatusChecks: AnonParamsAnonStrict = js.native
  var updateRelease: AnonParamsAnonTagname = js.native
  var updateReleaseAsset: AnonParamsAnonLabel = js.native
  var uploadReleaseAsset: AnonParamsAnonFile = js.native
}

object AnonAcceptInvitation {
  @scala.inline
  def apply(
    acceptInvitation: AnonParamsAnonInvitationidAnonRequired,
    addCollaborator: AnonParamsAnonOwnerPermission,
    addDeployKey: AnonParamsAnonReadonly,
    addProtectedBranchAdminEnforcement: AnonParamsAnonBranchOwner,
    addProtectedBranchAppRestrictions: AnonParamsAnonApps,
    addProtectedBranchRequiredSignatures: AnonMethodStringParamsAnonBranchOwner,
    addProtectedBranchRequiredStatusChecksContexts: AnonParamsAnonContexts,
    addProtectedBranchTeamRestrictions: AnonParamsAnonTeams,
    addProtectedBranchUserRestrictions: AnonParamsAnonUsers,
    checkCollaborator: AnonParamsAnonRepoUsername,
    checkVulnerabilityAlerts: AnonParamsAnonRepo,
    compareCommits: AnonParamsAnonBaseHead,
    createCommitComment: AnonParamsAnonLine,
    createDeployment: AnonParamsAnonAutomerge,
    createDeploymentStatus: AnonParamsAnonAutoinactive,
    createDispatchEvent: AnonParamsAnonClientpayload,
    createFile: AnonParamsAnonAuthoremail,
    createForAuthenticatedUser: AnonParamsAnonAllowmergecommit,
    createFork: AnonParamsAnonOrganization,
    createHook: AnonParamsAnonConfigcontenttype,
    createInOrg: AnonParamsAnonAllowrebasemerge,
    createOrUpdateFile: AnonMethodStringParamsAnonAuthoremail,
    createRelease: AnonParamsAnonPrerelease,
    createStatus: AnonParamsAnonTargeturl,
    createUsingTemplate: AnonParamsAnonPrivate,
    declineInvitation: AnonParamsAnonInvitationidAnonRequired,
    delete: AnonUrl,
    deleteCommitComment: AnonParamsAnonCommentidOwner,
    deleteDownload: AnonParamsAnonDownloadid,
    deleteFile: AnonParamsAnonAuthorname,
    deleteHook: AnonParamsAnonHookidOwner,
    deleteInvitation: AnonParamsAnonInvitationidOwner,
    deleteRelease: AnonParamsAnonReleaseid,
    deleteReleaseAsset: AnonParamsAnonAssetid,
    disableAutomatedSecurityFixes: AnonParamsAnonRepo,
    disablePagesSite: AnonParamsAnonRepo,
    disableVulnerabilityAlerts: AnonParamsAnonRepo,
    enableAutomatedSecurityFixes: AnonParamsAnonRepo,
    enablePagesSite: AnonParamsAnonSource,
    enableVulnerabilityAlerts: AnonParamsAnonRepo,
    get: AnonUrl,
    getAppsWithAccessToProtectedBranch: AnonParamsAnonBranchOwner,
    getArchiveLink: AnonParamsAnonArchiveformatOwner,
    getBranch: AnonParamsAnonBranchOwner,
    getBranchProtection: AnonParamsAnonBranchOwner,
    getClones: AnonParamsAnonPer,
    getCodeFrequencyStats: AnonUrl,
    getCollaboratorPermissionLevel: AnonParamsAnonRepoUsername,
    getCombinedStatusForRef: AnonParamsAnonOwnerRef,
    getCommit: AnonParamsAnonCommitshaOwner,
    getCommitActivityStats: AnonUrl,
    getCommitComment: AnonParamsAnonCommentidOwner,
    getCommitRefSha: AnonDeprecatedStringHeadersAnonAccept,
    getContents: AnonParamsAnonPath,
    getContributorsStats: AnonUrl,
    getDeployKey: AnonParamsAnonKeyid,
    getDeployment: AnonParamsAnonDeploymentid,
    getDeploymentStatus: AnonParamsAnonStatusid,
    getDownload: AnonParamsAnonDownloadid,
    getHook: AnonParamsAnonHookidOwner,
    getLatestPagesBuild: AnonUrl,
    getLatestRelease: AnonUrl,
    getPages: AnonUrl,
    getPagesBuild: AnonParamsAnonBuildid,
    getParticipationStats: AnonUrl,
    getProtectedBranchAdminEnforcement: AnonParamsAnonBranchOwner,
    getProtectedBranchPullRequestReviewEnforcement: AnonParamsAnonBranchOwner,
    getProtectedBranchRequiredSignatures: AnonMethodStringParamsAnonBranchOwner,
    getProtectedBranchRequiredStatusChecks: AnonParamsAnonBranchOwner,
    getProtectedBranchRestrictions: AnonParamsAnonBranchOwner,
    getPunchCardStats: AnonUrl,
    getReadme: AnonParamsAnonRefRepo,
    getRelease: AnonParamsAnonReleaseid,
    getReleaseAsset: AnonParamsAnonAssetid,
    getReleaseByTag: AnonParamsAnonTag,
    getTeamsWithAccessToProtectedBranch: AnonParamsAnonBranchOwner,
    getTopPaths: AnonUrl,
    getTopReferrers: AnonUrl,
    getUsersWithAccessToProtectedBranch: AnonParamsAnonBranchOwner,
    getViews: AnonParamsAnonPer,
    list: AnonParamsAnonVisibility,
    listAppsWithAccessToProtectedBranch: AnonParamsAnonBranchOwnerUrlString,
    listAssetsForRelease: AnonParamsAnonPerpageReleaseid,
    listBranches: AnonParamsAnonProtected,
    listBranchesForHeadCommit: AnonMethodStringParamsAnonCommitsha,
    listCollaborators: AnonParamsAnonAffiliationOwner,
    listCommentsForCommit: AnonParamsAnonCommitshaOwnerPage,
    listCommitComments: AnonParamsAnonOwnerPage,
    listCommits: AnonParamsAnonUntil,
    listContributors: AnonParamsAnonAnon,
    listDeployKeys: AnonParamsAnonOwnerPage,
    listDeploymentStatuses: AnonParamsAnonDeploymentidOwner,
    listDeployments: AnonParamsAnonEnvironment,
    listDownloads: AnonParamsAnonOwnerPage,
    listForOrg: AnonParamsAnonDirectionOrg,
    listForUser: AnonParamsAnonDirectionPage,
    listForks: AnonParamsAnonOwnerPagePerpage,
    listHooks: AnonParamsAnonOwnerPage,
    listInvitations: AnonParamsAnonOwnerPage,
    listInvitationsForAuthenticatedUser: AnonParamsAnonPagePerpage,
    listLanguages: AnonUrl,
    listPagesBuilds: AnonParamsAnonOwnerPage,
    listProtectedBranchRequiredStatusChecksContexts: AnonParamsAnonBranchOwner,
    listProtectedBranchTeamRestrictions: AnonParamsAnonBranchOwnerUrlString,
    listProtectedBranchUserRestrictions: AnonParamsAnonBranchOwnerUrlString,
    listPublic: AnonParamsAnonSince,
    listPullRequestsAssociatedWithCommit: AnonParamsAnonPagePerpageRepo,
    listReleases: AnonParamsAnonOwnerPage,
    listStatusesForRef: AnonParamsAnonPerpageRef,
    listTags: AnonParamsAnonOwnerPage,
    listTeams: AnonParamsAnonOwnerPage,
    listTeamsWithAccessToProtectedBranch: AnonParamsAnonBranchOwnerUrlString,
    listTopics: AnonParamsAnonRepo,
    listUsersWithAccessToProtectedBranch: AnonParamsAnonBranchOwnerUrlString,
    merge: AnonParamsAnonBaseCommitmessage,
    pingHook: AnonParamsAnonHookidOwner,
    removeBranchProtection: AnonParamsAnonBranchOwner,
    removeCollaborator: AnonParamsAnonRepoUsername,
    removeDeployKey: AnonParamsAnonKeyid,
    removeProtectedBranchAdminEnforcement: AnonParamsAnonBranchOwner,
    removeProtectedBranchAppRestrictions: AnonParamsAnonApps,
    removeProtectedBranchPullRequestReviewEnforcement: AnonParamsAnonBranchOwner,
    removeProtectedBranchRequiredSignatures: AnonMethodStringParamsAnonBranchOwner,
    removeProtectedBranchRequiredStatusChecks: AnonParamsAnonBranchOwner,
    removeProtectedBranchRequiredStatusChecksContexts: AnonParamsAnonContexts,
    removeProtectedBranchRestrictions: AnonParamsAnonBranchOwner,
    removeProtectedBranchTeamRestrictions: AnonParamsAnonTeams,
    removeProtectedBranchUserRestrictions: AnonParamsAnonUsers,
    replaceProtectedBranchAppRestrictions: AnonParamsAnonApps,
    replaceProtectedBranchRequiredStatusChecksContexts: AnonParamsAnonContexts,
    replaceProtectedBranchTeamRestrictions: AnonParamsAnonTeams,
    replaceProtectedBranchUserRestrictions: AnonParamsAnonUsers,
    replaceTopics: AnonParamsAnonNames,
    requestPageBuild: AnonUrl,
    retrieveCommunityProfileMetrics: AnonUrl,
    testPushHook: AnonParamsAnonHookidOwner,
    transfer: AnonParamsAnonNewowner,
    update: AnonParamsAnonAllowsquashmerge,
    updateBranchProtection: AnonParamsAnonAllowdeletions,
    updateCommitComment: AnonParamsAnonOwnerRepo,
    updateFile: AnonParamsAnonAuthoremail,
    updateHook: AnonParamsAnonAddevents,
    updateInformationAboutPagesSite: AnonParamsAnonCname,
    updateInvitation: AnonParamsAnonOwnerPermissions,
    updateProtectedBranchPullRequestReviewEnforcement: AnonParamsAnonDismissalrestrictions,
    updateProtectedBranchRequiredStatusChecks: AnonParamsAnonStrict,
    updateRelease: AnonParamsAnonTagname,
    updateReleaseAsset: AnonParamsAnonLabel,
    uploadReleaseAsset: AnonParamsAnonFile
  ): AnonAcceptInvitation = {
    val __obj = js.Dynamic.literal(acceptInvitation = acceptInvitation.asInstanceOf[js.Any], addCollaborator = addCollaborator.asInstanceOf[js.Any], addDeployKey = addDeployKey.asInstanceOf[js.Any], addProtectedBranchAdminEnforcement = addProtectedBranchAdminEnforcement.asInstanceOf[js.Any], addProtectedBranchAppRestrictions = addProtectedBranchAppRestrictions.asInstanceOf[js.Any], addProtectedBranchRequiredSignatures = addProtectedBranchRequiredSignatures.asInstanceOf[js.Any], addProtectedBranchRequiredStatusChecksContexts = addProtectedBranchRequiredStatusChecksContexts.asInstanceOf[js.Any], addProtectedBranchTeamRestrictions = addProtectedBranchTeamRestrictions.asInstanceOf[js.Any], addProtectedBranchUserRestrictions = addProtectedBranchUserRestrictions.asInstanceOf[js.Any], checkCollaborator = checkCollaborator.asInstanceOf[js.Any], checkVulnerabilityAlerts = checkVulnerabilityAlerts.asInstanceOf[js.Any], compareCommits = compareCommits.asInstanceOf[js.Any], createCommitComment = createCommitComment.asInstanceOf[js.Any], createDeployment = createDeployment.asInstanceOf[js.Any], createDeploymentStatus = createDeploymentStatus.asInstanceOf[js.Any], createDispatchEvent = createDispatchEvent.asInstanceOf[js.Any], createFile = createFile.asInstanceOf[js.Any], createForAuthenticatedUser = createForAuthenticatedUser.asInstanceOf[js.Any], createFork = createFork.asInstanceOf[js.Any], createHook = createHook.asInstanceOf[js.Any], createInOrg = createInOrg.asInstanceOf[js.Any], createOrUpdateFile = createOrUpdateFile.asInstanceOf[js.Any], createRelease = createRelease.asInstanceOf[js.Any], createStatus = createStatus.asInstanceOf[js.Any], createUsingTemplate = createUsingTemplate.asInstanceOf[js.Any], declineInvitation = declineInvitation.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], deleteCommitComment = deleteCommitComment.asInstanceOf[js.Any], deleteDownload = deleteDownload.asInstanceOf[js.Any], deleteFile = deleteFile.asInstanceOf[js.Any], deleteHook = deleteHook.asInstanceOf[js.Any], deleteInvitation = deleteInvitation.asInstanceOf[js.Any], deleteRelease = deleteRelease.asInstanceOf[js.Any], deleteReleaseAsset = deleteReleaseAsset.asInstanceOf[js.Any], disableAutomatedSecurityFixes = disableAutomatedSecurityFixes.asInstanceOf[js.Any], disablePagesSite = disablePagesSite.asInstanceOf[js.Any], disableVulnerabilityAlerts = disableVulnerabilityAlerts.asInstanceOf[js.Any], enableAutomatedSecurityFixes = enableAutomatedSecurityFixes.asInstanceOf[js.Any], enablePagesSite = enablePagesSite.asInstanceOf[js.Any], enableVulnerabilityAlerts = enableVulnerabilityAlerts.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], getAppsWithAccessToProtectedBranch = getAppsWithAccessToProtectedBranch.asInstanceOf[js.Any], getArchiveLink = getArchiveLink.asInstanceOf[js.Any], getBranch = getBranch.asInstanceOf[js.Any], getBranchProtection = getBranchProtection.asInstanceOf[js.Any], getClones = getClones.asInstanceOf[js.Any], getCodeFrequencyStats = getCodeFrequencyStats.asInstanceOf[js.Any], getCollaboratorPermissionLevel = getCollaboratorPermissionLevel.asInstanceOf[js.Any], getCombinedStatusForRef = getCombinedStatusForRef.asInstanceOf[js.Any], getCommit = getCommit.asInstanceOf[js.Any], getCommitActivityStats = getCommitActivityStats.asInstanceOf[js.Any], getCommitComment = getCommitComment.asInstanceOf[js.Any], getCommitRefSha = getCommitRefSha.asInstanceOf[js.Any], getContents = getContents.asInstanceOf[js.Any], getContributorsStats = getContributorsStats.asInstanceOf[js.Any], getDeployKey = getDeployKey.asInstanceOf[js.Any], getDeployment = getDeployment.asInstanceOf[js.Any], getDeploymentStatus = getDeploymentStatus.asInstanceOf[js.Any], getDownload = getDownload.asInstanceOf[js.Any], getHook = getHook.asInstanceOf[js.Any], getLatestPagesBuild = getLatestPagesBuild.asInstanceOf[js.Any], getLatestRelease = getLatestRelease.asInstanceOf[js.Any], getPages = getPages.asInstanceOf[js.Any], getPagesBuild = getPagesBuild.asInstanceOf[js.Any], getParticipationStats = getParticipationStats.asInstanceOf[js.Any], getProtectedBranchAdminEnforcement = getProtectedBranchAdminEnforcement.asInstanceOf[js.Any], getProtectedBranchPullRequestReviewEnforcement = getProtectedBranchPullRequestReviewEnforcement.asInstanceOf[js.Any], getProtectedBranchRequiredSignatures = getProtectedBranchRequiredSignatures.asInstanceOf[js.Any], getProtectedBranchRequiredStatusChecks = getProtectedBranchRequiredStatusChecks.asInstanceOf[js.Any], getProtectedBranchRestrictions = getProtectedBranchRestrictions.asInstanceOf[js.Any], getPunchCardStats = getPunchCardStats.asInstanceOf[js.Any], getReadme = getReadme.asInstanceOf[js.Any], getRelease = getRelease.asInstanceOf[js.Any], getReleaseAsset = getReleaseAsset.asInstanceOf[js.Any], getReleaseByTag = getReleaseByTag.asInstanceOf[js.Any], getTeamsWithAccessToProtectedBranch = getTeamsWithAccessToProtectedBranch.asInstanceOf[js.Any], getTopPaths = getTopPaths.asInstanceOf[js.Any], getTopReferrers = getTopReferrers.asInstanceOf[js.Any], getUsersWithAccessToProtectedBranch = getUsersWithAccessToProtectedBranch.asInstanceOf[js.Any], getViews = getViews.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], listAppsWithAccessToProtectedBranch = listAppsWithAccessToProtectedBranch.asInstanceOf[js.Any], listAssetsForRelease = listAssetsForRelease.asInstanceOf[js.Any], listBranches = listBranches.asInstanceOf[js.Any], listBranchesForHeadCommit = listBranchesForHeadCommit.asInstanceOf[js.Any], listCollaborators = listCollaborators.asInstanceOf[js.Any], listCommentsForCommit = listCommentsForCommit.asInstanceOf[js.Any], listCommitComments = listCommitComments.asInstanceOf[js.Any], listCommits = listCommits.asInstanceOf[js.Any], listContributors = listContributors.asInstanceOf[js.Any], listDeployKeys = listDeployKeys.asInstanceOf[js.Any], listDeploymentStatuses = listDeploymentStatuses.asInstanceOf[js.Any], listDeployments = listDeployments.asInstanceOf[js.Any], listDownloads = listDownloads.asInstanceOf[js.Any], listForOrg = listForOrg.asInstanceOf[js.Any], listForUser = listForUser.asInstanceOf[js.Any], listForks = listForks.asInstanceOf[js.Any], listHooks = listHooks.asInstanceOf[js.Any], listInvitations = listInvitations.asInstanceOf[js.Any], listInvitationsForAuthenticatedUser = listInvitationsForAuthenticatedUser.asInstanceOf[js.Any], listLanguages = listLanguages.asInstanceOf[js.Any], listPagesBuilds = listPagesBuilds.asInstanceOf[js.Any], listProtectedBranchRequiredStatusChecksContexts = listProtectedBranchRequiredStatusChecksContexts.asInstanceOf[js.Any], listProtectedBranchTeamRestrictions = listProtectedBranchTeamRestrictions.asInstanceOf[js.Any], listProtectedBranchUserRestrictions = listProtectedBranchUserRestrictions.asInstanceOf[js.Any], listPublic = listPublic.asInstanceOf[js.Any], listPullRequestsAssociatedWithCommit = listPullRequestsAssociatedWithCommit.asInstanceOf[js.Any], listReleases = listReleases.asInstanceOf[js.Any], listStatusesForRef = listStatusesForRef.asInstanceOf[js.Any], listTags = listTags.asInstanceOf[js.Any], listTeams = listTeams.asInstanceOf[js.Any], listTeamsWithAccessToProtectedBranch = listTeamsWithAccessToProtectedBranch.asInstanceOf[js.Any], listTopics = listTopics.asInstanceOf[js.Any], listUsersWithAccessToProtectedBranch = listUsersWithAccessToProtectedBranch.asInstanceOf[js.Any], merge = merge.asInstanceOf[js.Any], pingHook = pingHook.asInstanceOf[js.Any], removeBranchProtection = removeBranchProtection.asInstanceOf[js.Any], removeCollaborator = removeCollaborator.asInstanceOf[js.Any], removeDeployKey = removeDeployKey.asInstanceOf[js.Any], removeProtectedBranchAdminEnforcement = removeProtectedBranchAdminEnforcement.asInstanceOf[js.Any], removeProtectedBranchAppRestrictions = removeProtectedBranchAppRestrictions.asInstanceOf[js.Any], removeProtectedBranchPullRequestReviewEnforcement = removeProtectedBranchPullRequestReviewEnforcement.asInstanceOf[js.Any], removeProtectedBranchRequiredSignatures = removeProtectedBranchRequiredSignatures.asInstanceOf[js.Any], removeProtectedBranchRequiredStatusChecks = removeProtectedBranchRequiredStatusChecks.asInstanceOf[js.Any], removeProtectedBranchRequiredStatusChecksContexts = removeProtectedBranchRequiredStatusChecksContexts.asInstanceOf[js.Any], removeProtectedBranchRestrictions = removeProtectedBranchRestrictions.asInstanceOf[js.Any], removeProtectedBranchTeamRestrictions = removeProtectedBranchTeamRestrictions.asInstanceOf[js.Any], removeProtectedBranchUserRestrictions = removeProtectedBranchUserRestrictions.asInstanceOf[js.Any], replaceProtectedBranchAppRestrictions = replaceProtectedBranchAppRestrictions.asInstanceOf[js.Any], replaceProtectedBranchRequiredStatusChecksContexts = replaceProtectedBranchRequiredStatusChecksContexts.asInstanceOf[js.Any], replaceProtectedBranchTeamRestrictions = replaceProtectedBranchTeamRestrictions.asInstanceOf[js.Any], replaceProtectedBranchUserRestrictions = replaceProtectedBranchUserRestrictions.asInstanceOf[js.Any], replaceTopics = replaceTopics.asInstanceOf[js.Any], requestPageBuild = requestPageBuild.asInstanceOf[js.Any], retrieveCommunityProfileMetrics = retrieveCommunityProfileMetrics.asInstanceOf[js.Any], testPushHook = testPushHook.asInstanceOf[js.Any], transfer = transfer.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any], updateBranchProtection = updateBranchProtection.asInstanceOf[js.Any], updateCommitComment = updateCommitComment.asInstanceOf[js.Any], updateFile = updateFile.asInstanceOf[js.Any], updateHook = updateHook.asInstanceOf[js.Any], updateInformationAboutPagesSite = updateInformationAboutPagesSite.asInstanceOf[js.Any], updateInvitation = updateInvitation.asInstanceOf[js.Any], updateProtectedBranchPullRequestReviewEnforcement = updateProtectedBranchPullRequestReviewEnforcement.asInstanceOf[js.Any], updateProtectedBranchRequiredStatusChecks = updateProtectedBranchRequiredStatusChecks.asInstanceOf[js.Any], updateRelease = updateRelease.asInstanceOf[js.Any], updateReleaseAsset = updateReleaseAsset.asInstanceOf[js.Any], uploadReleaseAsset = uploadReleaseAsset.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAcceptInvitation]
  }
  @scala.inline
  implicit class AnonAcceptInvitationOps[Self <: AnonAcceptInvitation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcceptInvitation(value: AnonParamsAnonInvitationidAnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptInvitation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddCollaborator(value: AnonParamsAnonOwnerPermission): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addCollaborator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddDeployKey(value: AnonParamsAnonReadonly): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addDeployKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddProtectedBranchAdminEnforcement(value: AnonParamsAnonBranchOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addProtectedBranchAdminEnforcement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddProtectedBranchAppRestrictions(value: AnonParamsAnonApps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addProtectedBranchAppRestrictions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddProtectedBranchRequiredSignatures(value: AnonMethodStringParamsAnonBranchOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addProtectedBranchRequiredSignatures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddProtectedBranchRequiredStatusChecksContexts(value: AnonParamsAnonContexts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addProtectedBranchRequiredStatusChecksContexts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddProtectedBranchTeamRestrictions(value: AnonParamsAnonTeams): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addProtectedBranchTeamRestrictions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddProtectedBranchUserRestrictions(value: AnonParamsAnonUsers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addProtectedBranchUserRestrictions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheckCollaborator(value: AnonParamsAnonRepoUsername): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkCollaborator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheckVulnerabilityAlerts(value: AnonParamsAnonRepo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkVulnerabilityAlerts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompareCommits(value: AnonParamsAnonBaseHead): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compareCommits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateCommitComment(value: AnonParamsAnonLine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createCommitComment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateDeployment(value: AnonParamsAnonAutomerge): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createDeployment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateDeploymentStatus(value: AnonParamsAnonAutoinactive): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createDeploymentStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateDispatchEvent(value: AnonParamsAnonClientpayload): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createDispatchEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateFile(value: AnonParamsAnonAuthoremail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateForAuthenticatedUser(value: AnonParamsAnonAllowmergecommit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createForAuthenticatedUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateFork(value: AnonParamsAnonOrganization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createFork")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateHook(value: AnonParamsAnonConfigcontenttype): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createHook")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateInOrg(value: AnonParamsAnonAllowrebasemerge): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createInOrg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateOrUpdateFile(value: AnonMethodStringParamsAnonAuthoremail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createOrUpdateFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateRelease(value: AnonParamsAnonPrerelease): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createRelease")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateStatus(value: AnonParamsAnonTargeturl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateUsingTemplate(value: AnonParamsAnonPrivate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createUsingTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeclineInvitation(value: AnonParamsAnonInvitationidAnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("declineInvitation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelete(value: AnonUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteCommitComment(value: AnonParamsAnonCommentidOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteCommitComment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteDownload(value: AnonParamsAnonDownloadid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteDownload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteFile(value: AnonParamsAnonAuthorname): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteHook(value: AnonParamsAnonHookidOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteHook")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteInvitation(value: AnonParamsAnonInvitationidOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteInvitation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteRelease(value: AnonParamsAnonReleaseid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteRelease")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteReleaseAsset(value: AnonParamsAnonAssetid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteReleaseAsset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisableAutomatedSecurityFixes(value: AnonParamsAnonRepo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableAutomatedSecurityFixes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisablePagesSite(value: AnonParamsAnonRepo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disablePagesSite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisableVulnerabilityAlerts(value: AnonParamsAnonRepo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableVulnerabilityAlerts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnableAutomatedSecurityFixes(value: AnonParamsAnonRepo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAutomatedSecurityFixes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnablePagesSite(value: AnonParamsAnonSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePagesSite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnableVulnerabilityAlerts(value: AnonParamsAnonRepo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableVulnerabilityAlerts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGet(value: AnonUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetAppsWithAccessToProtectedBranch(value: AnonParamsAnonBranchOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAppsWithAccessToProtectedBranch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetArchiveLink(value: AnonParamsAnonArchiveformatOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getArchiveLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetBranch(value: AnonParamsAnonBranchOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBranch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetBranchProtection(value: AnonParamsAnonBranchOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBranchProtection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetClones(value: AnonParamsAnonPer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getClones")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetCodeFrequencyStats(value: AnonUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCodeFrequencyStats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetCollaboratorPermissionLevel(value: AnonParamsAnonRepoUsername): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCollaboratorPermissionLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetCombinedStatusForRef(value: AnonParamsAnonOwnerRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCombinedStatusForRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetCommit(value: AnonParamsAnonCommitshaOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCommit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetCommitActivityStats(value: AnonUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCommitActivityStats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetCommitComment(value: AnonParamsAnonCommentidOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCommitComment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetCommitRefSha(value: AnonDeprecatedStringHeadersAnonAccept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCommitRefSha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetContents(value: AnonParamsAnonPath): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetContributorsStats(value: AnonUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContributorsStats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetDeployKey(value: AnonParamsAnonKeyid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDeployKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetDeployment(value: AnonParamsAnonDeploymentid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDeployment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetDeploymentStatus(value: AnonParamsAnonStatusid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDeploymentStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetDownload(value: AnonParamsAnonDownloadid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDownload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetHook(value: AnonParamsAnonHookidOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHook")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetLatestPagesBuild(value: AnonUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLatestPagesBuild")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetLatestRelease(value: AnonUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLatestRelease")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetPages(value: AnonUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetPagesBuild(value: AnonParamsAnonBuildid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPagesBuild")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetParticipationStats(value: AnonUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getParticipationStats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetProtectedBranchAdminEnforcement(value: AnonParamsAnonBranchOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getProtectedBranchAdminEnforcement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetProtectedBranchPullRequestReviewEnforcement(value: AnonParamsAnonBranchOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getProtectedBranchPullRequestReviewEnforcement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetProtectedBranchRequiredSignatures(value: AnonMethodStringParamsAnonBranchOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getProtectedBranchRequiredSignatures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetProtectedBranchRequiredStatusChecks(value: AnonParamsAnonBranchOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getProtectedBranchRequiredStatusChecks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetProtectedBranchRestrictions(value: AnonParamsAnonBranchOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getProtectedBranchRestrictions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetPunchCardStats(value: AnonUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPunchCardStats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetReadme(value: AnonParamsAnonRefRepo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getReadme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetRelease(value: AnonParamsAnonReleaseid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRelease")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetReleaseAsset(value: AnonParamsAnonAssetid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getReleaseAsset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetReleaseByTag(value: AnonParamsAnonTag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getReleaseByTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetTeamsWithAccessToProtectedBranch(value: AnonParamsAnonBranchOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTeamsWithAccessToProtectedBranch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetTopPaths(value: AnonUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTopPaths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetTopReferrers(value: AnonUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTopReferrers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetUsersWithAccessToProtectedBranch(value: AnonParamsAnonBranchOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUsersWithAccessToProtectedBranch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetViews(value: AnonParamsAnonPer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getViews")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withList(value: AnonParamsAnonVisibility): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListAppsWithAccessToProtectedBranch(value: AnonParamsAnonBranchOwnerUrlString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listAppsWithAccessToProtectedBranch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListAssetsForRelease(value: AnonParamsAnonPerpageReleaseid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listAssetsForRelease")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListBranches(value: AnonParamsAnonProtected): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listBranches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListBranchesForHeadCommit(value: AnonMethodStringParamsAnonCommitsha): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listBranchesForHeadCommit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListCollaborators(value: AnonParamsAnonAffiliationOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listCollaborators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListCommentsForCommit(value: AnonParamsAnonCommitshaOwnerPage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listCommentsForCommit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListCommitComments(value: AnonParamsAnonOwnerPage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listCommitComments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListCommits(value: AnonParamsAnonUntil): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listCommits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListContributors(value: AnonParamsAnonAnon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listContributors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListDeployKeys(value: AnonParamsAnonOwnerPage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listDeployKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListDeploymentStatuses(value: AnonParamsAnonDeploymentidOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listDeploymentStatuses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListDeployments(value: AnonParamsAnonEnvironment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listDeployments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListDownloads(value: AnonParamsAnonOwnerPage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listDownloads")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListForOrg(value: AnonParamsAnonDirectionOrg): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listForOrg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListForUser(value: AnonParamsAnonDirectionPage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listForUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListForks(value: AnonParamsAnonOwnerPagePerpage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listForks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListHooks(value: AnonParamsAnonOwnerPage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listHooks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListInvitations(value: AnonParamsAnonOwnerPage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listInvitations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListInvitationsForAuthenticatedUser(value: AnonParamsAnonPagePerpage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listInvitationsForAuthenticatedUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListLanguages(value: AnonUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listLanguages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListPagesBuilds(value: AnonParamsAnonOwnerPage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listPagesBuilds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListProtectedBranchRequiredStatusChecksContexts(value: AnonParamsAnonBranchOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listProtectedBranchRequiredStatusChecksContexts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListProtectedBranchTeamRestrictions(value: AnonParamsAnonBranchOwnerUrlString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listProtectedBranchTeamRestrictions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListProtectedBranchUserRestrictions(value: AnonParamsAnonBranchOwnerUrlString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listProtectedBranchUserRestrictions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListPublic(value: AnonParamsAnonSince): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listPublic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListPullRequestsAssociatedWithCommit(value: AnonParamsAnonPagePerpageRepo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listPullRequestsAssociatedWithCommit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListReleases(value: AnonParamsAnonOwnerPage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listReleases")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListStatusesForRef(value: AnonParamsAnonPerpageRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listStatusesForRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListTags(value: AnonParamsAnonOwnerPage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListTeams(value: AnonParamsAnonOwnerPage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listTeams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListTeamsWithAccessToProtectedBranch(value: AnonParamsAnonBranchOwnerUrlString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listTeamsWithAccessToProtectedBranch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListTopics(value: AnonParamsAnonRepo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listTopics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListUsersWithAccessToProtectedBranch(value: AnonParamsAnonBranchOwnerUrlString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listUsersWithAccessToProtectedBranch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMerge(value: AnonParamsAnonBaseCommitmessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPingHook(value: AnonParamsAnonHookidOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pingHook")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveBranchProtection(value: AnonParamsAnonBranchOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeBranchProtection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveCollaborator(value: AnonParamsAnonRepoUsername): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeCollaborator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveDeployKey(value: AnonParamsAnonKeyid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeDeployKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveProtectedBranchAdminEnforcement(value: AnonParamsAnonBranchOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeProtectedBranchAdminEnforcement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveProtectedBranchAppRestrictions(value: AnonParamsAnonApps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeProtectedBranchAppRestrictions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveProtectedBranchPullRequestReviewEnforcement(value: AnonParamsAnonBranchOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeProtectedBranchPullRequestReviewEnforcement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveProtectedBranchRequiredSignatures(value: AnonMethodStringParamsAnonBranchOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeProtectedBranchRequiredSignatures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveProtectedBranchRequiredStatusChecks(value: AnonParamsAnonBranchOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeProtectedBranchRequiredStatusChecks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveProtectedBranchRequiredStatusChecksContexts(value: AnonParamsAnonContexts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeProtectedBranchRequiredStatusChecksContexts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveProtectedBranchRestrictions(value: AnonParamsAnonBranchOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeProtectedBranchRestrictions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveProtectedBranchTeamRestrictions(value: AnonParamsAnonTeams): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeProtectedBranchTeamRestrictions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveProtectedBranchUserRestrictions(value: AnonParamsAnonUsers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeProtectedBranchUserRestrictions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReplaceProtectedBranchAppRestrictions(value: AnonParamsAnonApps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceProtectedBranchAppRestrictions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReplaceProtectedBranchRequiredStatusChecksContexts(value: AnonParamsAnonContexts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceProtectedBranchRequiredStatusChecksContexts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReplaceProtectedBranchTeamRestrictions(value: AnonParamsAnonTeams): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceProtectedBranchTeamRestrictions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReplaceProtectedBranchUserRestrictions(value: AnonParamsAnonUsers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceProtectedBranchUserRestrictions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReplaceTopics(value: AnonParamsAnonNames): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceTopics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestPageBuild(value: AnonUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestPageBuild")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRetrieveCommunityProfileMetrics(value: AnonUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retrieveCommunityProfileMetrics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestPushHook(value: AnonParamsAnonHookidOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testPushHook")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransfer(value: AnonParamsAnonNewowner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transfer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdate(value: AnonParamsAnonAllowsquashmerge): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateBranchProtection(value: AnonParamsAnonAllowdeletions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateBranchProtection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateCommitComment(value: AnonParamsAnonOwnerRepo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateCommitComment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateFile(value: AnonParamsAnonAuthoremail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateHook(value: AnonParamsAnonAddevents): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateHook")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateInformationAboutPagesSite(value: AnonParamsAnonCname): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateInformationAboutPagesSite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateInvitation(value: AnonParamsAnonOwnerPermissions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateInvitation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateProtectedBranchPullRequestReviewEnforcement(value: AnonParamsAnonDismissalrestrictions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateProtectedBranchPullRequestReviewEnforcement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateProtectedBranchRequiredStatusChecks(value: AnonParamsAnonStrict): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateProtectedBranchRequiredStatusChecks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateRelease(value: AnonParamsAnonTagname): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateRelease")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateReleaseAsset(value: AnonParamsAnonLabel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateReleaseAsset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUploadReleaseAsset(value: AnonParamsAnonFile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadReleaseAsset")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

