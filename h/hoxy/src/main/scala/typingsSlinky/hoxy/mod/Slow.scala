package typingsSlinky.hoxy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Slow extends js.Object {
  /**
    * Imposes a single rate-limiting bottleneck (in bytes per second) on all downloads
    */
  var down: Double = js.native
  /**
    * Imposes a single rate-limiting bottleneck (in bytes per second) on all throughput
    */
  var latency: Double = js.native
  /**
    * Imposes a delay (in milliseconds) between all requests and responses
    */
  var rate: Double = js.native
  /**
    * Imposes a single rate-limiting bottleneck (in bytes per second) on all uploads
    */
  var up: Double = js.native
}

object Slow {
  @scala.inline
  def apply(down: Double, latency: Double, rate: Double, up: Double): Slow = {
    val __obj = js.Dynamic.literal(down = down.asInstanceOf[js.Any], latency = latency.asInstanceOf[js.Any], rate = rate.asInstanceOf[js.Any], up = up.asInstanceOf[js.Any])
    __obj.asInstanceOf[Slow]
  }
  @scala.inline
  implicit class SlowOps[Self <: Slow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDown(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("down")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLatency(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("up")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

