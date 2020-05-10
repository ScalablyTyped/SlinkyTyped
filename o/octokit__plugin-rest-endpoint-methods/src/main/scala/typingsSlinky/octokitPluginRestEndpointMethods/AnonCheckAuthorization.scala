package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCheckAuthorization extends js.Object {
  var checkAuthorization: AnonDeprecated = js.native
  var createAuthorization: AnonDeprecatedMethodParams = js.native
  var deleteAuthorization: AnonDeprecatedMethodParamsUrl = js.native
  var deleteGrant: AnonDeprecatedString = js.native
  var getAuthorization: AnonDeprecatedMethodParamsUrl = js.native
  var getGrant: AnonDeprecatedString = js.native
  var getOrCreateAuthorizationForApp: AnonParamsAnonFingerprint = js.native
  var getOrCreateAuthorizationForAppAndFingerprint: AnonParamsAnonNote = js.native
  var getOrCreateAuthorizationForAppFingerprint: AnonParamsAnonNote = js.native
  var listAuthorizations: AnonDeprecatedStringMethodString = js.native
  var listGrants: AnonDeprecatedStringMethodString = js.native
  var resetAuthorization: AnonDeprecated = js.native
  var revokeAuthorizationForApplication: AnonDeprecated = js.native
  var revokeGrantForApplication: AnonDeprecated = js.native
  var updateAuthorization: AnonParamsAnonAddscopes = js.native
}

object AnonCheckAuthorization {
  @scala.inline
  def apply(
    checkAuthorization: AnonDeprecated,
    createAuthorization: AnonDeprecatedMethodParams,
    deleteAuthorization: AnonDeprecatedMethodParamsUrl,
    deleteGrant: AnonDeprecatedString,
    getAuthorization: AnonDeprecatedMethodParamsUrl,
    getGrant: AnonDeprecatedString,
    getOrCreateAuthorizationForApp: AnonParamsAnonFingerprint,
    getOrCreateAuthorizationForAppAndFingerprint: AnonParamsAnonNote,
    getOrCreateAuthorizationForAppFingerprint: AnonParamsAnonNote,
    listAuthorizations: AnonDeprecatedStringMethodString,
    listGrants: AnonDeprecatedStringMethodString,
    resetAuthorization: AnonDeprecated,
    revokeAuthorizationForApplication: AnonDeprecated,
    revokeGrantForApplication: AnonDeprecated,
    updateAuthorization: AnonParamsAnonAddscopes
  ): AnonCheckAuthorization = {
    val __obj = js.Dynamic.literal(checkAuthorization = checkAuthorization.asInstanceOf[js.Any], createAuthorization = createAuthorization.asInstanceOf[js.Any], deleteAuthorization = deleteAuthorization.asInstanceOf[js.Any], deleteGrant = deleteGrant.asInstanceOf[js.Any], getAuthorization = getAuthorization.asInstanceOf[js.Any], getGrant = getGrant.asInstanceOf[js.Any], getOrCreateAuthorizationForApp = getOrCreateAuthorizationForApp.asInstanceOf[js.Any], getOrCreateAuthorizationForAppAndFingerprint = getOrCreateAuthorizationForAppAndFingerprint.asInstanceOf[js.Any], getOrCreateAuthorizationForAppFingerprint = getOrCreateAuthorizationForAppFingerprint.asInstanceOf[js.Any], listAuthorizations = listAuthorizations.asInstanceOf[js.Any], listGrants = listGrants.asInstanceOf[js.Any], resetAuthorization = resetAuthorization.asInstanceOf[js.Any], revokeAuthorizationForApplication = revokeAuthorizationForApplication.asInstanceOf[js.Any], revokeGrantForApplication = revokeGrantForApplication.asInstanceOf[js.Any], updateAuthorization = updateAuthorization.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCheckAuthorization]
  }
  @scala.inline
  implicit class AnonCheckAuthorizationOps[Self <: AnonCheckAuthorization] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckAuthorization(value: AnonDeprecated): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkAuthorization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateAuthorization(value: AnonDeprecatedMethodParams): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createAuthorization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteAuthorization(value: AnonDeprecatedMethodParamsUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteAuthorization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteGrant(value: AnonDeprecatedString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteGrant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetAuthorization(value: AnonDeprecatedMethodParamsUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAuthorization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetGrant(value: AnonDeprecatedString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGrant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetOrCreateAuthorizationForApp(value: AnonParamsAnonFingerprint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOrCreateAuthorizationForApp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetOrCreateAuthorizationForAppAndFingerprint(value: AnonParamsAnonNote): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOrCreateAuthorizationForAppAndFingerprint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetOrCreateAuthorizationForAppFingerprint(value: AnonParamsAnonNote): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOrCreateAuthorizationForAppFingerprint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListAuthorizations(value: AnonDeprecatedStringMethodString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listAuthorizations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListGrants(value: AnonDeprecatedStringMethodString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listGrants")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResetAuthorization(value: AnonDeprecated): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetAuthorization")(value.asInstanceOf[js.Any])
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
    def withUpdateAuthorization(value: AnonParamsAnonAddscopes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateAuthorization")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

