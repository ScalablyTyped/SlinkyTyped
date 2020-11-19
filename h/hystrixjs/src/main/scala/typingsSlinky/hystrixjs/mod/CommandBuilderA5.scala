package typingsSlinky.hystrixjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommandBuilderA5[R, T, U, V, W, X] extends js.Object {
  
  def build(): CommandA5[R, T, U, V, W, X] = js.native
  
  def circuitBreakerErrorThresholdPercentage(value: Double): CommandBuilderA5[R, T, U, V, W, X] = js.native
  
  def circuitBreakerForceClosed(value: Boolean): CommandBuilderA5[R, T, U, V, W, X] = js.native
  
  def circuitBreakerForceOpened(value: Boolean): CommandBuilderA5[R, T, U, V, W, X] = js.native
  
  def circuitBreakerRequestVolumeThreshold(value: Double): CommandBuilderA5[R, T, U, V, W, X] = js.native
  
  def circuitBreakerSleepWindowInMilliseconds(value: Double): CommandBuilderA5[R, T, U, V, W, X] = js.native
  
  def context(value: js.Any): CommandBuilderA5[R, T, U, V, W, X] = js.native
  
  def errorHandler(value: js.Function1[/* error */ js.Any, Boolean]): CommandBuilderA5[R, T, U, V, W, X] = js.native
  
  def fallbackTo(value: js.Function2[/* error */ js.Error, /* args */ js.Tuple5[T, U, V, W, X], js.Thenable[R]]): CommandBuilderA5[R, T, U, V, W, X] = js.native
  
  def percentileWindowLength(value: Double): CommandBuilderA5[R, T, U, V, W, X] = js.native
  
  def percentileWindowNumberOfBuckets(value: Double): CommandBuilderA5[R, T, U, V, W, X] = js.native
  
  def requestVolumeRejectionThreshold(value: Double): CommandBuilderA5[R, T, U, V, W, X] = js.native
  
  def run(value: js.Function5[/* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, js.Thenable[R]]): CommandBuilderA5[R, T, U, V, W, X] = js.native
  
  def statisticalWindowLength(value: Double): CommandBuilderA5[R, T, U, V, W, X] = js.native
  
  def statisticalWindowNumberOfBuckets(value: Double): CommandBuilderA5[R, T, U, V, W, X] = js.native
  
  def timeout(value: Double): CommandBuilderA5[R, T, U, V, W, X] = js.native
}
object CommandBuilderA5 {
  
  @scala.inline
  def apply[R, T, U, V, W, X](
    build: () => CommandA5[R, T, U, V, W, X],
    circuitBreakerErrorThresholdPercentage: Double => CommandBuilderA5[R, T, U, V, W, X],
    circuitBreakerForceClosed: Boolean => CommandBuilderA5[R, T, U, V, W, X],
    circuitBreakerForceOpened: Boolean => CommandBuilderA5[R, T, U, V, W, X],
    circuitBreakerRequestVolumeThreshold: Double => CommandBuilderA5[R, T, U, V, W, X],
    circuitBreakerSleepWindowInMilliseconds: Double => CommandBuilderA5[R, T, U, V, W, X],
    context: js.Any => CommandBuilderA5[R, T, U, V, W, X],
    errorHandler: js.Function1[/* error */ js.Any, Boolean] => CommandBuilderA5[R, T, U, V, W, X],
    fallbackTo: js.Function2[/* error */ js.Error, /* args */ js.Tuple5[T, U, V, W, X], js.Thenable[R]] => CommandBuilderA5[R, T, U, V, W, X],
    percentileWindowLength: Double => CommandBuilderA5[R, T, U, V, W, X],
    percentileWindowNumberOfBuckets: Double => CommandBuilderA5[R, T, U, V, W, X],
    requestVolumeRejectionThreshold: Double => CommandBuilderA5[R, T, U, V, W, X],
    run: js.Function5[/* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, js.Thenable[R]] => CommandBuilderA5[R, T, U, V, W, X],
    statisticalWindowLength: Double => CommandBuilderA5[R, T, U, V, W, X],
    statisticalWindowNumberOfBuckets: Double => CommandBuilderA5[R, T, U, V, W, X],
    timeout: Double => CommandBuilderA5[R, T, U, V, W, X]
  ): CommandBuilderA5[R, T, U, V, W, X] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), circuitBreakerErrorThresholdPercentage = js.Any.fromFunction1(circuitBreakerErrorThresholdPercentage), circuitBreakerForceClosed = js.Any.fromFunction1(circuitBreakerForceClosed), circuitBreakerForceOpened = js.Any.fromFunction1(circuitBreakerForceOpened), circuitBreakerRequestVolumeThreshold = js.Any.fromFunction1(circuitBreakerRequestVolumeThreshold), circuitBreakerSleepWindowInMilliseconds = js.Any.fromFunction1(circuitBreakerSleepWindowInMilliseconds), context = js.Any.fromFunction1(context), errorHandler = js.Any.fromFunction1(errorHandler), fallbackTo = js.Any.fromFunction1(fallbackTo), percentileWindowLength = js.Any.fromFunction1(percentileWindowLength), percentileWindowNumberOfBuckets = js.Any.fromFunction1(percentileWindowNumberOfBuckets), requestVolumeRejectionThreshold = js.Any.fromFunction1(requestVolumeRejectionThreshold), run = js.Any.fromFunction1(run), statisticalWindowLength = js.Any.fromFunction1(statisticalWindowLength), statisticalWindowNumberOfBuckets = js.Any.fromFunction1(statisticalWindowNumberOfBuckets), timeout = js.Any.fromFunction1(timeout))
    __obj.asInstanceOf[CommandBuilderA5[R, T, U, V, W, X]]
  }
  
  @scala.inline
  implicit class CommandBuilderA5Ops[Self <: CommandBuilderA5[_, _, _, _, _, _], R, T, U, V, W, X] (val x: Self with (CommandBuilderA5[R, T, U, V, W, X])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBuild(value: () => CommandA5[R, T, U, V, W, X]): Self = this.set("build", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCircuitBreakerErrorThresholdPercentage(value: Double => CommandBuilderA5[R, T, U, V, W, X]): Self = this.set("circuitBreakerErrorThresholdPercentage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCircuitBreakerForceClosed(value: Boolean => CommandBuilderA5[R, T, U, V, W, X]): Self = this.set("circuitBreakerForceClosed", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCircuitBreakerForceOpened(value: Boolean => CommandBuilderA5[R, T, U, V, W, X]): Self = this.set("circuitBreakerForceOpened", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCircuitBreakerRequestVolumeThreshold(value: Double => CommandBuilderA5[R, T, U, V, W, X]): Self = this.set("circuitBreakerRequestVolumeThreshold", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCircuitBreakerSleepWindowInMilliseconds(value: Double => CommandBuilderA5[R, T, U, V, W, X]): Self = this.set("circuitBreakerSleepWindowInMilliseconds", js.Any.fromFunction1(value))
    
    @scala.inline
    def setContext(value: js.Any => CommandBuilderA5[R, T, U, V, W, X]): Self = this.set("context", js.Any.fromFunction1(value))
    
    @scala.inline
    def setErrorHandler(value: js.Function1[/* error */ js.Any, Boolean] => CommandBuilderA5[R, T, U, V, W, X]): Self = this.set("errorHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFallbackTo(
      value: js.Function2[/* error */ js.Error, /* args */ js.Tuple5[T, U, V, W, X], js.Thenable[R]] => CommandBuilderA5[R, T, U, V, W, X]
    ): Self = this.set("fallbackTo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPercentileWindowLength(value: Double => CommandBuilderA5[R, T, U, V, W, X]): Self = this.set("percentileWindowLength", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPercentileWindowNumberOfBuckets(value: Double => CommandBuilderA5[R, T, U, V, W, X]): Self = this.set("percentileWindowNumberOfBuckets", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRequestVolumeRejectionThreshold(value: Double => CommandBuilderA5[R, T, U, V, W, X]): Self = this.set("requestVolumeRejectionThreshold", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRun(
      value: js.Function5[/* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, js.Thenable[R]] => CommandBuilderA5[R, T, U, V, W, X]
    ): Self = this.set("run", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStatisticalWindowLength(value: Double => CommandBuilderA5[R, T, U, V, W, X]): Self = this.set("statisticalWindowLength", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStatisticalWindowNumberOfBuckets(value: Double => CommandBuilderA5[R, T, U, V, W, X]): Self = this.set("statisticalWindowNumberOfBuckets", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTimeout(value: Double => CommandBuilderA5[R, T, U, V, W, X]): Self = this.set("timeout", js.Any.fromFunction1(value))
  }
}
