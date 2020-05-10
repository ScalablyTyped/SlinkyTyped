package typingsSlinky.pulumiKubernetes.inputMod.auditregistration.v1alpha1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * WebhookThrottleConfig holds the configuration for throttling events
  */
@js.native
trait WebhookThrottleConfig extends js.Object {
  /**
    * ThrottleBurst is the maximum number of events sent at the same moment default 15 QPS
    */
  var burst: js.UndefOr[Input[Double]] = js.native
  /**
    * ThrottleQPS maximum number of batches per second default 10 QPS
    */
  var qps: js.UndefOr[Input[Double]] = js.native
}

object WebhookThrottleConfig {
  @scala.inline
  def apply(): WebhookThrottleConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebhookThrottleConfig]
  }
  @scala.inline
  implicit class WebhookThrottleConfigOps[Self <: WebhookThrottleConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBurst(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("burst")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBurst: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("burst")(js.undefined)
        ret
    }
    @scala.inline
    def withQps(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qps")(js.undefined)
        ret
    }
  }
  
}

