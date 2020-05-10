package typingsSlinky.googleapis.siteVerificationV1Mod.siteVerificationV1

import typingsSlinky.googleapis.AnonIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaSiteVerificationWebResourceGettokenRequest extends js.Object {
  /**
    * The site for which a verification token will be generated.
    */
  var site: js.UndefOr[AnonIdentifier] = js.native
  /**
    * The verification method that will be used to verify this site. For sites,
    * &#39;FILE&#39; or &#39;META&#39; methods may be used. For domains, only
    * &#39;DNS&#39; may be used.
    */
  var verificationMethod: js.UndefOr[String] = js.native
}

object SchemaSiteVerificationWebResourceGettokenRequest {
  @scala.inline
  def apply(): SchemaSiteVerificationWebResourceGettokenRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSiteVerificationWebResourceGettokenRequest]
  }
  @scala.inline
  implicit class SchemaSiteVerificationWebResourceGettokenRequestOps[Self <: SchemaSiteVerificationWebResourceGettokenRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSite(value: AnonIdentifier): Self = {
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

