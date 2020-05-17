package typingsSlinky.inAppPurchase.mod

import typingsSlinky.inAppPurchase.anon.ClientEmail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config_ extends js.Object {
  /* Configurations for Amazon Store */
  var amazonAPIVersion: js.UndefOr[Double] = js.native
  /* Configurations for Apple */
  // if you want to exclude old transaction, set this to true. Default is false
  var appleExcludeOldTransactions: js.UndefOr[Boolean] = js.native
  // this comes from iTunes Connect (You need this to valiate subscriptions)
  var applePassword: js.UndefOr[String] = js.native
  /* Configurations for Facebook (Payments Lite) */
  var facebookAppId: js.UndefOr[String] = js.native
  var facebookAppSecret: js.UndefOr[String] = js.native
  // optional, for Google Play subscriptions
  var googleAccToken: js.UndefOr[String] = js.native
  // optional, for Google Play subscriptions
  var googleClientID: js.UndefOr[String] = js.native
  // optional, for Google Play subscriptions
  var googleClientSecret: js.UndefOr[String] = js.native
  /* Configurations for Google Play */
  // this is the path to the directory containing iap-sanbox/iap-live files
  var googlePublicKeyPath: js.UndefOr[String] = js.native
  // this is the google iap-live public key string
  var googlePublicKeyStrLive: js.UndefOr[String] = js.native
  // this is the google iap-sandbox public key string
  var googlePublicKeyStrSandBox: js.UndefOr[String] = js.native
  // optional, for Google Play subscritions
  var googleRefToken: js.UndefOr[String] = js.native
  // optional, for Google Play subscriptions
  var googleRefreshToken: js.UndefOr[String] = js.native
  // Configurations for Google Service Account validation: You can validate with just packageName, productId, and purchaseToken
  var googleServiceAccount: js.UndefOr[ClientEmail] = js.native
  /* Configurations for Roku */
  // this comes from Roku Developer Dashboard
  var rokuApiKey: js.UndefOr[String] = js.native
  var secret: js.UndefOr[String] = js.native
  /* Configurations all platforms */
  // For Apple and Googl Play to force Sandbox validation only
  var test: js.UndefOr[Boolean] = js.native
  // Output debug logs to stdout stream
  var verbose: js.UndefOr[Boolean] = js.native
}

object Config_ {
  @scala.inline
  def apply(): Config_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config_]
  }
  @scala.inline
  implicit class Config_Ops[Self <: Config_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAmazonAPIVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amazonAPIVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmazonAPIVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amazonAPIVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withAppleExcludeOldTransactions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appleExcludeOldTransactions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppleExcludeOldTransactions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appleExcludeOldTransactions")(js.undefined)
        ret
    }
    @scala.inline
    def withApplePassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applePassword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplePassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applePassword")(js.undefined)
        ret
    }
    @scala.inline
    def withFacebookAppId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facebookAppId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFacebookAppId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facebookAppId")(js.undefined)
        ret
    }
    @scala.inline
    def withFacebookAppSecret(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facebookAppSecret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFacebookAppSecret: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facebookAppSecret")(js.undefined)
        ret
    }
    @scala.inline
    def withGoogleAccToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googleAccToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGoogleAccToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googleAccToken")(js.undefined)
        ret
    }
    @scala.inline
    def withGoogleClientID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googleClientID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGoogleClientID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googleClientID")(js.undefined)
        ret
    }
    @scala.inline
    def withGoogleClientSecret(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googleClientSecret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGoogleClientSecret: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googleClientSecret")(js.undefined)
        ret
    }
    @scala.inline
    def withGooglePublicKeyPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googlePublicKeyPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGooglePublicKeyPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googlePublicKeyPath")(js.undefined)
        ret
    }
    @scala.inline
    def withGooglePublicKeyStrLive(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googlePublicKeyStrLive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGooglePublicKeyStrLive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googlePublicKeyStrLive")(js.undefined)
        ret
    }
    @scala.inline
    def withGooglePublicKeyStrSandBox(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googlePublicKeyStrSandBox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGooglePublicKeyStrSandBox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googlePublicKeyStrSandBox")(js.undefined)
        ret
    }
    @scala.inline
    def withGoogleRefToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googleRefToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGoogleRefToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googleRefToken")(js.undefined)
        ret
    }
    @scala.inline
    def withGoogleRefreshToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googleRefreshToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGoogleRefreshToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googleRefreshToken")(js.undefined)
        ret
    }
    @scala.inline
    def withGoogleServiceAccount(value: ClientEmail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googleServiceAccount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGoogleServiceAccount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googleServiceAccount")(js.undefined)
        ret
    }
    @scala.inline
    def withRokuApiKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rokuApiKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRokuApiKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rokuApiKey")(js.undefined)
        ret
    }
    @scala.inline
    def withSecret(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecret: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secret")(js.undefined)
        ret
    }
    @scala.inline
    def withTest(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test")(js.undefined)
        ret
    }
    @scala.inline
    def withVerbose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerbose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(js.undefined)
        ret
    }
  }
  
}

