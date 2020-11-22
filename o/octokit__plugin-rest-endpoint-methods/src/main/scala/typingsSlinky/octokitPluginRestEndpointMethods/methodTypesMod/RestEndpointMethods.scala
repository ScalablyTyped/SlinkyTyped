package typingsSlinky.octokitPluginRestEndpointMethods.methodTypesMod

import typingsSlinky.octokitPluginRestEndpointMethods.anon.AcceptInvitation
import typingsSlinky.octokitPluginRestEndpointMethods.anon.AddAssignees
import typingsSlinky.octokitPluginRestEndpointMethods.anon.AddCollaborator
import typingsSlinky.octokitPluginRestEndpointMethods.anon.AddEmailForAuthenticated
import typingsSlinky.octokitPluginRestEndpointMethods.anon.AddOrUpdateMembershipForUserInOrg
import typingsSlinky.octokitPluginRestEndpointMethods.anon.AddRepoToInstallation
import typingsSlinky.octokitPluginRestEndpointMethods.anon.AddSelectedRepoToOrgSecret
import typingsSlinky.octokitPluginRestEndpointMethods.anon.BlockUser
import typingsSlinky.octokitPluginRestEndpointMethods.anon.CancelImport
import typingsSlinky.octokitPluginRestEndpointMethods.anon.CheckIfMerged
import typingsSlinky.octokitPluginRestEndpointMethods.anon.CheckIsStarred
import typingsSlinky.octokitPluginRestEndpointMethods.anon.CheckRepoIsStarredByAuthenticatedUser
import typingsSlinky.octokitPluginRestEndpointMethods.anon.Code
import typingsSlinky.octokitPluginRestEndpointMethods.anon.Create
import typingsSlinky.octokitPluginRestEndpointMethods.anon.CreateBlob
import typingsSlinky.octokitPluginRestEndpointMethods.anon.CreateForCommitComment
import typingsSlinky.octokitPluginRestEndpointMethods.anon.Get
import typingsSlinky.octokitPluginRestEndpointMethods.anon.Get209
import typingsSlinky.octokitPluginRestEndpointMethods.anon.Get319
import typingsSlinky.octokitPluginRestEndpointMethods.anon.GetAlert
import typingsSlinky.octokitPluginRestEndpointMethods.anon.GetAllCodesOfConduct
import typingsSlinky.octokitPluginRestEndpointMethods.anon.GetAllCommonlyUsed
import typingsSlinky.octokitPluginRestEndpointMethods.anon.GetAllTemplates
import typingsSlinky.octokitPluginRestEndpointMethods.anon.GetGithubActionsBillingOrg
import typingsSlinky.octokitPluginRestEndpointMethods.anon.GetRestrictionsForOrg
import typingsSlinky.octokitPluginRestEndpointMethods.anon.Render
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RestEndpointMethods extends js.Object {
  
  var actions: AddSelectedRepoToOrgSecret = js.native
  
  var activity: CheckRepoIsStarredByAuthenticatedUser = js.native
  
  var apps: AddRepoToInstallation = js.native
  
  var billing: GetGithubActionsBillingOrg = js.native
  
  var checks: Create = js.native
  
  var codeScanning: GetAlert = js.native
  
  var codesOfConduct: GetAllCodesOfConduct = js.native
  
  var emojis: Get = js.native
  
  var gists: CheckIsStarred = js.native
  
  var git: CreateBlob = js.native
  
  var gitignore: GetAllTemplates = js.native
  
  var interactions: GetRestrictionsForOrg = js.native
  
  var issues: AddAssignees = js.native
  
  var licenses: GetAllCommonlyUsed = js.native
  
  var markdown: Render = js.native
  
  var meta: Get209 = js.native
  
  var migrations: CancelImport = js.native
  
  var orgs: BlockUser = js.native
  
  var projects: AddCollaborator = js.native
  
  var pulls: CheckIfMerged = js.native
  
  var rateLimit: Get319 = js.native
  
  var reactions: CreateForCommitComment = js.native
  
  var repos: AcceptInvitation = js.native
  
  var search: Code = js.native
  
  var teams: AddOrUpdateMembershipForUserInOrg = js.native
  
  var users: AddEmailForAuthenticated = js.native
}
object RestEndpointMethods {
  
  @scala.inline
  def apply(
    actions: AddSelectedRepoToOrgSecret,
    activity: CheckRepoIsStarredByAuthenticatedUser,
    apps: AddRepoToInstallation,
    billing: GetGithubActionsBillingOrg,
    checks: Create,
    codeScanning: GetAlert,
    codesOfConduct: GetAllCodesOfConduct,
    emojis: Get,
    gists: CheckIsStarred,
    git: CreateBlob,
    gitignore: GetAllTemplates,
    interactions: GetRestrictionsForOrg,
    issues: AddAssignees,
    licenses: GetAllCommonlyUsed,
    markdown: Render,
    meta: Get209,
    migrations: CancelImport,
    orgs: BlockUser,
    projects: AddCollaborator,
    pulls: CheckIfMerged,
    rateLimit: Get319,
    reactions: CreateForCommitComment,
    repos: AcceptInvitation,
    search: Code,
    teams: AddOrUpdateMembershipForUserInOrg,
    users: AddEmailForAuthenticated
  ): RestEndpointMethods = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], activity = activity.asInstanceOf[js.Any], apps = apps.asInstanceOf[js.Any], billing = billing.asInstanceOf[js.Any], checks = checks.asInstanceOf[js.Any], codeScanning = codeScanning.asInstanceOf[js.Any], codesOfConduct = codesOfConduct.asInstanceOf[js.Any], emojis = emojis.asInstanceOf[js.Any], gists = gists.asInstanceOf[js.Any], git = git.asInstanceOf[js.Any], gitignore = gitignore.asInstanceOf[js.Any], interactions = interactions.asInstanceOf[js.Any], issues = issues.asInstanceOf[js.Any], licenses = licenses.asInstanceOf[js.Any], markdown = markdown.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], migrations = migrations.asInstanceOf[js.Any], orgs = orgs.asInstanceOf[js.Any], projects = projects.asInstanceOf[js.Any], pulls = pulls.asInstanceOf[js.Any], rateLimit = rateLimit.asInstanceOf[js.Any], reactions = reactions.asInstanceOf[js.Any], repos = repos.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], teams = teams.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestEndpointMethods]
  }
  
  @scala.inline
  implicit class RestEndpointMethodsOps[Self <: RestEndpointMethods] (val x: Self) extends AnyVal {
    
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
    def setActions(value: AddSelectedRepoToOrgSecret): Self = this.set("actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivity(value: CheckRepoIsStarredByAuthenticatedUser): Self = this.set("activity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApps(value: AddRepoToInstallation): Self = this.set("apps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBilling(value: GetGithubActionsBillingOrg): Self = this.set("billing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChecks(value: Create): Self = this.set("checks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeScanning(value: GetAlert): Self = this.set("codeScanning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodesOfConduct(value: GetAllCodesOfConduct): Self = this.set("codesOfConduct", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmojis(value: Get): Self = this.set("emojis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGists(value: CheckIsStarred): Self = this.set("gists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGit(value: CreateBlob): Self = this.set("git", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGitignore(value: GetAllTemplates): Self = this.set("gitignore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInteractions(value: GetRestrictionsForOrg): Self = this.set("interactions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssues(value: AddAssignees): Self = this.set("issues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicenses(value: GetAllCommonlyUsed): Self = this.set("licenses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkdown(value: Render): Self = this.set("markdown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeta(value: Get209): Self = this.set("meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMigrations(value: CancelImport): Self = this.set("migrations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrgs(value: BlockUser): Self = this.set("orgs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjects(value: AddCollaborator): Self = this.set("projects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPulls(value: CheckIfMerged): Self = this.set("pulls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRateLimit(value: Get319): Self = this.set("rateLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReactions(value: CreateForCommitComment): Self = this.set("reactions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepos(value: AcceptInvitation): Self = this.set("repos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearch(value: Code): Self = this.set("search", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeams(value: AddOrUpdateMembershipForUserInOrg): Self = this.set("teams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsers(value: AddEmailForAuthenticated): Self = this.set("users", value.asInstanceOf[js.Any])
  }
}
