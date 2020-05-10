package typingsSlinky.reactGoogleLoginComponent.mod

import org.scalajs.dom.raw.HTMLButtonElement
import typingsSlinky.react.mod.ButtonHTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleLoginProps extends ButtonHTMLAttributes[HTMLButtonElement] {
  var buttonText: js.UndefOr[String] = js.native
  var fetchBasicProfile: js.UndefOr[Boolean] = js.native
  var prompt: js.UndefOr[String] = js.native
  var scope: js.UndefOr[String] = js.native
  var socialId: String = js.native
  def responseHandler(response: GoogleLoginInfo): Unit = js.native
}

object GoogleLoginProps {
  @scala.inline
  def apply(responseHandler: GoogleLoginInfo => Unit, socialId: String): GoogleLoginProps = {
    val __obj = js.Dynamic.literal(responseHandler = js.Any.fromFunction1(responseHandler), socialId = socialId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleLoginProps]
  }
  @scala.inline
  implicit class GoogleLoginPropsOps[Self <: GoogleLoginProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResponseHandler(value: GoogleLoginInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSocialId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socialId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButtonText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonText")(js.undefined)
        ret
    }
    @scala.inline
    def withFetchBasicProfile(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchBasicProfile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFetchBasicProfile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchBasicProfile")(js.undefined)
        ret
    }
    @scala.inline
    def withPrompt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prompt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrompt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prompt")(js.undefined)
        ret
    }
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
  }
  
}

