package typingsSlinky.gapiAuth2

import typingsSlinky.gapiAuth2.gapi.auth2.GoogleUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonApppackagename extends js.Object {
  /**
    * The package name of the Android app to install over the air. See
    * <a href="https://developers.google.com/identity/sign-in/web/android-app-installs">Android app installs from your web site</a>.
    * Optional. (default: none)
    */
  var app_package_name: js.UndefOr[String] = js.native
  /**
    * The height of the button in pixels (default: 36).
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * Display long labels such as "Sign in with Google" rather than "Sign in" (default: false).
    */
  var longtitle: js.UndefOr[Boolean] = js.native
  /**
    * The callback function to call when sign-in fails (default: none).
    */
  var onfailure: js.UndefOr[js.Function1[/* reason */ AnonError, Unit]] = js.native
  /**
    * The callback function to call when a user successfully signs in (default: none).
    */
  var onsuccess: js.UndefOr[js.Function1[/* user */ GoogleUser, Unit]] = js.native
  /**
    * The auth scope or scopes to authorize. Auth scopes for individual APIs can be found in their documentation.
    */
  var scope: js.UndefOr[String] = js.native
  /**
    * The color theme of the button: either light or dark (default: light).
    */
  var theme: js.UndefOr[String] = js.native
  /**
    * The width of the button in pixels (default: 120).
    */
  var width: js.UndefOr[Double] = js.native
}

object AnonApppackagename {
  @scala.inline
  def apply(): AnonApppackagename = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonApppackagename]
  }
  @scala.inline
  implicit class AnonApppackagenameOps[Self <: AnonApppackagename] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApp_package_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("app_package_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApp_package_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("app_package_name")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withLongtitle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longtitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLongtitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longtitle")(js.undefined)
        ret
    }
    @scala.inline
    def withOnfailure(value: /* reason */ AnonError => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onfailure")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnfailure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onfailure")(js.undefined)
        ret
    }
    @scala.inline
    def withOnsuccess(value: /* user */ GoogleUser => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onsuccess")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnsuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onsuccess")(js.undefined)
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
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

