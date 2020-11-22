package typingsSlinky.octokitPluginRestEndpointMethods.parametersAndResponseTypesMod

import typingsSlinky.octokitPluginRestEndpointMethods.anon.AddAppAccessRestrictions
import typingsSlinky.octokitPluginRestEndpointMethods.anon.AddLabels
import typingsSlinky.octokitPluginRestEndpointMethods.anon.AddOrUpdateProjectPermissionsInOrg
import typingsSlinky.octokitPluginRestEndpointMethods.anon.Block
import typingsSlinky.octokitPluginRestEndpointMethods.anon.CancelWorkflowRun
import typingsSlinky.octokitPluginRestEndpointMethods.anon.CheckBlockedUser
import typingsSlinky.octokitPluginRestEndpointMethods.anon.CheckToken
import typingsSlinky.octokitPluginRestEndpointMethods.anon.Commits
import typingsSlinky.octokitPluginRestEndpointMethods.anon.CreateCard
import typingsSlinky.octokitPluginRestEndpointMethods.anon.CreateComment
import typingsSlinky.octokitPluginRestEndpointMethods.anon.CreateCommit
import typingsSlinky.octokitPluginRestEndpointMethods.anon.CreateForIssue
import typingsSlinky.octokitPluginRestEndpointMethods.anon.CreateReplyForReviewComment
import typingsSlinky.octokitPluginRestEndpointMethods.anon.CreateSuite
import typingsSlinky.octokitPluginRestEndpointMethods.anon.DeleteArchiveForAuthenticatedUser
import typingsSlinky.octokitPluginRestEndpointMethods.anon.DeleteRepoSubscription
import typingsSlinky.octokitPluginRestEndpointMethods.anon.Get676
import typingsSlinky.octokitPluginRestEndpointMethods.anon.Get762
import typingsSlinky.octokitPluginRestEndpointMethods.anon.Get872
import typingsSlinky.octokitPluginRestEndpointMethods.anon.GetConductCode
import typingsSlinky.octokitPluginRestEndpointMethods.anon.GetForRepo
import typingsSlinky.octokitPluginRestEndpointMethods.anon.GetGithubActionsBillingUser
import typingsSlinky.octokitPluginRestEndpointMethods.anon.GetRestrictionsForRepo
import typingsSlinky.octokitPluginRestEndpointMethods.anon.GetTemplate
import typingsSlinky.octokitPluginRestEndpointMethods.anon.ListAlertsForRepo
import typingsSlinky.octokitPluginRestEndpointMethods.anon.RenderRaw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RestEndpointMethodTypes extends js.Object {
  
  var actions: CancelWorkflowRun = js.native
  
  var activity: DeleteRepoSubscription = js.native
  
  var apps: CheckToken = js.native
  
  var billing: GetGithubActionsBillingUser = js.native
  
  var checks: CreateSuite = js.native
  
  var codeScanning: ListAlertsForRepo = js.native
  
  var codesOfConduct: GetConductCode = js.native
  
  var emojis: Get676 = js.native
  
  var gists: CreateComment = js.native
  
  var git: CreateCommit = js.native
  
  var gitignore: GetTemplate = js.native
  
  var interactions: GetRestrictionsForRepo = js.native
  
  var issues: AddLabels = js.native
  
  var licenses: GetForRepo = js.native
  
  var markdown: RenderRaw = js.native
  
  var meta: Get762 = js.native
  
  var migrations: DeleteArchiveForAuthenticatedUser = js.native
  
  var orgs: CheckBlockedUser = js.native
  
  var projects: CreateCard = js.native
  
  var pulls: CreateReplyForReviewComment = js.native
  
  var rateLimit: Get872 = js.native
  
  var reactions: CreateForIssue = js.native
  
  var repos: AddAppAccessRestrictions = js.native
  
  var search: Commits = js.native
  
  var teams: AddOrUpdateProjectPermissionsInOrg = js.native
  
  var users: Block = js.native
}
object RestEndpointMethodTypes {
  
  @scala.inline
  def apply(
    actions: CancelWorkflowRun,
    activity: DeleteRepoSubscription,
    apps: CheckToken,
    billing: GetGithubActionsBillingUser,
    checks: CreateSuite,
    codeScanning: ListAlertsForRepo,
    codesOfConduct: GetConductCode,
    emojis: Get676,
    gists: CreateComment,
    git: CreateCommit,
    gitignore: GetTemplate,
    interactions: GetRestrictionsForRepo,
    issues: AddLabels,
    licenses: GetForRepo,
    markdown: RenderRaw,
    meta: Get762,
    migrations: DeleteArchiveForAuthenticatedUser,
    orgs: CheckBlockedUser,
    projects: CreateCard,
    pulls: CreateReplyForReviewComment,
    rateLimit: Get872,
    reactions: CreateForIssue,
    repos: AddAppAccessRestrictions,
    search: Commits,
    teams: AddOrUpdateProjectPermissionsInOrg,
    users: Block
  ): RestEndpointMethodTypes = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], activity = activity.asInstanceOf[js.Any], apps = apps.asInstanceOf[js.Any], billing = billing.asInstanceOf[js.Any], checks = checks.asInstanceOf[js.Any], codeScanning = codeScanning.asInstanceOf[js.Any], codesOfConduct = codesOfConduct.asInstanceOf[js.Any], emojis = emojis.asInstanceOf[js.Any], gists = gists.asInstanceOf[js.Any], git = git.asInstanceOf[js.Any], gitignore = gitignore.asInstanceOf[js.Any], interactions = interactions.asInstanceOf[js.Any], issues = issues.asInstanceOf[js.Any], licenses = licenses.asInstanceOf[js.Any], markdown = markdown.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], migrations = migrations.asInstanceOf[js.Any], orgs = orgs.asInstanceOf[js.Any], projects = projects.asInstanceOf[js.Any], pulls = pulls.asInstanceOf[js.Any], rateLimit = rateLimit.asInstanceOf[js.Any], reactions = reactions.asInstanceOf[js.Any], repos = repos.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], teams = teams.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestEndpointMethodTypes]
  }
  
  @scala.inline
  implicit class RestEndpointMethodTypesOps[Self <: RestEndpointMethodTypes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActions(value: CancelWorkflowRun): Self = this.set("actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivity(value: DeleteRepoSubscription): Self = this.set("activity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApps(value: CheckToken): Self = this.set("apps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBilling(value: GetGithubActionsBillingUser): Self = this.set("billing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChecks(value: CreateSuite): Self = this.set("checks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeScanning(value: ListAlertsForRepo): Self = this.set("codeScanning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodesOfConduct(value: GetConductCode): Self = this.set("codesOfConduct", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmojis(value: Get676): Self = this.set("emojis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGists(value: CreateComment): Self = this.set("gists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGit(value: CreateCommit): Self = this.set("git", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGitignore(value: GetTemplate): Self = this.set("gitignore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInteractions(value: GetRestrictionsForRepo): Self = this.set("interactions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssues(value: AddLabels): Self = this.set("issues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicenses(value: GetForRepo): Self = this.set("licenses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkdown(value: RenderRaw): Self = this.set("markdown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeta(value: Get762): Self = this.set("meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMigrations(value: DeleteArchiveForAuthenticatedUser): Self = this.set("migrations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrgs(value: CheckBlockedUser): Self = this.set("orgs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjects(value: CreateCard): Self = this.set("projects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPulls(value: CreateReplyForReviewComment): Self = this.set("pulls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRateLimit(value: Get872): Self = this.set("rateLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReactions(value: CreateForIssue): Self = this.set("reactions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepos(value: AddAppAccessRestrictions): Self = this.set("repos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearch(value: Commits): Self = this.set("search", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeams(value: AddOrUpdateProjectPermissionsInOrg): Self = this.set("teams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsers(value: Block): Self = this.set("users", value.asInstanceOf[js.Any])
  }
}
