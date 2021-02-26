package typingsSlinky.backoff

import org.scalablytyped.runtime.Instantiable3
import typingsSlinky.backoff.backoffStrings.abort
import typingsSlinky.backoff.backoffStrings.call
import typingsSlinky.backoff.backoffStrings.callback
import typingsSlinky.backoff.backoffStrings.fail
import typingsSlinky.backoff.backoffStrings.ready
import typingsSlinky.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("backoff", "Backoff")
  @js.native
  class Backoff protected () extends EventEmitter {
    /**
      * Constructs a new backoff object from a specific backoff strategy. The backoff
      * strategy must implement the `BackoffStrategy`interface defined bellow.
      *
      * @param strategy: the backoff strategy to use
      */
    def this(strategy: BackoffStrategy) = this()
    
    /**
      * Emitted when a backoff operation is started. Signals to the client how long
      * the next backoff delay will be.
      * @param number: number of backoffs since last reset, starting at 0
      * @param delay: backoff delay in milliseconds
      * @param err: optional error parameter passed to `backoff.backoff([err])`
      */
    @JSName("addListener")
    def addListener_backoff(
      event: typingsSlinky.backoff.backoffStrings.backoff,
      listener: js.Function3[/* number */ Double, /* delay */ Double, /* error */ js.UndefOr[js.Any], Unit]
    ): this.type = js.native
    /**
      * Emitted when the maximum number of backoffs is reached. This event will only
      * be emitted if the client has set a limit on the number of backoffs by calling
      * `backoff.failAfter(numberOfBackoffs)`. The backoff instance is automatically
      * reset after this event is emitted.
      *
      * @param err: optional error parameter passed to `backoff.backoff([err])`
      */
    @JSName("addListener")
    def addListener_fail(event: fail, listener: js.Function1[/* error */ js.UndefOr[js.Any], Unit]): this.type = js.native
    /**
      * Emitted when a backoff operation is done. Signals that the failing operation
      * should be retried.
      *
      * @param number: number of backoffs since last reset, starting at 0
      * @param delay: backoff delay in milliseconds
      */
    @JSName("addListener")
    def addListener_ready(event: ready, listener: js.Function2[/* number */ Double, /* delay */ Double, Unit]): this.type = js.native
    
    /**
      * Starts a backoff operation. If provided, the error parameter will be emitted
      * as the last argument of the `backoff` and `fail` events to let the listeners
      * know why the backoff operation was attempted.
      *
      * An error will be thrown if a backoff operation is already in progress.
      *
      * In practice, this method should be called after a failed attempt to perform a
      * sensitive operation (connecting to a database, downloading a resource over the
      * network, etc.).
      */
    def backoff(): Unit = js.native
    def backoff(error: js.Any): Unit = js.native
    
    @JSName("emit")
    def emit_backoff(event: typingsSlinky.backoff.backoffStrings.backoff, number: Double, delay: Double): Boolean = js.native
    @JSName("emit")
    def emit_backoff(event: typingsSlinky.backoff.backoffStrings.backoff, number: Double, delay: Double, error: js.Any): Boolean = js.native
    @JSName("emit")
    def emit_fail(event: fail): Boolean = js.native
    @JSName("emit")
    def emit_fail(event: fail, error: js.Any): Boolean = js.native
    @JSName("emit")
    def emit_ready(event: ready, number: Double, delay: Double): Boolean = js.native
    
    /**
      * Sets a limit on the maximum number of backoffs that can be performed before
      * a fail event gets emitted and the backoff instance is reset. By default, there
      * is no limit on the number of backoffs that can be performed.
      *
      * @param numberOfBackoffs: maximum number of backoffs before the fail event gets
      * emitted, must be greater than 0
      */
    def failAfter(numberOfBackoffs: Double): Unit = js.native
    
    @JSName("listenerCount")
    def listenerCount_backoff(`type`: typingsSlinky.backoff.backoffStrings.backoff): Double = js.native
    @JSName("listenerCount")
    def listenerCount_fail(`type`: fail): Double = js.native
    @JSName("listenerCount")
    def listenerCount_ready(`type`: ready): Double = js.native
    
    @JSName("listeners")
    def listeners_backoff(event: typingsSlinky.backoff.backoffStrings.backoff): js.Array[
        js.Function3[/* number */ Double, /* delay */ Double, /* error */ js.UndefOr[_], Unit]
      ] = js.native
    @JSName("listeners")
    def listeners_fail(event: fail): js.Array[js.Function1[/* error */ js.UndefOr[_], Unit]] = js.native
    @JSName("listeners")
    def listeners_ready(event: ready): js.Array[js.Function2[/* number */ Double, /* delay */ Double, Unit]] = js.native
    
    @JSName("on")
    def on_backoff(
      event: typingsSlinky.backoff.backoffStrings.backoff,
      listener: js.Function3[/* number */ Double, /* delay */ Double, /* error */ js.UndefOr[js.Any], Unit]
    ): this.type = js.native
    @JSName("on")
    def on_fail(event: fail, listener: js.Function1[/* error */ js.UndefOr[js.Any], Unit]): this.type = js.native
    @JSName("on")
    def on_ready(event: ready, listener: js.Function2[/* number */ Double, /* delay */ Double, Unit]): this.type = js.native
    
    @JSName("once")
    def once_backoff(
      event: typingsSlinky.backoff.backoffStrings.backoff,
      listener: js.Function3[/* number */ Double, /* delay */ Double, /* error */ js.UndefOr[js.Any], Unit]
    ): this.type = js.native
    @JSName("once")
    def once_fail(event: fail, listener: js.Function1[/* error */ js.UndefOr[js.Any], Unit]): this.type = js.native
    @JSName("once")
    def once_ready(event: ready, listener: js.Function2[/* number */ Double, /* delay */ Double, Unit]): this.type = js.native
    
    @JSName("prependListener")
    def prependListener_backoff(
      event: typingsSlinky.backoff.backoffStrings.backoff,
      listener: js.Function3[/* number */ Double, /* delay */ Double, /* error */ js.UndefOr[js.Any], Unit]
    ): this.type = js.native
    @JSName("prependListener")
    def prependListener_fail(event: fail, listener: js.Function1[/* error */ js.UndefOr[js.Any], Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_ready(event: ready, listener: js.Function2[/* number */ Double, /* delay */ Double, Unit]): this.type = js.native
    
    @JSName("prependOnceListener")
    def prependOnceListener_backoff(
      event: typingsSlinky.backoff.backoffStrings.backoff,
      listener: js.Function3[/* number */ Double, /* delay */ Double, /* error */ js.UndefOr[js.Any], Unit]
    ): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_fail(event: fail, listener: js.Function1[/* error */ js.UndefOr[js.Any], Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_ready(event: ready, listener: js.Function2[/* number */ Double, /* delay */ Double, Unit]): this.type = js.native
    
    @JSName("removeAllListeners")
    def removeAllListeners_backoff(event: typingsSlinky.backoff.backoffStrings.backoff): this.type = js.native
    @JSName("removeAllListeners")
    def removeAllListeners_fail(event: fail): this.type = js.native
    @JSName("removeAllListeners")
    def removeAllListeners_ready(event: ready): this.type = js.native
    
    @JSName("removeListener")
    def removeListener_backoff(
      event: typingsSlinky.backoff.backoffStrings.backoff,
      listener: js.Function3[/* number */ Double, /* delay */ Double, /* error */ js.UndefOr[js.Any], Unit]
    ): this.type = js.native
    @JSName("removeListener")
    def removeListener_fail(event: fail, listener: js.Function1[/* error */ js.UndefOr[js.Any], Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_ready(event: ready, listener: js.Function2[/* number */ Double, /* delay */ Double, Unit]): this.type = js.native
    
    /**
      * Resets the backoff delay to the initial backoff delay and stop any backoff
      * operation in progress. After reset, a backoff instance can and should be
      * reused.
      *
      * In practice, this method should be called after having successfully completed
      * the sensitive operation guarded by the backoff instance or if the client code
      * request to stop any reconnection attempt.
      */
    def reset(): Unit = js.native
  }
  
  @JSImport("backoff", "BackoffStrategy")
  @js.native
  /**
    * The options are the following.
    *
    * @param options.randomisationFactor: defaults to 0, must be between 0 and 1
    * @param options.initialDelay: defaults to 100 ms
    * @param options.maxDelay: defaults to 10000 ms
    */
  abstract class BackoffStrategy () extends StObject {
    def this(options: Options) = this()
    
    def getInitialDelay(): Double = js.native
    
    def getMaxDelay(): Double = js.native
    
    /**
      * Computes and returns the next backoff delay.
      */
    def next(): Double = js.native
    
    /* protected */ def next_(): Double = js.native
    
    /**
      * Resets the backoff delay to its initial value.
      */
    def reset(): Unit = js.native
    
    /* protected */ def reset_(): Unit = js.native
  }
  
  @JSImport("backoff", "ExponentialStrategy")
  @js.native
  /**
    * The options are the following.
    *
    * @param options.randomisationFactor: defaults to 0, must be between 0 and 1
    * @param options.initialDelay: defaults to 100 ms
    * @param options.maxDelay: defaults to 10000 ms
    * @param options.factor: defaults to 2, must be greater than 1
    */
  class ExponentialStrategy () extends BackoffStrategy {
    def this(options: ExponentialOptions) = this()
  }
  
  @JSImport("backoff", "FibonacciStrategy")
  @js.native
  /**
    * The options are the following.
    *
    * @param options.randomisationFactor: defaults to 0, must be between 0 and 1
    * @param options.initialDelay: defaults to 100 ms
    * @param options.maxDelay: defaults to 10000 ms
    */
  class FibonacciStrategy () extends BackoffStrategy {
    def this(options: Options) = this()
  }
  
  @js.native
  trait FunctionCall[T] extends EventEmitter {
    
    /**
      * Aborts the call and causes the completion callback to be invoked with an abort
      * error if the call was pending or running; does nothing otherwise. This method
      * can safely be called multiple times.
      */
    def abort(): Unit = js.native
    
    /**
      * Emitted when a call is aborted.
      */
    @JSName("addListener")
    def addListener_abort(event: abort, listener: js.Function0[Unit]): this.type = js.native
    /**
      * Emitted each time a backoff operation is started.
      *
      * @param number: backoff number, starts at 0
      * @param delay: backoff delay in milliseconds
      * @param err: the error that triggered the backoff operation
      */
    @JSName("addListener")
    def addListener_backoff(
      event: typingsSlinky.backoff.backoffStrings.backoff,
      listener: js.Function3[/* number */ Double, /* delay */ Double, /* error */ js.UndefOr[js.Any], Unit]
    ): this.type = js.native
    /**
      * Emitted each time the wrapped function is called.
      * @param args: wrapped function's arguments
      */
    @JSName("addListener")
    def addListener_call(event: call, listener: js.Function1[/* args */ T, Unit]): this.type = js.native
    
    @JSName("emit")
    def emit_abort(event: abort): Boolean = js.native
    @JSName("emit")
    def emit_backoff(event: typingsSlinky.backoff.backoffStrings.backoff, number: Double, delay: Double): Boolean = js.native
    @JSName("emit")
    def emit_backoff(event: typingsSlinky.backoff.backoffStrings.backoff, number: Double, delay: Double, error: js.Any): Boolean = js.native
    @JSName("emit")
    def emit_call(event: call, args: T): Boolean = js.native
    
    /**
      * Sets the maximum number of backoffs before the call is aborted. By default,
      * there is no limit on the number of backoffs that can be performed.
      *
      * This method should be called before `call.start()` otherwise an exception will
      * be thrown.
      *
      * @param maxNumberOfBackoffs: maximum number of backoffs before the call is aborted
      */
    def failAfter(maxNumberOfBackoffs: Double): this.type = js.native
    
    /**
      * Returns the number of times the wrapped function call was retried. For a
      * wrapped function that succeeded immediately, this would return 0. This
      * method can be called at any point in time during the call life cycle, i.e.
      * before, during and after the wrapped function invocation.
      */
    def getNumRetries(): Double = js.native
    
    /**
      * Returns whether the call is aborted.
      */
    def isAborted(): Boolean = js.native
    
    /**
      * Returns whether the call is completed.
      */
    def isCompleted(): Boolean = js.native
    
    /**
      * Returns whether the call is pending, i.e. hasn't been started.
      */
    def isPending(): Boolean = js.native
    
    /**
      * Returns whether the call is in progress.
      */
    def isRunning(): Boolean = js.native
    
    @JSName("listenerCount")
    def listenerCount_abort(`type`: abort): Double = js.native
    @JSName("listenerCount")
    def listenerCount_backoff(`type`: typingsSlinky.backoff.backoffStrings.backoff): Double = js.native
    @JSName("listenerCount")
    def listenerCount_call(`type`: call): Double = js.native
    @JSName("listenerCount")
    def listenerCount_callback(`type`: callback): Double = js.native
    
    @JSName("listeners")
    def listeners_abort(event: abort): js.Array[js.Function0[Unit]] = js.native
    @JSName("listeners")
    def listeners_backoff(event: typingsSlinky.backoff.backoffStrings.backoff): js.Array[
        js.Function3[/* number */ Double, /* delay */ Double, /* error */ js.UndefOr[_], Unit]
      ] = js.native
    @JSName("listeners")
    def listeners_call(event: call): js.Array[js.Function1[/* args */ T, Unit]] = js.native
    
    @JSName("on")
    def on_abort(event: abort, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_backoff(
      event: typingsSlinky.backoff.backoffStrings.backoff,
      listener: js.Function3[/* number */ Double, /* delay */ Double, /* error */ js.UndefOr[js.Any], Unit]
    ): this.type = js.native
    @JSName("on")
    def on_call(event: call, listener: js.Function1[/* args */ T, Unit]): this.type = js.native
    
    @JSName("once")
    def once_abort(event: abort, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_backoff(
      event: typingsSlinky.backoff.backoffStrings.backoff,
      listener: js.Function3[/* number */ Double, /* delay */ Double, /* error */ js.UndefOr[js.Any], Unit]
    ): this.type = js.native
    @JSName("once")
    def once_call(event: call, listener: js.Function1[/* args */ T, Unit]): this.type = js.native
    
    @JSName("prependListener")
    def prependListener_abort(event: abort, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_backoff(
      event: typingsSlinky.backoff.backoffStrings.backoff,
      listener: js.Function3[/* number */ Double, /* delay */ Double, /* error */ js.UndefOr[js.Any], Unit]
    ): this.type = js.native
    @JSName("prependListener")
    def prependListener_call(event: call, listener: js.Function1[/* args */ T, Unit]): this.type = js.native
    
    @JSName("prependOnceListener")
    def prependOnceListener_abort(event: abort, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_backoff(
      event: typingsSlinky.backoff.backoffStrings.backoff,
      listener: js.Function3[/* number */ Double, /* delay */ Double, /* error */ js.UndefOr[js.Any], Unit]
    ): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_call(event: call, listener: js.Function1[/* args */ T, Unit]): this.type = js.native
    
    @JSName("removeAllListeners")
    def removeAllListeners_abort(event: abort): this.type = js.native
    @JSName("removeAllListeners")
    def removeAllListeners_backoff(event: typingsSlinky.backoff.backoffStrings.backoff): this.type = js.native
    @JSName("removeAllListeners")
    def removeAllListeners_call(event: call): this.type = js.native
    @JSName("removeAllListeners")
    def removeAllListeners_callback(event: callback): this.type = js.native
    
    @JSName("removeListener")
    def removeListener_abort(event: abort, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_backoff(
      event: typingsSlinky.backoff.backoffStrings.backoff,
      listener: js.Function3[/* number */ Double, /* delay */ Double, /* error */ js.UndefOr[js.Any], Unit]
    ): this.type = js.native
    @JSName("removeListener")
    def removeListener_call(event: call, listener: js.Function1[/* args */ T, Unit]): this.type = js.native
    
    /**
      * Sets the predicate which will be invoked to determine whether a given error
      * should be retried or not, e.g. a network error would be retriable while a type
      * error would stop the function call. By default, all errors are considered to be
      * retriable.
      *
      * This method should be called before `call.start()` otherwise an exception will
      * be thrown.
      *
      * @param predicate: a function which takes in as its argument the error returned
      * by the wrapped function and determines whether it is retriable.
      */
    def retryIf(predicate: js.Function1[/* error */ js.Any, Boolean]): this.type = js.native
    
    /**
      * Sets the backoff strategy to use. This method should be called before
      * `call.start()` otherwise an exception will be thrown.
      *
      * @param strategy: strategy instance to use, defaults to `FibonacciStrategy`.
      */
    def setStrategy(strategy: BackoffStrategy): this.type = js.native
    
    /**
      * Initiates the call the wrapped function. This method should only be called
      * once otherwise an exception will be thrown.
      */
    def start(): Unit = js.native
  }
  @JSImport("backoff", "FunctionCall")
  @js.native
  val FunctionCall: FunctionCallConstructor = js.native
  
  @JSImport("backoff", "call")
  @js.native
  def call(wrappedFunction: js.Function1[/* repeated */ js.Any, Unit], args: js.Any*): FunctionCallAny = js.native
  @JSImport("backoff", "call")
  @js.native
  def call[E](
    wrappedFunction: js.Function1[/* cb */ js.Function1[/* err */ E, Unit], Unit],
    callback: js.Function1[/* err */ E, Unit]
  ): TypedFunctionCall[
    js.Array[js.UndefOr[scala.Nothing]], 
    E, 
    js.UndefOr[scala.Nothing], 
    js.UndefOr[scala.Nothing], 
    js.UndefOr[scala.Nothing]
  ] = js.native
  @JSImport("backoff", "call")
  @js.native
  def call[R1, E](
    wrappedFunction: js.Function1[/* cb */ js.Function2[/* err */ E, /* r1 */ R1, Unit], Unit],
    callback: js.Function2[/* error */ E, /* r1 */ R1, Unit]
  ): TypedFunctionCall[
    js.Array[js.UndefOr[scala.Nothing]], 
    E, 
    R1, 
    js.UndefOr[scala.Nothing], 
    js.UndefOr[scala.Nothing]
  ] = js.native
  @JSImport("backoff", "call")
  @js.native
  def call[T1, E](
    wrappedFunction: js.Function2[/* t1 */ T1, /* cb */ js.Function1[/* err */ E, Unit], Unit],
    t1: T1,
    callback: js.Function1[/* err */ E, Unit]
  ): TypedFunctionCall[
    js.Array[T1], 
    E, 
    js.UndefOr[scala.Nothing], 
    js.UndefOr[scala.Nothing], 
    js.UndefOr[scala.Nothing]
  ] = js.native
  @JSImport("backoff", "call")
  @js.native
  def call[R1, R2, E](
    wrappedFunction: js.Function1[/* cb */ js.Function3[/* err */ E, /* r1 */ R1, /* r2 */ R2, Unit], Unit],
    callback: js.Function3[/* error */ E, /* r1 */ R1, /* r2 */ R2, Unit]
  ): TypedFunctionCall[js.Array[js.UndefOr[scala.Nothing]], E, R1, R2, js.UndefOr[scala.Nothing]] = js.native
  @JSImport("backoff", "call")
  @js.native
  def call[T1, R1, E](
    wrappedFunction: js.Function2[/* t1 */ T1, /* cb */ js.Function2[/* err */ E, /* r1 */ R1, Unit], Unit],
    t1: T1,
    callback: js.Function2[/* error */ E, /* r1 */ R1, Unit]
  ): TypedFunctionCall[js.Array[T1], E, R1, js.UndefOr[scala.Nothing], js.UndefOr[scala.Nothing]] = js.native
  @JSImport("backoff", "call")
  @js.native
  def call[T1, T2, E](
    wrappedFunction: js.Function3[/* t1 */ T1, /* t2 */ T2, /* cb */ js.Function1[/* err */ E, Unit], Unit],
    t1: T1,
    t2: T2,
    callback: js.Function1[/* err */ E, Unit]
  ): TypedFunctionCall[
    js.Tuple2[T1, T2], 
    E, 
    js.UndefOr[scala.Nothing], 
    js.UndefOr[scala.Nothing], 
    js.UndefOr[scala.Nothing]
  ] = js.native
  @JSImport("backoff", "call")
  @js.native
  def call[R1, R2, R3, E](
    wrappedFunction: js.Function1[
      /* cb */ js.Function4[/* err */ E, /* r1 */ R1, /* r2 */ R2, /* r3 */ R3, Unit], 
      Unit
    ],
    callback: js.Function4[/* error */ E, /* r1 */ R1, /* r2 */ R2, /* r3 */ R3, Unit]
  ): TypedFunctionCall[js.Array[js.UndefOr[scala.Nothing]], E, R1, R2, R3] = js.native
  @JSImport("backoff", "call")
  @js.native
  def call[T1, R1, R2, E](
    wrappedFunction: js.Function2[
      /* t1 */ T1, 
      /* cb */ js.Function3[/* err */ E, /* r1 */ R1, /* r2 */ R2, Unit], 
      Unit
    ],
    t1: T1,
    callback: js.Function3[/* error */ E, /* r1 */ R1, /* r2 */ R2, Unit]
  ): TypedFunctionCall[js.Array[T1], E, R1, R2, js.UndefOr[scala.Nothing]] = js.native
  @JSImport("backoff", "call")
  @js.native
  def call[T1, T2, R1, E](
    wrappedFunction: js.Function3[/* t1 */ T1, /* t2 */ T2, /* cb */ js.Function2[/* err */ E, /* r1 */ R1, Unit], Unit],
    t1: T1,
    t2: T2,
    callback: js.Function2[/* error */ E, /* r1 */ R1, Unit]
  ): TypedFunctionCall[js.Tuple2[T1, T2], E, R1, js.UndefOr[scala.Nothing], js.UndefOr[scala.Nothing]] = js.native
  @JSImport("backoff", "call")
  @js.native
  def call[T1, T2, T3, E](
    wrappedFunction: js.Function4[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* cb */ js.Function1[/* err */ E, Unit], Unit],
    t1: T1,
    t2: T2,
    t3: T3,
    callback: js.Function1[/* err */ E, Unit]
  ): TypedFunctionCall[
    js.Tuple3[T1, T2, T3], 
    E, 
    js.UndefOr[scala.Nothing], 
    js.UndefOr[scala.Nothing], 
    js.UndefOr[scala.Nothing]
  ] = js.native
  @JSImport("backoff", "call")
  @js.native
  def call[T1, R1, R2, R3, E](
    wrappedFunction: js.Function2[
      /* t1 */ T1, 
      /* cb */ js.Function4[/* err */ E, /* r1 */ R1, /* r2 */ R2, /* r3 */ R3, Unit], 
      Unit
    ],
    t1: T1,
    callback: js.Function4[/* error */ E, /* r1 */ R1, /* r2 */ R2, /* r3 */ R3, Unit]
  ): TypedFunctionCall[js.Array[T1], E, R1, R2, R3] = js.native
  @JSImport("backoff", "call")
  @js.native
  def call[T1, T2, R1, R2, E](
    wrappedFunction: js.Function3[
      /* t1 */ T1, 
      /* t2 */ T2, 
      /* cb */ js.Function3[/* err */ E, /* r1 */ R1, /* r2 */ R2, Unit], 
      Unit
    ],
    t1: T1,
    t2: T2,
    callback: js.Function3[/* error */ E, /* r1 */ R1, /* r2 */ R2, Unit]
  ): TypedFunctionCall[js.Tuple2[T1, T2], E, R1, R2, js.UndefOr[scala.Nothing]] = js.native
  @JSImport("backoff", "call")
  @js.native
  def call[T1, T2, T3, R1, E](
    wrappedFunction: js.Function4[
      /* t1 */ T1, 
      /* t2 */ T2, 
      /* t3 */ T3, 
      /* cb */ js.Function2[/* err */ E, /* r1 */ R1, Unit], 
      Unit
    ],
    t1: T1,
    t2: T2,
    t3: T3,
    callback: js.Function2[/* error */ E, /* r1 */ R1, Unit]
  ): TypedFunctionCall[js.Tuple3[T1, T2, T3], E, R1, js.UndefOr[scala.Nothing], js.UndefOr[scala.Nothing]] = js.native
  @JSImport("backoff", "call")
  @js.native
  def call[T1, T2, R1, R2, R3, E](
    wrappedFunction: js.Function3[
      /* t1 */ T1, 
      /* t2 */ T2, 
      /* cb */ js.Function4[/* err */ E, /* r1 */ R1, /* r2 */ R2, /* r3 */ R3, Unit], 
      Unit
    ],
    t1: T1,
    t2: T2,
    callback: js.Function4[/* error */ E, /* r1 */ R1, /* r2 */ R2, /* r3 */ R3, Unit]
  ): TypedFunctionCall[js.Tuple2[T1, T2], E, R1, R2, R3] = js.native
  @JSImport("backoff", "call")
  @js.native
  def call[T1, T2, T3, R1, R2, E](
    wrappedFunction: js.Function4[
      /* t1 */ T1, 
      /* t2 */ T2, 
      /* t3 */ T3, 
      /* cb */ js.Function3[/* err */ E, /* r1 */ R1, /* r2 */ R2, Unit], 
      Unit
    ],
    t1: T1,
    t2: T2,
    t3: T3,
    callback: js.Function3[/* error */ E, /* r1 */ R1, /* r2 */ R2, Unit]
  ): TypedFunctionCall[js.Tuple3[T1, T2, T3], E, R1, R2, js.UndefOr[scala.Nothing]] = js.native
  @JSImport("backoff", "call")
  @js.native
  def call[T1, T2, T3, R1, R2, R3, E](
    wrappedFunction: js.Function4[
      /* t1 */ T1, 
      /* t2 */ T2, 
      /* t3 */ T3, 
      /* cb */ js.Function4[/* err */ E, /* r1 */ R1, /* r2 */ R2, /* r3 */ R3, Unit], 
      Unit
    ],
    t1: T1,
    t2: T2,
    t3: T3,
    callback: js.Function4[/* error */ E, /* r1 */ R1, /* r2 */ R2, /* r3 */ R3, Unit]
  ): TypedFunctionCall[js.Tuple3[T1, T2, T3], E, R1, R2, R3] = js.native
  
  @JSImport("backoff", "exponential")
  @js.native
  def exponential(): Backoff = js.native
  @JSImport("backoff", "exponential")
  @js.native
  def exponential(options: ExponentialOptions): Backoff = js.native
  
  @JSImport("backoff", "fibonacci")
  @js.native
  def fibonacci(): Backoff = js.native
  @JSImport("backoff", "fibonacci")
  @js.native
  def fibonacci(options: Options): Backoff = js.native
  
  @js.native
  trait ExponentialOptions extends Options {
    
    var factor: js.UndefOr[Double] = js.native
  }
  object ExponentialOptions {
    
    @scala.inline
    def apply(): ExponentialOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExponentialOptions]
    }
    
    @scala.inline
    implicit class ExponentialOptionsMutableBuilder[Self <: ExponentialOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFactor(value: Double): Self = StObject.set(x, "factor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFactorUndefined: Self = StObject.set(x, "factor", js.undefined)
    }
  }
  
  type FunctionCallAny = typingsSlinky.backoff.mod.FunctionCall[js.Array[_]] with FunctionCallArgsAny
  
  @js.native
  trait FunctionCallArgs[E, R1, R2, R3] extends StObject {
    
    /**
      * Emitted each time the wrapped function invokes its callback
      * @param results: wrapped function's return values
      */
    @JSName("addListener")
    def addListener_callback(event: callback, listener: js.Function1[/* results */ js.Tuple4[E, R1, R2, R3], Unit]): this.type = js.native
    
    @JSName("emit")
    def emit_callback(event: callback, results: js.Tuple4[E, R1, R2, R3]): Boolean = js.native
    
    /**
      * Returns an array containing the last arguments passed to the completion callback
      * of the wrapped function. For example, to get the error code returned by the last
      * call, one would do the following.
      *
      * ``` js
      * var results = call.getLastResult();
      * // The error code is the first parameter of the callback.
      * var error = results[0];
      * ```
      *
      * Note that if the call was aborted, it will contain the abort error and not the
      * last error returned by the wrapped function.
      */
    def getLastResult(): js.Tuple4[E, R1, R2, R3] = js.native
    
    @JSName("listeners")
    def listeners_callback(event: callback): js.Array[js.Function1[/* results */ js.Tuple4[E, R1, R2, R3], Unit]] = js.native
    
    @JSName("on")
    def on_callback(event: callback, listener: js.Function1[/* results */ js.Tuple4[E, R1, R2, R3], Unit]): this.type = js.native
    
    @JSName("once")
    def once_callback(event: callback, listener: js.Function1[/* results */ js.Tuple4[E, R1, R2, R3], Unit]): this.type = js.native
    
    @JSName("prependListener")
    def prependListener_callback(event: callback, listener: js.Function1[/* results */ js.Tuple4[E, R1, R2, R3], Unit]): this.type = js.native
    
    @JSName("prependOnceListener")
    def prependOnceListener_callback(event: callback, listener: js.Function1[/* results */ js.Tuple4[E, R1, R2, R3], Unit]): this.type = js.native
    
    @JSName("removeListener")
    def removeListener_callback(event: callback, listener: js.Function1[/* results */ js.Tuple4[E, R1, R2, R3], Unit]): this.type = js.native
  }
  object FunctionCallArgs {
    
    @scala.inline
    def apply[E, R1, R2, R3](
      addListener: (callback, js.Function1[/* results */ js.Tuple4[E, R1, R2, R3], Unit]) => FunctionCallArgs[E, R1, R2, R3],
      emit: (callback, js.Tuple4[E, R1, R2, R3]) => Boolean,
      getLastResult: () => js.Tuple4[E, R1, R2, R3],
      listeners: callback => js.Array[js.Function1[/* results */ js.Tuple4[E, R1, R2, R3], Unit]],
      on: (callback, js.Function1[/* results */ js.Tuple4[E, R1, R2, R3], Unit]) => FunctionCallArgs[E, R1, R2, R3],
      once: (callback, js.Function1[/* results */ js.Tuple4[E, R1, R2, R3], Unit]) => FunctionCallArgs[E, R1, R2, R3],
      prependListener: (callback, js.Function1[/* results */ js.Tuple4[E, R1, R2, R3], Unit]) => FunctionCallArgs[E, R1, R2, R3],
      prependOnceListener: (callback, js.Function1[/* results */ js.Tuple4[E, R1, R2, R3], Unit]) => FunctionCallArgs[E, R1, R2, R3],
      removeListener: (callback, js.Function1[/* results */ js.Tuple4[E, R1, R2, R3], Unit]) => FunctionCallArgs[E, R1, R2, R3]
    ): FunctionCallArgs[E, R1, R2, R3] = {
      val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener), emit = js.Any.fromFunction2(emit), getLastResult = js.Any.fromFunction0(getLastResult), listeners = js.Any.fromFunction1(listeners), on = js.Any.fromFunction2(on), once = js.Any.fromFunction2(once), prependListener = js.Any.fromFunction2(prependListener), prependOnceListener = js.Any.fromFunction2(prependOnceListener), removeListener = js.Any.fromFunction2(removeListener))
      __obj.asInstanceOf[FunctionCallArgs[E, R1, R2, R3]]
    }
    
    @scala.inline
    implicit class FunctionCallArgsMutableBuilder[Self <: FunctionCallArgs[_, _, _, _], E, R1, R2, R3] (val x: Self with (FunctionCallArgs[E, R1, R2, R3])) extends AnyVal {
      
      @scala.inline
      def setAddListener(
        value: (callback, js.Function1[/* results */ js.Tuple4[E, R1, R2, R3], Unit]) => FunctionCallArgs[E, R1, R2, R3]
      ): Self = StObject.set(x, "addListener", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEmit(value: (callback, js.Tuple4[E, R1, R2, R3]) => Boolean): Self = StObject.set(x, "emit", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetLastResult(value: () => js.Tuple4[E, R1, R2, R3]): Self = StObject.set(x, "getLastResult", js.Any.fromFunction0(value))
      
      @scala.inline
      def setListeners(value: callback => js.Array[js.Function1[/* results */ js.Tuple4[E, R1, R2, R3], Unit]]): Self = StObject.set(x, "listeners", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOn(
        value: (callback, js.Function1[/* results */ js.Tuple4[E, R1, R2, R3], Unit]) => FunctionCallArgs[E, R1, R2, R3]
      ): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnce(
        value: (callback, js.Function1[/* results */ js.Tuple4[E, R1, R2, R3], Unit]) => FunctionCallArgs[E, R1, R2, R3]
      ): Self = StObject.set(x, "once", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPrependListener(
        value: (callback, js.Function1[/* results */ js.Tuple4[E, R1, R2, R3], Unit]) => FunctionCallArgs[E, R1, R2, R3]
      ): Self = StObject.set(x, "prependListener", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPrependOnceListener(
        value: (callback, js.Function1[/* results */ js.Tuple4[E, R1, R2, R3], Unit]) => FunctionCallArgs[E, R1, R2, R3]
      ): Self = StObject.set(x, "prependOnceListener", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRemoveListener(
        value: (callback, js.Function1[/* results */ js.Tuple4[E, R1, R2, R3], Unit]) => FunctionCallArgs[E, R1, R2, R3]
      ): Self = StObject.set(x, "removeListener", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait FunctionCallArgsAny extends StObject {
    
    /**
      * Emitted each time the wrapped function invokes its callback
      * @param results: wrapped function's return values
      */
    @JSName("addListener")
    def addListener_callback(event: callback, listener: js.Function1[/* results */ js.Array[_], Unit]): this.type = js.native
    
    @JSName("emit")
    def emit_callback(event: callback, results: js.Array[_]): Boolean = js.native
    
    /**
      * Returns an array containing the last arguments passed to the completion callback
      * of the wrapped function. For example, to get the error code returned by the last
      * call, one would do the following.
      *
      * ``` js
      * var results = call.getLastResult();
      * // The error code is the first parameter of the callback.
      * var error = results[0];
      * ```
      *
      * Note that if the call was aborted, it will contain the abort error and not the
      * last error returned by the wrapped function.
      */
    def getLastResult(): js.Array[_] = js.native
    
    @JSName("listeners")
    def listeners_callback(event: callback): js.Array[js.Function1[/* results */ js.Array[_], Unit]] = js.native
    
    @JSName("on")
    def on_callback(event: callback, listener: js.Function1[/* results */ js.Array[_], Unit]): this.type = js.native
    
    @JSName("once")
    def once_callback(event: callback, listener: js.Function1[/* results */ js.Array[_], Unit]): this.type = js.native
    
    @JSName("prependListener")
    def prependListener_callback(event: callback, listener: js.Function1[/* results */ js.Array[_], Unit]): this.type = js.native
    
    @JSName("prependOnceListener")
    def prependOnceListener_callback(event: callback, listener: js.Function1[/* results */ js.Array[_], Unit]): this.type = js.native
    
    @JSName("removeListener")
    def removeListener_callback(event: callback, listener: js.Function1[/* results */ js.Array[_], Unit]): this.type = js.native
  }
  object FunctionCallArgsAny {
    
    @scala.inline
    def apply(
      addListener: (callback, js.Function1[/* results */ js.Array[_], Unit]) => FunctionCallArgsAny,
      emit: (callback, js.Array[_]) => Boolean,
      getLastResult: () => js.Array[_],
      listeners: callback => js.Array[js.Function1[/* results */ js.Array[_], Unit]],
      on: (callback, js.Function1[/* results */ js.Array[_], Unit]) => FunctionCallArgsAny,
      once: (callback, js.Function1[/* results */ js.Array[_], Unit]) => FunctionCallArgsAny,
      prependListener: (callback, js.Function1[/* results */ js.Array[_], Unit]) => FunctionCallArgsAny,
      prependOnceListener: (callback, js.Function1[/* results */ js.Array[_], Unit]) => FunctionCallArgsAny,
      removeListener: (callback, js.Function1[/* results */ js.Array[_], Unit]) => FunctionCallArgsAny
    ): FunctionCallArgsAny = {
      val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener), emit = js.Any.fromFunction2(emit), getLastResult = js.Any.fromFunction0(getLastResult), listeners = js.Any.fromFunction1(listeners), on = js.Any.fromFunction2(on), once = js.Any.fromFunction2(once), prependListener = js.Any.fromFunction2(prependListener), prependOnceListener = js.Any.fromFunction2(prependOnceListener), removeListener = js.Any.fromFunction2(removeListener))
      __obj.asInstanceOf[FunctionCallArgsAny]
    }
    
    @scala.inline
    implicit class FunctionCallArgsAnyMutableBuilder[Self <: FunctionCallArgsAny] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddListener(value: (callback, js.Function1[/* results */ js.Array[_], Unit]) => FunctionCallArgsAny): Self = StObject.set(x, "addListener", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEmit(value: (callback, js.Array[_]) => Boolean): Self = StObject.set(x, "emit", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetLastResult(value: () => js.Array[_]): Self = StObject.set(x, "getLastResult", js.Any.fromFunction0(value))
      
      @scala.inline
      def setListeners(value: callback => js.Array[js.Function1[/* results */ js.Array[_], Unit]]): Self = StObject.set(x, "listeners", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOn(value: (callback, js.Function1[/* results */ js.Array[_], Unit]) => FunctionCallArgsAny): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnce(value: (callback, js.Function1[/* results */ js.Array[_], Unit]) => FunctionCallArgsAny): Self = StObject.set(x, "once", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPrependListener(value: (callback, js.Function1[/* results */ js.Array[_], Unit]) => FunctionCallArgsAny): Self = StObject.set(x, "prependListener", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPrependOnceListener(value: (callback, js.Function1[/* results */ js.Array[_], Unit]) => FunctionCallArgsAny): Self = StObject.set(x, "prependOnceListener", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRemoveListener(value: (callback, js.Function1[/* results */ js.Array[_], Unit]) => FunctionCallArgsAny): Self = StObject.set(x, "removeListener", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait FunctionCallConstructor
    extends Instantiable3[
          (/* wrappedFunction */ js.Function1[
            (/* repeated */ js.Any) | (/* cb */ js.Function1[/* err */ js.Object, Unit]) | (/* cb */ js.Function2[/* err */ js.Object, /* r1 */ js.Object, Unit]) | (/* cb */ js.Function3[/* err */ js.Object, /* r1 */ js.Object, /* r2 */ js.Object, Unit]) | (/* cb */ js.Function4[/* err */ js.Object, /* r1 */ js.Object, /* r2 */ js.Object, /* r3 */ js.Object, Unit]), 
            Unit
          ]) | (/* wrappedFunction */ js.Function2[
            /* t1 */ js.Object, 
            (/* cb */ js.Function1[/* err */ js.Object, Unit]) | (/* cb */ js.Function2[/* err */ js.Object, /* r1 */ js.Object, Unit]) | (/* cb */ js.Function3[/* err */ js.Object, /* r1 */ js.Object, /* r2 */ js.Object, Unit]) | (/* cb */ js.Function4[/* err */ js.Object, /* r1 */ js.Object, /* r2 */ js.Object, /* r3 */ js.Object, Unit]), 
            Unit
          ]) | (/* wrappedFunction */ js.Function3[
            /* t1 */ js.Object, 
            /* t2 */ js.Object, 
            (/* cb */ js.Function1[/* err */ js.Object, Unit]) | (/* cb */ js.Function2[/* err */ js.Object, /* r1 */ js.Object, Unit]) | (/* cb */ js.Function3[/* err */ js.Object, /* r1 */ js.Object, /* r2 */ js.Object, Unit]) | (/* cb */ js.Function4[/* err */ js.Object, /* r1 */ js.Object, /* r2 */ js.Object, /* r3 */ js.Object, Unit]), 
            Unit
          ]) | (/* wrappedFunction */ js.Function4[
            /* t1 */ js.Object, 
            /* t2 */ js.Object, 
            /* t3 */ js.Object, 
            (/* cb */ js.Function1[/* err */ js.Object, Unit]) | (/* cb */ js.Function2[/* err */ js.Object, /* r1 */ js.Object, Unit]) | (/* cb */ js.Function3[/* err */ js.Object, /* r1 */ js.Object, /* r2 */ js.Object, Unit]) | (/* cb */ js.Function4[/* err */ js.Object, /* r1 */ js.Object, /* r2 */ js.Object, /* r3 */ js.Object, Unit]), 
            Unit
          ]), 
          (/* args */ js.Array[js.UndefOr[js.Any | js.Object]]) | (/* args */ js.Tuple2[js.Object, js.Object]) | (/* args */ js.Tuple3[js.Object, js.Object, js.Object]), 
          (/* callback */ js.Function1[/* err */ js.Object, Unit]) | (/* callback */ js.Function2[
            (/* error */ js.Any) | (/* error */ js.Object), 
            (/* repeated */ js.Any) | (/* r1 */ js.Object), 
            Unit
          ]) | (/* callback */ js.Function3[/* error */ js.Object, /* r1 */ js.Object, /* r2 */ js.Object, Unit]) | (/* callback */ js.Function4[/* error */ js.Object, /* r1 */ js.Object, /* r2 */ js.Object, /* r3 */ js.Object, Unit]), 
          FunctionCallAny | (TypedFunctionCall[
            js.Array[js.UndefOr[js.Object]] | (js.Tuple2[js.Object, js.Object]) | (js.Tuple3[js.Object, js.Object, js.Object]), 
            js.Object, 
            js.UndefOr[js.Object], 
            js.UndefOr[js.Object], 
            js.UndefOr[js.Object]
          ])
        ]
  
  @js.native
  trait Options extends StObject {
    
    var initialDelay: js.UndefOr[Double] = js.native
    
    var maxDelay: js.UndefOr[Double] = js.native
    
    var randomisationFactor: js.UndefOr[Double] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInitialDelay(value: Double): Self = StObject.set(x, "initialDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialDelayUndefined: Self = StObject.set(x, "initialDelay", js.undefined)
      
      @scala.inline
      def setMaxDelay(value: Double): Self = StObject.set(x, "maxDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxDelayUndefined: Self = StObject.set(x, "maxDelay", js.undefined)
      
      @scala.inline
      def setRandomisationFactor(value: Double): Self = StObject.set(x, "randomisationFactor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRandomisationFactorUndefined: Self = StObject.set(x, "randomisationFactor", js.undefined)
    }
  }
  
  type TypedFunctionCall[T, E, R1, R2, R3] = typingsSlinky.backoff.mod.FunctionCall[T] with (FunctionCallArgs[E, R1, R2, R3])
}
