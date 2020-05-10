package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAddRepoToInstallation extends js.Object {
  var addRepoToInstallation: AnonHeaders = js.native
  var checkAccountIsAssociatedWithAny: AnonParamsAnonAccountid = js.native
  var checkAccountIsAssociatedWithAnyStubbed: AnonParamsAnonAccountid = js.native
  var checkAuthorization: AnonDeprecated = js.native
  var checkToken: AnonHeadersMethod = js.native
  var createContentAttachment: AnonHeadersMethodParams = js.native
  var createFromManifest: AnonHeadersMethodParamsUrl = js.native
  var createInstallationToken: AnonHeadersAnonAccept = js.native
  var deleteAuthorization: AnonHeadersMethod = js.native
  var deleteInstallation: AnonParamsAnonInstallationidAnonRequired = js.native
  var deleteToken: AnonHeadersMethod = js.native
  var findOrgInstallation: AnonDeprecatedHeaders = js.native
  var findRepoInstallation: AnonDeprecatedHeadersMethod = js.native
  var findUserInstallation: AnonDeprecatedHeadersMethodParams = js.native
  var getAuthenticated: AnonHeadersAnonAcceptMethodString = js.native
  var getBySlug: AnonParamsAnonAppslug = js.native
  var getInstallation: AnonParamsAnonInstallationidAnonRequired = js.native
  var getOrgInstallation: AnonParamsAnonOrgAnonRequired = js.native
  var getRepoInstallation: AnonParamsAnonRepo = js.native
  var getUserInstallation: AnonParamsAnonUsernameAnonRequired = js.native
  var listAccountsUserOrOrgOnPlan: AnonParamsAnonPlanid = js.native
  var listAccountsUserOrOrgOnPlanStubbed: AnonParamsAnonPlanid = js.native
  var listInstallationReposForAuthenticatedUser: AnonParamsAnonInstallationidPage = js.native
  var listInstallations: AnonMethodStringParamsAnonPagePerpage = js.native
  var listInstallationsForAuthenticatedUser: AnonMethodStringParamsAnonPagePerpage = js.native
  var listMarketplacePurchasesForAuthenticatedUser: AnonParamsAnonPagePerpage = js.native
  var listMarketplacePurchasesForAuthenticatedUserStubbed: AnonParamsAnonPagePerpage = js.native
  var listPlans: AnonParamsAnonPagePerpage = js.native
  var listPlansStubbed: AnonParamsAnonPagePerpage = js.native
  var listRepos: AnonMethodStringParamsAnonPagePerpage = js.native
  var removeRepoFromInstallation: AnonHeaders = js.native
  var resetAuthorization: AnonDeprecated = js.native
  var resetToken: AnonHeadersMethod = js.native
  var revokeAuthorizationForApplication: AnonDeprecated = js.native
  var revokeGrantForApplication: AnonDeprecated = js.native
  var revokeInstallationToken: AnonHeadersAnonAcceptMethodString = js.native
}

object AnonAddRepoToInstallation {
  @scala.inline
  def apply(
    addRepoToInstallation: AnonHeaders,
    checkAccountIsAssociatedWithAny: AnonParamsAnonAccountid,
    checkAccountIsAssociatedWithAnyStubbed: AnonParamsAnonAccountid,
    checkAuthorization: AnonDeprecated,
    checkToken: AnonHeadersMethod,
    createContentAttachment: AnonHeadersMethodParams,
    createFromManifest: AnonHeadersMethodParamsUrl,
    createInstallationToken: AnonHeadersAnonAccept,
    deleteAuthorization: AnonHeadersMethod,
    deleteInstallation: AnonParamsAnonInstallationidAnonRequired,
    deleteToken: AnonHeadersMethod,
    findOrgInstallation: AnonDeprecatedHeaders,
    findRepoInstallation: AnonDeprecatedHeadersMethod,
    findUserInstallation: AnonDeprecatedHeadersMethodParams,
    getAuthenticated: AnonHeadersAnonAcceptMethodString,
    getBySlug: AnonParamsAnonAppslug,
    getInstallation: AnonParamsAnonInstallationidAnonRequired,
    getOrgInstallation: AnonParamsAnonOrgAnonRequired,
    getRepoInstallation: AnonParamsAnonRepo,
    getUserInstallation: AnonParamsAnonUsernameAnonRequired,
    listAccountsUserOrOrgOnPlan: AnonParamsAnonPlanid,
    listAccountsUserOrOrgOnPlanStubbed: AnonParamsAnonPlanid,
    listInstallationReposForAuthenticatedUser: AnonParamsAnonInstallationidPage,
    listInstallations: AnonMethodStringParamsAnonPagePerpage,
    listInstallationsForAuthenticatedUser: AnonMethodStringParamsAnonPagePerpage,
    listMarketplacePurchasesForAuthenticatedUser: AnonParamsAnonPagePerpage,
    listMarketplacePurchasesForAuthenticatedUserStubbed: AnonParamsAnonPagePerpage,
    listPlans: AnonParamsAnonPagePerpage,
    listPlansStubbed: AnonParamsAnonPagePerpage,
    listRepos: AnonMethodStringParamsAnonPagePerpage,
    removeRepoFromInstallation: AnonHeaders,
    resetAuthorization: AnonDeprecated,
    resetToken: AnonHeadersMethod,
    revokeAuthorizationForApplication: AnonDeprecated,
    revokeGrantForApplication: AnonDeprecated,
    revokeInstallationToken: AnonHeadersAnonAcceptMethodString
  ): AnonAddRepoToInstallation = {
    val __obj = js.Dynamic.literal(addRepoToInstallation = addRepoToInstallation.asInstanceOf[js.Any], checkAccountIsAssociatedWithAny = checkAccountIsAssociatedWithAny.asInstanceOf[js.Any], checkAccountIsAssociatedWithAnyStubbed = checkAccountIsAssociatedWithAnyStubbed.asInstanceOf[js.Any], checkAuthorization = checkAuthorization.asInstanceOf[js.Any], checkToken = checkToken.asInstanceOf[js.Any], createContentAttachment = createContentAttachment.asInstanceOf[js.Any], createFromManifest = createFromManifest.asInstanceOf[js.Any], createInstallationToken = createInstallationToken.asInstanceOf[js.Any], deleteAuthorization = deleteAuthorization.asInstanceOf[js.Any], deleteInstallation = deleteInstallation.asInstanceOf[js.Any], deleteToken = deleteToken.asInstanceOf[js.Any], findOrgInstallation = findOrgInstallation.asInstanceOf[js.Any], findRepoInstallation = findRepoInstallation.asInstanceOf[js.Any], findUserInstallation = findUserInstallation.asInstanceOf[js.Any], getAuthenticated = getAuthenticated.asInstanceOf[js.Any], getBySlug = getBySlug.asInstanceOf[js.Any], getInstallation = getInstallation.asInstanceOf[js.Any], getOrgInstallation = getOrgInstallation.asInstanceOf[js.Any], getRepoInstallation = getRepoInstallation.asInstanceOf[js.Any], getUserInstallation = getUserInstallation.asInstanceOf[js.Any], listAccountsUserOrOrgOnPlan = listAccountsUserOrOrgOnPlan.asInstanceOf[js.Any], listAccountsUserOrOrgOnPlanStubbed = listAccountsUserOrOrgOnPlanStubbed.asInstanceOf[js.Any], listInstallationReposForAuthenticatedUser = listInstallationReposForAuthenticatedUser.asInstanceOf[js.Any], listInstallations = listInstallations.asInstanceOf[js.Any], listInstallationsForAuthenticatedUser = listInstallationsForAuthenticatedUser.asInstanceOf[js.Any], listMarketplacePurchasesForAuthenticatedUser = listMarketplacePurchasesForAuthenticatedUser.asInstanceOf[js.Any], listMarketplacePurchasesForAuthenticatedUserStubbed = listMarketplacePurchasesForAuthenticatedUserStubbed.asInstanceOf[js.Any], listPlans = listPlans.asInstanceOf[js.Any], listPlansStubbed = listPlansStubbed.asInstanceOf[js.Any], listRepos = listRepos.asInstanceOf[js.Any], removeRepoFromInstallation = removeRepoFromInstallation.asInstanceOf[js.Any], resetAuthorization = resetAuthorization.asInstanceOf[js.Any], resetToken = resetToken.asInstanceOf[js.Any], revokeAuthorizationForApplication = revokeAuthorizationForApplication.asInstanceOf[js.Any], revokeGrantForApplication = revokeGrantForApplication.asInstanceOf[js.Any], revokeInstallationToken = revokeInstallationToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAddRepoToInstallation]
  }
  @scala.inline
  implicit class AnonAddRepoToInstallationOps[Self <: AnonAddRepoToInstallation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddRepoToInstallation(value: AnonHeaders): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addRepoToInstallation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheckAccountIsAssociatedWithAny(value: AnonParamsAnonAccountid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkAccountIsAssociatedWithAny")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheckAccountIsAssociatedWithAnyStubbed(value: AnonParamsAnonAccountid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkAccountIsAssociatedWithAnyStubbed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheckAuthorization(value: AnonDeprecated): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkAuthorization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheckToken(value: AnonHeadersMethod): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateContentAttachment(value: AnonHeadersMethodParams): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createContentAttachment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateFromManifest(value: AnonHeadersMethodParamsUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createFromManifest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateInstallationToken(value: AnonHeadersAnonAccept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createInstallationToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteAuthorization(value: AnonHeadersMethod): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteAuthorization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteInstallation(value: AnonParamsAnonInstallationidAnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteInstallation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteToken(value: AnonHeadersMethod): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFindOrgInstallation(value: AnonDeprecatedHeaders): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findOrgInstallation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFindRepoInstallation(value: AnonDeprecatedHeadersMethod): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findRepoInstallation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFindUserInstallation(value: AnonDeprecatedHeadersMethodParams): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findUserInstallation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetAuthenticated(value: AnonHeadersAnonAcceptMethodString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAuthenticated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetBySlug(value: AnonParamsAnonAppslug): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBySlug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetInstallation(value: AnonParamsAnonInstallationidAnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInstallation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetOrgInstallation(value: AnonParamsAnonOrgAnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOrgInstallation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetRepoInstallation(value: AnonParamsAnonRepo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRepoInstallation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetUserInstallation(value: AnonParamsAnonUsernameAnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUserInstallation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListAccountsUserOrOrgOnPlan(value: AnonParamsAnonPlanid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listAccountsUserOrOrgOnPlan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListAccountsUserOrOrgOnPlanStubbed(value: AnonParamsAnonPlanid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listAccountsUserOrOrgOnPlanStubbed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListInstallationReposForAuthenticatedUser(value: AnonParamsAnonInstallationidPage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listInstallationReposForAuthenticatedUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListInstallations(value: AnonMethodStringParamsAnonPagePerpage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listInstallations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListInstallationsForAuthenticatedUser(value: AnonMethodStringParamsAnonPagePerpage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listInstallationsForAuthenticatedUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListMarketplacePurchasesForAuthenticatedUser(value: AnonParamsAnonPagePerpage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listMarketplacePurchasesForAuthenticatedUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListMarketplacePurchasesForAuthenticatedUserStubbed(value: AnonParamsAnonPagePerpage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listMarketplacePurchasesForAuthenticatedUserStubbed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListPlans(value: AnonParamsAnonPagePerpage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listPlans")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListPlansStubbed(value: AnonParamsAnonPagePerpage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listPlansStubbed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListRepos(value: AnonMethodStringParamsAnonPagePerpage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listRepos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveRepoFromInstallation(value: AnonHeaders): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeRepoFromInstallation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResetAuthorization(value: AnonDeprecated): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetAuthorization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResetToken(value: AnonHeadersMethod): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRevokeAuthorizationForApplication(value: AnonDeprecated): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revokeAuthorizationForApplication")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRevokeGrantForApplication(value: AnonDeprecated): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revokeGrantForApplication")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRevokeInstallationToken(value: AnonHeadersAnonAcceptMethodString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revokeInstallationToken")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

