package typingsSlinky.gapiClientFirebasedynamiclinks.gapi.client.firebasedynamiclinks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AndroidInfo extends js.Object {
  /** Link to open on Android if the app is not installed. */
  var androidFallbackLink: js.UndefOr[String] = js.native
  /** If specified, this overrides the ‘link’ parameter on Android. */
  var androidLink: js.UndefOr[String] = js.native
  /**
    * Minimum version code for the Android app. If the installed app’s version
    * code is lower, then the user is taken to the Play Store.
    */
  var androidMinPackageVersionCode: js.UndefOr[String] = js.native
  /** Android package name of the app. */
  var androidPackageName: js.UndefOr[String] = js.native
}

object AndroidInfo {
  @scala.inline
  def apply(): AndroidInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AndroidInfo]
  }
  @scala.inline
  implicit class AndroidInfoOps[Self <: AndroidInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAndroidFallbackLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidFallbackLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAndroidFallbackLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidFallbackLink")(js.undefined)
        ret
    }
    @scala.inline
    def withAndroidLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAndroidLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidLink")(js.undefined)
        ret
    }
    @scala.inline
    def withAndroidMinPackageVersionCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidMinPackageVersionCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAndroidMinPackageVersionCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidMinPackageVersionCode")(js.undefined)
        ret
    }
    @scala.inline
    def withAndroidPackageName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidPackageName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAndroidPackageName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidPackageName")(js.undefined)
        ret
    }
  }
  
}

