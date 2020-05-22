package typingsSlinky.octokitRest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Octokit {
  type ActionsListDownloadsForSelfHostedRunnerApplicationResponse = js.Array[
    typingsSlinky.octokitRest.mod.Octokit.ActionsListDownloadsForSelfHostedRunnerApplicationResponseItem
  ]
  type ActionsListSelfHostedRunnersForRepoResponse = js.Array[
    js.Array[
      typingsSlinky.octokitRest.mod.Octokit.ActionsListSelfHostedRunnersForRepoResponseItemItem
    ]
  ]
  type ActivityListNotificationsForRepoResponse = js.Array[
    typingsSlinky.octokitRest.mod.Octokit.ActivityListNotificationsForRepoResponseItem
  ]
  type ActivityListNotificationsResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.ActivityListNotificationsResponseItem]
  type ActivityListReposStarredByAuthenticatedUserResponse = js.Array[
    typingsSlinky.octokitRest.mod.Octokit.ActivityListReposStarredByAuthenticatedUserResponseItem
  ]
  type ActivityListReposStarredByUserResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.ActivityListReposStarredByUserResponseItem]
  type ActivityListReposWatchedByUserResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.ActivityListReposWatchedByUserResponseItem]
  type ActivityListStargazersForRepoResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.ActivityListStargazersForRepoResponseItem]
  type ActivityListWatchedReposForAuthenticatedUserResponse = js.Array[
    typingsSlinky.octokitRest.mod.Octokit.ActivityListWatchedReposForAuthenticatedUserResponseItem
  ]
  type ActivityListWatchersForRepoResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.ActivityListWatchersForRepoResponseItem]
  type AnyResponse = typingsSlinky.octokitRest.mod.Octokit.Response[js.Any]
  type AppsCreateInstallationTokenParamsPermissions = js.Object
  type AppsListAccountsUserOrOrgOnPlanResponse = js.Array[
    typingsSlinky.octokitRest.mod.Octokit.AppsListAccountsUserOrOrgOnPlanResponseItem
  ]
  type AppsListAccountsUserOrOrgOnPlanStubbedResponse = js.Array[
    typingsSlinky.octokitRest.mod.Octokit.AppsListAccountsUserOrOrgOnPlanStubbedResponseItem
  ]
  type AppsListInstallationsResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.AppsListInstallationsResponseItem]
  type AppsListMarketplacePurchasesForAuthenticatedUserResponse = js.Array[
    typingsSlinky.octokitRest.mod.Octokit.AppsListMarketplacePurchasesForAuthenticatedUserResponseItem
  ]
  type AppsListMarketplacePurchasesForAuthenticatedUserStubbedResponse = js.Array[
    typingsSlinky.octokitRest.mod.Octokit.AppsListMarketplacePurchasesForAuthenticatedUserStubbedResponseItem
  ]
  type AppsListPlansResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.AppsListPlansResponseItem]
  type AppsListPlansStubbedResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.AppsListPlansStubbedResponseItem]
  type Callback[T] = js.Function2[/* error */ js.Error | scala.Null, /* result */ T, js.Any]
  type ChecksListAnnotationsResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.ChecksListAnnotationsResponseItem]
  type CodesOfConductListConductCodesResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.CodesOfConductListConductCodesResponseItem]
  type GistsListCommentsResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.GistsListCommentsResponseItem]
  type GistsListCommitsResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.GistsListCommitsResponseItem]
  type GistsListForksResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.GistsListForksResponseItem]
  type GistsListPublicForUserResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.GistsListPublicForUserResponseItem]
  type GistsListPublicResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.GistsListPublicResponseItem]
  type GistsListResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.GistsListResponseItem]
  type GistsListStarredResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.GistsListStarredResponseItem]
  type GitListMatchingRefsResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.GitListMatchingRefsResponseItem]
  type GitignoreListTemplatesResponse = js.Array[java.lang.String]
  type IssuesAddLabelsResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.IssuesAddLabelsResponseItem]
  type IssuesListAssigneesResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.IssuesListAssigneesResponseItem]
  type IssuesListCommentsForRepoResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.IssuesListCommentsForRepoResponseItem]
  type IssuesListCommentsResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.IssuesListCommentsResponseItem]
  type IssuesListEventsForRepoResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.IssuesListEventsForRepoResponseItem]
  type IssuesListEventsForTimelineResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.IssuesListEventsForTimelineResponseItem]
  type IssuesListEventsResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.IssuesListEventsResponseItem]
  type IssuesListForAuthenticatedUserResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.IssuesListForAuthenticatedUserResponseItem]
  type IssuesListForOrgResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.IssuesListForOrgResponseItem]
  type IssuesListForRepoResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.IssuesListForRepoResponseItem]
  type IssuesListLabelsForMilestoneResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.IssuesListLabelsForMilestoneResponseItem]
  type IssuesListLabelsForRepoResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.IssuesListLabelsForRepoResponseItem]
  type IssuesListLabelsOnIssueResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.IssuesListLabelsOnIssueResponseItem]
  type IssuesListMilestonesForRepoResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.IssuesListMilestonesForRepoResponseItem]
  type IssuesListResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.IssuesListResponseItem]
  type IssuesRemoveLabelResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.IssuesRemoveLabelResponseItem]
  type IssuesReplaceLabelsResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.IssuesReplaceLabelsResponseItem]
  type LicensesListCommonlyUsedResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.LicensesListCommonlyUsedResponseItem]
  type LicensesListResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.LicensesListResponseItem]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.octokitRest.anon.Link
    - typingsSlinky.octokitRest.anon.Headers
    - java.lang.String
  */
  type Link = typingsSlinky.octokitRest.mod.Octokit._Link | java.lang.String
  type MigrationsGetCommitAuthorsResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.MigrationsGetCommitAuthorsResponseItem]
  type MigrationsGetLargeFilesResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.MigrationsGetLargeFilesResponseItem]
  type MigrationsListForAuthenticatedUserResponse = js.Array[
    typingsSlinky.octokitRest.mod.Octokit.MigrationsListForAuthenticatedUserResponseItem
  ]
  type MigrationsListForOrgResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.MigrationsListForOrgResponseItem]
  type MigrationsListReposForOrgResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.MigrationsListReposForOrgResponseItem]
  type MigrationsListReposForUserResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.MigrationsListReposForUserResponseItem]
  type OauthAuthorizationsListAuthorizationsResponse = js.Array[
    typingsSlinky.octokitRest.mod.Octokit.OauthAuthorizationsListAuthorizationsResponseItem
  ]
  type OauthAuthorizationsListGrantsResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.OauthAuthorizationsListGrantsResponseItem]
  type OrgsListBlockedUsersResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.OrgsListBlockedUsersResponseItem]
  type OrgsListForAuthenticatedUserResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.OrgsListForAuthenticatedUserResponseItem]
  type OrgsListForUserResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.OrgsListForUserResponseItem]
  type OrgsListHooksResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.OrgsListHooksResponseItem]
  type OrgsListInvitationTeamsResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.OrgsListInvitationTeamsResponseItem]
  type OrgsListMembersResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.OrgsListMembersResponseItem]
  type OrgsListMembershipsResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.OrgsListMembershipsResponseItem]
  type OrgsListOutsideCollaboratorsResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.OrgsListOutsideCollaboratorsResponseItem]
  type OrgsListPendingInvitationsResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.OrgsListPendingInvitationsResponseItem]
  type OrgsListPublicMembersResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.OrgsListPublicMembersResponseItem]
  type OrgsListResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.OrgsListResponseItem]
  type Plugin = js.Function2[
    /* octokit */ typingsSlinky.octokitRest.mod.Octokit, 
    /* options */ typingsSlinky.octokitRest.mod.Octokit.Options, 
    scala.Unit
  ]
  type ProjectsListCardsResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.ProjectsListCardsResponseItem]
  type ProjectsListCollaboratorsResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.ProjectsListCollaboratorsResponseItem]
  type ProjectsListColumnsResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.ProjectsListColumnsResponseItem]
  type ProjectsListForOrgResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.ProjectsListForOrgResponseItem]
  type ProjectsListForRepoResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.ProjectsListForRepoResponseItem]
  type ProjectsListForUserResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.ProjectsListForUserResponseItem]
  type PullsGetCommentsForReviewResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.PullsGetCommentsForReviewResponseItem]
  type PullsListCommentsForRepoResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.PullsListCommentsForRepoResponseItem]
  type PullsListCommentsResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.PullsListCommentsResponseItem]
  type PullsListCommitsResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.PullsListCommitsResponseItem]
  type PullsListFilesResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.PullsListFilesResponseItem]
  type PullsListResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.PullsListResponseItem]
  type PullsListReviewsResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.PullsListReviewsResponseItem]
  type ReactionsListForCommitCommentResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.ReactionsListForCommitCommentResponseItem]
  type ReactionsListForIssueCommentResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.ReactionsListForIssueCommentResponseItem]
  type ReactionsListForIssueResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.ReactionsListForIssueResponseItem]
  type ReactionsListForPullRequestReviewCommentResponse = js.Array[
    typingsSlinky.octokitRest.mod.Octokit.ReactionsListForPullRequestReviewCommentResponseItem
  ]
  type ReactionsListForTeamDiscussionCommentInOrgResponse = js.Array[
    typingsSlinky.octokitRest.mod.Octokit.ReactionsListForTeamDiscussionCommentInOrgResponseItem
  ]
  type ReactionsListForTeamDiscussionCommentLegacyResponse = js.Array[
    typingsSlinky.octokitRest.mod.Octokit.ReactionsListForTeamDiscussionCommentLegacyResponseItem
  ]
  type ReactionsListForTeamDiscussionCommentResponse = js.Array[
    typingsSlinky.octokitRest.mod.Octokit.ReactionsListForTeamDiscussionCommentResponseItem
  ]
  type ReactionsListForTeamDiscussionInOrgResponse = js.Array[
    typingsSlinky.octokitRest.mod.Octokit.ReactionsListForTeamDiscussionInOrgResponseItem
  ]
  type ReactionsListForTeamDiscussionLegacyResponse = js.Array[
    typingsSlinky.octokitRest.mod.Octokit.ReactionsListForTeamDiscussionLegacyResponseItem
  ]
  type ReactionsListForTeamDiscussionResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.ReactionsListForTeamDiscussionResponseItem]
  type ReposAddProtectedBranchAppRestrictionsResponse = js.Array[
    typingsSlinky.octokitRest.mod.Octokit.ReposAddProtectedBranchAppRestrictionsResponseItem
  ]
  type ReposAddProtectedBranchRequiredStatusChecksContextsResponse = js.Array[java.lang.String]
  type ReposAddProtectedBranchTeamRestrictionsResponse = js.Array[
    typingsSlinky.octokitRest.mod.Octokit.ReposAddProtectedBranchTeamRestrictionsResponseItem
  ]
  type ReposAddProtectedBranchUserRestrictionsResponse = js.Array[
    typingsSlinky.octokitRest.mod.Octokit.ReposAddProtectedBranchUserRestrictionsResponseItem
  ]
  type ReposCreateDispatchEventParamsClientPayload = js.Object
  type ReposGetAppsWithAccessToProtectedBranchResponse = js.Array[
    typingsSlinky.octokitRest.mod.Octokit.ReposGetAppsWithAccessToProtectedBranchResponseItem
  ]
  type ReposGetCodeFrequencyStatsResponse = js.Array[js.Array[scala.Double]]
  type ReposGetCommitActivityStatsResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.ReposGetCommitActivityStatsResponseItem]
  type ReposGetContentsResponse = typingsSlinky.octokitRest.anon.Content | js.Array[typingsSlinky.octokitRest.mod.Octokit.ReposGetContentsResponseItem]
  type ReposGetContributorsStatsResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.ReposGetContributorsStatsResponseItem]
  type ReposGetPunchCardStatsResponse = js.Array[js.Array[scala.Double]]
  type ReposGetTeamsWithAccessToProtectedBranchResponse = js.Array[
    typingsSlinky.octokitRest.mod.Octokit.ReposGetTeamsWithAccessToProtectedBranchResponseItem
  ]
  type ReposGetTopPathsResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.ReposGetTopPathsResponseItem]
  type ReposGetTopReferrersResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.ReposGetTopReferrersResponseItem]
  type ReposGetUsersWithAccessToProtectedBranchResponse = js.Array[
    typingsSlinky.octokitRest.mod.Octokit.ReposGetUsersWithAccessToProtectedBranchResponseItem
  ]
  type ReposListAppsWithAccessToProtectedBranchResponse = js.Array[
    typingsSlinky.octokitRest.mod.Octokit.ReposListAppsWithAccessToProtectedBranchResponseItem
  ]
  type ReposListAssetsForReleaseResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.ReposListAssetsForReleaseResponseItem]
  type ReposListBranchesForHeadCommitResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.ReposListBranchesForHeadCommitResponseItem]
  type ReposListBranchesResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.ReposListBranchesResponseItem]
  type ReposListCollaboratorsResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.ReposListCollaboratorsResponseItem]
  type ReposListCommentsForCommitResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.ReposListCommentsForCommitResponseItem]
  type ReposListCommitCommentsResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.ReposListCommitCommentsResponseItem]
  type ReposListCommitsResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.ReposListCommitsResponseItem]
  type ReposListContributorsResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.ReposListContributorsResponseItem]
  type ReposListDeployKeysResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.ReposListDeployKeysResponseItem]
  type ReposListDeploymentStatusesResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.ReposListDeploymentStatusesResponseItem]
  type ReposListDeploymentsResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.ReposListDeploymentsResponseItem]
  type ReposListDownloadsResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.ReposListDownloadsResponseItem]
  type ReposListForOrgResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.ReposListForOrgResponseItem]
  type ReposListForksResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.ReposListForksResponseItem]
  type ReposListHooksResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.ReposListHooksResponseItem]
  type ReposListInvitationsForAuthenticatedUserResponse = js.Array[
    typingsSlinky.octokitRest.mod.Octokit.ReposListInvitationsForAuthenticatedUserResponseItem
  ]
  type ReposListInvitationsResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.ReposListInvitationsResponseItem]
  type ReposListPagesBuildsResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.ReposListPagesBuildsResponseItem]
  type ReposListProtectedBranchRequiredStatusChecksContextsResponse = js.Array[java.lang.String]
  type ReposListProtectedBranchTeamRestrictionsResponse = js.Array[
    typingsSlinky.octokitRest.mod.Octokit.ReposListProtectedBranchTeamRestrictionsResponseItem
  ]
  type ReposListProtectedBranchUserRestrictionsResponse = js.Array[
    typingsSlinky.octokitRest.mod.Octokit.ReposListProtectedBranchUserRestrictionsResponseItem
  ]
  type ReposListPublicResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.ReposListPublicResponseItem]
  type ReposListPullRequestsAssociatedWithCommitResponse = js.Array[
    typingsSlinky.octokitRest.mod.Octokit.ReposListPullRequestsAssociatedWithCommitResponseItem
  ]
  type ReposListReleasesResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.ReposListReleasesResponseItem]
  type ReposListStatusesForRefResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.ReposListStatusesForRefResponseItem]
  type ReposListTagsResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.ReposListTagsResponseItem]
  type ReposListTeamsResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.ReposListTeamsResponseItem]
  type ReposListTeamsWithAccessToProtectedBranchResponse = js.Array[
    typingsSlinky.octokitRest.mod.Octokit.ReposListTeamsWithAccessToProtectedBranchResponseItem
  ]
  type ReposListUsersWithAccessToProtectedBranchResponse = js.Array[
    typingsSlinky.octokitRest.mod.Octokit.ReposListUsersWithAccessToProtectedBranchResponseItem
  ]
  type ReposRemoveProtectedBranchAppRestrictionsResponse = js.Array[
    typingsSlinky.octokitRest.mod.Octokit.ReposRemoveProtectedBranchAppRestrictionsResponseItem
  ]
  type ReposRemoveProtectedBranchRequiredStatusChecksContextsResponse = js.Array[java.lang.String]
  type ReposRemoveProtectedBranchTeamRestrictionsResponse = js.Array[
    typingsSlinky.octokitRest.mod.Octokit.ReposRemoveProtectedBranchTeamRestrictionsResponseItem
  ]
  type ReposRemoveProtectedBranchUserRestrictionsResponse = js.Array[
    typingsSlinky.octokitRest.mod.Octokit.ReposRemoveProtectedBranchUserRestrictionsResponseItem
  ]
  type ReposReplaceProtectedBranchAppRestrictionsResponse = js.Array[
    typingsSlinky.octokitRest.mod.Octokit.ReposReplaceProtectedBranchAppRestrictionsResponseItem
  ]
  type ReposReplaceProtectedBranchRequiredStatusChecksContextsResponse = js.Array[java.lang.String]
  type ReposReplaceProtectedBranchTeamRestrictionsResponse = js.Array[
    typingsSlinky.octokitRest.mod.Octokit.ReposReplaceProtectedBranchTeamRestrictionsResponseItem
  ]
  type ReposReplaceProtectedBranchUserRestrictionsResponse = js.Array[
    typingsSlinky.octokitRest.mod.Octokit.ReposReplaceProtectedBranchUserRestrictionsResponseItem
  ]
  type TeamsListChildInOrgResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.TeamsListChildInOrgResponseItem]
  type TeamsListChildLegacyResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.TeamsListChildLegacyResponseItem]
  type TeamsListChildResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.TeamsListChildResponseItem]
  type TeamsListDiscussionCommentsInOrgResponse = js.Array[
    typingsSlinky.octokitRest.mod.Octokit.TeamsListDiscussionCommentsInOrgResponseItem
  ]
  type TeamsListDiscussionCommentsLegacyResponse = js.Array[
    typingsSlinky.octokitRest.mod.Octokit.TeamsListDiscussionCommentsLegacyResponseItem
  ]
  type TeamsListDiscussionCommentsResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.TeamsListDiscussionCommentsResponseItem]
  type TeamsListDiscussionsInOrgResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.TeamsListDiscussionsInOrgResponseItem]
  type TeamsListDiscussionsLegacyResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.TeamsListDiscussionsLegacyResponseItem]
  type TeamsListDiscussionsResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.TeamsListDiscussionsResponseItem]
  type TeamsListForAuthenticatedUserResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.TeamsListForAuthenticatedUserResponseItem]
  type TeamsListMembersInOrgResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.TeamsListMembersInOrgResponseItem]
  type TeamsListMembersLegacyResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.TeamsListMembersLegacyResponseItem]
  type TeamsListMembersResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.TeamsListMembersResponseItem]
  type TeamsListPendingInvitationsInOrgResponse = js.Array[
    typingsSlinky.octokitRest.mod.Octokit.TeamsListPendingInvitationsInOrgResponseItem
  ]
  type TeamsListPendingInvitationsLegacyResponse = js.Array[
    typingsSlinky.octokitRest.mod.Octokit.TeamsListPendingInvitationsLegacyResponseItem
  ]
  type TeamsListPendingInvitationsResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.TeamsListPendingInvitationsResponseItem]
  type TeamsListProjectsInOrgResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.TeamsListProjectsInOrgResponseItem]
  type TeamsListProjectsLegacyResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.TeamsListProjectsLegacyResponseItem]
  type TeamsListProjectsResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.TeamsListProjectsResponseItem]
  type TeamsListReposInOrgResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.TeamsListReposInOrgResponseItem]
  type TeamsListReposLegacyResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.TeamsListReposLegacyResponseItem]
  type TeamsListReposResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.TeamsListReposResponseItem]
  type TeamsListResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.TeamsListResponseItem]
  type UsersAddEmailsResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.UsersAddEmailsResponseItem]
  type UsersListBlockedResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.UsersListBlockedResponseItem]
  type UsersListEmailsResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.UsersListEmailsResponseItem]
  type UsersListFollowersForAuthenticatedUserResponse = js.Array[
    typingsSlinky.octokitRest.mod.Octokit.UsersListFollowersForAuthenticatedUserResponseItem
  ]
  type UsersListFollowersForUserResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.UsersListFollowersForUserResponseItem]
  type UsersListFollowingForAuthenticatedUserResponse = js.Array[
    typingsSlinky.octokitRest.mod.Octokit.UsersListFollowingForAuthenticatedUserResponseItem
  ]
  type UsersListFollowingForUserResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.UsersListFollowingForUserResponseItem]
  type UsersListGpgKeysForUserResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.UsersListGpgKeysForUserResponseItem]
  type UsersListGpgKeysResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.UsersListGpgKeysResponseItem]
  type UsersListPublicEmailsResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.UsersListPublicEmailsResponseItem]
  type UsersListPublicKeysForUserResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.UsersListPublicKeysForUserResponseItem]
  type UsersListPublicKeysResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.UsersListPublicKeysResponseItem]
  type UsersListResponse = js.Array[typingsSlinky.octokitRest.mod.Octokit.UsersListResponseItem]
  type UsersTogglePrimaryEmailVisibilityResponse = js.Array[
    typingsSlinky.octokitRest.mod.Octokit.UsersTogglePrimaryEmailVisibilityResponseItem
  ]
  type date = java.lang.String
  type json = js.Any
}
