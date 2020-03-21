package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAddRepoToInstallation extends js.Object {
  var addRepoToInstallation: AnonHeaders
  var checkAccountIsAssociatedWithAny: AnonParamsAnonAccountid
  var checkAccountIsAssociatedWithAnyStubbed: AnonParamsAnonAccountid
  var checkAuthorization: AnonDeprecated
  var checkToken: AnonHeadersMethod
  var createContentAttachment: AnonHeadersMethodParams
  var createFromManifest: AnonHeadersMethodParamsUrl
  var createInstallationToken: AnonHeadersAnonAccept
  var deleteAuthorization: AnonHeadersMethod
  var deleteInstallation: AnonParamsAnonInstallationidAnonRequired
  var deleteToken: AnonHeadersMethod
  var findOrgInstallation: AnonDeprecatedHeaders
  var findRepoInstallation: AnonDeprecatedHeadersMethod
  var findUserInstallation: AnonDeprecatedHeadersMethodParams
  var getAuthenticated: AnonHeadersAnonAcceptMethodString
  var getBySlug: AnonParamsAnonAppslug
  var getInstallation: AnonParamsAnonInstallationidAnonRequired
  var getOrgInstallation: AnonParamsAnonOrgAnonRequired
  var getRepoInstallation: AnonParamsAnonRepo
  var getUserInstallation: AnonParamsAnonUsernameAnonRequired
  var listAccountsUserOrOrgOnPlan: AnonParamsAnonPlanid
  var listAccountsUserOrOrgOnPlanStubbed: AnonParamsAnonPlanid
  var listInstallationReposForAuthenticatedUser: AnonParamsAnonInstallationidPage
  var listInstallations: AnonMethodStringParamsAnonPagePerpage
  var listInstallationsForAuthenticatedUser: AnonMethodStringParamsAnonPagePerpage
  var listMarketplacePurchasesForAuthenticatedUser: AnonParamsAnonPagePerpage
  var listMarketplacePurchasesForAuthenticatedUserStubbed: AnonParamsAnonPagePerpage
  var listPlans: AnonParamsAnonPagePerpage
  var listPlansStubbed: AnonParamsAnonPagePerpage
  var listRepos: AnonMethodStringParamsAnonPagePerpage
  var removeRepoFromInstallation: AnonHeaders
  var resetAuthorization: AnonDeprecated
  var resetToken: AnonHeadersMethod
  var revokeAuthorizationForApplication: AnonDeprecated
  var revokeGrantForApplication: AnonDeprecated
  var revokeInstallationToken: AnonHeadersAnonAcceptMethodString
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
}

