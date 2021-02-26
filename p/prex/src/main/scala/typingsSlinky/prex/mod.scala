package typingsSlinky.prex

import typingsSlinky.esfxCancelable.distMod.Cancelable
import typingsSlinky.prex.cancellationMod.AbortSignalLike
import typingsSlinky.prex.cancellationMod.VSCodeCancellationTokenLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("prex", "AsyncBoundedQueue")
  @js.native
  /**
    * Initializes a new instance of the AsyncProducerConsumerQueue class.
    *
    * @param iterable An optional iterable of values or promises.
    */
  class AsyncBoundedQueue[T] ()
    extends typingsSlinky.prex.boundedQueueMod.AsyncBoundedQueue[T] {
    def this(iterable: js.Iterable[T | js.Thenable[T]]) = this()
  }
  
  @JSImport("prex", "AsyncQueue")
  @js.native
  /**
    * Initializes a new instance of the AsyncQueue class.
    *
    * @param iterable An optional iterable of values or promises.
    */
  class AsyncQueue[T] ()
    extends typingsSlinky.prex.queueMod.AsyncQueue[T] {
    def this(iterable: js.Iterable[T | js.Thenable[T]]) = this()
  }
  
  @JSImport("prex", "AsyncStack")
  @js.native
  /**
    * Initializes a new instance of the AsyncStack class.
    *
    * @param iterable An optional iterable of values or promises.
    */
  class AsyncStack[T] ()
    extends typingsSlinky.prex.stackMod.AsyncStack[T] {
    def this(iterable: js.Iterable[T | js.Thenable[T]]) = this()
  }
  
  @JSImport("prex", "AutoResetEvent")
  @js.native
  /**
    * Initializes a new instance of the AutoResetEvent class.
    *
    * @param initialState A value indicating whether to set the initial state to signaled.
    */
  class AutoResetEvent ()
    extends typingsSlinky.prex.autoreseteventMod.AutoResetEvent {
    def this(initialState: Boolean) = this()
  }
  
  @JSImport("prex", "Barrier")
  @js.native
  class Barrier protected ()
    extends typingsSlinky.prex.barrierMod.Barrier {
    /**
      * Initializes a new instance of the Barrier class.
      *
      * @param participantCount The initial number of participants for the barrier.
      * @param postPhaseAction An action to execute between each phase.
      */
    def this(participantCount: Double) = this()
    def this(
      participantCount: Double,
      postPhaseAction: js.Function1[/* barrier */ typingsSlinky.prex.barrierMod.Barrier, Unit | js.Thenable[Unit]]
    ) = this()
  }
  
  @JSImport("prex", "CancelError")
  @js.native
  class CancelError ()
    extends typingsSlinky.prex.cancellationMod.CancelError {
    def this(message: String) = this()
  }
  
  @JSImport("prex", "CancellationToken")
  @js.native
  class CancellationToken ()
    extends typingsSlinky.prex.cancellationMod.CancellationToken
  /* static members */
  object CancellationToken {
    
    /**
      * Returns a CancellationToken that becomes canceled when **all** of the provided tokens are canceled.
      * @param tokens An iterable of CancellationToken objects.
      */
    @JSImport("prex", "CancellationToken.all")
    @js.native
    def all(tokens: js.Iterable[typingsSlinky.prex.cancellationMod.CancellationToken | Cancelable]): typingsSlinky.prex.cancellationMod.CancellationToken = js.native
    
    /**
      * A token that is already canceled.
      */
    @JSImport("prex", "CancellationToken.canceled")
    @js.native
    val canceled: typingsSlinky.prex.cancellationMod.CancellationToken = js.native
    
    @JSImport("prex", "CancellationToken.from")
    @js.native
    def from(cancelable: Cancelable): typingsSlinky.prex.cancellationMod.CancellationToken = js.native
    @JSImport("prex", "CancellationToken.from")
    @js.native
    def from(cancelable: AbortSignalLike): typingsSlinky.prex.cancellationMod.CancellationToken = js.native
    /**
      * Adapts a CancellationToken-like primitive from a different library.
      */
    @JSImport("prex", "CancellationToken.from")
    @js.native
    def from(cancelable: typingsSlinky.prex.cancellationMod.CancellationToken): typingsSlinky.prex.cancellationMod.CancellationToken = js.native
    @JSImport("prex", "CancellationToken.from")
    @js.native
    def from(cancelable: VSCodeCancellationTokenLike): typingsSlinky.prex.cancellationMod.CancellationToken = js.native
    
    /**
      * A token which will never be canceled.
      */
    @JSImport("prex", "CancellationToken.none")
    @js.native
    val none: typingsSlinky.prex.cancellationMod.CancellationToken = js.native
    
    /**
      * Returns a CancellationToken that becomes canceled when **any** of the provided tokens are canceled.
      * @param tokens An iterable of CancellationToken objects.
      */
    @JSImport("prex", "CancellationToken.race")
    @js.native
    def race(tokens: js.Iterable[typingsSlinky.prex.cancellationMod.CancellationToken | Cancelable]): typingsSlinky.prex.cancellationMod.CancellationToken = js.native
  }
  
  @JSImport("prex", "CancellationTokenCountdown")
  @js.native
  class CancellationTokenCountdown ()
    extends typingsSlinky.prex.cancellationMod.CancellationTokenCountdown {
    def this(iterable: js.Iterable[typingsSlinky.prex.cancellationMod.CancellationToken | Cancelable]) = this()
  }
  
  @JSImport("prex", "CancellationTokenSource")
  @js.native
  /**
    * Initializes a new instance of a CancellationTokenSource.
    *
    * @param linkedTokens An optional iterable of tokens to which to link this source.
    */
  class CancellationTokenSource ()
    extends typingsSlinky.prex.cancellationMod.CancellationTokenSource {
    def this(linkedTokens: js.Iterable[typingsSlinky.prex.cancellationMod.CancellationToken | Cancelable]) = this()
  }
  
  @JSImport("prex", "CountdownEvent")
  @js.native
  class CountdownEvent protected ()
    extends typingsSlinky.prex.countdownMod.CountdownEvent {
    /**
      * Initializes a new instance of the CountdownEvent class.
      *
      * @param initialCount The initial participant count.
      */
    def this(initialCount: Double) = this()
  }
  
  @JSImport("prex", "Deferred")
  @js.native
  /**
    * Initializes a new instance of the Deferred class.
    */
  class Deferred[T] ()
    extends typingsSlinky.prex.deferredMod.Deferred[T]
  
  @JSImport("prex", "ManualResetEvent")
  @js.native
  /**
    * Initializes a new instance of the ManualResetEvent class.
    *
    * @param initialState A value indicating whether to set the initial state to signaled.
    */
  class ManualResetEvent ()
    extends typingsSlinky.prex.manualreseteventMod.ManualResetEvent {
    def this(initialState: Boolean) = this()
  }
  
  @JSImport("prex", "Pulsar")
  @js.native
  class Pulsar ()
    extends typingsSlinky.prex.pulsarMod.Pulsar
  
  @JSImport("prex", "ReaderWriterLock")
  @js.native
  class ReaderWriterLock ()
    extends typingsSlinky.prex.readerwriterlockMod.ReaderWriterLock
  
  @JSImport("prex", "Semaphore")
  @js.native
  class Semaphore protected ()
    extends typingsSlinky.prex.semaphoreMod.Semaphore {
    /**
      * Initializes a new instance of the Semaphore class.
      *
      * @param initialCount The initial number of entries.
      * @param maxCount The maximum number of entries.
      */
    def this(initialCount: Double) = this()
    def this(initialCount: Double, maxCount: Double) = this()
  }
  
  @JSImport("prex", "delay")
  @js.native
  def delay(msec: Double): js.Promise[Unit] = js.native
  @JSImport("prex", "delay")
  @js.native
  def delay(token: Cancelable, msec: Double): js.Promise[Unit] = js.native
  @JSImport("prex", "delay")
  @js.native
  def delay(token: typingsSlinky.prex.cancellationMod.CancellationToken, msec: Double): js.Promise[Unit] = js.native
  @JSImport("prex", "delay")
  @js.native
  def delay[T](msec: Double, value: T): js.Promise[T] = js.native
  @JSImport("prex", "delay")
  @js.native
  def delay[T](msec: Double, value: js.Thenable[T]): js.Promise[T] = js.native
  @JSImport("prex", "delay")
  @js.native
  def delay[T](token: Cancelable, msec: Double, value: T): js.Promise[T] = js.native
  @JSImport("prex", "delay")
  @js.native
  def delay[T](token: Cancelable, msec: Double, value: js.Thenable[T]): js.Promise[T] = js.native
  @JSImport("prex", "delay")
  @js.native
  def delay[T](token: typingsSlinky.prex.cancellationMod.CancellationToken, msec: Double, value: T): js.Promise[T] = js.native
  @JSImport("prex", "delay")
  @js.native
  def delay[T](token: typingsSlinky.prex.cancellationMod.CancellationToken, msec: Double, value: js.Thenable[T]): js.Promise[T] = js.native
}
