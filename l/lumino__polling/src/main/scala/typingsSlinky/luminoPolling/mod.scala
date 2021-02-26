package typingsSlinky.luminoPolling

import typingsSlinky.luminoDisposable.mod.IDisposable
import typingsSlinky.luminoPolling.mod.IPoll.Frequency
import typingsSlinky.luminoPolling.mod.IPoll.State
import typingsSlinky.luminoPolling.pollMod.Poll.IOptions
import typingsSlinky.luminoSignaling.mod.ISignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@lumino/polling", "Debouncer")
  @js.native
  class Debouncer[T, U] protected ()
    extends typingsSlinky.luminoPolling.ratelimiterMod.Debouncer[T, U] {
    /**
      * Instantiate a rate limiter.
      *
      * @param fn - The function to rate limit.
      *
      * @param limit - The rate limit; defaults to 500ms.
      */
    def this(fn: js.Function0[T | js.Promise[T]]) = this()
    def this(fn: js.Function0[T | js.Promise[T]], limit: Double) = this()
  }
  
  @JSImport("@lumino/polling", "Poll")
  @js.native
  class Poll[T, U, V /* <: String */] protected ()
    extends typingsSlinky.luminoPolling.pollMod.Poll[T, U, V] {
    /**
      * Instantiate a new poll with exponential backoff in case of failure.
      *
      * @param options - The poll instantiation options.
      */
    def this(options: IOptions[T, U, V]) = this()
  }
  object Poll {
    
    /**
      * An interval value that indicates the poll should tick immediately.
      */
    @JSImport("@lumino/polling", "Poll.IMMEDIATE")
    @js.native
    val IMMEDIATE: /* 0 */ Double = js.native
    
    /**
      * Delays are 32-bit integers in many browsers so intervals need to be capped.
      *
      * #### Notes
      * https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/setTimeout#Maximum_delay_value
      */
    @JSImport("@lumino/polling", "Poll.MAX_INTERVAL")
    @js.native
    val MAX_INTERVAL: /* 2147483647 */ Double = js.native
    
    /**
      * An interval value that indicates the poll should never tick.
      */
    @JSImport("@lumino/polling", "Poll.NEVER")
    @js.native
    val NEVER: Double = js.native
  }
  
  @JSImport("@lumino/polling", "RateLimiter")
  @js.native
  abstract class RateLimiter[T, U] protected ()
    extends typingsSlinky.luminoPolling.ratelimiterMod.RateLimiter[T, U] {
    /**
      * Instantiate a rate limiter.
      *
      * @param fn - The function to rate limit.
      *
      * @param limit - The rate limit; defaults to 500ms.
      */
    def this(fn: js.Function0[T | js.Promise[T]]) = this()
    def this(fn: js.Function0[T | js.Promise[T]], limit: Double) = this()
  }
  
  @JSImport("@lumino/polling", "Throttler")
  @js.native
  class Throttler[T, U] protected ()
    extends typingsSlinky.luminoPolling.ratelimiterMod.Throttler[T, U] {
    /**
      * Instantiate a throttler.
      *
      * @param fn - The function being throttled.
      *
      * @param options - Throttling configuration or throttling limit in ms.
      *
      * #### Notes
      * The `edge` defaults to `leading`; the `limit` defaults to `500`.
      */
    def this(fn: js.Function0[T | js.Promise[T]]) = this()
    def this(fn: js.Function0[T | js.Promise[T]], options: Double) = this()
    def this(
      fn: js.Function0[T | js.Promise[T]],
      options: typingsSlinky.luminoPolling.ratelimiterMod.Throttler.IOptions
    ) = this()
  }
  
  @js.native
  trait IPoll[T, U, V /* <: String */] extends StObject {
    
    /**
      * A signal emitted when the poll is disposed.
      */
    val disposed: ISignal[this.type, Unit] = js.native
    
    /**
      * The polling frequency data.
      */
    val frequency: Frequency = js.native
    
    /**
      * Whether the poll is disposed.
      */
    val isDisposed: Boolean = js.native
    
    /**
      * The name of the poll.
      */
    val name: String = js.native
    
    /**
      * The poll state, which is the content of the currently-scheduled poll tick.
      */
    val state: State[T, U, V] = js.native
    
    /**
      * A promise that resolves when the currently-scheduled tick completes.
      *
      * #### Notes
      * Usually this will resolve after `state.interval` milliseconds from
      * `state.timestamp`. It can resolve earlier if the user starts or refreshes the
      * poll, etc.
      */
    val tick: js.Promise[IPoll[T, U, V]] = js.native
    
    /**
      * A signal emitted when the poll state changes, i.e., a new tick is scheduled.
      */
    val ticked: ISignal[IPoll[T, U, V], State[T, U, V]] = js.native
  }
  object IPoll {
    
    @scala.inline
    def apply[T, U, V /* <: String */](
      disposed: ISignal[IPoll[T, U, V], Unit],
      frequency: Frequency,
      isDisposed: Boolean,
      name: String,
      state: State[T, U, V],
      tick: js.Promise[IPoll[T, U, V]],
      ticked: ISignal[IPoll[T, U, V], State[T, U, V]]
    ): IPoll[T, U, V] = {
      val __obj = js.Dynamic.literal(disposed = disposed.asInstanceOf[js.Any], frequency = frequency.asInstanceOf[js.Any], isDisposed = isDisposed.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], tick = tick.asInstanceOf[js.Any], ticked = ticked.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPoll[T, U, V]]
    }
    
    /**
      * The polling frequency parameters.
      *
      * #### Notes
      * We implement the "decorrelated jitter" strategy from
      * https://aws.amazon.com/blogs/architecture/exponential-backoff-and-jitter/.
      * Essentially, if consecutive retries are needed, we choose an integer:
      * `sleep = min(max, rand(interval, backoff * sleep))`
      * This ensures that the poll is never less than `interval`, and nicely
      * spreads out retries for consecutive tries. Over time, if (interval < max),
      * the random number will be above `max` about (1 - 1/backoff) of the time
      * (sleeping the `max`), and the rest of the time the sleep will be a random
      * number below `max`, decorrelating our trigger time from other pollers.
      */
    @js.native
    trait Frequency extends StObject {
      
      /**
        * Whether poll frequency backs off (boolean) or the backoff growth rate
        * (float > 1).
        *
        * #### Notes
        * If `true`, the default backoff growth rate is `3`.
        */
      val backoff: Boolean | Double = js.native
      
      /**
        * The basic polling interval in milliseconds (integer).
        */
      val interval: Double = js.native
      
      /**
        * The maximum milliseconds (integer) between poll requests.
        */
      val max: Double = js.native
    }
    object Frequency {
      
      @scala.inline
      def apply(backoff: Boolean | Double, interval: Double, max: Double): Frequency = {
        val __obj = js.Dynamic.literal(backoff = backoff.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any])
        __obj.asInstanceOf[Frequency]
      }
      
      @scala.inline
      implicit class FrequencyMutableBuilder[Self <: Frequency] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBackoff(value: Boolean | Double): Self = StObject.set(x, "backoff", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      }
    }
    
    @scala.inline
    implicit class IPollMutableBuilder[Self <: IPoll[_, _, _], T, U, V /* <: String */] (val x: Self with (IPoll[T, U, V])) extends AnyVal {
      
      @scala.inline
      def setDisposed(value: ISignal[IPoll[T, U, V], Unit]): Self = StObject.set(x, "disposed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrequency(value: Frequency): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDisposed(value: Boolean): Self = StObject.set(x, "isDisposed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: State[T, U, V]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTick(value: js.Promise[IPoll[T, U, V]]): Self = StObject.set(x, "tick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTicked(value: ISignal[IPoll[T, U, V], State[T, U, V]]): Self = StObject.set(x, "ticked", value.asInstanceOf[js.Any])
    }
    
    /**
      * The phase of the poll when the current tick was scheduled.
      *
      * @typeparam T - A type for any additional tick phases a poll supports.
      */
    /* Rewritten from type alias, can be one of: 
      - T
      - typingsSlinky.luminoPolling.luminoPollingStrings.constructed
      - typingsSlinky.luminoPolling.luminoPollingStrings.disposed
      - typingsSlinky.luminoPolling.luminoPollingStrings.reconnected
      - typingsSlinky.luminoPolling.luminoPollingStrings.refreshed
      - typingsSlinky.luminoPolling.luminoPollingStrings.rejected
      - typingsSlinky.luminoPolling.luminoPollingStrings.resolved
      - typingsSlinky.luminoPolling.luminoPollingStrings.standby
      - typingsSlinky.luminoPolling.luminoPollingStrings.started
      - typingsSlinky.luminoPolling.luminoPollingStrings.stopped
    */
    type Phase[T /* <: String */] = _Phase[T] | T
    
    /**
      * Definition of poll state at any given time.
      *
      * @typeparam T - The resolved type of the factory's promises.
      *
      * @typeparam U - The rejected type of the factory's promises.
      *
      * @typeparam V - The type to extend the phases supported by a poll.
      */
    @js.native
    trait State[T, U, V /* <: String */] extends StObject {
      
      /**
        * The number of milliseconds until the current tick resolves.
        */
      val interval: Double = js.native
      
      /**
        * The payload of the last poll resolution or rejection.
        *
        * #### Notes
        * The payload is `null` unless the `phase` is `'reconnected`, `'resolved'`,
        * or `'rejected'`. Its type is `T` for resolutions and `U` for rejections.
        */
      val payload: T | U | Null = js.native
      
      /**
        * The current poll phase.
        */
      val phase: Phase[V] = js.native
      
      /**
        * The timestamp for when this tick was scheduled.
        */
      val timestamp: Double = js.native
    }
    object State {
      
      @scala.inline
      def apply[T, U, V /* <: String */](interval: Double, phase: Phase[V], timestamp: Double): State[T, U, V] = {
        val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any], phase = phase.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
        __obj.asInstanceOf[State[T, U, V]]
      }
      
      @scala.inline
      implicit class StateMutableBuilder[Self <: State[_, _, _], T, U, V /* <: String */] (val x: Self with (State[T, U, V])) extends AnyVal {
        
        @scala.inline
        def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPayload(value: T | U): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPayloadNull: Self = StObject.set(x, "payload", null)
        
        @scala.inline
        def setPhase(value: Phase[V]): Self = StObject.set(x, "phase", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      }
    }
    
    trait _Phase[T /* <: String */] extends StObject
  }
  
  @js.native
  trait IRateLimiter[T, U] extends IDisposable {
    
    /**
      * Invoke the rate limited function.
      */
    def invoke(): js.Promise[T] = js.native
    
    /**
      * The rate limit in milliseconds.
      */
    val limit: Double = js.native
    
    /**
      * Stop the function if it is mid-flight.
      */
    def stop(): js.Promise[Unit] = js.native
  }
  object IRateLimiter {
    
    @scala.inline
    def apply[T, U](
      dispose: () => Unit,
      invoke: () => js.Promise[T],
      isDisposed: Boolean,
      limit: Double,
      stop: () => js.Promise[Unit]
    ): IRateLimiter[T, U] = {
      val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), invoke = js.Any.fromFunction0(invoke), isDisposed = isDisposed.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], stop = js.Any.fromFunction0(stop))
      __obj.asInstanceOf[IRateLimiter[T, U]]
    }
    
    @scala.inline
    implicit class IRateLimiterMutableBuilder[Self <: IRateLimiter[_, _], T, U] (val x: Self with (IRateLimiter[T, U])) extends AnyVal {
      
      @scala.inline
      def setInvoke(value: () => js.Promise[T]): Self = StObject.set(x, "invoke", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStop(value: () => js.Promise[Unit]): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
    }
  }
}
