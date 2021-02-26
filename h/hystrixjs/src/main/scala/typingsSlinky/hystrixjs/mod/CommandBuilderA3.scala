package typingsSlinky.hystrixjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommandBuilderA3[R, T, U, V] extends StObject {
  
  def build(): CommandA3[R, T, U, V] = js.native
  
  def circuitBreakerErrorThresholdPercentage(value: Double): CommandBuilderA3[R, T, U, V] = js.native
  
  def circuitBreakerForceClosed(value: Boolean): CommandBuilderA3[R, T, U, V] = js.native
  
  def circuitBreakerForceOpened(value: Boolean): CommandBuilderA3[R, T, U, V] = js.native
  
  def circuitBreakerRequestVolumeThreshold(value: Double): CommandBuilderA3[R, T, U, V] = js.native
  
  def circuitBreakerSleepWindowInMilliseconds(value: Double): CommandBuilderA3[R, T, U, V] = js.native
  
  def context(value: js.Any): CommandBuilderA3[R, T, U, V] = js.native
  
  def errorHandler(value: js.Function1[/* error */ js.Any, Boolean]): CommandBuilderA3[R, T, U, V] = js.native
  
  def fallbackTo(value: js.Function2[/* error */ js.Error, /* args */ js.Tuple3[T, U, V], js.Thenable[R]]): CommandBuilderA3[R, T, U, V] = js.native
  
  def percentileWindowLength(value: Double): CommandBuilderA3[R, T, U, V] = js.native
  
  def percentileWindowNumberOfBuckets(value: Double): CommandBuilderA3[R, T, U, V] = js.native
  
  def requestVolumeRejectionThreshold(value: Double): CommandBuilderA3[R, T, U, V] = js.native
  
  def run(value: js.Function3[/* t */ T, /* u */ U, /* v */ V, js.Thenable[R]]): CommandBuilderA3[R, T, U, V] = js.native
  
  def statisticalWindowLength(value: Double): CommandBuilderA3[R, T, U, V] = js.native
  
  def statisticalWindowNumberOfBuckets(value: Double): CommandBuilderA3[R, T, U, V] = js.native
  
  def timeout(value: Double): CommandBuilderA3[R, T, U, V] = js.native
}
object CommandBuilderA3 {
  
  @scala.inline
  def apply[R, T, U, V](
    build: () => CommandA3[R, T, U, V],
    circuitBreakerErrorThresholdPercentage: Double => CommandBuilderA3[R, T, U, V],
    circuitBreakerForceClosed: Boolean => CommandBuilderA3[R, T, U, V],
    circuitBreakerForceOpened: Boolean => CommandBuilderA3[R, T, U, V],
    circuitBreakerRequestVolumeThreshold: Double => CommandBuilderA3[R, T, U, V],
    circuitBreakerSleepWindowInMilliseconds: Double => CommandBuilderA3[R, T, U, V],
    context: js.Any => CommandBuilderA3[R, T, U, V],
    errorHandler: js.Function1[/* error */ js.Any, Boolean] => CommandBuilderA3[R, T, U, V],
    fallbackTo: js.Function2[/* error */ js.Error, /* args */ js.Tuple3[T, U, V], js.Thenable[R]] => CommandBuilderA3[R, T, U, V],
    percentileWindowLength: Double => CommandBuilderA3[R, T, U, V],
    percentileWindowNumberOfBuckets: Double => CommandBuilderA3[R, T, U, V],
    requestVolumeRejectionThreshold: Double => CommandBuilderA3[R, T, U, V],
    run: js.Function3[/* t */ T, /* u */ U, /* v */ V, js.Thenable[R]] => CommandBuilderA3[R, T, U, V],
    statisticalWindowLength: Double => CommandBuilderA3[R, T, U, V],
    statisticalWindowNumberOfBuckets: Double => CommandBuilderA3[R, T, U, V],
    timeout: Double => CommandBuilderA3[R, T, U, V]
  ): CommandBuilderA3[R, T, U, V] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), circuitBreakerErrorThresholdPercentage = js.Any.fromFunction1(circuitBreakerErrorThresholdPercentage), circuitBreakerForceClosed = js.Any.fromFunction1(circuitBreakerForceClosed), circuitBreakerForceOpened = js.Any.fromFunction1(circuitBreakerForceOpened), circuitBreakerRequestVolumeThreshold = js.Any.fromFunction1(circuitBreakerRequestVolumeThreshold), circuitBreakerSleepWindowInMilliseconds = js.Any.fromFunction1(circuitBreakerSleepWindowInMilliseconds), context = js.Any.fromFunction1(context), errorHandler = js.Any.fromFunction1(errorHandler), fallbackTo = js.Any.fromFunction1(fallbackTo), percentileWindowLength = js.Any.fromFunction1(percentileWindowLength), percentileWindowNumberOfBuckets = js.Any.fromFunction1(percentileWindowNumberOfBuckets), requestVolumeRejectionThreshold = js.Any.fromFunction1(requestVolumeRejectionThreshold), run = js.Any.fromFunction1(run), statisticalWindowLength = js.Any.fromFunction1(statisticalWindowLength), statisticalWindowNumberOfBuckets = js.Any.fromFunction1(statisticalWindowNumberOfBuckets), timeout = js.Any.fromFunction1(timeout))
    __obj.asInstanceOf[CommandBuilderA3[R, T, U, V]]
  }
  
  @scala.inline
  implicit class CommandBuilderA3MutableBuilder[Self <: CommandBuilderA3[_, _, _, _], R, T, U, V] (val x: Self with (CommandBuilderA3[R, T, U, V])) extends AnyVal {
    
    @scala.inline
    def setBuild(value: () => CommandA3[R, T, U, V]): Self = StObject.set(x, "build", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCircuitBreakerErrorThresholdPercentage(value: Double => CommandBuilderA3[R, T, U, V]): Self = StObject.set(x, "circuitBreakerErrorThresholdPercentage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCircuitBreakerForceClosed(value: Boolean => CommandBuilderA3[R, T, U, V]): Self = StObject.set(x, "circuitBreakerForceClosed", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCircuitBreakerForceOpened(value: Boolean => CommandBuilderA3[R, T, U, V]): Self = StObject.set(x, "circuitBreakerForceOpened", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCircuitBreakerRequestVolumeThreshold(value: Double => CommandBuilderA3[R, T, U, V]): Self = StObject.set(x, "circuitBreakerRequestVolumeThreshold", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCircuitBreakerSleepWindowInMilliseconds(value: Double => CommandBuilderA3[R, T, U, V]): Self = StObject.set(x, "circuitBreakerSleepWindowInMilliseconds", js.Any.fromFunction1(value))
    
    @scala.inline
    def setContext(value: js.Any => CommandBuilderA3[R, T, U, V]): Self = StObject.set(x, "context", js.Any.fromFunction1(value))
    
    @scala.inline
    def setErrorHandler(value: js.Function1[/* error */ js.Any, Boolean] => CommandBuilderA3[R, T, U, V]): Self = StObject.set(x, "errorHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFallbackTo(
      value: js.Function2[/* error */ js.Error, /* args */ js.Tuple3[T, U, V], js.Thenable[R]] => CommandBuilderA3[R, T, U, V]
    ): Self = StObject.set(x, "fallbackTo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPercentileWindowLength(value: Double => CommandBuilderA3[R, T, U, V]): Self = StObject.set(x, "percentileWindowLength", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPercentileWindowNumberOfBuckets(value: Double => CommandBuilderA3[R, T, U, V]): Self = StObject.set(x, "percentileWindowNumberOfBuckets", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRequestVolumeRejectionThreshold(value: Double => CommandBuilderA3[R, T, U, V]): Self = StObject.set(x, "requestVolumeRejectionThreshold", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRun(
      value: js.Function3[/* t */ T, /* u */ U, /* v */ V, js.Thenable[R]] => CommandBuilderA3[R, T, U, V]
    ): Self = StObject.set(x, "run", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStatisticalWindowLength(value: Double => CommandBuilderA3[R, T, U, V]): Self = StObject.set(x, "statisticalWindowLength", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStatisticalWindowNumberOfBuckets(value: Double => CommandBuilderA3[R, T, U, V]): Self = StObject.set(x, "statisticalWindowNumberOfBuckets", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTimeout(value: Double => CommandBuilderA3[R, T, U, V]): Self = StObject.set(x, "timeout", js.Any.fromFunction1(value))
  }
}
