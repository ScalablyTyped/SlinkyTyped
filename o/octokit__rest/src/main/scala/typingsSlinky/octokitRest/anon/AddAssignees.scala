package typingsSlinky.octokitRest.anon

import typingsSlinky.octokitRest.mod.Octokit.AnyResponse
import typingsSlinky.octokitRest.mod.Octokit.IssuesAddAssigneesParams
import typingsSlinky.octokitRest.mod.Octokit.IssuesAddAssigneesParamsDeprecatedNumber
import typingsSlinky.octokitRest.mod.Octokit.IssuesAddAssigneesResponse
import typingsSlinky.octokitRest.mod.Octokit.IssuesAddLabelsParams
import typingsSlinky.octokitRest.mod.Octokit.IssuesAddLabelsParamsDeprecatedNumber
import typingsSlinky.octokitRest.mod.Octokit.IssuesAddLabelsResponse
import typingsSlinky.octokitRest.mod.Octokit.IssuesCheckAssigneeParams
import typingsSlinky.octokitRest.mod.Octokit.IssuesCreateCommentParams
import typingsSlinky.octokitRest.mod.Octokit.IssuesCreateCommentParamsDeprecatedNumber
import typingsSlinky.octokitRest.mod.Octokit.IssuesCreateCommentResponse
import typingsSlinky.octokitRest.mod.Octokit.IssuesCreateLabelParams
import typingsSlinky.octokitRest.mod.Octokit.IssuesCreateLabelResponse
import typingsSlinky.octokitRest.mod.Octokit.IssuesCreateMilestoneParams
import typingsSlinky.octokitRest.mod.Octokit.IssuesCreateMilestoneResponse
import typingsSlinky.octokitRest.mod.Octokit.IssuesCreateParams
import typingsSlinky.octokitRest.mod.Octokit.IssuesCreateParamsDeprecatedAssignee
import typingsSlinky.octokitRest.mod.Octokit.IssuesCreateResponse
import typingsSlinky.octokitRest.mod.Octokit.IssuesDeleteCommentParams
import typingsSlinky.octokitRest.mod.Octokit.IssuesDeleteLabelParams
import typingsSlinky.octokitRest.mod.Octokit.IssuesDeleteMilestoneParams
import typingsSlinky.octokitRest.mod.Octokit.IssuesDeleteMilestoneParamsDeprecatedNumber
import typingsSlinky.octokitRest.mod.Octokit.IssuesGetCommentParams
import typingsSlinky.octokitRest.mod.Octokit.IssuesGetCommentResponse
import typingsSlinky.octokitRest.mod.Octokit.IssuesGetEventParams
import typingsSlinky.octokitRest.mod.Octokit.IssuesGetEventResponse
import typingsSlinky.octokitRest.mod.Octokit.IssuesGetLabelParams
import typingsSlinky.octokitRest.mod.Octokit.IssuesGetLabelResponse
import typingsSlinky.octokitRest.mod.Octokit.IssuesGetMilestoneParams
import typingsSlinky.octokitRest.mod.Octokit.IssuesGetMilestoneParamsDeprecatedNumber
import typingsSlinky.octokitRest.mod.Octokit.IssuesGetMilestoneResponse
import typingsSlinky.octokitRest.mod.Octokit.IssuesGetParams
import typingsSlinky.octokitRest.mod.Octokit.IssuesGetParamsDeprecatedNumber
import typingsSlinky.octokitRest.mod.Octokit.IssuesGetResponse
import typingsSlinky.octokitRest.mod.Octokit.IssuesListAssigneesParams
import typingsSlinky.octokitRest.mod.Octokit.IssuesListAssigneesResponse
import typingsSlinky.octokitRest.mod.Octokit.IssuesListCommentsForRepoParams
import typingsSlinky.octokitRest.mod.Octokit.IssuesListCommentsForRepoResponse
import typingsSlinky.octokitRest.mod.Octokit.IssuesListCommentsParams
import typingsSlinky.octokitRest.mod.Octokit.IssuesListCommentsParamsDeprecatedNumber
import typingsSlinky.octokitRest.mod.Octokit.IssuesListCommentsResponse
import typingsSlinky.octokitRest.mod.Octokit.IssuesListEventsForRepoParams
import typingsSlinky.octokitRest.mod.Octokit.IssuesListEventsForRepoResponse
import typingsSlinky.octokitRest.mod.Octokit.IssuesListEventsForTimelineParams
import typingsSlinky.octokitRest.mod.Octokit.IssuesListEventsForTimelineParamsDeprecatedNumber
import typingsSlinky.octokitRest.mod.Octokit.IssuesListEventsForTimelineResponse
import typingsSlinky.octokitRest.mod.Octokit.IssuesListEventsParams
import typingsSlinky.octokitRest.mod.Octokit.IssuesListEventsParamsDeprecatedNumber
import typingsSlinky.octokitRest.mod.Octokit.IssuesListEventsResponse
import typingsSlinky.octokitRest.mod.Octokit.IssuesListForAuthenticatedUserParams
import typingsSlinky.octokitRest.mod.Octokit.IssuesListForAuthenticatedUserResponse
import typingsSlinky.octokitRest.mod.Octokit.IssuesListForOrgParams
import typingsSlinky.octokitRest.mod.Octokit.IssuesListForOrgResponse
import typingsSlinky.octokitRest.mod.Octokit.IssuesListForRepoParams
import typingsSlinky.octokitRest.mod.Octokit.IssuesListForRepoResponse
import typingsSlinky.octokitRest.mod.Octokit.IssuesListLabelsForMilestoneParams
import typingsSlinky.octokitRest.mod.Octokit.IssuesListLabelsForMilestoneParamsDeprecatedNumber
import typingsSlinky.octokitRest.mod.Octokit.IssuesListLabelsForMilestoneResponse
import typingsSlinky.octokitRest.mod.Octokit.IssuesListLabelsForRepoParams
import typingsSlinky.octokitRest.mod.Octokit.IssuesListLabelsForRepoResponse
import typingsSlinky.octokitRest.mod.Octokit.IssuesListLabelsOnIssueParams
import typingsSlinky.octokitRest.mod.Octokit.IssuesListLabelsOnIssueParamsDeprecatedNumber
import typingsSlinky.octokitRest.mod.Octokit.IssuesListLabelsOnIssueResponse
import typingsSlinky.octokitRest.mod.Octokit.IssuesListMilestonesForRepoParams
import typingsSlinky.octokitRest.mod.Octokit.IssuesListMilestonesForRepoResponse
import typingsSlinky.octokitRest.mod.Octokit.IssuesListParams
import typingsSlinky.octokitRest.mod.Octokit.IssuesListResponse
import typingsSlinky.octokitRest.mod.Octokit.IssuesLockParams
import typingsSlinky.octokitRest.mod.Octokit.IssuesLockParamsDeprecatedNumber
import typingsSlinky.octokitRest.mod.Octokit.IssuesRemoveAssigneesParams
import typingsSlinky.octokitRest.mod.Octokit.IssuesRemoveAssigneesParamsDeprecatedNumber
import typingsSlinky.octokitRest.mod.Octokit.IssuesRemoveAssigneesResponse
import typingsSlinky.octokitRest.mod.Octokit.IssuesRemoveLabelParams
import typingsSlinky.octokitRest.mod.Octokit.IssuesRemoveLabelParamsDeprecatedNumber
import typingsSlinky.octokitRest.mod.Octokit.IssuesRemoveLabelResponse
import typingsSlinky.octokitRest.mod.Octokit.IssuesRemoveLabelsParams
import typingsSlinky.octokitRest.mod.Octokit.IssuesRemoveLabelsParamsDeprecatedNumber
import typingsSlinky.octokitRest.mod.Octokit.IssuesReplaceLabelsParams
import typingsSlinky.octokitRest.mod.Octokit.IssuesReplaceLabelsParamsDeprecatedNumber
import typingsSlinky.octokitRest.mod.Octokit.IssuesReplaceLabelsResponse
import typingsSlinky.octokitRest.mod.Octokit.IssuesUnlockParams
import typingsSlinky.octokitRest.mod.Octokit.IssuesUnlockParamsDeprecatedNumber
import typingsSlinky.octokitRest.mod.Octokit.IssuesUpdateCommentParams
import typingsSlinky.octokitRest.mod.Octokit.IssuesUpdateCommentResponse
import typingsSlinky.octokitRest.mod.Octokit.IssuesUpdateLabelParams
import typingsSlinky.octokitRest.mod.Octokit.IssuesUpdateLabelResponse
import typingsSlinky.octokitRest.mod.Octokit.IssuesUpdateMilestoneParams
import typingsSlinky.octokitRest.mod.Octokit.IssuesUpdateMilestoneParamsDeprecatedNumber
import typingsSlinky.octokitRest.mod.Octokit.IssuesUpdateMilestoneResponse
import typingsSlinky.octokitRest.mod.Octokit.IssuesUpdateParams
import typingsSlinky.octokitRest.mod.Octokit.IssuesUpdateParamsDeprecatedAssignee
import typingsSlinky.octokitRest.mod.Octokit.IssuesUpdateParamsDeprecatedNumber
import typingsSlinky.octokitRest.mod.Octokit.IssuesUpdateResponse
import typingsSlinky.octokitRest.mod.Octokit.RequestOptions
import typingsSlinky.octokitRest.mod.Octokit.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddAssignees extends js.Object {
  /**
    * Adds up to 10 assignees to an issue. Users already assigned to an issue are not replaced.
    *
    * This example adds two assignees to the existing `octocat` assignee.
    */
  @JSName("addAssignees")
  var addAssignees_Original: `146` = js.native
  @JSName("addLabels")
  var addLabels_Original: `147` = js.native
  /**
    * Checks if a user has permission to be assigned to an issue in this repository.
    *
    * If the `assignee` can be assigned to issues in the repository, a `204` header with no content is returned.
    *
    * Otherwise a `404` status code is returned.
    */
  @JSName("checkAssignee")
  var checkAssignee_Original: `148` = js.native
  /**
    * This endpoint triggers [notifications](https://help.github.com/articles/about-notifications/). Creating content too quickly using this endpoint may result in abuse rate limiting. See "[Abuse rate limits](https://developer.github.com/v3/#abuse-rate-limits)" and "[Dealing with abuse rate limits](https://developer.github.com/v3/guides/best-practices-for-integrators/#dealing-with-abuse-rate-limits)" for details.
    */
  @JSName("createComment")
  var createComment_Original: `150` = js.native
  @JSName("createLabel")
  var createLabel_Original: `151` = js.native
  @JSName("createMilestone")
  var createMilestone_Original: `152` = js.native
  /**
    * Any user with pull access to a repository can create an issue. If [issues are disabled in the repository](https://help.github.com/articles/disabling-issues/), the API returns a `410 Gone` status.
    *
    * This endpoint triggers [notifications](https://help.github.com/articles/about-notifications/). Creating content too quickly using this endpoint may result in abuse rate limiting. See "[Abuse rate limits](https://developer.github.com/v3/#abuse-rate-limits)" and "[Dealing with abuse rate limits](https://developer.github.com/v3/guides/best-practices-for-integrators/#dealing-with-abuse-rate-limits)" for details.
    */
  @JSName("create")
  var create_Original: `149` = js.native
  @JSName("deleteComment")
  var deleteComment_Original: `153` = js.native
  @JSName("deleteLabel")
  var deleteLabel_Original: `154` = js.native
  @JSName("deleteMilestone")
  var deleteMilestone_Original: `155` = js.native
  @JSName("getComment")
  var getComment_Original: `157` = js.native
  @JSName("getEvent")
  var getEvent_Original: `158` = js.native
  @JSName("getLabel")
  var getLabel_Original: `159` = js.native
  @JSName("getMilestone")
  var getMilestone_Original: `160` = js.native
  /**
    * The API returns a [`301 Moved Permanently` status](https://developer.github.com/v3/#http-redirects) if the issue was [transferred](https://help.github.com/articles/transferring-an-issue-to-another-repository/) to another repository. If the issue was transferred to or deleted from a repository where the authenticated user lacks read access, the API returns a `404 Not Found` status. If the issue was deleted from a repository where the authenticated user has read access, the API returns a `410 Gone` status. To receive webhook events for transferred and deleted issues, subscribe to the [`issues`](https://developer.github.com/v3/activity/events/types/#issuesevent) webhook.
    *
    * **Note**: GitHub's REST API v3 considers every pull request an issue, but not every issue is a pull request. For this reason, "Issues" endpoints may return both issues and pull requests in the response. You can identify pull requests by the `pull_request` key.
    *
    * Be aware that the `id` of a pull request returned from "Issues" endpoints will be an _issue id_. To find out the pull request id, use the "[List pull requests](https://developer.github.com/v3/pulls/#list-pull-requests)" endpoint.
    */
  @JSName("get")
  var get_Original: `156` = js.native
  /**
    * Lists the [available assignees](https://help.github.com/articles/assigning-issues-and-pull-requests-to-other-github-users/) for issues in a repository.
    */
  @JSName("listAssignees")
  var listAssignees_Original: `162` = js.native
  /**
    * By default, Issue Comments are ordered by ascending ID.
    */
  @JSName("listCommentsForRepo")
  var listCommentsForRepo_Original: `164` = js.native
  /**
    * Issue Comments are ordered by ascending ID.
    */
  @JSName("listComments")
  var listComments_Original: `163` = js.native
  @JSName("listEventsForRepo")
  var listEventsForRepo_Original: `166` = js.native
  @JSName("listEventsForTimeline")
  var listEventsForTimeline_Original: `167` = js.native
  @JSName("listEvents")
  var listEvents_Original: `165` = js.native
  /**
    * **Note**: GitHub's REST API v3 considers every pull request an issue, but not every issue is a pull request. For this reason, "Issues" endpoints may return both issues and pull requests in the response. You can identify pull requests by the `pull_request` key.
    *
    * Be aware that the `id` of a pull request returned from "Issues" endpoints will be an _issue id_. To find out the pull request id, use the "[List pull requests](https://developer.github.com/v3/pulls/#list-pull-requests)" endpoint.
    */
  @JSName("listForAuthenticatedUser")
  var listForAuthenticatedUser_Original: `168` = js.native
  /**
    * **Note**: GitHub's REST API v3 considers every pull request an issue, but not every issue is a pull request. For this reason, "Issues" endpoints may return both issues and pull requests in the response. You can identify pull requests by the `pull_request` key.
    *
    * Be aware that the `id` of a pull request returned from "Issues" endpoints will be an _issue id_. To find out the pull request id, use the "[List pull requests](https://developer.github.com/v3/pulls/#list-pull-requests)" endpoint.
    */
  @JSName("listForOrg")
  var listForOrg_Original: `169` = js.native
  /**
    * **Note**: GitHub's REST API v3 considers every pull request an issue, but not every issue is a pull request. For this reason, "Issues" endpoints may return both issues and pull requests in the response. You can identify pull requests by the `pull_request` key.
    *
    * Be aware that the `id` of a pull request returned from "Issues" endpoints will be an _issue id_. To find out the pull request id, use the "[List pull requests](https://developer.github.com/v3/pulls/#list-pull-requests)" endpoint.
    */
  @JSName("listForRepo")
  var listForRepo_Original: `170` = js.native
  @JSName("listLabelsForMilestone")
  var listLabelsForMilestone_Original: `171` = js.native
  @JSName("listLabelsForRepo")
  var listLabelsForRepo_Original: `172` = js.native
  @JSName("listLabelsOnIssue")
  var listLabelsOnIssue_Original: `173` = js.native
  @JSName("listMilestonesForRepo")
  var listMilestonesForRepo_Original: `174` = js.native
  /**
    * **Note**: GitHub's REST API v3 considers every pull request an issue, but not every issue is a pull request. For this reason, "Issues" endpoints may return both issues and pull requests in the response. You can identify pull requests by the `pull_request` key.
    *
    * Be aware that the `id` of a pull request returned from "Issues" endpoints will be an _issue id_. To find out the pull request id, use the "[List pull requests](https://developer.github.com/v3/pulls/#list-pull-requests)" endpoint.
    */
  @JSName("list")
  var list_Original: `161` = js.native
  /**
    * Users with push access can lock an issue or pull request's conversation.
    *
    * Note that, if you choose not to pass any parameters, you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://developer.github.com/v3/#http-verbs)."
    */
  @JSName("lock")
  var lock_Original: `175` = js.native
  /**
    * Removes one or more assignees from an issue.
    *
    * This example removes two of three assignees, leaving the `octocat` assignee.
    */
  @JSName("removeAssignees")
  var removeAssignees_Original: `176` = js.native
  /**
    * Removes the specified label from the issue, and returns the remaining labels on the issue. This endpoint returns a `404 Not Found` status if the label does not exist.
    */
  @JSName("removeLabel")
  var removeLabel_Original: `177` = js.native
  @JSName("removeLabels")
  var removeLabels_Original: `178` = js.native
  @JSName("replaceLabels")
  var replaceLabels_Original: `179` = js.native
  /**
    * Users with push access can unlock an issue's conversation.
    */
  @JSName("unlock")
  var unlock_Original: `180` = js.native
  @JSName("updateComment")
  var updateComment_Original: `182` = js.native
  @JSName("updateLabel")
  var updateLabel_Original: `183` = js.native
  @JSName("updateMilestone")
  var updateMilestone_Original: `184` = js.native
  /**
    * Issue owners and users with push access can edit an issue.
    */
  @JSName("update")
  var update_Original: `181` = js.native
  /**
    * Adds up to 10 assignees to an issue. Users already assigned to an issue are not replaced.
    *
    * This example adds two assignees to the existing `octocat` assignee.
    */
  def addAssignees(): js.Promise[Response[IssuesAddAssigneesResponse]] = js.native
  def addAssignees(params: RequestOptions with IssuesAddAssigneesParamsDeprecatedNumber with IssuesAddAssigneesParams): js.Promise[Response[IssuesAddAssigneesResponse]] = js.native
  def addLabels(): js.Promise[Response[IssuesAddLabelsResponse]] = js.native
  def addLabels(params: RequestOptions with IssuesAddLabelsParamsDeprecatedNumber with IssuesAddLabelsParams): js.Promise[Response[IssuesAddLabelsResponse]] = js.native
  /**
    * Checks if a user has permission to be assigned to an issue in this repository.
    *
    * If the `assignee` can be assigned to issues in the repository, a `204` header with no content is returned.
    *
    * Otherwise a `404` status code is returned.
    */
  def checkAssignee(): js.Promise[AnyResponse] = js.native
  def checkAssignee(params: RequestOptions with IssuesCheckAssigneeParams): js.Promise[AnyResponse] = js.native
  /**
    * Any user with pull access to a repository can create an issue. If [issues are disabled in the repository](https://help.github.com/articles/disabling-issues/), the API returns a `410 Gone` status.
    *
    * This endpoint triggers [notifications](https://help.github.com/articles/about-notifications/). Creating content too quickly using this endpoint may result in abuse rate limiting. See "[Abuse rate limits](https://developer.github.com/v3/#abuse-rate-limits)" and "[Dealing with abuse rate limits](https://developer.github.com/v3/guides/best-practices-for-integrators/#dealing-with-abuse-rate-limits)" for details.
    */
  def create(): js.Promise[Response[IssuesCreateResponse]] = js.native
  def create(params: RequestOptions with IssuesCreateParamsDeprecatedAssignee with IssuesCreateParams): js.Promise[Response[IssuesCreateResponse]] = js.native
  /**
    * This endpoint triggers [notifications](https://help.github.com/articles/about-notifications/). Creating content too quickly using this endpoint may result in abuse rate limiting. See "[Abuse rate limits](https://developer.github.com/v3/#abuse-rate-limits)" and "[Dealing with abuse rate limits](https://developer.github.com/v3/guides/best-practices-for-integrators/#dealing-with-abuse-rate-limits)" for details.
    */
  def createComment(): js.Promise[Response[IssuesCreateCommentResponse]] = js.native
  def createComment(
    params: RequestOptions with IssuesCreateCommentParamsDeprecatedNumber with IssuesCreateCommentParams
  ): js.Promise[Response[IssuesCreateCommentResponse]] = js.native
  def createLabel(): js.Promise[Response[IssuesCreateLabelResponse]] = js.native
  def createLabel(params: RequestOptions with IssuesCreateLabelParams): js.Promise[Response[IssuesCreateLabelResponse]] = js.native
  def createMilestone(): js.Promise[Response[IssuesCreateMilestoneResponse]] = js.native
  def createMilestone(params: RequestOptions with IssuesCreateMilestoneParams): js.Promise[Response[IssuesCreateMilestoneResponse]] = js.native
  def deleteComment(): js.Promise[AnyResponse] = js.native
  def deleteComment(params: RequestOptions with IssuesDeleteCommentParams): js.Promise[AnyResponse] = js.native
  def deleteLabel(): js.Promise[AnyResponse] = js.native
  def deleteLabel(params: RequestOptions with IssuesDeleteLabelParams): js.Promise[AnyResponse] = js.native
  def deleteMilestone(): js.Promise[AnyResponse] = js.native
  def deleteMilestone(
    params: RequestOptions with IssuesDeleteMilestoneParamsDeprecatedNumber with IssuesDeleteMilestoneParams
  ): js.Promise[AnyResponse] = js.native
  /**
    * The API returns a [`301 Moved Permanently` status](https://developer.github.com/v3/#http-redirects) if the issue was [transferred](https://help.github.com/articles/transferring-an-issue-to-another-repository/) to another repository. If the issue was transferred to or deleted from a repository where the authenticated user lacks read access, the API returns a `404 Not Found` status. If the issue was deleted from a repository where the authenticated user has read access, the API returns a `410 Gone` status. To receive webhook events for transferred and deleted issues, subscribe to the [`issues`](https://developer.github.com/v3/activity/events/types/#issuesevent) webhook.
    *
    * **Note**: GitHub's REST API v3 considers every pull request an issue, but not every issue is a pull request. For this reason, "Issues" endpoints may return both issues and pull requests in the response. You can identify pull requests by the `pull_request` key.
    *
    * Be aware that the `id` of a pull request returned from "Issues" endpoints will be an _issue id_. To find out the pull request id, use the "[List pull requests](https://developer.github.com/v3/pulls/#list-pull-requests)" endpoint.
    */
  def get(): js.Promise[Response[IssuesGetResponse]] = js.native
  def get(params: RequestOptions with IssuesGetParamsDeprecatedNumber with IssuesGetParams): js.Promise[Response[IssuesGetResponse]] = js.native
  def getComment(): js.Promise[Response[IssuesGetCommentResponse]] = js.native
  def getComment(params: RequestOptions with IssuesGetCommentParams): js.Promise[Response[IssuesGetCommentResponse]] = js.native
  def getEvent(): js.Promise[Response[IssuesGetEventResponse]] = js.native
  def getEvent(params: RequestOptions with IssuesGetEventParams): js.Promise[Response[IssuesGetEventResponse]] = js.native
  def getLabel(): js.Promise[Response[IssuesGetLabelResponse]] = js.native
  def getLabel(params: RequestOptions with IssuesGetLabelParams): js.Promise[Response[IssuesGetLabelResponse]] = js.native
  def getMilestone(): js.Promise[Response[IssuesGetMilestoneResponse]] = js.native
  def getMilestone(params: RequestOptions with IssuesGetMilestoneParamsDeprecatedNumber with IssuesGetMilestoneParams): js.Promise[Response[IssuesGetMilestoneResponse]] = js.native
  /**
    * **Note**: GitHub's REST API v3 considers every pull request an issue, but not every issue is a pull request. For this reason, "Issues" endpoints may return both issues and pull requests in the response. You can identify pull requests by the `pull_request` key.
    *
    * Be aware that the `id` of a pull request returned from "Issues" endpoints will be an _issue id_. To find out the pull request id, use the "[List pull requests](https://developer.github.com/v3/pulls/#list-pull-requests)" endpoint.
    */
  def list(): js.Promise[Response[IssuesListResponse]] = js.native
  def list(params: RequestOptions with IssuesListParams): js.Promise[Response[IssuesListResponse]] = js.native
  /**
    * Lists the [available assignees](https://help.github.com/articles/assigning-issues-and-pull-requests-to-other-github-users/) for issues in a repository.
    */
  def listAssignees(): js.Promise[Response[IssuesListAssigneesResponse]] = js.native
  def listAssignees(params: RequestOptions with IssuesListAssigneesParams): js.Promise[Response[IssuesListAssigneesResponse]] = js.native
  /**
    * Issue Comments are ordered by ascending ID.
    */
  def listComments(): js.Promise[Response[IssuesListCommentsResponse]] = js.native
  def listComments(params: RequestOptions with IssuesListCommentsParamsDeprecatedNumber with IssuesListCommentsParams): js.Promise[Response[IssuesListCommentsResponse]] = js.native
  /**
    * By default, Issue Comments are ordered by ascending ID.
    */
  def listCommentsForRepo(): js.Promise[Response[IssuesListCommentsForRepoResponse]] = js.native
  def listCommentsForRepo(params: RequestOptions with IssuesListCommentsForRepoParams): js.Promise[Response[IssuesListCommentsForRepoResponse]] = js.native
  def listEvents(): js.Promise[Response[IssuesListEventsResponse]] = js.native
  def listEvents(params: RequestOptions with IssuesListEventsParamsDeprecatedNumber with IssuesListEventsParams): js.Promise[Response[IssuesListEventsResponse]] = js.native
  def listEventsForRepo(): js.Promise[Response[IssuesListEventsForRepoResponse]] = js.native
  def listEventsForRepo(params: RequestOptions with IssuesListEventsForRepoParams): js.Promise[Response[IssuesListEventsForRepoResponse]] = js.native
  def listEventsForTimeline(): js.Promise[Response[IssuesListEventsForTimelineResponse]] = js.native
  def listEventsForTimeline(
    params: RequestOptions with IssuesListEventsForTimelineParamsDeprecatedNumber with IssuesListEventsForTimelineParams
  ): js.Promise[Response[IssuesListEventsForTimelineResponse]] = js.native
  /**
    * **Note**: GitHub's REST API v3 considers every pull request an issue, but not every issue is a pull request. For this reason, "Issues" endpoints may return both issues and pull requests in the response. You can identify pull requests by the `pull_request` key.
    *
    * Be aware that the `id` of a pull request returned from "Issues" endpoints will be an _issue id_. To find out the pull request id, use the "[List pull requests](https://developer.github.com/v3/pulls/#list-pull-requests)" endpoint.
    */
  def listForAuthenticatedUser(): js.Promise[Response[IssuesListForAuthenticatedUserResponse]] = js.native
  def listForAuthenticatedUser(params: RequestOptions with IssuesListForAuthenticatedUserParams): js.Promise[Response[IssuesListForAuthenticatedUserResponse]] = js.native
  /**
    * **Note**: GitHub's REST API v3 considers every pull request an issue, but not every issue is a pull request. For this reason, "Issues" endpoints may return both issues and pull requests in the response. You can identify pull requests by the `pull_request` key.
    *
    * Be aware that the `id` of a pull request returned from "Issues" endpoints will be an _issue id_. To find out the pull request id, use the "[List pull requests](https://developer.github.com/v3/pulls/#list-pull-requests)" endpoint.
    */
  def listForOrg(): js.Promise[Response[IssuesListForOrgResponse]] = js.native
  def listForOrg(params: RequestOptions with IssuesListForOrgParams): js.Promise[Response[IssuesListForOrgResponse]] = js.native
  /**
    * **Note**: GitHub's REST API v3 considers every pull request an issue, but not every issue is a pull request. For this reason, "Issues" endpoints may return both issues and pull requests in the response. You can identify pull requests by the `pull_request` key.
    *
    * Be aware that the `id` of a pull request returned from "Issues" endpoints will be an _issue id_. To find out the pull request id, use the "[List pull requests](https://developer.github.com/v3/pulls/#list-pull-requests)" endpoint.
    */
  def listForRepo(): js.Promise[Response[IssuesListForRepoResponse]] = js.native
  def listForRepo(params: RequestOptions with IssuesListForRepoParams): js.Promise[Response[IssuesListForRepoResponse]] = js.native
  def listLabelsForMilestone(): js.Promise[Response[IssuesListLabelsForMilestoneResponse]] = js.native
  def listLabelsForMilestone(
    params: RequestOptions with IssuesListLabelsForMilestoneParamsDeprecatedNumber with IssuesListLabelsForMilestoneParams
  ): js.Promise[Response[IssuesListLabelsForMilestoneResponse]] = js.native
  def listLabelsForRepo(): js.Promise[Response[IssuesListLabelsForRepoResponse]] = js.native
  def listLabelsForRepo(params: RequestOptions with IssuesListLabelsForRepoParams): js.Promise[Response[IssuesListLabelsForRepoResponse]] = js.native
  def listLabelsOnIssue(): js.Promise[Response[IssuesListLabelsOnIssueResponse]] = js.native
  def listLabelsOnIssue(
    params: RequestOptions with IssuesListLabelsOnIssueParamsDeprecatedNumber with IssuesListLabelsOnIssueParams
  ): js.Promise[Response[IssuesListLabelsOnIssueResponse]] = js.native
  def listMilestonesForRepo(): js.Promise[Response[IssuesListMilestonesForRepoResponse]] = js.native
  def listMilestonesForRepo(params: RequestOptions with IssuesListMilestonesForRepoParams): js.Promise[Response[IssuesListMilestonesForRepoResponse]] = js.native
  /**
    * Users with push access can lock an issue or pull request's conversation.
    *
    * Note that, if you choose not to pass any parameters, you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://developer.github.com/v3/#http-verbs)."
    */
  def lock(): js.Promise[AnyResponse] = js.native
  def lock(params: RequestOptions with IssuesLockParamsDeprecatedNumber with IssuesLockParams): js.Promise[AnyResponse] = js.native
  /**
    * Removes one or more assignees from an issue.
    *
    * This example removes two of three assignees, leaving the `octocat` assignee.
    */
  def removeAssignees(): js.Promise[Response[IssuesRemoveAssigneesResponse]] = js.native
  def removeAssignees(
    params: RequestOptions with IssuesRemoveAssigneesParamsDeprecatedNumber with IssuesRemoveAssigneesParams
  ): js.Promise[Response[IssuesRemoveAssigneesResponse]] = js.native
  /**
    * Removes the specified label from the issue, and returns the remaining labels on the issue. This endpoint returns a `404 Not Found` status if the label does not exist.
    */
  def removeLabel(): js.Promise[Response[IssuesRemoveLabelResponse]] = js.native
  def removeLabel(params: RequestOptions with IssuesRemoveLabelParamsDeprecatedNumber with IssuesRemoveLabelParams): js.Promise[Response[IssuesRemoveLabelResponse]] = js.native
  def removeLabels(): js.Promise[AnyResponse] = js.native
  def removeLabels(params: RequestOptions with IssuesRemoveLabelsParamsDeprecatedNumber with IssuesRemoveLabelsParams): js.Promise[AnyResponse] = js.native
  def replaceLabels(): js.Promise[Response[IssuesReplaceLabelsResponse]] = js.native
  def replaceLabels(
    params: RequestOptions with IssuesReplaceLabelsParamsDeprecatedNumber with IssuesReplaceLabelsParams
  ): js.Promise[Response[IssuesReplaceLabelsResponse]] = js.native
  /**
    * Users with push access can unlock an issue's conversation.
    */
  def unlock(): js.Promise[AnyResponse] = js.native
  def unlock(params: RequestOptions with IssuesUnlockParamsDeprecatedNumber with IssuesUnlockParams): js.Promise[AnyResponse] = js.native
  /**
    * Issue owners and users with push access can edit an issue.
    */
  def update(): js.Promise[Response[IssuesUpdateResponse]] = js.native
  def update(
    params: RequestOptions with IssuesUpdateParamsDeprecatedNumber with IssuesUpdateParamsDeprecatedAssignee with IssuesUpdateParams
  ): js.Promise[Response[IssuesUpdateResponse]] = js.native
  def updateComment(): js.Promise[Response[IssuesUpdateCommentResponse]] = js.native
  def updateComment(params: RequestOptions with IssuesUpdateCommentParams): js.Promise[Response[IssuesUpdateCommentResponse]] = js.native
  def updateLabel(): js.Promise[Response[IssuesUpdateLabelResponse]] = js.native
  def updateLabel(params: RequestOptions with IssuesUpdateLabelParams): js.Promise[Response[IssuesUpdateLabelResponse]] = js.native
  def updateMilestone(): js.Promise[Response[IssuesUpdateMilestoneResponse]] = js.native
  def updateMilestone(
    params: RequestOptions with IssuesUpdateMilestoneParamsDeprecatedNumber with IssuesUpdateMilestoneParams
  ): js.Promise[Response[IssuesUpdateMilestoneResponse]] = js.native
}

