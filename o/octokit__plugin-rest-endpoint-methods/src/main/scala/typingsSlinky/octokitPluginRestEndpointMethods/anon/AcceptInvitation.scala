package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AcceptInvitation extends js.Object {
  var acceptInvitation: ParamsInvitationidRequired
  var addCollaborator: ParamsOwnerPermission
  var addDeployKey: ParamsReadonly
  var addProtectedBranchAdminEnforcement: ParamsBranchOwner
  var addProtectedBranchAppRestrictions: ParamsApps
  var addProtectedBranchRequiredSignatures: MethodStringParamsBranchOwner
  var addProtectedBranchRequiredStatusChecksContexts: ParamsContexts
  var addProtectedBranchTeamRestrictions: ParamsTeams
  var addProtectedBranchUserRestrictions: ParamsUsers
  var checkCollaborator: ParamsRepoUsername
  var checkVulnerabilityAlerts: ParamsRepo
  var compareCommits: ParamsBaseHead
  var createCommitComment: ParamsLine
  var createDeployment: ParamsAutomerge
  var createDeploymentStatus: ParamsAutoinactive
  var createDispatchEvent: ParamsClientpayload
  var createFile: ParamsAuthoremail
  var createForAuthenticatedUser: ParamsAllowmergecommit
  var createFork: ParamsOrganization
  var createHook: ParamsConfigcontenttype
  var createInOrg: ParamsAllowrebasemerge
  var createOrUpdateFile: MethodStringParamsAuthoremail
  var createRelease: ParamsPrerelease
  var createStatus: ParamsTargeturl
  var createUsingTemplate: ParamsPrivate
  var declineInvitation: ParamsInvitationidRequired
  var delete: Url
  var deleteCommitComment: ParamsCommentidOwner
  var deleteDownload: ParamsDownloadid
  var deleteFile: ParamsAuthorname
  var deleteHook: ParamsHookidOwner
  var deleteInvitation: ParamsInvitationidOwner
  var deleteRelease: ParamsReleaseid
  var deleteReleaseAsset: ParamsAssetid
  var disableAutomatedSecurityFixes: ParamsRepo
  var disablePagesSite: ParamsRepo
  var disableVulnerabilityAlerts: ParamsRepo
  var enableAutomatedSecurityFixes: ParamsRepo
  var enablePagesSite: ParamsSource
  var enableVulnerabilityAlerts: ParamsRepo
  var get: Url
  var getAppsWithAccessToProtectedBranch: ParamsBranchOwner
  var getArchiveLink: ParamsArchiveformatOwner
  var getBranch: ParamsBranchOwner
  var getBranchProtection: ParamsBranchOwner
  var getClones: ParamsPer
  var getCodeFrequencyStats: Url
  var getCollaboratorPermissionLevel: ParamsRepoUsername
  var getCombinedStatusForRef: ParamsOwnerRef
  var getCommit: ParamsCommitshaOwner
  var getCommitActivityStats: Url
  var getCommitComment: ParamsCommentidOwner
  var getCommitRefSha: DeprecatedStringHeadersAccept
  var getContents: ParamsPath
  var getContributorsStats: Url
  var getDeployKey: ParamsKeyid
  var getDeployment: ParamsDeploymentid
  var getDeploymentStatus: ParamsStatusid
  var getDownload: ParamsDownloadid
  var getHook: ParamsHookidOwner
  var getLatestPagesBuild: Url
  var getLatestRelease: Url
  var getPages: Url
  var getPagesBuild: ParamsBuildid
  var getParticipationStats: Url
  var getProtectedBranchAdminEnforcement: ParamsBranchOwner
  var getProtectedBranchPullRequestReviewEnforcement: ParamsBranchOwner
  var getProtectedBranchRequiredSignatures: MethodStringParamsBranchOwner
  var getProtectedBranchRequiredStatusChecks: ParamsBranchOwner
  var getProtectedBranchRestrictions: ParamsBranchOwner
  var getPunchCardStats: Url
  var getReadme: ParamsRefRepo
  var getRelease: ParamsReleaseid
  var getReleaseAsset: ParamsAssetid
  var getReleaseByTag: ParamsTag
  var getTeamsWithAccessToProtectedBranch: ParamsBranchOwner
  var getTopPaths: Url
  var getTopReferrers: Url
  var getUsersWithAccessToProtectedBranch: ParamsBranchOwner
  var getViews: ParamsPer
  var list: ParamsVisibility
  var listAppsWithAccessToProtectedBranch: ParamsBranchOwnerUrlString
  var listAssetsForRelease: ParamsPerpageReleaseid
  var listBranches: ParamsProtected
  var listBranchesForHeadCommit: MethodStringParamsCommitsha
  var listCollaborators: ParamsAffiliationOwner
  var listCommentsForCommit: ParamsCommitshaOwnerPage
  var listCommitComments: ParamsOwnerPage
  var listCommits: ParamsUntil
  var listContributors: ParamsAnon
  var listDeployKeys: ParamsOwnerPage
  var listDeploymentStatuses: ParamsDeploymentidOwner
  var listDeployments: ParamsEnvironment
  var listDownloads: ParamsOwnerPage
  var listForOrg: ParamsDirectionOrg
  var listForUser: ParamsDirectionPage
  var listForks: ParamsOwnerPagePerpage
  var listHooks: ParamsOwnerPage
  var listInvitations: ParamsOwnerPage
  var listInvitationsForAuthenticatedUser: ParamsPagePerpage
  var listLanguages: Url
  var listPagesBuilds: ParamsOwnerPage
  var listProtectedBranchRequiredStatusChecksContexts: ParamsBranchOwner
  var listProtectedBranchTeamRestrictions: ParamsBranchOwnerUrlString
  var listProtectedBranchUserRestrictions: ParamsBranchOwnerUrlString
  var listPublic: ParamsSince
  var listPullRequestsAssociatedWithCommit: ParamsPagePerpageRepo
  var listReleases: ParamsOwnerPage
  var listStatusesForRef: ParamsPerpageRef
  var listTags: ParamsOwnerPage
  var listTeams: ParamsOwnerPage
  var listTeamsWithAccessToProtectedBranch: ParamsBranchOwnerUrlString
  var listTopics: ParamsRepo
  var listUsersWithAccessToProtectedBranch: ParamsBranchOwnerUrlString
  var merge: ParamsBaseCommitmessage
  var pingHook: ParamsHookidOwner
  var removeBranchProtection: ParamsBranchOwner
  var removeCollaborator: ParamsRepoUsername
  var removeDeployKey: ParamsKeyid
  var removeProtectedBranchAdminEnforcement: ParamsBranchOwner
  var removeProtectedBranchAppRestrictions: ParamsApps
  var removeProtectedBranchPullRequestReviewEnforcement: ParamsBranchOwner
  var removeProtectedBranchRequiredSignatures: MethodStringParamsBranchOwner
  var removeProtectedBranchRequiredStatusChecks: ParamsBranchOwner
  var removeProtectedBranchRequiredStatusChecksContexts: ParamsContexts
  var removeProtectedBranchRestrictions: ParamsBranchOwner
  var removeProtectedBranchTeamRestrictions: ParamsTeams
  var removeProtectedBranchUserRestrictions: ParamsUsers
  var replaceProtectedBranchAppRestrictions: ParamsApps
  var replaceProtectedBranchRequiredStatusChecksContexts: ParamsContexts
  var replaceProtectedBranchTeamRestrictions: ParamsTeams
  var replaceProtectedBranchUserRestrictions: ParamsUsers
  var replaceTopics: ParamsNames
  var requestPageBuild: Url
  var retrieveCommunityProfileMetrics: Url
  var testPushHook: ParamsHookidOwner
  var transfer: ParamsNewowner
  var update: ParamsAllowsquashmerge
  var updateBranchProtection: ParamsAllowdeletions
  var updateCommitComment: ParamsOwnerRepo
  var updateFile: ParamsAuthoremail
  var updateHook: ParamsAddevents
  var updateInformationAboutPagesSite: ParamsCname
  var updateInvitation: ParamsOwnerPermissions
  var updateProtectedBranchPullRequestReviewEnforcement: ParamsDismissalrestrictions
  var updateProtectedBranchRequiredStatusChecks: ParamsStrict
  var updateRelease: ParamsTagname
  var updateReleaseAsset: ParamsLabel
  var uploadReleaseAsset: ParamsFile
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
}

