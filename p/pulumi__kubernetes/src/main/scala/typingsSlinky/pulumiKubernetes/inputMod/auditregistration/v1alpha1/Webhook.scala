package typingsSlinky.pulumiKubernetes.inputMod.auditregistration.v1alpha1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Webhook holds the configuration of the webhook
  */
@js.native
trait Webhook extends js.Object {
  /**
    * ClientConfig holds the connection parameters for the webhook required
    */
  var clientConfig: Input[WebhookClientConfig] = js.native
  /**
    * Throttle holds the options for throttling the webhook
    */
  var throttle: js.UndefOr[Input[WebhookThrottleConfig]] = js.native
}

object Webhook {
  @scala.inline
  def apply(clientConfig: Input[WebhookClientConfig]): Webhook = {
    val __obj = js.Dynamic.literal(clientConfig = clientConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[Webhook]
  }
  @scala.inline
  implicit class WebhookOps[Self <: Webhook] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientConfig(value: Input[WebhookClientConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThrottle(value: Input[WebhookThrottleConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throttle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThrottle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throttle")(js.undefined)
        ret
    }
  }
  
}

