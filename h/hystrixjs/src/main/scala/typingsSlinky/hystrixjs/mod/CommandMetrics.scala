package typingsSlinky.hystrixjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommandMetrics extends StObject {
  
  def addExecutionTime(value: Double): Unit = js.native
  
  def decrementExecutionCount(): Unit = js.native
  
  def getCurrentExecutionCount(): Double = js.native
  
  def getExecutionTime(percentile: js.Any): Double = js.native
  
  def getHealthCounts(): HealthCounts = js.native
  
  def getRollingCount(`type`: js.Any): Double = js.native
  
  def incrementExecutionCount(): Unit = js.native
  
  def markFailure(): Unit = js.native
  
  def markRejected(): Unit = js.native
  
  def markShortCircuited(): Unit = js.native
  
  def markSuccess(): Unit = js.native
  
  def markTimeout(): Unit = js.native
  
  def reset(): Unit = js.native
}
object CommandMetrics {
  
  @scala.inline
  def apply(
    addExecutionTime: Double => Unit,
    decrementExecutionCount: () => Unit,
    getCurrentExecutionCount: () => Double,
    getExecutionTime: js.Any => Double,
    getHealthCounts: () => HealthCounts,
    getRollingCount: js.Any => Double,
    incrementExecutionCount: () => Unit,
    markFailure: () => Unit,
    markRejected: () => Unit,
    markShortCircuited: () => Unit,
    markSuccess: () => Unit,
    markTimeout: () => Unit,
    reset: () => Unit
  ): CommandMetrics = {
    val __obj = js.Dynamic.literal(addExecutionTime = js.Any.fromFunction1(addExecutionTime), decrementExecutionCount = js.Any.fromFunction0(decrementExecutionCount), getCurrentExecutionCount = js.Any.fromFunction0(getCurrentExecutionCount), getExecutionTime = js.Any.fromFunction1(getExecutionTime), getHealthCounts = js.Any.fromFunction0(getHealthCounts), getRollingCount = js.Any.fromFunction1(getRollingCount), incrementExecutionCount = js.Any.fromFunction0(incrementExecutionCount), markFailure = js.Any.fromFunction0(markFailure), markRejected = js.Any.fromFunction0(markRejected), markShortCircuited = js.Any.fromFunction0(markShortCircuited), markSuccess = js.Any.fromFunction0(markSuccess), markTimeout = js.Any.fromFunction0(markTimeout), reset = js.Any.fromFunction0(reset))
    __obj.asInstanceOf[CommandMetrics]
  }
  
  @scala.inline
  implicit class CommandMetricsMutableBuilder[Self <: CommandMetrics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddExecutionTime(value: Double => Unit): Self = StObject.set(x, "addExecutionTime", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDecrementExecutionCount(value: () => Unit): Self = StObject.set(x, "decrementExecutionCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCurrentExecutionCount(value: () => Double): Self = StObject.set(x, "getCurrentExecutionCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetExecutionTime(value: js.Any => Double): Self = StObject.set(x, "getExecutionTime", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetHealthCounts(value: () => HealthCounts): Self = StObject.set(x, "getHealthCounts", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRollingCount(value: js.Any => Double): Self = StObject.set(x, "getRollingCount", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIncrementExecutionCount(value: () => Unit): Self = StObject.set(x, "incrementExecutionCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMarkFailure(value: () => Unit): Self = StObject.set(x, "markFailure", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMarkRejected(value: () => Unit): Self = StObject.set(x, "markRejected", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMarkShortCircuited(value: () => Unit): Self = StObject.set(x, "markShortCircuited", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMarkSuccess(value: () => Unit): Self = StObject.set(x, "markSuccess", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMarkTimeout(value: () => Unit): Self = StObject.set(x, "markTimeout", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
  }
}
