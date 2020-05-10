package typingsSlinky.reactNativeGoogleSignin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigureParams extends js.Object {
  /**
    * ANDROID ONLY. An account name that should be prioritized.
    */
  var accountName: js.UndefOr[String] = js.native
  /**
    * ANDROID ONLY. Specifies if the consent prompt should be shown at each login.
    */
  var forceConsentPrompt: js.UndefOr[Boolean] = js.native
  /**
    * Specifies a hosted domain restriction
    */
  var hostedDomain: js.UndefOr[String] = js.native
  /**
    * If you want to specify the client ID of type iOS
    */
  var iosClientId: js.UndefOr[String] = js.native
  /**
    * Must be true if you wish to access user APIs on behalf of the user from
    * your own server
    */
  var offlineAccess: js.UndefOr[Boolean] = js.native
  /**
    * The Google API scopes to request access to. Default is email and profile.
    */
  var scopes: js.UndefOr[js.Array[String]] = js.native
  /**
    * Web client ID from Developer Console. Required for offline access
    */
  var webClientId: js.UndefOr[String] = js.native
}

object ConfigureParams {
  @scala.inline
  def apply(): ConfigureParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigureParams]
  }
  @scala.inline
  implicit class ConfigureParamsOps[Self <: ConfigureParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountName")(js.undefined)
        ret
    }
    @scala.inline
    def withForceConsentPrompt(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceConsentPrompt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceConsentPrompt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceConsentPrompt")(js.undefined)
        ret
    }
    @scala.inline
    def withHostedDomain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostedDomain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostedDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostedDomain")(js.undefined)
        ret
    }
    @scala.inline
    def withIosClientId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iosClientId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIosClientId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iosClientId")(js.undefined)
        ret
    }
    @scala.inline
    def withOfflineAccess(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offlineAccess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOfflineAccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offlineAccess")(js.undefined)
        ret
    }
    @scala.inline
    def withScopes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScopes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopes")(js.undefined)
        ret
    }
    @scala.inline
    def withWebClientId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webClientId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebClientId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webClientId")(js.undefined)
        ret
    }
  }
  
}

