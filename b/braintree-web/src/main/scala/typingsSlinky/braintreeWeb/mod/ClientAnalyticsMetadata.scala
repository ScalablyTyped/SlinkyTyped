package typingsSlinky.braintreeWeb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This object is returned by {@link Client#getConfiguration|getConfiguration}. This information is used extensively by other Braintree modules to properly configure themselves.
  * @property {object} client The braintree-web/client parameters.
  * @property {string} client.authorization A tokenizationKey or clientToken.
  * @property {object} gatewayConfiguration Gateway-supplied configuration.
  * @property {object} analyticsMetadata Analytics-specific data.
  * @property {string} analyticsMetadata.sessionId Uniquely identifies a browsing session.
  * @property {string} analyticsMetadata.sdkVersion The braintree.js version.
  * @property {string} analyticsMetadata.merchantAppId Identifies the merchant's web app.
  */
@js.native
trait ClientAnalyticsMetadata extends js.Object {
  var merchantAppId: String = js.native
  var sdkVersion: String = js.native
  var sessionId: String = js.native
}

object ClientAnalyticsMetadata {
  @scala.inline
  def apply(merchantAppId: String, sdkVersion: String, sessionId: String): ClientAnalyticsMetadata = {
    val __obj = js.Dynamic.literal(merchantAppId = merchantAppId.asInstanceOf[js.Any], sdkVersion = sdkVersion.asInstanceOf[js.Any], sessionId = sessionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientAnalyticsMetadata]
  }
  @scala.inline
  implicit class ClientAnalyticsMetadataOps[Self <: ClientAnalyticsMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMerchantAppId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merchantAppId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSdkVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sdkVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSessionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

