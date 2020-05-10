package typingsSlinky.gapiClientIam.gapi.client.iam

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceAccount extends js.Object {
  /**
    * Optional. A user-specified description of the service account.  Must be
    * fewer than 100 UTF-8 bytes.
    */
  var displayName: js.UndefOr[String] = js.native
  /** @OutputOnly The email address of the service account. */
  var email: js.UndefOr[String] = js.native
  /** Used to perform a consistent read-modify-write. */
  var etag: js.UndefOr[String] = js.native
  /**
    * The resource name of the service account in the following format:
    * `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}`.
    *
    * Requests using `-` as a wildcard for the `PROJECT_ID` will infer the
    * project from the `account` and the `ACCOUNT` value can be the `email`
    * address or the `unique_id` of the service account.
    *
    * In responses the resource name will always be in the format
    * `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}`.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * @OutputOnly. The OAuth2 client id for the service account.
    * This is used in conjunction with the OAuth2 clientconfig API to make
    * three legged OAuth2 (3LO) flows to access the data of Google users.
    */
  var oauth2ClientId: js.UndefOr[String] = js.native
  /** @OutputOnly The id of the project that owns the service account. */
  var projectId: js.UndefOr[String] = js.native
  /** @OutputOnly The unique and stable id of the service account. */
  var uniqueId: js.UndefOr[String] = js.native
}

object ServiceAccount {
  @scala.inline
  def apply(): ServiceAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceAccount]
  }
  @scala.inline
  implicit class ServiceAccountOps[Self <: ServiceAccount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(js.undefined)
        ret
    }
    @scala.inline
    def withEtag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEtag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(js.undefined)
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
    def withOauth2ClientId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oauth2ClientId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOauth2ClientId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oauth2ClientId")(js.undefined)
        ret
    }
    @scala.inline
    def withProjectId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjectId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectId")(js.undefined)
        ret
    }
    @scala.inline
    def withUniqueId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniqueId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUniqueId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniqueId")(js.undefined)
        ret
    }
  }
  
}

