package typingsSlinky.node.perfHooksMod

import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventLoopDelayMonitor extends js.Object {
  /**
    * The number of times the event loop delay exceeded the maximum 1 hour eventloop delay threshold.
    */
  val exceeds: Double = js.native
  /**
    * The maximum recorded event loop delay.
    */
  val max: Double = js.native
  /**
    * The mean of the recorded event loop delays.
    */
  val mean: Double = js.native
  /**
    * The minimum recorded event loop delay.
    */
  val min: Double = js.native
  /**
    * A `Map` object detailing the accumulated percentile distribution.
    */
  val percentiles: Map[Double, Double] = js.native
  /**
    * The standard deviation of the recorded event loop delays.
    */
  val stddev: Double = js.native
  /**
    * Disables the event loop delay sample timer. Returns `true` if the timer was stopped, `false` if it was already stopped.
    */
  def disable(): Boolean = js.native
  /**
    * Enables the event loop delay sample timer. Returns `true` if the timer was started, `false` if it was already started.
    */
  def enable(): Boolean = js.native
  /**
    * Returns the value at the given percentile.
    * @param percentile A percentile value between 1 and 100.
    */
  def percentile(percentile: Double): Double = js.native
  /**
    * Resets the collected histogram data.
    */
  def reset(): Unit = js.native
}

object EventLoopDelayMonitor {
  @scala.inline
  def apply(
    disable: () => Boolean,
    enable: () => Boolean,
    exceeds: Double,
    max: Double,
    mean: Double,
    min: Double,
    percentile: Double => Double,
    percentiles: Map[Double, Double],
    reset: () => Unit,
    stddev: Double
  ): EventLoopDelayMonitor = {
    val __obj = js.Dynamic.literal(disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), exceeds = exceeds.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], mean = mean.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], percentile = js.Any.fromFunction1(percentile), percentiles = percentiles.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), stddev = stddev.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventLoopDelayMonitor]
  }
  @scala.inline
  implicit class EventLoopDelayMonitorOps[Self <: EventLoopDelayMonitor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisable(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEnable(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withExceeds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exceeds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMean(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mean")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPercentile(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percentile")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPercentiles(value: Map[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percentiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReset(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStddev(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stddev")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

