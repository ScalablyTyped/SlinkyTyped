package typingsSlinky.reactFacebookLoginComponent.mod

import org.scalajs.dom.raw.HTMLButtonElement
import typingsSlinky.react.mod.ButtonHTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FacebookLoginProps extends ButtonHTMLAttributes[HTMLButtonElement] {
  var buttonText: js.UndefOr[String] = js.native
  var fields: js.UndefOr[String] = js.native
  var socialId: String = js.native
  var version: js.UndefOr[String] = js.native
  var xfbml: js.UndefOr[Boolean] = js.native
  def responseHandler(response: FacebookLoginInfo): Unit = js.native
}

object FacebookLoginProps {
  @scala.inline
  def apply(responseHandler: FacebookLoginInfo => Unit, socialId: String): FacebookLoginProps = {
    val __obj = js.Dynamic.literal(responseHandler = js.Any.fromFunction1(responseHandler), socialId = socialId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FacebookLoginProps]
  }
  @scala.inline
  implicit class FacebookLoginPropsOps[Self <: FacebookLoginProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResponseHandler(value: FacebookLoginInfo => Unit): Self = {
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
    def withFields(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
    @scala.inline
    def withXfbml(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xfbml")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXfbml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xfbml")(js.undefined)
        ret
    }
  }
  
}

