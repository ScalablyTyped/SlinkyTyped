package typingsSlinky.pulumiAws.inputMod.codepipeline

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebhookAuthenticationConfiguration extends js.Object {
  var allowedIpRange: js.UndefOr[Input[String]] = js.native
  var secretToken: js.UndefOr[Input[String]] = js.native
}

object WebhookAuthenticationConfiguration {
  @scala.inline
  def apply(): WebhookAuthenticationConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebhookAuthenticationConfiguration]
  }
  @scala.inline
  implicit class WebhookAuthenticationConfigurationOps[Self <: WebhookAuthenticationConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowedIpRange(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedIpRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedIpRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedIpRange")(js.undefined)
        ret
    }
    @scala.inline
    def withSecretToken(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secretToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecretToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secretToken")(js.undefined)
        ret
    }
  }
  
}

