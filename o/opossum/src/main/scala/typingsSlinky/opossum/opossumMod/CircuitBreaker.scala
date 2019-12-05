package typingsSlinky.opossum.opossumMod

import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.opossum.opossumStrings.cacheHit
import typingsSlinky.opossum.opossumStrings.cacheMiss
import typingsSlinky.opossum.opossumStrings.close
import typingsSlinky.opossum.opossumStrings.failure
import typingsSlinky.opossum.opossumStrings.fallback
import typingsSlinky.opossum.opossumStrings.fire
import typingsSlinky.opossum.opossumStrings.healthCheckFailed
import typingsSlinky.opossum.opossumStrings.open
import typingsSlinky.opossum.opossumStrings.reject
import typingsSlinky.opossum.opossumStrings.semaphoreLocked
import typingsSlinky.opossum.opossumStrings.shutdown
import typingsSlinky.opossum.opossumStrings.success
import typingsSlinky.opossum.opossumStrings.timeout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CircuitBreaker[TI /* <: js.Array[_] */, TR] extends EventEmitter {
  val closed: Boolean = js.native
  val enabled: Boolean = js.native
  val group: String = js.native
  val halfOpen: Boolean = js.native
  val isShutdown: Boolean = js.native
  val name: String = js.native
  val opened: Boolean = js.native
  val pendingClose: Boolean = js.native
  val stats: Stats = js.native
  val status: Status = js.native
  val volumeThreshold: Double = js.native
  val warmUp: Boolean = js.native
  /**
    * Clears the cache of this CircuitBreaker
    */
  def clearCache(): Unit = js.native
  /**
    * Closes the breaker, allowing the action to execute again
    */
  def close(): Unit = js.native
  /**
    * Disables this circuit, causing all calls to the circuit's function to be
    * executed without circuit or fallback protection.
    */
  def disable(): Unit = js.native
  /**
    * Enables this circuit. If the circuit is the disabled state, it will be re-enabled.
    * If not, this is essentially a noop.
    */
  def enable(): Unit = js.native
  /**
    * Provide a fallback function for this CircuitBreaker.
    * This function will be executed when the circuit is fired and fails.
    * It will always be preceded by a `failure` event, and `breaker.fire` returns a rejected Promise.
    */
  def fallback(func: js.Function1[/* repeated */ js.Any, _]): this.type = js.native
  def fallback(func: CircuitBreaker[js.Array[_], _]): this.type = js.native
  /**
    * Execute the action for this circuit.
    * If the action fails or times out, the returned promise will be rejected.
    * If the action succeeds, the promise will resolve with the resolved value from action.
    * If a fallback function was provided, it will be invoked in the event of any failure or timeout.
    */
  def fire(
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type TI is not an array type */ args: TI
  ): js.Promise[TR] = js.native
  /**
    * Provide a health check function to be called periodically.
    * The function should return a Promise. If the promise is rejected the circuit will open.
    * This is in addition to the existing circuit behavior as defined by the
    * `errorThresholdPercentage` option passed to the constructor.
    * For example, if the health check function provided here always returns a resolved promise,
    * the circuit can still trip and open if there are failures exceeding the configured threshold.
    * The health check function is executed within the circuit breaker's execution context,
    * so this within the function is the circuit breaker itself.
    *
    * The interval is the amount of time between calls to the health check function.
    * Default: 5000 (5 seconds)
    */
  def healthCheck(func: js.Function0[js.Promise[Unit]]): Unit = js.native
  def healthCheck(func: js.Function0[js.Promise[Unit]], interval: Double): Unit = js.native
  @JSName("on")
  def on_cacheHit(event: cacheHit, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_cacheMiss(event: cacheMiss, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_failure(
    event: failure,
    listener: js.Function3[/* err */ js.Error, /* latencyMs */ Double, /* args */ TI, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_fallback(event: fallback, listener: js.Function2[/* result */ js.Any, /* err */ js.Error, Unit]): this.type = js.native
  @JSName("on")
  def on_fire(event: fire, listener: js.Function1[/* args */ TI, Unit]): this.type = js.native
  /* tslint:disable:unified-signatures */
  @JSName("on")
  def on_halfOpen(
    event: typingsSlinky.opossum.opossumStrings.halfOpen,
    listener: js.Function1[/* resetTimeout */ Double, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_healthCheckFailed(event: healthCheckFailed, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("on")
  def on_open(event: open, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_reject(event: reject, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("on")
  def on_semaphoreLocked(event: semaphoreLocked, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("on")
  def on_shutdown(event: shutdown, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_success(event: success, listener: js.Function2[/* result */ TR, /* latencyMs */ Double, Unit]): this.type = js.native
  @JSName("on")
  def on_timeout(event: timeout, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  /**
    * Opens the breaker.
    * Each time the breaker is fired while the circuit is opened, a failed Promise is
    * returned, or if any fallback function has been provided, it is invoked.
    */
  def open(): Unit = js.native
  /**
    * Shuts down this circuit breaker.
    * All subsequent calls to the circuit will fail, returning a rejected promise.
    */
  def shutdown(): Unit = js.native
}

