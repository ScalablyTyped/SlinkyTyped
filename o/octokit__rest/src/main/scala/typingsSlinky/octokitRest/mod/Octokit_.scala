package typingsSlinky.octokitRest.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.octokitRest.AnonAcceptInvitation
import typingsSlinky.octokitRest.AnonAddAssignees
import typingsSlinky.octokitRest.AnonAddCollaborator
import typingsSlinky.octokitRest.AnonAddEmails
import typingsSlinky.octokitRest.AnonAddMember
import typingsSlinky.octokitRest.AnonAddOrUpdateMembership
import typingsSlinky.octokitRest.AnonAddOrUpdateRestrictionsForOrg
import typingsSlinky.octokitRest.AnonAddRepoToInstallation
import typingsSlinky.octokitRest.AnonAfter
import typingsSlinky.octokitRest.AnonCancelImport
import typingsSlinky.octokitRest.AnonCancelWorkflowRun
import typingsSlinky.octokitRest.AnonCheckAuthorization
import typingsSlinky.octokitRest.AnonCheckIfMerged
import typingsSlinky.octokitRest.AnonCheckIsStarred
import typingsSlinky.octokitRest.AnonCheckStarringRepo
import typingsSlinky.octokitRest.AnonCode
import typingsSlinky.octokitRest.AnonCreate
import typingsSlinky.octokitRest.AnonCreateBlob
import typingsSlinky.octokitRest.AnonCreateForCommitComment
import typingsSlinky.octokitRest.AnonGet
import typingsSlinky.octokitRest.AnonGetAnon191
import typingsSlinky.octokitRest.AnonGetAnon319
import typingsSlinky.octokitRest.AnonGetConductCode
import typingsSlinky.octokitRest.AnonGetForRepo
import typingsSlinky.octokitRest.AnonGetTemplate
import typingsSlinky.octokitRest.AnonRender
import typingsSlinky.octokitRest.mod.Octokit.AnyResponse
import typingsSlinky.octokitRest.mod.Octokit.AuthBasic
import typingsSlinky.octokitRest.mod.Octokit.AuthJWT
import typingsSlinky.octokitRest.mod.Octokit.AuthOAuthSecret
import typingsSlinky.octokitRest.mod.Octokit.AuthOAuthToken
import typingsSlinky.octokitRest.mod.Octokit.AuthUserToken
import typingsSlinky.octokitRest.mod.Octokit.EndpointOptions
import typingsSlinky.octokitRest.mod.Octokit.Log
import typingsSlinky.octokitRest.mod.Octokit.Options
import typingsSlinky.octokitRest.mod.Octokit.Paginate
import typingsSlinky.octokitRest.mod.Octokit.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@octokit/rest", "Octokit")
@js.native
class Octokit_ () extends js.Object {
  def this(options: Options) = this()
  var actions: AnonCancelWorkflowRun = js.native
  var activity: AnonCheckStarringRepo = js.native
  var apps: AnonAddRepoToInstallation = js.native
  var checks: AnonCreate = js.native
  var codesOfConduct: AnonGetConductCode = js.native
  var emojis: AnonGet = js.native
  var gists: AnonCheckIsStarred = js.native
  var git: AnonCreateBlob = js.native
  var gitignore: AnonGetTemplate = js.native
  var hook: AnonAfter = js.native
  var interactions: AnonAddOrUpdateRestrictionsForOrg = js.native
  var issues: AnonAddAssignees = js.native
  var licenses: AnonGetForRepo = js.native
  var log: Log = js.native
  var markdown: AnonRender = js.native
  var meta: AnonGetAnon191 = js.native
  var migrations: AnonCancelImport = js.native
  var oauthAuthorizations: AnonCheckAuthorization = js.native
  var orgs: AnonAddOrUpdateMembership = js.native
  @JSName("paginate")
  var paginate_Original: Paginate = js.native
  var projects: AnonAddCollaborator = js.native
  var pulls: AnonCheckIfMerged = js.native
  var rateLimit: AnonGetAnon319 = js.native
  var reactions: AnonCreateForCommitComment = js.native
  var repos: AnonAcceptInvitation = js.native
  @JSName("request")
  var request_Original: Request = js.native
  var search: AnonCode = js.native
  var teams: AnonAddMember = js.native
  var users: AnonAddEmails = js.native
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

