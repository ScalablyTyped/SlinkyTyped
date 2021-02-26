package typingsSlinky.relayRuntime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relayObservableMod {
  
  @JSImport("relay-runtime/lib/network/RelayObservable", "RelayObservable")
  @js.native
  class RelayObservable[T] protected () extends Subscribable[T] {
    // Use RelayObservable.create(source);
    protected def this(source: scala.Nothing) = this()
    
    /**
      * Similar to promise.catch(), observable.catch() handles error events, and
      * provides an alternative observable to use in it's place.
      *
      * If the catch handler throws a new error, it will appear as an error event
      * on the resulting Observable.
      */
    def `catch`[U](fn: js.Function1[/* error */ js.Error, RelayObservable[U]]): RelayObservable[T | U] = js.native
    
    /**
      * Returns a new Observable which first yields values from this Observable,
      * then yields values from the next Observable. This is useful for chaining
      * together Observables of finite length.
      */
    def concat[U](next: RelayObservable[U]): RelayObservable[T | U] = js.native
    
    /**
      * Returns a new Observable which returns the same values as this one, but
      * modified so that the provided Observer is called to perform a side-effects
      * for all events emitted by the source.
      *
      * Any errors that are thrown in the side-effect Observer are unhandled, and
      * do not affect the source Observable or its Observer.
      *
      * This is useful for when debugging your Observables or performing other
      * side-effects such as logging or performance monitoring.
      */
    def `do`(observer: Observer[T]): RelayObservable[T] = js.native
    
    /**
      * Returns a new Observable which returns the same values as this one, but
      * modified so that the finally callback is performed after completion,
      * whether normal or due to error or unsubscription.
      *
      * This is useful for cleanup such as resource finalization.
      */
    def `finally`(fn: js.Function0[_]): RelayObservable[T] = js.native
    
    /**
      * Returns a new Observable which is identical to this one, unless this
      * Observable completes before yielding any values, in which case the new
      * Observable will yield the values from the alternate Observable.
      *
      * If this Observable does yield values, the alternate is never subscribed to.
      *
      * This is useful for scenarios where values may come from multiple sources
      * which should be tried in order, i.e. from a cache before a network.
      */
    def ifEmpty[U](alternate: RelayObservable[U]): RelayObservable[T | U] = js.native
    
    /**
      * Returns a new Observerable where each value has been transformed by
      * the mapping function.
      */
    def map[U](fn: js.Function1[/* value */ T, U]): RelayObservable[U] = js.native
    
    /**
      * Returns a new Observable where each value is replaced with a new Observable
      * by the mapping function, the results of which returned as a single
      * merged Observable.
      */
    def mergeMap[U](fn: js.Function1[/* value */ T, ObservableFromValue[U]]): RelayObservable[U] = js.native
    
    /**
      * Returns a new Observable which first mirrors this Observable, then when it
      * completes, waits for `pollInterval` milliseconds before re-subscribing to
      * this Observable again, looping in this manner until unsubscribed.
      *
      * The returned Observable never completes.
      */
    def poll(pollInterval: Double): RelayObservable[T] = js.native
    
    /**
      * Returns a Promise which resolves when this Observable yields a first value
      * or when it completes with no value.
      */
    def toPromise(): js.Promise[js.UndefOr[T]] = js.native
  }
  /* static members */
  object RelayObservable {
    
    @JSImport("relay-runtime/lib/network/RelayObservable", "RelayObservable.create")
    @js.native
    def create[V](source: Source[V]): RelayObservable[V] = js.native
    
    /**
      * Accepts various kinds of data sources, and always returns a RelayObservable
      * useful for accepting the result of a user-provided FetchFunction.
      */
    @JSImport("relay-runtime/lib/network/RelayObservable", "RelayObservable.from")
    @js.native
    def from[V](obj: ObservableFromValue[V]): RelayObservable[V] = js.native
    
    /**
      * When an emitted error event is not handled by an Observer, it is reported
      * to the host environment (what the ESObservable spec refers to as
      * "HostReportErrors()").
      *
      * The default implementation in development rethrows thrown errors, and
      * logs emitted error events to the console, while in production does nothing
      * (swallowing unhandled errors).
      *
      * Called during application initialization, this method allows
      * application-specific handling of unhandled errors. Allowing, for example,
      * integration with error logging or developer tools.
      *
      * A second parameter `isUncaughtThrownError` is true when the unhandled error
      * was thrown within an Observer handler, and false when the unhandled error
      * was an unhandled emitted event.
      *
      *  - Uncaught thrown errors typically represent avoidable errors thrown from
      *    application code, which should be handled with a try/catch block, and
      *    usually have useful stack traces.
      *
      *  - Unhandled emitted event errors typically represent unavoidable events in
      *    application flow such as network failure, and may not have useful
      *    stack traces.
      */
    @JSImport("relay-runtime/lib/network/RelayObservable", "RelayObservable.onUnhandledError")
    @js.native
    def onUnhandledError(callback: js.Function2[/* error */ js.Error, /* isUncaughtThrownError */ Boolean, Unit]): Unit = js.native
  }
  
  type ObservableFromValue[T] = Subscribable[T] | js.Promise[T] | T
  
  @js.native
  trait Observer[T] extends StObject {
    
    val complete: js.UndefOr[js.Function0[Unit]] = js.native
    
    val error: js.UndefOr[js.Function1[/* error */ js.Error, Unit]] = js.native
    
    val next: js.UndefOr[js.Function1[/* value */ T, Unit]] = js.native
    
    val start: js.UndefOr[js.Function1[/* subscription */ Subscription, Unit]] = js.native
    
    val unsubscribe: js.UndefOr[js.Function1[/* subscription */ Subscription, Unit]] = js.native
  }
  object Observer {
    
    @scala.inline
    def apply[T](): Observer[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Observer[T]]
    }
    
    @scala.inline
    implicit class ObserverMutableBuilder[Self <: Observer[_], T] (val x: Self with Observer[T]) extends AnyVal {
      
      @scala.inline
      def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
      
      @scala.inline
      def setError(value: /* error */ js.Error => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setNext(value: /* value */ T => Unit): Self = StObject.set(x, "next", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
      
      @scala.inline
      def setStart(value: /* subscription */ Subscription => Unit): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      @scala.inline
      def setUnsubscribe(value: /* subscription */ Subscription => Unit): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUnsubscribeUndefined: Self = StObject.set(x, "unsubscribe", js.undefined)
    }
  }
  
  @js.native
  trait Sink[T] extends StObject {
    
    val closed: Boolean = js.native
    
    def complete(): Unit = js.native
    
    def error(error: js.Error): Unit = js.native
    def error(error: js.Error, isUncaughtThrownError: Boolean): Unit = js.native
    
    def next(value: T): Unit = js.native
  }
  
  type Source[T] = js.Function1[/* sink */ Sink[T], Unit | Subscription | js.Function0[js.Any]]
  
  @js.native
  trait Subscribable[T] extends StObject {
    
    def subscribe(observer: Observer[T]): Subscription = js.native
    def subscribe(observer: Sink[T]): Subscription = js.native
  }
  
  @js.native
  trait Subscription extends StObject {
    
    val closed: Boolean = js.native
    
    def unsubscribe(): Unit = js.native
  }
  object Subscription {
    
    @scala.inline
    def apply(closed: Boolean, unsubscribe: () => Unit): Subscription = {
      val __obj = js.Dynamic.literal(closed = closed.asInstanceOf[js.Any], unsubscribe = js.Any.fromFunction0(unsubscribe))
      __obj.asInstanceOf[Subscription]
    }
    
    @scala.inline
    implicit class SubscriptionMutableBuilder[Self <: Subscription] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClosed(value: Boolean): Self = StObject.set(x, "closed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnsubscribe(value: () => Unit): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction0(value))
    }
  }
}
