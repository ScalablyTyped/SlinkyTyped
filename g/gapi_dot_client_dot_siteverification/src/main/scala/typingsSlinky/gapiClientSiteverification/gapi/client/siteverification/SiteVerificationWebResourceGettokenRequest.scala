package typingsSlinky.gapiClientSiteverification.gapi.client.siteverification

import typingsSlinky.gapiClientSiteverification.anon.Identifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SiteVerificationWebResourceGettokenRequest extends js.Object {
  /** The site for which a verification token will be generated. */
  var site: js.UndefOr[Identifier] = js.native
  /** The verification method that will be used to verify this site. For sites, 'FILE' or 'META' methods may be used. For domains, only 'DNS' may be used. */
  var verificationMethod: js.UndefOr[String] = js.native
}

object SiteVerificationWebResourceGettokenRequest {
  @scala.inline
  def apply(): SiteVerificationWebResourceGettokenRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SiteVerificationWebResourceGettokenRequest]
  }
  @scala.inline
  implicit class SiteVerificationWebResourceGettokenRequestOps[Self <: SiteVerificationWebResourceGettokenRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSite(value: Identifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("site")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("site")(js.undefined)
        ret
    }
    @scala.inline
    def withVerificationMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verificationMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerificationMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verificationMethod")(js.undefined)
        ret
    }
  }
  
}

