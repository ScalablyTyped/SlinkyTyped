package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RollingAverage extends js.Object {
  var _m2: Double = js.native
  var _pos: Double = js.native
  var _sampleCount: Double = js.native
  var _samples: js.Array[Double] = js.native
  /**
    * Current average
    */
  var average: Double = js.native
  /**
    * Current variance
    */
  var variance: Double = js.native
  /**
    * Wraps a value around the sample range boundaries
    * @param i Position in sample range, for example if the sample length is 5, and i is -3, then 2 will be returned.
    * @return Wrapped position in sample range
    */
  /* protected */ def _wrapPosition(i: Double): Double = js.native
  /**
    * Adds a sample to the sample set
    * @param v The sample value
    */
  def add(v: Double): Unit = js.native
  /**
    * Returns previously added values or null if outside of history or outside the sliding window domain
    * @param i Index in history. For example, pass 0 for the most recent value and 1 for the value before that
    * @return Value previously recorded with add() or null if outside of range
    */
  def history(i: Double): Double = js.native
  /**
    * Returns true if enough samples have been taken to completely fill the sliding window
    * @return true if sample-set saturated
    */
  def isSaturated(): Boolean = js.native
  /**
    * Resets the rolling average (equivalent to 0 samples taken so far)
    */
  def reset(): Unit = js.native
}

object RollingAverage {
  @scala.inline
  def apply(
    _m2: Double,
    _pos: Double,
    _sampleCount: Double,
    _samples: js.Array[Double],
    _wrapPosition: Double => Double,
    add: Double => Unit,
    average: Double,
    history: Double => Double,
    isSaturated: () => Boolean,
    reset: () => Unit,
    variance: Double
  ): RollingAverage = {
    val __obj = js.Dynamic.literal(_m2 = _m2.asInstanceOf[js.Any], _pos = _pos.asInstanceOf[js.Any], _sampleCount = _sampleCount.asInstanceOf[js.Any], _samples = _samples.asInstanceOf[js.Any], _wrapPosition = js.Any.fromFunction1(_wrapPosition), add = js.Any.fromFunction1(add), average = average.asInstanceOf[js.Any], history = js.Any.fromFunction1(history), isSaturated = js.Any.fromFunction0(isSaturated), reset = js.Any.fromFunction0(reset), variance = variance.asInstanceOf[js.Any])
    __obj.asInstanceOf[RollingAverage]
  }
  @scala.inline
  implicit class RollingAverageOps[Self <: RollingAverage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_m2(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_m2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_pos(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_pos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_sampleCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_sampleCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_samples(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_samples")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_wrapPosition(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_wrapPosition")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAdd(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAverage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("average")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHistory(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("history")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsSaturated(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSaturated")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReset(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withVariance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variance")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

