package typingsSlinky.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request of getting a code for user confirmation (reset password, change
  * email etc.)
  */
@js.native
trait SchemaRelyingparty extends js.Object {
  /**
    * whether or not to install the android app on the device where the link is
    * opened
    */
  var androidInstallApp: js.UndefOr[Boolean] = js.native
  /**
    * minimum version of the app. if the version on the device is lower than
    * this version then the user is taken to the play store to upgrade the app
    */
  var androidMinimumVersion: js.UndefOr[String] = js.native
  /**
    * android package name of the android app to handle the action code
    */
  var androidPackageName: js.UndefOr[String] = js.native
  /**
    * whether or not the app can handle the oob code without first going to web
    */
  var canHandleCodeInApp: js.UndefOr[Boolean] = js.native
  /**
    * The recaptcha response from the user.
    */
  var captchaResp: js.UndefOr[String] = js.native
  /**
    * The recaptcha challenge presented to the user.
    */
  var challenge: js.UndefOr[String] = js.native
  /**
    * The url to continue to the Gitkit app
    */
  var continueUrl: js.UndefOr[String] = js.native
  /**
    * The email of the user.
    */
  var email: js.UndefOr[String] = js.native
  /**
    * iOS app store id to download the app if it&#39;s not already installed
    */
  var iOSAppStoreId: js.UndefOr[String] = js.native
  /**
    * the iOS bundle id of iOS app to handle the action code
    */
  var iOSBundleId: js.UndefOr[String] = js.native
  /**
    * The user&#39;s Gitkit login token for email change.
    */
  var idToken: js.UndefOr[String] = js.native
  /**
    * The fixed string &quot;identitytoolkit#relyingparty&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The new email if the code is for email change.
    */
  var newEmail: js.UndefOr[String] = js.native
  /**
    * The request type.
    */
  var requestType: js.UndefOr[String] = js.native
  /**
    * The IP address of the user.
    */
  var userIp: js.UndefOr[String] = js.native
}

object SchemaRelyingparty {
  @scala.inline
  def apply(): SchemaRelyingparty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRelyingparty]
  }
  @scala.inline
  implicit class SchemaRelyingpartyOps[Self <: SchemaRelyingparty] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAndroidInstallApp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidInstallApp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAndroidInstallApp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidInstallApp")(js.undefined)
        ret
    }
    @scala.inline
    def withAndroidMinimumVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidMinimumVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAndroidMinimumVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidMinimumVersion")(js.undefined)
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
    @scala.inline
    def withCanHandleCodeInApp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canHandleCodeInApp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanHandleCodeInApp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canHandleCodeInApp")(js.undefined)
        ret
    }
    @scala.inline
    def withCaptchaResp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captchaResp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaptchaResp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captchaResp")(js.undefined)
        ret
    }
    @scala.inline
    def withChallenge(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("challenge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChallenge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("challenge")(js.undefined)
        ret
    }
    @scala.inline
    def withContinueUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continueUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContinueUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continueUrl")(js.undefined)
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
    def withIOSAppStoreId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iOSAppStoreId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIOSAppStoreId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iOSAppStoreId")(js.undefined)
        ret
    }
    @scala.inline
    def withIOSBundleId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iOSBundleId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIOSBundleId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iOSBundleId")(js.undefined)
        ret
    }
    @scala.inline
    def withIdToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idToken")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withNewEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newEmail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newEmail")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestType")(js.undefined)
        ret
    }
    @scala.inline
    def withUserIp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userIp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserIp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userIp")(js.undefined)
        ret
    }
  }
  
}

