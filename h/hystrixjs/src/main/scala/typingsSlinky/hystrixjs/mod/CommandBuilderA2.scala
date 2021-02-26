package typingsSlinky.hystrixjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommandBuilderA2[R, T, U] extends StObject {
  
  def build(): CommandA2[R, T, U] = js.native
  
  def circuitBreakerErrorThresholdPercentage(value: Double): CommandBuilderA2[R, T, U] = js.native
  
  def circuitBreakerForceClosed(value: Boolean): CommandBuilderA2[R, T, U] = js.native
  
  def circuitBreakerForceOpened(value: Boolean): CommandBuilderA2[R, T, U] = js.native
  
  def circuitBreakerRequestVolumeThreshold(value: Double): CommandBuilderA2[R, T, U] = js.native
  
  def circuitBreakerSleepWindowInMilliseconds(value: Double): CommandBuilderA2[R, T, U] = js.native
  
  def context(value: js.Any): CommandBuilderA2[R, T, U] = js.native
  
  def errorHandler(value: js.Function1[/* error */ js.Any, Boolean]): CommandBuilderA2[R, T, U] = js.native
  
  def fallbackTo(value: js.Function2[/* error */ js.Error, /* args */ js.Tuple2[T, U], js.Thenable[R]]): CommandBuilderA2[R, T, U] = js.native
  
  def percentileWindowLength(value: Double): CommandBuilderA2[R, T, U] = js.native
  
  def percentileWindowNumberOfBuckets(value: Double): CommandBuilderA2[R, T, U] = js.native
  
  def requestVolumeRejectionThreshold(value: Double): CommandBuilderA2[R, T, U] = js.native
  
  def run(value: js.Function2[/* t */ T, /* u */ U, js.Thenable[R]]): CommandBuilderA2[R, T, U] = js.native
  
  def statisticalWindowLength(value: Double): CommandBuilderA2[R, T, U] = js.native
  
  def statisticalWindowNumberOfBuckets(value: Double): CommandBuilderA2[R, T, U] = js.native
  
  def timeout(value: Double): CommandBuilderA2[R, T, U] = js.native
}
object CommandBuilderA2 {
  
  @scala.inline
  def apply[R, T, U](
    build: () => CommandA2[R, T, U],
    circuitBreakerErrorThresholdPercentage: Double => CommandBuilderA2[R, T, U],
    circuitBreakerForceClosed: Boolean => CommandBuilderA2[R, T, U],
    circuitBreakerForceOpened: Boolean => CommandBuilderA2[R, T, U],
    circuitBreakerRequestVolumeThreshold: Double => CommandBuilderA2[R, T, U],
    circuitBreakerSleepWindowInMilliseconds: Double => CommandBuilderA2[R, T, U],
    context: js.Any => CommandBuilderA2[R, T, U],
    errorHandler: js.Function1[/* error */ js.Any, Boolean] => CommandBuilderA2[R, T, U],
    fallbackTo: js.Function2[/* error */ js.Error, /* args */ js.Tuple2[T, U], js.Thenable[R]] => CommandBuilderA2[R, T, U],
    percentileWindowLength: Double => CommandBuilderA2[R, T, U],
    percentileWindowNumberOfBuckets: Double => CommandBuilderA2[R, T, U],
    requestVolumeRejectionThreshold: Double => CommandBuilderA2[R, T, U],
    run: js.Function2[/* t */ T, /* u */ U, js.Thenable[R]] => CommandBuilderA2[R, T, U],
    statisticalWindowLength: Double => CommandBuilderA2[R, T, U],
    statisticalWindowNumberOfBuckets: Double => CommandBuilderA2[R, T, U],
    timeout: Double => CommandBuilderA2[R, T, U]
  ): CommandBuilderA2[R, T, U] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), circuitBreakerErrorThresholdPercentage = js.Any.fromFunction1(circuitBreakerErrorThresholdPercentage), circuitBreakerForceClosed = js.Any.fromFunction1(circuitBreakerForceClosed), circuitBreakerForceOpened = js.Any.fromFunction1(circuitBreakerForceOpened), circuitBreakerRequestVolumeThreshold = js.Any.fromFunction1(circuitBreakerRequestVolumeThreshold), circuitBreakerSleepWindowInMilliseconds = js.Any.fromFunction1(circuitBreakerSleepWindowInMilliseconds), context = js.Any.fromFunction1(context), errorHandler = js.Any.fromFunction1(errorHandler), fallbackTo = js.Any.fromFunction1(fallbackTo), percentileWindowLength = js.Any.fromFunction1(percentileWindowLength), percentileWindowNumberOfBuckets = js.Any.fromFunction1(percentileWindowNumberOfBuckets), requestVolumeRejectionThreshold = js.Any.fromFunction1(requestVolumeRejectionThreshold), run = js.Any.fromFunction1(run), statisticalWindowLength = js.Any.fromFunction1(statisticalWindowLength), statisticalWindowNumberOfBuckets = js.Any.fromFunction1(statisticalWindowNumberOfBuckets), timeout = js.Any.fromFunction1(timeout))
    __obj.asInstanceOf[CommandBuilderA2[R, T, U]]
  }
  
  @scala.inline
  implicit class CommandBuilderA2MutableBuilder[Self <: CommandBuilderA2[_, _, _], R, T, U] (val x: Self with (CommandBuilderA2[R, T, U])) extends AnyVal {
    
    @scala.inline
    def setBuild(value: () => CommandA2[R, T, U]): Self = StObject.set(x, "build", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCircuitBreakerErrorThresholdPercentage(value: Double => CommandBuilderA2[R, T, U]): Self = StObject.set(x, "circuitBreakerErrorThresholdPercentage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCircuitBreakerForceClosed(value: Boolean => CommandBuilderA2[R, T, U]): Self = StObject.set(x, "circuitBreakerForceClosed", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCircuitBreakerForceOpened(value: Boolean => CommandBuilderA2[R, T, U]): Self = StObject.set(x, "circuitBreakerForceOpened", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCircuitBreakerRequestVolumeThreshold(value: Double => CommandBuilderA2[R, T, U]): Self = StObject.set(x, "circuitBreakerRequestVolumeThreshold", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCircuitBreakerSleepWindowInMilliseconds(value: Double => CommandBuilderA2[R, T, U]): Self = StObject.set(x, "circuitBreakerSleepWindowInMilliseconds", js.Any.fromFunction1(value))
    
    @scala.inline
    def setContext(value: js.Any => CommandBuilderA2[R, T, U]): Self = StObject.set(x, "context", js.Any.fromFunction1(value))
    
    @scala.inline
    def setErrorHandler(value: js.Function1[/* error */ js.Any, Boolean] => CommandBuilderA2[R, T, U]): Self = StObject.set(x, "errorHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFallbackTo(
      value: js.Function2[/* error */ js.Error, /* args */ js.Tuple2[T, U], js.Thenable[R]] => CommandBuilderA2[R, T, U]
    ): Self = StObject.set(x, "fallbackTo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPercentileWindowLength(value: Double => CommandBuilderA2[R, T, U]): Self = StObject.set(x, "percentileWindowLength", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPercentileWindowNumberOfBuckets(value: Double => CommandBuilderA2[R, T, U]): Self = StObject.set(x, "percentileWindowNumberOfBuckets", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRequestVolumeRejectionThreshold(value: Double => CommandBuilderA2[R, T, U]): Self = StObject.set(x, "requestVolumeRejectionThreshold", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRun(value: js.Function2[/* t */ T, /* u */ U, js.Thenable[R]] => CommandBuilderA2[R, T, U]): Self = StObject.set(x, "run", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStatisticalWindowLength(value: Double => CommandBuilderA2[R, T, U]): Self = StObject.set(x, "statisticalWindowLength", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStatisticalWindowNumberOfBuckets(value: Double => CommandBuilderA2[R, T, U]): Self = StObject.set(x, "statisticalWindowNumberOfBuckets", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTimeout(value: Double => CommandBuilderA2[R, T, U]): Self = StObject.set(x, "timeout", js.Any.fromFunction1(value))
  }
}
