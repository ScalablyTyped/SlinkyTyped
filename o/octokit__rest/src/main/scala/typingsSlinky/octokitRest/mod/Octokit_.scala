package typingsSlinky.octokitRest.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.octokitRest.anon.AcceptInvitation
import typingsSlinky.octokitRest.anon.AddAssignees
import typingsSlinky.octokitRest.anon.AddCollaborator
import typingsSlinky.octokitRest.anon.AddEmails
import typingsSlinky.octokitRest.anon.AddMember
import typingsSlinky.octokitRest.anon.AddOrUpdateMembership
import typingsSlinky.octokitRest.anon.AddOrUpdateRestrictionsForOrg
import typingsSlinky.octokitRest.anon.AddRepoToInstallation
import typingsSlinky.octokitRest.anon.After
import typingsSlinky.octokitRest.anon.CancelImport
import typingsSlinky.octokitRest.anon.CancelWorkflowRun
import typingsSlinky.octokitRest.anon.CheckAuthorization
import typingsSlinky.octokitRest.anon.CheckIfMerged
import typingsSlinky.octokitRest.anon.CheckIsStarred
import typingsSlinky.octokitRest.anon.CheckStarringRepo
import typingsSlinky.octokitRest.anon.Code
import typingsSlinky.octokitRest.anon.Create
import typingsSlinky.octokitRest.anon.CreateBlob
import typingsSlinky.octokitRest.anon.CreateForCommitComment
import typingsSlinky.octokitRest.anon.Get
import typingsSlinky.octokitRest.anon.Get191
import typingsSlinky.octokitRest.anon.Get319
import typingsSlinky.octokitRest.anon.GetConductCode
import typingsSlinky.octokitRest.anon.GetForRepo
import typingsSlinky.octokitRest.anon.GetTemplate
import typingsSlinky.octokitRest.anon.Render
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
  var actions: CancelWorkflowRun = js.native
  var activity: CheckStarringRepo = js.native
  var apps: AddRepoToInstallation = js.native
  var checks: Create = js.native
  var codesOfConduct: GetConductCode = js.native
  var emojis: Get = js.native
  var gists: CheckIsStarred = js.native
  var git: CreateBlob = js.native
  var gitignore: GetTemplate = js.native
  var hook: After = js.native
  var interactions: AddOrUpdateRestrictionsForOrg = js.native
  var issues: AddAssignees = js.native
  var licenses: GetForRepo = js.native
  var log: Log = js.native
  var markdown: Render = js.native
  var meta: Get191 = js.native
  var migrations: CancelImport = js.native
  var oauthAuthorizations: CheckAuthorization = js.native
  var orgs: AddOrUpdateMembership = js.native
  @JSName("paginate")
  var paginate_Original: Paginate = js.native
  var projects: AddCollaborator = js.native
  var pulls: CheckIfMerged = js.native
  var rateLimit: Get319 = js.native
  var reactions: CreateForCommitComment = js.native
  var repos: AcceptInvitation = js.native
  @JSName("request")
  var request_Original: Request = js.native
  var search: Code = js.native
  var teams: AddMember = js.native
  var users: AddEmails = js.native
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

