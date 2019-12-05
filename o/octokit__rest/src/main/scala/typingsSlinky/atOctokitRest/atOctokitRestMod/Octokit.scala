package typingsSlinky.atOctokitRest.atOctokitRestMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.atOctokitRest.Anon_AcceptInvitation
import typingsSlinky.atOctokitRest.Anon_AddAssignees
import typingsSlinky.atOctokitRest.Anon_AddCollaborator
import typingsSlinky.atOctokitRest.Anon_AddEmails
import typingsSlinky.atOctokitRest.Anon_AddMember
import typingsSlinky.atOctokitRest.Anon_AddOrUpdateMembership
import typingsSlinky.atOctokitRest.Anon_AddOrUpdateRestrictionsForOrg
import typingsSlinky.atOctokitRest.Anon_AddRepoToInstallation
import typingsSlinky.atOctokitRest.Anon_After
import typingsSlinky.atOctokitRest.Anon_CancelImport
import typingsSlinky.atOctokitRest.Anon_CheckAuthorization
import typingsSlinky.atOctokitRest.Anon_CheckIfMerged
import typingsSlinky.atOctokitRest.Anon_CheckIsStarred
import typingsSlinky.atOctokitRest.Anon_CheckStarringRepo
import typingsSlinky.atOctokitRest.Anon_CodeCommits
import typingsSlinky.atOctokitRest.Anon_Create
import typingsSlinky.atOctokitRest.Anon_CreateBlob
import typingsSlinky.atOctokitRest.Anon_CreateForCommitComment
import typingsSlinky.atOctokitRest.Anon_Get
import typingsSlinky.atOctokitRest.Anon_GetAnonEndpointParamsEmptyParamsMetaGetResponse
import typingsSlinky.atOctokitRest.Anon_GetAnonEndpointParamsEmptyParamsPromise
import typingsSlinky.atOctokitRest.Anon_GetConductCode
import typingsSlinky.atOctokitRest.Anon_GetGetForRepo
import typingsSlinky.atOctokitRest.Anon_GetTemplate
import typingsSlinky.atOctokitRest.Anon_Render
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Octokit extends js.Object {
  var activity: Anon_CheckStarringRepo = js.native
  var apps: Anon_AddRepoToInstallation = js.native
  var checks: Anon_Create = js.native
  var codesOfConduct: Anon_GetConductCode = js.native
  var emojis: Anon_Get = js.native
  var gists: Anon_CheckIsStarred = js.native
  var git: Anon_CreateBlob = js.native
  var gitignore: Anon_GetTemplate = js.native
  var hook: Anon_After = js.native
  var interactions: Anon_AddOrUpdateRestrictionsForOrg = js.native
  var issues: Anon_AddAssignees = js.native
  var licenses: Anon_GetGetForRepo = js.native
  var log: Log = js.native
  var markdown: Anon_Render = js.native
  var meta: Anon_GetAnonEndpointParamsEmptyParamsMetaGetResponse = js.native
  var migrations: Anon_CancelImport = js.native
  var oauthAuthorizations: Anon_CheckAuthorization = js.native
  var orgs: Anon_AddOrUpdateMembership = js.native
  @JSName("paginate")
  var paginate_Original: Paginate = js.native
  var projects: Anon_AddCollaborator = js.native
  var pulls: Anon_CheckIfMerged = js.native
  var rateLimit: Anon_GetAnonEndpointParamsEmptyParamsPromise = js.native
  var reactions: Anon_CreateForCommitComment = js.native
  var repos: Anon_AcceptInvitation = js.native
  @JSName("request")
  var request_Original: Request = js.native
  var search: Anon_CodeCommits = js.native
  var teams: Anon_AddMember = js.native
  var users: Anon_AddEmails = js.native
  def authenticate(auth: AuthBasic): Unit = js.native
  def authenticate(auth: AuthJWT): Unit = js.native
  def authenticate(auth: AuthOAuthSecret): Unit = js.native
  def authenticate(auth: AuthOAuthToken): Unit = js.native
  def authenticate(auth: AuthUserToken): Unit = js.native
  def paginate(EndpointOptions: EndpointOptions): js.Promise[js.Array[_]] = js.native
  def paginate(
    EndpointOptions: EndpointOptions,
    callback: js.Function2[/* response */ AnyResponse, /* done */ js.Function0[Unit], _]
  ): js.Promise[js.Array[_]] = js.native
  def paginate(Route: String): js.Promise[js.Array[_]] = js.native
  def paginate(Route: String, EndpointOptions: EndpointOptions): js.Promise[js.Array[_]] = js.native
  def paginate(
    Route: String,
    EndpointOptions: EndpointOptions,
    callback: js.Function2[/* response */ AnyResponse, /* done */ js.Function0[Unit], _]
  ): js.Promise[js.Array[_]] = js.native
  def registerEndpoints(endpoints: StringDictionary[EndpointOptions]): Unit = js.native
  def request(EndpointOptions: EndpointOptions): js.Promise[AnyResponse] = js.native
  def request(Route: String): js.Promise[AnyResponse] = js.native
  def request(Route: String, EndpointOptions: EndpointOptions): js.Promise[AnyResponse] = js.native
}

