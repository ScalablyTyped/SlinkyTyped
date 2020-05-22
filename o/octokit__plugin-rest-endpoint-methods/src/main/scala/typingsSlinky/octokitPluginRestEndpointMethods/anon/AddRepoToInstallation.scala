package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddRepoToInstallation extends js.Object {
  var addRepoToInstallation: Headers
  var checkAccountIsAssociatedWithAny: ParamsAccountid
  var checkAccountIsAssociatedWithAnyStubbed: ParamsAccountid
  var checkAuthorization: Deprecated
  var checkToken: HeadersMethod
  var createContentAttachment: HeadersMethodParams
  var createFromManifest: HeadersMethodParamsUrl
  var createInstallationToken: HeadersAccept
  var deleteAuthorization: HeadersMethod
  var deleteInstallation: ParamsInstallationidRequired
  var deleteToken: HeadersMethod
  var findOrgInstallation: DeprecatedHeaders
  var findRepoInstallation: DeprecatedHeadersMethod
  var findUserInstallation: DeprecatedHeadersMethodParams
  var getAuthenticated: HeadersAcceptMethodString
  var getBySlug: ParamsAppslug
  var getInstallation: ParamsInstallationidRequired
  var getOrgInstallation: ParamsOrgRequired
  var getRepoInstallation: ParamsRepo
  var getUserInstallation: ParamsUsernameRequired
  var listAccountsUserOrOrgOnPlan: ParamsPlanid
  var listAccountsUserOrOrgOnPlanStubbed: ParamsPlanid
  var listInstallationReposForAuthenticatedUser: ParamsInstallationidPage
  var listInstallations: MethodStringParamsPagePerpage
  var listInstallationsForAuthenticatedUser: MethodStringParamsPagePerpage
  var listMarketplacePurchasesForAuthenticatedUser: ParamsPagePerpage
  var listMarketplacePurchasesForAuthenticatedUserStubbed: ParamsPagePerpage
  var listPlans: ParamsPagePerpage
  var listPlansStubbed: ParamsPagePerpage
  var listRepos: MethodStringParamsPagePerpage
  var removeRepoFromInstallation: Headers
  var resetAuthorization: Deprecated
  var resetToken: HeadersMethod
  var revokeAuthorizationForApplication: Deprecated
  var revokeGrantForApplication: Deprecated
  var revokeInstallationToken: HeadersAcceptMethodString
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
}

