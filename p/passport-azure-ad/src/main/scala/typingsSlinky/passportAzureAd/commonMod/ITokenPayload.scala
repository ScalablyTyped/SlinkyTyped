package typingsSlinky.passportAzureAd.commonMod

import typingsSlinky.passportAzureAd.passportAzureAdBooleans.`true`
import typingsSlinky.passportAzureAd.passportAzureAdStrings.`0`
import typingsSlinky.passportAzureAd.passportAzureAdStrings.`1`
import typingsSlinky.passportAzureAd.passportAzureAdStrings.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITokenPayload extends js.Object {
  /** The "Authentication context class" claim. A value of "0" indicates the end-user authentication did not meet the requirements of ISO/IEC 29115. */
  var acr: js.UndefOr[`0` | `1`] = js.native
  /** An internal claim used by Azure AD to record data for token reuse. */
  var aio: js.UndefOr[String] = js.native
  /** Identifies how the subject of the token was authenticated.  */
  var amr: js.UndefOr[js.Array[String]] = js.native
  /** GUID represents the application ID of the client using the token. */
  var appid: js.UndefOr[String] = js.native
  /** Indicates how the client was authenticated. For a public client, the value is "0".
    * If client ID and client secret are used, the value is "1". If a client certificate was used for authentication, the value is "2". */
  var appidacr: js.UndefOr[`0` | `1` | `2`] = js.native
  /** An App ID URI. Identifies the intended recipient of the token. */
  var aud: js.UndefOr[String] = js.native
  /** Only present in v2.0 tokens. The application ID of the client using the token. */
  var azp: js.UndefOr[String] = js.native
  /** Only present in v2.0 tokens. Indicates how the client was authenticated.
    * For a public client, the value is "0". If client ID and client secret are used, the value is "1". If a client certificate was used for authentication, the value is "2". */
  var azpacr: js.UndefOr[`0` | `1` | `2`] = js.native
  /** The "exp" (expiration time) claim identifies the expiration time on or after which the JWT must not be accepted for processing. */
  var exp: js.UndefOr[Double] = js.native
  /** Provides object IDs that represent the subject's group memberships. */
  var groups: js.UndefOr[String | js.Array[String]] = js.native
  /** Denoting the user is in at least one group. */
  var hasgroups: js.UndefOr[`true`] = js.native
  /** "Issued At" indicates when the authentication for this token occurred. */
  var iat: js.UndefOr[Double] = js.native
  /** A security token service(STS) URI. Identifies the STS that constructs and returns the token,
    * and the Azure AD tenant in which the user was authenticated.*/
  var iss: js.UndefOr[String] = js.native
  /** Provides a human-readable value that identifies the subject of the token.
    * The value is not guaranteed to be unique, it is mutable, and it's designed to be used only for display purposes. The profile scope is required in order to receive this claim. */
  var name: js.UndefOr[String] = js.native
  /** The "nbf" (not before) claim identifies the time before which the JWT must not be accepted for processing. */
  var nbf: js.UndefOr[Double] = js.native
  /** GUID represents a user. This ID uniquely identifies the user across applications. */
  var oid: js.UndefOr[String] = js.native
  /** Only present in v2.0 tokens. The primary username that represents the user. It could be an email address, phone number, or a generic username without a specified format */
  var preferred_name: js.UndefOr[String] = js.native
  /** An internal claim used by Azure to revalidate tokens. */
  var rh: js.UndefOr[String] = js.native
  /** The set of permissions exposed by your application that the requesting application has been given permission to call. */
  var roles: js.UndefOr[String] = js.native
  /** The set of scopes exposed by your application for which the client application has requested (and received) consent. */
  var scp: js.UndefOr[String] = js.native
  /** The principal about which the token asserts information, such as the user of an app. This value is immutable and cannot be reassigned or reused.
    * It can be used to perform authorization checks safely, such as when the token is used to access a resource,
    * and can be used as a key in database tables. Because the subject is always present in the tokens that Azure AD issues,
    * we recommend using this value in a general-purpose authorization system. The subject is, however, a pairwise identifier - it is unique to a particular application ID.   */
  var sub: js.UndefOr[String] = js.native
  /** Represents the Azure AD tenant that the user is from. */
  var tid: js.UndefOr[String] = js.native
  /** Only present in v1.0 tokens. Provides a human readable value that identifies the subject of the token.  */
  var unique_name: js.UndefOr[String] = js.native
  /** The username of the user. May be a phone number, email address, or unformatted string. */
  var upn: js.UndefOr[String] = js.native
  /** An internal claim used by Azure to revalidate tokens. */
  var uti: js.UndefOr[String] = js.native
  /** Indicates the version of the access token. */
  var ver: js.UndefOr[String] = js.native
}

object ITokenPayload {
  @scala.inline
  def apply(): ITokenPayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITokenPayload]
  }
  @scala.inline
  implicit class ITokenPayloadOps[Self <: ITokenPayload] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcr(value: `0` | `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acr")(js.undefined)
        ret
    }
    @scala.inline
    def withAio(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aio")(js.undefined)
        ret
    }
    @scala.inline
    def withAmr(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amr")(js.undefined)
        ret
    }
    @scala.inline
    def withAppid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appid")(js.undefined)
        ret
    }
    @scala.inline
    def withAppidacr(value: `0` | `1` | `2`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appidacr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppidacr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appidacr")(js.undefined)
        ret
    }
    @scala.inline
    def withAud(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aud")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAud: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aud")(js.undefined)
        ret
    }
    @scala.inline
    def withAzp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("azp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAzp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("azp")(js.undefined)
        ret
    }
    @scala.inline
    def withAzpacr(value: `0` | `1` | `2`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("azpacr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAzpacr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("azpacr")(js.undefined)
        ret
    }
    @scala.inline
    def withExp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exp")(js.undefined)
        ret
    }
    @scala.inline
    def withGroups(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groups")(js.undefined)
        ret
    }
    @scala.inline
    def withHasgroups(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasgroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasgroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasgroups")(js.undefined)
        ret
    }
    @scala.inline
    def withIat(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iat")(js.undefined)
        ret
    }
    @scala.inline
    def withIss(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iss")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iss")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNbf(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nbf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNbf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nbf")(js.undefined)
        ret
    }
    @scala.inline
    def withOid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oid")(js.undefined)
        ret
    }
    @scala.inline
    def withPreferred_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferred_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreferred_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferred_name")(js.undefined)
        ret
    }
    @scala.inline
    def withRh(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rh")(js.undefined)
        ret
    }
    @scala.inline
    def withRoles(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roles")(js.undefined)
        ret
    }
    @scala.inline
    def withScp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scp")(js.undefined)
        ret
    }
    @scala.inline
    def withSub(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sub")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSub: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sub")(js.undefined)
        ret
    }
    @scala.inline
    def withTid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tid")(js.undefined)
        ret
    }
    @scala.inline
    def withUnique_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unique_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnique_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unique_name")(js.undefined)
        ret
    }
    @scala.inline
    def withUpn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upn")(js.undefined)
        ret
    }
    @scala.inline
    def withUti(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uti")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUti: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uti")(js.undefined)
        ret
    }
    @scala.inline
    def withVer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ver")(js.undefined)
        ret
    }
  }
  
}

