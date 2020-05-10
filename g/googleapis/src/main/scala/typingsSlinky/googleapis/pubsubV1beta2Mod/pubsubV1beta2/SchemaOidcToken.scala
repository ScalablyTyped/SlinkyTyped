package typingsSlinky.googleapis.pubsubV1beta2Mod.pubsubV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains information needed for generating an [OpenID Connect
  * token](https://developers.google.com/identity/protocols/OpenIDConnect).
  */
@js.native
trait SchemaOidcToken extends js.Object {
  /**
    * Audience to be used when generating OIDC token. The audience claim
    * identifies the recipients that the JWT is intended for. The audience
    * value is a single case-sensitive string. Having multiple values (array)
    * for the audience field is not supported. More info about the OIDC JWT
    * token audience here: https://tools.ietf.org/html/rfc7519#section-4.1.3
    * Note: if not specified, the Push endpoint URL will be used.
    */
  var audience: js.UndefOr[String] = js.native
  /**
    * [Service account
    * email](https://cloud.google.com/iam/docs/service-accounts) to be used for
    * generating the OIDC token. The caller (for CreateSubscription,
    * UpdateSubscription, and ModifyPushConfig RPCs) must have the
    * iam.serviceAccounts.actAs permission for the service account.
    */
  var serviceAccountEmail: js.UndefOr[String] = js.native
}

object SchemaOidcToken {
  @scala.inline
  def apply(): SchemaOidcToken = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOidcToken]
  }
  @scala.inline
  implicit class SchemaOidcTokenOps[Self <: SchemaOidcToken] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAudience(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audience")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudience: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audience")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceAccountEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceAccountEmail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceAccountEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceAccountEmail")(js.undefined)
        ret
    }
  }
  
}

