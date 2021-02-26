package typingsSlinky.retry

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("retry", "createTimeout")
  @js.native
  def createTimeout(attempt: Double): Double = js.native
  @JSImport("retry", "createTimeout")
  @js.native
  def createTimeout(attempt: Double, options: CreateTimeoutOptions): Double = js.native
  
  @JSImport("retry", "operation")
  @js.native
  def operation(): RetryOperation = js.native
  @JSImport("retry", "operation")
  @js.native
  def operation(options: OperationOptions): RetryOperation = js.native
  
  @JSImport("retry", "timeouts")
  @js.native
  def timeouts(): js.Array[Double] = js.native
  @JSImport("retry", "timeouts")
  @js.native
  def timeouts(options: TimeoutsOptions): js.Array[Double] = js.native
  
  @JSImport("retry", "wrap")
  @js.native
  def wrap(`object`: js.Object): Unit = js.native
  @JSImport("retry", "wrap")
  @js.native
  def wrap(`object`: js.Object, methods: js.Array[String]): Unit = js.native
  @JSImport("retry", "wrap")
  @js.native
  def wrap(`object`: js.Object, options: js.UndefOr[scala.Nothing], methods: js.Array[String]): Unit = js.native
  @JSImport("retry", "wrap")
  @js.native
  def wrap(`object`: js.Object, options: OperationOptions): Unit = js.native
  @JSImport("retry", "wrap")
  @js.native
  def wrap(`object`: js.Object, options: OperationOptions, methods: js.Array[String]): Unit = js.native
  
  @js.native
  trait AttemptTimeoutOptions extends StObject {
    
    /**
      * Callback to execute when the operation takes longer than the timeout.
      */
    var callback: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * A timeout in milliseconds.
      */
    var timeout: js.UndefOr[Double] = js.native
  }
  object AttemptTimeoutOptions {
    
    @scala.inline
    def apply(): AttemptTimeoutOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AttemptTimeoutOptions]
    }
    
    @scala.inline
    implicit class AttemptTimeoutOptionsMutableBuilder[Self <: AttemptTimeoutOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallback(value: () => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  @js.native
  trait CreateTimeoutOptions extends StObject {
    
    /**
      * The exponential factor to use.
      * @default 2
      */
    var factor: js.UndefOr[Double] = js.native
    
    /**
      * The maximum number of milliseconds between two retries.
      * @default Infinity
      */
    var maxTimeout: js.UndefOr[Double] = js.native
    
    /**
      * The number of milliseconds before starting the first retry.
      * @default 1000
      */
    var minTimeout: js.UndefOr[Double] = js.native
    
    /**
      * Randomizes the timeouts by multiplying a factor between 1-2.
      * @default false
      */
    var randomize: js.UndefOr[Boolean] = js.native
  }
  object CreateTimeoutOptions {
    
    @scala.inline
    def apply(): CreateTimeoutOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateTimeoutOptions]
    }
    
    @scala.inline
    implicit class CreateTimeoutOptionsMutableBuilder[Self <: CreateTimeoutOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFactor(value: Double): Self = StObject.set(x, "factor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFactorUndefined: Self = StObject.set(x, "factor", js.undefined)
      
      @scala.inline
      def setMaxTimeout(value: Double): Self = StObject.set(x, "maxTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxTimeoutUndefined: Self = StObject.set(x, "maxTimeout", js.undefined)
      
      @scala.inline
      def setMinTimeout(value: Double): Self = StObject.set(x, "minTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinTimeoutUndefined: Self = StObject.set(x, "minTimeout", js.undefined)
      
      @scala.inline
      def setRandomize(value: Boolean): Self = StObject.set(x, "randomize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRandomizeUndefined: Self = StObject.set(x, "randomize", js.undefined)
    }
  }
  
  @js.native
  trait OperationOptions extends TimeoutsOptions {
    
    /**
      * Whether to retry forever.
      * @default false
      */
    var forever: js.UndefOr[Boolean] = js.native
    
    /**
      * The maximum time (in milliseconds) that the retried operation is allowed to run.
      * @default Infinity
      */
    var maxRetryTime: js.UndefOr[Double] = js.native
    
    /**
      * Whether to [unref](https://nodejs.org/api/timers.html#timers_unref) the setTimeout's.
      * @default false
      */
    var unref: js.UndefOr[Boolean] = js.native
  }
  object OperationOptions {
    
    @scala.inline
    def apply(): OperationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OperationOptions]
    }
    
    @scala.inline
    implicit class OperationOptionsMutableBuilder[Self <: OperationOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setForever(value: Boolean): Self = StObject.set(x, "forever", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForeverUndefined: Self = StObject.set(x, "forever", js.undefined)
      
      @scala.inline
      def setMaxRetryTime(value: Double): Self = StObject.set(x, "maxRetryTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxRetryTimeUndefined: Self = StObject.set(x, "maxRetryTime", js.undefined)
      
      @scala.inline
      def setUnref(value: Boolean): Self = StObject.set(x, "unref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnrefUndefined: Self = StObject.set(x, "unref", js.undefined)
    }
  }
  
  @js.native
  trait RetryOperation extends StObject {
    
    /**
      * Defines the function that is to be retried and executes it for the first time right away.
      *
      * @param fn The function that is to be retried. `currentAttempt` represents the number of attempts
      * callback has been executed so far.
      * @param [timeoutOps.timeout] A timeout in milliseconds.
      * @param [timeoutOps.callback] Callback to execute when the operation takes longer than the timeout.
      */
    def attempt(fn: js.Function1[/* currentAttempt */ Double, Unit]): Unit = js.native
    def attempt(fn: js.Function1[/* currentAttempt */ Double, Unit], timeoutOps: AttemptTimeoutOptions): Unit = js.native
    
    /**
      * Returns an int representing the number of attempts it took to call `fn` before it was successful.
      */
    def attempts(): Double = js.native
    
    /**
      * Returns an array of all errors that have been passed to `retryOperation.retry()` so far.
      * The returning array has the errors ordered chronologically based on when they were passed to
      * `retryOperation.retry()`, which means the first passed error is at index zero and the last is at the last index.
      */
    def errors(): js.Array[js.Error] = js.native
    
    /**
      * A reference to the error object that occured most frequently.
      * Errors are compared using the `error.message` property.
      * If multiple error messages occured the same amount of time, the last error object with that message is returned.
      *
      * @return If no errors occured so far the value will be `null`.
      */
    def mainError(): js.Error | Null = js.native
    
    /**
      * Resets the internal state of the operation object, so that you can call `attempt()` again as if
      * this was a new operation object.
      */
    def reset(): Unit = js.native
    
    /**
      * Returns `false` when no `error` value is given, or the maximum amount of retries has been reached.
      * Otherwise it returns `true`, and retries the operation after the timeout for the current attempt number.
      */
    def retry(): Boolean = js.native
    def retry(err: js.Error): Boolean = js.native
    
    /**
      * Stops the operation being retried. Useful for aborting the operation on a fatal error etc.
      */
    def stop(): Unit = js.native
  }
  
  @js.native
  trait TimeoutsOptions extends CreateTimeoutOptions {
    
    /**
      * The maximum amount of times to retry the operation.
      * @default 10
      */
    var retries: js.UndefOr[Double] = js.native
  }
  object TimeoutsOptions {
    
    @scala.inline
    def apply(): TimeoutsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimeoutsOptions]
    }
    
    @scala.inline
    implicit class TimeoutsOptionsMutableBuilder[Self <: TimeoutsOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRetries(value: Double): Self = StObject.set(x, "retries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetriesUndefined: Self = StObject.set(x, "retries", js.undefined)
    }
  }
}
