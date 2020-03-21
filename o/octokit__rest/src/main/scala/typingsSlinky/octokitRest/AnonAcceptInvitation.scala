package typingsSlinky.octokitRest

import typingsSlinky.octokitRest.mod.Octokit.AnyResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposAcceptInvitationParams
import typingsSlinky.octokitRest.mod.Octokit.ReposAddCollaboratorParams
import typingsSlinky.octokitRest.mod.Octokit.ReposAddCollaboratorResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposAddDeployKeyParams
import typingsSlinky.octokitRest.mod.Octokit.ReposAddDeployKeyResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposAddProtectedBranchAdminEnforcementParams
import typingsSlinky.octokitRest.mod.Octokit.ReposAddProtectedBranchAdminEnforcementResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposAddProtectedBranchAppRestrictionsParams
import typingsSlinky.octokitRest.mod.Octokit.ReposAddProtectedBranchAppRestrictionsResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposAddProtectedBranchRequiredSignaturesParams
import typingsSlinky.octokitRest.mod.Octokit.ReposAddProtectedBranchRequiredSignaturesResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposAddProtectedBranchRequiredStatusChecksContextsParams
import typingsSlinky.octokitRest.mod.Octokit.ReposAddProtectedBranchRequiredStatusChecksContextsResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposAddProtectedBranchTeamRestrictionsParams
import typingsSlinky.octokitRest.mod.Octokit.ReposAddProtectedBranchTeamRestrictionsResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposAddProtectedBranchUserRestrictionsParams
import typingsSlinky.octokitRest.mod.Octokit.ReposAddProtectedBranchUserRestrictionsResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposCheckCollaboratorParams
import typingsSlinky.octokitRest.mod.Octokit.ReposCheckVulnerabilityAlertsParams
import typingsSlinky.octokitRest.mod.Octokit.ReposCompareCommitsParams
import typingsSlinky.octokitRest.mod.Octokit.ReposCompareCommitsResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposCreateCommitCommentParams
import typingsSlinky.octokitRest.mod.Octokit.ReposCreateCommitCommentParamsDeprecatedLine
import typingsSlinky.octokitRest.mod.Octokit.ReposCreateCommitCommentParamsDeprecatedSha
import typingsSlinky.octokitRest.mod.Octokit.ReposCreateCommitCommentResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposCreateDeploymentParams
import typingsSlinky.octokitRest.mod.Octokit.ReposCreateDeploymentResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposCreateDeploymentStatusParams
import typingsSlinky.octokitRest.mod.Octokit.ReposCreateDeploymentStatusResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposCreateDispatchEventParams
import typingsSlinky.octokitRest.mod.Octokit.ReposCreateFileParams
import typingsSlinky.octokitRest.mod.Octokit.ReposCreateFileResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposCreateForAuthenticatedUserParams
import typingsSlinky.octokitRest.mod.Octokit.ReposCreateForAuthenticatedUserResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposCreateForkParams
import typingsSlinky.octokitRest.mod.Octokit.ReposCreateForkResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposCreateHookParams
import typingsSlinky.octokitRest.mod.Octokit.ReposCreateHookResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposCreateInOrgParams
import typingsSlinky.octokitRest.mod.Octokit.ReposCreateInOrgResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposCreateOrUpdateFileParams
import typingsSlinky.octokitRest.mod.Octokit.ReposCreateOrUpdateFileResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposCreateReleaseParams
import typingsSlinky.octokitRest.mod.Octokit.ReposCreateReleaseResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposCreateStatusParams
import typingsSlinky.octokitRest.mod.Octokit.ReposCreateStatusResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposCreateUsingTemplateParams
import typingsSlinky.octokitRest.mod.Octokit.ReposCreateUsingTemplateResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposDeclineInvitationParams
import typingsSlinky.octokitRest.mod.Octokit.ReposDeleteCommitCommentParams
import typingsSlinky.octokitRest.mod.Octokit.ReposDeleteDownloadParams
import typingsSlinky.octokitRest.mod.Octokit.ReposDeleteFileParams
import typingsSlinky.octokitRest.mod.Octokit.ReposDeleteFileResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposDeleteHookParams
import typingsSlinky.octokitRest.mod.Octokit.ReposDeleteInvitationParams
import typingsSlinky.octokitRest.mod.Octokit.ReposDeleteParams
import typingsSlinky.octokitRest.mod.Octokit.ReposDeleteReleaseAssetParams
import typingsSlinky.octokitRest.mod.Octokit.ReposDeleteReleaseParams
import typingsSlinky.octokitRest.mod.Octokit.ReposDeleteResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposDisableAutomatedSecurityFixesParams
import typingsSlinky.octokitRest.mod.Octokit.ReposDisablePagesSiteParams
import typingsSlinky.octokitRest.mod.Octokit.ReposDisableVulnerabilityAlertsParams
import typingsSlinky.octokitRest.mod.Octokit.ReposEnableAutomatedSecurityFixesParams
import typingsSlinky.octokitRest.mod.Octokit.ReposEnablePagesSiteParams
import typingsSlinky.octokitRest.mod.Octokit.ReposEnablePagesSiteResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposEnableVulnerabilityAlertsParams
import typingsSlinky.octokitRest.mod.Octokit.ReposGetAppsWithAccessToProtectedBranchParams
import typingsSlinky.octokitRest.mod.Octokit.ReposGetAppsWithAccessToProtectedBranchResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposGetArchiveLinkParams
import typingsSlinky.octokitRest.mod.Octokit.ReposGetBranchParams
import typingsSlinky.octokitRest.mod.Octokit.ReposGetBranchProtectionParams
import typingsSlinky.octokitRest.mod.Octokit.ReposGetBranchProtectionResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposGetBranchResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposGetClonesParams
import typingsSlinky.octokitRest.mod.Octokit.ReposGetClonesResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposGetCodeFrequencyStatsParams
import typingsSlinky.octokitRest.mod.Octokit.ReposGetCodeFrequencyStatsResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposGetCollaboratorPermissionLevelParams
import typingsSlinky.octokitRest.mod.Octokit.ReposGetCollaboratorPermissionLevelResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposGetCombinedStatusForRefParams
import typingsSlinky.octokitRest.mod.Octokit.ReposGetCombinedStatusForRefResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposGetCommitActivityStatsParams
import typingsSlinky.octokitRest.mod.Octokit.ReposGetCommitActivityStatsResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposGetCommitCommentParams
import typingsSlinky.octokitRest.mod.Octokit.ReposGetCommitCommentResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposGetCommitParams
import typingsSlinky.octokitRest.mod.Octokit.ReposGetCommitParamsDeprecatedCommitSha
import typingsSlinky.octokitRest.mod.Octokit.ReposGetCommitParamsDeprecatedSha
import typingsSlinky.octokitRest.mod.Octokit.ReposGetCommitRefShaParams
import typingsSlinky.octokitRest.mod.Octokit.ReposGetCommitResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposGetContentsParams
import typingsSlinky.octokitRest.mod.Octokit.ReposGetContentsResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposGetContributorsStatsParams
import typingsSlinky.octokitRest.mod.Octokit.ReposGetContributorsStatsResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposGetDeployKeyParams
import typingsSlinky.octokitRest.mod.Octokit.ReposGetDeployKeyResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposGetDeploymentParams
import typingsSlinky.octokitRest.mod.Octokit.ReposGetDeploymentResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposGetDeploymentStatusParams
import typingsSlinky.octokitRest.mod.Octokit.ReposGetDeploymentStatusResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposGetDownloadParams
import typingsSlinky.octokitRest.mod.Octokit.ReposGetDownloadResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposGetHookParams
import typingsSlinky.octokitRest.mod.Octokit.ReposGetHookResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposGetLatestPagesBuildParams
import typingsSlinky.octokitRest.mod.Octokit.ReposGetLatestPagesBuildResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposGetLatestReleaseParams
import typingsSlinky.octokitRest.mod.Octokit.ReposGetLatestReleaseResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposGetPagesBuildParams
import typingsSlinky.octokitRest.mod.Octokit.ReposGetPagesBuildResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposGetPagesParams
import typingsSlinky.octokitRest.mod.Octokit.ReposGetPagesResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposGetParams
import typingsSlinky.octokitRest.mod.Octokit.ReposGetParticipationStatsParams
import typingsSlinky.octokitRest.mod.Octokit.ReposGetParticipationStatsResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposGetProtectedBranchAdminEnforcementParams
import typingsSlinky.octokitRest.mod.Octokit.ReposGetProtectedBranchAdminEnforcementResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposGetProtectedBranchPullRequestReviewEnforcementParams
import typingsSlinky.octokitRest.mod.Octokit.ReposGetProtectedBranchPullRequestReviewEnforcementResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposGetProtectedBranchRequiredSignaturesParams
import typingsSlinky.octokitRest.mod.Octokit.ReposGetProtectedBranchRequiredSignaturesResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposGetProtectedBranchRequiredStatusChecksParams
import typingsSlinky.octokitRest.mod.Octokit.ReposGetProtectedBranchRequiredStatusChecksResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposGetProtectedBranchRestrictionsParams
import typingsSlinky.octokitRest.mod.Octokit.ReposGetProtectedBranchRestrictionsResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposGetPunchCardStatsParams
import typingsSlinky.octokitRest.mod.Octokit.ReposGetPunchCardStatsResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposGetReadmeParams
import typingsSlinky.octokitRest.mod.Octokit.ReposGetReadmeResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposGetReleaseAssetParams
import typingsSlinky.octokitRest.mod.Octokit.ReposGetReleaseAssetResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposGetReleaseByTagParams
import typingsSlinky.octokitRest.mod.Octokit.ReposGetReleaseByTagResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposGetReleaseParams
import typingsSlinky.octokitRest.mod.Octokit.ReposGetReleaseResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposGetResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposGetTeamsWithAccessToProtectedBranchParams
import typingsSlinky.octokitRest.mod.Octokit.ReposGetTeamsWithAccessToProtectedBranchResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposGetTopPathsParams
import typingsSlinky.octokitRest.mod.Octokit.ReposGetTopPathsResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposGetTopReferrersParams
import typingsSlinky.octokitRest.mod.Octokit.ReposGetTopReferrersResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposGetUsersWithAccessToProtectedBranchParams
import typingsSlinky.octokitRest.mod.Octokit.ReposGetUsersWithAccessToProtectedBranchResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposGetViewsParams
import typingsSlinky.octokitRest.mod.Octokit.ReposGetViewsResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposListAppsWithAccessToProtectedBranchParams
import typingsSlinky.octokitRest.mod.Octokit.ReposListAppsWithAccessToProtectedBranchResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposListAssetsForReleaseParams
import typingsSlinky.octokitRest.mod.Octokit.ReposListAssetsForReleaseResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposListBranchesForHeadCommitParams
import typingsSlinky.octokitRest.mod.Octokit.ReposListBranchesForHeadCommitResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposListBranchesParams
import typingsSlinky.octokitRest.mod.Octokit.ReposListBranchesResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposListCollaboratorsParams
import typingsSlinky.octokitRest.mod.Octokit.ReposListCollaboratorsResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposListCommentsForCommitParams
import typingsSlinky.octokitRest.mod.Octokit.ReposListCommentsForCommitParamsDeprecatedRef
import typingsSlinky.octokitRest.mod.Octokit.ReposListCommentsForCommitResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposListCommitCommentsParams
import typingsSlinky.octokitRest.mod.Octokit.ReposListCommitCommentsResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposListCommitsParams
import typingsSlinky.octokitRest.mod.Octokit.ReposListCommitsResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposListContributorsParams
import typingsSlinky.octokitRest.mod.Octokit.ReposListContributorsResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposListDeployKeysParams
import typingsSlinky.octokitRest.mod.Octokit.ReposListDeployKeysResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposListDeploymentStatusesParams
import typingsSlinky.octokitRest.mod.Octokit.ReposListDeploymentStatusesResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposListDeploymentsParams
import typingsSlinky.octokitRest.mod.Octokit.ReposListDeploymentsResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposListDownloadsParams
import typingsSlinky.octokitRest.mod.Octokit.ReposListDownloadsResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposListForOrgParams
import typingsSlinky.octokitRest.mod.Octokit.ReposListForOrgResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposListForUserParams
import typingsSlinky.octokitRest.mod.Octokit.ReposListForksParams
import typingsSlinky.octokitRest.mod.Octokit.ReposListForksResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposListHooksParams
import typingsSlinky.octokitRest.mod.Octokit.ReposListHooksResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposListInvitationsForAuthenticatedUserParams
import typingsSlinky.octokitRest.mod.Octokit.ReposListInvitationsForAuthenticatedUserResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposListInvitationsParams
import typingsSlinky.octokitRest.mod.Octokit.ReposListInvitationsResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposListLanguagesParams
import typingsSlinky.octokitRest.mod.Octokit.ReposListLanguagesResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposListPagesBuildsParams
import typingsSlinky.octokitRest.mod.Octokit.ReposListPagesBuildsResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposListParams
import typingsSlinky.octokitRest.mod.Octokit.ReposListProtectedBranchRequiredStatusChecksContextsParams
import typingsSlinky.octokitRest.mod.Octokit.ReposListProtectedBranchRequiredStatusChecksContextsResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposListProtectedBranchTeamRestrictionsParams
import typingsSlinky.octokitRest.mod.Octokit.ReposListProtectedBranchTeamRestrictionsResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposListProtectedBranchUserRestrictionsParams
import typingsSlinky.octokitRest.mod.Octokit.ReposListProtectedBranchUserRestrictionsResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposListPublicParams
import typingsSlinky.octokitRest.mod.Octokit.ReposListPublicResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposListPullRequestsAssociatedWithCommitParams
import typingsSlinky.octokitRest.mod.Octokit.ReposListPullRequestsAssociatedWithCommitResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposListReleasesParams
import typingsSlinky.octokitRest.mod.Octokit.ReposListReleasesResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposListStatusesForRefParams
import typingsSlinky.octokitRest.mod.Octokit.ReposListStatusesForRefResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposListTagsParams
import typingsSlinky.octokitRest.mod.Octokit.ReposListTagsResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposListTeamsParams
import typingsSlinky.octokitRest.mod.Octokit.ReposListTeamsResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposListTeamsWithAccessToProtectedBranchParams
import typingsSlinky.octokitRest.mod.Octokit.ReposListTeamsWithAccessToProtectedBranchResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposListTopicsParams
import typingsSlinky.octokitRest.mod.Octokit.ReposListTopicsResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposListUsersWithAccessToProtectedBranchParams
import typingsSlinky.octokitRest.mod.Octokit.ReposListUsersWithAccessToProtectedBranchResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposMergeParams
import typingsSlinky.octokitRest.mod.Octokit.ReposMergeResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposPingHookParams
import typingsSlinky.octokitRest.mod.Octokit.ReposRemoveBranchProtectionParams
import typingsSlinky.octokitRest.mod.Octokit.ReposRemoveCollaboratorParams
import typingsSlinky.octokitRest.mod.Octokit.ReposRemoveDeployKeyParams
import typingsSlinky.octokitRest.mod.Octokit.ReposRemoveProtectedBranchAdminEnforcementParams
import typingsSlinky.octokitRest.mod.Octokit.ReposRemoveProtectedBranchAppRestrictionsParams
import typingsSlinky.octokitRest.mod.Octokit.ReposRemoveProtectedBranchAppRestrictionsResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposRemoveProtectedBranchPullRequestReviewEnforcementParams
import typingsSlinky.octokitRest.mod.Octokit.ReposRemoveProtectedBranchRequiredSignaturesParams
import typingsSlinky.octokitRest.mod.Octokit.ReposRemoveProtectedBranchRequiredStatusChecksContextsParams
import typingsSlinky.octokitRest.mod.Octokit.ReposRemoveProtectedBranchRequiredStatusChecksContextsResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposRemoveProtectedBranchRequiredStatusChecksParams
import typingsSlinky.octokitRest.mod.Octokit.ReposRemoveProtectedBranchRestrictionsParams
import typingsSlinky.octokitRest.mod.Octokit.ReposRemoveProtectedBranchTeamRestrictionsParams
import typingsSlinky.octokitRest.mod.Octokit.ReposRemoveProtectedBranchTeamRestrictionsResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposRemoveProtectedBranchUserRestrictionsParams
import typingsSlinky.octokitRest.mod.Octokit.ReposRemoveProtectedBranchUserRestrictionsResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposReplaceProtectedBranchAppRestrictionsParams
import typingsSlinky.octokitRest.mod.Octokit.ReposReplaceProtectedBranchAppRestrictionsResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposReplaceProtectedBranchRequiredStatusChecksContextsParams
import typingsSlinky.octokitRest.mod.Octokit.ReposReplaceProtectedBranchRequiredStatusChecksContextsResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposReplaceProtectedBranchTeamRestrictionsParams
import typingsSlinky.octokitRest.mod.Octokit.ReposReplaceProtectedBranchTeamRestrictionsResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposReplaceProtectedBranchUserRestrictionsParams
import typingsSlinky.octokitRest.mod.Octokit.ReposReplaceProtectedBranchUserRestrictionsResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposReplaceTopicsParams
import typingsSlinky.octokitRest.mod.Octokit.ReposReplaceTopicsResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposRequestPageBuildParams
import typingsSlinky.octokitRest.mod.Octokit.ReposRequestPageBuildResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposRetrieveCommunityProfileMetricsParams
import typingsSlinky.octokitRest.mod.Octokit.ReposRetrieveCommunityProfileMetricsResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposTestPushHookParams
import typingsSlinky.octokitRest.mod.Octokit.ReposTransferParams
import typingsSlinky.octokitRest.mod.Octokit.ReposTransferResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposUpdateBranchProtectionParams
import typingsSlinky.octokitRest.mod.Octokit.ReposUpdateBranchProtectionResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposUpdateCommitCommentParams
import typingsSlinky.octokitRest.mod.Octokit.ReposUpdateCommitCommentResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposUpdateFileParams
import typingsSlinky.octokitRest.mod.Octokit.ReposUpdateFileResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposUpdateHookParams
import typingsSlinky.octokitRest.mod.Octokit.ReposUpdateHookResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposUpdateInformationAboutPagesSiteParams
import typingsSlinky.octokitRest.mod.Octokit.ReposUpdateInvitationParams
import typingsSlinky.octokitRest.mod.Octokit.ReposUpdateInvitationResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposUpdateParams
import typingsSlinky.octokitRest.mod.Octokit.ReposUpdateProtectedBranchPullRequestReviewEnforcementParams
import typingsSlinky.octokitRest.mod.Octokit.ReposUpdateProtectedBranchPullRequestReviewEnforcementResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposUpdateProtectedBranchRequiredStatusChecksParams
import typingsSlinky.octokitRest.mod.Octokit.ReposUpdateProtectedBranchRequiredStatusChecksResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposUpdateReleaseAssetParams
import typingsSlinky.octokitRest.mod.Octokit.ReposUpdateReleaseAssetResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposUpdateReleaseParams
import typingsSlinky.octokitRest.mod.Octokit.ReposUpdateReleaseResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposUpdateResponse
import typingsSlinky.octokitRest.mod.Octokit.ReposUploadReleaseAssetParams
import typingsSlinky.octokitRest.mod.Octokit.ReposUploadReleaseAssetParamsDeprecatedFile
import typingsSlinky.octokitRest.mod.Octokit.ReposUploadReleaseAssetResponse
import typingsSlinky.octokitRest.mod.Octokit.RequestOptions
import typingsSlinky.octokitRest.mod.Octokit.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAcceptInvitation extends js.Object {
  @JSName("acceptInvitation")
  var acceptInvitation_Original: Anon341 = js.native
  /**
    * This endpoint triggers [notifications](https://help.github.com/articles/about-notifications/). Creating content too quickly using this endpoint may result in abuse rate limiting. See "[Abuse rate limits](https://developer.github.com/v3/#abuse-rate-limits)" and "[Dealing with abuse rate limits](https://developer.github.com/v3/guides/best-practices-for-integrators/#dealing-with-abuse-rate-limits)" for details.
    *
    * Note that, if you choose not to pass any parameters, you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://developer.github.com/v3/#http-verbs)."
    *
    * The invitee will receive a notification that they have been invited to the repository, which they must accept or decline. They may do this via the notifications page, the email they receive, or by using the [repository invitations API endpoints](https://developer.github.com/v3/repos/invitations/).
    *
    * **Rate limits**
    *
    * To prevent abuse, you are limited to sending 50 invitations to a repository per 24 hour period. Note there is no limit if you are inviting organization members to an organization repository.
    */
  @JSName("addCollaborator")
  var addCollaborator_Original: Anon342 = js.native
  /**
    * Here's how you can create a read-only deploy key:
    */
  @JSName("addDeployKey")
  var addDeployKey_Original: Anon343 = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Adding admin enforcement requires admin or owner permissions to the repository and branch protection to be enabled.
    */
  @JSName("addProtectedBranchAdminEnforcement")
  var addProtectedBranchAdminEnforcement_Original: Anon344 = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Grants the specified apps push access for this branch. Only installed GitHub Apps with `write` access to the `contents` permission can be added as authorized actors on a protected branch.
    *
    * | Type    | Description                                                                                                                                                |
    * | ------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------- |
    * | `array` | The GitHub Apps that have push access to this branch. Use the app's `slug`. **Note**: The list of users, apps, and teams in total is limited to 100 items. |
    */
  @JSName("addProtectedBranchAppRestrictions")
  var addProtectedBranchAppRestrictions_Original: Anon345 = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * When authenticated with admin or owner permissions to the repository, you can use this endpoint to require signed commits on a branch. You must enable branch protection to require signed commits.
    */
  @JSName("addProtectedBranchRequiredSignatures")
  var addProtectedBranchRequiredSignatures_Original: Anon346 = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    */
  @JSName("addProtectedBranchRequiredStatusChecksContexts")
  var addProtectedBranchRequiredStatusChecksContexts_Original: Anon347 = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Grants the specified teams push access for this branch. You can also give push access to child teams.
    *
    * | Type    | Description                                                                                                                                |
    * | ------- | ------------------------------------------------------------------------------------------------------------------------------------------ |
    * | `array` | The teams that can have push access. Use the team's `slug`. **Note**: The list of users, apps, and teams in total is limited to 100 items. |
    */
  @JSName("addProtectedBranchTeamRestrictions")
  var addProtectedBranchTeamRestrictions_Original: Anon348 = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Grants the specified people push access for this branch.
    *
    * | Type    | Description                                                                                                                   |
    * | ------- | ----------------------------------------------------------------------------------------------------------------------------- |
    * | `array` | Usernames for people who can have push access. **Note**: The list of users, apps, and teams in total is limited to 100 items. |
    */
  @JSName("addProtectedBranchUserRestrictions")
  var addProtectedBranchUserRestrictions_Original: Anon349 = js.native
  /**
    * For organization-owned repositories, the list of collaborators includes outside collaborators, organization members that are direct collaborators, organization members with access through team memberships, organization members with access through default organization permissions, and organization owners.
    *
    * Team members will include the members of child teams.
    */
  @JSName("checkCollaborator")
  var checkCollaborator_Original: Anon350 = js.native
  /**
    * Shows whether vulnerability alerts are enabled or disabled for a repository. The authenticated user must have admin access to the repository. For more information, see "[About security alerts for vulnerable dependencies](https://help.github.com/en/articles/about-security-alerts-for-vulnerable-dependencies)" in the GitHub Help documentation.
    */
  @JSName("checkVulnerabilityAlerts")
  var checkVulnerabilityAlerts_Original: Anon351 = js.native
  /**
    * Both `:base` and `:head` must be branch names in `:repo`. To compare branches across other repositories in the same network as `:repo`, use the format `<USERNAME>:branch`.
    *
    * The response from the API is equivalent to running the `git log base..head` command; however, commits are returned in chronological order. Pass the appropriate [media type](https://developer.github.com/v3/media/#commits-commit-comparison-and-pull-requests) to fetch diff and patch formats.
    *
    * The response also includes details on the files that were changed between the two commits. This includes the status of the change (for example, if a file was added, removed, modified, or renamed), and details of the change itself. For example, files with a `renamed` status have a `previous_filename` field showing the previous filename of the file, and files with a `modified` status have a `patch` field showing the changes made to the file.
    *
    * **Working with large comparisons**
    *
    * The response will include a comparison of up to 250 commits. If you are working with a larger commit range, you can use the [Commit List API](https://developer.github.com/v3/repos/commits/#list-commits-on-a-repository) to enumerate all commits in the range.
    *
    * For comparisons with extremely large diffs, you may receive an error response indicating that the diff took too long to generate. You can typically resolve this error by using a smaller commit range.
    *
    * **Signature verification object**
    *
    * The response will include a `verification` object that describes the result of verifying the commit's signature. The following fields are included in the `verification` object:
    *
    * These are the possible values for `reason` in the `verification` object:
    *
    * | Value                    | Description                                                                                                                       |
    * | ------------------------ | --------------------------------------------------------------------------------------------------------------------------------- |
    * | `expired_key`            | The key that made the signature is expired.                                                                                       |
    * | `not_signing_key`        | The "signing" flag is not among the usage flags in the GPG key that made the signature.                                           |
    * | `gpgverify_error`        | There was an error communicating with the signature verification service.                                                         |
    * | `gpgverify_unavailable`  | The signature verification service is currently unavailable.                                                                      |
    * | `unsigned`               | The object does not include a signature.                                                                                          |
    * | `unknown_signature_type` | A non-PGP signature was found in the commit.                                                                                      |
    * | `no_user`                | No user was associated with the `committer` email address in the commit.                                                          |
    * | `unverified_email`       | The `committer` email address in the commit was associated with a user, but the email address is not verified on her/his account. |
    * | `bad_email`              | The `committer` email address in the commit is not included in the identities of the PGP key that made the signature.             |
    * | `unknown_key`            | The key that made the signature has not been registered with any user's account.                                                  |
    * | `malformed_signature`    | There was an error parsing the signature.                                                                                         |
    * | `invalid`                | The signature could not be cryptographically verified using the key whose key-id was found in the signature.                      |
    * | `valid`                  | None of the above errors applied, so the signature is considered to be verified.                                                  |
    */
  @JSName("compareCommits")
  var compareCommits_Original: Anon352 = js.native
  /**
    * Create a comment for a commit using its `:commit_sha`.
    *
    * This endpoint triggers [notifications](https://help.github.com/articles/about-notifications/). Creating content too quickly using this endpoint may result in abuse rate limiting. See "[Abuse rate limits](https://developer.github.com/v3/#abuse-rate-limits)" and "[Dealing with abuse rate limits](https://developer.github.com/v3/guides/best-practices-for-integrators/#dealing-with-abuse-rate-limits)" for details.
    */
  @JSName("createCommitComment")
  var createCommitComment_Original: Anon353 = js.native
  /**
    * Users with `push` access can create deployment statuses for a given deployment.
    *
    * GitHub Apps require `read & write` access to "Deployments" and `read-only` access to "Repo contents" (for private repos). OAuth Apps require the `repo_deployment` scope.
    */
  @JSName("createDeploymentStatus")
  var createDeploymentStatus_Original: Anon355 = js.native
  /**
    * Deployments offer a few configurable parameters with sane defaults.
    *
    * The `ref` parameter can be any named branch, tag, or SHA. At GitHub we often deploy branches and verify them before we merge a pull request.
    *
    * The `environment` parameter allows deployments to be issued to different runtime environments. Teams often have multiple environments for verifying their applications, such as `production`, `staging`, and `qa`. This parameter makes it easier to track which environments have requested deployments. The default environment is `production`.
    *
    * The `auto_merge` parameter is used to ensure that the requested ref is not behind the repository's default branch. If the ref _is_ behind the default branch for the repository, we will attempt to merge it for you. If the merge succeeds, the API will return a successful merge commit. If merge conflicts prevent the merge from succeeding, the API will return a failure response.
    *
    * By default, [commit statuses](https://developer.github.com/v3/repos/statuses) for every submitted context must be in a `success` state. The `required_contexts` parameter allows you to specify a subset of contexts that must be `success`, or to specify contexts that have not yet been submitted. You are not required to use commit statuses to deploy. If you do not require any contexts or create any commit statuses, the deployment will always succeed.
    *
    * The `payload` parameter is available for any extra information that a deployment system might need. It is a JSON text field that will be passed on when a deployment event is dispatched.
    *
    * The `task` parameter is used by the deployment system to allow different execution paths. In the web world this might be `deploy:migrations` to run schema changes on the system. In the compiled world this could be a flag to compile an application with debugging enabled.
    *
    * Users with `repo` or `repo_deployment` scopes can create a deployment for a given ref:
    *
    * A simple example putting the user and room into the payload to notify back to chat networks.
    *
    * A more advanced example specifying required commit statuses and bypassing auto-merging.
    *
    * You will see this response when GitHub automatically merges the base branch into the topic branch instead of creating a deployment. This auto-merge happens when:
    *
    * *   Auto-merge option is enabled in the repository
    * *   Topic branch does not include the latest changes on the base branch, which is `master`in the response example
    * *   There are no merge conflicts
    *
    * If there are no new commits in the base branch, a new request to create a deployment should give a successful response.
    *
    * This error happens when the `auto_merge` option is enabled and when the default branch (in this case `master`), can't be merged into the branch that's being deployed (in this case `topic-branch`), due to merge conflicts.
    *
    * This error happens when the `required_contexts` parameter indicates that one or more contexts need to have a `success` status for the commit to be deployed, but one or more of the required contexts do not have a state of `success`.
    */
  @JSName("createDeployment")
  var createDeployment_Original: Anon354 = js.native
  /**
    * You can use this endpoint to trigger a webhook event called `repository_dispatch` when you want activity that happens outside of GitHub to trigger a GitHub Actions workflow or GitHub App webhook. You must configure your GitHub Actions workflow or GitHub App to run when the `repository_dispatch` event occurs. For an example `repository_dispatch` webhook payload, see "[RepositoryDispatchEvent](https://developer.github.com/v3/activity/events/types/#repositorydispatchevent)."
    *
    * The `client_payload` parameter is available for any extra information that your workflow might need. This parameter is a JSON payload that will be passed on when the webhook event is dispatched. For example, the `client_payload` can include a message that a user would like to send using a GitHub Actions workflow. Or the `client_payload` can be used as a test to debug your workflow. For a test example, see the [input example](https://developer.github.com/v3/repos/#example-4).
    *
    * To give you write access to the repository, you must use a personal access token with the `repo` scope. For more information, see "[Creating a personal access token for the command line](https://help.github.com/articles/creating-a-personal-access-token-for-the-command-line)" in the GitHub Help documentation.
    *
    * This input example shows how you can use the `client_payload` as a test to debug your workflow.
    */
  @JSName("createDispatchEvent")
  var createDispatchEvent_Original: Anon356 = js.native
  /**
    * Creates a new file or updates an existing file in a repository.
    * @deprecated octokit.repos.createFile() has been renamed to octokit.repos.createOrUpdateFile() (2019-06-07)
    */
  @JSName("createFile")
  var createFile_Original: Anon357 = js.native
  /**
    * Creates a new repository for the authenticated user.
    *
    * **OAuth scope requirements**
    *
    * When using [OAuth](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/), authorizations must include:
    *
    * *   `public_repo` scope or `repo` scope to create a public repository
    * *   `repo` scope to create a private repository
    */
  @JSName("createForAuthenticatedUser")
  var createForAuthenticatedUser_Original: Anon358 = js.native
  /**
    * Create a fork for the authenticated user.
    *
    * **Note**: Forking a Repository happens asynchronously. You may have to wait a short period of time before you can access the git objects. If this takes longer than 5 minutes, be sure to contact [GitHub Support](https://github.com/contact) or [GitHub Premium Support](https://premium.githubsupport.com).
    */
  @JSName("createFork")
  var createFork_Original: Anon359 = js.native
  /**
    * Repositories can have multiple webhooks installed. Each webhook should have a unique `config`. Multiple webhooks can share the same `config` as long as those webhooks do not have any `events` that overlap.
    *
    * Here's how you can create a hook that posts payloads in JSON format:
    */
  @JSName("createHook")
  var createHook_Original: Anon360 = js.native
  /**
    * Creates a new repository for the authenticated user.
    *
    * **OAuth scope requirements**
    *
    * When using [OAuth](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/), authorizations must include:
    *
    * *   `public_repo` scope or `repo` scope to create a public repository
    * *   `repo` scope to create a private repository
    */
  @JSName("createInOrg")
  var createInOrg_Original: Anon361 = js.native
  /**
    * Creates a new file or updates an existing file in a repository.
    */
  @JSName("createOrUpdateFile")
  var createOrUpdateFile_Original: Anon362 = js.native
  /**
    * Users with push access to the repository can create a release.
    *
    * This endpoint triggers [notifications](https://help.github.com/articles/about-notifications/). Creating content too quickly using this endpoint may result in abuse rate limiting. See "[Abuse rate limits](https://developer.github.com/v3/#abuse-rate-limits)" and "[Dealing with abuse rate limits](https://developer.github.com/v3/guides/best-practices-for-integrators/#dealing-with-abuse-rate-limits)" for details.
    */
  @JSName("createRelease")
  var createRelease_Original: Anon363 = js.native
  /**
    * Users with push access in a repository can create commit statuses for a given SHA.
    *
    * Note: there is a limit of 1000 statuses per `sha` and `context` within a repository. Attempts to create more than 1000 statuses will result in a validation error.
    */
  @JSName("createStatus")
  var createStatus_Original: Anon364 = js.native
  /**
    * Creates a new repository using a repository template. Use the `template_owner` and `template_repo` route parameters to specify the repository to use as the template. The authenticated user must own or be a member of an organization that owns the repository. To check if a repository is available to use as a template, get the repository's information using the [`GET /repos/:owner/:repo`](https://developer.github.com/v3/repos/#get) endpoint and check that the `is_template` key is `true`.
    *
    * **OAuth scope requirements**
    *
    * When using [OAuth](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/), authorizations must include:
    *
    * *   `public_repo` scope or `repo` scope to create a public repository
    * *   `repo` scope to create a private repository
    *
    * \`
    */
  @JSName("createUsingTemplate")
  var createUsingTemplate_Original: Anon365 = js.native
  @JSName("declineInvitation")
  var declineInvitation_Original: Anon366 = js.native
  @JSName("deleteCommitComment")
  var deleteCommitComment_Original: Anon368 = js.native
  @JSName("deleteDownload")
  var deleteDownload_Original: Anon369 = js.native
  /**
    * Deletes a file in a repository.
    *
    * You can provide an additional `committer` parameter, which is an object containing information about the committer. Or, you can provide an `author` parameter, which is an object containing information about the author.
    *
    * The `author` section is optional and is filled in with the `committer` information if omitted. If the `committer` information is omitted, the authenticated user's information is used.
    *
    * You must provide values for both `name` and `email`, whether you choose to use `author` or `committer`. Otherwise, you'll receive a `422` status code.
    */
  @JSName("deleteFile")
  var deleteFile_Original: Anon370 = js.native
  @JSName("deleteHook")
  var deleteHook_Original: Anon371 = js.native
  @JSName("deleteInvitation")
  var deleteInvitation_Original: Anon372 = js.native
  @JSName("deleteReleaseAsset")
  var deleteReleaseAsset_Original: Anon374 = js.native
  /**
    * Users with push access to the repository can delete a release.
    */
  @JSName("deleteRelease")
  var deleteRelease_Original: Anon373 = js.native
  /**
    * Deleting a repository requires admin access. If OAuth is used, the `delete_repo` scope is required.
    *
    * If an organization owner has configured the organization to prevent members from deleting organization-owned repositories, a member will get this response:
    */
  @JSName("delete")
  var delete_Original: Anon367 = js.native
  /**
    * Disables automated security fixes for a repository. The authenticated user must have admin access to the repository. For more information, see "[Configuring automated security fixes](https://help.github.com/en/articles/configuring-automated-security-fixes)" in the GitHub Help documentation.
    */
  @JSName("disableAutomatedSecurityFixes")
  var disableAutomatedSecurityFixes_Original: Anon375 = js.native
  @JSName("disablePagesSite")
  var disablePagesSite_Original: Anon376 = js.native
  /**
    * Disables vulnerability alerts and the dependency graph for a repository. The authenticated user must have admin access to the repository. For more information, see "[About security alerts for vulnerable dependencies](https://help.github.com/en/articles/about-security-alerts-for-vulnerable-dependencies)" in the GitHub Help documentation.
    */
  @JSName("disableVulnerabilityAlerts")
  var disableVulnerabilityAlerts_Original: Anon377 = js.native
  /**
    * Enables automated security fixes for a repository. The authenticated user must have admin access to the repository. For more information, see "[Configuring automated security fixes](https://help.github.com/en/articles/configuring-automated-security-fixes)" in the GitHub Help documentation.
    */
  @JSName("enableAutomatedSecurityFixes")
  var enableAutomatedSecurityFixes_Original: Anon378 = js.native
  @JSName("enablePagesSite")
  var enablePagesSite_Original: Anon379 = js.native
  /**
    * Enables vulnerability alerts and the dependency graph for a repository. The authenticated user must have admin access to the repository. For more information, see "[About security alerts for vulnerable dependencies](https://help.github.com/en/articles/about-security-alerts-for-vulnerable-dependencies)" in the GitHub Help documentation.
    */
  @JSName("enableVulnerabilityAlerts")
  var enableVulnerabilityAlerts_Original: Anon380 = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Lists the GitHub Apps that have push access to this branch. Only installed GitHub Apps with `write` access to the `contents` permission can be added as authorized actors on a protected branch.
    */
  @JSName("getAppsWithAccessToProtectedBranch")
  var getAppsWithAccessToProtectedBranch_Original: Anon382 = js.native
  /**
    * Gets a redirect URL to download an archive for a repository. The `:archive_format` can be either `tarball` or `zipball`. The `:ref` must be a valid Git reference. If you omit `:ref`, the repository’s default branch (usually `master`) will be used. Please make sure your HTTP framework is configured to follow redirects or you will need to use the `Location` header to make a second `GET` request.
    *
    * _Note_: For private repositories, these links are temporary and expire after five minutes.
    *
    * To follow redirects with curl, use the `-L` switch:
    */
  @JSName("getArchiveLink")
  var getArchiveLink_Original: Anon383 = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    */
  @JSName("getBranchProtection")
  var getBranchProtection_Original: Anon385 = js.native
  @JSName("getBranch")
  var getBranch_Original: Anon384 = js.native
  /**
    * Get the total number of clones and breakdown per day or week for the last 14 days. Timestamps are aligned to UTC midnight of the beginning of the day or week. Week begins on Monday.
    */
  @JSName("getClones")
  var getClones_Original: Anon386 = js.native
  /**
    * Returns a weekly aggregate of the number of additions and deletions pushed to a repository.
    */
  @JSName("getCodeFrequencyStats")
  var getCodeFrequencyStats_Original: Anon387 = js.native
  /**
    * Possible values for the `permission` key: `admin`, `write`, `read`, `none`.
    */
  @JSName("getCollaboratorPermissionLevel")
  var getCollaboratorPermissionLevel_Original: Anon388 = js.native
  /**
    * Users with pull access in a repository can access a combined view of commit statuses for a given ref. The ref can be a SHA, a branch name, or a tag name.
    *
    * The most recent status for each context is returned, up to 100. This field [paginates](https://developer.github.com/v3/#pagination) if there are over 100 contexts.
    *
    * Additionally, a combined `state` is returned. The `state` is one of:
    *
    * *   **failure** if any of the contexts report as `error` or `failure`
    * *   **pending** if there are no statuses or a context is `pending`
    * *   **success** if the latest status for all contexts is `success`
    */
  @JSName("getCombinedStatusForRef")
  var getCombinedStatusForRef_Original: Anon389 = js.native
  /**
    * Returns the last year of commit activity grouped by week. The `days` array is a group of commits per day, starting on `Sunday`.
    */
  @JSName("getCommitActivityStats")
  var getCommitActivityStats_Original: Anon391 = js.native
  @JSName("getCommitComment")
  var getCommitComment_Original: Anon392 = js.native
  /**
    * **Note:** To access this endpoint, you must provide a custom [media type](https://developer.github.com/v3/media) in the `Accept` header:
    * ```
    * application/vnd.github.VERSION.sha
    * ```
    * Returns the SHA-1 of the commit reference. You must have `read` access for the repository to get the SHA-1 of a commit reference. You can use this endpoint to check if a remote reference's SHA-1 is the same as your local reference's SHA-1 by providing the local SHA-1 reference as the ETag.
    * @deprecated "Get the SHA-1 of a commit reference" will be removed. Use "Get a single commit" instead with media type format set to "sha" instead.
    */
  @JSName("getCommitRefSha")
  var getCommitRefSha_Original: Anon393 = js.native
  /**
    * Returns the contents of a single commit reference. You must have `read` access for the repository to use this endpoint.
    *
    * You can pass the appropriate [media type](https://developer.github.com/v3/media/#commits-commit-comparison-and-pull-requests) to fetch `diff` and `patch` formats. Diffs with binary data will have no `patch` property.
    *
    * To return only the SHA-1 hash of the commit reference, you can provide the `sha` custom [media type](https://developer.github.com/v3/media/#commits-commit-comparison-and-pull-requests) in the `Accept` header. You can use this endpoint to check if a remote reference's SHA-1 hash is the same as your local reference's SHA-1 hash by providing the local SHA-1 reference as the ETag.
    *
    * **Signature verification object**
    *
    * The response will include a `verification` object that describes the result of verifying the commit's signature. The following fields are included in the `verification` object:
    *
    * These are the possible values for `reason` in the `verification` object:
    *
    * | Value                    | Description                                                                                                                       |
    * | ------------------------ | --------------------------------------------------------------------------------------------------------------------------------- |
    * | `expired_key`            | The key that made the signature is expired.                                                                                       |
    * | `not_signing_key`        | The "signing" flag is not among the usage flags in the GPG key that made the signature.                                           |
    * | `gpgverify_error`        | There was an error communicating with the signature verification service.                                                         |
    * | `gpgverify_unavailable`  | The signature verification service is currently unavailable.                                                                      |
    * | `unsigned`               | The object does not include a signature.                                                                                          |
    * | `unknown_signature_type` | A non-PGP signature was found in the commit.                                                                                      |
    * | `no_user`                | No user was associated with the `committer` email address in the commit.                                                          |
    * | `unverified_email`       | The `committer` email address in the commit was associated with a user, but the email address is not verified on her/his account. |
    * | `bad_email`              | The `committer` email address in the commit is not included in the identities of the PGP key that made the signature.             |
    * | `unknown_key`            | The key that made the signature has not been registered with any user's account.                                                  |
    * | `malformed_signature`    | There was an error parsing the signature.                                                                                         |
    * | `invalid`                | The signature could not be cryptographically verified using the key whose key-id was found in the signature.                      |
    * | `valid`                  | None of the above errors applied, so the signature is considered to be verified.                                                  |
    */
  @JSName("getCommit")
  var getCommit_Original: Anon390 = js.native
  /**
    * Gets the contents of a file or directory in a repository. Specify the file path or directory in `:path`. If you omit `:path`, you will receive the contents of all files in the repository.
    *
    * Files and symlinks support [a custom media type](https://developer.github.com/v3/repos/contents/#custom-media-types) for retrieving the raw content or rendered HTML (when supported). All content types support [a custom media type](https://developer.github.com/v3/repos/contents/#custom-media-types) to ensure the content is returned in a consistent object format.
    *
    * **Note**:
    *
    * *   To get a repository's contents recursively, you can [recursively get the tree](https://developer.github.com/v3/git/trees/).
    * *   This API has an upper limit of 1,000 files for a directory. If you need to retrieve more files, use the [Git Trees API](https://developer.github.com/v3/git/trees/#get-a-tree).
    * *   This API supports files up to 1 megabyte in size.
    *
    * The response will be an array of objects, one object for each item in the directory.
    *
    * When listing the contents of a directory, submodules have their "type" specified as "file". Logically, the value _should_ be "submodule". This behavior exists in API v3 [for backwards compatibility purposes](https://git.io/v1YCW). In the next major version of the API, the type will be returned as "submodule".
    *
    * If the requested `:path` points to a symlink, and the symlink's target is a normal file in the repository, then the API responds with the content of the file (in the [format shown above](https://developer.github.com/v3/repos/contents/#response-if-content-is-a-file)).
    *
    * Otherwise, the API responds with an object describing the symlink itself:
    *
    * The `submodule_git_url` identifies the location of the submodule repository, and the `sha` identifies a specific commit within the submodule repository. Git uses the given URL when cloning the submodule repository, and checks out the submodule at that specific commit.
    *
    * If the submodule repository is not hosted on github.com, the Git URLs (`git_url` and `_links["git"]`) and the github.com URLs (`html_url` and `_links["html"]`) will have null values.
    */
  @JSName("getContents")
  var getContents_Original: Anon394 = js.native
  /**
    * *   `total` - The Total number of commits authored by the contributor.
    *
    * Weekly Hash (`weeks` array):
    *
    * *   `w` - Start of the week, given as a [Unix timestamp](http://en.wikipedia.org/wiki/Unix_time).
    * *   `a` - Number of additions
    * *   `d` - Number of deletions
    * *   `c` - Number of commits
    */
  @JSName("getContributorsStats")
  var getContributorsStats_Original: Anon395 = js.native
  @JSName("getDeployKey")
  var getDeployKey_Original: Anon396 = js.native
  /**
    * Users with pull access can view a deployment status for a deployment:
    */
  @JSName("getDeploymentStatus")
  var getDeploymentStatus_Original: Anon398 = js.native
  @JSName("getDeployment")
  var getDeployment_Original: Anon397 = js.native
  @JSName("getDownload")
  var getDownload_Original: Anon399 = js.native
  @JSName("getHook")
  var getHook_Original: Anon400 = js.native
  @JSName("getLatestPagesBuild")
  var getLatestPagesBuild_Original: Anon401 = js.native
  /**
    * View the latest published full release for the repository.
    *
    * The latest release is the most recent non-prerelease, non-draft release, sorted by the `created_at` attribute. The `created_at` attribute is the date of the commit used for the release, and not the date when the release was drafted or published.
    */
  @JSName("getLatestRelease")
  var getLatestRelease_Original: Anon402 = js.native
  @JSName("getPagesBuild")
  var getPagesBuild_Original: Anon404 = js.native
  @JSName("getPages")
  var getPages_Original: Anon403 = js.native
  /**
    * Returns the total commit counts for the `owner` and total commit counts in `all`. `all` is everyone combined, including the `owner` in the last 52 weeks. If you'd like to get the commit counts for non-owners, you can subtract `owner` from `all`.
    *
    * The array order is oldest week (index 0) to most recent week.
    */
  @JSName("getParticipationStats")
  var getParticipationStats_Original: Anon405 = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    */
  @JSName("getProtectedBranchAdminEnforcement")
  var getProtectedBranchAdminEnforcement_Original: Anon406 = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    */
  @JSName("getProtectedBranchPullRequestReviewEnforcement")
  var getProtectedBranchPullRequestReviewEnforcement_Original: Anon407 = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * When authenticated with admin or owner permissions to the repository, you can use this endpoint to check whether a branch requires signed commits. An enabled status of `true` indicates you must sign commits on this branch. For more information, see [Signing commits with GPG](https://help.github.com/articles/signing-commits-with-gpg) in GitHub Help.
    *
    * **Note**: You must enable branch protection to require signed commits.
    */
  @JSName("getProtectedBranchRequiredSignatures")
  var getProtectedBranchRequiredSignatures_Original: Anon408 = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    */
  @JSName("getProtectedBranchRequiredStatusChecks")
  var getProtectedBranchRequiredStatusChecks_Original: Anon409 = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Lists who has access to this protected branch. {{#note}}
    *
    * **Note**: Users, apps, and teams `restrictions` are only available for organization-owned repositories.
    */
  @JSName("getProtectedBranchRestrictions")
  var getProtectedBranchRestrictions_Original: Anon410 = js.native
  /**
    * Each array contains the day number, hour number, and number of commits:
    *
    * *   `0-6`: Sunday - Saturday
    * *   `0-23`: Hour of day
    * *   Number of commits
    *
    * For example, `[2, 14, 25]` indicates that there were 25 total commits, during the 2:00pm hour on Tuesdays. All times are based on the time zone of individual commits.
    */
  @JSName("getPunchCardStats")
  var getPunchCardStats_Original: Anon411 = js.native
  /**
    * Gets the preferred README for a repository.
    *
    * READMEs support [custom media types](https://developer.github.com/v3/repos/contents/#custom-media-types) for retrieving the raw content or rendered HTML.
    */
  @JSName("getReadme")
  var getReadme_Original: Anon412 = js.native
  /**
    * To download the asset's binary content, set the `Accept` header of the request to [`application/octet-stream`](https://developer.github.com/v3/media/#media-types). The API will either redirect the client to the location, or stream it directly if possible. API clients should handle both a `200` or `302` response.
    */
  @JSName("getReleaseAsset")
  var getReleaseAsset_Original: Anon414 = js.native
  /**
    * Get a published release with the specified tag.
    */
  @JSName("getReleaseByTag")
  var getReleaseByTag_Original: Anon415 = js.native
  /**
    * **Note:** This returns an `upload_url` key corresponding to the endpoint for uploading release assets. This key is a [hypermedia resource](https://developer.github.com/v3/#hypermedia).
    */
  @JSName("getRelease")
  var getRelease_Original: Anon413 = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Lists the teams who have push access to this branch. The list includes child teams.
    */
  @JSName("getTeamsWithAccessToProtectedBranch")
  var getTeamsWithAccessToProtectedBranch_Original: Anon416 = js.native
  /**
    * Get the top 10 popular contents over the last 14 days.
    */
  @JSName("getTopPaths")
  var getTopPaths_Original: Anon417 = js.native
  /**
    * Get the top 10 referrers over the last 14 days.
    */
  @JSName("getTopReferrers")
  var getTopReferrers_Original: Anon418 = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Lists the people who have push access to this branch.
    */
  @JSName("getUsersWithAccessToProtectedBranch")
  var getUsersWithAccessToProtectedBranch_Original: Anon419 = js.native
  /**
    * Get the total number of views and breakdown per day or week for the last 14 days. Timestamps are aligned to UTC midnight of the beginning of the day or week. Week begins on Monday.
    */
  @JSName("getViews")
  var getViews_Original: Anon420 = js.native
  /**
    * The `parent` and `source` objects are present when the repository is a fork. `parent` is the repository this repository was forked from, `source` is the ultimate source for the network.
    */
  @JSName("get")
  var get_Original: Anon381 = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Lists the GitHub Apps that have push access to this branch. Only installed GitHub Apps with `write` access to the `contents` permission can be added as authorized actors on a protected branch.
    * @deprecated octokit.repos.listAppsWithAccessToProtectedBranch() has been renamed to octokit.repos.getAppsWithAccessToProtectedBranch() (2019-09-13)
    */
  @JSName("listAppsWithAccessToProtectedBranch")
  var listAppsWithAccessToProtectedBranch_Original: Anon422 = js.native
  @JSName("listAssetsForRelease")
  var listAssetsForRelease_Original: Anon423 = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Returns all branches where the given commit SHA is the HEAD, or latest commit for the branch.
    */
  @JSName("listBranchesForHeadCommit")
  var listBranchesForHeadCommit_Original: Anon425 = js.native
  @JSName("listBranches")
  var listBranches_Original: Anon424 = js.native
  /**
    * For organization-owned repositories, the list of collaborators includes outside collaborators, organization members that are direct collaborators, organization members with access through team memberships, organization members with access through default organization permissions, and organization owners.
    *
    * Team members will include the members of child teams.
    */
  @JSName("listCollaborators")
  var listCollaborators_Original: Anon426 = js.native
  /**
    * Use the `:commit_sha` to specify the commit that will have its comments listed.
    */
  @JSName("listCommentsForCommit")
  var listCommentsForCommit_Original: Anon427 = js.native
  /**
    * Commit Comments use [these custom media types](https://developer.github.com/v3/repos/comments/#custom-media-types). You can read more about the use of media types in the API [here](https://developer.github.com/v3/media/).
    *
    * Comments are ordered by ascending ID.
    */
  @JSName("listCommitComments")
  var listCommitComments_Original: Anon428 = js.native
  /**
    * **Signature verification object**
    *
    * The response will include a `verification` object that describes the result of verifying the commit's signature. The following fields are included in the `verification` object:
    *
    * These are the possible values for `reason` in the `verification` object:
    *
    * | Value                    | Description                                                                                                                       |
    * | ------------------------ | --------------------------------------------------------------------------------------------------------------------------------- |
    * | `expired_key`            | The key that made the signature is expired.                                                                                       |
    * | `not_signing_key`        | The "signing" flag is not among the usage flags in the GPG key that made the signature.                                           |
    * | `gpgverify_error`        | There was an error communicating with the signature verification service.                                                         |
    * | `gpgverify_unavailable`  | The signature verification service is currently unavailable.                                                                      |
    * | `unsigned`               | The object does not include a signature.                                                                                          |
    * | `unknown_signature_type` | A non-PGP signature was found in the commit.                                                                                      |
    * | `no_user`                | No user was associated with the `committer` email address in the commit.                                                          |
    * | `unverified_email`       | The `committer` email address in the commit was associated with a user, but the email address is not verified on her/his account. |
    * | `bad_email`              | The `committer` email address in the commit is not included in the identities of the PGP key that made the signature.             |
    * | `unknown_key`            | The key that made the signature has not been registered with any user's account.                                                  |
    * | `malformed_signature`    | There was an error parsing the signature.                                                                                         |
    * | `invalid`                | The signature could not be cryptographically verified using the key whose key-id was found in the signature.                      |
    * | `valid`                  | None of the above errors applied, so the signature is considered to be verified.                                                  |
    */
  @JSName("listCommits")
  var listCommits_Original: Anon429 = js.native
  /**
    * Lists contributors to the specified repository and sorts them by the number of commits per contributor in descending order. This endpoint may return information that is a few hours old because the GitHub REST API v3 caches contributor data to improve performance.
    *
    * GitHub identifies contributors by author email address. This endpoint groups contribution counts by GitHub user, which includes all associated email addresses. To improve performance, only the first 500 author email addresses in the repository link to GitHub users. The rest will appear as anonymous contributors without associated GitHub user information.
    */
  @JSName("listContributors")
  var listContributors_Original: Anon430 = js.native
  @JSName("listDeployKeys")
  var listDeployKeys_Original: Anon431 = js.native
  /**
    * Users with pull access can view deployment statuses for a deployment:
    */
  @JSName("listDeploymentStatuses")
  var listDeploymentStatuses_Original: Anon432 = js.native
  /**
    * Simple filtering of deployments is available via query parameters:
    */
  @JSName("listDeployments")
  var listDeployments_Original: Anon433 = js.native
  @JSName("listDownloads")
  var listDownloads_Original: Anon434 = js.native
  /**
    * Lists repositories for the specified organization.
    */
  @JSName("listForOrg")
  var listForOrg_Original: Anon435 = js.native
  /**
    * Lists public repositories for the specified user.
    */
  @JSName("listForUser")
  var listForUser_Original: Anon436 = js.native
  @JSName("listForks")
  var listForks_Original: Anon437 = js.native
  @JSName("listHooks")
  var listHooks_Original: Anon438 = js.native
  /**
    * When authenticating as a user, this endpoint will list all currently open repository invitations for that user.
    */
  @JSName("listInvitationsForAuthenticatedUser")
  var listInvitationsForAuthenticatedUser_Original: Anon440 = js.native
  /**
    * When authenticating as a user with admin rights to a repository, this endpoint will list all currently open repository invitations.
    */
  @JSName("listInvitations")
  var listInvitations_Original: Anon439 = js.native
  /**
    * Lists languages for the specified repository. The value shown for each language is the number of bytes of code written in that language.
    */
  @JSName("listLanguages")
  var listLanguages_Original: Anon441 = js.native
  @JSName("listPagesBuilds")
  var listPagesBuilds_Original: Anon442 = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    */
  @JSName("listProtectedBranchRequiredStatusChecksContexts")
  var listProtectedBranchRequiredStatusChecksContexts_Original: Anon443 = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Lists the teams who have push access to this branch. The list includes child teams.
    * @deprecated octokit.repos.listProtectedBranchTeamRestrictions() has been renamed to octokit.repos.getTeamsWithAccessToProtectedBranch() (2019-09-09)
    */
  @JSName("listProtectedBranchTeamRestrictions")
  var listProtectedBranchTeamRestrictions_Original: Anon444 = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Lists the people who have push access to this branch.
    * @deprecated octokit.repos.listProtectedBranchUserRestrictions() has been renamed to octokit.repos.getUsersWithAccessToProtectedBranch() (2019-09-09)
    */
  @JSName("listProtectedBranchUserRestrictions")
  var listProtectedBranchUserRestrictions_Original: Anon445 = js.native
  /**
    * Lists all public repositories in the order that they were created.
    *
    * Note: Pagination is powered exclusively by the `since` parameter. Use the [Link header](https://developer.github.com/v3/#link-header) to get the URL for the next page of repositories.
    */
  @JSName("listPublic")
  var listPublic_Original: Anon446 = js.native
  /**
    * Lists all pull requests containing the provided commit SHA, which can be from any point in the commit history. The results will include open and closed pull requests. Additional preview headers may be required to see certain details for associated pull requests, such as whether a pull request is in a draft state. For more information about previews that might affect this endpoint, see the [List pull requests](https://developer.github.com/v3/pulls/#list-pull-requests) endpoint.
    */
  @JSName("listPullRequestsAssociatedWithCommit")
  var listPullRequestsAssociatedWithCommit_Original: Anon447 = js.native
  /**
    * This returns a list of releases, which does not include regular Git tags that have not been associated with a release. To get a list of Git tags, use the [Repository Tags API](https://developer.github.com/v3/repos/#list-tags).
    *
    * Information about published releases are available to everyone. Only users with push access will receive listings for draft releases.
    */
  @JSName("listReleases")
  var listReleases_Original: Anon448 = js.native
  /**
    * Users with pull access in a repository can view commit statuses for a given ref. The ref can be a SHA, a branch name, or a tag name. Statuses are returned in reverse chronological order. The first status in the list will be the latest one.
    *
    * This resource is also available via a legacy route: `GET /repos/:owner/:repo/statuses/:ref`.
    */
  @JSName("listStatusesForRef")
  var listStatusesForRef_Original: Anon449 = js.native
  @JSName("listTags")
  var listTags_Original: Anon450 = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Lists the teams who have push access to this branch. The list includes child teams.
    * @deprecated octokit.repos.listTeamsWithAccessToProtectedBranch() has been renamed to octokit.repos.getTeamsWithAccessToProtectedBranch() (2019-09-13)
    */
  @JSName("listTeamsWithAccessToProtectedBranch")
  var listTeamsWithAccessToProtectedBranch_Original: Anon452 = js.native
  @JSName("listTeams")
  var listTeams_Original: Anon451 = js.native
  @JSName("listTopics")
  var listTopics_Original: Anon453 = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Lists the people who have push access to this branch.
    * @deprecated octokit.repos.listUsersWithAccessToProtectedBranch() has been renamed to octokit.repos.getUsersWithAccessToProtectedBranch() (2019-09-13)
    */
  @JSName("listUsersWithAccessToProtectedBranch")
  var listUsersWithAccessToProtectedBranch_Original: Anon454 = js.native
  /**
    * Lists repositories that the authenticated user has explicit permission (`:read`, `:write`, or `:admin`) to access.
    *
    * The authenticated user has explicit permission to access repositories they own, repositories where they are a collaborator, and repositories that they can access through an organization membership.
    */
  @JSName("list")
  var list_Original: Anon421 = js.native
  @JSName("merge")
  var merge_Original: Anon455 = js.native
  /**
    * This will trigger a [ping event](https://developer.github.com/webhooks/#ping-event) to be sent to the hook.
    */
  @JSName("pingHook")
  var pingHook_Original: Anon456 = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    */
  @JSName("removeBranchProtection")
  var removeBranchProtection_Original: Anon457 = js.native
  @JSName("removeCollaborator")
  var removeCollaborator_Original: Anon458 = js.native
  @JSName("removeDeployKey")
  var removeDeployKey_Original: Anon459 = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Removing admin enforcement requires admin or owner permissions to the repository and branch protection to be enabled.
    */
  @JSName("removeProtectedBranchAdminEnforcement")
  var removeProtectedBranchAdminEnforcement_Original: Anon460 = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Removes the ability of an app to push to this branch. Only installed GitHub Apps with `write` access to the `contents` permission can be added as authorized actors on a protected branch.
    *
    * | Type    | Description                                                                                                                                                |
    * | ------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------- |
    * | `array` | The GitHub Apps that have push access to this branch. Use the app's `slug`. **Note**: The list of users, apps, and teams in total is limited to 100 items. |
    */
  @JSName("removeProtectedBranchAppRestrictions")
  var removeProtectedBranchAppRestrictions_Original: Anon461 = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    */
  @JSName("removeProtectedBranchPullRequestReviewEnforcement")
  var removeProtectedBranchPullRequestReviewEnforcement_Original: Anon462 = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * When authenticated with admin or owner permissions to the repository, you can use this endpoint to disable required signed commits on a branch. You must enable branch protection to require signed commits.
    */
  @JSName("removeProtectedBranchRequiredSignatures")
  var removeProtectedBranchRequiredSignatures_Original: Anon463 = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    */
  @JSName("removeProtectedBranchRequiredStatusChecksContexts")
  var removeProtectedBranchRequiredStatusChecksContexts_Original: Anon465 = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    */
  @JSName("removeProtectedBranchRequiredStatusChecks")
  var removeProtectedBranchRequiredStatusChecks_Original: Anon464 = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Disables the ability to restrict who can push to this branch.
    */
  @JSName("removeProtectedBranchRestrictions")
  var removeProtectedBranchRestrictions_Original: Anon466 = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Removes the ability of a team to push to this branch. You can also remove push access for child teams.
    *
    * | Type    | Description                                                                                                                                         |
    * | ------- | --------------------------------------------------------------------------------------------------------------------------------------------------- |
    * | `array` | Teams that should no longer have push access. Use the team's `slug`. **Note**: The list of users, apps, and teams in total is limited to 100 items. |
    */
  @JSName("removeProtectedBranchTeamRestrictions")
  var removeProtectedBranchTeamRestrictions_Original: Anon467 = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Removes the ability of a user to push to this branch.
    *
    * | Type    | Description                                                                                                                                   |
    * | ------- | --------------------------------------------------------------------------------------------------------------------------------------------- |
    * | `array` | Usernames of the people who should no longer have push access. **Note**: The list of users, apps, and teams in total is limited to 100 items. |
    */
  @JSName("removeProtectedBranchUserRestrictions")
  var removeProtectedBranchUserRestrictions_Original: Anon468 = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Replaces the list of apps that have push access to this branch. This removes all apps that previously had push access and grants push access to the new list of apps. Only installed GitHub Apps with `write` access to the `contents` permission can be added as authorized actors on a protected branch.
    *
    * | Type    | Description                                                                                                                                                |
    * | ------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------- |
    * | `array` | The GitHub Apps that have push access to this branch. Use the app's `slug`. **Note**: The list of users, apps, and teams in total is limited to 100 items. |
    */
  @JSName("replaceProtectedBranchAppRestrictions")
  var replaceProtectedBranchAppRestrictions_Original: Anon469 = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    */
  @JSName("replaceProtectedBranchRequiredStatusChecksContexts")
  var replaceProtectedBranchRequiredStatusChecksContexts_Original: Anon470 = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Replaces the list of teams that have push access to this branch. This removes all teams that previously had push access and grants push access to the new list of teams. Team restrictions include child teams.
    *
    * | Type    | Description                                                                                                                                |
    * | ------- | ------------------------------------------------------------------------------------------------------------------------------------------ |
    * | `array` | The teams that can have push access. Use the team's `slug`. **Note**: The list of users, apps, and teams in total is limited to 100 items. |
    */
  @JSName("replaceProtectedBranchTeamRestrictions")
  var replaceProtectedBranchTeamRestrictions_Original: Anon471 = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Replaces the list of people that have push access to this branch. This removes all people that previously had push access and grants push access to the new list of people.
    *
    * | Type    | Description                                                                                                                   |
    * | ------- | ----------------------------------------------------------------------------------------------------------------------------- |
    * | `array` | Usernames for people who can have push access. **Note**: The list of users, apps, and teams in total is limited to 100 items. |
    */
  @JSName("replaceProtectedBranchUserRestrictions")
  var replaceProtectedBranchUserRestrictions_Original: Anon472 = js.native
  @JSName("replaceTopics")
  var replaceTopics_Original: Anon473 = js.native
  /**
    * You can request that your site be built from the latest revision on the default branch. This has the same effect as pushing a commit to your default branch, but does not require an additional commit. Manually triggering page builds can be helpful when diagnosing build warnings and failures.
    *
    * Build requests are limited to one concurrent build per repository and one concurrent build per requester. If you request a build while another is still in progress, the second request will be queued until the first completes.
    */
  @JSName("requestPageBuild")
  var requestPageBuild_Original: Anon474 = js.native
  /**
    * This endpoint will return all community profile metrics, including an overall health score, repository description, the presence of documentation, detected code of conduct, detected license, and the presence of ISSUE\_TEMPLATE, PULL\_REQUEST\_TEMPLATE, README, and CONTRIBUTING files.
    */
  @JSName("retrieveCommunityProfileMetrics")
  var retrieveCommunityProfileMetrics_Original: Anon475 = js.native
  /**
    * This will trigger the hook with the latest push to the current repository if the hook is subscribed to `push` events. If the hook is not subscribed to `push` events, the server will respond with 204 but no test POST will be generated.
    *
    * **Note**: Previously `/repos/:owner/:repo/hooks/:hook_id/test`
    */
  @JSName("testPushHook")
  var testPushHook_Original: Anon476 = js.native
  /**
    * A transfer request will need to be accepted by the new owner when transferring a personal repository to another user. The response will contain the original `owner`, and the transfer will continue asynchronously. For more details on the requirements to transfer personal and organization-owned repositories, see [about repository transfers](https://help.github.com/articles/about-repository-transfers/).
    */
  @JSName("transfer")
  var transfer_Original: Anon477 = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Protecting a branch requires admin or owner permissions to the repository.
    *
    * **Note**: Passing new arrays of `users` and `teams` replaces their previous values.
    *
    * **Note**: The list of users, apps, and teams in total is limited to 100 items.
    */
  @JSName("updateBranchProtection")
  var updateBranchProtection_Original: Anon479 = js.native
  @JSName("updateCommitComment")
  var updateCommitComment_Original: Anon480 = js.native
  /**
    * Creates a new file or updates an existing file in a repository.
    * @deprecated octokit.repos.updateFile() has been renamed to octokit.repos.createOrUpdateFile() (2019-06-07)
    */
  @JSName("updateFile")
  var updateFile_Original: Anon481 = js.native
  @JSName("updateHook")
  var updateHook_Original: Anon482 = js.native
  @JSName("updateInformationAboutPagesSite")
  var updateInformationAboutPagesSite_Original: Anon483 = js.native
  @JSName("updateInvitation")
  var updateInvitation_Original: Anon484 = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Updating pull request review enforcement requires admin or owner permissions to the repository and branch protection to be enabled.
    *
    * **Note**: Passing new arrays of `users` and `teams` replaces their previous values.
    */
  @JSName("updateProtectedBranchPullRequestReviewEnforcement")
  var updateProtectedBranchPullRequestReviewEnforcement_Original: Anon485 = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Updating required status checks requires admin or owner permissions to the repository and branch protection to be enabled.
    */
  @JSName("updateProtectedBranchRequiredStatusChecks")
  var updateProtectedBranchRequiredStatusChecks_Original: Anon486 = js.native
  /**
    * Users with push access to the repository can edit a release asset.
    */
  @JSName("updateReleaseAsset")
  var updateReleaseAsset_Original: Anon488 = js.native
  /**
    * Users with push access to the repository can edit a release.
    */
  @JSName("updateRelease")
  var updateRelease_Original: Anon487 = js.native
  /**
    * **Note**: To edit a repository's topics, use the [`topics` endpoint](https://developer.github.com/v3/repos/#replace-all-topics-for-a-repository).
    */
  @JSName("update")
  var update_Original: Anon478 = js.native
  /**
    * This endpoint makes use of [a Hypermedia relation](https://developer.github.com/v3/#hypermedia) to determine which URL to access. The endpoint you call to upload release assets is specific to your release. Use the `upload_url` returned in the response of the [Create a release endpoint](https://developer.github.com/v3/repos/releases/#create-a-release) to upload a release asset.
    *
    * You need to use an HTTP client which supports [SNI](http://en.wikipedia.org/wiki/Server_Name_Indication) to make calls to this endpoint.
    *
    * Most libraries will set the required `Content-Length` header automatically. Use the required `Content-Type` header to provide the media type of the asset. For a list of media types, see [Media Types](https://www.iana.org/assignments/media-types/media-types.xhtml). For example:
    *
    * `application/zip`
    *
    * GitHub expects the asset data in its raw binary form, rather than JSON. You will send the raw binary content of the asset as the request body. Everything else about the endpoint is the same as the rest of the API. For example, you'll still need to pass your authentication to be able to upload an asset.
    */
  @JSName("uploadReleaseAsset")
  var uploadReleaseAsset_Original: Anon489 = js.native
  def acceptInvitation(): js.Promise[AnyResponse] = js.native
  def acceptInvitation(params: RequestOptions with ReposAcceptInvitationParams): js.Promise[AnyResponse] = js.native
  /**
    * This endpoint triggers [notifications](https://help.github.com/articles/about-notifications/). Creating content too quickly using this endpoint may result in abuse rate limiting. See "[Abuse rate limits](https://developer.github.com/v3/#abuse-rate-limits)" and "[Dealing with abuse rate limits](https://developer.github.com/v3/guides/best-practices-for-integrators/#dealing-with-abuse-rate-limits)" for details.
    *
    * Note that, if you choose not to pass any parameters, you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://developer.github.com/v3/#http-verbs)."
    *
    * The invitee will receive a notification that they have been invited to the repository, which they must accept or decline. They may do this via the notifications page, the email they receive, or by using the [repository invitations API endpoints](https://developer.github.com/v3/repos/invitations/).
    *
    * **Rate limits**
    *
    * To prevent abuse, you are limited to sending 50 invitations to a repository per 24 hour period. Note there is no limit if you are inviting organization members to an organization repository.
    */
  def addCollaborator(): js.Promise[Response[ReposAddCollaboratorResponse]] = js.native
  def addCollaborator(params: RequestOptions with ReposAddCollaboratorParams): js.Promise[Response[ReposAddCollaboratorResponse]] = js.native
  /**
    * Here's how you can create a read-only deploy key:
    */
  def addDeployKey(): js.Promise[Response[ReposAddDeployKeyResponse]] = js.native
  def addDeployKey(params: RequestOptions with ReposAddDeployKeyParams): js.Promise[Response[ReposAddDeployKeyResponse]] = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Adding admin enforcement requires admin or owner permissions to the repository and branch protection to be enabled.
    */
  def addProtectedBranchAdminEnforcement(): js.Promise[Response[ReposAddProtectedBranchAdminEnforcementResponse]] = js.native
  def addProtectedBranchAdminEnforcement(params: RequestOptions with ReposAddProtectedBranchAdminEnforcementParams): js.Promise[Response[ReposAddProtectedBranchAdminEnforcementResponse]] = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Grants the specified apps push access for this branch. Only installed GitHub Apps with `write` access to the `contents` permission can be added as authorized actors on a protected branch.
    *
    * | Type    | Description                                                                                                                                                |
    * | ------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------- |
    * | `array` | The GitHub Apps that have push access to this branch. Use the app's `slug`. **Note**: The list of users, apps, and teams in total is limited to 100 items. |
    */
  def addProtectedBranchAppRestrictions(): js.Promise[Response[ReposAddProtectedBranchAppRestrictionsResponse]] = js.native
  def addProtectedBranchAppRestrictions(params: RequestOptions with ReposAddProtectedBranchAppRestrictionsParams): js.Promise[Response[ReposAddProtectedBranchAppRestrictionsResponse]] = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * When authenticated with admin or owner permissions to the repository, you can use this endpoint to require signed commits on a branch. You must enable branch protection to require signed commits.
    */
  def addProtectedBranchRequiredSignatures(): js.Promise[Response[ReposAddProtectedBranchRequiredSignaturesResponse]] = js.native
  def addProtectedBranchRequiredSignatures(params: RequestOptions with ReposAddProtectedBranchRequiredSignaturesParams): js.Promise[Response[ReposAddProtectedBranchRequiredSignaturesResponse]] = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    */
  def addProtectedBranchRequiredStatusChecksContexts(): js.Promise[Response[ReposAddProtectedBranchRequiredStatusChecksContextsResponse]] = js.native
  def addProtectedBranchRequiredStatusChecksContexts(params: RequestOptions with ReposAddProtectedBranchRequiredStatusChecksContextsParams): js.Promise[Response[ReposAddProtectedBranchRequiredStatusChecksContextsResponse]] = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Grants the specified teams push access for this branch. You can also give push access to child teams.
    *
    * | Type    | Description                                                                                                                                |
    * | ------- | ------------------------------------------------------------------------------------------------------------------------------------------ |
    * | `array` | The teams that can have push access. Use the team's `slug`. **Note**: The list of users, apps, and teams in total is limited to 100 items. |
    */
  def addProtectedBranchTeamRestrictions(): js.Promise[Response[ReposAddProtectedBranchTeamRestrictionsResponse]] = js.native
  def addProtectedBranchTeamRestrictions(params: RequestOptions with ReposAddProtectedBranchTeamRestrictionsParams): js.Promise[Response[ReposAddProtectedBranchTeamRestrictionsResponse]] = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Grants the specified people push access for this branch.
    *
    * | Type    | Description                                                                                                                   |
    * | ------- | ----------------------------------------------------------------------------------------------------------------------------- |
    * | `array` | Usernames for people who can have push access. **Note**: The list of users, apps, and teams in total is limited to 100 items. |
    */
  def addProtectedBranchUserRestrictions(): js.Promise[Response[ReposAddProtectedBranchUserRestrictionsResponse]] = js.native
  def addProtectedBranchUserRestrictions(params: RequestOptions with ReposAddProtectedBranchUserRestrictionsParams): js.Promise[Response[ReposAddProtectedBranchUserRestrictionsResponse]] = js.native
  /**
    * For organization-owned repositories, the list of collaborators includes outside collaborators, organization members that are direct collaborators, organization members with access through team memberships, organization members with access through default organization permissions, and organization owners.
    *
    * Team members will include the members of child teams.
    */
  def checkCollaborator(): js.Promise[AnyResponse] = js.native
  def checkCollaborator(params: RequestOptions with ReposCheckCollaboratorParams): js.Promise[AnyResponse] = js.native
  /**
    * Shows whether vulnerability alerts are enabled or disabled for a repository. The authenticated user must have admin access to the repository. For more information, see "[About security alerts for vulnerable dependencies](https://help.github.com/en/articles/about-security-alerts-for-vulnerable-dependencies)" in the GitHub Help documentation.
    */
  def checkVulnerabilityAlerts(): js.Promise[AnyResponse] = js.native
  def checkVulnerabilityAlerts(params: RequestOptions with ReposCheckVulnerabilityAlertsParams): js.Promise[AnyResponse] = js.native
  /**
    * Both `:base` and `:head` must be branch names in `:repo`. To compare branches across other repositories in the same network as `:repo`, use the format `<USERNAME>:branch`.
    *
    * The response from the API is equivalent to running the `git log base..head` command; however, commits are returned in chronological order. Pass the appropriate [media type](https://developer.github.com/v3/media/#commits-commit-comparison-and-pull-requests) to fetch diff and patch formats.
    *
    * The response also includes details on the files that were changed between the two commits. This includes the status of the change (for example, if a file was added, removed, modified, or renamed), and details of the change itself. For example, files with a `renamed` status have a `previous_filename` field showing the previous filename of the file, and files with a `modified` status have a `patch` field showing the changes made to the file.
    *
    * **Working with large comparisons**
    *
    * The response will include a comparison of up to 250 commits. If you are working with a larger commit range, you can use the [Commit List API](https://developer.github.com/v3/repos/commits/#list-commits-on-a-repository) to enumerate all commits in the range.
    *
    * For comparisons with extremely large diffs, you may receive an error response indicating that the diff took too long to generate. You can typically resolve this error by using a smaller commit range.
    *
    * **Signature verification object**
    *
    * The response will include a `verification` object that describes the result of verifying the commit's signature. The following fields are included in the `verification` object:
    *
    * These are the possible values for `reason` in the `verification` object:
    *
    * | Value                    | Description                                                                                                                       |
    * | ------------------------ | --------------------------------------------------------------------------------------------------------------------------------- |
    * | `expired_key`            | The key that made the signature is expired.                                                                                       |
    * | `not_signing_key`        | The "signing" flag is not among the usage flags in the GPG key that made the signature.                                           |
    * | `gpgverify_error`        | There was an error communicating with the signature verification service.                                                         |
    * | `gpgverify_unavailable`  | The signature verification service is currently unavailable.                                                                      |
    * | `unsigned`               | The object does not include a signature.                                                                                          |
    * | `unknown_signature_type` | A non-PGP signature was found in the commit.                                                                                      |
    * | `no_user`                | No user was associated with the `committer` email address in the commit.                                                          |
    * | `unverified_email`       | The `committer` email address in the commit was associated with a user, but the email address is not verified on her/his account. |
    * | `bad_email`              | The `committer` email address in the commit is not included in the identities of the PGP key that made the signature.             |
    * | `unknown_key`            | The key that made the signature has not been registered with any user's account.                                                  |
    * | `malformed_signature`    | There was an error parsing the signature.                                                                                         |
    * | `invalid`                | The signature could not be cryptographically verified using the key whose key-id was found in the signature.                      |
    * | `valid`                  | None of the above errors applied, so the signature is considered to be verified.                                                  |
    */
  def compareCommits(): js.Promise[Response[ReposCompareCommitsResponse]] = js.native
  def compareCommits(params: RequestOptions with ReposCompareCommitsParams): js.Promise[Response[ReposCompareCommitsResponse]] = js.native
  /**
    * Create a comment for a commit using its `:commit_sha`.
    *
    * This endpoint triggers [notifications](https://help.github.com/articles/about-notifications/). Creating content too quickly using this endpoint may result in abuse rate limiting. See "[Abuse rate limits](https://developer.github.com/v3/#abuse-rate-limits)" and "[Dealing with abuse rate limits](https://developer.github.com/v3/guides/best-practices-for-integrators/#dealing-with-abuse-rate-limits)" for details.
    */
  def createCommitComment(): js.Promise[Response[ReposCreateCommitCommentResponse]] = js.native
  def createCommitComment(
    params: RequestOptions with ReposCreateCommitCommentParamsDeprecatedSha with ReposCreateCommitCommentParamsDeprecatedLine with ReposCreateCommitCommentParams
  ): js.Promise[Response[ReposCreateCommitCommentResponse]] = js.native
  /**
    * Deployments offer a few configurable parameters with sane defaults.
    *
    * The `ref` parameter can be any named branch, tag, or SHA. At GitHub we often deploy branches and verify them before we merge a pull request.
    *
    * The `environment` parameter allows deployments to be issued to different runtime environments. Teams often have multiple environments for verifying their applications, such as `production`, `staging`, and `qa`. This parameter makes it easier to track which environments have requested deployments. The default environment is `production`.
    *
    * The `auto_merge` parameter is used to ensure that the requested ref is not behind the repository's default branch. If the ref _is_ behind the default branch for the repository, we will attempt to merge it for you. If the merge succeeds, the API will return a successful merge commit. If merge conflicts prevent the merge from succeeding, the API will return a failure response.
    *
    * By default, [commit statuses](https://developer.github.com/v3/repos/statuses) for every submitted context must be in a `success` state. The `required_contexts` parameter allows you to specify a subset of contexts that must be `success`, or to specify contexts that have not yet been submitted. You are not required to use commit statuses to deploy. If you do not require any contexts or create any commit statuses, the deployment will always succeed.
    *
    * The `payload` parameter is available for any extra information that a deployment system might need. It is a JSON text field that will be passed on when a deployment event is dispatched.
    *
    * The `task` parameter is used by the deployment system to allow different execution paths. In the web world this might be `deploy:migrations` to run schema changes on the system. In the compiled world this could be a flag to compile an application with debugging enabled.
    *
    * Users with `repo` or `repo_deployment` scopes can create a deployment for a given ref:
    *
    * A simple example putting the user and room into the payload to notify back to chat networks.
    *
    * A more advanced example specifying required commit statuses and bypassing auto-merging.
    *
    * You will see this response when GitHub automatically merges the base branch into the topic branch instead of creating a deployment. This auto-merge happens when:
    *
    * *   Auto-merge option is enabled in the repository
    * *   Topic branch does not include the latest changes on the base branch, which is `master`in the response example
    * *   There are no merge conflicts
    *
    * If there are no new commits in the base branch, a new request to create a deployment should give a successful response.
    *
    * This error happens when the `auto_merge` option is enabled and when the default branch (in this case `master`), can't be merged into the branch that's being deployed (in this case `topic-branch`), due to merge conflicts.
    *
    * This error happens when the `required_contexts` parameter indicates that one or more contexts need to have a `success` status for the commit to be deployed, but one or more of the required contexts do not have a state of `success`.
    */
  def createDeployment(): js.Promise[Response[ReposCreateDeploymentResponse]] = js.native
  def createDeployment(params: RequestOptions with ReposCreateDeploymentParams): js.Promise[Response[ReposCreateDeploymentResponse]] = js.native
  /**
    * Users with `push` access can create deployment statuses for a given deployment.
    *
    * GitHub Apps require `read & write` access to "Deployments" and `read-only` access to "Repo contents" (for private repos). OAuth Apps require the `repo_deployment` scope.
    */
  def createDeploymentStatus(): js.Promise[Response[ReposCreateDeploymentStatusResponse]] = js.native
  def createDeploymentStatus(params: RequestOptions with ReposCreateDeploymentStatusParams): js.Promise[Response[ReposCreateDeploymentStatusResponse]] = js.native
  /**
    * You can use this endpoint to trigger a webhook event called `repository_dispatch` when you want activity that happens outside of GitHub to trigger a GitHub Actions workflow or GitHub App webhook. You must configure your GitHub Actions workflow or GitHub App to run when the `repository_dispatch` event occurs. For an example `repository_dispatch` webhook payload, see "[RepositoryDispatchEvent](https://developer.github.com/v3/activity/events/types/#repositorydispatchevent)."
    *
    * The `client_payload` parameter is available for any extra information that your workflow might need. This parameter is a JSON payload that will be passed on when the webhook event is dispatched. For example, the `client_payload` can include a message that a user would like to send using a GitHub Actions workflow. Or the `client_payload` can be used as a test to debug your workflow. For a test example, see the [input example](https://developer.github.com/v3/repos/#example-4).
    *
    * To give you write access to the repository, you must use a personal access token with the `repo` scope. For more information, see "[Creating a personal access token for the command line](https://help.github.com/articles/creating-a-personal-access-token-for-the-command-line)" in the GitHub Help documentation.
    *
    * This input example shows how you can use the `client_payload` as a test to debug your workflow.
    */
  def createDispatchEvent(): js.Promise[AnyResponse] = js.native
  def createDispatchEvent(params: RequestOptions with ReposCreateDispatchEventParams): js.Promise[AnyResponse] = js.native
  /**
    * Creates a new file or updates an existing file in a repository.
    * @deprecated octokit.repos.createFile() has been renamed to octokit.repos.createOrUpdateFile() (2019-06-07)
    */
  def createFile(): js.Promise[Response[ReposCreateFileResponse]] = js.native
  def createFile(params: RequestOptions with ReposCreateFileParams): js.Promise[Response[ReposCreateFileResponse]] = js.native
  /**
    * Creates a new repository for the authenticated user.
    *
    * **OAuth scope requirements**
    *
    * When using [OAuth](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/), authorizations must include:
    *
    * *   `public_repo` scope or `repo` scope to create a public repository
    * *   `repo` scope to create a private repository
    */
  def createForAuthenticatedUser(): js.Promise[Response[ReposCreateForAuthenticatedUserResponse]] = js.native
  def createForAuthenticatedUser(params: RequestOptions with ReposCreateForAuthenticatedUserParams): js.Promise[Response[ReposCreateForAuthenticatedUserResponse]] = js.native
  /**
    * Create a fork for the authenticated user.
    *
    * **Note**: Forking a Repository happens asynchronously. You may have to wait a short period of time before you can access the git objects. If this takes longer than 5 minutes, be sure to contact [GitHub Support](https://github.com/contact) or [GitHub Premium Support](https://premium.githubsupport.com).
    */
  def createFork(): js.Promise[Response[ReposCreateForkResponse]] = js.native
  def createFork(params: RequestOptions with ReposCreateForkParams): js.Promise[Response[ReposCreateForkResponse]] = js.native
  /**
    * Repositories can have multiple webhooks installed. Each webhook should have a unique `config`. Multiple webhooks can share the same `config` as long as those webhooks do not have any `events` that overlap.
    *
    * Here's how you can create a hook that posts payloads in JSON format:
    */
  def createHook(): js.Promise[Response[ReposCreateHookResponse]] = js.native
  def createHook(params: RequestOptions with ReposCreateHookParams): js.Promise[Response[ReposCreateHookResponse]] = js.native
  /**
    * Creates a new repository for the authenticated user.
    *
    * **OAuth scope requirements**
    *
    * When using [OAuth](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/), authorizations must include:
    *
    * *   `public_repo` scope or `repo` scope to create a public repository
    * *   `repo` scope to create a private repository
    */
  def createInOrg(): js.Promise[Response[ReposCreateInOrgResponse]] = js.native
  def createInOrg(params: RequestOptions with ReposCreateInOrgParams): js.Promise[Response[ReposCreateInOrgResponse]] = js.native
  /**
    * Creates a new file or updates an existing file in a repository.
    */
  def createOrUpdateFile(): js.Promise[Response[ReposCreateOrUpdateFileResponse]] = js.native
  def createOrUpdateFile(params: RequestOptions with ReposCreateOrUpdateFileParams): js.Promise[Response[ReposCreateOrUpdateFileResponse]] = js.native
  /**
    * Users with push access to the repository can create a release.
    *
    * This endpoint triggers [notifications](https://help.github.com/articles/about-notifications/). Creating content too quickly using this endpoint may result in abuse rate limiting. See "[Abuse rate limits](https://developer.github.com/v3/#abuse-rate-limits)" and "[Dealing with abuse rate limits](https://developer.github.com/v3/guides/best-practices-for-integrators/#dealing-with-abuse-rate-limits)" for details.
    */
  def createRelease(): js.Promise[Response[ReposCreateReleaseResponse]] = js.native
  def createRelease(params: RequestOptions with ReposCreateReleaseParams): js.Promise[Response[ReposCreateReleaseResponse]] = js.native
  /**
    * Users with push access in a repository can create commit statuses for a given SHA.
    *
    * Note: there is a limit of 1000 statuses per `sha` and `context` within a repository. Attempts to create more than 1000 statuses will result in a validation error.
    */
  def createStatus(): js.Promise[Response[ReposCreateStatusResponse]] = js.native
  def createStatus(params: RequestOptions with ReposCreateStatusParams): js.Promise[Response[ReposCreateStatusResponse]] = js.native
  /**
    * Creates a new repository using a repository template. Use the `template_owner` and `template_repo` route parameters to specify the repository to use as the template. The authenticated user must own or be a member of an organization that owns the repository. To check if a repository is available to use as a template, get the repository's information using the [`GET /repos/:owner/:repo`](https://developer.github.com/v3/repos/#get) endpoint and check that the `is_template` key is `true`.
    *
    * **OAuth scope requirements**
    *
    * When using [OAuth](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/), authorizations must include:
    *
    * *   `public_repo` scope or `repo` scope to create a public repository
    * *   `repo` scope to create a private repository
    *
    * \`
    */
  def createUsingTemplate(): js.Promise[Response[ReposCreateUsingTemplateResponse]] = js.native
  def createUsingTemplate(params: RequestOptions with ReposCreateUsingTemplateParams): js.Promise[Response[ReposCreateUsingTemplateResponse]] = js.native
  def declineInvitation(): js.Promise[AnyResponse] = js.native
  def declineInvitation(params: RequestOptions with ReposDeclineInvitationParams): js.Promise[AnyResponse] = js.native
  /**
    * Deleting a repository requires admin access. If OAuth is used, the `delete_repo` scope is required.
    *
    * If an organization owner has configured the organization to prevent members from deleting organization-owned repositories, a member will get this response:
    */
  def delete(): js.Promise[Response[ReposDeleteResponse]] = js.native
  def delete(params: RequestOptions with ReposDeleteParams): js.Promise[Response[ReposDeleteResponse]] = js.native
  def deleteCommitComment(): js.Promise[AnyResponse] = js.native
  def deleteCommitComment(params: RequestOptions with ReposDeleteCommitCommentParams): js.Promise[AnyResponse] = js.native
  def deleteDownload(): js.Promise[AnyResponse] = js.native
  def deleteDownload(params: RequestOptions with ReposDeleteDownloadParams): js.Promise[AnyResponse] = js.native
  /**
    * Deletes a file in a repository.
    *
    * You can provide an additional `committer` parameter, which is an object containing information about the committer. Or, you can provide an `author` parameter, which is an object containing information about the author.
    *
    * The `author` section is optional and is filled in with the `committer` information if omitted. If the `committer` information is omitted, the authenticated user's information is used.
    *
    * You must provide values for both `name` and `email`, whether you choose to use `author` or `committer`. Otherwise, you'll receive a `422` status code.
    */
  def deleteFile(): js.Promise[Response[ReposDeleteFileResponse]] = js.native
  def deleteFile(params: RequestOptions with ReposDeleteFileParams): js.Promise[Response[ReposDeleteFileResponse]] = js.native
  def deleteHook(): js.Promise[AnyResponse] = js.native
  def deleteHook(params: RequestOptions with ReposDeleteHookParams): js.Promise[AnyResponse] = js.native
  def deleteInvitation(): js.Promise[AnyResponse] = js.native
  def deleteInvitation(params: RequestOptions with ReposDeleteInvitationParams): js.Promise[AnyResponse] = js.native
  /**
    * Users with push access to the repository can delete a release.
    */
  def deleteRelease(): js.Promise[AnyResponse] = js.native
  def deleteRelease(params: RequestOptions with ReposDeleteReleaseParams): js.Promise[AnyResponse] = js.native
  def deleteReleaseAsset(): js.Promise[AnyResponse] = js.native
  def deleteReleaseAsset(params: RequestOptions with ReposDeleteReleaseAssetParams): js.Promise[AnyResponse] = js.native
  /**
    * Disables automated security fixes for a repository. The authenticated user must have admin access to the repository. For more information, see "[Configuring automated security fixes](https://help.github.com/en/articles/configuring-automated-security-fixes)" in the GitHub Help documentation.
    */
  def disableAutomatedSecurityFixes(): js.Promise[AnyResponse] = js.native
  def disableAutomatedSecurityFixes(params: RequestOptions with ReposDisableAutomatedSecurityFixesParams): js.Promise[AnyResponse] = js.native
  def disablePagesSite(): js.Promise[AnyResponse] = js.native
  def disablePagesSite(params: RequestOptions with ReposDisablePagesSiteParams): js.Promise[AnyResponse] = js.native
  /**
    * Disables vulnerability alerts and the dependency graph for a repository. The authenticated user must have admin access to the repository. For more information, see "[About security alerts for vulnerable dependencies](https://help.github.com/en/articles/about-security-alerts-for-vulnerable-dependencies)" in the GitHub Help documentation.
    */
  def disableVulnerabilityAlerts(): js.Promise[AnyResponse] = js.native
  def disableVulnerabilityAlerts(params: RequestOptions with ReposDisableVulnerabilityAlertsParams): js.Promise[AnyResponse] = js.native
  /**
    * Enables automated security fixes for a repository. The authenticated user must have admin access to the repository. For more information, see "[Configuring automated security fixes](https://help.github.com/en/articles/configuring-automated-security-fixes)" in the GitHub Help documentation.
    */
  def enableAutomatedSecurityFixes(): js.Promise[AnyResponse] = js.native
  def enableAutomatedSecurityFixes(params: RequestOptions with ReposEnableAutomatedSecurityFixesParams): js.Promise[AnyResponse] = js.native
  def enablePagesSite(): js.Promise[Response[ReposEnablePagesSiteResponse]] = js.native
  def enablePagesSite(params: RequestOptions with ReposEnablePagesSiteParams): js.Promise[Response[ReposEnablePagesSiteResponse]] = js.native
  /**
    * Enables vulnerability alerts and the dependency graph for a repository. The authenticated user must have admin access to the repository. For more information, see "[About security alerts for vulnerable dependencies](https://help.github.com/en/articles/about-security-alerts-for-vulnerable-dependencies)" in the GitHub Help documentation.
    */
  def enableVulnerabilityAlerts(): js.Promise[AnyResponse] = js.native
  def enableVulnerabilityAlerts(params: RequestOptions with ReposEnableVulnerabilityAlertsParams): js.Promise[AnyResponse] = js.native
  /**
    * The `parent` and `source` objects are present when the repository is a fork. `parent` is the repository this repository was forked from, `source` is the ultimate source for the network.
    */
  def get(): js.Promise[Response[ReposGetResponse]] = js.native
  def get(params: RequestOptions with ReposGetParams): js.Promise[Response[ReposGetResponse]] = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Lists the GitHub Apps that have push access to this branch. Only installed GitHub Apps with `write` access to the `contents` permission can be added as authorized actors on a protected branch.
    */
  def getAppsWithAccessToProtectedBranch(): js.Promise[Response[ReposGetAppsWithAccessToProtectedBranchResponse]] = js.native
  def getAppsWithAccessToProtectedBranch(params: RequestOptions with ReposGetAppsWithAccessToProtectedBranchParams): js.Promise[Response[ReposGetAppsWithAccessToProtectedBranchResponse]] = js.native
  /**
    * Gets a redirect URL to download an archive for a repository. The `:archive_format` can be either `tarball` or `zipball`. The `:ref` must be a valid Git reference. If you omit `:ref`, the repository’s default branch (usually `master`) will be used. Please make sure your HTTP framework is configured to follow redirects or you will need to use the `Location` header to make a second `GET` request.
    *
    * _Note_: For private repositories, these links are temporary and expire after five minutes.
    *
    * To follow redirects with curl, use the `-L` switch:
    */
  def getArchiveLink(): js.Promise[AnyResponse] = js.native
  def getArchiveLink(params: RequestOptions with ReposGetArchiveLinkParams): js.Promise[AnyResponse] = js.native
  def getBranch(): js.Promise[Response[ReposGetBranchResponse]] = js.native
  def getBranch(params: RequestOptions with ReposGetBranchParams): js.Promise[Response[ReposGetBranchResponse]] = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    */
  def getBranchProtection(): js.Promise[Response[ReposGetBranchProtectionResponse]] = js.native
  def getBranchProtection(params: RequestOptions with ReposGetBranchProtectionParams): js.Promise[Response[ReposGetBranchProtectionResponse]] = js.native
  /**
    * Get the total number of clones and breakdown per day or week for the last 14 days. Timestamps are aligned to UTC midnight of the beginning of the day or week. Week begins on Monday.
    */
  def getClones(): js.Promise[Response[ReposGetClonesResponse]] = js.native
  def getClones(params: RequestOptions with ReposGetClonesParams): js.Promise[Response[ReposGetClonesResponse]] = js.native
  /**
    * Returns a weekly aggregate of the number of additions and deletions pushed to a repository.
    */
  def getCodeFrequencyStats(): js.Promise[Response[ReposGetCodeFrequencyStatsResponse]] = js.native
  def getCodeFrequencyStats(params: RequestOptions with ReposGetCodeFrequencyStatsParams): js.Promise[Response[ReposGetCodeFrequencyStatsResponse]] = js.native
  /**
    * Possible values for the `permission` key: `admin`, `write`, `read`, `none`.
    */
  def getCollaboratorPermissionLevel(): js.Promise[Response[ReposGetCollaboratorPermissionLevelResponse]] = js.native
  def getCollaboratorPermissionLevel(params: RequestOptions with ReposGetCollaboratorPermissionLevelParams): js.Promise[Response[ReposGetCollaboratorPermissionLevelResponse]] = js.native
  /**
    * Users with pull access in a repository can access a combined view of commit statuses for a given ref. The ref can be a SHA, a branch name, or a tag name.
    *
    * The most recent status for each context is returned, up to 100. This field [paginates](https://developer.github.com/v3/#pagination) if there are over 100 contexts.
    *
    * Additionally, a combined `state` is returned. The `state` is one of:
    *
    * *   **failure** if any of the contexts report as `error` or `failure`
    * *   **pending** if there are no statuses or a context is `pending`
    * *   **success** if the latest status for all contexts is `success`
    */
  def getCombinedStatusForRef(): js.Promise[Response[ReposGetCombinedStatusForRefResponse]] = js.native
  def getCombinedStatusForRef(params: RequestOptions with ReposGetCombinedStatusForRefParams): js.Promise[Response[ReposGetCombinedStatusForRefResponse]] = js.native
  /**
    * Returns the contents of a single commit reference. You must have `read` access for the repository to use this endpoint.
    *
    * You can pass the appropriate [media type](https://developer.github.com/v3/media/#commits-commit-comparison-and-pull-requests) to fetch `diff` and `patch` formats. Diffs with binary data will have no `patch` property.
    *
    * To return only the SHA-1 hash of the commit reference, you can provide the `sha` custom [media type](https://developer.github.com/v3/media/#commits-commit-comparison-and-pull-requests) in the `Accept` header. You can use this endpoint to check if a remote reference's SHA-1 hash is the same as your local reference's SHA-1 hash by providing the local SHA-1 reference as the ETag.
    *
    * **Signature verification object**
    *
    * The response will include a `verification` object that describes the result of verifying the commit's signature. The following fields are included in the `verification` object:
    *
    * These are the possible values for `reason` in the `verification` object:
    *
    * | Value                    | Description                                                                                                                       |
    * | ------------------------ | --------------------------------------------------------------------------------------------------------------------------------- |
    * | `expired_key`            | The key that made the signature is expired.                                                                                       |
    * | `not_signing_key`        | The "signing" flag is not among the usage flags in the GPG key that made the signature.                                           |
    * | `gpgverify_error`        | There was an error communicating with the signature verification service.                                                         |
    * | `gpgverify_unavailable`  | The signature verification service is currently unavailable.                                                                      |
    * | `unsigned`               | The object does not include a signature.                                                                                          |
    * | `unknown_signature_type` | A non-PGP signature was found in the commit.                                                                                      |
    * | `no_user`                | No user was associated with the `committer` email address in the commit.                                                          |
    * | `unverified_email`       | The `committer` email address in the commit was associated with a user, but the email address is not verified on her/his account. |
    * | `bad_email`              | The `committer` email address in the commit is not included in the identities of the PGP key that made the signature.             |
    * | `unknown_key`            | The key that made the signature has not been registered with any user's account.                                                  |
    * | `malformed_signature`    | There was an error parsing the signature.                                                                                         |
    * | `invalid`                | The signature could not be cryptographically verified using the key whose key-id was found in the signature.                      |
    * | `valid`                  | None of the above errors applied, so the signature is considered to be verified.                                                  |
    */
  def getCommit(): js.Promise[Response[ReposGetCommitResponse]] = js.native
  def getCommit(
    params: RequestOptions with ReposGetCommitParamsDeprecatedSha with ReposGetCommitParamsDeprecatedCommitSha with ReposGetCommitParams
  ): js.Promise[Response[ReposGetCommitResponse]] = js.native
  /**
    * Returns the last year of commit activity grouped by week. The `days` array is a group of commits per day, starting on `Sunday`.
    */
  def getCommitActivityStats(): js.Promise[Response[ReposGetCommitActivityStatsResponse]] = js.native
  def getCommitActivityStats(params: RequestOptions with ReposGetCommitActivityStatsParams): js.Promise[Response[ReposGetCommitActivityStatsResponse]] = js.native
  def getCommitComment(): js.Promise[Response[ReposGetCommitCommentResponse]] = js.native
  def getCommitComment(params: RequestOptions with ReposGetCommitCommentParams): js.Promise[Response[ReposGetCommitCommentResponse]] = js.native
  /**
    * **Note:** To access this endpoint, you must provide a custom [media type](https://developer.github.com/v3/media) in the `Accept` header:
    * ```
    * application/vnd.github.VERSION.sha
    * ```
    * Returns the SHA-1 of the commit reference. You must have `read` access for the repository to get the SHA-1 of a commit reference. You can use this endpoint to check if a remote reference's SHA-1 is the same as your local reference's SHA-1 by providing the local SHA-1 reference as the ETag.
    * @deprecated "Get the SHA-1 of a commit reference" will be removed. Use "Get a single commit" instead with media type format set to "sha" instead.
    */
  def getCommitRefSha(): js.Promise[AnyResponse] = js.native
  def getCommitRefSha(params: RequestOptions with ReposGetCommitRefShaParams): js.Promise[AnyResponse] = js.native
  /**
    * Gets the contents of a file or directory in a repository. Specify the file path or directory in `:path`. If you omit `:path`, you will receive the contents of all files in the repository.
    *
    * Files and symlinks support [a custom media type](https://developer.github.com/v3/repos/contents/#custom-media-types) for retrieving the raw content or rendered HTML (when supported). All content types support [a custom media type](https://developer.github.com/v3/repos/contents/#custom-media-types) to ensure the content is returned in a consistent object format.
    *
    * **Note**:
    *
    * *   To get a repository's contents recursively, you can [recursively get the tree](https://developer.github.com/v3/git/trees/).
    * *   This API has an upper limit of 1,000 files for a directory. If you need to retrieve more files, use the [Git Trees API](https://developer.github.com/v3/git/trees/#get-a-tree).
    * *   This API supports files up to 1 megabyte in size.
    *
    * The response will be an array of objects, one object for each item in the directory.
    *
    * When listing the contents of a directory, submodules have their "type" specified as "file". Logically, the value _should_ be "submodule". This behavior exists in API v3 [for backwards compatibility purposes](https://git.io/v1YCW). In the next major version of the API, the type will be returned as "submodule".
    *
    * If the requested `:path` points to a symlink, and the symlink's target is a normal file in the repository, then the API responds with the content of the file (in the [format shown above](https://developer.github.com/v3/repos/contents/#response-if-content-is-a-file)).
    *
    * Otherwise, the API responds with an object describing the symlink itself:
    *
    * The `submodule_git_url` identifies the location of the submodule repository, and the `sha` identifies a specific commit within the submodule repository. Git uses the given URL when cloning the submodule repository, and checks out the submodule at that specific commit.
    *
    * If the submodule repository is not hosted on github.com, the Git URLs (`git_url` and `_links["git"]`) and the github.com URLs (`html_url` and `_links["html"]`) will have null values.
    */
  def getContents(): js.Promise[Response[ReposGetContentsResponse]] = js.native
  def getContents(params: RequestOptions with ReposGetContentsParams): js.Promise[Response[ReposGetContentsResponse]] = js.native
  /**
    * *   `total` - The Total number of commits authored by the contributor.
    *
    * Weekly Hash (`weeks` array):
    *
    * *   `w` - Start of the week, given as a [Unix timestamp](http://en.wikipedia.org/wiki/Unix_time).
    * *   `a` - Number of additions
    * *   `d` - Number of deletions
    * *   `c` - Number of commits
    */
  def getContributorsStats(): js.Promise[Response[ReposGetContributorsStatsResponse]] = js.native
  def getContributorsStats(params: RequestOptions with ReposGetContributorsStatsParams): js.Promise[Response[ReposGetContributorsStatsResponse]] = js.native
  def getDeployKey(): js.Promise[Response[ReposGetDeployKeyResponse]] = js.native
  def getDeployKey(params: RequestOptions with ReposGetDeployKeyParams): js.Promise[Response[ReposGetDeployKeyResponse]] = js.native
  def getDeployment(): js.Promise[Response[ReposGetDeploymentResponse]] = js.native
  def getDeployment(params: RequestOptions with ReposGetDeploymentParams): js.Promise[Response[ReposGetDeploymentResponse]] = js.native
  /**
    * Users with pull access can view a deployment status for a deployment:
    */
  def getDeploymentStatus(): js.Promise[Response[ReposGetDeploymentStatusResponse]] = js.native
  def getDeploymentStatus(params: RequestOptions with ReposGetDeploymentStatusParams): js.Promise[Response[ReposGetDeploymentStatusResponse]] = js.native
  def getDownload(): js.Promise[Response[ReposGetDownloadResponse]] = js.native
  def getDownload(params: RequestOptions with ReposGetDownloadParams): js.Promise[Response[ReposGetDownloadResponse]] = js.native
  def getHook(): js.Promise[Response[ReposGetHookResponse]] = js.native
  def getHook(params: RequestOptions with ReposGetHookParams): js.Promise[Response[ReposGetHookResponse]] = js.native
  def getLatestPagesBuild(): js.Promise[Response[ReposGetLatestPagesBuildResponse]] = js.native
  def getLatestPagesBuild(params: RequestOptions with ReposGetLatestPagesBuildParams): js.Promise[Response[ReposGetLatestPagesBuildResponse]] = js.native
  /**
    * View the latest published full release for the repository.
    *
    * The latest release is the most recent non-prerelease, non-draft release, sorted by the `created_at` attribute. The `created_at` attribute is the date of the commit used for the release, and not the date when the release was drafted or published.
    */
  def getLatestRelease(): js.Promise[Response[ReposGetLatestReleaseResponse]] = js.native
  def getLatestRelease(params: RequestOptions with ReposGetLatestReleaseParams): js.Promise[Response[ReposGetLatestReleaseResponse]] = js.native
  def getPages(): js.Promise[Response[ReposGetPagesResponse]] = js.native
  def getPages(params: RequestOptions with ReposGetPagesParams): js.Promise[Response[ReposGetPagesResponse]] = js.native
  def getPagesBuild(): js.Promise[Response[ReposGetPagesBuildResponse]] = js.native
  def getPagesBuild(params: RequestOptions with ReposGetPagesBuildParams): js.Promise[Response[ReposGetPagesBuildResponse]] = js.native
  /**
    * Returns the total commit counts for the `owner` and total commit counts in `all`. `all` is everyone combined, including the `owner` in the last 52 weeks. If you'd like to get the commit counts for non-owners, you can subtract `owner` from `all`.
    *
    * The array order is oldest week (index 0) to most recent week.
    */
  def getParticipationStats(): js.Promise[Response[ReposGetParticipationStatsResponse]] = js.native
  def getParticipationStats(params: RequestOptions with ReposGetParticipationStatsParams): js.Promise[Response[ReposGetParticipationStatsResponse]] = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    */
  def getProtectedBranchAdminEnforcement(): js.Promise[Response[ReposGetProtectedBranchAdminEnforcementResponse]] = js.native
  def getProtectedBranchAdminEnforcement(params: RequestOptions with ReposGetProtectedBranchAdminEnforcementParams): js.Promise[Response[ReposGetProtectedBranchAdminEnforcementResponse]] = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    */
  def getProtectedBranchPullRequestReviewEnforcement(): js.Promise[Response[ReposGetProtectedBranchPullRequestReviewEnforcementResponse]] = js.native
  def getProtectedBranchPullRequestReviewEnforcement(params: RequestOptions with ReposGetProtectedBranchPullRequestReviewEnforcementParams): js.Promise[Response[ReposGetProtectedBranchPullRequestReviewEnforcementResponse]] = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * When authenticated with admin or owner permissions to the repository, you can use this endpoint to check whether a branch requires signed commits. An enabled status of `true` indicates you must sign commits on this branch. For more information, see [Signing commits with GPG](https://help.github.com/articles/signing-commits-with-gpg) in GitHub Help.
    *
    * **Note**: You must enable branch protection to require signed commits.
    */
  def getProtectedBranchRequiredSignatures(): js.Promise[Response[ReposGetProtectedBranchRequiredSignaturesResponse]] = js.native
  def getProtectedBranchRequiredSignatures(params: RequestOptions with ReposGetProtectedBranchRequiredSignaturesParams): js.Promise[Response[ReposGetProtectedBranchRequiredSignaturesResponse]] = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    */
  def getProtectedBranchRequiredStatusChecks(): js.Promise[Response[ReposGetProtectedBranchRequiredStatusChecksResponse]] = js.native
  def getProtectedBranchRequiredStatusChecks(params: RequestOptions with ReposGetProtectedBranchRequiredStatusChecksParams): js.Promise[Response[ReposGetProtectedBranchRequiredStatusChecksResponse]] = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Lists who has access to this protected branch. {{#note}}
    *
    * **Note**: Users, apps, and teams `restrictions` are only available for organization-owned repositories.
    */
  def getProtectedBranchRestrictions(): js.Promise[Response[ReposGetProtectedBranchRestrictionsResponse]] = js.native
  def getProtectedBranchRestrictions(params: RequestOptions with ReposGetProtectedBranchRestrictionsParams): js.Promise[Response[ReposGetProtectedBranchRestrictionsResponse]] = js.native
  /**
    * Each array contains the day number, hour number, and number of commits:
    *
    * *   `0-6`: Sunday - Saturday
    * *   `0-23`: Hour of day
    * *   Number of commits
    *
    * For example, `[2, 14, 25]` indicates that there were 25 total commits, during the 2:00pm hour on Tuesdays. All times are based on the time zone of individual commits.
    */
  def getPunchCardStats(): js.Promise[Response[ReposGetPunchCardStatsResponse]] = js.native
  def getPunchCardStats(params: RequestOptions with ReposGetPunchCardStatsParams): js.Promise[Response[ReposGetPunchCardStatsResponse]] = js.native
  /**
    * Gets the preferred README for a repository.
    *
    * READMEs support [custom media types](https://developer.github.com/v3/repos/contents/#custom-media-types) for retrieving the raw content or rendered HTML.
    */
  def getReadme(): js.Promise[Response[ReposGetReadmeResponse]] = js.native
  def getReadme(params: RequestOptions with ReposGetReadmeParams): js.Promise[Response[ReposGetReadmeResponse]] = js.native
  /**
    * **Note:** This returns an `upload_url` key corresponding to the endpoint for uploading release assets. This key is a [hypermedia resource](https://developer.github.com/v3/#hypermedia).
    */
  def getRelease(): js.Promise[Response[ReposGetReleaseResponse]] = js.native
  def getRelease(params: RequestOptions with ReposGetReleaseParams): js.Promise[Response[ReposGetReleaseResponse]] = js.native
  /**
    * To download the asset's binary content, set the `Accept` header of the request to [`application/octet-stream`](https://developer.github.com/v3/media/#media-types). The API will either redirect the client to the location, or stream it directly if possible. API clients should handle both a `200` or `302` response.
    */
  def getReleaseAsset(): js.Promise[Response[ReposGetReleaseAssetResponse]] = js.native
  def getReleaseAsset(params: RequestOptions with ReposGetReleaseAssetParams): js.Promise[Response[ReposGetReleaseAssetResponse]] = js.native
  /**
    * Get a published release with the specified tag.
    */
  def getReleaseByTag(): js.Promise[Response[ReposGetReleaseByTagResponse]] = js.native
  def getReleaseByTag(params: RequestOptions with ReposGetReleaseByTagParams): js.Promise[Response[ReposGetReleaseByTagResponse]] = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Lists the teams who have push access to this branch. The list includes child teams.
    */
  def getTeamsWithAccessToProtectedBranch(): js.Promise[Response[ReposGetTeamsWithAccessToProtectedBranchResponse]] = js.native
  def getTeamsWithAccessToProtectedBranch(params: RequestOptions with ReposGetTeamsWithAccessToProtectedBranchParams): js.Promise[Response[ReposGetTeamsWithAccessToProtectedBranchResponse]] = js.native
  /**
    * Get the top 10 popular contents over the last 14 days.
    */
  def getTopPaths(): js.Promise[Response[ReposGetTopPathsResponse]] = js.native
  def getTopPaths(params: RequestOptions with ReposGetTopPathsParams): js.Promise[Response[ReposGetTopPathsResponse]] = js.native
  /**
    * Get the top 10 referrers over the last 14 days.
    */
  def getTopReferrers(): js.Promise[Response[ReposGetTopReferrersResponse]] = js.native
  def getTopReferrers(params: RequestOptions with ReposGetTopReferrersParams): js.Promise[Response[ReposGetTopReferrersResponse]] = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Lists the people who have push access to this branch.
    */
  def getUsersWithAccessToProtectedBranch(): js.Promise[Response[ReposGetUsersWithAccessToProtectedBranchResponse]] = js.native
  def getUsersWithAccessToProtectedBranch(params: RequestOptions with ReposGetUsersWithAccessToProtectedBranchParams): js.Promise[Response[ReposGetUsersWithAccessToProtectedBranchResponse]] = js.native
  /**
    * Get the total number of views and breakdown per day or week for the last 14 days. Timestamps are aligned to UTC midnight of the beginning of the day or week. Week begins on Monday.
    */
  def getViews(): js.Promise[Response[ReposGetViewsResponse]] = js.native
  def getViews(params: RequestOptions with ReposGetViewsParams): js.Promise[Response[ReposGetViewsResponse]] = js.native
  /**
    * Lists repositories that the authenticated user has explicit permission (`:read`, `:write`, or `:admin`) to access.
    *
    * The authenticated user has explicit permission to access repositories they own, repositories where they are a collaborator, and repositories that they can access through an organization membership.
    */
  def list(): js.Promise[AnyResponse] = js.native
  def list(params: RequestOptions with ReposListParams): js.Promise[AnyResponse] = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Lists the GitHub Apps that have push access to this branch. Only installed GitHub Apps with `write` access to the `contents` permission can be added as authorized actors on a protected branch.
    * @deprecated octokit.repos.listAppsWithAccessToProtectedBranch() has been renamed to octokit.repos.getAppsWithAccessToProtectedBranch() (2019-09-13)
    */
  def listAppsWithAccessToProtectedBranch(): js.Promise[Response[ReposListAppsWithAccessToProtectedBranchResponse]] = js.native
  def listAppsWithAccessToProtectedBranch(params: RequestOptions with ReposListAppsWithAccessToProtectedBranchParams): js.Promise[Response[ReposListAppsWithAccessToProtectedBranchResponse]] = js.native
  def listAssetsForRelease(): js.Promise[Response[ReposListAssetsForReleaseResponse]] = js.native
  def listAssetsForRelease(params: RequestOptions with ReposListAssetsForReleaseParams): js.Promise[Response[ReposListAssetsForReleaseResponse]] = js.native
  def listBranches(): js.Promise[Response[ReposListBranchesResponse]] = js.native
  def listBranches(params: RequestOptions with ReposListBranchesParams): js.Promise[Response[ReposListBranchesResponse]] = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Returns all branches where the given commit SHA is the HEAD, or latest commit for the branch.
    */
  def listBranchesForHeadCommit(): js.Promise[Response[ReposListBranchesForHeadCommitResponse]] = js.native
  def listBranchesForHeadCommit(params: RequestOptions with ReposListBranchesForHeadCommitParams): js.Promise[Response[ReposListBranchesForHeadCommitResponse]] = js.native
  /**
    * For organization-owned repositories, the list of collaborators includes outside collaborators, organization members that are direct collaborators, organization members with access through team memberships, organization members with access through default organization permissions, and organization owners.
    *
    * Team members will include the members of child teams.
    */
  def listCollaborators(): js.Promise[Response[ReposListCollaboratorsResponse]] = js.native
  def listCollaborators(params: RequestOptions with ReposListCollaboratorsParams): js.Promise[Response[ReposListCollaboratorsResponse]] = js.native
  /**
    * Use the `:commit_sha` to specify the commit that will have its comments listed.
    */
  def listCommentsForCommit(): js.Promise[Response[ReposListCommentsForCommitResponse]] = js.native
  def listCommentsForCommit(
    params: RequestOptions with ReposListCommentsForCommitParamsDeprecatedRef with ReposListCommentsForCommitParams
  ): js.Promise[Response[ReposListCommentsForCommitResponse]] = js.native
  /**
    * Commit Comments use [these custom media types](https://developer.github.com/v3/repos/comments/#custom-media-types). You can read more about the use of media types in the API [here](https://developer.github.com/v3/media/).
    *
    * Comments are ordered by ascending ID.
    */
  def listCommitComments(): js.Promise[Response[ReposListCommitCommentsResponse]] = js.native
  def listCommitComments(params: RequestOptions with ReposListCommitCommentsParams): js.Promise[Response[ReposListCommitCommentsResponse]] = js.native
  /**
    * **Signature verification object**
    *
    * The response will include a `verification` object that describes the result of verifying the commit's signature. The following fields are included in the `verification` object:
    *
    * These are the possible values for `reason` in the `verification` object:
    *
    * | Value                    | Description                                                                                                                       |
    * | ------------------------ | --------------------------------------------------------------------------------------------------------------------------------- |
    * | `expired_key`            | The key that made the signature is expired.                                                                                       |
    * | `not_signing_key`        | The "signing" flag is not among the usage flags in the GPG key that made the signature.                                           |
    * | `gpgverify_error`        | There was an error communicating with the signature verification service.                                                         |
    * | `gpgverify_unavailable`  | The signature verification service is currently unavailable.                                                                      |
    * | `unsigned`               | The object does not include a signature.                                                                                          |
    * | `unknown_signature_type` | A non-PGP signature was found in the commit.                                                                                      |
    * | `no_user`                | No user was associated with the `committer` email address in the commit.                                                          |
    * | `unverified_email`       | The `committer` email address in the commit was associated with a user, but the email address is not verified on her/his account. |
    * | `bad_email`              | The `committer` email address in the commit is not included in the identities of the PGP key that made the signature.             |
    * | `unknown_key`            | The key that made the signature has not been registered with any user's account.                                                  |
    * | `malformed_signature`    | There was an error parsing the signature.                                                                                         |
    * | `invalid`                | The signature could not be cryptographically verified using the key whose key-id was found in the signature.                      |
    * | `valid`                  | None of the above errors applied, so the signature is considered to be verified.                                                  |
    */
  def listCommits(): js.Promise[Response[ReposListCommitsResponse]] = js.native
  def listCommits(params: RequestOptions with ReposListCommitsParams): js.Promise[Response[ReposListCommitsResponse]] = js.native
  /**
    * Lists contributors to the specified repository and sorts them by the number of commits per contributor in descending order. This endpoint may return information that is a few hours old because the GitHub REST API v3 caches contributor data to improve performance.
    *
    * GitHub identifies contributors by author email address. This endpoint groups contribution counts by GitHub user, which includes all associated email addresses. To improve performance, only the first 500 author email addresses in the repository link to GitHub users. The rest will appear as anonymous contributors without associated GitHub user information.
    */
  def listContributors(): js.Promise[Response[ReposListContributorsResponse]] = js.native
  def listContributors(params: RequestOptions with ReposListContributorsParams): js.Promise[Response[ReposListContributorsResponse]] = js.native
  def listDeployKeys(): js.Promise[Response[ReposListDeployKeysResponse]] = js.native
  def listDeployKeys(params: RequestOptions with ReposListDeployKeysParams): js.Promise[Response[ReposListDeployKeysResponse]] = js.native
  /**
    * Users with pull access can view deployment statuses for a deployment:
    */
  def listDeploymentStatuses(): js.Promise[Response[ReposListDeploymentStatusesResponse]] = js.native
  def listDeploymentStatuses(params: RequestOptions with ReposListDeploymentStatusesParams): js.Promise[Response[ReposListDeploymentStatusesResponse]] = js.native
  /**
    * Simple filtering of deployments is available via query parameters:
    */
  def listDeployments(): js.Promise[Response[ReposListDeploymentsResponse]] = js.native
  def listDeployments(params: RequestOptions with ReposListDeploymentsParams): js.Promise[Response[ReposListDeploymentsResponse]] = js.native
  def listDownloads(): js.Promise[Response[ReposListDownloadsResponse]] = js.native
  def listDownloads(params: RequestOptions with ReposListDownloadsParams): js.Promise[Response[ReposListDownloadsResponse]] = js.native
  /**
    * Lists repositories for the specified organization.
    */
  def listForOrg(): js.Promise[Response[ReposListForOrgResponse]] = js.native
  def listForOrg(params: RequestOptions with ReposListForOrgParams): js.Promise[Response[ReposListForOrgResponse]] = js.native
  /**
    * Lists public repositories for the specified user.
    */
  def listForUser(): js.Promise[AnyResponse] = js.native
  def listForUser(params: RequestOptions with ReposListForUserParams): js.Promise[AnyResponse] = js.native
  def listForks(): js.Promise[Response[ReposListForksResponse]] = js.native
  def listForks(params: RequestOptions with ReposListForksParams): js.Promise[Response[ReposListForksResponse]] = js.native
  def listHooks(): js.Promise[Response[ReposListHooksResponse]] = js.native
  def listHooks(params: RequestOptions with ReposListHooksParams): js.Promise[Response[ReposListHooksResponse]] = js.native
  /**
    * When authenticating as a user with admin rights to a repository, this endpoint will list all currently open repository invitations.
    */
  def listInvitations(): js.Promise[Response[ReposListInvitationsResponse]] = js.native
  def listInvitations(params: RequestOptions with ReposListInvitationsParams): js.Promise[Response[ReposListInvitationsResponse]] = js.native
  /**
    * When authenticating as a user, this endpoint will list all currently open repository invitations for that user.
    */
  def listInvitationsForAuthenticatedUser(): js.Promise[Response[ReposListInvitationsForAuthenticatedUserResponse]] = js.native
  def listInvitationsForAuthenticatedUser(params: RequestOptions with ReposListInvitationsForAuthenticatedUserParams): js.Promise[Response[ReposListInvitationsForAuthenticatedUserResponse]] = js.native
  /**
    * Lists languages for the specified repository. The value shown for each language is the number of bytes of code written in that language.
    */
  def listLanguages(): js.Promise[Response[ReposListLanguagesResponse]] = js.native
  def listLanguages(params: RequestOptions with ReposListLanguagesParams): js.Promise[Response[ReposListLanguagesResponse]] = js.native
  def listPagesBuilds(): js.Promise[Response[ReposListPagesBuildsResponse]] = js.native
  def listPagesBuilds(params: RequestOptions with ReposListPagesBuildsParams): js.Promise[Response[ReposListPagesBuildsResponse]] = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    */
  def listProtectedBranchRequiredStatusChecksContexts(): js.Promise[Response[ReposListProtectedBranchRequiredStatusChecksContextsResponse]] = js.native
  def listProtectedBranchRequiredStatusChecksContexts(params: RequestOptions with ReposListProtectedBranchRequiredStatusChecksContextsParams): js.Promise[Response[ReposListProtectedBranchRequiredStatusChecksContextsResponse]] = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Lists the teams who have push access to this branch. The list includes child teams.
    * @deprecated octokit.repos.listProtectedBranchTeamRestrictions() has been renamed to octokit.repos.getTeamsWithAccessToProtectedBranch() (2019-09-09)
    */
  def listProtectedBranchTeamRestrictions(): js.Promise[Response[ReposListProtectedBranchTeamRestrictionsResponse]] = js.native
  def listProtectedBranchTeamRestrictions(params: RequestOptions with ReposListProtectedBranchTeamRestrictionsParams): js.Promise[Response[ReposListProtectedBranchTeamRestrictionsResponse]] = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Lists the people who have push access to this branch.
    * @deprecated octokit.repos.listProtectedBranchUserRestrictions() has been renamed to octokit.repos.getUsersWithAccessToProtectedBranch() (2019-09-09)
    */
  def listProtectedBranchUserRestrictions(): js.Promise[Response[ReposListProtectedBranchUserRestrictionsResponse]] = js.native
  def listProtectedBranchUserRestrictions(params: RequestOptions with ReposListProtectedBranchUserRestrictionsParams): js.Promise[Response[ReposListProtectedBranchUserRestrictionsResponse]] = js.native
  /**
    * Lists all public repositories in the order that they were created.
    *
    * Note: Pagination is powered exclusively by the `since` parameter. Use the [Link header](https://developer.github.com/v3/#link-header) to get the URL for the next page of repositories.
    */
  def listPublic(): js.Promise[Response[ReposListPublicResponse]] = js.native
  def listPublic(params: RequestOptions with ReposListPublicParams): js.Promise[Response[ReposListPublicResponse]] = js.native
  /**
    * Lists all pull requests containing the provided commit SHA, which can be from any point in the commit history. The results will include open and closed pull requests. Additional preview headers may be required to see certain details for associated pull requests, such as whether a pull request is in a draft state. For more information about previews that might affect this endpoint, see the [List pull requests](https://developer.github.com/v3/pulls/#list-pull-requests) endpoint.
    */
  def listPullRequestsAssociatedWithCommit(): js.Promise[Response[ReposListPullRequestsAssociatedWithCommitResponse]] = js.native
  def listPullRequestsAssociatedWithCommit(params: RequestOptions with ReposListPullRequestsAssociatedWithCommitParams): js.Promise[Response[ReposListPullRequestsAssociatedWithCommitResponse]] = js.native
  /**
    * This returns a list of releases, which does not include regular Git tags that have not been associated with a release. To get a list of Git tags, use the [Repository Tags API](https://developer.github.com/v3/repos/#list-tags).
    *
    * Information about published releases are available to everyone. Only users with push access will receive listings for draft releases.
    */
  def listReleases(): js.Promise[Response[ReposListReleasesResponse]] = js.native
  def listReleases(params: RequestOptions with ReposListReleasesParams): js.Promise[Response[ReposListReleasesResponse]] = js.native
  /**
    * Users with pull access in a repository can view commit statuses for a given ref. The ref can be a SHA, a branch name, or a tag name. Statuses are returned in reverse chronological order. The first status in the list will be the latest one.
    *
    * This resource is also available via a legacy route: `GET /repos/:owner/:repo/statuses/:ref`.
    */
  def listStatusesForRef(): js.Promise[Response[ReposListStatusesForRefResponse]] = js.native
  def listStatusesForRef(params: RequestOptions with ReposListStatusesForRefParams): js.Promise[Response[ReposListStatusesForRefResponse]] = js.native
  def listTags(): js.Promise[Response[ReposListTagsResponse]] = js.native
  def listTags(params: RequestOptions with ReposListTagsParams): js.Promise[Response[ReposListTagsResponse]] = js.native
  def listTeams(): js.Promise[Response[ReposListTeamsResponse]] = js.native
  def listTeams(params: RequestOptions with ReposListTeamsParams): js.Promise[Response[ReposListTeamsResponse]] = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Lists the teams who have push access to this branch. The list includes child teams.
    * @deprecated octokit.repos.listTeamsWithAccessToProtectedBranch() has been renamed to octokit.repos.getTeamsWithAccessToProtectedBranch() (2019-09-13)
    */
  def listTeamsWithAccessToProtectedBranch(): js.Promise[Response[ReposListTeamsWithAccessToProtectedBranchResponse]] = js.native
  def listTeamsWithAccessToProtectedBranch(params: RequestOptions with ReposListTeamsWithAccessToProtectedBranchParams): js.Promise[Response[ReposListTeamsWithAccessToProtectedBranchResponse]] = js.native
  def listTopics(): js.Promise[Response[ReposListTopicsResponse]] = js.native
  def listTopics(params: RequestOptions with ReposListTopicsParams): js.Promise[Response[ReposListTopicsResponse]] = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Lists the people who have push access to this branch.
    * @deprecated octokit.repos.listUsersWithAccessToProtectedBranch() has been renamed to octokit.repos.getUsersWithAccessToProtectedBranch() (2019-09-13)
    */
  def listUsersWithAccessToProtectedBranch(): js.Promise[Response[ReposListUsersWithAccessToProtectedBranchResponse]] = js.native
  def listUsersWithAccessToProtectedBranch(params: RequestOptions with ReposListUsersWithAccessToProtectedBranchParams): js.Promise[Response[ReposListUsersWithAccessToProtectedBranchResponse]] = js.native
  def merge(): js.Promise[Response[ReposMergeResponse]] = js.native
  def merge(params: RequestOptions with ReposMergeParams): js.Promise[Response[ReposMergeResponse]] = js.native
  /**
    * This will trigger a [ping event](https://developer.github.com/webhooks/#ping-event) to be sent to the hook.
    */
  def pingHook(): js.Promise[AnyResponse] = js.native
  def pingHook(params: RequestOptions with ReposPingHookParams): js.Promise[AnyResponse] = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    */
  def removeBranchProtection(): js.Promise[AnyResponse] = js.native
  def removeBranchProtection(params: RequestOptions with ReposRemoveBranchProtectionParams): js.Promise[AnyResponse] = js.native
  def removeCollaborator(): js.Promise[AnyResponse] = js.native
  def removeCollaborator(params: RequestOptions with ReposRemoveCollaboratorParams): js.Promise[AnyResponse] = js.native
  def removeDeployKey(): js.Promise[AnyResponse] = js.native
  def removeDeployKey(params: RequestOptions with ReposRemoveDeployKeyParams): js.Promise[AnyResponse] = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Removing admin enforcement requires admin or owner permissions to the repository and branch protection to be enabled.
    */
  def removeProtectedBranchAdminEnforcement(): js.Promise[AnyResponse] = js.native
  def removeProtectedBranchAdminEnforcement(params: RequestOptions with ReposRemoveProtectedBranchAdminEnforcementParams): js.Promise[AnyResponse] = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Removes the ability of an app to push to this branch. Only installed GitHub Apps with `write` access to the `contents` permission can be added as authorized actors on a protected branch.
    *
    * | Type    | Description                                                                                                                                                |
    * | ------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------- |
    * | `array` | The GitHub Apps that have push access to this branch. Use the app's `slug`. **Note**: The list of users, apps, and teams in total is limited to 100 items. |
    */
  def removeProtectedBranchAppRestrictions(): js.Promise[Response[ReposRemoveProtectedBranchAppRestrictionsResponse]] = js.native
  def removeProtectedBranchAppRestrictions(params: RequestOptions with ReposRemoveProtectedBranchAppRestrictionsParams): js.Promise[Response[ReposRemoveProtectedBranchAppRestrictionsResponse]] = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    */
  def removeProtectedBranchPullRequestReviewEnforcement(): js.Promise[AnyResponse] = js.native
  def removeProtectedBranchPullRequestReviewEnforcement(params: RequestOptions with ReposRemoveProtectedBranchPullRequestReviewEnforcementParams): js.Promise[AnyResponse] = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * When authenticated with admin or owner permissions to the repository, you can use this endpoint to disable required signed commits on a branch. You must enable branch protection to require signed commits.
    */
  def removeProtectedBranchRequiredSignatures(): js.Promise[AnyResponse] = js.native
  def removeProtectedBranchRequiredSignatures(params: RequestOptions with ReposRemoveProtectedBranchRequiredSignaturesParams): js.Promise[AnyResponse] = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    */
  def removeProtectedBranchRequiredStatusChecks(): js.Promise[AnyResponse] = js.native
  def removeProtectedBranchRequiredStatusChecks(params: RequestOptions with ReposRemoveProtectedBranchRequiredStatusChecksParams): js.Promise[AnyResponse] = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    */
  def removeProtectedBranchRequiredStatusChecksContexts(): js.Promise[Response[ReposRemoveProtectedBranchRequiredStatusChecksContextsResponse]] = js.native
  def removeProtectedBranchRequiredStatusChecksContexts(params: RequestOptions with ReposRemoveProtectedBranchRequiredStatusChecksContextsParams): js.Promise[Response[ReposRemoveProtectedBranchRequiredStatusChecksContextsResponse]] = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Disables the ability to restrict who can push to this branch.
    */
  def removeProtectedBranchRestrictions(): js.Promise[AnyResponse] = js.native
  def removeProtectedBranchRestrictions(params: RequestOptions with ReposRemoveProtectedBranchRestrictionsParams): js.Promise[AnyResponse] = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Removes the ability of a team to push to this branch. You can also remove push access for child teams.
    *
    * | Type    | Description                                                                                                                                         |
    * | ------- | --------------------------------------------------------------------------------------------------------------------------------------------------- |
    * | `array` | Teams that should no longer have push access. Use the team's `slug`. **Note**: The list of users, apps, and teams in total is limited to 100 items. |
    */
  def removeProtectedBranchTeamRestrictions(): js.Promise[Response[ReposRemoveProtectedBranchTeamRestrictionsResponse]] = js.native
  def removeProtectedBranchTeamRestrictions(params: RequestOptions with ReposRemoveProtectedBranchTeamRestrictionsParams): js.Promise[Response[ReposRemoveProtectedBranchTeamRestrictionsResponse]] = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Removes the ability of a user to push to this branch.
    *
    * | Type    | Description                                                                                                                                   |
    * | ------- | --------------------------------------------------------------------------------------------------------------------------------------------- |
    * | `array` | Usernames of the people who should no longer have push access. **Note**: The list of users, apps, and teams in total is limited to 100 items. |
    */
  def removeProtectedBranchUserRestrictions(): js.Promise[Response[ReposRemoveProtectedBranchUserRestrictionsResponse]] = js.native
  def removeProtectedBranchUserRestrictions(params: RequestOptions with ReposRemoveProtectedBranchUserRestrictionsParams): js.Promise[Response[ReposRemoveProtectedBranchUserRestrictionsResponse]] = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Replaces the list of apps that have push access to this branch. This removes all apps that previously had push access and grants push access to the new list of apps. Only installed GitHub Apps with `write` access to the `contents` permission can be added as authorized actors on a protected branch.
    *
    * | Type    | Description                                                                                                                                                |
    * | ------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------- |
    * | `array` | The GitHub Apps that have push access to this branch. Use the app's `slug`. **Note**: The list of users, apps, and teams in total is limited to 100 items. |
    */
  def replaceProtectedBranchAppRestrictions(): js.Promise[Response[ReposReplaceProtectedBranchAppRestrictionsResponse]] = js.native
  def replaceProtectedBranchAppRestrictions(params: RequestOptions with ReposReplaceProtectedBranchAppRestrictionsParams): js.Promise[Response[ReposReplaceProtectedBranchAppRestrictionsResponse]] = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    */
  def replaceProtectedBranchRequiredStatusChecksContexts(): js.Promise[Response[ReposReplaceProtectedBranchRequiredStatusChecksContextsResponse]] = js.native
  def replaceProtectedBranchRequiredStatusChecksContexts(params: RequestOptions with ReposReplaceProtectedBranchRequiredStatusChecksContextsParams): js.Promise[Response[ReposReplaceProtectedBranchRequiredStatusChecksContextsResponse]] = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Replaces the list of teams that have push access to this branch. This removes all teams that previously had push access and grants push access to the new list of teams. Team restrictions include child teams.
    *
    * | Type    | Description                                                                                                                                |
    * | ------- | ------------------------------------------------------------------------------------------------------------------------------------------ |
    * | `array` | The teams that can have push access. Use the team's `slug`. **Note**: The list of users, apps, and teams in total is limited to 100 items. |
    */
  def replaceProtectedBranchTeamRestrictions(): js.Promise[Response[ReposReplaceProtectedBranchTeamRestrictionsResponse]] = js.native
  def replaceProtectedBranchTeamRestrictions(params: RequestOptions with ReposReplaceProtectedBranchTeamRestrictionsParams): js.Promise[Response[ReposReplaceProtectedBranchTeamRestrictionsResponse]] = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Replaces the list of people that have push access to this branch. This removes all people that previously had push access and grants push access to the new list of people.
    *
    * | Type    | Description                                                                                                                   |
    * | ------- | ----------------------------------------------------------------------------------------------------------------------------- |
    * | `array` | Usernames for people who can have push access. **Note**: The list of users, apps, and teams in total is limited to 100 items. |
    */
  def replaceProtectedBranchUserRestrictions(): js.Promise[Response[ReposReplaceProtectedBranchUserRestrictionsResponse]] = js.native
  def replaceProtectedBranchUserRestrictions(params: RequestOptions with ReposReplaceProtectedBranchUserRestrictionsParams): js.Promise[Response[ReposReplaceProtectedBranchUserRestrictionsResponse]] = js.native
  def replaceTopics(): js.Promise[Response[ReposReplaceTopicsResponse]] = js.native
  def replaceTopics(params: RequestOptions with ReposReplaceTopicsParams): js.Promise[Response[ReposReplaceTopicsResponse]] = js.native
  /**
    * You can request that your site be built from the latest revision on the default branch. This has the same effect as pushing a commit to your default branch, but does not require an additional commit. Manually triggering page builds can be helpful when diagnosing build warnings and failures.
    *
    * Build requests are limited to one concurrent build per repository and one concurrent build per requester. If you request a build while another is still in progress, the second request will be queued until the first completes.
    */
  def requestPageBuild(): js.Promise[Response[ReposRequestPageBuildResponse]] = js.native
  def requestPageBuild(params: RequestOptions with ReposRequestPageBuildParams): js.Promise[Response[ReposRequestPageBuildResponse]] = js.native
  /**
    * This endpoint will return all community profile metrics, including an overall health score, repository description, the presence of documentation, detected code of conduct, detected license, and the presence of ISSUE\_TEMPLATE, PULL\_REQUEST\_TEMPLATE, README, and CONTRIBUTING files.
    */
  def retrieveCommunityProfileMetrics(): js.Promise[Response[ReposRetrieveCommunityProfileMetricsResponse]] = js.native
  def retrieveCommunityProfileMetrics(params: RequestOptions with ReposRetrieveCommunityProfileMetricsParams): js.Promise[Response[ReposRetrieveCommunityProfileMetricsResponse]] = js.native
  /**
    * This will trigger the hook with the latest push to the current repository if the hook is subscribed to `push` events. If the hook is not subscribed to `push` events, the server will respond with 204 but no test POST will be generated.
    *
    * **Note**: Previously `/repos/:owner/:repo/hooks/:hook_id/test`
    */
  def testPushHook(): js.Promise[AnyResponse] = js.native
  def testPushHook(params: RequestOptions with ReposTestPushHookParams): js.Promise[AnyResponse] = js.native
  /**
    * A transfer request will need to be accepted by the new owner when transferring a personal repository to another user. The response will contain the original `owner`, and the transfer will continue asynchronously. For more details on the requirements to transfer personal and organization-owned repositories, see [about repository transfers](https://help.github.com/articles/about-repository-transfers/).
    */
  def transfer(): js.Promise[Response[ReposTransferResponse]] = js.native
  def transfer(params: RequestOptions with ReposTransferParams): js.Promise[Response[ReposTransferResponse]] = js.native
  /**
    * **Note**: To edit a repository's topics, use the [`topics` endpoint](https://developer.github.com/v3/repos/#replace-all-topics-for-a-repository).
    */
  def update(): js.Promise[Response[ReposUpdateResponse]] = js.native
  def update(params: RequestOptions with ReposUpdateParams): js.Promise[Response[ReposUpdateResponse]] = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Protecting a branch requires admin or owner permissions to the repository.
    *
    * **Note**: Passing new arrays of `users` and `teams` replaces their previous values.
    *
    * **Note**: The list of users, apps, and teams in total is limited to 100 items.
    */
  def updateBranchProtection(): js.Promise[Response[ReposUpdateBranchProtectionResponse]] = js.native
  def updateBranchProtection(params: RequestOptions with ReposUpdateBranchProtectionParams): js.Promise[Response[ReposUpdateBranchProtectionResponse]] = js.native
  def updateCommitComment(): js.Promise[Response[ReposUpdateCommitCommentResponse]] = js.native
  def updateCommitComment(params: RequestOptions with ReposUpdateCommitCommentParams): js.Promise[Response[ReposUpdateCommitCommentResponse]] = js.native
  /**
    * Creates a new file or updates an existing file in a repository.
    * @deprecated octokit.repos.updateFile() has been renamed to octokit.repos.createOrUpdateFile() (2019-06-07)
    */
  def updateFile(): js.Promise[Response[ReposUpdateFileResponse]] = js.native
  def updateFile(params: RequestOptions with ReposUpdateFileParams): js.Promise[Response[ReposUpdateFileResponse]] = js.native
  def updateHook(): js.Promise[Response[ReposUpdateHookResponse]] = js.native
  def updateHook(params: RequestOptions with ReposUpdateHookParams): js.Promise[Response[ReposUpdateHookResponse]] = js.native
  def updateInformationAboutPagesSite(): js.Promise[AnyResponse] = js.native
  def updateInformationAboutPagesSite(params: RequestOptions with ReposUpdateInformationAboutPagesSiteParams): js.Promise[AnyResponse] = js.native
  def updateInvitation(): js.Promise[Response[ReposUpdateInvitationResponse]] = js.native
  def updateInvitation(params: RequestOptions with ReposUpdateInvitationParams): js.Promise[Response[ReposUpdateInvitationResponse]] = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Updating pull request review enforcement requires admin or owner permissions to the repository and branch protection to be enabled.
    *
    * **Note**: Passing new arrays of `users` and `teams` replaces their previous values.
    */
  def updateProtectedBranchPullRequestReviewEnforcement(): js.Promise[Response[ReposUpdateProtectedBranchPullRequestReviewEnforcementResponse]] = js.native
  def updateProtectedBranchPullRequestReviewEnforcement(params: RequestOptions with ReposUpdateProtectedBranchPullRequestReviewEnforcementParams): js.Promise[Response[ReposUpdateProtectedBranchPullRequestReviewEnforcementResponse]] = js.native
  /**
    * Protected branches are available in public repositories with GitHub Free, and in public and private repositories with GitHub Pro, GitHub Team, and GitHub Enterprise Cloud. For more information, see [GitHub's products](https://help.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.
    *
    * Updating required status checks requires admin or owner permissions to the repository and branch protection to be enabled.
    */
  def updateProtectedBranchRequiredStatusChecks(): js.Promise[Response[ReposUpdateProtectedBranchRequiredStatusChecksResponse]] = js.native
  def updateProtectedBranchRequiredStatusChecks(params: RequestOptions with ReposUpdateProtectedBranchRequiredStatusChecksParams): js.Promise[Response[ReposUpdateProtectedBranchRequiredStatusChecksResponse]] = js.native
  /**
    * Users with push access to the repository can edit a release.
    */
  def updateRelease(): js.Promise[Response[ReposUpdateReleaseResponse]] = js.native
  def updateRelease(params: RequestOptions with ReposUpdateReleaseParams): js.Promise[Response[ReposUpdateReleaseResponse]] = js.native
  /**
    * Users with push access to the repository can edit a release asset.
    */
  def updateReleaseAsset(): js.Promise[Response[ReposUpdateReleaseAssetResponse]] = js.native
  def updateReleaseAsset(params: RequestOptions with ReposUpdateReleaseAssetParams): js.Promise[Response[ReposUpdateReleaseAssetResponse]] = js.native
  /**
    * This endpoint makes use of [a Hypermedia relation](https://developer.github.com/v3/#hypermedia) to determine which URL to access. The endpoint you call to upload release assets is specific to your release. Use the `upload_url` returned in the response of the [Create a release endpoint](https://developer.github.com/v3/repos/releases/#create-a-release) to upload a release asset.
    *
    * You need to use an HTTP client which supports [SNI](http://en.wikipedia.org/wiki/Server_Name_Indication) to make calls to this endpoint.
    *
    * Most libraries will set the required `Content-Length` header automatically. Use the required `Content-Type` header to provide the media type of the asset. For a list of media types, see [Media Types](https://www.iana.org/assignments/media-types/media-types.xhtml). For example:
    *
    * `application/zip`
    *
    * GitHub expects the asset data in its raw binary form, rather than JSON. You will send the raw binary content of the asset as the request body. Everything else about the endpoint is the same as the rest of the API. For example, you'll still need to pass your authentication to be able to upload an asset.
    */
  def uploadReleaseAsset(): js.Promise[Response[ReposUploadReleaseAssetResponse]] = js.native
  def uploadReleaseAsset(
    params: RequestOptions with ReposUploadReleaseAssetParamsDeprecatedFile with ReposUploadReleaseAssetParams
  ): js.Promise[Response[ReposUploadReleaseAssetResponse]] = js.native
}

