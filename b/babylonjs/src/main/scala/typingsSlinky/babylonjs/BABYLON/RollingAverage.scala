package typingsSlinky.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RollingAverage extends StObject {
  
  var _m2: Double = js.native
  
  var _pos: Double = js.native
  
  var _sampleCount: Double = js.native
  
  var _samples: js.Array[Double] = js.native
  
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
    * Current average
    */
  var average: Double = js.native
  
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
  
  /**
    * Current variance
    */
  var variance: Double = js.native
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
  implicit class RollingAverageMutableBuilder[Self <: RollingAverage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: Double => Unit): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAverage(value: Double): Self = StObject.set(x, "average", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistory(value: Double => Double): Self = StObject.set(x, "history", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsSaturated(value: () => Boolean): Self = StObject.set(x, "isSaturated", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setVariance(value: Double): Self = StObject.set(x, "variance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_m2(value: Double): Self = StObject.set(x, "_m2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_pos(value: Double): Self = StObject.set(x, "_pos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_sampleCount(value: Double): Self = StObject.set(x, "_sampleCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_samples(value: js.Array[Double]): Self = StObject.set(x, "_samples", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_samplesVarargs(value: Double*): Self = StObject.set(x, "_samples", js.Array(value :_*))
    
    @scala.inline
    def set_wrapPosition(value: Double => Double): Self = StObject.set(x, "_wrapPosition", js.Any.fromFunction1(value))
  }
}
