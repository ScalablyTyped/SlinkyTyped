package typingsSlinky.octokitPluginPaginateRest

import typingsSlinky.octokitPluginPaginateRest.anon.Parameters
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersActionsListArtifactsForRepoEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersActionsListJobsForWorkflowRunEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersActionsListOrgSecretsEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersActionsListRepoAccessToSelfHostedRunnerGroupInOrgEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersActionsListRepoSecretsEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersActionsListRepoWorkflowsEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersActionsListRunnerApplicationsForOrgEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersActionsListRunnerApplicationsForRepoEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersActionsListSelectedReposForOrgSecretEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersActionsListSelfHostedRunnerGroupsForOrgEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersActionsListSelfHostedRunnersForOrgEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersActionsListSelfHostedRunnersForRepoEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersActionsListSelfHostedRunnersInGroupForOrgEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersActionsListWorkflowRunArtifactsEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersActionsListWorkflowRunsEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersActionsListWorkflowRunsForRepoEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersActivityListNotificationsForAuthenticatedUserEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersActivityListRepoNotificationsForAuthenticatedUserEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersActivityListReposStarredByAuthenticatedUserEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersActivityListReposStarredByUserEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersActivityListReposWatchedByUserEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersActivityListStargazersForRepoEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersActivityListWatchedReposForAuthenticatedUserEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersActivityListWatchersForRepoEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersAppsListAccountsForPlanEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersAppsListAccountsForPlanStubbedEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersAppsListInstallationReposForAuthenticatedUserEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersAppsListInstallationsForAuthenticatedUserEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersAppsListPlansEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersAppsListPlansStubbedEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersAppsListReposAccessibleToInstallationEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersAppsListSubscriptionsForAuthenticatedUserEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersAppsListSubscriptionsForAuthenticatedUserStubbedEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersChecksListAnnotationsEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersChecksListForRefEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersChecksListForSuiteEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersChecksListSuitesForRefEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersCodeScanningListAlertsForRepoEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersCodeScanningListRecentAnalysesEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersEnterpriseAdminListOrgAccessToSelfHostedRunnerGroupInEnterpriseEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersEnterpriseAdminListProvisionedGroupsEnterpriseEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersEnterpriseAdminListProvisionedIdentitiesEnterpriseEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersEnterpriseAdminListRunnerApplicationsForEnterpriseEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersEnterpriseAdminListSelfHostedRunnerGroupsForEnterpriseEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersEnterpriseAdminListSelfHostedRunnersForEnterpriseEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersEnterpriseAdminListSelfHostedRunnersInGroupForEnterpriseEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersGistsListCommentsEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersGistsListCommitsEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersGistsListEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersGistsListForUserEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersGistsListForksEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersGistsListPublicEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersGistsListStarredEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersGitListMatchingRefsEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersIssuesListAssigneesEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersIssuesListCommentsEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersIssuesListCommentsForRepoEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersIssuesListEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersIssuesListEventsEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersIssuesListEventsForRepoEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersIssuesListEventsForTimelineEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersIssuesListForAuthenticatedUserEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersIssuesListForOrgEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersIssuesListForRepoEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersIssuesListLabelsForMilestoneEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersIssuesListLabelsForRepoEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersIssuesListLabelsOnIssueEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersIssuesListMilestonesEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersMigrationsListForAuthenticatedUserEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersMigrationsListForOrgEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersMigrationsListReposForOrgEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersMigrationsListReposForUserEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersOrgsListAppInstallationsEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersOrgsListBlockedUsersEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersOrgsListEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersOrgsListForAuthenticatedUserEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersOrgsListForUserEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersOrgsListInvitationTeamsEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersOrgsListMembersEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersOrgsListMembershipsForAuthenticatedUserEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersOrgsListOutsideCollaboratorsEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersOrgsListPendingInvitationsEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersOrgsListPublicMembersEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersOrgsListSamlSsoAuthorizationsEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersOrgsListWebhooksEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersProjectsListCardsEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersProjectsListCollaboratorsEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersProjectsListColumnsEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersProjectsListForOrgEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersProjectsListForRepoEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersProjectsListForUserEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersPullsListCommentsForReviewEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersPullsListCommitsEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersPullsListEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersPullsListFilesEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersPullsListRequestedReviewersEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersPullsListReviewCommentsEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersPullsListReviewCommentsForRepoEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersPullsListReviewsEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersReactionsListForCommitCommentEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersReactionsListForIssueCommentEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersReactionsListForIssueEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersReactionsListForPullRequestReviewCommentEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersReactionsListForTeamDiscussionCommentInOrgEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersReactionsListForTeamDiscussionCommentLegacyEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersReactionsListForTeamDiscussionInOrgEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersReactionsListForTeamDiscussionLegacyEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersReposListBranchesEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersReposListBranchesForHeadCommitEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersReposListCollaboratorsEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersReposListCommentsForCommitEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersReposListCommitCommentsForRepoEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersReposListCommitStatusesForRefEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersReposListCommitsEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersReposListContributorsEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersReposListDeployKeysEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersReposListDeploymentStatusesEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersReposListDeploymentsEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersReposListForOrgEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersReposListForksEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersReposListInvitationsEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersReposListInvitationsForAuthenticatedUserEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersReposListLanguagesEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersReposListPagesBuildsEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersReposListPublicEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersReposListPullRequestsAssociatedWithCommitEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersReposListReleaseAssetsEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersReposListReleasesEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersReposListTagsEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersReposListTeamsEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersReposListWebhooksEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersResponse
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersScimListProvisionedIdentitiesEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersSearchCodeEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersSearchCommitsEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersSearchIssuesAndPullRequestsEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersSearchLabelsEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersSearchReposEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersSearchTopicsEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersSearchUsersEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersTeamsListChildInOrgEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersTeamsListChildLegacyEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersTeamsListDiscussionCommentsInOrgEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersTeamsListDiscussionCommentsLegacyEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersTeamsListDiscussionsInOrgEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersTeamsListDiscussionsLegacyEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersTeamsListEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersTeamsListForAuthenticatedUserEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersTeamsListIdPGroupsForLegacyEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersTeamsListIdPGroupsForOrgEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersTeamsListIdPGroupsInOrgEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersTeamsListMembersInOrgEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersTeamsListMembersLegacyEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersTeamsListPendingInvitationsInOrgEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersTeamsListPendingInvitationsLegacyEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersTeamsListProjectsInOrgEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersTeamsListProjectsLegacyEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersTeamsListReposInOrgEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersTeamsListReposLegacyEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersUsersListBlockedByAuthenticatedEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersUsersListEmailsForAuthenticatedEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersUsersListEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersUsersListFollowedByAuthenticatedEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersUsersListFollowersForAuthenticatedUserEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersUsersListFollowersForUserEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersUsersListFollowingForUserEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersUsersListGpgKeysForAuthenticatedEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersUsersListGpgKeysForUserEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersUsersListPublicEmailsForAuthenticatedEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersUsersListPublicKeysForUserEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.ParametersUsersListPublicSshKeysForAuthenticatedEndpoint
import typingsSlinky.octokitPluginPaginateRest.anon.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paginatingEndpointsMod {
  
  @js.native
  trait PaginatingEndpoints extends StObject {
    
    /**
      * @see https://developer.github.com/v3/apps/#list-installations-for-the-authenticated-app
      */
    @JSName("GET /app/installations")
    var `GET SlashappSlashinstallations`: Parameters = js.native
    
    /**
      * @see https://developer.github.com/v3/oauth_authorizations/#list-your-grants
      */
    @JSName("GET /applications/grants")
    var `GET SlashapplicationsSlashgrants`: Response = js.native
    
    /**
      * @see https://developer.github.com/v3/oauth_authorizations/#list-your-authorizations
      */
    @JSName("GET /authorizations")
    var `GET Slashauthorizations`: ParametersResponse = js.native
    
    /**
      * @see https://developer.github.com/v3/enterprise-admin/actions/#list-self-hosted-runner-groups-for-an-enterprise
      */
    @JSName("GET /enterprises/:enterprise/actions/runner-groups")
    var `GET SlashenterprisesSlashColonenterpriseSlashactionsSlashrunner-groups`: ParametersEnterpriseAdminListSelfHostedRunnerGroupsForEnterpriseEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/enterprise-admin/actions/#list-organization-access-to-a-self-hosted-runner-group-in-a-enterprise
      */
    @JSName("GET /enterprises/:enterprise/actions/runner-groups/:runner_group_id/organizations")
    var `GET SlashenterprisesSlashColonenterpriseSlashactionsSlashrunner-groupsSlashColonrunner_group_idSlashorganizations`: ParametersEnterpriseAdminListOrgAccessToSelfHostedRunnerGroupInEnterpriseEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/enterprise-admin/actions/#list-self-hosted-runners-in-a-group-for-an-enterprise
      */
    @JSName("GET /enterprises/:enterprise/actions/runner-groups/:runner_group_id/runners")
    var `GET SlashenterprisesSlashColonenterpriseSlashactionsSlashrunner-groupsSlashColonrunner_group_idSlashrunners`: ParametersEnterpriseAdminListSelfHostedRunnersInGroupForEnterpriseEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/enterprise-admin/actions/#list-self-hosted-runners-for-an-enterprise
      */
    @JSName("GET /enterprises/:enterprise/actions/runners")
    var `GET SlashenterprisesSlashColonenterpriseSlashactionsSlashrunners`: ParametersEnterpriseAdminListSelfHostedRunnersForEnterpriseEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/enterprise-admin/actions/#list-runner-applications-for-an-enterprise
      */
    @JSName("GET /enterprises/:enterprise/actions/runners/downloads")
    var `GET SlashenterprisesSlashColonenterpriseSlashactionsSlashrunnersSlashdownloads`: ParametersEnterpriseAdminListRunnerApplicationsForEnterpriseEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/gists/#list-gists-for-the-authenticated-user
      */
    @JSName("GET /gists")
    var `GET Slashgists`: ParametersGistsListEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/gists/comments/#list-gist-comments
      */
    @JSName("GET /gists/:gist_id/comments")
    var `GET SlashgistsSlashColongist_idSlashcomments`: ParametersGistsListCommentsEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/gists/#list-gist-commits
      */
    @JSName("GET /gists/:gist_id/commits")
    var `GET SlashgistsSlashColongist_idSlashcommits`: ParametersGistsListCommitsEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/gists/#list-gist-forks
      */
    @JSName("GET /gists/:gist_id/forks")
    var `GET SlashgistsSlashColongist_idSlashforks`: ParametersGistsListForksEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/gists/#list-public-gists
      */
    @JSName("GET /gists/public")
    var `GET SlashgistsSlashpublic`: ParametersGistsListPublicEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/gists/#list-starred-gists
      */
    @JSName("GET /gists/starred")
    var `GET SlashgistsSlashstarred`: ParametersGistsListStarredEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/apps/installations/#list-repositories-accessible-to-the-app-installation
      */
    @JSName("GET /installation/repositories")
    var `GET SlashinstallationSlashrepositories`: ParametersAppsListReposAccessibleToInstallationEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/issues/#list-issues-assigned-to-the-authenticated-user
      */
    @JSName("GET /issues")
    var `GET Slashissues`: ParametersIssuesListEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/apps/marketplace/#list-plans
      */
    @JSName("GET /marketplace_listing/plans")
    var `GET Slashmarketplace_listingSlashplans`: ParametersAppsListPlansEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/apps/marketplace/#list-accounts-for-a-plan
      */
    @JSName("GET /marketplace_listing/plans/:plan_id/accounts")
    var `GET Slashmarketplace_listingSlashplansSlashColonplan_idSlashaccounts`: ParametersAppsListAccountsForPlanEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/apps/marketplace/#list-plans-stubbed
      */
    @JSName("GET /marketplace_listing/stubbed/plans")
    var `GET Slashmarketplace_listingSlashstubbedSlashplans`: ParametersAppsListPlansStubbedEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/apps/marketplace/#list-accounts-for-a-plan-stubbed
      */
    @JSName("GET /marketplace_listing/stubbed/plans/:plan_id/accounts")
    var `GET Slashmarketplace_listingSlashstubbedSlashplansSlashColonplan_idSlashaccounts`: ParametersAppsListAccountsForPlanStubbedEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/activity/notifications/#list-notifications-for-the-authenticated-user
      */
    @JSName("GET /notifications")
    var `GET Slashnotifications`: ParametersActivityListNotificationsForAuthenticatedUserEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/orgs/#list-organizations
      */
    @JSName("GET /organizations")
    var `GET Slashorganizations`: ParametersOrgsListEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/actions/self-hosted-runner-groups/#list-self-hosted-runner-groups-for-an-organization
      */
    @JSName("GET /orgs/:org/actions/runner-groups")
    var `GET SlashorgsSlashColonorgSlashactionsSlashrunner-groups`: ParametersActionsListSelfHostedRunnerGroupsForOrgEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/actions/self-hosted-runner-groups/#list-repository-access-to-a-self-hosted-runner-group-in-an-organization
      */
    @JSName("GET /orgs/:org/actions/runner-groups/:runner_group_id/repositories")
    var `GET SlashorgsSlashColonorgSlashactionsSlashrunner-groupsSlashColonrunner_group_idSlashrepositories`: ParametersActionsListRepoAccessToSelfHostedRunnerGroupInOrgEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/actions/self-hosted-runner-groups/#list-self-hosted-runners-in-a-group-for-an-organization
      */
    @JSName("GET /orgs/:org/actions/runner-groups/:runner_group_id/runners")
    var `GET SlashorgsSlashColonorgSlashactionsSlashrunner-groupsSlashColonrunner_group_idSlashrunners`: ParametersActionsListSelfHostedRunnersInGroupForOrgEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/actions/self-hosted-runners/#list-self-hosted-runners-for-an-organization
      */
    @JSName("GET /orgs/:org/actions/runners")
    var `GET SlashorgsSlashColonorgSlashactionsSlashrunners`: ParametersActionsListSelfHostedRunnersForOrgEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/actions/self-hosted-runners/#list-runner-applications-for-an-organization
      */
    @JSName("GET /orgs/:org/actions/runners/downloads")
    var `GET SlashorgsSlashColonorgSlashactionsSlashrunnersSlashdownloads`: ParametersActionsListRunnerApplicationsForOrgEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/actions/secrets/#list-organization-secrets
      */
    @JSName("GET /orgs/:org/actions/secrets")
    var `GET SlashorgsSlashColonorgSlashactionsSlashsecrets`: ParametersActionsListOrgSecretsEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/actions/secrets/#list-selected-repositories-for-an-organization-secret
      */
    @JSName("GET /orgs/:org/actions/secrets/:secret_name/repositories")
    var `GET SlashorgsSlashColonorgSlashactionsSlashsecretsSlashColonsecret_nameSlashrepositories`: ParametersActionsListSelectedReposForOrgSecretEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/orgs/blocking/#list-users-blocked-by-an-organization
      */
    @JSName("GET /orgs/:org/blocks")
    var `GET SlashorgsSlashColonorgSlashblocks`: ParametersOrgsListBlockedUsersEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/orgs/#list-saml-sso-authorizations-for-an-organization
      */
    @JSName("GET /orgs/:org/credential-authorizations")
    var `GET SlashorgsSlashColonorgSlashcredential-authorizations`: ParametersOrgsListSamlSsoAuthorizationsEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/orgs/hooks/#list-organization-webhooks
      */
    @JSName("GET /orgs/:org/hooks")
    var `GET SlashorgsSlashColonorgSlashhooks`: ParametersOrgsListWebhooksEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/orgs/#list-app-installations-for-an-organization
      */
    @JSName("GET /orgs/:org/installations")
    var `GET SlashorgsSlashColonorgSlashinstallations`: ParametersOrgsListAppInstallationsEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/orgs/members/#list-pending-organization-invitations
      */
    @JSName("GET /orgs/:org/invitations")
    var `GET SlashorgsSlashColonorgSlashinvitations`: ParametersOrgsListPendingInvitationsEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/orgs/members/#list-organization-invitation-teams
      */
    @JSName("GET /orgs/:org/invitations/:invitation_id/teams")
    var `GET SlashorgsSlashColonorgSlashinvitationsSlashColoninvitation_idSlashteams`: ParametersOrgsListInvitationTeamsEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/issues/#list-organization-issues-assigned-to-the-authenticated-user
      */
    @JSName("GET /orgs/:org/issues")
    var `GET SlashorgsSlashColonorgSlashissues`: ParametersIssuesListForOrgEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/orgs/members/#list-organization-members
      */
    @JSName("GET /orgs/:org/members")
    var `GET SlashorgsSlashColonorgSlashmembers`: ParametersOrgsListMembersEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/migrations/orgs/#list-organization-migrations
      */
    @JSName("GET /orgs/:org/migrations")
    var `GET SlashorgsSlashColonorgSlashmigrations`: ParametersMigrationsListForOrgEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/migrations/orgs/#list-repositories-in-an-organization-migration
      */
    @JSName("GET /orgs/:org/migrations/:migration_id/repositories")
    var `GET SlashorgsSlashColonorgSlashmigrationsSlashColonmigration_idSlashrepositories`: ParametersMigrationsListReposForOrgEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/orgs/outside_collaborators/#list-outside-collaborators-for-an-organization
      */
    @JSName("GET /orgs/:org/outside_collaborators")
    var `GET SlashorgsSlashColonorgSlashoutside_collaborators`: ParametersOrgsListOutsideCollaboratorsEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/projects/#list-organization-projects
      */
    @JSName("GET /orgs/:org/projects")
    var `GET SlashorgsSlashColonorgSlashprojects`: ParametersProjectsListForOrgEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/orgs/members/#list-public-organization-members
      */
    @JSName("GET /orgs/:org/public_members")
    var `GET SlashorgsSlashColonorgSlashpublic_members`: ParametersOrgsListPublicMembersEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/repos/#list-organization-repositories
      */
    @JSName("GET /orgs/:org/repos")
    var `GET SlashorgsSlashColonorgSlashrepos`: ParametersReposListForOrgEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/teams/team_sync/#list-idp-groups-for-an-organization
      */
    @JSName("GET /orgs/:org/team-sync/groups")
    var `GET SlashorgsSlashColonorgSlashteam-syncSlashgroups`: ParametersTeamsListIdPGroupsForOrgEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/teams/#list-teams
      */
    @JSName("GET /orgs/:org/teams")
    var `GET SlashorgsSlashColonorgSlashteams`: ParametersTeamsListEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/teams/discussions/#list-discussions
      */
    @JSName("GET /orgs/:org/teams/:team_slug/discussions")
    var `GET SlashorgsSlashColonorgSlashteamsSlashColonteam_slugSlashdiscussions`: ParametersTeamsListDiscussionsInOrgEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/teams/discussion_comments/#list-discussion-comments
      */
    @JSName("GET /orgs/:org/teams/:team_slug/discussions/:discussion_number/comments")
    var `GET SlashorgsSlashColonorgSlashteamsSlashColonteam_slugSlashdiscussionsSlashColondiscussion_numberSlashcomments`: ParametersTeamsListDiscussionCommentsInOrgEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/reactions/#list-reactions-for-a-team-discussion-comment
      */
    @JSName("GET /orgs/:org/teams/:team_slug/discussions/:discussion_number/comments/:comment_number/reactions")
    var `GET SlashorgsSlashColonorgSlashteamsSlashColonteam_slugSlashdiscussionsSlashColondiscussion_numberSlashcommentsSlashColoncomment_numberSlashreactions`: ParametersReactionsListForTeamDiscussionCommentInOrgEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/reactions/#list-reactions-for-a-team-discussion
      */
    @JSName("GET /orgs/:org/teams/:team_slug/discussions/:discussion_number/reactions")
    var `GET SlashorgsSlashColonorgSlashteamsSlashColonteam_slugSlashdiscussionsSlashColondiscussion_numberSlashreactions`: ParametersReactionsListForTeamDiscussionInOrgEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/teams/members/#list-pending-team-invitations
      */
    @JSName("GET /orgs/:org/teams/:team_slug/invitations")
    var `GET SlashorgsSlashColonorgSlashteamsSlashColonteam_slugSlashinvitations`: ParametersTeamsListPendingInvitationsInOrgEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/teams/members/#list-team-members
      */
    @JSName("GET /orgs/:org/teams/:team_slug/members")
    var `GET SlashorgsSlashColonorgSlashteamsSlashColonteam_slugSlashmembers`: ParametersTeamsListMembersInOrgEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/teams/#list-team-projects
      */
    @JSName("GET /orgs/:org/teams/:team_slug/projects")
    var `GET SlashorgsSlashColonorgSlashteamsSlashColonteam_slugSlashprojects`: ParametersTeamsListProjectsInOrgEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/teams/#list-team-repositories
      */
    @JSName("GET /orgs/:org/teams/:team_slug/repos")
    var `GET SlashorgsSlashColonorgSlashteamsSlashColonteam_slugSlashrepos`: ParametersTeamsListReposInOrgEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/teams/team_sync/#list-idp-groups-for-a-team
      */
    @JSName("GET /orgs/:org/teams/:team_slug/team-sync/group-mappings")
    var `GET SlashorgsSlashColonorgSlashteamsSlashColonteam_slugSlashteam-syncSlashgroup-mappings`: ParametersTeamsListIdPGroupsInOrgEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/teams/#list-child-teams
      */
    @JSName("GET /orgs/:org/teams/:team_slug/teams")
    var `GET SlashorgsSlashColonorgSlashteamsSlashColonteam_slugSlashteams`: ParametersTeamsListChildInOrgEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/projects/collaborators/#list-project-collaborators
      */
    @JSName("GET /projects/:project_id/collaborators")
    var `GET SlashprojectsSlashColonproject_idSlashcollaborators`: ParametersProjectsListCollaboratorsEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/projects/columns/#list-project-columns
      */
    @JSName("GET /projects/:project_id/columns")
    var `GET SlashprojectsSlashColonproject_idSlashcolumns`: ParametersProjectsListColumnsEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/projects/cards/#list-project-cards
      */
    @JSName("GET /projects/columns/:column_id/cards")
    var `GET SlashprojectsSlashcolumnsSlashColoncolumn_idSlashcards`: ParametersProjectsListCardsEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/actions/artifacts/#list-artifacts-for-a-repository
      */
    @JSName("GET /repos/:owner/:repo/actions/artifacts")
    var `GET SlashreposSlashColonownerSlashColonrepoSlashactionsSlashartifacts`: ParametersActionsListArtifactsForRepoEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/actions/self-hosted-runners/#list-self-hosted-runners-for-a-repository
      */
    @JSName("GET /repos/:owner/:repo/actions/runners")
    var `GET SlashreposSlashColonownerSlashColonrepoSlashactionsSlashrunners`: ParametersActionsListSelfHostedRunnersForRepoEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/actions/self-hosted-runners/#list-runner-applications-for-a-repository
      */
    @JSName("GET /repos/:owner/:repo/actions/runners/downloads")
    var `GET SlashreposSlashColonownerSlashColonrepoSlashactionsSlashrunnersSlashdownloads`: ParametersActionsListRunnerApplicationsForRepoEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/actions/workflow-runs/#list-workflow-runs-for-a-repository
      */
    @JSName("GET /repos/:owner/:repo/actions/runs")
    var `GET SlashreposSlashColonownerSlashColonrepoSlashactionsSlashruns`: ParametersActionsListWorkflowRunsForRepoEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/actions/artifacts/#list-workflow-run-artifacts
      */
    @JSName("GET /repos/:owner/:repo/actions/runs/:run_id/artifacts")
    var `GET SlashreposSlashColonownerSlashColonrepoSlashactionsSlashrunsSlashColonrun_idSlashartifacts`: ParametersActionsListWorkflowRunArtifactsEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/actions/workflow-jobs/#list-jobs-for-a-workflow-run
      */
    @JSName("GET /repos/:owner/:repo/actions/runs/:run_id/jobs")
    var `GET SlashreposSlashColonownerSlashColonrepoSlashactionsSlashrunsSlashColonrun_idSlashjobs`: ParametersActionsListJobsForWorkflowRunEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/actions/secrets/#list-repository-secrets
      */
    @JSName("GET /repos/:owner/:repo/actions/secrets")
    var `GET SlashreposSlashColonownerSlashColonrepoSlashactionsSlashsecrets`: ParametersActionsListRepoSecretsEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/actions/workflows/#list-repository-workflows
      */
    @JSName("GET /repos/:owner/:repo/actions/workflows")
    var `GET SlashreposSlashColonownerSlashColonrepoSlashactionsSlashworkflows`: ParametersActionsListRepoWorkflowsEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/actions/workflow-runs/#list-workflow-runs
      */
    @JSName("GET /repos/:owner/:repo/actions/workflows/:workflow_id/runs")
    var `GET SlashreposSlashColonownerSlashColonrepoSlashactionsSlashworkflowsSlashColonworkflow_idSlashruns`: ParametersActionsListWorkflowRunsEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/issues/assignees/#list-assignees
      */
    @JSName("GET /repos/:owner/:repo/assignees")
    var `GET SlashreposSlashColonownerSlashColonrepoSlashassignees`: ParametersIssuesListAssigneesEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/repos/branches/#list-branches
      */
    @JSName("GET /repos/:owner/:repo/branches")
    var `GET SlashreposSlashColonownerSlashColonrepoSlashbranches`: ParametersReposListBranchesEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/checks/runs/#list-check-run-annotations
      */
    @JSName("GET /repos/:owner/:repo/check-runs/:check_run_id/annotations")
    var `GET SlashreposSlashColonownerSlashColonrepoSlashcheck-runsSlashColoncheck_run_idSlashannotations`: ParametersChecksListAnnotationsEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/checks/runs/#list-check-runs-in-a-check-suite
      */
    @JSName("GET /repos/:owner/:repo/check-suites/:check_suite_id/check-runs")
    var `GET SlashreposSlashColonownerSlashColonrepoSlashcheck-suitesSlashColoncheck_suite_idSlashcheck-runs`: ParametersChecksListForSuiteEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/code-scanning/#list-code-scanning-alerts-for-a-repository
      */
    @JSName("GET /repos/:owner/:repo/code-scanning/alerts")
    var `GET SlashreposSlashColonownerSlashColonrepoSlashcode-scanningSlashalerts`: ParametersCodeScanningListAlertsForRepoEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/code-scanning/#list-recent-analyses
      */
    @JSName("GET /repos/:owner/:repo/code-scanning/analyses")
    var `GET SlashreposSlashColonownerSlashColonrepoSlashcode-scanningSlashanalyses`: ParametersCodeScanningListRecentAnalysesEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/repos/collaborators/#list-repository-collaborators
      */
    @JSName("GET /repos/:owner/:repo/collaborators")
    var `GET SlashreposSlashColonownerSlashColonrepoSlashcollaborators`: ParametersReposListCollaboratorsEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/repos/comments/#list-commit-comments-for-a-repository
      */
    @JSName("GET /repos/:owner/:repo/comments")
    var `GET SlashreposSlashColonownerSlashColonrepoSlashcomments`: ParametersReposListCommitCommentsForRepoEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/reactions/#list-reactions-for-a-commit-comment
      */
    @JSName("GET /repos/:owner/:repo/comments/:comment_id/reactions")
    var `GET SlashreposSlashColonownerSlashColonrepoSlashcommentsSlashColoncomment_idSlashreactions`: ParametersReactionsListForCommitCommentEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/repos/commits/#list-commits
      */
    @JSName("GET /repos/:owner/:repo/commits")
    var `GET SlashreposSlashColonownerSlashColonrepoSlashcommits`: ParametersReposListCommitsEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/repos/commits/#list-branches-for-head-commit
      */
    @JSName("GET /repos/:owner/:repo/commits/:commit_sha/branches-where-head")
    var `GET SlashreposSlashColonownerSlashColonrepoSlashcommitsSlashColoncommit_shaSlashbranches-where-head`: ParametersReposListBranchesForHeadCommitEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/repos/comments/#list-commit-comments
      */
    @JSName("GET /repos/:owner/:repo/commits/:commit_sha/comments")
    var `GET SlashreposSlashColonownerSlashColonrepoSlashcommitsSlashColoncommit_shaSlashcomments`: ParametersReposListCommentsForCommitEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/repos/commits/#list-pull-requests-associated-with-a-commit
      */
    @JSName("GET /repos/:owner/:repo/commits/:commit_sha/pulls")
    var `GET SlashreposSlashColonownerSlashColonrepoSlashcommitsSlashColoncommit_shaSlashpulls`: ParametersReposListPullRequestsAssociatedWithCommitEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/checks/runs/#list-check-runs-for-a-git-reference
      */
    @JSName("GET /repos/:owner/:repo/commits/:ref/check-runs")
    var `GET SlashreposSlashColonownerSlashColonrepoSlashcommitsSlashColonrefSlashcheck-runs`: ParametersChecksListForRefEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/checks/suites/#list-check-suites-for-a-git-reference
      */
    @JSName("GET /repos/:owner/:repo/commits/:ref/check-suites")
    var `GET SlashreposSlashColonownerSlashColonrepoSlashcommitsSlashColonrefSlashcheck-suites`: ParametersChecksListSuitesForRefEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/repos/statuses/#list-commit-statuses-for-a-reference
      */
    @JSName("GET /repos/:owner/:repo/commits/:ref/statuses")
    var `GET SlashreposSlashColonownerSlashColonrepoSlashcommitsSlashColonrefSlashstatuses`: ParametersReposListCommitStatusesForRefEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/repos/#list-repository-contributors
      */
    @JSName("GET /repos/:owner/:repo/contributors")
    var `GET SlashreposSlashColonownerSlashColonrepoSlashcontributors`: ParametersReposListContributorsEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/repos/deployments/#list-deployments
      */
    @JSName("GET /repos/:owner/:repo/deployments")
    var `GET SlashreposSlashColonownerSlashColonrepoSlashdeployments`: ParametersReposListDeploymentsEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/repos/deployments/#list-deployment-statuses
      */
    @JSName("GET /repos/:owner/:repo/deployments/:deployment_id/statuses")
    var `GET SlashreposSlashColonownerSlashColonrepoSlashdeploymentsSlashColondeployment_idSlashstatuses`: ParametersReposListDeploymentStatusesEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/repos/forks/#list-forks
      */
    @JSName("GET /repos/:owner/:repo/forks")
    var `GET SlashreposSlashColonownerSlashColonrepoSlashforks`: ParametersReposListForksEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/git/refs/#list-matching-references
      */
    @JSName("GET /repos/:owner/:repo/git/matching-refs/:ref")
    var `GET SlashreposSlashColonownerSlashColonrepoSlashgitSlashmatching-refsSlashColonref`: ParametersGitListMatchingRefsEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/repos/hooks/#list-repository-webhooks
      */
    @JSName("GET /repos/:owner/:repo/hooks")
    var `GET SlashreposSlashColonownerSlashColonrepoSlashhooks`: ParametersReposListWebhooksEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/repos/invitations/#list-repository-invitations
      */
    @JSName("GET /repos/:owner/:repo/invitations")
    var `GET SlashreposSlashColonownerSlashColonrepoSlashinvitations`: ParametersReposListInvitationsEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/issues/#list-repository-issues
      */
    @JSName("GET /repos/:owner/:repo/issues")
    var `GET SlashreposSlashColonownerSlashColonrepoSlashissues`: ParametersIssuesListForRepoEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/issues/comments/#list-issue-comments
      */
    @JSName("GET /repos/:owner/:repo/issues/:issue_number/comments")
    var `GET SlashreposSlashColonownerSlashColonrepoSlashissuesSlashColonissue_numberSlashcomments`: ParametersIssuesListCommentsEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/issues/events/#list-issue-events
      */
    @JSName("GET /repos/:owner/:repo/issues/:issue_number/events")
    var `GET SlashreposSlashColonownerSlashColonrepoSlashissuesSlashColonissue_numberSlashevents`: ParametersIssuesListEventsEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/issues/labels/#list-labels-for-an-issue
      */
    @JSName("GET /repos/:owner/:repo/issues/:issue_number/labels")
    var `GET SlashreposSlashColonownerSlashColonrepoSlashissuesSlashColonissue_numberSlashlabels`: ParametersIssuesListLabelsOnIssueEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/reactions/#list-reactions-for-an-issue
      */
    @JSName("GET /repos/:owner/:repo/issues/:issue_number/reactions")
    var `GET SlashreposSlashColonownerSlashColonrepoSlashissuesSlashColonissue_numberSlashreactions`: ParametersReactionsListForIssueEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/issues/timeline/#list-timeline-events-for-an-issue
      */
    @JSName("GET /repos/:owner/:repo/issues/:issue_number/timeline")
    var `GET SlashreposSlashColonownerSlashColonrepoSlashissuesSlashColonissue_numberSlashtimeline`: ParametersIssuesListEventsForTimelineEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/issues/comments/#list-issue-comments-for-a-repository
      */
    @JSName("GET /repos/:owner/:repo/issues/comments")
    var `GET SlashreposSlashColonownerSlashColonrepoSlashissuesSlashcomments`: ParametersIssuesListCommentsForRepoEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/reactions/#list-reactions-for-an-issue-comment
      */
    @JSName("GET /repos/:owner/:repo/issues/comments/:comment_id/reactions")
    var `GET SlashreposSlashColonownerSlashColonrepoSlashissuesSlashcommentsSlashColoncomment_idSlashreactions`: ParametersReactionsListForIssueCommentEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/issues/events/#list-issue-events-for-a-repository
      */
    @JSName("GET /repos/:owner/:repo/issues/events")
    var `GET SlashreposSlashColonownerSlashColonrepoSlashissuesSlashevents`: ParametersIssuesListEventsForRepoEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/repos/keys/#list-deploy-keys
      */
    @JSName("GET /repos/:owner/:repo/keys")
    var `GET SlashreposSlashColonownerSlashColonrepoSlashkeys`: ParametersReposListDeployKeysEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/issues/labels/#list-labels-for-a-repository
      */
    @JSName("GET /repos/:owner/:repo/labels")
    var `GET SlashreposSlashColonownerSlashColonrepoSlashlabels`: ParametersIssuesListLabelsForRepoEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/repos/#list-repository-languages
      */
    @JSName("GET /repos/:owner/:repo/languages")
    var `GET SlashreposSlashColonownerSlashColonrepoSlashlanguages`: ParametersReposListLanguagesEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/issues/milestones/#list-milestones
      */
    @JSName("GET /repos/:owner/:repo/milestones")
    var `GET SlashreposSlashColonownerSlashColonrepoSlashmilestones`: ParametersIssuesListMilestonesEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/issues/labels/#list-labels-for-issues-in-a-milestone
      */
    @JSName("GET /repos/:owner/:repo/milestones/:milestone_number/labels")
    var `GET SlashreposSlashColonownerSlashColonrepoSlashmilestonesSlashColonmilestone_numberSlashlabels`: ParametersIssuesListLabelsForMilestoneEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/activity/notifications/#list-repository-notifications-for-the-authenticated-user
      */
    @JSName("GET /repos/:owner/:repo/notifications")
    var `GET SlashreposSlashColonownerSlashColonrepoSlashnotifications`: ParametersActivityListRepoNotificationsForAuthenticatedUserEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/repos/pages/#list-github-pages-builds
      */
    @JSName("GET /repos/:owner/:repo/pages/builds")
    var `GET SlashreposSlashColonownerSlashColonrepoSlashpagesSlashbuilds`: ParametersReposListPagesBuildsEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/projects/#list-repository-projects
      */
    @JSName("GET /repos/:owner/:repo/projects")
    var `GET SlashreposSlashColonownerSlashColonrepoSlashprojects`: ParametersProjectsListForRepoEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/pulls/#list-pull-requests
      */
    @JSName("GET /repos/:owner/:repo/pulls")
    var `GET SlashreposSlashColonownerSlashColonrepoSlashpulls`: ParametersPullsListEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/pulls/comments/#list-review-comments-on-a-pull-request
      */
    @JSName("GET /repos/:owner/:repo/pulls/:pull_number/comments")
    var `GET SlashreposSlashColonownerSlashColonrepoSlashpullsSlashColonpull_numberSlashcomments`: ParametersPullsListReviewCommentsEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/pulls/#list-commits-on-a-pull-request
      */
    @JSName("GET /repos/:owner/:repo/pulls/:pull_number/commits")
    var `GET SlashreposSlashColonownerSlashColonrepoSlashpullsSlashColonpull_numberSlashcommits`: ParametersPullsListCommitsEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/pulls/#list-pull-requests-files
      */
    @JSName("GET /repos/:owner/:repo/pulls/:pull_number/files")
    var `GET SlashreposSlashColonownerSlashColonrepoSlashpullsSlashColonpull_numberSlashfiles`: ParametersPullsListFilesEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/pulls/review_requests/#list-requested-reviewers-for-a-pull-request
      */
    @JSName("GET /repos/:owner/:repo/pulls/:pull_number/requested_reviewers")
    var `GET SlashreposSlashColonownerSlashColonrepoSlashpullsSlashColonpull_numberSlashrequested_reviewers`: ParametersPullsListRequestedReviewersEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/pulls/reviews/#list-reviews-for-a-pull-request
      */
    @JSName("GET /repos/:owner/:repo/pulls/:pull_number/reviews")
    var `GET SlashreposSlashColonownerSlashColonrepoSlashpullsSlashColonpull_numberSlashreviews`: ParametersPullsListReviewsEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/pulls/reviews/#list-comments-for-a-pull-request-review
      */
    @JSName("GET /repos/:owner/:repo/pulls/:pull_number/reviews/:review_id/comments")
    var `GET SlashreposSlashColonownerSlashColonrepoSlashpullsSlashColonpull_numberSlashreviewsSlashColonreview_idSlashcomments`: ParametersPullsListCommentsForReviewEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/pulls/comments/#list-review-comments-in-a-repository
      */
    @JSName("GET /repos/:owner/:repo/pulls/comments")
    var `GET SlashreposSlashColonownerSlashColonrepoSlashpullsSlashcomments`: ParametersPullsListReviewCommentsForRepoEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/reactions/#list-reactions-for-a-pull-request-review-comment
      */
    @JSName("GET /repos/:owner/:repo/pulls/comments/:comment_id/reactions")
    var `GET SlashreposSlashColonownerSlashColonrepoSlashpullsSlashcommentsSlashColoncomment_idSlashreactions`: ParametersReactionsListForPullRequestReviewCommentEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/repos/releases/#list-releases
      */
    @JSName("GET /repos/:owner/:repo/releases")
    var `GET SlashreposSlashColonownerSlashColonrepoSlashreleases`: ParametersReposListReleasesEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/repos/releases/#list-release-assets
      */
    @JSName("GET /repos/:owner/:repo/releases/:release_id/assets")
    var `GET SlashreposSlashColonownerSlashColonrepoSlashreleasesSlashColonrelease_idSlashassets`: ParametersReposListReleaseAssetsEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/activity/starring/#list-stargazers
      */
    @JSName("GET /repos/:owner/:repo/stargazers")
    var `GET SlashreposSlashColonownerSlashColonrepoSlashstargazers`: ParametersActivityListStargazersForRepoEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/activity/watching/#list-watchers
      */
    @JSName("GET /repos/:owner/:repo/subscribers")
    var `GET SlashreposSlashColonownerSlashColonrepoSlashsubscribers`: ParametersActivityListWatchersForRepoEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/repos/#list-repository-tags
      */
    @JSName("GET /repos/:owner/:repo/tags")
    var `GET SlashreposSlashColonownerSlashColonrepoSlashtags`: ParametersReposListTagsEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/repos/#list-repository-teams
      */
    @JSName("GET /repos/:owner/:repo/teams")
    var `GET SlashreposSlashColonownerSlashColonrepoSlashteams`: ParametersReposListTeamsEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/repos/#list-public-repositories
      */
    @JSName("GET /repositories")
    var `GET Slashrepositories`: ParametersReposListPublicEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/enterprise-admin/scim/#list-provisioned-scim groups-for-an-enterprise
      */
    @JSName("GET /scim/v2/enterprises/:enterprise/Groups")
    var `GET SlashscimSlashv2SlashenterprisesSlashColonenterpriseSlashGroups`: ParametersEnterpriseAdminListProvisionedGroupsEnterpriseEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/enterprise-admin/scim/#list-scim-provisioned-identities-for-an-enterprise
      */
    @JSName("GET /scim/v2/enterprises/:enterprise/Users")
    var `GET SlashscimSlashv2SlashenterprisesSlashColonenterpriseSlashUsers`: ParametersEnterpriseAdminListProvisionedIdentitiesEnterpriseEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/scim/#list-scim-provisioned-identities
      */
    @JSName("GET /scim/v2/organizations/:org/Users")
    var `GET SlashscimSlashv2SlashorganizationsSlashColonorgSlashUsers`: ParametersScimListProvisionedIdentitiesEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/search/#search-code
      */
    @JSName("GET /search/code")
    var `GET SlashsearchSlashcode`: ParametersSearchCodeEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/search/#search-commits
      */
    @JSName("GET /search/commits")
    var `GET SlashsearchSlashcommits`: ParametersSearchCommitsEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/search/#search-issues-and-pull-requests
      */
    @JSName("GET /search/issues")
    var `GET SlashsearchSlashissues`: ParametersSearchIssuesAndPullRequestsEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/search/#search-labels
      */
    @JSName("GET /search/labels")
    var `GET SlashsearchSlashlabels`: ParametersSearchLabelsEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/search/#search-repositories
      */
    @JSName("GET /search/repositories")
    var `GET SlashsearchSlashrepositories`: ParametersSearchReposEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/search/#search-topics
      */
    @JSName("GET /search/topics")
    var `GET SlashsearchSlashtopics`: ParametersSearchTopicsEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/search/#search-users
      */
    @JSName("GET /search/users")
    var `GET SlashsearchSlashusers`: ParametersSearchUsersEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/teams/discussions/#list-discussions-legacy
      */
    @JSName("GET /teams/:team_id/discussions")
    var `GET SlashteamsSlashColonteam_idSlashdiscussions`: ParametersTeamsListDiscussionsLegacyEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/teams/discussion_comments/#list-discussion-comments-legacy
      */
    @JSName("GET /teams/:team_id/discussions/:discussion_number/comments")
    var `GET SlashteamsSlashColonteam_idSlashdiscussionsSlashColondiscussion_numberSlashcomments`: ParametersTeamsListDiscussionCommentsLegacyEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/reactions/#list-reactions-for-a-team-discussion-comment-legacy
      */
    @JSName("GET /teams/:team_id/discussions/:discussion_number/comments/:comment_number/reactions")
    var `GET SlashteamsSlashColonteam_idSlashdiscussionsSlashColondiscussion_numberSlashcommentsSlashColoncomment_numberSlashreactions`: ParametersReactionsListForTeamDiscussionCommentLegacyEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/reactions/#list-reactions-for-a-team-discussion-legacy
      */
    @JSName("GET /teams/:team_id/discussions/:discussion_number/reactions")
    var `GET SlashteamsSlashColonteam_idSlashdiscussionsSlashColondiscussion_numberSlashreactions`: ParametersReactionsListForTeamDiscussionLegacyEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/teams/members/#list-pending-team-invitations-legacy
      */
    @JSName("GET /teams/:team_id/invitations")
    var `GET SlashteamsSlashColonteam_idSlashinvitations`: ParametersTeamsListPendingInvitationsLegacyEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/teams/members/#list-team-members-legacy
      */
    @JSName("GET /teams/:team_id/members")
    var `GET SlashteamsSlashColonteam_idSlashmembers`: ParametersTeamsListMembersLegacyEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/teams/#list-team-projects-legacy
      */
    @JSName("GET /teams/:team_id/projects")
    var `GET SlashteamsSlashColonteam_idSlashprojects`: ParametersTeamsListProjectsLegacyEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/teams/#list-team-repositories-legacy
      */
    @JSName("GET /teams/:team_id/repos")
    var `GET SlashteamsSlashColonteam_idSlashrepos`: ParametersTeamsListReposLegacyEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/teams/team_sync/#list-idp-groups-for-a-team-legacy
      */
    @JSName("GET /teams/:team_id/team-sync/group-mappings")
    var `GET SlashteamsSlashColonteam_idSlashteam-syncSlashgroup-mappings`: ParametersTeamsListIdPGroupsForLegacyEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/teams/#list-child-teams-legacy
      */
    @JSName("GET /teams/:team_id/teams")
    var `GET SlashteamsSlashColonteam_idSlashteams`: ParametersTeamsListChildLegacyEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/users/blocking/#list-users-blocked-by-the-authenticated-user
      */
    @JSName("GET /user/blocks")
    var `GET SlashuserSlashblocks`: ParametersUsersListBlockedByAuthenticatedEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/users/emails/#list-email-addresses-for-the-authenticated-user
      */
    @JSName("GET /user/emails")
    var `GET SlashuserSlashemails`: ParametersUsersListEmailsForAuthenticatedEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/users/followers/#list-followers-of-the-authenticated-user
      */
    @JSName("GET /user/followers")
    var `GET SlashuserSlashfollowers`: ParametersUsersListFollowersForAuthenticatedUserEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/users/followers/#list-the-people-the-authenticated-user-follows
      */
    @JSName("GET /user/following")
    var `GET SlashuserSlashfollowing`: ParametersUsersListFollowedByAuthenticatedEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/users/gpg_keys/#list-gpg-keys-for-the-authenticated-user
      */
    @JSName("GET /user/gpg_keys")
    var `GET SlashuserSlashgpg_keys`: ParametersUsersListGpgKeysForAuthenticatedEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/apps/installations/#list-app-installations-accessible-to-the-user-access-token
      */
    @JSName("GET /user/installations")
    var `GET SlashuserSlashinstallations`: ParametersAppsListInstallationsForAuthenticatedUserEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/apps/installations/#list-repositories-accessible-to-the-user-access-token
      */
    @JSName("GET /user/installations/:installation_id/repositories")
    var `GET SlashuserSlashinstallationsSlashColoninstallation_idSlashrepositories`: ParametersAppsListInstallationReposForAuthenticatedUserEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/issues/#list-user-account-issues-assigned-to-the-authenticated-user
      */
    @JSName("GET /user/issues")
    var `GET SlashuserSlashissues`: ParametersIssuesListForAuthenticatedUserEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/users/keys/#list-public-ssh-keys-for-the-authenticated-user
      */
    @JSName("GET /user/keys")
    var `GET SlashuserSlashkeys`: ParametersUsersListPublicSshKeysForAuthenticatedEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/apps/marketplace/#list-subscriptions-for-the-authenticated-user
      */
    @JSName("GET /user/marketplace_purchases")
    var `GET SlashuserSlashmarketplace_purchases`: ParametersAppsListSubscriptionsForAuthenticatedUserEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/apps/marketplace/#list-subscriptions-for-the-authenticated-user-stubbed
      */
    @JSName("GET /user/marketplace_purchases/stubbed")
    var `GET SlashuserSlashmarketplace_purchasesSlashstubbed`: ParametersAppsListSubscriptionsForAuthenticatedUserStubbedEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/orgs/members/#list-organization-memberships-for-the-authenticated-user
      */
    @JSName("GET /user/memberships/orgs")
    var `GET SlashuserSlashmembershipsSlashorgs`: ParametersOrgsListMembershipsForAuthenticatedUserEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/migrations/users/#list-user-migrations
      */
    @JSName("GET /user/migrations")
    var `GET SlashuserSlashmigrations`: ParametersMigrationsListForAuthenticatedUserEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/migrations/users/#list-repositories-for-a-user-migration
      */
    @JSName("GET /user/migrations/:migration_id/repositories")
    var `GET SlashuserSlashmigrationsSlashColonmigration_idSlashrepositories`: ParametersMigrationsListReposForUserEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/orgs/#list-organizations-for-the-authenticated-user
      */
    @JSName("GET /user/orgs")
    var `GET SlashuserSlashorgs`: ParametersOrgsListForAuthenticatedUserEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/users/emails/#list-public-email-addresses-for-the-authenticated-user
      */
    @JSName("GET /user/public_emails")
    var `GET SlashuserSlashpublic_emails`: ParametersUsersListPublicEmailsForAuthenticatedEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/repos/invitations/#list-repository-invitations-for-the-authenticated-user
      */
    @JSName("GET /user/repository_invitations")
    var `GET SlashuserSlashrepository_invitations`: ParametersReposListInvitationsForAuthenticatedUserEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/activity/starring/#list-repositories-starred-by-the-authenticated-user
      */
    @JSName("GET /user/starred")
    var `GET SlashuserSlashstarred`: ParametersActivityListReposStarredByAuthenticatedUserEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/activity/watching/#list-repositories-watched-by-the-authenticated-user
      */
    @JSName("GET /user/subscriptions")
    var `GET SlashuserSlashsubscriptions`: ParametersActivityListWatchedReposForAuthenticatedUserEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/teams/#list-teams-for-the-authenticated-user
      */
    @JSName("GET /user/teams")
    var `GET SlashuserSlashteams`: ParametersTeamsListForAuthenticatedUserEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/users/#list-users
      */
    @JSName("GET /users")
    var `GET Slashusers`: ParametersUsersListEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/users/followers/#list-followers-of-a-user
      */
    @JSName("GET /users/:username/followers")
    var `GET SlashusersSlashColonusernameSlashfollowers`: ParametersUsersListFollowersForUserEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/users/followers/#list-the-people-a-user-follows
      */
    @JSName("GET /users/:username/following")
    var `GET SlashusersSlashColonusernameSlashfollowing`: ParametersUsersListFollowingForUserEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/gists/#list-gists-for-a-user
      */
    @JSName("GET /users/:username/gists")
    var `GET SlashusersSlashColonusernameSlashgists`: ParametersGistsListForUserEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/users/gpg_keys/#list-gpg-keys-for-a-user
      */
    @JSName("GET /users/:username/gpg_keys")
    var `GET SlashusersSlashColonusernameSlashgpg_keys`: ParametersUsersListGpgKeysForUserEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/users/keys/#list-public-keys-for-a-user
      */
    @JSName("GET /users/:username/keys")
    var `GET SlashusersSlashColonusernameSlashkeys`: ParametersUsersListPublicKeysForUserEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/orgs/#list-organizations-for-a-user
      */
    @JSName("GET /users/:username/orgs")
    var `GET SlashusersSlashColonusernameSlashorgs`: ParametersOrgsListForUserEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/projects/#list-user-projects
      */
    @JSName("GET /users/:username/projects")
    var `GET SlashusersSlashColonusernameSlashprojects`: ParametersProjectsListForUserEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/activity/starring/#list-repositories-starred-by-a-user
      */
    @JSName("GET /users/:username/starred")
    var `GET SlashusersSlashColonusernameSlashstarred`: ParametersActivityListReposStarredByUserEndpoint = js.native
    
    /**
      * @see https://developer.github.com/v3/activity/watching/#list-repositories-watched-by-a-user
      */
    @JSName("GET /users/:username/subscriptions")
    var `GET SlashusersSlashColonusernameSlashsubscriptions`: ParametersActivityListReposWatchedByUserEndpoint = js.native
  }
  object PaginatingEndpoints {
    
    @scala.inline
    def apply(
      `GET SlashappSlashinstallations`: Parameters,
      `GET SlashapplicationsSlashgrants`: Response,
      `GET Slashauthorizations`: ParametersResponse,
      `GET SlashenterprisesSlashColonenterpriseSlashactionsSlashrunner-groups`: ParametersEnterpriseAdminListSelfHostedRunnerGroupsForEnterpriseEndpoint,
      `GET SlashenterprisesSlashColonenterpriseSlashactionsSlashrunner-groupsSlashColonrunner_group_idSlashorganizations`: ParametersEnterpriseAdminListOrgAccessToSelfHostedRunnerGroupInEnterpriseEndpoint,
      `GET SlashenterprisesSlashColonenterpriseSlashactionsSlashrunner-groupsSlashColonrunner_group_idSlashrunners`: ParametersEnterpriseAdminListSelfHostedRunnersInGroupForEnterpriseEndpoint,
      `GET SlashenterprisesSlashColonenterpriseSlashactionsSlashrunners`: ParametersEnterpriseAdminListSelfHostedRunnersForEnterpriseEndpoint,
      `GET SlashenterprisesSlashColonenterpriseSlashactionsSlashrunnersSlashdownloads`: ParametersEnterpriseAdminListRunnerApplicationsForEnterpriseEndpoint,
      `GET Slashgists`: ParametersGistsListEndpoint,
      `GET SlashgistsSlashColongist_idSlashcomments`: ParametersGistsListCommentsEndpoint,
      `GET SlashgistsSlashColongist_idSlashcommits`: ParametersGistsListCommitsEndpoint,
      `GET SlashgistsSlashColongist_idSlashforks`: ParametersGistsListForksEndpoint,
      `GET SlashgistsSlashpublic`: ParametersGistsListPublicEndpoint,
      `GET SlashgistsSlashstarred`: ParametersGistsListStarredEndpoint,
      `GET SlashinstallationSlashrepositories`: ParametersAppsListReposAccessibleToInstallationEndpoint,
      `GET Slashissues`: ParametersIssuesListEndpoint,
      `GET Slashmarketplace_listingSlashplans`: ParametersAppsListPlansEndpoint,
      `GET Slashmarketplace_listingSlashplansSlashColonplan_idSlashaccounts`: ParametersAppsListAccountsForPlanEndpoint,
      `GET Slashmarketplace_listingSlashstubbedSlashplans`: ParametersAppsListPlansStubbedEndpoint,
      `GET Slashmarketplace_listingSlashstubbedSlashplansSlashColonplan_idSlashaccounts`: ParametersAppsListAccountsForPlanStubbedEndpoint,
      `GET Slashnotifications`: ParametersActivityListNotificationsForAuthenticatedUserEndpoint,
      `GET Slashorganizations`: ParametersOrgsListEndpoint,
      `GET SlashorgsSlashColonorgSlashactionsSlashrunner-groups`: ParametersActionsListSelfHostedRunnerGroupsForOrgEndpoint,
      `GET SlashorgsSlashColonorgSlashactionsSlashrunner-groupsSlashColonrunner_group_idSlashrepositories`: ParametersActionsListRepoAccessToSelfHostedRunnerGroupInOrgEndpoint,
      `GET SlashorgsSlashColonorgSlashactionsSlashrunner-groupsSlashColonrunner_group_idSlashrunners`: ParametersActionsListSelfHostedRunnersInGroupForOrgEndpoint,
      `GET SlashorgsSlashColonorgSlashactionsSlashrunners`: ParametersActionsListSelfHostedRunnersForOrgEndpoint,
      `GET SlashorgsSlashColonorgSlashactionsSlashrunnersSlashdownloads`: ParametersActionsListRunnerApplicationsForOrgEndpoint,
      `GET SlashorgsSlashColonorgSlashactionsSlashsecrets`: ParametersActionsListOrgSecretsEndpoint,
      `GET SlashorgsSlashColonorgSlashactionsSlashsecretsSlashColonsecret_nameSlashrepositories`: ParametersActionsListSelectedReposForOrgSecretEndpoint,
      `GET SlashorgsSlashColonorgSlashblocks`: ParametersOrgsListBlockedUsersEndpoint,
      `GET SlashorgsSlashColonorgSlashcredential-authorizations`: ParametersOrgsListSamlSsoAuthorizationsEndpoint,
      `GET SlashorgsSlashColonorgSlashhooks`: ParametersOrgsListWebhooksEndpoint,
      `GET SlashorgsSlashColonorgSlashinstallations`: ParametersOrgsListAppInstallationsEndpoint,
      `GET SlashorgsSlashColonorgSlashinvitations`: ParametersOrgsListPendingInvitationsEndpoint,
      `GET SlashorgsSlashColonorgSlashinvitationsSlashColoninvitation_idSlashteams`: ParametersOrgsListInvitationTeamsEndpoint,
      `GET SlashorgsSlashColonorgSlashissues`: ParametersIssuesListForOrgEndpoint,
      `GET SlashorgsSlashColonorgSlashmembers`: ParametersOrgsListMembersEndpoint,
      `GET SlashorgsSlashColonorgSlashmigrations`: ParametersMigrationsListForOrgEndpoint,
      `GET SlashorgsSlashColonorgSlashmigrationsSlashColonmigration_idSlashrepositories`: ParametersMigrationsListReposForOrgEndpoint,
      `GET SlashorgsSlashColonorgSlashoutside_collaborators`: ParametersOrgsListOutsideCollaboratorsEndpoint,
      `GET SlashorgsSlashColonorgSlashprojects`: ParametersProjectsListForOrgEndpoint,
      `GET SlashorgsSlashColonorgSlashpublic_members`: ParametersOrgsListPublicMembersEndpoint,
      `GET SlashorgsSlashColonorgSlashrepos`: ParametersReposListForOrgEndpoint,
      `GET SlashorgsSlashColonorgSlashteam-syncSlashgroups`: ParametersTeamsListIdPGroupsForOrgEndpoint,
      `GET SlashorgsSlashColonorgSlashteams`: ParametersTeamsListEndpoint,
      `GET SlashorgsSlashColonorgSlashteamsSlashColonteam_slugSlashdiscussions`: ParametersTeamsListDiscussionsInOrgEndpoint,
      `GET SlashorgsSlashColonorgSlashteamsSlashColonteam_slugSlashdiscussionsSlashColondiscussion_numberSlashcomments`: ParametersTeamsListDiscussionCommentsInOrgEndpoint,
      `GET SlashorgsSlashColonorgSlashteamsSlashColonteam_slugSlashdiscussionsSlashColondiscussion_numberSlashcommentsSlashColoncomment_numberSlashreactions`: ParametersReactionsListForTeamDiscussionCommentInOrgEndpoint,
      `GET SlashorgsSlashColonorgSlashteamsSlashColonteam_slugSlashdiscussionsSlashColondiscussion_numberSlashreactions`: ParametersReactionsListForTeamDiscussionInOrgEndpoint,
      `GET SlashorgsSlashColonorgSlashteamsSlashColonteam_slugSlashinvitations`: ParametersTeamsListPendingInvitationsInOrgEndpoint,
      `GET SlashorgsSlashColonorgSlashteamsSlashColonteam_slugSlashmembers`: ParametersTeamsListMembersInOrgEndpoint,
      `GET SlashorgsSlashColonorgSlashteamsSlashColonteam_slugSlashprojects`: ParametersTeamsListProjectsInOrgEndpoint,
      `GET SlashorgsSlashColonorgSlashteamsSlashColonteam_slugSlashrepos`: ParametersTeamsListReposInOrgEndpoint,
      `GET SlashorgsSlashColonorgSlashteamsSlashColonteam_slugSlashteam-syncSlashgroup-mappings`: ParametersTeamsListIdPGroupsInOrgEndpoint,
      `GET SlashorgsSlashColonorgSlashteamsSlashColonteam_slugSlashteams`: ParametersTeamsListChildInOrgEndpoint,
      `GET SlashprojectsSlashColonproject_idSlashcollaborators`: ParametersProjectsListCollaboratorsEndpoint,
      `GET SlashprojectsSlashColonproject_idSlashcolumns`: ParametersProjectsListColumnsEndpoint,
      `GET SlashprojectsSlashcolumnsSlashColoncolumn_idSlashcards`: ParametersProjectsListCardsEndpoint,
      `GET SlashreposSlashColonownerSlashColonrepoSlashactionsSlashartifacts`: ParametersActionsListArtifactsForRepoEndpoint,
      `GET SlashreposSlashColonownerSlashColonrepoSlashactionsSlashrunners`: ParametersActionsListSelfHostedRunnersForRepoEndpoint,
      `GET SlashreposSlashColonownerSlashColonrepoSlashactionsSlashrunnersSlashdownloads`: ParametersActionsListRunnerApplicationsForRepoEndpoint,
      `GET SlashreposSlashColonownerSlashColonrepoSlashactionsSlashruns`: ParametersActionsListWorkflowRunsForRepoEndpoint,
      `GET SlashreposSlashColonownerSlashColonrepoSlashactionsSlashrunsSlashColonrun_idSlashartifacts`: ParametersActionsListWorkflowRunArtifactsEndpoint,
      `GET SlashreposSlashColonownerSlashColonrepoSlashactionsSlashrunsSlashColonrun_idSlashjobs`: ParametersActionsListJobsForWorkflowRunEndpoint,
      `GET SlashreposSlashColonownerSlashColonrepoSlashactionsSlashsecrets`: ParametersActionsListRepoSecretsEndpoint,
      `GET SlashreposSlashColonownerSlashColonrepoSlashactionsSlashworkflows`: ParametersActionsListRepoWorkflowsEndpoint,
      `GET SlashreposSlashColonownerSlashColonrepoSlashactionsSlashworkflowsSlashColonworkflow_idSlashruns`: ParametersActionsListWorkflowRunsEndpoint,
      `GET SlashreposSlashColonownerSlashColonrepoSlashassignees`: ParametersIssuesListAssigneesEndpoint,
      `GET SlashreposSlashColonownerSlashColonrepoSlashbranches`: ParametersReposListBranchesEndpoint,
      `GET SlashreposSlashColonownerSlashColonrepoSlashcheck-runsSlashColoncheck_run_idSlashannotations`: ParametersChecksListAnnotationsEndpoint,
      `GET SlashreposSlashColonownerSlashColonrepoSlashcheck-suitesSlashColoncheck_suite_idSlashcheck-runs`: ParametersChecksListForSuiteEndpoint,
      `GET SlashreposSlashColonownerSlashColonrepoSlashcode-scanningSlashalerts`: ParametersCodeScanningListAlertsForRepoEndpoint,
      `GET SlashreposSlashColonownerSlashColonrepoSlashcode-scanningSlashanalyses`: ParametersCodeScanningListRecentAnalysesEndpoint,
      `GET SlashreposSlashColonownerSlashColonrepoSlashcollaborators`: ParametersReposListCollaboratorsEndpoint,
      `GET SlashreposSlashColonownerSlashColonrepoSlashcomments`: ParametersReposListCommitCommentsForRepoEndpoint,
      `GET SlashreposSlashColonownerSlashColonrepoSlashcommentsSlashColoncomment_idSlashreactions`: ParametersReactionsListForCommitCommentEndpoint,
      `GET SlashreposSlashColonownerSlashColonrepoSlashcommits`: ParametersReposListCommitsEndpoint,
      `GET SlashreposSlashColonownerSlashColonrepoSlashcommitsSlashColoncommit_shaSlashbranches-where-head`: ParametersReposListBranchesForHeadCommitEndpoint,
      `GET SlashreposSlashColonownerSlashColonrepoSlashcommitsSlashColoncommit_shaSlashcomments`: ParametersReposListCommentsForCommitEndpoint,
      `GET SlashreposSlashColonownerSlashColonrepoSlashcommitsSlashColoncommit_shaSlashpulls`: ParametersReposListPullRequestsAssociatedWithCommitEndpoint,
      `GET SlashreposSlashColonownerSlashColonrepoSlashcommitsSlashColonrefSlashcheck-runs`: ParametersChecksListForRefEndpoint,
      `GET SlashreposSlashColonownerSlashColonrepoSlashcommitsSlashColonrefSlashcheck-suites`: ParametersChecksListSuitesForRefEndpoint,
      `GET SlashreposSlashColonownerSlashColonrepoSlashcommitsSlashColonrefSlashstatuses`: ParametersReposListCommitStatusesForRefEndpoint,
      `GET SlashreposSlashColonownerSlashColonrepoSlashcontributors`: ParametersReposListContributorsEndpoint,
      `GET SlashreposSlashColonownerSlashColonrepoSlashdeployments`: ParametersReposListDeploymentsEndpoint,
      `GET SlashreposSlashColonownerSlashColonrepoSlashdeploymentsSlashColondeployment_idSlashstatuses`: ParametersReposListDeploymentStatusesEndpoint,
      `GET SlashreposSlashColonownerSlashColonrepoSlashforks`: ParametersReposListForksEndpoint,
      `GET SlashreposSlashColonownerSlashColonrepoSlashgitSlashmatching-refsSlashColonref`: ParametersGitListMatchingRefsEndpoint,
      `GET SlashreposSlashColonownerSlashColonrepoSlashhooks`: ParametersReposListWebhooksEndpoint,
      `GET SlashreposSlashColonownerSlashColonrepoSlashinvitations`: ParametersReposListInvitationsEndpoint,
      `GET SlashreposSlashColonownerSlashColonrepoSlashissues`: ParametersIssuesListForRepoEndpoint,
      `GET SlashreposSlashColonownerSlashColonrepoSlashissuesSlashColonissue_numberSlashcomments`: ParametersIssuesListCommentsEndpoint,
      `GET SlashreposSlashColonownerSlashColonrepoSlashissuesSlashColonissue_numberSlashevents`: ParametersIssuesListEventsEndpoint,
      `GET SlashreposSlashColonownerSlashColonrepoSlashissuesSlashColonissue_numberSlashlabels`: ParametersIssuesListLabelsOnIssueEndpoint,
      `GET SlashreposSlashColonownerSlashColonrepoSlashissuesSlashColonissue_numberSlashreactions`: ParametersReactionsListForIssueEndpoint,
      `GET SlashreposSlashColonownerSlashColonrepoSlashissuesSlashColonissue_numberSlashtimeline`: ParametersIssuesListEventsForTimelineEndpoint,
      `GET SlashreposSlashColonownerSlashColonrepoSlashissuesSlashcomments`: ParametersIssuesListCommentsForRepoEndpoint,
      `GET SlashreposSlashColonownerSlashColonrepoSlashissuesSlashcommentsSlashColoncomment_idSlashreactions`: ParametersReactionsListForIssueCommentEndpoint,
      `GET SlashreposSlashColonownerSlashColonrepoSlashissuesSlashevents`: ParametersIssuesListEventsForRepoEndpoint,
      `GET SlashreposSlashColonownerSlashColonrepoSlashkeys`: ParametersReposListDeployKeysEndpoint,
      `GET SlashreposSlashColonownerSlashColonrepoSlashlabels`: ParametersIssuesListLabelsForRepoEndpoint,
      `GET SlashreposSlashColonownerSlashColonrepoSlashlanguages`: ParametersReposListLanguagesEndpoint,
      `GET SlashreposSlashColonownerSlashColonrepoSlashmilestones`: ParametersIssuesListMilestonesEndpoint,
      `GET SlashreposSlashColonownerSlashColonrepoSlashmilestonesSlashColonmilestone_numberSlashlabels`: ParametersIssuesListLabelsForMilestoneEndpoint,
      `GET SlashreposSlashColonownerSlashColonrepoSlashnotifications`: ParametersActivityListRepoNotificationsForAuthenticatedUserEndpoint,
      `GET SlashreposSlashColonownerSlashColonrepoSlashpagesSlashbuilds`: ParametersReposListPagesBuildsEndpoint,
      `GET SlashreposSlashColonownerSlashColonrepoSlashprojects`: ParametersProjectsListForRepoEndpoint,
      `GET SlashreposSlashColonownerSlashColonrepoSlashpulls`: ParametersPullsListEndpoint,
      `GET SlashreposSlashColonownerSlashColonrepoSlashpullsSlashColonpull_numberSlashcomments`: ParametersPullsListReviewCommentsEndpoint,
      `GET SlashreposSlashColonownerSlashColonrepoSlashpullsSlashColonpull_numberSlashcommits`: ParametersPullsListCommitsEndpoint,
      `GET SlashreposSlashColonownerSlashColonrepoSlashpullsSlashColonpull_numberSlashfiles`: ParametersPullsListFilesEndpoint,
      `GET SlashreposSlashColonownerSlashColonrepoSlashpullsSlashColonpull_numberSlashrequested_reviewers`: ParametersPullsListRequestedReviewersEndpoint,
      `GET SlashreposSlashColonownerSlashColonrepoSlashpullsSlashColonpull_numberSlashreviews`: ParametersPullsListReviewsEndpoint,
      `GET SlashreposSlashColonownerSlashColonrepoSlashpullsSlashColonpull_numberSlashreviewsSlashColonreview_idSlashcomments`: ParametersPullsListCommentsForReviewEndpoint,
      `GET SlashreposSlashColonownerSlashColonrepoSlashpullsSlashcomments`: ParametersPullsListReviewCommentsForRepoEndpoint,
      `GET SlashreposSlashColonownerSlashColonrepoSlashpullsSlashcommentsSlashColoncomment_idSlashreactions`: ParametersReactionsListForPullRequestReviewCommentEndpoint,
      `GET SlashreposSlashColonownerSlashColonrepoSlashreleases`: ParametersReposListReleasesEndpoint,
      `GET SlashreposSlashColonownerSlashColonrepoSlashreleasesSlashColonrelease_idSlashassets`: ParametersReposListReleaseAssetsEndpoint,
      `GET SlashreposSlashColonownerSlashColonrepoSlashstargazers`: ParametersActivityListStargazersForRepoEndpoint,
      `GET SlashreposSlashColonownerSlashColonrepoSlashsubscribers`: ParametersActivityListWatchersForRepoEndpoint,
      `GET SlashreposSlashColonownerSlashColonrepoSlashtags`: ParametersReposListTagsEndpoint,
      `GET SlashreposSlashColonownerSlashColonrepoSlashteams`: ParametersReposListTeamsEndpoint,
      `GET Slashrepositories`: ParametersReposListPublicEndpoint,
      `GET SlashscimSlashv2SlashenterprisesSlashColonenterpriseSlashGroups`: ParametersEnterpriseAdminListProvisionedGroupsEnterpriseEndpoint,
      `GET SlashscimSlashv2SlashenterprisesSlashColonenterpriseSlashUsers`: ParametersEnterpriseAdminListProvisionedIdentitiesEnterpriseEndpoint,
      `GET SlashscimSlashv2SlashorganizationsSlashColonorgSlashUsers`: ParametersScimListProvisionedIdentitiesEndpoint,
      `GET SlashsearchSlashcode`: ParametersSearchCodeEndpoint,
      `GET SlashsearchSlashcommits`: ParametersSearchCommitsEndpoint,
      `GET SlashsearchSlashissues`: ParametersSearchIssuesAndPullRequestsEndpoint,
      `GET SlashsearchSlashlabels`: ParametersSearchLabelsEndpoint,
      `GET SlashsearchSlashrepositories`: ParametersSearchReposEndpoint,
      `GET SlashsearchSlashtopics`: ParametersSearchTopicsEndpoint,
      `GET SlashsearchSlashusers`: ParametersSearchUsersEndpoint,
      `GET SlashteamsSlashColonteam_idSlashdiscussions`: ParametersTeamsListDiscussionsLegacyEndpoint,
      `GET SlashteamsSlashColonteam_idSlashdiscussionsSlashColondiscussion_numberSlashcomments`: ParametersTeamsListDiscussionCommentsLegacyEndpoint,
      `GET SlashteamsSlashColonteam_idSlashdiscussionsSlashColondiscussion_numberSlashcommentsSlashColoncomment_numberSlashreactions`: ParametersReactionsListForTeamDiscussionCommentLegacyEndpoint,
      `GET SlashteamsSlashColonteam_idSlashdiscussionsSlashColondiscussion_numberSlashreactions`: ParametersReactionsListForTeamDiscussionLegacyEndpoint,
      `GET SlashteamsSlashColonteam_idSlashinvitations`: ParametersTeamsListPendingInvitationsLegacyEndpoint,
      `GET SlashteamsSlashColonteam_idSlashmembers`: ParametersTeamsListMembersLegacyEndpoint,
      `GET SlashteamsSlashColonteam_idSlashprojects`: ParametersTeamsListProjectsLegacyEndpoint,
      `GET SlashteamsSlashColonteam_idSlashrepos`: ParametersTeamsListReposLegacyEndpoint,
      `GET SlashteamsSlashColonteam_idSlashteam-syncSlashgroup-mappings`: ParametersTeamsListIdPGroupsForLegacyEndpoint,
      `GET SlashteamsSlashColonteam_idSlashteams`: ParametersTeamsListChildLegacyEndpoint,
      `GET SlashuserSlashblocks`: ParametersUsersListBlockedByAuthenticatedEndpoint,
      `GET SlashuserSlashemails`: ParametersUsersListEmailsForAuthenticatedEndpoint,
      `GET SlashuserSlashfollowers`: ParametersUsersListFollowersForAuthenticatedUserEndpoint,
      `GET SlashuserSlashfollowing`: ParametersUsersListFollowedByAuthenticatedEndpoint,
      `GET SlashuserSlashgpg_keys`: ParametersUsersListGpgKeysForAuthenticatedEndpoint,
      `GET SlashuserSlashinstallations`: ParametersAppsListInstallationsForAuthenticatedUserEndpoint,
      `GET SlashuserSlashinstallationsSlashColoninstallation_idSlashrepositories`: ParametersAppsListInstallationReposForAuthenticatedUserEndpoint,
      `GET SlashuserSlashissues`: ParametersIssuesListForAuthenticatedUserEndpoint,
      `GET SlashuserSlashkeys`: ParametersUsersListPublicSshKeysForAuthenticatedEndpoint,
      `GET SlashuserSlashmarketplace_purchases`: ParametersAppsListSubscriptionsForAuthenticatedUserEndpoint,
      `GET SlashuserSlashmarketplace_purchasesSlashstubbed`: ParametersAppsListSubscriptionsForAuthenticatedUserStubbedEndpoint,
      `GET SlashuserSlashmembershipsSlashorgs`: ParametersOrgsListMembershipsForAuthenticatedUserEndpoint,
      `GET SlashuserSlashmigrations`: ParametersMigrationsListForAuthenticatedUserEndpoint,
      `GET SlashuserSlashmigrationsSlashColonmigration_idSlashrepositories`: ParametersMigrationsListReposForUserEndpoint,
      `GET SlashuserSlashorgs`: ParametersOrgsListForAuthenticatedUserEndpoint,
      `GET SlashuserSlashpublic_emails`: ParametersUsersListPublicEmailsForAuthenticatedEndpoint,
      `GET SlashuserSlashrepository_invitations`: ParametersReposListInvitationsForAuthenticatedUserEndpoint,
      `GET SlashuserSlashstarred`: ParametersActivityListReposStarredByAuthenticatedUserEndpoint,
      `GET SlashuserSlashsubscriptions`: ParametersActivityListWatchedReposForAuthenticatedUserEndpoint,
      `GET SlashuserSlashteams`: ParametersTeamsListForAuthenticatedUserEndpoint,
      `GET Slashusers`: ParametersUsersListEndpoint,
      `GET SlashusersSlashColonusernameSlashfollowers`: ParametersUsersListFollowersForUserEndpoint,
      `GET SlashusersSlashColonusernameSlashfollowing`: ParametersUsersListFollowingForUserEndpoint,
      `GET SlashusersSlashColonusernameSlashgists`: ParametersGistsListForUserEndpoint,
      `GET SlashusersSlashColonusernameSlashgpg_keys`: ParametersUsersListGpgKeysForUserEndpoint,
      `GET SlashusersSlashColonusernameSlashkeys`: ParametersUsersListPublicKeysForUserEndpoint,
      `GET SlashusersSlashColonusernameSlashorgs`: ParametersOrgsListForUserEndpoint,
      `GET SlashusersSlashColonusernameSlashprojects`: ParametersProjectsListForUserEndpoint,
      `GET SlashusersSlashColonusernameSlashstarred`: ParametersActivityListReposStarredByUserEndpoint,
      `GET SlashusersSlashColonusernameSlashsubscriptions`: ParametersActivityListReposWatchedByUserEndpoint
    ): PaginatingEndpoints = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("GET /app/installations")((`GET SlashappSlashinstallations`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /applications/grants")((`GET SlashapplicationsSlashgrants`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /authorizations")((`GET Slashauthorizations`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /enterprises/:enterprise/actions/runner-groups")((`GET SlashenterprisesSlashColonenterpriseSlashactionsSlashrunner-groups`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /enterprises/:enterprise/actions/runner-groups/:runner_group_id/organizations")((`GET SlashenterprisesSlashColonenterpriseSlashactionsSlashrunner-groupsSlashColonrunner_group_idSlashorganizations`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /enterprises/:enterprise/actions/runner-groups/:runner_group_id/runners")((`GET SlashenterprisesSlashColonenterpriseSlashactionsSlashrunner-groupsSlashColonrunner_group_idSlashrunners`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /enterprises/:enterprise/actions/runners")((`GET SlashenterprisesSlashColonenterpriseSlashactionsSlashrunners`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /enterprises/:enterprise/actions/runners/downloads")((`GET SlashenterprisesSlashColonenterpriseSlashactionsSlashrunnersSlashdownloads`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /gists")((`GET Slashgists`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /gists/:gist_id/comments")((`GET SlashgistsSlashColongist_idSlashcomments`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /gists/:gist_id/commits")((`GET SlashgistsSlashColongist_idSlashcommits`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /gists/:gist_id/forks")((`GET SlashgistsSlashColongist_idSlashforks`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /gists/public")((`GET SlashgistsSlashpublic`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /gists/starred")((`GET SlashgistsSlashstarred`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /installation/repositories")((`GET SlashinstallationSlashrepositories`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /issues")((`GET Slashissues`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /marketplace_listing/plans")((`GET Slashmarketplace_listingSlashplans`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /marketplace_listing/plans/:plan_id/accounts")((`GET Slashmarketplace_listingSlashplansSlashColonplan_idSlashaccounts`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /marketplace_listing/stubbed/plans")((`GET Slashmarketplace_listingSlashstubbedSlashplans`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /marketplace_listing/stubbed/plans/:plan_id/accounts")((`GET Slashmarketplace_listingSlashstubbedSlashplansSlashColonplan_idSlashaccounts`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /notifications")((`GET Slashnotifications`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /organizations")((`GET Slashorganizations`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /orgs/:org/actions/runner-groups")((`GET SlashorgsSlashColonorgSlashactionsSlashrunner-groups`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /orgs/:org/actions/runner-groups/:runner_group_id/repositories")((`GET SlashorgsSlashColonorgSlashactionsSlashrunner-groupsSlashColonrunner_group_idSlashrepositories`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /orgs/:org/actions/runner-groups/:runner_group_id/runners")((`GET SlashorgsSlashColonorgSlashactionsSlashrunner-groupsSlashColonrunner_group_idSlashrunners`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /orgs/:org/actions/runners")((`GET SlashorgsSlashColonorgSlashactionsSlashrunners`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /orgs/:org/actions/runners/downloads")((`GET SlashorgsSlashColonorgSlashactionsSlashrunnersSlashdownloads`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /orgs/:org/actions/secrets")((`GET SlashorgsSlashColonorgSlashactionsSlashsecrets`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /orgs/:org/actions/secrets/:secret_name/repositories")((`GET SlashorgsSlashColonorgSlashactionsSlashsecretsSlashColonsecret_nameSlashrepositories`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /orgs/:org/blocks")((`GET SlashorgsSlashColonorgSlashblocks`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /orgs/:org/credential-authorizations")((`GET SlashorgsSlashColonorgSlashcredential-authorizations`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /orgs/:org/hooks")((`GET SlashorgsSlashColonorgSlashhooks`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /orgs/:org/installations")((`GET SlashorgsSlashColonorgSlashinstallations`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /orgs/:org/invitations")((`GET SlashorgsSlashColonorgSlashinvitations`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /orgs/:org/invitations/:invitation_id/teams")((`GET SlashorgsSlashColonorgSlashinvitationsSlashColoninvitation_idSlashteams`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /orgs/:org/issues")((`GET SlashorgsSlashColonorgSlashissues`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /orgs/:org/members")((`GET SlashorgsSlashColonorgSlashmembers`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /orgs/:org/migrations")((`GET SlashorgsSlashColonorgSlashmigrations`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /orgs/:org/migrations/:migration_id/repositories")((`GET SlashorgsSlashColonorgSlashmigrationsSlashColonmigration_idSlashrepositories`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /orgs/:org/outside_collaborators")((`GET SlashorgsSlashColonorgSlashoutside_collaborators`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /orgs/:org/projects")((`GET SlashorgsSlashColonorgSlashprojects`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /orgs/:org/public_members")((`GET SlashorgsSlashColonorgSlashpublic_members`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /orgs/:org/repos")((`GET SlashorgsSlashColonorgSlashrepos`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /orgs/:org/team-sync/groups")((`GET SlashorgsSlashColonorgSlashteam-syncSlashgroups`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /orgs/:org/teams")((`GET SlashorgsSlashColonorgSlashteams`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /orgs/:org/teams/:team_slug/discussions")((`GET SlashorgsSlashColonorgSlashteamsSlashColonteam_slugSlashdiscussions`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /orgs/:org/teams/:team_slug/discussions/:discussion_number/comments")((`GET SlashorgsSlashColonorgSlashteamsSlashColonteam_slugSlashdiscussionsSlashColondiscussion_numberSlashcomments`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /orgs/:org/teams/:team_slug/discussions/:discussion_number/comments/:comment_number/reactions")((`GET SlashorgsSlashColonorgSlashteamsSlashColonteam_slugSlashdiscussionsSlashColondiscussion_numberSlashcommentsSlashColoncomment_numberSlashreactions`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /orgs/:org/teams/:team_slug/discussions/:discussion_number/reactions")((`GET SlashorgsSlashColonorgSlashteamsSlashColonteam_slugSlashdiscussionsSlashColondiscussion_numberSlashreactions`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /orgs/:org/teams/:team_slug/invitations")((`GET SlashorgsSlashColonorgSlashteamsSlashColonteam_slugSlashinvitations`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /orgs/:org/teams/:team_slug/members")((`GET SlashorgsSlashColonorgSlashteamsSlashColonteam_slugSlashmembers`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /orgs/:org/teams/:team_slug/projects")((`GET SlashorgsSlashColonorgSlashteamsSlashColonteam_slugSlashprojects`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /orgs/:org/teams/:team_slug/repos")((`GET SlashorgsSlashColonorgSlashteamsSlashColonteam_slugSlashrepos`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /orgs/:org/teams/:team_slug/team-sync/group-mappings")((`GET SlashorgsSlashColonorgSlashteamsSlashColonteam_slugSlashteam-syncSlashgroup-mappings`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /orgs/:org/teams/:team_slug/teams")((`GET SlashorgsSlashColonorgSlashteamsSlashColonteam_slugSlashteams`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /projects/:project_id/collaborators")((`GET SlashprojectsSlashColonproject_idSlashcollaborators`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /projects/:project_id/columns")((`GET SlashprojectsSlashColonproject_idSlashcolumns`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /projects/columns/:column_id/cards")((`GET SlashprojectsSlashcolumnsSlashColoncolumn_idSlashcards`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /repos/:owner/:repo/actions/artifacts")((`GET SlashreposSlashColonownerSlashColonrepoSlashactionsSlashartifacts`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /repos/:owner/:repo/actions/runners")((`GET SlashreposSlashColonownerSlashColonrepoSlashactionsSlashrunners`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /repos/:owner/:repo/actions/runners/downloads")((`GET SlashreposSlashColonownerSlashColonrepoSlashactionsSlashrunnersSlashdownloads`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /repos/:owner/:repo/actions/runs")((`GET SlashreposSlashColonownerSlashColonrepoSlashactionsSlashruns`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /repos/:owner/:repo/actions/runs/:run_id/artifacts")((`GET SlashreposSlashColonownerSlashColonrepoSlashactionsSlashrunsSlashColonrun_idSlashartifacts`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /repos/:owner/:repo/actions/runs/:run_id/jobs")((`GET SlashreposSlashColonownerSlashColonrepoSlashactionsSlashrunsSlashColonrun_idSlashjobs`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /repos/:owner/:repo/actions/secrets")((`GET SlashreposSlashColonownerSlashColonrepoSlashactionsSlashsecrets`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /repos/:owner/:repo/actions/workflows")((`GET SlashreposSlashColonownerSlashColonrepoSlashactionsSlashworkflows`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /repos/:owner/:repo/actions/workflows/:workflow_id/runs")((`GET SlashreposSlashColonownerSlashColonrepoSlashactionsSlashworkflowsSlashColonworkflow_idSlashruns`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /repos/:owner/:repo/assignees")((`GET SlashreposSlashColonownerSlashColonrepoSlashassignees`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /repos/:owner/:repo/branches")((`GET SlashreposSlashColonownerSlashColonrepoSlashbranches`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /repos/:owner/:repo/check-runs/:check_run_id/annotations")((`GET SlashreposSlashColonownerSlashColonrepoSlashcheck-runsSlashColoncheck_run_idSlashannotations`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /repos/:owner/:repo/check-suites/:check_suite_id/check-runs")((`GET SlashreposSlashColonownerSlashColonrepoSlashcheck-suitesSlashColoncheck_suite_idSlashcheck-runs`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /repos/:owner/:repo/code-scanning/alerts")((`GET SlashreposSlashColonownerSlashColonrepoSlashcode-scanningSlashalerts`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /repos/:owner/:repo/code-scanning/analyses")((`GET SlashreposSlashColonownerSlashColonrepoSlashcode-scanningSlashanalyses`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /repos/:owner/:repo/collaborators")((`GET SlashreposSlashColonownerSlashColonrepoSlashcollaborators`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /repos/:owner/:repo/comments")((`GET SlashreposSlashColonownerSlashColonrepoSlashcomments`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /repos/:owner/:repo/comments/:comment_id/reactions")((`GET SlashreposSlashColonownerSlashColonrepoSlashcommentsSlashColoncomment_idSlashreactions`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /repos/:owner/:repo/commits")((`GET SlashreposSlashColonownerSlashColonrepoSlashcommits`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /repos/:owner/:repo/commits/:commit_sha/branches-where-head")((`GET SlashreposSlashColonownerSlashColonrepoSlashcommitsSlashColoncommit_shaSlashbranches-where-head`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /repos/:owner/:repo/commits/:commit_sha/comments")((`GET SlashreposSlashColonownerSlashColonrepoSlashcommitsSlashColoncommit_shaSlashcomments`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /repos/:owner/:repo/commits/:commit_sha/pulls")((`GET SlashreposSlashColonownerSlashColonrepoSlashcommitsSlashColoncommit_shaSlashpulls`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /repos/:owner/:repo/commits/:ref/check-runs")((`GET SlashreposSlashColonownerSlashColonrepoSlashcommitsSlashColonrefSlashcheck-runs`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /repos/:owner/:repo/commits/:ref/check-suites")((`GET SlashreposSlashColonownerSlashColonrepoSlashcommitsSlashColonrefSlashcheck-suites`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /repos/:owner/:repo/commits/:ref/statuses")((`GET SlashreposSlashColonownerSlashColonrepoSlashcommitsSlashColonrefSlashstatuses`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /repos/:owner/:repo/contributors")((`GET SlashreposSlashColonownerSlashColonrepoSlashcontributors`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /repos/:owner/:repo/deployments")((`GET SlashreposSlashColonownerSlashColonrepoSlashdeployments`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /repos/:owner/:repo/deployments/:deployment_id/statuses")((`GET SlashreposSlashColonownerSlashColonrepoSlashdeploymentsSlashColondeployment_idSlashstatuses`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /repos/:owner/:repo/forks")((`GET SlashreposSlashColonownerSlashColonrepoSlashforks`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /repos/:owner/:repo/git/matching-refs/:ref")((`GET SlashreposSlashColonownerSlashColonrepoSlashgitSlashmatching-refsSlashColonref`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /repos/:owner/:repo/hooks")((`GET SlashreposSlashColonownerSlashColonrepoSlashhooks`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /repos/:owner/:repo/invitations")((`GET SlashreposSlashColonownerSlashColonrepoSlashinvitations`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /repos/:owner/:repo/issues")((`GET SlashreposSlashColonownerSlashColonrepoSlashissues`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /repos/:owner/:repo/issues/:issue_number/comments")((`GET SlashreposSlashColonownerSlashColonrepoSlashissuesSlashColonissue_numberSlashcomments`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /repos/:owner/:repo/issues/:issue_number/events")((`GET SlashreposSlashColonownerSlashColonrepoSlashissuesSlashColonissue_numberSlashevents`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /repos/:owner/:repo/issues/:issue_number/labels")((`GET SlashreposSlashColonownerSlashColonrepoSlashissuesSlashColonissue_numberSlashlabels`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /repos/:owner/:repo/issues/:issue_number/reactions")((`GET SlashreposSlashColonownerSlashColonrepoSlashissuesSlashColonissue_numberSlashreactions`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /repos/:owner/:repo/issues/:issue_number/timeline")((`GET SlashreposSlashColonownerSlashColonrepoSlashissuesSlashColonissue_numberSlashtimeline`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /repos/:owner/:repo/issues/comments")((`GET SlashreposSlashColonownerSlashColonrepoSlashissuesSlashcomments`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /repos/:owner/:repo/issues/comments/:comment_id/reactions")((`GET SlashreposSlashColonownerSlashColonrepoSlashissuesSlashcommentsSlashColoncomment_idSlashreactions`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /repos/:owner/:repo/issues/events")((`GET SlashreposSlashColonownerSlashColonrepoSlashissuesSlashevents`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /repos/:owner/:repo/keys")((`GET SlashreposSlashColonownerSlashColonrepoSlashkeys`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /repos/:owner/:repo/labels")((`GET SlashreposSlashColonownerSlashColonrepoSlashlabels`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /repos/:owner/:repo/languages")((`GET SlashreposSlashColonownerSlashColonrepoSlashlanguages`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /repos/:owner/:repo/milestones")((`GET SlashreposSlashColonownerSlashColonrepoSlashmilestones`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /repos/:owner/:repo/milestones/:milestone_number/labels")((`GET SlashreposSlashColonownerSlashColonrepoSlashmilestonesSlashColonmilestone_numberSlashlabels`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /repos/:owner/:repo/notifications")((`GET SlashreposSlashColonownerSlashColonrepoSlashnotifications`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /repos/:owner/:repo/pages/builds")((`GET SlashreposSlashColonownerSlashColonrepoSlashpagesSlashbuilds`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /repos/:owner/:repo/projects")((`GET SlashreposSlashColonownerSlashColonrepoSlashprojects`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /repos/:owner/:repo/pulls")((`GET SlashreposSlashColonownerSlashColonrepoSlashpulls`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /repos/:owner/:repo/pulls/:pull_number/comments")((`GET SlashreposSlashColonownerSlashColonrepoSlashpullsSlashColonpull_numberSlashcomments`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /repos/:owner/:repo/pulls/:pull_number/commits")((`GET SlashreposSlashColonownerSlashColonrepoSlashpullsSlashColonpull_numberSlashcommits`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /repos/:owner/:repo/pulls/:pull_number/files")((`GET SlashreposSlashColonownerSlashColonrepoSlashpullsSlashColonpull_numberSlashfiles`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /repos/:owner/:repo/pulls/:pull_number/requested_reviewers")((`GET SlashreposSlashColonownerSlashColonrepoSlashpullsSlashColonpull_numberSlashrequested_reviewers`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /repos/:owner/:repo/pulls/:pull_number/reviews")((`GET SlashreposSlashColonownerSlashColonrepoSlashpullsSlashColonpull_numberSlashreviews`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /repos/:owner/:repo/pulls/:pull_number/reviews/:review_id/comments")((`GET SlashreposSlashColonownerSlashColonrepoSlashpullsSlashColonpull_numberSlashreviewsSlashColonreview_idSlashcomments`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /repos/:owner/:repo/pulls/comments")((`GET SlashreposSlashColonownerSlashColonrepoSlashpullsSlashcomments`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /repos/:owner/:repo/pulls/comments/:comment_id/reactions")((`GET SlashreposSlashColonownerSlashColonrepoSlashpullsSlashcommentsSlashColoncomment_idSlashreactions`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /repos/:owner/:repo/releases")((`GET SlashreposSlashColonownerSlashColonrepoSlashreleases`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /repos/:owner/:repo/releases/:release_id/assets")((`GET SlashreposSlashColonownerSlashColonrepoSlashreleasesSlashColonrelease_idSlashassets`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /repos/:owner/:repo/stargazers")((`GET SlashreposSlashColonownerSlashColonrepoSlashstargazers`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /repos/:owner/:repo/subscribers")((`GET SlashreposSlashColonownerSlashColonrepoSlashsubscribers`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /repos/:owner/:repo/tags")((`GET SlashreposSlashColonownerSlashColonrepoSlashtags`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /repos/:owner/:repo/teams")((`GET SlashreposSlashColonownerSlashColonrepoSlashteams`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /repositories")((`GET Slashrepositories`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /scim/v2/enterprises/:enterprise/Groups")((`GET SlashscimSlashv2SlashenterprisesSlashColonenterpriseSlashGroups`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /scim/v2/enterprises/:enterprise/Users")((`GET SlashscimSlashv2SlashenterprisesSlashColonenterpriseSlashUsers`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /scim/v2/organizations/:org/Users")((`GET SlashscimSlashv2SlashorganizationsSlashColonorgSlashUsers`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /search/code")((`GET SlashsearchSlashcode`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /search/commits")((`GET SlashsearchSlashcommits`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /search/issues")((`GET SlashsearchSlashissues`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /search/labels")((`GET SlashsearchSlashlabels`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /search/repositories")((`GET SlashsearchSlashrepositories`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /search/topics")((`GET SlashsearchSlashtopics`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /search/users")((`GET SlashsearchSlashusers`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /teams/:team_id/discussions")((`GET SlashteamsSlashColonteam_idSlashdiscussions`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /teams/:team_id/discussions/:discussion_number/comments")((`GET SlashteamsSlashColonteam_idSlashdiscussionsSlashColondiscussion_numberSlashcomments`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /teams/:team_id/discussions/:discussion_number/comments/:comment_number/reactions")((`GET SlashteamsSlashColonteam_idSlashdiscussionsSlashColondiscussion_numberSlashcommentsSlashColoncomment_numberSlashreactions`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /teams/:team_id/discussions/:discussion_number/reactions")((`GET SlashteamsSlashColonteam_idSlashdiscussionsSlashColondiscussion_numberSlashreactions`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /teams/:team_id/invitations")((`GET SlashteamsSlashColonteam_idSlashinvitations`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /teams/:team_id/members")((`GET SlashteamsSlashColonteam_idSlashmembers`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /teams/:team_id/projects")((`GET SlashteamsSlashColonteam_idSlashprojects`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /teams/:team_id/repos")((`GET SlashteamsSlashColonteam_idSlashrepos`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /teams/:team_id/team-sync/group-mappings")((`GET SlashteamsSlashColonteam_idSlashteam-syncSlashgroup-mappings`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /teams/:team_id/teams")((`GET SlashteamsSlashColonteam_idSlashteams`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /user/blocks")((`GET SlashuserSlashblocks`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /user/emails")((`GET SlashuserSlashemails`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /user/followers")((`GET SlashuserSlashfollowers`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /user/following")((`GET SlashuserSlashfollowing`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /user/gpg_keys")((`GET SlashuserSlashgpg_keys`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /user/installations")((`GET SlashuserSlashinstallations`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /user/installations/:installation_id/repositories")((`GET SlashuserSlashinstallationsSlashColoninstallation_idSlashrepositories`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /user/issues")((`GET SlashuserSlashissues`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /user/keys")((`GET SlashuserSlashkeys`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /user/marketplace_purchases")((`GET SlashuserSlashmarketplace_purchases`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /user/marketplace_purchases/stubbed")((`GET SlashuserSlashmarketplace_purchasesSlashstubbed`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /user/memberships/orgs")((`GET SlashuserSlashmembershipsSlashorgs`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /user/migrations")((`GET SlashuserSlashmigrations`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /user/migrations/:migration_id/repositories")((`GET SlashuserSlashmigrationsSlashColonmigration_idSlashrepositories`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /user/orgs")((`GET SlashuserSlashorgs`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /user/public_emails")((`GET SlashuserSlashpublic_emails`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /user/repository_invitations")((`GET SlashuserSlashrepository_invitations`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /user/starred")((`GET SlashuserSlashstarred`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /user/subscriptions")((`GET SlashuserSlashsubscriptions`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /user/teams")((`GET SlashuserSlashteams`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /users")((`GET Slashusers`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /users/:username/followers")((`GET SlashusersSlashColonusernameSlashfollowers`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /users/:username/following")((`GET SlashusersSlashColonusernameSlashfollowing`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /users/:username/gists")((`GET SlashusersSlashColonusernameSlashgists`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /users/:username/gpg_keys")((`GET SlashusersSlashColonusernameSlashgpg_keys`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /users/:username/keys")((`GET SlashusersSlashColonusernameSlashkeys`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /users/:username/orgs")((`GET SlashusersSlashColonusernameSlashorgs`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /users/:username/projects")((`GET SlashusersSlashColonusernameSlashprojects`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /users/:username/starred")((`GET SlashusersSlashColonusernameSlashstarred`).asInstanceOf[js.Any])
      __obj.updateDynamic("GET /users/:username/subscriptions")((`GET SlashusersSlashColonusernameSlashsubscriptions`).asInstanceOf[js.Any])
      __obj.asInstanceOf[PaginatingEndpoints]
    }
    
    @scala.inline
    implicit class PaginatingEndpointsMutableBuilder[Self <: PaginatingEndpoints] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `setGET SlashappSlashinstallations`(value: Parameters): Self = StObject.set(x, "GET /app/installations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashapplicationsSlashgrants`(value: Response): Self = StObject.set(x, "GET /applications/grants", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET Slashauthorizations`(value: ParametersResponse): Self = StObject.set(x, "GET /authorizations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashenterprisesSlashColonenterpriseSlashactionsSlashrunner-groups`(value: ParametersEnterpriseAdminListSelfHostedRunnerGroupsForEnterpriseEndpoint): Self = StObject.set(x, "GET /enterprises/:enterprise/actions/runner-groups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashenterprisesSlashColonenterpriseSlashactionsSlashrunner-groupsSlashColonrunner_group_idSlashorganizations`(value: ParametersEnterpriseAdminListOrgAccessToSelfHostedRunnerGroupInEnterpriseEndpoint): Self = StObject.set(x, "GET /enterprises/:enterprise/actions/runner-groups/:runner_group_id/organizations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashenterprisesSlashColonenterpriseSlashactionsSlashrunner-groupsSlashColonrunner_group_idSlashrunners`(value: ParametersEnterpriseAdminListSelfHostedRunnersInGroupForEnterpriseEndpoint): Self = StObject.set(x, "GET /enterprises/:enterprise/actions/runner-groups/:runner_group_id/runners", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashenterprisesSlashColonenterpriseSlashactionsSlashrunners`(value: ParametersEnterpriseAdminListSelfHostedRunnersForEnterpriseEndpoint): Self = StObject.set(x, "GET /enterprises/:enterprise/actions/runners", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashenterprisesSlashColonenterpriseSlashactionsSlashrunnersSlashdownloads`(value: ParametersEnterpriseAdminListRunnerApplicationsForEnterpriseEndpoint): Self = StObject.set(x, "GET /enterprises/:enterprise/actions/runners/downloads", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET Slashgists`(value: ParametersGistsListEndpoint): Self = StObject.set(x, "GET /gists", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashgistsSlashColongist_idSlashcomments`(value: ParametersGistsListCommentsEndpoint): Self = StObject.set(x, "GET /gists/:gist_id/comments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashgistsSlashColongist_idSlashcommits`(value: ParametersGistsListCommitsEndpoint): Self = StObject.set(x, "GET /gists/:gist_id/commits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashgistsSlashColongist_idSlashforks`(value: ParametersGistsListForksEndpoint): Self = StObject.set(x, "GET /gists/:gist_id/forks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashgistsSlashpublic`(value: ParametersGistsListPublicEndpoint): Self = StObject.set(x, "GET /gists/public", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashgistsSlashstarred`(value: ParametersGistsListStarredEndpoint): Self = StObject.set(x, "GET /gists/starred", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashinstallationSlashrepositories`(value: ParametersAppsListReposAccessibleToInstallationEndpoint): Self = StObject.set(x, "GET /installation/repositories", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET Slashissues`(value: ParametersIssuesListEndpoint): Self = StObject.set(x, "GET /issues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET Slashmarketplace_listingSlashplans`(value: ParametersAppsListPlansEndpoint): Self = StObject.set(x, "GET /marketplace_listing/plans", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET Slashmarketplace_listingSlashplansSlashColonplan_idSlashaccounts`(value: ParametersAppsListAccountsForPlanEndpoint): Self = StObject.set(x, "GET /marketplace_listing/plans/:plan_id/accounts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET Slashmarketplace_listingSlashstubbedSlashplans`(value: ParametersAppsListPlansStubbedEndpoint): Self = StObject.set(x, "GET /marketplace_listing/stubbed/plans", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET Slashmarketplace_listingSlashstubbedSlashplansSlashColonplan_idSlashaccounts`(value: ParametersAppsListAccountsForPlanStubbedEndpoint): Self = StObject.set(x, "GET /marketplace_listing/stubbed/plans/:plan_id/accounts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET Slashnotifications`(value: ParametersActivityListNotificationsForAuthenticatedUserEndpoint): Self = StObject.set(x, "GET /notifications", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET Slashorganizations`(value: ParametersOrgsListEndpoint): Self = StObject.set(x, "GET /organizations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashorgsSlashColonorgSlashactionsSlashrunner-groups`(value: ParametersActionsListSelfHostedRunnerGroupsForOrgEndpoint): Self = StObject.set(x, "GET /orgs/:org/actions/runner-groups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashorgsSlashColonorgSlashactionsSlashrunner-groupsSlashColonrunner_group_idSlashrepositories`(value: ParametersActionsListRepoAccessToSelfHostedRunnerGroupInOrgEndpoint): Self = StObject.set(x, "GET /orgs/:org/actions/runner-groups/:runner_group_id/repositories", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashorgsSlashColonorgSlashactionsSlashrunner-groupsSlashColonrunner_group_idSlashrunners`(value: ParametersActionsListSelfHostedRunnersInGroupForOrgEndpoint): Self = StObject.set(x, "GET /orgs/:org/actions/runner-groups/:runner_group_id/runners", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashorgsSlashColonorgSlashactionsSlashrunners`(value: ParametersActionsListSelfHostedRunnersForOrgEndpoint): Self = StObject.set(x, "GET /orgs/:org/actions/runners", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashorgsSlashColonorgSlashactionsSlashrunnersSlashdownloads`(value: ParametersActionsListRunnerApplicationsForOrgEndpoint): Self = StObject.set(x, "GET /orgs/:org/actions/runners/downloads", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashorgsSlashColonorgSlashactionsSlashsecrets`(value: ParametersActionsListOrgSecretsEndpoint): Self = StObject.set(x, "GET /orgs/:org/actions/secrets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashorgsSlashColonorgSlashactionsSlashsecretsSlashColonsecret_nameSlashrepositories`(value: ParametersActionsListSelectedReposForOrgSecretEndpoint): Self = StObject.set(x, "GET /orgs/:org/actions/secrets/:secret_name/repositories", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashorgsSlashColonorgSlashblocks`(value: ParametersOrgsListBlockedUsersEndpoint): Self = StObject.set(x, "GET /orgs/:org/blocks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashorgsSlashColonorgSlashcredential-authorizations`(value: ParametersOrgsListSamlSsoAuthorizationsEndpoint): Self = StObject.set(x, "GET /orgs/:org/credential-authorizations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashorgsSlashColonorgSlashhooks`(value: ParametersOrgsListWebhooksEndpoint): Self = StObject.set(x, "GET /orgs/:org/hooks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashorgsSlashColonorgSlashinstallations`(value: ParametersOrgsListAppInstallationsEndpoint): Self = StObject.set(x, "GET /orgs/:org/installations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashorgsSlashColonorgSlashinvitations`(value: ParametersOrgsListPendingInvitationsEndpoint): Self = StObject.set(x, "GET /orgs/:org/invitations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashorgsSlashColonorgSlashinvitationsSlashColoninvitation_idSlashteams`(value: ParametersOrgsListInvitationTeamsEndpoint): Self = StObject.set(x, "GET /orgs/:org/invitations/:invitation_id/teams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashorgsSlashColonorgSlashissues`(value: ParametersIssuesListForOrgEndpoint): Self = StObject.set(x, "GET /orgs/:org/issues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashorgsSlashColonorgSlashmembers`(value: ParametersOrgsListMembersEndpoint): Self = StObject.set(x, "GET /orgs/:org/members", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashorgsSlashColonorgSlashmigrations`(value: ParametersMigrationsListForOrgEndpoint): Self = StObject.set(x, "GET /orgs/:org/migrations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashorgsSlashColonorgSlashmigrationsSlashColonmigration_idSlashrepositories`(value: ParametersMigrationsListReposForOrgEndpoint): Self = StObject.set(x, "GET /orgs/:org/migrations/:migration_id/repositories", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashorgsSlashColonorgSlashoutside_collaborators`(value: ParametersOrgsListOutsideCollaboratorsEndpoint): Self = StObject.set(x, "GET /orgs/:org/outside_collaborators", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashorgsSlashColonorgSlashprojects`(value: ParametersProjectsListForOrgEndpoint): Self = StObject.set(x, "GET /orgs/:org/projects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashorgsSlashColonorgSlashpublic_members`(value: ParametersOrgsListPublicMembersEndpoint): Self = StObject.set(x, "GET /orgs/:org/public_members", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashorgsSlashColonorgSlashrepos`(value: ParametersReposListForOrgEndpoint): Self = StObject.set(x, "GET /orgs/:org/repos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashorgsSlashColonorgSlashteam-syncSlashgroups`(value: ParametersTeamsListIdPGroupsForOrgEndpoint): Self = StObject.set(x, "GET /orgs/:org/team-sync/groups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashorgsSlashColonorgSlashteams`(value: ParametersTeamsListEndpoint): Self = StObject.set(x, "GET /orgs/:org/teams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashorgsSlashColonorgSlashteamsSlashColonteam_slugSlashdiscussions`(value: ParametersTeamsListDiscussionsInOrgEndpoint): Self = StObject.set(x, "GET /orgs/:org/teams/:team_slug/discussions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashorgsSlashColonorgSlashteamsSlashColonteam_slugSlashdiscussionsSlashColondiscussion_numberSlashcomments`(value: ParametersTeamsListDiscussionCommentsInOrgEndpoint): Self = StObject.set(x, "GET /orgs/:org/teams/:team_slug/discussions/:discussion_number/comments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashorgsSlashColonorgSlashteamsSlashColonteam_slugSlashdiscussionsSlashColondiscussion_numberSlashcommentsSlashColoncomment_numberSlashreactions`(value: ParametersReactionsListForTeamDiscussionCommentInOrgEndpoint): Self = StObject.set(x, "GET /orgs/:org/teams/:team_slug/discussions/:discussion_number/comments/:comment_number/reactions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashorgsSlashColonorgSlashteamsSlashColonteam_slugSlashdiscussionsSlashColondiscussion_numberSlashreactions`(value: ParametersReactionsListForTeamDiscussionInOrgEndpoint): Self = StObject.set(x, "GET /orgs/:org/teams/:team_slug/discussions/:discussion_number/reactions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashorgsSlashColonorgSlashteamsSlashColonteam_slugSlashinvitations`(value: ParametersTeamsListPendingInvitationsInOrgEndpoint): Self = StObject.set(x, "GET /orgs/:org/teams/:team_slug/invitations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashorgsSlashColonorgSlashteamsSlashColonteam_slugSlashmembers`(value: ParametersTeamsListMembersInOrgEndpoint): Self = StObject.set(x, "GET /orgs/:org/teams/:team_slug/members", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashorgsSlashColonorgSlashteamsSlashColonteam_slugSlashprojects`(value: ParametersTeamsListProjectsInOrgEndpoint): Self = StObject.set(x, "GET /orgs/:org/teams/:team_slug/projects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashorgsSlashColonorgSlashteamsSlashColonteam_slugSlashrepos`(value: ParametersTeamsListReposInOrgEndpoint): Self = StObject.set(x, "GET /orgs/:org/teams/:team_slug/repos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashorgsSlashColonorgSlashteamsSlashColonteam_slugSlashteam-syncSlashgroup-mappings`(value: ParametersTeamsListIdPGroupsInOrgEndpoint): Self = StObject.set(x, "GET /orgs/:org/teams/:team_slug/team-sync/group-mappings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashorgsSlashColonorgSlashteamsSlashColonteam_slugSlashteams`(value: ParametersTeamsListChildInOrgEndpoint): Self = StObject.set(x, "GET /orgs/:org/teams/:team_slug/teams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashprojectsSlashColonproject_idSlashcollaborators`(value: ParametersProjectsListCollaboratorsEndpoint): Self = StObject.set(x, "GET /projects/:project_id/collaborators", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashprojectsSlashColonproject_idSlashcolumns`(value: ParametersProjectsListColumnsEndpoint): Self = StObject.set(x, "GET /projects/:project_id/columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashprojectsSlashcolumnsSlashColoncolumn_idSlashcards`(value: ParametersProjectsListCardsEndpoint): Self = StObject.set(x, "GET /projects/columns/:column_id/cards", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashreposSlashColonownerSlashColonrepoSlashactionsSlashartifacts`(value: ParametersActionsListArtifactsForRepoEndpoint): Self = StObject.set(x, "GET /repos/:owner/:repo/actions/artifacts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashreposSlashColonownerSlashColonrepoSlashactionsSlashrunners`(value: ParametersActionsListSelfHostedRunnersForRepoEndpoint): Self = StObject.set(x, "GET /repos/:owner/:repo/actions/runners", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashreposSlashColonownerSlashColonrepoSlashactionsSlashrunnersSlashdownloads`(value: ParametersActionsListRunnerApplicationsForRepoEndpoint): Self = StObject.set(x, "GET /repos/:owner/:repo/actions/runners/downloads", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashreposSlashColonownerSlashColonrepoSlashactionsSlashruns`(value: ParametersActionsListWorkflowRunsForRepoEndpoint): Self = StObject.set(x, "GET /repos/:owner/:repo/actions/runs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashreposSlashColonownerSlashColonrepoSlashactionsSlashrunsSlashColonrun_idSlashartifacts`(value: ParametersActionsListWorkflowRunArtifactsEndpoint): Self = StObject.set(x, "GET /repos/:owner/:repo/actions/runs/:run_id/artifacts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashreposSlashColonownerSlashColonrepoSlashactionsSlashrunsSlashColonrun_idSlashjobs`(value: ParametersActionsListJobsForWorkflowRunEndpoint): Self = StObject.set(x, "GET /repos/:owner/:repo/actions/runs/:run_id/jobs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashreposSlashColonownerSlashColonrepoSlashactionsSlashsecrets`(value: ParametersActionsListRepoSecretsEndpoint): Self = StObject.set(x, "GET /repos/:owner/:repo/actions/secrets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashreposSlashColonownerSlashColonrepoSlashactionsSlashworkflows`(value: ParametersActionsListRepoWorkflowsEndpoint): Self = StObject.set(x, "GET /repos/:owner/:repo/actions/workflows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashreposSlashColonownerSlashColonrepoSlashactionsSlashworkflowsSlashColonworkflow_idSlashruns`(value: ParametersActionsListWorkflowRunsEndpoint): Self = StObject.set(x, "GET /repos/:owner/:repo/actions/workflows/:workflow_id/runs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashreposSlashColonownerSlashColonrepoSlashassignees`(value: ParametersIssuesListAssigneesEndpoint): Self = StObject.set(x, "GET /repos/:owner/:repo/assignees", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashreposSlashColonownerSlashColonrepoSlashbranches`(value: ParametersReposListBranchesEndpoint): Self = StObject.set(x, "GET /repos/:owner/:repo/branches", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashreposSlashColonownerSlashColonrepoSlashcheck-runsSlashColoncheck_run_idSlashannotations`(value: ParametersChecksListAnnotationsEndpoint): Self = StObject.set(x, "GET /repos/:owner/:repo/check-runs/:check_run_id/annotations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashreposSlashColonownerSlashColonrepoSlashcheck-suitesSlashColoncheck_suite_idSlashcheck-runs`(value: ParametersChecksListForSuiteEndpoint): Self = StObject.set(x, "GET /repos/:owner/:repo/check-suites/:check_suite_id/check-runs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashreposSlashColonownerSlashColonrepoSlashcode-scanningSlashalerts`(value: ParametersCodeScanningListAlertsForRepoEndpoint): Self = StObject.set(x, "GET /repos/:owner/:repo/code-scanning/alerts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashreposSlashColonownerSlashColonrepoSlashcode-scanningSlashanalyses`(value: ParametersCodeScanningListRecentAnalysesEndpoint): Self = StObject.set(x, "GET /repos/:owner/:repo/code-scanning/analyses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashreposSlashColonownerSlashColonrepoSlashcollaborators`(value: ParametersReposListCollaboratorsEndpoint): Self = StObject.set(x, "GET /repos/:owner/:repo/collaborators", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashreposSlashColonownerSlashColonrepoSlashcomments`(value: ParametersReposListCommitCommentsForRepoEndpoint): Self = StObject.set(x, "GET /repos/:owner/:repo/comments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashreposSlashColonownerSlashColonrepoSlashcommentsSlashColoncomment_idSlashreactions`(value: ParametersReactionsListForCommitCommentEndpoint): Self = StObject.set(x, "GET /repos/:owner/:repo/comments/:comment_id/reactions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashreposSlashColonownerSlashColonrepoSlashcommits`(value: ParametersReposListCommitsEndpoint): Self = StObject.set(x, "GET /repos/:owner/:repo/commits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashreposSlashColonownerSlashColonrepoSlashcommitsSlashColoncommit_shaSlashbranches-where-head`(value: ParametersReposListBranchesForHeadCommitEndpoint): Self = StObject.set(x, "GET /repos/:owner/:repo/commits/:commit_sha/branches-where-head", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashreposSlashColonownerSlashColonrepoSlashcommitsSlashColoncommit_shaSlashcomments`(value: ParametersReposListCommentsForCommitEndpoint): Self = StObject.set(x, "GET /repos/:owner/:repo/commits/:commit_sha/comments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashreposSlashColonownerSlashColonrepoSlashcommitsSlashColoncommit_shaSlashpulls`(value: ParametersReposListPullRequestsAssociatedWithCommitEndpoint): Self = StObject.set(x, "GET /repos/:owner/:repo/commits/:commit_sha/pulls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashreposSlashColonownerSlashColonrepoSlashcommitsSlashColonrefSlashcheck-runs`(value: ParametersChecksListForRefEndpoint): Self = StObject.set(x, "GET /repos/:owner/:repo/commits/:ref/check-runs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashreposSlashColonownerSlashColonrepoSlashcommitsSlashColonrefSlashcheck-suites`(value: ParametersChecksListSuitesForRefEndpoint): Self = StObject.set(x, "GET /repos/:owner/:repo/commits/:ref/check-suites", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashreposSlashColonownerSlashColonrepoSlashcommitsSlashColonrefSlashstatuses`(value: ParametersReposListCommitStatusesForRefEndpoint): Self = StObject.set(x, "GET /repos/:owner/:repo/commits/:ref/statuses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashreposSlashColonownerSlashColonrepoSlashcontributors`(value: ParametersReposListContributorsEndpoint): Self = StObject.set(x, "GET /repos/:owner/:repo/contributors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashreposSlashColonownerSlashColonrepoSlashdeployments`(value: ParametersReposListDeploymentsEndpoint): Self = StObject.set(x, "GET /repos/:owner/:repo/deployments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashreposSlashColonownerSlashColonrepoSlashdeploymentsSlashColondeployment_idSlashstatuses`(value: ParametersReposListDeploymentStatusesEndpoint): Self = StObject.set(x, "GET /repos/:owner/:repo/deployments/:deployment_id/statuses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashreposSlashColonownerSlashColonrepoSlashforks`(value: ParametersReposListForksEndpoint): Self = StObject.set(x, "GET /repos/:owner/:repo/forks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashreposSlashColonownerSlashColonrepoSlashgitSlashmatching-refsSlashColonref`(value: ParametersGitListMatchingRefsEndpoint): Self = StObject.set(x, "GET /repos/:owner/:repo/git/matching-refs/:ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashreposSlashColonownerSlashColonrepoSlashhooks`(value: ParametersReposListWebhooksEndpoint): Self = StObject.set(x, "GET /repos/:owner/:repo/hooks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashreposSlashColonownerSlashColonrepoSlashinvitations`(value: ParametersReposListInvitationsEndpoint): Self = StObject.set(x, "GET /repos/:owner/:repo/invitations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashreposSlashColonownerSlashColonrepoSlashissues`(value: ParametersIssuesListForRepoEndpoint): Self = StObject.set(x, "GET /repos/:owner/:repo/issues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashreposSlashColonownerSlashColonrepoSlashissuesSlashColonissue_numberSlashcomments`(value: ParametersIssuesListCommentsEndpoint): Self = StObject.set(x, "GET /repos/:owner/:repo/issues/:issue_number/comments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashreposSlashColonownerSlashColonrepoSlashissuesSlashColonissue_numberSlashevents`(value: ParametersIssuesListEventsEndpoint): Self = StObject.set(x, "GET /repos/:owner/:repo/issues/:issue_number/events", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashreposSlashColonownerSlashColonrepoSlashissuesSlashColonissue_numberSlashlabels`(value: ParametersIssuesListLabelsOnIssueEndpoint): Self = StObject.set(x, "GET /repos/:owner/:repo/issues/:issue_number/labels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashreposSlashColonownerSlashColonrepoSlashissuesSlashColonissue_numberSlashreactions`(value: ParametersReactionsListForIssueEndpoint): Self = StObject.set(x, "GET /repos/:owner/:repo/issues/:issue_number/reactions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashreposSlashColonownerSlashColonrepoSlashissuesSlashColonissue_numberSlashtimeline`(value: ParametersIssuesListEventsForTimelineEndpoint): Self = StObject.set(x, "GET /repos/:owner/:repo/issues/:issue_number/timeline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashreposSlashColonownerSlashColonrepoSlashissuesSlashcomments`(value: ParametersIssuesListCommentsForRepoEndpoint): Self = StObject.set(x, "GET /repos/:owner/:repo/issues/comments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashreposSlashColonownerSlashColonrepoSlashissuesSlashcommentsSlashColoncomment_idSlashreactions`(value: ParametersReactionsListForIssueCommentEndpoint): Self = StObject.set(x, "GET /repos/:owner/:repo/issues/comments/:comment_id/reactions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashreposSlashColonownerSlashColonrepoSlashissuesSlashevents`(value: ParametersIssuesListEventsForRepoEndpoint): Self = StObject.set(x, "GET /repos/:owner/:repo/issues/events", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashreposSlashColonownerSlashColonrepoSlashkeys`(value: ParametersReposListDeployKeysEndpoint): Self = StObject.set(x, "GET /repos/:owner/:repo/keys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashreposSlashColonownerSlashColonrepoSlashlabels`(value: ParametersIssuesListLabelsForRepoEndpoint): Self = StObject.set(x, "GET /repos/:owner/:repo/labels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashreposSlashColonownerSlashColonrepoSlashlanguages`(value: ParametersReposListLanguagesEndpoint): Self = StObject.set(x, "GET /repos/:owner/:repo/languages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashreposSlashColonownerSlashColonrepoSlashmilestones`(value: ParametersIssuesListMilestonesEndpoint): Self = StObject.set(x, "GET /repos/:owner/:repo/milestones", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashreposSlashColonownerSlashColonrepoSlashmilestonesSlashColonmilestone_numberSlashlabels`(value: ParametersIssuesListLabelsForMilestoneEndpoint): Self = StObject.set(x, "GET /repos/:owner/:repo/milestones/:milestone_number/labels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashreposSlashColonownerSlashColonrepoSlashnotifications`(value: ParametersActivityListRepoNotificationsForAuthenticatedUserEndpoint): Self = StObject.set(x, "GET /repos/:owner/:repo/notifications", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashreposSlashColonownerSlashColonrepoSlashpagesSlashbuilds`(value: ParametersReposListPagesBuildsEndpoint): Self = StObject.set(x, "GET /repos/:owner/:repo/pages/builds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashreposSlashColonownerSlashColonrepoSlashprojects`(value: ParametersProjectsListForRepoEndpoint): Self = StObject.set(x, "GET /repos/:owner/:repo/projects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashreposSlashColonownerSlashColonrepoSlashpulls`(value: ParametersPullsListEndpoint): Self = StObject.set(x, "GET /repos/:owner/:repo/pulls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashreposSlashColonownerSlashColonrepoSlashpullsSlashColonpull_numberSlashcomments`(value: ParametersPullsListReviewCommentsEndpoint): Self = StObject.set(x, "GET /repos/:owner/:repo/pulls/:pull_number/comments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashreposSlashColonownerSlashColonrepoSlashpullsSlashColonpull_numberSlashcommits`(value: ParametersPullsListCommitsEndpoint): Self = StObject.set(x, "GET /repos/:owner/:repo/pulls/:pull_number/commits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashreposSlashColonownerSlashColonrepoSlashpullsSlashColonpull_numberSlashfiles`(value: ParametersPullsListFilesEndpoint): Self = StObject.set(x, "GET /repos/:owner/:repo/pulls/:pull_number/files", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashreposSlashColonownerSlashColonrepoSlashpullsSlashColonpull_numberSlashrequested_reviewers`(value: ParametersPullsListRequestedReviewersEndpoint): Self = StObject.set(x, "GET /repos/:owner/:repo/pulls/:pull_number/requested_reviewers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashreposSlashColonownerSlashColonrepoSlashpullsSlashColonpull_numberSlashreviews`(value: ParametersPullsListReviewsEndpoint): Self = StObject.set(x, "GET /repos/:owner/:repo/pulls/:pull_number/reviews", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashreposSlashColonownerSlashColonrepoSlashpullsSlashColonpull_numberSlashreviewsSlashColonreview_idSlashcomments`(value: ParametersPullsListCommentsForReviewEndpoint): Self = StObject.set(x, "GET /repos/:owner/:repo/pulls/:pull_number/reviews/:review_id/comments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashreposSlashColonownerSlashColonrepoSlashpullsSlashcomments`(value: ParametersPullsListReviewCommentsForRepoEndpoint): Self = StObject.set(x, "GET /repos/:owner/:repo/pulls/comments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashreposSlashColonownerSlashColonrepoSlashpullsSlashcommentsSlashColoncomment_idSlashreactions`(value: ParametersReactionsListForPullRequestReviewCommentEndpoint): Self = StObject.set(x, "GET /repos/:owner/:repo/pulls/comments/:comment_id/reactions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashreposSlashColonownerSlashColonrepoSlashreleases`(value: ParametersReposListReleasesEndpoint): Self = StObject.set(x, "GET /repos/:owner/:repo/releases", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashreposSlashColonownerSlashColonrepoSlashreleasesSlashColonrelease_idSlashassets`(value: ParametersReposListReleaseAssetsEndpoint): Self = StObject.set(x, "GET /repos/:owner/:repo/releases/:release_id/assets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashreposSlashColonownerSlashColonrepoSlashstargazers`(value: ParametersActivityListStargazersForRepoEndpoint): Self = StObject.set(x, "GET /repos/:owner/:repo/stargazers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashreposSlashColonownerSlashColonrepoSlashsubscribers`(value: ParametersActivityListWatchersForRepoEndpoint): Self = StObject.set(x, "GET /repos/:owner/:repo/subscribers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashreposSlashColonownerSlashColonrepoSlashtags`(value: ParametersReposListTagsEndpoint): Self = StObject.set(x, "GET /repos/:owner/:repo/tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashreposSlashColonownerSlashColonrepoSlashteams`(value: ParametersReposListTeamsEndpoint): Self = StObject.set(x, "GET /repos/:owner/:repo/teams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET Slashrepositories`(value: ParametersReposListPublicEndpoint): Self = StObject.set(x, "GET /repositories", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashscimSlashv2SlashenterprisesSlashColonenterpriseSlashGroups`(value: ParametersEnterpriseAdminListProvisionedGroupsEnterpriseEndpoint): Self = StObject.set(x, "GET /scim/v2/enterprises/:enterprise/Groups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashscimSlashv2SlashenterprisesSlashColonenterpriseSlashUsers`(value: ParametersEnterpriseAdminListProvisionedIdentitiesEnterpriseEndpoint): Self = StObject.set(x, "GET /scim/v2/enterprises/:enterprise/Users", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashscimSlashv2SlashorganizationsSlashColonorgSlashUsers`(value: ParametersScimListProvisionedIdentitiesEndpoint): Self = StObject.set(x, "GET /scim/v2/organizations/:org/Users", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashsearchSlashcode`(value: ParametersSearchCodeEndpoint): Self = StObject.set(x, "GET /search/code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashsearchSlashcommits`(value: ParametersSearchCommitsEndpoint): Self = StObject.set(x, "GET /search/commits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashsearchSlashissues`(value: ParametersSearchIssuesAndPullRequestsEndpoint): Self = StObject.set(x, "GET /search/issues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashsearchSlashlabels`(value: ParametersSearchLabelsEndpoint): Self = StObject.set(x, "GET /search/labels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashsearchSlashrepositories`(value: ParametersSearchReposEndpoint): Self = StObject.set(x, "GET /search/repositories", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashsearchSlashtopics`(value: ParametersSearchTopicsEndpoint): Self = StObject.set(x, "GET /search/topics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashsearchSlashusers`(value: ParametersSearchUsersEndpoint): Self = StObject.set(x, "GET /search/users", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashteamsSlashColonteam_idSlashdiscussions`(value: ParametersTeamsListDiscussionsLegacyEndpoint): Self = StObject.set(x, "GET /teams/:team_id/discussions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashteamsSlashColonteam_idSlashdiscussionsSlashColondiscussion_numberSlashcomments`(value: ParametersTeamsListDiscussionCommentsLegacyEndpoint): Self = StObject.set(x, "GET /teams/:team_id/discussions/:discussion_number/comments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashteamsSlashColonteam_idSlashdiscussionsSlashColondiscussion_numberSlashcommentsSlashColoncomment_numberSlashreactions`(value: ParametersReactionsListForTeamDiscussionCommentLegacyEndpoint): Self = StObject.set(x, "GET /teams/:team_id/discussions/:discussion_number/comments/:comment_number/reactions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashteamsSlashColonteam_idSlashdiscussionsSlashColondiscussion_numberSlashreactions`(value: ParametersReactionsListForTeamDiscussionLegacyEndpoint): Self = StObject.set(x, "GET /teams/:team_id/discussions/:discussion_number/reactions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashteamsSlashColonteam_idSlashinvitations`(value: ParametersTeamsListPendingInvitationsLegacyEndpoint): Self = StObject.set(x, "GET /teams/:team_id/invitations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashteamsSlashColonteam_idSlashmembers`(value: ParametersTeamsListMembersLegacyEndpoint): Self = StObject.set(x, "GET /teams/:team_id/members", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashteamsSlashColonteam_idSlashprojects`(value: ParametersTeamsListProjectsLegacyEndpoint): Self = StObject.set(x, "GET /teams/:team_id/projects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashteamsSlashColonteam_idSlashrepos`(value: ParametersTeamsListReposLegacyEndpoint): Self = StObject.set(x, "GET /teams/:team_id/repos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashteamsSlashColonteam_idSlashteam-syncSlashgroup-mappings`(value: ParametersTeamsListIdPGroupsForLegacyEndpoint): Self = StObject.set(x, "GET /teams/:team_id/team-sync/group-mappings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashteamsSlashColonteam_idSlashteams`(value: ParametersTeamsListChildLegacyEndpoint): Self = StObject.set(x, "GET /teams/:team_id/teams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashuserSlashblocks`(value: ParametersUsersListBlockedByAuthenticatedEndpoint): Self = StObject.set(x, "GET /user/blocks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashuserSlashemails`(value: ParametersUsersListEmailsForAuthenticatedEndpoint): Self = StObject.set(x, "GET /user/emails", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashuserSlashfollowers`(value: ParametersUsersListFollowersForAuthenticatedUserEndpoint): Self = StObject.set(x, "GET /user/followers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashuserSlashfollowing`(value: ParametersUsersListFollowedByAuthenticatedEndpoint): Self = StObject.set(x, "GET /user/following", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashuserSlashgpg_keys`(value: ParametersUsersListGpgKeysForAuthenticatedEndpoint): Self = StObject.set(x, "GET /user/gpg_keys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashuserSlashinstallations`(value: ParametersAppsListInstallationsForAuthenticatedUserEndpoint): Self = StObject.set(x, "GET /user/installations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashuserSlashinstallationsSlashColoninstallation_idSlashrepositories`(value: ParametersAppsListInstallationReposForAuthenticatedUserEndpoint): Self = StObject.set(x, "GET /user/installations/:installation_id/repositories", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashuserSlashissues`(value: ParametersIssuesListForAuthenticatedUserEndpoint): Self = StObject.set(x, "GET /user/issues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashuserSlashkeys`(value: ParametersUsersListPublicSshKeysForAuthenticatedEndpoint): Self = StObject.set(x, "GET /user/keys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashuserSlashmarketplace_purchases`(value: ParametersAppsListSubscriptionsForAuthenticatedUserEndpoint): Self = StObject.set(x, "GET /user/marketplace_purchases", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashuserSlashmarketplace_purchasesSlashstubbed`(value: ParametersAppsListSubscriptionsForAuthenticatedUserStubbedEndpoint): Self = StObject.set(x, "GET /user/marketplace_purchases/stubbed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashuserSlashmembershipsSlashorgs`(value: ParametersOrgsListMembershipsForAuthenticatedUserEndpoint): Self = StObject.set(x, "GET /user/memberships/orgs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashuserSlashmigrations`(value: ParametersMigrationsListForAuthenticatedUserEndpoint): Self = StObject.set(x, "GET /user/migrations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashuserSlashmigrationsSlashColonmigration_idSlashrepositories`(value: ParametersMigrationsListReposForUserEndpoint): Self = StObject.set(x, "GET /user/migrations/:migration_id/repositories", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashuserSlashorgs`(value: ParametersOrgsListForAuthenticatedUserEndpoint): Self = StObject.set(x, "GET /user/orgs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashuserSlashpublic_emails`(value: ParametersUsersListPublicEmailsForAuthenticatedEndpoint): Self = StObject.set(x, "GET /user/public_emails", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashuserSlashrepository_invitations`(value: ParametersReposListInvitationsForAuthenticatedUserEndpoint): Self = StObject.set(x, "GET /user/repository_invitations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashuserSlashstarred`(value: ParametersActivityListReposStarredByAuthenticatedUserEndpoint): Self = StObject.set(x, "GET /user/starred", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashuserSlashsubscriptions`(value: ParametersActivityListWatchedReposForAuthenticatedUserEndpoint): Self = StObject.set(x, "GET /user/subscriptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashuserSlashteams`(value: ParametersTeamsListForAuthenticatedUserEndpoint): Self = StObject.set(x, "GET /user/teams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET Slashusers`(value: ParametersUsersListEndpoint): Self = StObject.set(x, "GET /users", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashusersSlashColonusernameSlashfollowers`(value: ParametersUsersListFollowersForUserEndpoint): Self = StObject.set(x, "GET /users/:username/followers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashusersSlashColonusernameSlashfollowing`(value: ParametersUsersListFollowingForUserEndpoint): Self = StObject.set(x, "GET /users/:username/following", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashusersSlashColonusernameSlashgists`(value: ParametersGistsListForUserEndpoint): Self = StObject.set(x, "GET /users/:username/gists", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashusersSlashColonusernameSlashgpg_keys`(value: ParametersUsersListGpgKeysForUserEndpoint): Self = StObject.set(x, "GET /users/:username/gpg_keys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashusersSlashColonusernameSlashkeys`(value: ParametersUsersListPublicKeysForUserEndpoint): Self = StObject.set(x, "GET /users/:username/keys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashusersSlashColonusernameSlashorgs`(value: ParametersOrgsListForUserEndpoint): Self = StObject.set(x, "GET /users/:username/orgs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashusersSlashColonusernameSlashprojects`(value: ParametersProjectsListForUserEndpoint): Self = StObject.set(x, "GET /users/:username/projects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashusersSlashColonusernameSlashstarred`(value: ParametersActivityListReposStarredByUserEndpoint): Self = StObject.set(x, "GET /users/:username/starred", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGET SlashusersSlashColonusernameSlashsubscriptions`(value: ParametersActivityListReposWatchedByUserEndpoint): Self = StObject.set(x, "GET /users/:username/subscriptions", value.asInstanceOf[js.Any])
    }
  }
}
