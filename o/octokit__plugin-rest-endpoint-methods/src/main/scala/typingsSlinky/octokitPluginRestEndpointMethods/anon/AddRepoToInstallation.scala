package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddRepoToInstallation extends js.Object {
  var addRepoToInstallation: Headers = js.native
  var checkAccountIsAssociatedWithAny: ParamsAccountid = js.native
  var checkAccountIsAssociatedWithAnyStubbed: ParamsAccountid = js.native
  var checkAuthorization: Deprecated = js.native
  var checkToken: HeadersMethod = js.native
  var createContentAttachment: HeadersMethodParams = js.native
  var createFromManifest: HeadersMethodParamsUrl = js.native
  var createInstallationToken: HeadersAccept = js.native
  var deleteAuthorization: HeadersMethod = js.native
  var deleteInstallation: ParamsInstallationidRequired = js.native
  var deleteToken: HeadersMethod = js.native
  var findOrgInstallation: DeprecatedHeaders = js.native
  var findRepoInstallation: DeprecatedHeadersMethod = js.native
  var findUserInstallation: DeprecatedHeadersMethodParams = js.native
  var getAuthenticated: HeadersAcceptMethodString = js.native
  var getBySlug: ParamsAppslug = js.native
  var getInstallation: ParamsInstallationidRequired = js.native
  var getOrgInstallation: ParamsOrgRequired = js.native
  var getRepoInstallation: ParamsRepo = js.native
  var getUserInstallation: ParamsUsernameRequired = js.native
  var listAccountsUserOrOrgOnPlan: ParamsPlanid = js.native
  var listAccountsUserOrOrgOnPlanStubbed: ParamsPlanid = js.native
  var listInstallationReposForAuthenticatedUser: ParamsInstallationidPage = js.native
  var listInstallations: MethodStringParamsPagePerpage = js.native
  var listInstallationsForAuthenticatedUser: MethodStringParamsPagePerpage = js.native
  var listMarketplacePurchasesForAuthenticatedUser: ParamsPagePerpage = js.native
  var listMarketplacePurchasesForAuthenticatedUserStubbed: ParamsPagePerpage = js.native
  var listPlans: ParamsPagePerpage = js.native
  var listPlansStubbed: ParamsPagePerpage = js.native
  var listRepos: MethodStringParamsPagePerpage = js.native
  var removeRepoFromInstallation: Headers = js.native
  var resetAuthorization: Deprecated = js.native
  var resetToken: HeadersMethod = js.native
  var revokeAuthorizationForApplication: Deprecated = js.native
  var revokeGrantForApplication: Deprecated = js.native
  var revokeInstallationToken: HeadersAcceptMethodString = js.native
}

object AddRepoToInstallation {
  @scala.inline
  def apply(
    addRepoToInstallation: Headers,
    checkAccountIsAssociatedWithAny: ParamsAccountid,
    checkAccountIsAssociatedWithAnyStubbed: ParamsAccountid,
    checkAuthorization: Deprecated,
    checkToken: HeadersMethod,
    createContentAttachment: HeadersMethodParams,
    createFromManifest: HeadersMethodParamsUrl,
    createInstallationToken: HeadersAccept,
    deleteAuthorization: HeadersMethod,
    deleteInstallation: ParamsInstallationidRequired,
    deleteToken: HeadersMethod,
    findOrgInstallation: DeprecatedHeaders,
    findRepoInstallation: DeprecatedHeadersMethod,
    findUserInstallation: DeprecatedHeadersMethodParams,
    getAuthenticated: HeadersAcceptMethodString,
    getBySlug: ParamsAppslug,
    getInstallation: ParamsInstallationidRequired,
    getOrgInstallation: ParamsOrgRequired,
    getRepoInstallation: ParamsRepo,
    getUserInstallation: ParamsUsernameRequired,
    listAccountsUserOrOrgOnPlan: ParamsPlanid,
    listAccountsUserOrOrgOnPlanStubbed: ParamsPlanid,
    listInstallationReposForAuthenticatedUser: ParamsInstallationidPage,
    listInstallations: MethodStringParamsPagePerpage,
    listInstallationsForAuthenticatedUser: MethodStringParamsPagePerpage,
    listMarketplacePurchasesForAuthenticatedUser: ParamsPagePerpage,
    listMarketplacePurchasesForAuthenticatedUserStubbed: ParamsPagePerpage,
    listPlans: ParamsPagePerpage,
    listPlansStubbed: ParamsPagePerpage,
    listRepos: MethodStringParamsPagePerpage,
    removeRepoFromInstallation: Headers,
    resetAuthorization: Deprecated,
    resetToken: HeadersMethod,
    revokeAuthorizationForApplication: Deprecated,
    revokeGrantForApplication: Deprecated,
    revokeInstallationToken: HeadersAcceptMethodString
  ): AddRepoToInstallation = {
    val __obj = js.Dynamic.literal(addRepoToInstallation = addRepoToInstallation.asInstanceOf[js.Any], checkAccountIsAssociatedWithAny = checkAccountIsAssociatedWithAny.asInstanceOf[js.Any], checkAccountIsAssociatedWithAnyStubbed = checkAccountIsAssociatedWithAnyStubbed.asInstanceOf[js.Any], checkAuthorization = checkAuthorization.asInstanceOf[js.Any], checkToken = checkToken.asInstanceOf[js.Any], createContentAttachment = createContentAttachment.asInstanceOf[js.Any], createFromManifest = createFromManifest.asInstanceOf[js.Any], createInstallationToken = createInstallationToken.asInstanceOf[js.Any], deleteAuthorization = deleteAuthorization.asInstanceOf[js.Any], deleteInstallation = deleteInstallation.asInstanceOf[js.Any], deleteToken = deleteToken.asInstanceOf[js.Any], findOrgInstallation = findOrgInstallation.asInstanceOf[js.Any], findRepoInstallation = findRepoInstallation.asInstanceOf[js.Any], findUserInstallation = findUserInstallation.asInstanceOf[js.Any], getAuthenticated = getAuthenticated.asInstanceOf[js.Any], getBySlug = getBySlug.asInstanceOf[js.Any], getInstallation = getInstallation.asInstanceOf[js.Any], getOrgInstallation = getOrgInstallation.asInstanceOf[js.Any], getRepoInstallation = getRepoInstallation.asInstanceOf[js.Any], getUserInstallation = getUserInstallation.asInstanceOf[js.Any], listAccountsUserOrOrgOnPlan = listAccountsUserOrOrgOnPlan.asInstanceOf[js.Any], listAccountsUserOrOrgOnPlanStubbed = listAccountsUserOrOrgOnPlanStubbed.asInstanceOf[js.Any], listInstallationReposForAuthenticatedUser = listInstallationReposForAuthenticatedUser.asInstanceOf[js.Any], listInstallations = listInstallations.asInstanceOf[js.Any], listInstallationsForAuthenticatedUser = listInstallationsForAuthenticatedUser.asInstanceOf[js.Any], listMarketplacePurchasesForAuthenticatedUser = listMarketplacePurchasesForAuthenticatedUser.asInstanceOf[js.Any], listMarketplacePurchasesForAuthenticatedUserStubbed = listMarketplacePurchasesForAuthenticatedUserStubbed.asInstanceOf[js.Any], listPlans = listPlans.asInstanceOf[js.Any], listPlansStubbed = listPlansStubbed.asInstanceOf[js.Any], listRepos = listRepos.asInstanceOf[js.Any], removeRepoFromInstallation = removeRepoFromInstallation.asInstanceOf[js.Any], resetAuthorization = resetAuthorization.asInstanceOf[js.Any], resetToken = resetToken.asInstanceOf[js.Any], revokeAuthorizationForApplication = revokeAuthorizationForApplication.asInstanceOf[js.Any], revokeGrantForApplication = revokeGrantForApplication.asInstanceOf[js.Any], revokeInstallationToken = revokeInstallationToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddRepoToInstallation]
  }
  @scala.inline
  implicit class AddRepoToInstallationOps[Self <: AddRepoToInstallation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddRepoToInstallation(value: Headers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addRepoToInstallation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheckAccountIsAssociatedWithAny(value: ParamsAccountid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkAccountIsAssociatedWithAny")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheckAccountIsAssociatedWithAnyStubbed(value: ParamsAccountid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkAccountIsAssociatedWithAnyStubbed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheckAuthorization(value: Deprecated): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkAuthorization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheckToken(value: HeadersMethod): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateContentAttachment(value: HeadersMethodParams): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createContentAttachment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateFromManifest(value: HeadersMethodParamsUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createFromManifest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateInstallationToken(value: HeadersAccept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createInstallationToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteAuthorization(value: HeadersMethod): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteAuthorization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteInstallation(value: ParamsInstallationidRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteInstallation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteToken(value: HeadersMethod): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFindOrgInstallation(value: DeprecatedHeaders): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findOrgInstallation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFindRepoInstallation(value: DeprecatedHeadersMethod): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findRepoInstallation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFindUserInstallation(value: DeprecatedHeadersMethodParams): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findUserInstallation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetAuthenticated(value: HeadersAcceptMethodString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAuthenticated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetBySlug(value: ParamsAppslug): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBySlug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetInstallation(value: ParamsInstallationidRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInstallation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetOrgInstallation(value: ParamsOrgRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOrgInstallation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetRepoInstallation(value: ParamsRepo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRepoInstallation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetUserInstallation(value: ParamsUsernameRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUserInstallation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListAccountsUserOrOrgOnPlan(value: ParamsPlanid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listAccountsUserOrOrgOnPlan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListAccountsUserOrOrgOnPlanStubbed(value: ParamsPlanid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listAccountsUserOrOrgOnPlanStubbed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListInstallationReposForAuthenticatedUser(value: ParamsInstallationidPage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listInstallationReposForAuthenticatedUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListInstallations(value: MethodStringParamsPagePerpage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listInstallations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListInstallationsForAuthenticatedUser(value: MethodStringParamsPagePerpage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listInstallationsForAuthenticatedUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListMarketplacePurchasesForAuthenticatedUser(value: ParamsPagePerpage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listMarketplacePurchasesForAuthenticatedUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListMarketplacePurchasesForAuthenticatedUserStubbed(value: ParamsPagePerpage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listMarketplacePurchasesForAuthenticatedUserStubbed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListPlans(value: ParamsPagePerpage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listPlans")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListPlansStubbed(value: ParamsPagePerpage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listPlansStubbed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListRepos(value: MethodStringParamsPagePerpage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listRepos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveRepoFromInstallation(value: Headers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeRepoFromInstallation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResetAuthorization(value: Deprecated): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetAuthorization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResetToken(value: HeadersMethod): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRevokeAuthorizationForApplication(value: Deprecated): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revokeAuthorizationForApplication")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRevokeGrantForApplication(value: Deprecated): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revokeGrantForApplication")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRevokeInstallationToken(value: HeadersAcceptMethodString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revokeInstallationToken")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

