package typingsSlinky.gapiClientSiteverification.gapi.client.siteverification

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SiteVerificationWebResourceGettokenResponse extends js.Object {
  /**
    * The verification method to use in conjunction with this token. For FILE, the token should be placed in the top-level directory of the site, stored
    * inside a file of the same name. For META, the token should be placed in the HEAD tag of the default page that is loaded for the site. For DNS, the
    * token should be placed in a TXT record of the domain.
    */
  var method: js.UndefOr[String] = js.native
  /** The verification token. The token must be placed appropriately in order for verification to succeed. */
  var token: js.UndefOr[String] = js.native
}

object SiteVerificationWebResourceGettokenResponse {
  @scala.inline
  def apply(): SiteVerificationWebResourceGettokenResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SiteVerificationWebResourceGettokenResponse]
  }
  @scala.inline
  implicit class SiteVerificationWebResourceGettokenResponseOps[Self <: SiteVerificationWebResourceGettokenResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(js.undefined)
        ret
    }
    @scala.inline
    def withToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(js.undefined)
        ret
    }
  }
  
}

