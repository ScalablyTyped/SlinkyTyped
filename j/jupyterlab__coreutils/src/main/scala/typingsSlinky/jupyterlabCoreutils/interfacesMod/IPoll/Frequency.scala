package typingsSlinky.jupyterlabCoreutils.interfacesMod.IPoll

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The polling frequency parameters.
  *
  * #### Notes
  * We implement the "decorrelated jitter" strategy from
  * https://aws.amazon.com/blogs/architecture/exponential-backoff-and-jitter/.
  * Essentially, if consecutive retries are needed, we choose an integer:
  * `sleep = min(max, rand(interval, backoff * sleep))`
  * This ensures that the poll is never less than `interval`, and nicely
  * spreads out retries for consecutive tries. Over time, if (interval < max),
  * the random number will be above `max` about (1 - 1/backoff) of the time
  * (sleeping the `max`), and the rest of the time the sleep will be a random
  * number below `max`, decorrelating our trigger time from other pollers.
  */
@js.native
trait Frequency extends js.Object {
  /**
    * Whether poll frequency backs off (boolean) or the backoff growth rate
    * (float > 1).
    *
    * #### Notes
    * If `true`, the default backoff growth rate is `3`.
    */
  val backoff: Boolean | Double = js.native
  /**
    * The basic polling interval in milliseconds (integer).
    */
  val interval: Double = js.native
  /**
    * The maximum milliseconds (integer) between poll requests.
    */
  val max: Double = js.native
}

object Frequency {
  @scala.inline
  def apply(backoff: Boolean | Double, interval: Double, max: Double): Frequency = {
    val __obj = js.Dynamic.literal(backoff = backoff.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any])
    __obj.asInstanceOf[Frequency]
  }
  @scala.inline
  implicit class FrequencyOps[Self <: Frequency] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackoff(value: Boolean | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backoff")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

