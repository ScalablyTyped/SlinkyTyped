package typingsSlinky.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebhookAuthConfiguration extends js.Object {
  /**
    * The property used to configure acceptance of webhooks in an IP address range. For IP, only the AllowedIPRange property must be set. This property must be set to a valid CIDR range.
    */
  var AllowedIPRange: js.UndefOr[WebhookAuthConfigurationAllowedIPRange] = js.native
  /**
    * The property used to configure GitHub authentication. For GITHUB_HMAC, only the SecretToken property must be set.
    */
  var SecretToken: js.UndefOr[WebhookAuthConfigurationSecretToken] = js.native
}

object WebhookAuthConfiguration {
  @scala.inline
  def apply(): WebhookAuthConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebhookAuthConfiguration]
  }
  @scala.inline
  implicit class WebhookAuthConfigurationOps[Self <: WebhookAuthConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowedIPRange(value: WebhookAuthConfigurationAllowedIPRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowedIPRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedIPRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowedIPRange")(js.undefined)
        ret
    }
    @scala.inline
    def withSecretToken(value: WebhookAuthConfigurationSecretToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecretToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecretToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecretToken")(js.undefined)
        ret
    }
  }
  
}

