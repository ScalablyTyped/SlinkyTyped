package typingsSlinky.pulumiKubernetes.outputMod.auditregistration.v1alpha1

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
  val burst: Double = js.native
  /**
    * ThrottleQPS maximum number of batches per second default 10 QPS
    */
  val qps: Double = js.native
}

object WebhookThrottleConfig {
  @scala.inline
  def apply(burst: Double, qps: Double): WebhookThrottleConfig = {
    val __obj = js.Dynamic.literal(burst = burst.asInstanceOf[js.Any], qps = qps.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookThrottleConfig]
  }
  @scala.inline
  implicit class WebhookThrottleConfigOps[Self <: WebhookThrottleConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBurst(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("burst")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQps(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qps")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

