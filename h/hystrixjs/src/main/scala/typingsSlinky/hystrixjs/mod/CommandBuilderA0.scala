package typingsSlinky.hystrixjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommandBuilderA0[R] extends StObject {
  
  def build(): CommandA0[R] = js.native
  
  def circuitBreakerErrorThresholdPercentage(value: Double): CommandBuilderA0[R] = js.native
  
  def circuitBreakerForceClosed(value: Boolean): CommandBuilderA0[R] = js.native
  
  def circuitBreakerForceOpened(value: Boolean): CommandBuilderA0[R] = js.native
  
  def circuitBreakerRequestVolumeThreshold(value: Double): CommandBuilderA0[R] = js.native
  
  def circuitBreakerSleepWindowInMilliseconds(value: Double): CommandBuilderA0[R] = js.native
  
  def context(value: js.Any): CommandBuilderA0[R] = js.native
  
  def errorHandler(value: js.Function1[/* error */ js.Any, Boolean]): CommandBuilderA0[R] = js.native
  
  def fallbackTo(value: js.Function1[/* error */ js.Error, js.Thenable[R]]): CommandBuilderA0[R] = js.native
  
  def percentileWindowLength(value: Double): CommandBuilderA0[R] = js.native
  
  def percentileWindowNumberOfBuckets(value: Double): CommandBuilderA0[R] = js.native
  
  def requestVolumeRejectionThreshold(value: Double): CommandBuilderA0[R] = js.native
  
  def run(value: js.Function0[js.Thenable[R]]): CommandBuilderA0[R] = js.native
  
  def statisticalWindowLength(value: Double): CommandBuilderA0[R] = js.native
  
  def statisticalWindowNumberOfBuckets(value: Double): CommandBuilderA0[R] = js.native
  
  def timeout(value: Double): CommandBuilderA0[R] = js.native
}
object CommandBuilderA0 {
  
  @scala.inline
  def apply[R](
    build: () => CommandA0[R],
    circuitBreakerErrorThresholdPercentage: Double => CommandBuilderA0[R],
    circuitBreakerForceClosed: Boolean => CommandBuilderA0[R],
    circuitBreakerForceOpened: Boolean => CommandBuilderA0[R],
    circuitBreakerRequestVolumeThreshold: Double => CommandBuilderA0[R],
    circuitBreakerSleepWindowInMilliseconds: Double => CommandBuilderA0[R],
    context: js.Any => CommandBuilderA0[R],
    errorHandler: js.Function1[/* error */ js.Any, Boolean] => CommandBuilderA0[R],
    fallbackTo: js.Function1[/* error */ js.Error, js.Thenable[R]] => CommandBuilderA0[R],
    percentileWindowLength: Double => CommandBuilderA0[R],
    percentileWindowNumberOfBuckets: Double => CommandBuilderA0[R],
    requestVolumeRejectionThreshold: Double => CommandBuilderA0[R],
    run: js.Function0[js.Thenable[R]] => CommandBuilderA0[R],
    statisticalWindowLength: Double => CommandBuilderA0[R],
    statisticalWindowNumberOfBuckets: Double => CommandBuilderA0[R],
    timeout: Double => CommandBuilderA0[R]
  ): CommandBuilderA0[R] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), circuitBreakerErrorThresholdPercentage = js.Any.fromFunction1(circuitBreakerErrorThresholdPercentage), circuitBreakerForceClosed = js.Any.fromFunction1(circuitBreakerForceClosed), circuitBreakerForceOpened = js.Any.fromFunction1(circuitBreakerForceOpened), circuitBreakerRequestVolumeThreshold = js.Any.fromFunction1(circuitBreakerRequestVolumeThreshold), circuitBreakerSleepWindowInMilliseconds = js.Any.fromFunction1(circuitBreakerSleepWindowInMilliseconds), context = js.Any.fromFunction1(context), errorHandler = js.Any.fromFunction1(errorHandler), fallbackTo = js.Any.fromFunction1(fallbackTo), percentileWindowLength = js.Any.fromFunction1(percentileWindowLength), percentileWindowNumberOfBuckets = js.Any.fromFunction1(percentileWindowNumberOfBuckets), requestVolumeRejectionThreshold = js.Any.fromFunction1(requestVolumeRejectionThreshold), run = js.Any.fromFunction1(run), statisticalWindowLength = js.Any.fromFunction1(statisticalWindowLength), statisticalWindowNumberOfBuckets = js.Any.fromFunction1(statisticalWindowNumberOfBuckets), timeout = js.Any.fromFunction1(timeout))
    __obj.asInstanceOf[CommandBuilderA0[R]]
  }
  
  @scala.inline
  implicit class CommandBuilderA0MutableBuilder[Self <: CommandBuilderA0[_], R] (val x: Self with CommandBuilderA0[R]) extends AnyVal {
    
    @scala.inline
    def setBuild(value: () => CommandA0[R]): Self = StObject.set(x, "build", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCircuitBreakerErrorThresholdPercentage(value: Double => CommandBuilderA0[R]): Self = StObject.set(x, "circuitBreakerErrorThresholdPercentage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCircuitBreakerForceClosed(value: Boolean => CommandBuilderA0[R]): Self = StObject.set(x, "circuitBreakerForceClosed", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCircuitBreakerForceOpened(value: Boolean => CommandBuilderA0[R]): Self = StObject.set(x, "circuitBreakerForceOpened", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCircuitBreakerRequestVolumeThreshold(value: Double => CommandBuilderA0[R]): Self = StObject.set(x, "circuitBreakerRequestVolumeThreshold", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCircuitBreakerSleepWindowInMilliseconds(value: Double => CommandBuilderA0[R]): Self = StObject.set(x, "circuitBreakerSleepWindowInMilliseconds", js.Any.fromFunction1(value))
    
    @scala.inline
    def setContext(value: js.Any => CommandBuilderA0[R]): Self = StObject.set(x, "context", js.Any.fromFunction1(value))
    
    @scala.inline
    def setErrorHandler(value: js.Function1[/* error */ js.Any, Boolean] => CommandBuilderA0[R]): Self = StObject.set(x, "errorHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFallbackTo(value: js.Function1[/* error */ js.Error, js.Thenable[R]] => CommandBuilderA0[R]): Self = StObject.set(x, "fallbackTo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPercentileWindowLength(value: Double => CommandBuilderA0[R]): Self = StObject.set(x, "percentileWindowLength", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPercentileWindowNumberOfBuckets(value: Double => CommandBuilderA0[R]): Self = StObject.set(x, "percentileWindowNumberOfBuckets", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRequestVolumeRejectionThreshold(value: Double => CommandBuilderA0[R]): Self = StObject.set(x, "requestVolumeRejectionThreshold", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRun(value: js.Function0[js.Thenable[R]] => CommandBuilderA0[R]): Self = StObject.set(x, "run", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStatisticalWindowLength(value: Double => CommandBuilderA0[R]): Self = StObject.set(x, "statisticalWindowLength", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStatisticalWindowNumberOfBuckets(value: Double => CommandBuilderA0[R]): Self = StObject.set(x, "statisticalWindowNumberOfBuckets", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTimeout(value: Double => CommandBuilderA0[R]): Self = StObject.set(x, "timeout", js.Any.fromFunction1(value))
  }
}
