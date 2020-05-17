package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.AnyResponse
import typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.ReactionsCreateForCommitCommentParams
import typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.ReactionsCreateForIssueCommentParams
import typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.ReactionsCreateForIssueParams
import typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.ReactionsCreateForIssueParamsDeprecatedNumber
import typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.ReactionsCreateForPullRequestReviewCommentParams
import typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.ReactionsCreateForTeamDiscussionCommentInOrgParams
import typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.ReactionsCreateForTeamDiscussionCommentLegacyParams
import typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.ReactionsCreateForTeamDiscussionCommentParams
import typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.ReactionsCreateForTeamDiscussionInOrgParams
import typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.ReactionsCreateForTeamDiscussionLegacyParams
import typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.ReactionsCreateForTeamDiscussionParams
import typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.ReactionsDeleteParams
import typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.ReactionsListForCommitCommentParams
import typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.ReactionsListForIssueCommentParams
import typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.ReactionsListForIssueParams
import typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.ReactionsListForIssueParamsDeprecatedNumber
import typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.ReactionsListForPullRequestReviewCommentParams
import typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.ReactionsListForTeamDiscussionCommentInOrgParams
import typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.ReactionsListForTeamDiscussionCommentLegacyParams
import typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.ReactionsListForTeamDiscussionCommentParams
import typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.ReactionsListForTeamDiscussionInOrgParams
import typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.ReactionsListForTeamDiscussionLegacyParams
import typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.ReactionsListForTeamDiscussionParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateForIssue extends js.Object {
  /**
    * Create a reaction to a [commit comment](https://developer.github.com/v3/repos/comments/). A response with a `Status: 200 OK` means that you already added the reaction type to this commit comment.
    */
  @JSName("createForCommitComment")
  var createForCommitComment_Original: `313` = js.native
  /**
    * Create a reaction to an [issue comment](https://developer.github.com/v3/issues/comments/). A response with a `Status: 200 OK` means that you already added the reaction type to this issue comment.
    */
  @JSName("createForIssueComment")
  var createForIssueComment_Original: `315` = js.native
  /**
    * Create a reaction to an [issue](https://developer.github.com/v3/issues/). A response with a `Status: 200 OK` means that you already added the reaction type to this issue.
    */
  @JSName("createForIssue")
  var createForIssue_Original: `314` = js.native
  /**
    * Create a reaction to a [pull request review comment](https://developer.github.com/v3/pulls/comments/). A response with a `Status: 200 OK` means that you already added the reaction type to this pull request review comment.
    */
  @JSName("createForPullRequestReviewComment")
  var createForPullRequestReviewComment_Original: `316` = js.native
  /**
    * Create a reaction to a [team discussion comment](https://developer.github.com/v3/teams/discussion_comments/). OAuth access tokens require the `write:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/). A response with a `Status: 200 OK` means that you already added the reaction type to this team discussion comment.
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `POST /organizations/:org_id/team/:team_id/discussions/:discussion_number/comments/:comment_number/reactions`.
    */
  @JSName("createForTeamDiscussionCommentInOrg")
  var createForTeamDiscussionCommentInOrg_Original: `319` = js.native
  /**
    * **Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [`Create reaction for a team discussion comment`](https://developer.github.com/v3/reactions/#create-reaction-for-a-team-discussion-comment) endpoint.
    *
    * Create a reaction to a [team discussion comment](https://developer.github.com/v3/teams/discussion_comments/). OAuth access tokens require the `write:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/). A response with a `Status: 200 OK` means that you already added the reaction type to this team discussion comment.
    * @deprecated octokit.reactions.createForTeamDiscussionCommentLegacy() is deprecated, see https://developer.github.com/v3/reactions/#create-reaction-for-a-team-discussion-comment-legacy
    */
  @JSName("createForTeamDiscussionCommentLegacy")
  var createForTeamDiscussionCommentLegacy_Original: `320` = js.native
  /**
    * **Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [`Create reaction for a team discussion comment`](https://developer.github.com/v3/reactions/#create-reaction-for-a-team-discussion-comment) endpoint.
    *
    * Create a reaction to a [team discussion comment](https://developer.github.com/v3/teams/discussion_comments/). OAuth access tokens require the `write:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/). A response with a `Status: 200 OK` means that you already added the reaction type to this team discussion comment.
    * @deprecated octokit.reactions.createForTeamDiscussionComment() is deprecated, see https://developer.github.com/v3/reactions/#create-reaction-for-a-team-discussion-comment-legacy
    */
  @JSName("createForTeamDiscussionComment")
  var createForTeamDiscussionComment_Original: `318` = js.native
  /**
    * Create a reaction to a [team discussion](https://developer.github.com/v3/teams/discussions/). OAuth access tokens require the `write:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/). A response with a `Status: 200 OK` means that you already added the reaction type to this team discussion.
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `POST /organizations/:org_id/team/:team_id/discussions/:discussion_number/reactions`.
    */
  @JSName("createForTeamDiscussionInOrg")
  var createForTeamDiscussionInOrg_Original: `321` = js.native
  /**
    * **Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [`Create reaction for a team discussion`](https://developer.github.com/v3/reactions/#create-reaction-for-a-team-discussion) endpoint.
    *
    * Create a reaction to a [team discussion](https://developer.github.com/v3/teams/discussions/). OAuth access tokens require the `write:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/). A response with a `Status: 200 OK` means that you already added the reaction type to this team discussion.
    * @deprecated octokit.reactions.createForTeamDiscussionLegacy() is deprecated, see https://developer.github.com/v3/reactions/#create-reaction-for-a-team-discussion-legacy
    */
  @JSName("createForTeamDiscussionLegacy")
  var createForTeamDiscussionLegacy_Original: `322` = js.native
  /**
    * **Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [`Create reaction for a team discussion`](https://developer.github.com/v3/reactions/#create-reaction-for-a-team-discussion) endpoint.
    *
    * Create a reaction to a [team discussion](https://developer.github.com/v3/teams/discussions/). OAuth access tokens require the `write:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/). A response with a `Status: 200 OK` means that you already added the reaction type to this team discussion.
    * @deprecated octokit.reactions.createForTeamDiscussion() is deprecated, see https://developer.github.com/v3/reactions/#create-reaction-for-a-team-discussion-legacy
    */
  @JSName("createForTeamDiscussion")
  var createForTeamDiscussion_Original: `317` = js.native
  /**
    * OAuth access tokens require the `write:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/), when deleting a [team discussion](https://developer.github.com/v3/teams/discussions/) or [team discussion comment](https://developer.github.com/v3/teams/discussion_comments/).
    */
  @JSName("delete")
  var delete_Original: `323` = js.native
  /**
    * List the reactions to a [commit comment](https://developer.github.com/v3/repos/comments/).
    */
  @JSName("listForCommitComment")
  var listForCommitComment_Original: `324` = js.native
  /**
    * List the reactions to an [issue comment](https://developer.github.com/v3/issues/comments/).
    */
  @JSName("listForIssueComment")
  var listForIssueComment_Original: `326` = js.native
  /**
    * List the reactions to an [issue](https://developer.github.com/v3/issues/).
    */
  @JSName("listForIssue")
  var listForIssue_Original: `325` = js.native
  /**
    * List the reactions to a [pull request review comment](https://developer.github.com/v3/pulls/comments/).
    */
  @JSName("listForPullRequestReviewComment")
  var listForPullRequestReviewComment_Original: `327` = js.native
  /**
    * List the reactions to a [team discussion comment](https://developer.github.com/v3/teams/discussion_comments/). OAuth access tokens require the `read:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `GET /organizations/:org_id/team/:team_id/discussions/:discussion_number/comments/:comment_number/reactions`.
    */
  @JSName("listForTeamDiscussionCommentInOrg")
  var listForTeamDiscussionCommentInOrg_Original: `330` = js.native
  /**
    * **Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [`List reactions for a team discussion comment`](https://developer.github.com/v3/reactions/#list-reactions-for-a-team-discussion-comment) endpoint.
    *
    * List the reactions to a [team discussion comment](https://developer.github.com/v3/teams/discussion_comments/). OAuth access tokens require the `read:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    * @deprecated octokit.reactions.listForTeamDiscussionCommentLegacy() is deprecated, see https://developer.github.com/v3/reactions/#list-reactions-for-a-team-discussion-comment-legacy
    */
  @JSName("listForTeamDiscussionCommentLegacy")
  var listForTeamDiscussionCommentLegacy_Original: `331` = js.native
  /**
    * **Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [`List reactions for a team discussion comment`](https://developer.github.com/v3/reactions/#list-reactions-for-a-team-discussion-comment) endpoint.
    *
    * List the reactions to a [team discussion comment](https://developer.github.com/v3/teams/discussion_comments/). OAuth access tokens require the `read:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    * @deprecated octokit.reactions.listForTeamDiscussionComment() is deprecated, see https://developer.github.com/v3/reactions/#list-reactions-for-a-team-discussion-comment-legacy
    */
  @JSName("listForTeamDiscussionComment")
  var listForTeamDiscussionComment_Original: `329` = js.native
  /**
    * List the reactions to a [team discussion](https://developer.github.com/v3/teams/discussions/). OAuth access tokens require the `read:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `GET /organizations/:org_id/team/:team_id/discussions/:discussion_number/reactions`.
    */
  @JSName("listForTeamDiscussionInOrg")
  var listForTeamDiscussionInOrg_Original: `332` = js.native
  /**
    * **Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [`List reactions for a team discussion`](https://developer.github.com/v3/reactions/#list-reactions-for-a-team-discussion) endpoint.
    *
    * List the reactions to a [team discussion](https://developer.github.com/v3/teams/discussions/). OAuth access tokens require the `read:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    * @deprecated octokit.reactions.listForTeamDiscussionLegacy() is deprecated, see https://developer.github.com/v3/reactions/#list-reactions-for-a-team-discussion-legacy
    */
  @JSName("listForTeamDiscussionLegacy")
  var listForTeamDiscussionLegacy_Original: `333` = js.native
  /**
    * **Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [`List reactions for a team discussion`](https://developer.github.com/v3/reactions/#list-reactions-for-a-team-discussion) endpoint.
    *
    * List the reactions to a [team discussion](https://developer.github.com/v3/teams/discussions/). OAuth access tokens require the `read:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    * @deprecated octokit.reactions.listForTeamDiscussion() is deprecated, see https://developer.github.com/v3/reactions/#list-reactions-for-a-team-discussion-legacy
    */
  @JSName("listForTeamDiscussion")
  var listForTeamDiscussion_Original: `328` = js.native
  /**
    * Create a reaction to a [commit comment](https://developer.github.com/v3/repos/comments/). A response with a `Status: 200 OK` means that you already added the reaction type to this commit comment.
    */
  def createForCommitComment(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ReactionsCreateForCommitCommentResponse> */ _
  ] = js.native
  def createForCommitComment(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ReactionsCreateForCommitCommentParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ReactionsCreateForCommitCommentResponse> */ _
  ] = js.native
  /**
    * Create a reaction to an [issue](https://developer.github.com/v3/issues/). A response with a `Status: 200 OK` means that you already added the reaction type to this issue.
    */
  def createForIssue(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ReactionsCreateForIssueResponse> */ _
  ] = js.native
  def createForIssue(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ReactionsCreateForIssueParamsDeprecatedNumber
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ReactionsCreateForIssueResponse> */ _
  ] = js.native
  def createForIssue(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ReactionsCreateForIssueParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ReactionsCreateForIssueResponse> */ _
  ] = js.native
  /**
    * Create a reaction to an [issue comment](https://developer.github.com/v3/issues/comments/). A response with a `Status: 200 OK` means that you already added the reaction type to this issue comment.
    */
  def createForIssueComment(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ReactionsCreateForIssueCommentResponse> */ _
  ] = js.native
  def createForIssueComment(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ReactionsCreateForIssueCommentParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ReactionsCreateForIssueCommentResponse> */ _
  ] = js.native
  /**
    * Create a reaction to a [pull request review comment](https://developer.github.com/v3/pulls/comments/). A response with a `Status: 200 OK` means that you already added the reaction type to this pull request review comment.
    */
  def createForPullRequestReviewComment(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ReactionsCreateForPullRequestReviewCommentResponse> */ _
  ] = js.native
  def createForPullRequestReviewComment(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ReactionsCreateForPullRequestReviewCommentParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ReactionsCreateForPullRequestReviewCommentResponse> */ _
  ] = js.native
  /**
    * **Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [`Create reaction for a team discussion`](https://developer.github.com/v3/reactions/#create-reaction-for-a-team-discussion) endpoint.
    *
    * Create a reaction to a [team discussion](https://developer.github.com/v3/teams/discussions/). OAuth access tokens require the `write:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/). A response with a `Status: 200 OK` means that you already added the reaction type to this team discussion.
    * @deprecated octokit.reactions.createForTeamDiscussion() is deprecated, see https://developer.github.com/v3/reactions/#create-reaction-for-a-team-discussion-legacy
    */
  def createForTeamDiscussion(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ReactionsCreateForTeamDiscussionResponse> */ _
  ] = js.native
  def createForTeamDiscussion(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ReactionsCreateForTeamDiscussionParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ReactionsCreateForTeamDiscussionResponse> */ _
  ] = js.native
  /**
    * **Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [`Create reaction for a team discussion comment`](https://developer.github.com/v3/reactions/#create-reaction-for-a-team-discussion-comment) endpoint.
    *
    * Create a reaction to a [team discussion comment](https://developer.github.com/v3/teams/discussion_comments/). OAuth access tokens require the `write:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/). A response with a `Status: 200 OK` means that you already added the reaction type to this team discussion comment.
    * @deprecated octokit.reactions.createForTeamDiscussionComment() is deprecated, see https://developer.github.com/v3/reactions/#create-reaction-for-a-team-discussion-comment-legacy
    */
  def createForTeamDiscussionComment(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ReactionsCreateForTeamDiscussionCommentResponse> */ _
  ] = js.native
  def createForTeamDiscussionComment(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ReactionsCreateForTeamDiscussionCommentParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ReactionsCreateForTeamDiscussionCommentResponse> */ _
  ] = js.native
  /**
    * Create a reaction to a [team discussion comment](https://developer.github.com/v3/teams/discussion_comments/). OAuth access tokens require the `write:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/). A response with a `Status: 200 OK` means that you already added the reaction type to this team discussion comment.
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `POST /organizations/:org_id/team/:team_id/discussions/:discussion_number/comments/:comment_number/reactions`.
    */
  def createForTeamDiscussionCommentInOrg(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ReactionsCreateForTeamDiscussionCommentInOrgResponse> */ _
  ] = js.native
  def createForTeamDiscussionCommentInOrg(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ReactionsCreateForTeamDiscussionCommentInOrgParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ReactionsCreateForTeamDiscussionCommentInOrgResponse> */ _
  ] = js.native
  /**
    * **Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [`Create reaction for a team discussion comment`](https://developer.github.com/v3/reactions/#create-reaction-for-a-team-discussion-comment) endpoint.
    *
    * Create a reaction to a [team discussion comment](https://developer.github.com/v3/teams/discussion_comments/). OAuth access tokens require the `write:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/). A response with a `Status: 200 OK` means that you already added the reaction type to this team discussion comment.
    * @deprecated octokit.reactions.createForTeamDiscussionCommentLegacy() is deprecated, see https://developer.github.com/v3/reactions/#create-reaction-for-a-team-discussion-comment-legacy
    */
  def createForTeamDiscussionCommentLegacy(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ReactionsCreateForTeamDiscussionCommentLegacyResponse> */ _
  ] = js.native
  def createForTeamDiscussionCommentLegacy(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ReactionsCreateForTeamDiscussionCommentLegacyParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ReactionsCreateForTeamDiscussionCommentLegacyResponse> */ _
  ] = js.native
  /**
    * Create a reaction to a [team discussion](https://developer.github.com/v3/teams/discussions/). OAuth access tokens require the `write:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/). A response with a `Status: 200 OK` means that you already added the reaction type to this team discussion.
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `POST /organizations/:org_id/team/:team_id/discussions/:discussion_number/reactions`.
    */
  def createForTeamDiscussionInOrg(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ReactionsCreateForTeamDiscussionInOrgResponse> */ _
  ] = js.native
  def createForTeamDiscussionInOrg(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ReactionsCreateForTeamDiscussionInOrgParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ReactionsCreateForTeamDiscussionInOrgResponse> */ _
  ] = js.native
  /**
    * **Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [`Create reaction for a team discussion`](https://developer.github.com/v3/reactions/#create-reaction-for-a-team-discussion) endpoint.
    *
    * Create a reaction to a [team discussion](https://developer.github.com/v3/teams/discussions/). OAuth access tokens require the `write:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/). A response with a `Status: 200 OK` means that you already added the reaction type to this team discussion.
    * @deprecated octokit.reactions.createForTeamDiscussionLegacy() is deprecated, see https://developer.github.com/v3/reactions/#create-reaction-for-a-team-discussion-legacy
    */
  def createForTeamDiscussionLegacy(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ReactionsCreateForTeamDiscussionLegacyResponse> */ _
  ] = js.native
  def createForTeamDiscussionLegacy(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ReactionsCreateForTeamDiscussionLegacyParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ReactionsCreateForTeamDiscussionLegacyResponse> */ _
  ] = js.native
  /**
    * OAuth access tokens require the `write:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/), when deleting a [team discussion](https://developer.github.com/v3/teams/discussions/) or [team discussion comment](https://developer.github.com/v3/teams/discussion_comments/).
    */
  def delete(): js.Promise[AnyResponse] = js.native
  def delete(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ReactionsDeleteParams
  ): js.Promise[AnyResponse] = js.native
  /**
    * List the reactions to a [commit comment](https://developer.github.com/v3/repos/comments/).
    */
  def listForCommitComment(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ReactionsListForCommitCommentResponse> */ _
  ] = js.native
  def listForCommitComment(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ReactionsListForCommitCommentParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ReactionsListForCommitCommentResponse> */ _
  ] = js.native
  /**
    * List the reactions to an [issue](https://developer.github.com/v3/issues/).
    */
  def listForIssue(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ReactionsListForIssueResponse> */ _
  ] = js.native
  def listForIssue(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ReactionsListForIssueParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ReactionsListForIssueResponse> */ _
  ] = js.native
  def listForIssue(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ReactionsListForIssueParamsDeprecatedNumber
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ReactionsListForIssueResponse> */ _
  ] = js.native
  /**
    * List the reactions to an [issue comment](https://developer.github.com/v3/issues/comments/).
    */
  def listForIssueComment(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ReactionsListForIssueCommentResponse> */ _
  ] = js.native
  def listForIssueComment(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ReactionsListForIssueCommentParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ReactionsListForIssueCommentResponse> */ _
  ] = js.native
  /**
    * List the reactions to a [pull request review comment](https://developer.github.com/v3/pulls/comments/).
    */
  def listForPullRequestReviewComment(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ReactionsListForPullRequestReviewCommentResponse> */ _
  ] = js.native
  def listForPullRequestReviewComment(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ReactionsListForPullRequestReviewCommentParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ReactionsListForPullRequestReviewCommentResponse> */ _
  ] = js.native
  /**
    * **Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [`List reactions for a team discussion`](https://developer.github.com/v3/reactions/#list-reactions-for-a-team-discussion) endpoint.
    *
    * List the reactions to a [team discussion](https://developer.github.com/v3/teams/discussions/). OAuth access tokens require the `read:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    * @deprecated octokit.reactions.listForTeamDiscussion() is deprecated, see https://developer.github.com/v3/reactions/#list-reactions-for-a-team-discussion-legacy
    */
  def listForTeamDiscussion(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ReactionsListForTeamDiscussionResponse> */ _
  ] = js.native
  def listForTeamDiscussion(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ReactionsListForTeamDiscussionParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ReactionsListForTeamDiscussionResponse> */ _
  ] = js.native
  /**
    * **Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [`List reactions for a team discussion comment`](https://developer.github.com/v3/reactions/#list-reactions-for-a-team-discussion-comment) endpoint.
    *
    * List the reactions to a [team discussion comment](https://developer.github.com/v3/teams/discussion_comments/). OAuth access tokens require the `read:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    * @deprecated octokit.reactions.listForTeamDiscussionComment() is deprecated, see https://developer.github.com/v3/reactions/#list-reactions-for-a-team-discussion-comment-legacy
    */
  def listForTeamDiscussionComment(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ReactionsListForTeamDiscussionCommentResponse> */ _
  ] = js.native
  def listForTeamDiscussionComment(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ReactionsListForTeamDiscussionCommentParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ReactionsListForTeamDiscussionCommentResponse> */ _
  ] = js.native
  /**
    * List the reactions to a [team discussion comment](https://developer.github.com/v3/teams/discussion_comments/). OAuth access tokens require the `read:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `GET /organizations/:org_id/team/:team_id/discussions/:discussion_number/comments/:comment_number/reactions`.
    */
  def listForTeamDiscussionCommentInOrg(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ReactionsListForTeamDiscussionCommentInOrgResponse> */ _
  ] = js.native
  def listForTeamDiscussionCommentInOrg(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ReactionsListForTeamDiscussionCommentInOrgParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ReactionsListForTeamDiscussionCommentInOrgResponse> */ _
  ] = js.native
  /**
    * **Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [`List reactions for a team discussion comment`](https://developer.github.com/v3/reactions/#list-reactions-for-a-team-discussion-comment) endpoint.
    *
    * List the reactions to a [team discussion comment](https://developer.github.com/v3/teams/discussion_comments/). OAuth access tokens require the `read:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    * @deprecated octokit.reactions.listForTeamDiscussionCommentLegacy() is deprecated, see https://developer.github.com/v3/reactions/#list-reactions-for-a-team-discussion-comment-legacy
    */
  def listForTeamDiscussionCommentLegacy(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ReactionsListForTeamDiscussionCommentLegacyResponse> */ _
  ] = js.native
  def listForTeamDiscussionCommentLegacy(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ReactionsListForTeamDiscussionCommentLegacyParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ReactionsListForTeamDiscussionCommentLegacyResponse> */ _
  ] = js.native
  /**
    * List the reactions to a [team discussion](https://developer.github.com/v3/teams/discussions/). OAuth access tokens require the `read:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `GET /organizations/:org_id/team/:team_id/discussions/:discussion_number/reactions`.
    */
  def listForTeamDiscussionInOrg(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ReactionsListForTeamDiscussionInOrgResponse> */ _
  ] = js.native
  def listForTeamDiscussionInOrg(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ReactionsListForTeamDiscussionInOrgParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ReactionsListForTeamDiscussionInOrgResponse> */ _
  ] = js.native
  /**
    * **Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [`List reactions for a team discussion`](https://developer.github.com/v3/reactions/#list-reactions-for-a-team-discussion) endpoint.
    *
    * List the reactions to a [team discussion](https://developer.github.com/v3/teams/discussions/). OAuth access tokens require the `read:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    * @deprecated octokit.reactions.listForTeamDiscussionLegacy() is deprecated, see https://developer.github.com/v3/reactions/#list-reactions-for-a-team-discussion-legacy
    */
  def listForTeamDiscussionLegacy(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ReactionsListForTeamDiscussionLegacyResponse> */ _
  ] = js.native
  def listForTeamDiscussionLegacy(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ReactionsListForTeamDiscussionLegacyParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ReactionsListForTeamDiscussionLegacyResponse> */ _
  ] = js.native
}

