package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import typingsSlinky.octokitPluginRestEndpointMethods.anon.AddDeployKey
import typingsSlinky.octokitPluginRestEndpointMethods.anon.AddLabels
import typingsSlinky.octokitPluginRestEndpointMethods.anon.AddMemberLegacy
import typingsSlinky.octokitPluginRestEndpointMethods.anon.AddOrUpdateRestrictionsForRepo
import typingsSlinky.octokitPluginRestEndpointMethods.anon.Block
import typingsSlinky.octokitPluginRestEndpointMethods.anon.BlockUser
import typingsSlinky.octokitPluginRestEndpointMethods.anon.CheckAccountIsAssociatedWithAny
import typingsSlinky.octokitPluginRestEndpointMethods.anon.CheckWatchingRepoLegacy
import typingsSlinky.octokitPluginRestEndpointMethods.anon.CreateAuthorization
import typingsSlinky.octokitPluginRestEndpointMethods.anon.CreateCard
import typingsSlinky.octokitPluginRestEndpointMethods.anon.CreateComment
import typingsSlinky.octokitPluginRestEndpointMethods.anon.CreateCommentReply
import typingsSlinky.octokitPluginRestEndpointMethods.anon.CreateCommit
import typingsSlinky.octokitPluginRestEndpointMethods.anon.CreateForIssue
import typingsSlinky.octokitPluginRestEndpointMethods.anon.CreateOrUpdateSecretForRepo
import typingsSlinky.octokitPluginRestEndpointMethods.anon.CreateSuite
import typingsSlinky.octokitPluginRestEndpointMethods.anon.DeleteArchiveForAuthenticatedUser
import typingsSlinky.octokitPluginRestEndpointMethods.anon.EmailLegacy
import typingsSlinky.octokitPluginRestEndpointMethods.anon.Get29
import typingsSlinky.octokitPluginRestEndpointMethods.anon.Get88
import typingsSlinky.octokitPluginRestEndpointMethods.anon.List
import typingsSlinky.octokitPluginRestEndpointMethods.anon.ListConductCodes
import typingsSlinky.octokitPluginRestEndpointMethods.anon.ListTemplates
import typingsSlinky.octokitPluginRestEndpointMethods.anon.RenderRaw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestEndpointMethods extends js.Object {
  var actions: CreateOrUpdateSecretForRepo
  var activity: CheckWatchingRepoLegacy
  var apps: CheckAccountIsAssociatedWithAny
  var checks: CreateSuite
  var codesOfConduct: ListConductCodes
  var emojis: Get88
  var gists: CreateComment
  var git: CreateCommit
  var gitignore: ListTemplates
  var interactions: AddOrUpdateRestrictionsForRepo
  var issues: AddLabels
  var licenses: List
  var markdown: RenderRaw
  var meta: Get29
  var migrations: DeleteArchiveForAuthenticatedUser
  var oauthAuthorizations: CreateAuthorization
  var orgs: BlockUser
  var projects: CreateCard
  var pulls: CreateCommentReply
  var rateLimit: Get29
  var reactions: CreateForIssue
  var repos: AddDeployKey
  var search: EmailLegacy
  var teams: AddMemberLegacy
  var users: Block
}

object RestEndpointMethods {
  @scala.inline
  def apply(
    actions: CreateOrUpdateSecretForRepo,
    activity: CheckWatchingRepoLegacy,
    apps: CheckAccountIsAssociatedWithAny,
    checks: CreateSuite,
    codesOfConduct: ListConductCodes,
    emojis: Get88,
    gists: CreateComment,
    git: CreateCommit,
    gitignore: ListTemplates,
    interactions: AddOrUpdateRestrictionsForRepo,
    issues: AddLabels,
    licenses: List,
    markdown: RenderRaw,
    meta: Get29,
    migrations: DeleteArchiveForAuthenticatedUser,
    oauthAuthorizations: CreateAuthorization,
    orgs: BlockUser,
    projects: CreateCard,
    pulls: CreateCommentReply,
    rateLimit: Get29,
    reactions: CreateForIssue,
    repos: AddDeployKey,
    search: EmailLegacy,
    teams: AddMemberLegacy,
    users: Block
  ): RestEndpointMethods = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], activity = activity.asInstanceOf[js.Any], apps = apps.asInstanceOf[js.Any], checks = checks.asInstanceOf[js.Any], codesOfConduct = codesOfConduct.asInstanceOf[js.Any], emojis = emojis.asInstanceOf[js.Any], gists = gists.asInstanceOf[js.Any], git = git.asInstanceOf[js.Any], gitignore = gitignore.asInstanceOf[js.Any], interactions = interactions.asInstanceOf[js.Any], issues = issues.asInstanceOf[js.Any], licenses = licenses.asInstanceOf[js.Any], markdown = markdown.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], migrations = migrations.asInstanceOf[js.Any], oauthAuthorizations = oauthAuthorizations.asInstanceOf[js.Any], orgs = orgs.asInstanceOf[js.Any], projects = projects.asInstanceOf[js.Any], pulls = pulls.asInstanceOf[js.Any], rateLimit = rateLimit.asInstanceOf[js.Any], reactions = reactions.asInstanceOf[js.Any], repos = repos.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], teams = teams.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestEndpointMethods]
  }
}

