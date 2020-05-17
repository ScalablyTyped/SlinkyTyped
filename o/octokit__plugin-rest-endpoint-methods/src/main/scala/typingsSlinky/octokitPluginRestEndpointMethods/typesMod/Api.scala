package typingsSlinky.octokitPluginRestEndpointMethods.typesMod

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

/* Inlined {registerEndpoints (endpoints : any): void} & @octokit/plugin-rest-endpoint-methods.@octokit/plugin-rest-endpoint-methods/dist-types/generated/rest-endpoint-methods-types.RestEndpointMethods */
@js.native
trait Api extends js.Object {
  var actions: CreateOrUpdateSecretForRepo = js.native
  var activity: CheckWatchingRepoLegacy = js.native
  var apps: CheckAccountIsAssociatedWithAny = js.native
  var checks: CreateSuite = js.native
  var codesOfConduct: ListConductCodes = js.native
  var emojis: Get88 = js.native
  var gists: CreateComment = js.native
  var git: CreateCommit = js.native
  var gitignore: ListTemplates = js.native
  var interactions: AddOrUpdateRestrictionsForRepo = js.native
  var issues: AddLabels = js.native
  var licenses: List = js.native
  var markdown: RenderRaw = js.native
  var meta: Get29 = js.native
  var migrations: DeleteArchiveForAuthenticatedUser = js.native
  var oauthAuthorizations: CreateAuthorization = js.native
  var orgs: BlockUser = js.native
  var projects: CreateCard = js.native
  var pulls: CreateCommentReply = js.native
  var rateLimit: Get29 = js.native
  var reactions: CreateForIssue = js.native
  var repos: AddDeployKey = js.native
  var search: EmailLegacy = js.native
  var teams: AddMemberLegacy = js.native
  var users: Block = js.native
  def registerEndpoints(endpoints: js.Any): Unit = js.native
}

object Api {
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
    registerEndpoints: js.Any => Unit,
    repos: AddDeployKey,
    search: EmailLegacy,
    teams: AddMemberLegacy,
    users: Block
  ): Api = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], activity = activity.asInstanceOf[js.Any], apps = apps.asInstanceOf[js.Any], checks = checks.asInstanceOf[js.Any], codesOfConduct = codesOfConduct.asInstanceOf[js.Any], emojis = emojis.asInstanceOf[js.Any], gists = gists.asInstanceOf[js.Any], git = git.asInstanceOf[js.Any], gitignore = gitignore.asInstanceOf[js.Any], interactions = interactions.asInstanceOf[js.Any], issues = issues.asInstanceOf[js.Any], licenses = licenses.asInstanceOf[js.Any], markdown = markdown.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], migrations = migrations.asInstanceOf[js.Any], oauthAuthorizations = oauthAuthorizations.asInstanceOf[js.Any], orgs = orgs.asInstanceOf[js.Any], projects = projects.asInstanceOf[js.Any], pulls = pulls.asInstanceOf[js.Any], rateLimit = rateLimit.asInstanceOf[js.Any], reactions = reactions.asInstanceOf[js.Any], registerEndpoints = js.Any.fromFunction1(registerEndpoints), repos = repos.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], teams = teams.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[Api]
  }
  @scala.inline
  implicit class ApiOps[Self <: Api] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActions(value: CreateOrUpdateSecretForRepo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActivity(value: CheckWatchingRepoLegacy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApps(value: CheckAccountIsAssociatedWithAny): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChecks(value: CreateSuite): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCodesOfConduct(value: ListConductCodes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codesOfConduct")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmojis(value: Get88): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emojis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGists(value: CreateComment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gists")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGit(value: CreateCommit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("git")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGitignore(value: ListTemplates): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gitignore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInteractions(value: AddOrUpdateRestrictionsForRepo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIssues(value: AddLabels): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLicenses(value: List): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("licenses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarkdown(value: RenderRaw): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markdown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMeta(value: Get29): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMigrations(value: DeleteArchiveForAuthenticatedUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("migrations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOauthAuthorizations(value: CreateAuthorization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oauthAuthorizations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrgs(value: BlockUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orgs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProjects(value: CreateCard): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPulls(value: CreateCommentReply): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pulls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRateLimit(value: Get29): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rateLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReactions(value: CreateForIssue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reactions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegisterEndpoints(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerEndpoints")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRepos(value: AddDeployKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearch(value: EmailLegacy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTeams(value: AddMemberLegacy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsers(value: Block): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("users")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

