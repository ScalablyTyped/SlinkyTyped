package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckAuthorization extends js.Object {
  var checkAuthorization: Deprecated = js.native
  var createAuthorization: DeprecatedMethodParams = js.native
  var deleteAuthorization: DeprecatedMethodParamsUrl = js.native
  var deleteGrant: DeprecatedString = js.native
  var getAuthorization: DeprecatedMethodParamsUrl = js.native
  var getGrant: DeprecatedString = js.native
  var getOrCreateAuthorizationForApp: ParamsFingerprint = js.native
  var getOrCreateAuthorizationForAppAndFingerprint: ParamsNote = js.native
  var getOrCreateAuthorizationForAppFingerprint: ParamsNote = js.native
  var listAuthorizations: DeprecatedStringMethodString = js.native
  var listGrants: DeprecatedStringMethodString = js.native
  var resetAuthorization: Deprecated = js.native
  var revokeAuthorizationForApplication: Deprecated = js.native
  var revokeGrantForApplication: Deprecated = js.native
  var updateAuthorization: ParamsAddscopes = js.native
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
  @scala.inline
  implicit class CheckAuthorizationOps[Self <: CheckAuthorization] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckAuthorization(value: Deprecated): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkAuthorization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateAuthorization(value: DeprecatedMethodParams): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createAuthorization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteAuthorization(value: DeprecatedMethodParamsUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteAuthorization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteGrant(value: DeprecatedString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteGrant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetAuthorization(value: DeprecatedMethodParamsUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAuthorization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetGrant(value: DeprecatedString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGrant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetOrCreateAuthorizationForApp(value: ParamsFingerprint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOrCreateAuthorizationForApp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetOrCreateAuthorizationForAppAndFingerprint(value: ParamsNote): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOrCreateAuthorizationForAppAndFingerprint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetOrCreateAuthorizationForAppFingerprint(value: ParamsNote): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOrCreateAuthorizationForAppFingerprint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListAuthorizations(value: DeprecatedStringMethodString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listAuthorizations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListGrants(value: DeprecatedStringMethodString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listGrants")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResetAuthorization(value: Deprecated): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetAuthorization")(value.asInstanceOf[js.Any])
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
    def withUpdateAuthorization(value: ParamsAddscopes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateAuthorization")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

