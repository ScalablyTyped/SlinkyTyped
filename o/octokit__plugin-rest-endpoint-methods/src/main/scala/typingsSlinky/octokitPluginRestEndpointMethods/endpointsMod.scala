package typingsSlinky.octokitPluginRestEndpointMethods

import typingsSlinky.octokitPluginRestEndpointMethods.anon.AcceptInvitation
import typingsSlinky.octokitPluginRestEndpointMethods.anon.AddAssignees
import typingsSlinky.octokitPluginRestEndpointMethods.anon.AddCollaborator
import typingsSlinky.octokitPluginRestEndpointMethods.anon.AddEmails
import typingsSlinky.octokitPluginRestEndpointMethods.anon.AddMember
import typingsSlinky.octokitPluginRestEndpointMethods.anon.AddOrUpdateMembership
import typingsSlinky.octokitPluginRestEndpointMethods.anon.AddOrUpdateRestrictionsForOrg
import typingsSlinky.octokitPluginRestEndpointMethods.anon.AddRepoToInstallation
import typingsSlinky.octokitPluginRestEndpointMethods.anon.CancelImport
import typingsSlinky.octokitPluginRestEndpointMethods.anon.CancelWorkflowRun
import typingsSlinky.octokitPluginRestEndpointMethods.anon.CheckAuthorization
import typingsSlinky.octokitPluginRestEndpointMethods.anon.CheckIfMerged
import typingsSlinky.octokitPluginRestEndpointMethods.anon.CheckIsStarred
import typingsSlinky.octokitPluginRestEndpointMethods.anon.CheckStarringRepo
import typingsSlinky.octokitPluginRestEndpointMethods.anon.Commits
import typingsSlinky.octokitPluginRestEndpointMethods.anon.Create
import typingsSlinky.octokitPluginRestEndpointMethods.anon.CreateBlob
import typingsSlinky.octokitPluginRestEndpointMethods.anon.CreateForCommitComment
import typingsSlinky.octokitPluginRestEndpointMethods.anon.Get
import typingsSlinky.octokitPluginRestEndpointMethods.anon.GetConductCode
import typingsSlinky.octokitPluginRestEndpointMethods.anon.GetForRepo
import typingsSlinky.octokitPluginRestEndpointMethods.anon.GetTemplate
import typingsSlinky.octokitPluginRestEndpointMethods.anon.Render
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@octokit/plugin-rest-endpoint-methods/dist-types/generated/endpoints", JSImport.Namespace)
@js.native
object endpointsMod extends js.Object {
  @js.native
  object default extends js.Object {
    var actions: CancelWorkflowRun = js.native
    var activity: CheckStarringRepo = js.native
    var apps: AddRepoToInstallation = js.native
    var checks: Create = js.native
    var codesOfConduct: GetConductCode = js.native
    var emojis: Get = js.native
    var gists: CheckIsStarred = js.native
    var git: CreateBlob = js.native
    var gitignore: GetTemplate = js.native
    var interactions: AddOrUpdateRestrictionsForOrg = js.native
    var issues: AddAssignees = js.native
    var licenses: GetForRepo = js.native
    var markdown: Render = js.native
    var meta: Get = js.native
    var migrations: CancelImport = js.native
    var oauthAuthorizations: CheckAuthorization = js.native
    var orgs: AddOrUpdateMembership = js.native
    var projects: AddCollaborator = js.native
    var pulls: CheckIfMerged = js.native
    var rateLimit: Get = js.native
    var reactions: CreateForCommitComment = js.native
    var repos: AcceptInvitation = js.native
    var search: Commits = js.native
    var teams: AddMember = js.native
    var users: AddEmails = js.native
  }
  
}

