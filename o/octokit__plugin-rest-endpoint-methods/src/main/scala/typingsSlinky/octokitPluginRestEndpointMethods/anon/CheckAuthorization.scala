package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckAuthorization extends js.Object {
  var checkAuthorization: Deprecated
  var createAuthorization: DeprecatedMethodParams
  var deleteAuthorization: DeprecatedMethodParamsUrl
  var deleteGrant: DeprecatedString
  var getAuthorization: DeprecatedMethodParamsUrl
  var getGrant: DeprecatedString
  var getOrCreateAuthorizationForApp: ParamsFingerprint
  var getOrCreateAuthorizationForAppAndFingerprint: ParamsNote
  var getOrCreateAuthorizationForAppFingerprint: ParamsNote
  var listAuthorizations: DeprecatedStringMethodString
  var listGrants: DeprecatedStringMethodString
  var resetAuthorization: Deprecated
  var revokeAuthorizationForApplication: Deprecated
  var revokeGrantForApplication: Deprecated
  var updateAuthorization: ParamsAddscopes
}

object CheckAuthorization {
  @scala.inline
  def apply(
    checkAuthorization: Deprecated,
    createAuthorization: DeprecatedMethodParams,
    deleteAuthorization: DeprecatedMethodParamsUrl,
    deleteGrant: DeprecatedString,
    getAuthorization: DeprecatedMethodParamsUrl,
    getGrant: DeprecatedString,
    getOrCreateAuthorizationForApp: ParamsFingerprint,
    getOrCreateAuthorizationForAppAndFingerprint: ParamsNote,
    getOrCreateAuthorizationForAppFingerprint: ParamsNote,
    listAuthorizations: DeprecatedStringMethodString,
    listGrants: DeprecatedStringMethodString,
    resetAuthorization: Deprecated,
    revokeAuthorizationForApplication: Deprecated,
    revokeGrantForApplication: Deprecated,
    updateAuthorization: ParamsAddscopes
  ): CheckAuthorization = {
    val __obj = js.Dynamic.literal(checkAuthorization = checkAuthorization.asInstanceOf[js.Any], createAuthorization = createAuthorization.asInstanceOf[js.Any], deleteAuthorization = deleteAuthorization.asInstanceOf[js.Any], deleteGrant = deleteGrant.asInstanceOf[js.Any], getAuthorization = getAuthorization.asInstanceOf[js.Any], getGrant = getGrant.asInstanceOf[js.Any], getOrCreateAuthorizationForApp = getOrCreateAuthorizationForApp.asInstanceOf[js.Any], getOrCreateAuthorizationForAppAndFingerprint = getOrCreateAuthorizationForAppAndFingerprint.asInstanceOf[js.Any], getOrCreateAuthorizationForAppFingerprint = getOrCreateAuthorizationForAppFingerprint.asInstanceOf[js.Any], listAuthorizations = listAuthorizations.asInstanceOf[js.Any], listGrants = listGrants.asInstanceOf[js.Any], resetAuthorization = resetAuthorization.asInstanceOf[js.Any], revokeAuthorizationForApplication = revokeAuthorizationForApplication.asInstanceOf[js.Any], revokeGrantForApplication = revokeGrantForApplication.asInstanceOf[js.Any], updateAuthorization = updateAuthorization.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckAuthorization]
  }
}

