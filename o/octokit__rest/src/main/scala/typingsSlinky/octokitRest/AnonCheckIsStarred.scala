package typingsSlinky.octokitRest

import typingsSlinky.octokitRest.mod.Octokit.AnyResponse
import typingsSlinky.octokitRest.mod.Octokit.GistsCheckIsStarredParams
import typingsSlinky.octokitRest.mod.Octokit.GistsCreateCommentParams
import typingsSlinky.octokitRest.mod.Octokit.GistsCreateCommentResponse
import typingsSlinky.octokitRest.mod.Octokit.GistsCreateParams
import typingsSlinky.octokitRest.mod.Octokit.GistsCreateResponse
import typingsSlinky.octokitRest.mod.Octokit.GistsDeleteCommentParams
import typingsSlinky.octokitRest.mod.Octokit.GistsDeleteParams
import typingsSlinky.octokitRest.mod.Octokit.GistsForkParams
import typingsSlinky.octokitRest.mod.Octokit.GistsForkResponse
import typingsSlinky.octokitRest.mod.Octokit.GistsGetCommentParams
import typingsSlinky.octokitRest.mod.Octokit.GistsGetCommentResponse
import typingsSlinky.octokitRest.mod.Octokit.GistsGetParams
import typingsSlinky.octokitRest.mod.Octokit.GistsGetResponse
import typingsSlinky.octokitRest.mod.Octokit.GistsGetRevisionParams
import typingsSlinky.octokitRest.mod.Octokit.GistsGetRevisionResponse
import typingsSlinky.octokitRest.mod.Octokit.GistsListCommentsParams
import typingsSlinky.octokitRest.mod.Octokit.GistsListCommentsResponse
import typingsSlinky.octokitRest.mod.Octokit.GistsListCommitsParams
import typingsSlinky.octokitRest.mod.Octokit.GistsListCommitsResponse
import typingsSlinky.octokitRest.mod.Octokit.GistsListForksParams
import typingsSlinky.octokitRest.mod.Octokit.GistsListForksResponse
import typingsSlinky.octokitRest.mod.Octokit.GistsListParams
import typingsSlinky.octokitRest.mod.Octokit.GistsListPublicForUserParams
import typingsSlinky.octokitRest.mod.Octokit.GistsListPublicForUserResponse
import typingsSlinky.octokitRest.mod.Octokit.GistsListPublicParams
import typingsSlinky.octokitRest.mod.Octokit.GistsListPublicResponse
import typingsSlinky.octokitRest.mod.Octokit.GistsListResponse
import typingsSlinky.octokitRest.mod.Octokit.GistsListStarredParams
import typingsSlinky.octokitRest.mod.Octokit.GistsListStarredResponse
import typingsSlinky.octokitRest.mod.Octokit.GistsStarParams
import typingsSlinky.octokitRest.mod.Octokit.GistsUnstarParams
import typingsSlinky.octokitRest.mod.Octokit.GistsUpdateCommentParams
import typingsSlinky.octokitRest.mod.Octokit.GistsUpdateCommentResponse
import typingsSlinky.octokitRest.mod.Octokit.GistsUpdateParams
import typingsSlinky.octokitRest.mod.Octokit.GistsUpdateResponse
import typingsSlinky.octokitRest.mod.Octokit.RequestOptions
import typingsSlinky.octokitRest.mod.Octokit.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCheckIsStarred extends js.Object {
  @JSName("checkIsStarred")
  var checkIsStarred_Original: Anon104 = js.native
  @JSName("createComment")
  var createComment_Original: Anon106 = js.native
  /**
    * Allows you to add a new gist with one or more files.
    *
    * **Note:** Don't name your files "gistfile" with a numerical suffix. This is the format of the automatic naming scheme that Gist uses internally.
    */
  @JSName("create")
  var create_Original: Anon105 = js.native
  @JSName("deleteComment")
  var deleteComment_Original: Anon108 = js.native
  @JSName("delete")
  var delete_Original: Anon107 = js.native
  /**
    * **Note**: This was previously `/gists/:gist_id/fork`.
    */
  @JSName("fork")
  var fork_Original: Anon109 = js.native
  @JSName("getComment")
  var getComment_Original: Anon111 = js.native
  @JSName("getRevision")
  var getRevision_Original: Anon112 = js.native
  @JSName("get")
  var get_Original: Anon110 = js.native
  @JSName("listComments")
  var listComments_Original: Anon114 = js.native
  @JSName("listCommits")
  var listCommits_Original: Anon115 = js.native
  @JSName("listForks")
  var listForks_Original: Anon116 = js.native
  @JSName("listPublicForUser")
  var listPublicForUser_Original: Anon118 = js.native
  /**
    * List all public gists sorted by most recently updated to least recently updated.
    *
    * Note: With [pagination](https://developer.github.com/v3/#pagination), you can fetch up to 3000 gists. For example, you can fetch 100 pages with 30 gists per page or 30 pages with 100 gists per page.
    */
  @JSName("listPublic")
  var listPublic_Original: Anon117 = js.native
  /**
    * List the authenticated user's starred gists:
    */
  @JSName("listStarred")
  var listStarred_Original: Anon119 = js.native
  @JSName("list")
  var list_Original: Anon113 = js.native
  /**
    * Note that you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://developer.github.com/v3/#http-verbs)."
    */
  @JSName("star")
  var star_Original: Anon120 = js.native
  @JSName("unstar")
  var unstar_Original: Anon121 = js.native
  @JSName("updateComment")
  var updateComment_Original: Anon123 = js.native
  /**
    * Allows you to update or delete a gist file and rename gist files. Files from the previous version of the gist that aren't explicitly changed during an edit are unchanged.
    */
  @JSName("update")
  var update_Original: Anon122 = js.native
  def checkIsStarred(): js.Promise[AnyResponse] = js.native
  def checkIsStarred(params: RequestOptions with GistsCheckIsStarredParams): js.Promise[AnyResponse] = js.native
  /**
    * Allows you to add a new gist with one or more files.
    *
    * **Note:** Don't name your files "gistfile" with a numerical suffix. This is the format of the automatic naming scheme that Gist uses internally.
    */
  def create(): js.Promise[Response[GistsCreateResponse]] = js.native
  def create(params: RequestOptions with GistsCreateParams): js.Promise[Response[GistsCreateResponse]] = js.native
  def createComment(): js.Promise[Response[GistsCreateCommentResponse]] = js.native
  def createComment(params: RequestOptions with GistsCreateCommentParams): js.Promise[Response[GistsCreateCommentResponse]] = js.native
  def delete(): js.Promise[AnyResponse] = js.native
  def delete(params: RequestOptions with GistsDeleteParams): js.Promise[AnyResponse] = js.native
  def deleteComment(): js.Promise[AnyResponse] = js.native
  def deleteComment(params: RequestOptions with GistsDeleteCommentParams): js.Promise[AnyResponse] = js.native
  /**
    * **Note**: This was previously `/gists/:gist_id/fork`.
    */
  def fork(): js.Promise[Response[GistsForkResponse]] = js.native
  def fork(params: RequestOptions with GistsForkParams): js.Promise[Response[GistsForkResponse]] = js.native
  def get(): js.Promise[Response[GistsGetResponse]] = js.native
  def get(params: RequestOptions with GistsGetParams): js.Promise[Response[GistsGetResponse]] = js.native
  def getComment(): js.Promise[Response[GistsGetCommentResponse]] = js.native
  def getComment(params: RequestOptions with GistsGetCommentParams): js.Promise[Response[GistsGetCommentResponse]] = js.native
  def getRevision(): js.Promise[Response[GistsGetRevisionResponse]] = js.native
  def getRevision(params: RequestOptions with GistsGetRevisionParams): js.Promise[Response[GistsGetRevisionResponse]] = js.native
  def list(): js.Promise[Response[GistsListResponse]] = js.native
  def list(params: RequestOptions with GistsListParams): js.Promise[Response[GistsListResponse]] = js.native
  def listComments(): js.Promise[Response[GistsListCommentsResponse]] = js.native
  def listComments(params: RequestOptions with GistsListCommentsParams): js.Promise[Response[GistsListCommentsResponse]] = js.native
  def listCommits(): js.Promise[Response[GistsListCommitsResponse]] = js.native
  def listCommits(params: RequestOptions with GistsListCommitsParams): js.Promise[Response[GistsListCommitsResponse]] = js.native
  def listForks(): js.Promise[Response[GistsListForksResponse]] = js.native
  def listForks(params: RequestOptions with GistsListForksParams): js.Promise[Response[GistsListForksResponse]] = js.native
  /**
    * List all public gists sorted by most recently updated to least recently updated.
    *
    * Note: With [pagination](https://developer.github.com/v3/#pagination), you can fetch up to 3000 gists. For example, you can fetch 100 pages with 30 gists per page or 30 pages with 100 gists per page.
    */
  def listPublic(): js.Promise[Response[GistsListPublicResponse]] = js.native
  def listPublic(params: RequestOptions with GistsListPublicParams): js.Promise[Response[GistsListPublicResponse]] = js.native
  def listPublicForUser(): js.Promise[Response[GistsListPublicForUserResponse]] = js.native
  def listPublicForUser(params: RequestOptions with GistsListPublicForUserParams): js.Promise[Response[GistsListPublicForUserResponse]] = js.native
  /**
    * List the authenticated user's starred gists:
    */
  def listStarred(): js.Promise[Response[GistsListStarredResponse]] = js.native
  def listStarred(params: RequestOptions with GistsListStarredParams): js.Promise[Response[GistsListStarredResponse]] = js.native
  /**
    * Note that you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://developer.github.com/v3/#http-verbs)."
    */
  def star(): js.Promise[AnyResponse] = js.native
  def star(params: RequestOptions with GistsStarParams): js.Promise[AnyResponse] = js.native
  def unstar(): js.Promise[AnyResponse] = js.native
  def unstar(params: RequestOptions with GistsUnstarParams): js.Promise[AnyResponse] = js.native
  /**
    * Allows you to update or delete a gist file and rename gist files. Files from the previous version of the gist that aren't explicitly changed during an edit are unchanged.
    */
  def update(): js.Promise[Response[GistsUpdateResponse]] = js.native
  def update(params: RequestOptions with GistsUpdateParams): js.Promise[Response[GistsUpdateResponse]] = js.native
  def updateComment(): js.Promise[Response[GistsUpdateCommentResponse]] = js.native
  def updateComment(params: RequestOptions with GistsUpdateCommentParams): js.Promise[Response[GistsUpdateCommentResponse]] = js.native
}

