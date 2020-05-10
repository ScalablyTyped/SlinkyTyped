package typingsSlinky.primus.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Required<primus.primus.ReconnectOpts> */
@js.native
trait ReconnectEventOpts extends js.Object {
  var attempt: Double = js.native
  var backoff: Boolean = js.native
  var duration: Double = js.native
  var factor: Double = js.native
  var max: Double = js.native
  var min: Double = js.native
  var `reconnect timeout`: Double = js.native
  var retries: Double = js.native
  var scheduled: Double = js.native
  var start: Double = js.native
}

object ReconnectEventOpts {
  @scala.inline
  def apply(
    attempt: Double,
    backoff: Boolean,
    duration: Double,
    factor: Double,
    max: Double,
    min: Double,
    `reconnect timeout`: Double,
    retries: Double,
    scheduled: Double,
    start: Double
  ): ReconnectEventOpts = {
    val __obj = js.Dynamic.literal(attempt = attempt.asInstanceOf[js.Any], backoff = backoff.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], factor = factor.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], retries = retries.asInstanceOf[js.Any], scheduled = scheduled.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("reconnect timeout")((`reconnect timeout`).asInstanceOf[js.Any])
    __obj.asInstanceOf[ReconnectEventOpts]
  }
  @scala.inline
  implicit class ReconnectEventOptsOps[Self <: ReconnectEventOpts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttempt(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attempt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackoff(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backoff")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFactor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("factor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withReconnect timeout`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconnect timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRetries(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScheduled(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

