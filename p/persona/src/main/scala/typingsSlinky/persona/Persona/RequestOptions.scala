package typingsSlinky.persona.Persona

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestOptions extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.native
  var oncancel: js.UndefOr[js.Function0[Unit]] = js.native
  var privacyPolicy: js.UndefOr[String] = js.native
  var returnTo: js.UndefOr[String] = js.native
  var siteLogo: js.UndefOr[String] = js.native
  var siteName: js.UndefOr[String] = js.native
  var termsOfService: js.UndefOr[String] = js.native
}

object RequestOptions {
  @scala.inline
  def apply(): RequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestOptions]
  }
  @scala.inline
  implicit class RequestOptionsOps[Self <: RequestOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withOncancel(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oncancel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOncancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oncancel")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivacyPolicy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privacyPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivacyPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privacyPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withReturnTo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnTo")(js.undefined)
        ret
    }
    @scala.inline
    def withSiteLogo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("siteLogo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSiteLogo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("siteLogo")(js.undefined)
        ret
    }
    @scala.inline
    def withSiteName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("siteName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSiteName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("siteName")(js.undefined)
        ret
    }
    @scala.inline
    def withTermsOfService(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("termsOfService")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTermsOfService: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("termsOfService")(js.undefined)
        ret
    }
  }
  
}

