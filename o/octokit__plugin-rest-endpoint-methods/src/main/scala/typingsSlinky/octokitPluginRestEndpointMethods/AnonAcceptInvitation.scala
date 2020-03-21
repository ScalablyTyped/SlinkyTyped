package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAcceptInvitation extends js.Object {
  var acceptInvitation: AnonParamsAnonInvitationidAnonRequired
  var addCollaborator: AnonParamsAnonOwnerPermission
  var addDeployKey: AnonParamsAnonReadonly
  var addProtectedBranchAdminEnforcement: AnonParamsAnonBranchOwner
  var addProtectedBranchAppRestrictions: AnonParamsAnonApps
  var addProtectedBranchRequiredSignatures: AnonMethodStringParamsAnonBranchOwner
  var addProtectedBranchRequiredStatusChecksContexts: AnonParamsAnonContexts
  var addProtectedBranchTeamRestrictions: AnonParamsAnonTeams
  var addProtectedBranchUserRestrictions: AnonParamsAnonUsers
  var checkCollaborator: AnonParamsAnonRepoUsername
  var checkVulnerabilityAlerts: AnonParamsAnonRepo
  var compareCommits: AnonParamsAnonBaseHead
  var createCommitComment: AnonParamsAnonLine
  var createDeployment: AnonParamsAnonAutomerge
  var createDeploymentStatus: AnonParamsAnonAutoinactive
  var createDispatchEvent: AnonParamsAnonClientpayload
  var createFile: AnonParamsAnonAuthoremail
  var createForAuthenticatedUser: AnonParamsAnonAllowmergecommit
  var createFork: AnonParamsAnonOrganization
  var createHook: AnonParamsAnonConfigcontenttype
  var createInOrg: AnonParamsAnonAllowrebasemerge
  var createOrUpdateFile: AnonMethodStringParamsAnonAuthoremail
  var createRelease: AnonParamsAnonPrerelease
  var createStatus: AnonParamsAnonTargeturl
  var createUsingTemplate: AnonParamsAnonPrivate
  var declineInvitation: AnonParamsAnonInvitationidAnonRequired
  var delete: AnonUrl
  var deleteCommitComment: AnonParamsAnonCommentidOwner
  var deleteDownload: AnonParamsAnonDownloadid
  var deleteFile: AnonParamsAnonAuthorname
  var deleteHook: AnonParamsAnonHookidOwner
  var deleteInvitation: AnonParamsAnonInvitationidOwner
  var deleteRelease: AnonParamsAnonReleaseid
  var deleteReleaseAsset: AnonParamsAnonAssetid
  var disableAutomatedSecurityFixes: AnonParamsAnonRepo
  var disablePagesSite: AnonParamsAnonRepo
  var disableVulnerabilityAlerts: AnonParamsAnonRepo
  var enableAutomatedSecurityFixes: AnonParamsAnonRepo
  var enablePagesSite: AnonParamsAnonSource
  var enableVulnerabilityAlerts: AnonParamsAnonRepo
  var get: AnonUrl
  var getAppsWithAccessToProtectedBranch: AnonParamsAnonBranchOwner
  var getArchiveLink: AnonParamsAnonArchiveformatOwner
  var getBranch: AnonParamsAnonBranchOwner
  var getBranchProtection: AnonParamsAnonBranchOwner
  var getClones: AnonParamsAnonPer
  var getCodeFrequencyStats: AnonUrl
  var getCollaboratorPermissionLevel: AnonParamsAnonRepoUsername
  var getCombinedStatusForRef: AnonParamsAnonOwnerRef
  var getCommit: AnonParamsAnonCommitshaOwner
  var getCommitActivityStats: AnonUrl
  var getCommitComment: AnonParamsAnonCommentidOwner
  var getCommitRefSha: AnonDeprecatedStringHeadersAnonAccept
  var getContents: AnonParamsAnonPath
  var getContributorsStats: AnonUrl
  var getDeployKey: AnonParamsAnonKeyid
  var getDeployment: AnonParamsAnonDeploymentid
  var getDeploymentStatus: AnonParamsAnonStatusid
  var getDownload: AnonParamsAnonDownloadid
  var getHook: AnonParamsAnonHookidOwner
  var getLatestPagesBuild: AnonUrl
  var getLatestRelease: AnonUrl
  var getPages: AnonUrl
  var getPagesBuild: AnonParamsAnonBuildid
  var getParticipationStats: AnonUrl
  var getProtectedBranchAdminEnforcement: AnonParamsAnonBranchOwner
  var getProtectedBranchPullRequestReviewEnforcement: AnonParamsAnonBranchOwner
  var getProtectedBranchRequiredSignatures: AnonMethodStringParamsAnonBranchOwner
  var getProtectedBranchRequiredStatusChecks: AnonParamsAnonBranchOwner
  var getProtectedBranchRestrictions: AnonParamsAnonBranchOwner
  var getPunchCardStats: AnonUrl
  var getReadme: AnonParamsAnonRefRepo
  var getRelease: AnonParamsAnonReleaseid
  var getReleaseAsset: AnonParamsAnonAssetid
  var getReleaseByTag: AnonParamsAnonTag
  var getTeamsWithAccessToProtectedBranch: AnonParamsAnonBranchOwner
  var getTopPaths: AnonUrl
  var getTopReferrers: AnonUrl
  var getUsersWithAccessToProtectedBranch: AnonParamsAnonBranchOwner
  var getViews: AnonParamsAnonPer
  var list: AnonParamsAnonVisibility
  var listAppsWithAccessToProtectedBranch: AnonParamsAnonBranchOwnerUrlString
  var listAssetsForRelease: AnonParamsAnonPerpageReleaseid
  var listBranches: AnonParamsAnonProtected
  var listBranchesForHeadCommit: AnonMethodStringParamsAnonCommitsha
  var listCollaborators: AnonParamsAnonAffiliationOwner
  var listCommentsForCommit: AnonParamsAnonCommitshaOwnerPage
  var listCommitComments: AnonParamsAnonOwnerPage
  var listCommits: AnonParamsAnonUntil
  var listContributors: AnonParamsAnonAnon
  var listDeployKeys: AnonParamsAnonOwnerPage
  var listDeploymentStatuses: AnonParamsAnonDeploymentidOwner
  var listDeployments: AnonParamsAnonEnvironment
  var listDownloads: AnonParamsAnonOwnerPage
  var listForOrg: AnonParamsAnonDirectionOrg
  var listForUser: AnonParamsAnonDirectionPage
  var listForks: AnonParamsAnonOwnerPagePerpage
  var listHooks: AnonParamsAnonOwnerPage
  var listInvitations: AnonParamsAnonOwnerPage
  var listInvitationsForAuthenticatedUser: AnonParamsAnonPagePerpage
  var listLanguages: AnonUrl
  var listPagesBuilds: AnonParamsAnonOwnerPage
  var listProtectedBranchRequiredStatusChecksContexts: AnonParamsAnonBranchOwner
  var listProtectedBranchTeamRestrictions: AnonParamsAnonBranchOwnerUrlString
  var listProtectedBranchUserRestrictions: AnonParamsAnonBranchOwnerUrlString
  var listPublic: AnonParamsAnonSince
  var listPullRequestsAssociatedWithCommit: AnonParamsAnonPagePerpageRepo
  var listReleases: AnonParamsAnonOwnerPage
  var listStatusesForRef: AnonParamsAnonPerpageRef
  var listTags: AnonParamsAnonOwnerPage
  var listTeams: AnonParamsAnonOwnerPage
  var listTeamsWithAccessToProtectedBranch: AnonParamsAnonBranchOwnerUrlString
  var listTopics: AnonParamsAnonRepo
  var listUsersWithAccessToProtectedBranch: AnonParamsAnonBranchOwnerUrlString
  var merge: AnonParamsAnonBaseCommitmessage
  var pingHook: AnonParamsAnonHookidOwner
  var removeBranchProtection: AnonParamsAnonBranchOwner
  var removeCollaborator: AnonParamsAnonRepoUsername
  var removeDeployKey: AnonParamsAnonKeyid
  var removeProtectedBranchAdminEnforcement: AnonParamsAnonBranchOwner
  var removeProtectedBranchAppRestrictions: AnonParamsAnonApps
  var removeProtectedBranchPullRequestReviewEnforcement: AnonParamsAnonBranchOwner
  var removeProtectedBranchRequiredSignatures: AnonMethodStringParamsAnonBranchOwner
  var removeProtectedBranchRequiredStatusChecks: AnonParamsAnonBranchOwner
  var removeProtectedBranchRequiredStatusChecksContexts: AnonParamsAnonContexts
  var removeProtectedBranchRestrictions: AnonParamsAnonBranchOwner
  var removeProtectedBranchTeamRestrictions: AnonParamsAnonTeams
  var removeProtectedBranchUserRestrictions: AnonParamsAnonUsers
  var replaceProtectedBranchAppRestrictions: AnonParamsAnonApps
  var replaceProtectedBranchRequiredStatusChecksContexts: AnonParamsAnonContexts
  var replaceProtectedBranchTeamRestrictions: AnonParamsAnonTeams
  var replaceProtectedBranchUserRestrictions: AnonParamsAnonUsers
  var replaceTopics: AnonParamsAnonNames
  var requestPageBuild: AnonUrl
  var retrieveCommunityProfileMetrics: AnonUrl
  var testPushHook: AnonParamsAnonHookidOwner
  var transfer: AnonParamsAnonNewowner
  var update: AnonParamsAnonAllowsquashmerge
  var updateBranchProtection: AnonParamsAnonAllowdeletions
  var updateCommitComment: AnonParamsAnonOwnerRepo
  var updateFile: AnonParamsAnonAuthoremail
  var updateHook: AnonParamsAnonAddevents
  var updateInformationAboutPagesSite: AnonParamsAnonCname
  var updateInvitation: AnonParamsAnonOwnerPermissions
  var updateProtectedBranchPullRequestReviewEnforcement: AnonParamsAnonDismissalrestrictions
  var updateProtectedBranchRequiredStatusChecks: AnonParamsAnonStrict
  var updateRelease: AnonParamsAnonTagname
  var updateReleaseAsset: AnonParamsAnonLabel
  var uploadReleaseAsset: AnonParamsAnonFile
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
}

