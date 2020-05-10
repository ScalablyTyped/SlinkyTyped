package typingsSlinky.microsoftLiveConnect.Microsoft.Live

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 'Properties' object passed into the WL.ui method when 'name' is set to
  * 'signin'.
  */
@js.native
trait ISignInProperties extends IUIProperties {
  /**
    * Defines the brand, or type of icon, to be used with the Live Connect
    * sign-in button.
    * @default "windows"
    */
  var brand: js.UndefOr[String] = js.native
  /**
    * Specifies the function to call whenever there is any error while the
    * sign-in control is initializing or while the user is signing in.
    */
  var onerror: js.UndefOr[js.Function] = js.native
  /**
    * Specifies the function to call after the user completes the sign-in
    * process.
    */
  var onloggedin: js.UndefOr[js.Function] = js.native
  /**
    * Specifies the function to call after the user completes the sign-out
    * process.
    */
  var onloggedout: js.UndefOr[js.Function] = js.native
  /**
    * If the value of the type property is set to "custom", this value
    * specifies the sign-in text to be displayed in the button.
    */
  var sign_in_text: js.UndefOr[String] = js.native
  /**
    * If the value of the type property is "custom", this value specifies
    * the sign-out text to be displayed in the button.
    */
  var sign_out_text: js.UndefOr[String] = js.native
  /**
    * Defines the color pallette used for the sign-in button. For Windows
    * Store apps using JavaScript, valid values are "dark" and "light".
    * For web apps, valid values are "blue" and "white".
    */
  var theme: js.UndefOr[String] = js.native
  /**
    * Defines the type of button.
    * @default "signin"
    */
  var `type`: js.UndefOr[String] = js.native
}

object ISignInProperties {
  @scala.inline
  def apply(element: String, name: String): ISignInProperties = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISignInProperties]
  }
  @scala.inline
  implicit class ISignInPropertiesOps[Self <: ISignInProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBrand(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brand")(js.undefined)
        ret
    }
    @scala.inline
    def withOnerror(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onerror")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnerror: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onerror")(js.undefined)
        ret
    }
    @scala.inline
    def withOnloggedin(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onloggedin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnloggedin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onloggedin")(js.undefined)
        ret
    }
    @scala.inline
    def withOnloggedout(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onloggedout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnloggedout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onloggedout")(js.undefined)
        ret
    }
    @scala.inline
    def withSign_in_text(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sign_in_text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSign_in_text: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sign_in_text")(js.undefined)
        ret
    }
    @scala.inline
    def withSign_out_text(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sign_out_text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSign_out_text: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sign_out_text")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

