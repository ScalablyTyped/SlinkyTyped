package typingsSlinky.googleapis.cloudschedulerV1beta1Mod.cloudschedulerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains information needed for generating an [OAuth
  * token](https://developers.google.com/identity/protocols/OAuth2). This type
  * of authorization should be used when sending requests to a GCP endpoint.
  */
@js.native
trait SchemaOAuthToken extends js.Object {
  /**
    * OAuth scope to be used for generating OAuth access token. If not
    * specified, &quot;https://www.googleapis.com/auth/cloud-platform&quot;
    * will be used.
    */
  var scope: js.UndefOr[String] = js.native
  /**
    * [Service account
    * email](https://cloud.google.com/iam/docs/service-accounts) to be used for
    * generating OAuth token. The service account must be within the same
    * project as the job. The caller must have iam.serviceAccounts.actAs
    * permission for the service account.
    */
  var serviceAccountEmail: js.UndefOr[String] = js.native
}

object SchemaOAuthToken {
  @scala.inline
  def apply(): SchemaOAuthToken = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOAuthToken]
  }
  @scala.inline
  implicit class SchemaOAuthTokenOps[Self <: SchemaOAuthToken] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScope(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(js.undefined)
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

