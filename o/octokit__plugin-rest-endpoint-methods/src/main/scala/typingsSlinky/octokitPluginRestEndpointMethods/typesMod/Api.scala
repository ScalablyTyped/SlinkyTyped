package typingsSlinky.octokitPluginRestEndpointMethods.typesMod

import typingsSlinky.octokitPluginRestEndpointMethods.AnonAddDeployKey
import typingsSlinky.octokitPluginRestEndpointMethods.AnonAddLabels
import typingsSlinky.octokitPluginRestEndpointMethods.AnonAddMemberLegacy
import typingsSlinky.octokitPluginRestEndpointMethods.AnonAddOrUpdateRestrictionsForRepo
import typingsSlinky.octokitPluginRestEndpointMethods.AnonBlock
import typingsSlinky.octokitPluginRestEndpointMethods.AnonBlockUser
import typingsSlinky.octokitPluginRestEndpointMethods.AnonCheckAccountIsAssociatedWithAny
import typingsSlinky.octokitPluginRestEndpointMethods.AnonCheckWatchingRepoLegacy
import typingsSlinky.octokitPluginRestEndpointMethods.AnonCreateAuthorization
import typingsSlinky.octokitPluginRestEndpointMethods.AnonCreateCard
import typingsSlinky.octokitPluginRestEndpointMethods.AnonCreateComment
import typingsSlinky.octokitPluginRestEndpointMethods.AnonCreateCommentReply
import typingsSlinky.octokitPluginRestEndpointMethods.AnonCreateCommit
import typingsSlinky.octokitPluginRestEndpointMethods.AnonCreateForIssue
import typingsSlinky.octokitPluginRestEndpointMethods.AnonCreateOrUpdateSecretForRepo
import typingsSlinky.octokitPluginRestEndpointMethods.AnonCreateSuite
import typingsSlinky.octokitPluginRestEndpointMethods.AnonDeleteArchiveForAuthenticatedUser
import typingsSlinky.octokitPluginRestEndpointMethods.AnonEmailLegacy
import typingsSlinky.octokitPluginRestEndpointMethods.AnonGetAnon29
import typingsSlinky.octokitPluginRestEndpointMethods.AnonGetAnon88
import typingsSlinky.octokitPluginRestEndpointMethods.AnonList
import typingsSlinky.octokitPluginRestEndpointMethods.AnonListConductCodes
import typingsSlinky.octokitPluginRestEndpointMethods.AnonListTemplates
import typingsSlinky.octokitPluginRestEndpointMethods.AnonRenderRaw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {registerEndpoints (endpoints : any): void} & @octokit/plugin-rest-endpoint-methods.@octokit/plugin-rest-endpoint-methods/dist-types/generated/rest-endpoint-methods-types.RestEndpointMethods */
@js.native
trait Api extends js.Object {
  var actions: AnonCreateOrUpdateSecretForRepo = js.native
  var activity: AnonCheckWatchingRepoLegacy = js.native
  var apps: AnonCheckAccountIsAssociatedWithAny = js.native
  var checks: AnonCreateSuite = js.native
  var codesOfConduct: AnonListConductCodes = js.native
  var emojis: AnonGetAnon88 = js.native
  var gists: AnonCreateComment = js.native
  var git: AnonCreateCommit = js.native
  var gitignore: AnonListTemplates = js.native
  var interactions: AnonAddOrUpdateRestrictionsForRepo = js.native
  var issues: AnonAddLabels = js.native
  var licenses: AnonList = js.native
  var markdown: AnonRenderRaw = js.native
  var meta: AnonGetAnon29 = js.native
  var migrations: AnonDeleteArchiveForAuthenticatedUser = js.native
  var oauthAuthorizations: AnonCreateAuthorization = js.native
  var orgs: AnonBlockUser = js.native
  var projects: AnonCreateCard = js.native
  var pulls: AnonCreateCommentReply = js.native
  var rateLimit: AnonGetAnon29 = js.native
  var reactions: AnonCreateForIssue = js.native
  var repos: AnonAddDeployKey = js.native
  var search: AnonEmailLegacy = js.native
  var teams: AnonAddMemberLegacy = js.native
  var users: AnonBlock = js.native
  def registerEndpoints(endpoints: js.Any): Unit = js.native
}

object Api {
  @scala.inline
  def apply(
    actions: AnonCreateOrUpdateSecretForRepo,
    activity: AnonCheckWatchingRepoLegacy,
    apps: AnonCheckAccountIsAssociatedWithAny,
    checks: AnonCreateSuite,
    codesOfConduct: AnonListConductCodes,
    emojis: AnonGetAnon88,
    gists: AnonCreateComment,
    git: AnonCreateCommit,
    gitignore: AnonListTemplates,
    interactions: AnonAddOrUpdateRestrictionsForRepo,
    issues: AnonAddLabels,
    licenses: AnonList,
    markdown: AnonRenderRaw,
    meta: AnonGetAnon29,
    migrations: AnonDeleteArchiveForAuthenticatedUser,
    oauthAuthorizations: AnonCreateAuthorization,
    orgs: AnonBlockUser,
    projects: AnonCreateCard,
    pulls: AnonCreateCommentReply,
    rateLimit: AnonGetAnon29,
    reactions: AnonCreateForIssue,
    registerEndpoints: js.Any => Unit,
    repos: AnonAddDeployKey,
    search: AnonEmailLegacy,
    teams: AnonAddMemberLegacy,
    users: AnonBlock
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
    def withActions(value: AnonCreateOrUpdateSecretForRepo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActivity(value: AnonCheckWatchingRepoLegacy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApps(value: AnonCheckAccountIsAssociatedWithAny): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChecks(value: AnonCreateSuite): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCodesOfConduct(value: AnonListConductCodes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codesOfConduct")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmojis(value: AnonGetAnon88): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emojis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGists(value: AnonCreateComment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gists")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGit(value: AnonCreateCommit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("git")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGitignore(value: AnonListTemplates): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gitignore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInteractions(value: AnonAddOrUpdateRestrictionsForRepo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIssues(value: AnonAddLabels): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLicenses(value: AnonList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("licenses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarkdown(value: AnonRenderRaw): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markdown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMeta(value: AnonGetAnon29): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMigrations(value: AnonDeleteArchiveForAuthenticatedUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("migrations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOauthAuthorizations(value: AnonCreateAuthorization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oauthAuthorizations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrgs(value: AnonBlockUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orgs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProjects(value: AnonCreateCard): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPulls(value: AnonCreateCommentReply): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pulls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRateLimit(value: AnonGetAnon29): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rateLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReactions(value: AnonCreateForIssue): Self = {
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
    def withRepos(value: AnonAddDeployKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearch(value: AnonEmailLegacy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTeams(value: AnonAddMemberLegacy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsers(value: AnonBlock): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("users")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

