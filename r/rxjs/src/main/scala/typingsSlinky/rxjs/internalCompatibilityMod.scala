package typingsSlinky.rxjs

import org.scalablytyped.runtime.Instantiable2
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.XMLHttpRequest
import typingsSlinky.rxjs.actionMod.Action
import typingsSlinky.rxjs.ajaxObservableMod.AjaxCreationMethod
import typingsSlinky.rxjs.ajaxObservableMod.AjaxErrorCtor
import typingsSlinky.rxjs.ajaxObservableMod.AjaxRequest
import typingsSlinky.rxjs.ajaxObservableMod.AjaxTimeoutErrorCtor
import typingsSlinky.rxjs.argumentOutOfRangeErrorMod.ArgumentOutOfRangeErrorCtor
import typingsSlinky.rxjs.emptyErrorMod.EmptyErrorCtor
import typingsSlinky.rxjs.groupByMod.RefCountSubscription
import typingsSlinky.rxjs.internalObservableMod.Observable
import typingsSlinky.rxjs.objectUnsubscribedErrorMod.ObjectUnsubscribedErrorCtor
import typingsSlinky.rxjs.subjectMod.Subject
import typingsSlinky.rxjs.subscribeOnObservableMod.DispatchArg
import typingsSlinky.rxjs.subscriptionMod.Subscription
import typingsSlinky.rxjs.throttleMod.ThrottleConfig
import typingsSlinky.rxjs.timeIntervalMod.TimeInterval_
import typingsSlinky.rxjs.timeoutErrorMod.TimeoutErrorCtor
import typingsSlinky.rxjs.timestampMod.Timestamp_
import typingsSlinky.rxjs.typesMod.ObservableInput
import typingsSlinky.rxjs.typesMod.Observer
import typingsSlinky.rxjs.typesMod.PartialObserver
import typingsSlinky.rxjs.typesMod.SchedulerLike
import typingsSlinky.rxjs.typesMod.UnaryFunction
import typingsSlinky.rxjs.unsubscriptionErrorMod.UnsubscriptionErrorCtor
import typingsSlinky.rxjs.webSocketSubjectMod.WebSocketSubjectConfig
import typingsSlinky.std.ArrayLike
import typingsSlinky.std.Error
import typingsSlinky.std.PromiseConstructorLike
import typingsSlinky.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object internalCompatibilityMod {
  
  @JSImport("rxjs/internal-compatibility", "AjaxError")
  @js.native
  val AjaxError: AjaxErrorCtor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rxjs/internal-compatibility", "AjaxError")
  @js.native
  class AjaxErrorCls protected ()
    extends typingsSlinky.rxjs.ajaxObservableMod.AjaxError {
    def this(message: String, xhr: XMLHttpRequest, request: AjaxRequest) = this()
  }
  
  @JSImport("rxjs/internal-compatibility", "AjaxObservable")
  @js.native
  class AjaxObservable[T] protected ()
    extends typingsSlinky.rxjs.ajaxObservableMod.AjaxObservable[T] {
    def this(urlOrRequest: String) = this()
    def this(urlOrRequest: AjaxRequest) = this()
  }
  /* static members */
  object AjaxObservable {
    
    @JSImport("rxjs/internal-compatibility", "AjaxObservable")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates an observable for an Ajax request with either a request object with
      * url, headers, etc or a string for a URL.
      *
      * ## Example
      * ```ts
      * import { ajax } from 'rxjs/ajax';
      *
      * const source1 = ajax('/products');
      * const source2 = ajax({ url: 'products', method: 'GET' });
      * ```
      *
      * @param {string|Object} request Can be one of the following:
      *   A string of the URL to make the Ajax call.
      *   An object with the following properties
      *   - url: URL of the request
      *   - body: The body of the request
      *   - method: Method of the request, such as GET, POST, PUT, PATCH, DELETE
      *   - async: Whether the request is async
      *   - headers: Optional headers
      *   - crossDomain: true if a cross domain request, else false
      *   - createXHR: a function to override if you need to use an alternate
      *   XMLHttpRequest implementation.
      *   - resultSelector: a function to use to alter the output value type of
      *   the Observable. Gets {@link AjaxResponse} as an argument.
      * @return {Observable} An observable sequence containing the XMLHttpRequest.
      * @static true
      * @name ajax
      * @owner Observable
      * @nocollapse
      */
    @JSImport("rxjs/internal-compatibility", "AjaxObservable.create")
    @js.native
    def create: AjaxCreationMethod = js.native
    /**
      * Creates an observable for an Ajax request with either a request object with
      * url, headers, etc or a string for a URL.
      *
      * ## Example
      * ```ts
      * import { ajax } from 'rxjs/ajax';
      *
      * const source1 = ajax('/products');
      * const source2 = ajax({ url: 'products', method: 'GET' });
      * ```
      *
      * @param {string|Object} request Can be one of the following:
      *   A string of the URL to make the Ajax call.
      *   An object with the following properties
      *   - url: URL of the request
      *   - body: The body of the request
      *   - method: Method of the request, such as GET, POST, PUT, PATCH, DELETE
      *   - async: Whether the request is async
      *   - headers: Optional headers
      *   - crossDomain: true if a cross domain request, else false
      *   - createXHR: a function to override if you need to use an alternate
      *   XMLHttpRequest implementation.
      *   - resultSelector: a function to use to alter the output value type of
      *   the Observable. Gets {@link AjaxResponse} as an argument.
      * @return {Observable} An observable sequence containing the XMLHttpRequest.
      * @static true
      * @name ajax
      * @owner Observable
      * @nocollapse
      */
    @JSImport("rxjs/internal-compatibility", "AjaxObservable.create")
    @js.native
    def create(urlOrRequest: String): Observable[typingsSlinky.rxjs.ajaxObservableMod.AjaxResponse] = js.native
    @JSImport("rxjs/internal-compatibility", "AjaxObservable.create")
    @js.native
    def create(urlOrRequest: AjaxRequest): Observable[typingsSlinky.rxjs.ajaxObservableMod.AjaxResponse] = js.native
    @scala.inline
    def create_=(x: AjaxCreationMethod): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("create")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("rxjs/internal-compatibility", "AjaxResponse")
  @js.native
  class AjaxResponse protected ()
    extends typingsSlinky.rxjs.ajaxObservableMod.AjaxResponse {
    def this(originalEvent: Event, xhr: XMLHttpRequest, request: AjaxRequest) = this()
  }
  
  @JSImport("rxjs/internal-compatibility", "AjaxSubscriber")
  @js.native
  class AjaxSubscriber[T] protected ()
    extends typingsSlinky.rxjs.ajaxObservableMod.AjaxSubscriber[T] {
    def this(destination: typingsSlinky.rxjs.subscriberMod.Subscriber[T], request: AjaxRequest) = this()
  }
  
  @JSImport("rxjs/internal-compatibility", "AjaxTimeoutError")
  @js.native
  val AjaxTimeoutError: AjaxTimeoutErrorCtor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rxjs/internal-compatibility", "AjaxTimeoutError")
  @js.native
  class AjaxTimeoutErrorCls protected ()
    extends typingsSlinky.rxjs.ajaxObservableMod.AjaxError {
    def this(xhr: XMLHttpRequest, request: AjaxRequest) = this()
  }
  
  @JSImport("rxjs/internal-compatibility", "AnonymousSubject")
  @js.native
  class AnonymousSubject[T] ()
    extends typingsSlinky.rxjs.subjectMod.AnonymousSubject[T] {
    def this(destination: Observer[T]) = this()
    def this(destination: js.UndefOr[scala.Nothing], source: Observable[T]) = this()
    def this(destination: Observer[T], source: Observable[T]) = this()
  }
  
  @JSImport("rxjs/internal-compatibility", "ArgumentOutOfRangeError")
  @js.native
  val ArgumentOutOfRangeError: ArgumentOutOfRangeErrorCtor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rxjs/internal-compatibility", "ArgumentOutOfRangeError")
  @js.native
  class ArgumentOutOfRangeErrorCls () extends Error
  
  @JSImport("rxjs/internal-compatibility", "CombineLatestOperator")
  @js.native
  class CombineLatestOperator[T, R] ()
    extends typingsSlinky.rxjs.combineLatestMod.CombineLatestOperator[T, R] {
    def this(resultSelector: js.Function1[/* repeated */ js.Any, R]) = this()
  }
  
  @JSImport("rxjs/internal-compatibility", "EmptyError")
  @js.native
  val EmptyError: EmptyErrorCtor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rxjs/internal-compatibility", "EmptyError")
  @js.native
  class EmptyErrorCls () extends Error
  
  @JSImport("rxjs/internal-compatibility", "GroupedObservable")
  @js.native
  class GroupedObservable[K, T] protected ()
    extends typingsSlinky.rxjs.groupByMod.GroupedObservable[K, T] {
    /** @deprecated Do not construct this type. Internal use only */
    def this(key: K, groupSubject: Subject[T]) = this()
    def this(key: K, groupSubject: Subject[T], refCountSubscription: RefCountSubscription) = this()
  }
  
  object Immediate {
    
    @JSImport("rxjs/internal-compatibility", "Immediate.clearImmediate")
    @js.native
    def clearImmediate(handle: Double): Unit = js.native
    
    @JSImport("rxjs/internal-compatibility", "Immediate.setImmediate")
    @js.native
    def setImmediate(cb: js.Function0[Unit]): Double = js.native
  }
  
  @JSImport("rxjs/internal-compatibility", "InnerSubscriber")
  @js.native
  class InnerSubscriber[T, R] protected ()
    extends typingsSlinky.rxjs.innerSubscriberMod.InnerSubscriber[T, R] {
    def this(
      parent: typingsSlinky.rxjs.outerSubscriberMod.OuterSubscriber[T, R],
      outerValue: T,
      outerIndex: Double
    ) = this()
  }
  
  @JSImport("rxjs/internal-compatibility", "ObjectUnsubscribedError")
  @js.native
  val ObjectUnsubscribedError: ObjectUnsubscribedErrorCtor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rxjs/internal-compatibility", "ObjectUnsubscribedError")
  @js.native
  class ObjectUnsubscribedErrorCls () extends Error
  
  @JSImport("rxjs/internal-compatibility", "OuterSubscriber")
  @js.native
  /**
    * @param {Observer|function(value: T): void} [destinationOrNext] A partially
    * defined Observer or a `next` callback function.
    * @param {function(e: ?any): void} [error] The `error` callback of an
    * Observer.
    * @param {function(): void} [complete] The `complete` callback of an
    * Observer.
    */
  class OuterSubscriber[T, R] ()
    extends typingsSlinky.rxjs.outerSubscriberMod.OuterSubscriber[T, R] {
    def this(destinationOrNext: js.Function1[/* value */ T, Unit]) = this()
    def this(destinationOrNext: PartialObserver[_]) = this()
    def this(
      destinationOrNext: js.UndefOr[scala.Nothing],
      error: js.Function1[/* e */ js.UndefOr[js.Any], Unit]
    ) = this()
    def this(
      destinationOrNext: js.Function1[/* value */ T, Unit],
      error: js.Function1[/* e */ js.UndefOr[js.Any], Unit]
    ) = this()
    def this(destinationOrNext: PartialObserver[_], error: js.Function1[/* e */ js.UndefOr[js.Any], Unit]) = this()
    def this(
      destinationOrNext: js.UndefOr[scala.Nothing],
      error: js.UndefOr[scala.Nothing],
      complete: js.Function0[Unit]
    ) = this()
    def this(
      destinationOrNext: js.UndefOr[scala.Nothing],
      error: js.Function1[/* e */ js.UndefOr[js.Any], Unit],
      complete: js.Function0[Unit]
    ) = this()
    def this(
      destinationOrNext: js.Function1[/* value */ T, Unit],
      error: js.UndefOr[scala.Nothing],
      complete: js.Function0[Unit]
    ) = this()
    def this(
      destinationOrNext: js.Function1[/* value */ T, Unit],
      error: js.Function1[/* e */ js.UndefOr[js.Any], Unit],
      complete: js.Function0[Unit]
    ) = this()
    def this(
      destinationOrNext: PartialObserver[_],
      error: js.UndefOr[scala.Nothing],
      complete: js.Function0[Unit]
    ) = this()
    def this(
      destinationOrNext: PartialObserver[_],
      error: js.Function1[/* e */ js.UndefOr[js.Any], Unit],
      complete: js.Function0[Unit]
    ) = this()
  }
  
  @JSImport("rxjs/internal-compatibility", "Scheduler")
  @js.native
  class Scheduler protected ()
    extends typingsSlinky.rxjs.schedulerMod.Scheduler {
    def this(SchedulerAction: Instantiable2[
            /* scheduler */ typingsSlinky.rxjs.schedulerMod.Scheduler, 
            /* work */ js.ThisFunction1[
              /* this */ typingsSlinky.rxjs.typesMod.SchedulerAction[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any], 
              /* state */ js.UndefOr[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any], 
              Unit
            ], 
            Action[js.Object]
          ]) = this()
    def this(
      SchedulerAction: Instantiable2[
            /* scheduler */ typingsSlinky.rxjs.schedulerMod.Scheduler, 
            /* work */ js.ThisFunction1[
              /* this */ typingsSlinky.rxjs.typesMod.SchedulerAction[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any], 
              /* state */ js.UndefOr[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any], 
              Unit
            ], 
            Action[js.Object]
          ],
      now: js.Function0[Double]
    ) = this()
  }
  /* static members */
  object Scheduler {
    
    /**
      * Note: the extra arrow function wrapper is to make testing by overriding
      * Date.now easier.
      * @nocollapse
      */
    @JSImport("rxjs/internal-compatibility", "Scheduler.now")
    @js.native
    def now(): Double = js.native
  }
  
  @JSImport("rxjs/internal-compatibility", "SubjectSubscription")
  @js.native
  class SubjectSubscription[T] protected ()
    extends typingsSlinky.rxjs.subjectSubscriptionMod.SubjectSubscription[T] {
    def this(subject: Subject[T], subscriber: Observer[T]) = this()
  }
  
  @JSImport("rxjs/internal-compatibility", "SubscribeOnObservable")
  @js.native
  class SubscribeOnObservable[T] protected ()
    extends typingsSlinky.rxjs.subscribeOnObservableMod.SubscribeOnObservable[T] {
    def this(source: Observable[T]) = this()
    def this(source: Observable[T], delayTime: Double) = this()
    def this(source: Observable[T], delayTime: js.UndefOr[scala.Nothing], scheduler: SchedulerLike) = this()
    def this(source: Observable[T], delayTime: Double, scheduler: SchedulerLike) = this()
  }
  /* static members */
  object SubscribeOnObservable {
    
    /** @nocollapse */
    @JSImport("rxjs/internal-compatibility", "SubscribeOnObservable.create")
    @js.native
    def create[T](source: Observable[T]): Observable[T] = js.native
    @JSImport("rxjs/internal-compatibility", "SubscribeOnObservable.create")
    @js.native
    def create[T](source: Observable[T], delay: js.UndefOr[scala.Nothing], scheduler: SchedulerLike): Observable[T] = js.native
    @JSImport("rxjs/internal-compatibility", "SubscribeOnObservable.create")
    @js.native
    def create[T](source: Observable[T], delay: Double): Observable[T] = js.native
    @JSImport("rxjs/internal-compatibility", "SubscribeOnObservable.create")
    @js.native
    def create[T](source: Observable[T], delay: Double, scheduler: SchedulerLike): Observable[T] = js.native
    
    /** @nocollapse */
    @JSImport("rxjs/internal-compatibility", "SubscribeOnObservable.dispatch")
    @js.native
    def dispatch[T](arg: DispatchArg[T]): Subscription = js.native
  }
  
  @JSImport("rxjs/internal-compatibility", "Subscriber")
  @js.native
  /**
    * @param {Observer|function(value: T): void} [destinationOrNext] A partially
    * defined Observer or a `next` callback function.
    * @param {function(e: ?any): void} [error] The `error` callback of an
    * Observer.
    * @param {function(): void} [complete] The `complete` callback of an
    * Observer.
    */
  class Subscriber[T] ()
    extends typingsSlinky.rxjs.subscriberMod.Subscriber[T] {
    def this(destinationOrNext: js.Function1[/* value */ T, Unit]) = this()
    def this(destinationOrNext: PartialObserver[_]) = this()
    def this(
      destinationOrNext: js.UndefOr[scala.Nothing],
      error: js.Function1[/* e */ js.UndefOr[js.Any], Unit]
    ) = this()
    def this(
      destinationOrNext: js.Function1[/* value */ T, Unit],
      error: js.Function1[/* e */ js.UndefOr[js.Any], Unit]
    ) = this()
    def this(destinationOrNext: PartialObserver[_], error: js.Function1[/* e */ js.UndefOr[js.Any], Unit]) = this()
    def this(
      destinationOrNext: js.UndefOr[scala.Nothing],
      error: js.UndefOr[scala.Nothing],
      complete: js.Function0[Unit]
    ) = this()
    def this(
      destinationOrNext: js.UndefOr[scala.Nothing],
      error: js.Function1[/* e */ js.UndefOr[js.Any], Unit],
      complete: js.Function0[Unit]
    ) = this()
    def this(
      destinationOrNext: js.Function1[/* value */ T, Unit],
      error: js.UndefOr[scala.Nothing],
      complete: js.Function0[Unit]
    ) = this()
    def this(
      destinationOrNext: js.Function1[/* value */ T, Unit],
      error: js.Function1[/* e */ js.UndefOr[js.Any], Unit],
      complete: js.Function0[Unit]
    ) = this()
    def this(
      destinationOrNext: PartialObserver[_],
      error: js.UndefOr[scala.Nothing],
      complete: js.Function0[Unit]
    ) = this()
    def this(
      destinationOrNext: PartialObserver[_],
      error: js.Function1[/* e */ js.UndefOr[js.Any], Unit],
      complete: js.Function0[Unit]
    ) = this()
  }
  /* static members */
  object Subscriber {
    
    /**
      * A static factory for a Subscriber, given a (potentially partial) definition
      * of an Observer.
      * @param {function(x: ?T): void} [next] The `next` callback of an Observer.
      * @param {function(e: ?any): void} [error] The `error` callback of an
      * Observer.
      * @param {function(): void} [complete] The `complete` callback of an
      * Observer.
      * @return {Subscriber<T>} A Subscriber wrapping the (partially defined)
      * Observer represented by the given arguments.
      * @nocollapse
      */
    @JSImport("rxjs/internal-compatibility", "Subscriber.create")
    @js.native
    def create[T](): typingsSlinky.rxjs.subscriberMod.Subscriber[T] = js.native
    @JSImport("rxjs/internal-compatibility", "Subscriber.create")
    @js.native
    def create[T](next: js.UndefOr[scala.Nothing], error: js.UndefOr[scala.Nothing], complete: js.Function0[Unit]): typingsSlinky.rxjs.subscriberMod.Subscriber[T] = js.native
    @JSImport("rxjs/internal-compatibility", "Subscriber.create")
    @js.native
    def create[T](next: js.UndefOr[scala.Nothing], error: js.Function1[/* e */ js.UndefOr[js.Any], Unit]): typingsSlinky.rxjs.subscriberMod.Subscriber[T] = js.native
    @JSImport("rxjs/internal-compatibility", "Subscriber.create")
    @js.native
    def create[T](
      next: js.UndefOr[scala.Nothing],
      error: js.Function1[/* e */ js.UndefOr[js.Any], Unit],
      complete: js.Function0[Unit]
    ): typingsSlinky.rxjs.subscriberMod.Subscriber[T] = js.native
    @JSImport("rxjs/internal-compatibility", "Subscriber.create")
    @js.native
    def create[T](next: js.Function1[/* x */ js.UndefOr[T], Unit]): typingsSlinky.rxjs.subscriberMod.Subscriber[T] = js.native
    @JSImport("rxjs/internal-compatibility", "Subscriber.create")
    @js.native
    def create[T](
      next: js.Function1[/* x */ js.UndefOr[T], Unit],
      error: js.UndefOr[scala.Nothing],
      complete: js.Function0[Unit]
    ): typingsSlinky.rxjs.subscriberMod.Subscriber[T] = js.native
    @JSImport("rxjs/internal-compatibility", "Subscriber.create")
    @js.native
    def create[T](
      next: js.Function1[/* x */ js.UndefOr[T], Unit],
      error: js.Function1[/* e */ js.UndefOr[js.Any], Unit]
    ): typingsSlinky.rxjs.subscriberMod.Subscriber[T] = js.native
    @JSImport("rxjs/internal-compatibility", "Subscriber.create")
    @js.native
    def create[T](
      next: js.Function1[/* x */ js.UndefOr[T], Unit],
      error: js.Function1[/* e */ js.UndefOr[js.Any], Unit],
      complete: js.Function0[Unit]
    ): typingsSlinky.rxjs.subscriberMod.Subscriber[T] = js.native
  }
  
  @JSImport("rxjs/internal-compatibility", "TimeInterval")
  @js.native
  class TimeInterval[T] protected () extends TimeInterval_[T] {
    def this(value: T, interval: Double) = this()
  }
  
  @JSImport("rxjs/internal-compatibility", "TimeoutError")
  @js.native
  val TimeoutError: TimeoutErrorCtor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rxjs/internal-compatibility", "TimeoutError")
  @js.native
  class TimeoutErrorCls () extends Error
  
  @JSImport("rxjs/internal-compatibility", "Timestamp")
  @js.native
  class Timestamp[T] protected () extends Timestamp_[T] {
    def this(value: T, timestamp: Double) = this()
  }
  
  @JSImport("rxjs/internal-compatibility", "UnsubscriptionError")
  @js.native
  val UnsubscriptionError: UnsubscriptionErrorCtor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rxjs/internal-compatibility", "UnsubscriptionError")
  @js.native
  class UnsubscriptionErrorCls protected ()
    extends typingsSlinky.rxjs.unsubscriptionErrorMod.UnsubscriptionError {
    def this(errors: js.Array[_]) = this()
  }
  
  @JSImport("rxjs/internal-compatibility", "WebSocketSubject")
  @js.native
  class WebSocketSubject[T] protected ()
    extends typingsSlinky.rxjs.webSocketSubjectMod.WebSocketSubject[T] {
    def this(urlConfigOrSource: String) = this()
    def this(urlConfigOrSource: Observable[T]) = this()
    def this(urlConfigOrSource: WebSocketSubjectConfig[T]) = this()
    def this(urlConfigOrSource: String, destination: Observer[T]) = this()
    def this(urlConfigOrSource: Observable[T], destination: Observer[T]) = this()
    def this(urlConfigOrSource: WebSocketSubjectConfig[T], destination: Observer[T]) = this()
  }
  
  @JSImport("rxjs/internal-compatibility", "ajax")
  @js.native
  val ajax: AjaxCreationMethod = js.native
  
  @JSImport("rxjs/internal-compatibility", "ajaxDelete")
  @js.native
  def ajaxDelete(url: String): Observable[typingsSlinky.rxjs.ajaxObservableMod.AjaxResponse] = js.native
  @JSImport("rxjs/internal-compatibility", "ajaxDelete")
  @js.native
  def ajaxDelete(url: String, headers: js.Object): Observable[typingsSlinky.rxjs.ajaxObservableMod.AjaxResponse] = js.native
  
  @JSImport("rxjs/internal-compatibility", "ajaxGet")
  @js.native
  def ajaxGet(url: String): typingsSlinky.rxjs.ajaxObservableMod.AjaxObservable[typingsSlinky.rxjs.ajaxObservableMod.AjaxResponse] = js.native
  @JSImport("rxjs/internal-compatibility", "ajaxGet")
  @js.native
  def ajaxGet(url: String, headers: js.Object): typingsSlinky.rxjs.ajaxObservableMod.AjaxObservable[typingsSlinky.rxjs.ajaxObservableMod.AjaxResponse] = js.native
  
  @JSImport("rxjs/internal-compatibility", "ajaxGetJSON")
  @js.native
  def ajaxGetJSON[T](url: String): Observable[T] = js.native
  @JSImport("rxjs/internal-compatibility", "ajaxGetJSON")
  @js.native
  def ajaxGetJSON[T](url: String, headers: js.Object): Observable[T] = js.native
  
  @JSImport("rxjs/internal-compatibility", "ajaxPatch")
  @js.native
  def ajaxPatch(url: String): Observable[typingsSlinky.rxjs.ajaxObservableMod.AjaxResponse] = js.native
  @JSImport("rxjs/internal-compatibility", "ajaxPatch")
  @js.native
  def ajaxPatch(url: String, body: js.UndefOr[scala.Nothing], headers: js.Object): Observable[typingsSlinky.rxjs.ajaxObservableMod.AjaxResponse] = js.native
  @JSImport("rxjs/internal-compatibility", "ajaxPatch")
  @js.native
  def ajaxPatch(url: String, body: js.Any): Observable[typingsSlinky.rxjs.ajaxObservableMod.AjaxResponse] = js.native
  @JSImport("rxjs/internal-compatibility", "ajaxPatch")
  @js.native
  def ajaxPatch(url: String, body: js.Any, headers: js.Object): Observable[typingsSlinky.rxjs.ajaxObservableMod.AjaxResponse] = js.native
  
  @JSImport("rxjs/internal-compatibility", "ajaxPost")
  @js.native
  def ajaxPost(url: String): Observable[typingsSlinky.rxjs.ajaxObservableMod.AjaxResponse] = js.native
  @JSImport("rxjs/internal-compatibility", "ajaxPost")
  @js.native
  def ajaxPost(url: String, body: js.UndefOr[scala.Nothing], headers: js.Object): Observable[typingsSlinky.rxjs.ajaxObservableMod.AjaxResponse] = js.native
  @JSImport("rxjs/internal-compatibility", "ajaxPost")
  @js.native
  def ajaxPost(url: String, body: js.Any): Observable[typingsSlinky.rxjs.ajaxObservableMod.AjaxResponse] = js.native
  @JSImport("rxjs/internal-compatibility", "ajaxPost")
  @js.native
  def ajaxPost(url: String, body: js.Any, headers: js.Object): Observable[typingsSlinky.rxjs.ajaxObservableMod.AjaxResponse] = js.native
  
  @JSImport("rxjs/internal-compatibility", "ajaxPut")
  @js.native
  def ajaxPut(url: String): Observable[typingsSlinky.rxjs.ajaxObservableMod.AjaxResponse] = js.native
  @JSImport("rxjs/internal-compatibility", "ajaxPut")
  @js.native
  def ajaxPut(url: String, body: js.UndefOr[scala.Nothing], headers: js.Object): Observable[typingsSlinky.rxjs.ajaxObservableMod.AjaxResponse] = js.native
  @JSImport("rxjs/internal-compatibility", "ajaxPut")
  @js.native
  def ajaxPut(url: String, body: js.Any): Observable[typingsSlinky.rxjs.ajaxObservableMod.AjaxResponse] = js.native
  @JSImport("rxjs/internal-compatibility", "ajaxPut")
  @js.native
  def ajaxPut(url: String, body: js.Any, headers: js.Object): Observable[typingsSlinky.rxjs.ajaxObservableMod.AjaxResponse] = js.native
  
  @JSImport("rxjs/internal-compatibility", "applyMixins")
  @js.native
  def applyMixins(derivedCtor: js.Any, baseCtors: js.Array[_]): Unit = js.native
  
  object config {
    
    @JSImport("rxjs/internal-compatibility", "config")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The promise constructor used by default for methods such as
      * {@link toPromise} and {@link forEach}
      */
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("rxjs/internal-compatibility", "config.Promise")
    @js.native
    class Promise[T] protected () extends PromiseLike[T] {
      def this(executor: js.Function2[
                /* resolve */ js.Function1[/* value */ T | js.Thenable[T], Unit], 
                /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
                Unit
              ]) = this()
    }
    /**
      * The promise constructor used by default for methods such as
      * {@link toPromise} and {@link forEach}
      */
    @JSImport("rxjs/internal-compatibility", "config.Promise")
    @js.native
    def Promise: PromiseConstructorLike = js.native
    @scala.inline
    def Promise_=(x: PromiseConstructorLike): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Promise")(x.asInstanceOf[js.Any])
    
    /**
      * If true, turns on synchronous error rethrowing, which is a deprecated behavior
      * in v6 and higher. This behavior enables bad patterns like wrapping a subscribe
      * call in a try/catch block. It also enables producer interference, a nasty bug
      * where a multicast can be broken for all observers by a downstream consumer with
      * an unhandled error. DO NOT USE THIS FLAG UNLESS IT'S NEEDED TO BY TIME
      * FOR MIGRATION REASONS.
      */
    @JSImport("rxjs/internal-compatibility", "config.useDeprecatedSynchronousErrorHandling")
    @js.native
    def useDeprecatedSynchronousErrorHandling: Boolean = js.native
    @scala.inline
    def useDeprecatedSynchronousErrorHandling_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("useDeprecatedSynchronousErrorHandling")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("rxjs/internal-compatibility", "defaultThrottleConfig")
  @js.native
  val defaultThrottleConfig: ThrottleConfig = js.native
  
  @JSImport("rxjs/internal-compatibility", "dispatch")
  @js.native
  def dispatch(state: js.Any): Unit = js.native
  
  @JSImport("rxjs/internal-compatibility", "errorObject")
  @js.native
  val errorObject: js.Any = js.native
  
  @JSImport("rxjs/internal-compatibility", "fromIterable")
  @js.native
  def fromIterable[T](input: js.Iterable[T]): Observable[T] = js.native
  @JSImport("rxjs/internal-compatibility", "fromIterable")
  @js.native
  def fromIterable[T](input: js.Iterable[T], scheduler: SchedulerLike): Observable[T] = js.native
  
  @JSImport("rxjs/internal-compatibility", "fromPromise")
  @js.native
  def fromPromise[T](input: js.Thenable[T]): Observable[T] = js.native
  @JSImport("rxjs/internal-compatibility", "fromPromise")
  @js.native
  def fromPromise[T](input: js.Thenable[T], scheduler: SchedulerLike): Observable[T] = js.native
  
  @JSImport("rxjs/internal-compatibility", "hostReportError")
  @js.native
  def hostReportError(err: js.Any): Unit = js.native
  
  @JSImport("rxjs/internal-compatibility", "identity")
  @js.native
  def identity[T](x: T): T = js.native
  
  @JSImport("rxjs/internal-compatibility", "isArray")
  @js.native
  def isArray(arg: js.Any): /* is std.Array<any> */ Boolean = js.native
  
  @JSImport("rxjs/internal-compatibility", "isArrayLike")
  @js.native
  def isArrayLike[T](x: js.Any): /* is std.ArrayLike<T> */ Boolean = js.native
  
  @JSImport("rxjs/internal-compatibility", "isDate")
  @js.native
  def isDate(value: js.Any): /* is std.Date */ Boolean = js.native
  
  @JSImport("rxjs/internal-compatibility", "isFunction")
  @js.native
  def isFunction(x: js.Any): /* is std.Function */ Boolean = js.native
  
  @JSImport("rxjs/internal-compatibility", "isIterable")
  @js.native
  def isIterable(input: js.Any): /* is std.Iterable<any> */ Boolean = js.native
  
  @JSImport("rxjs/internal-compatibility", "isNumeric")
  @js.native
  def isNumeric(`val`: js.Any): Boolean = js.native
  
  @JSImport("rxjs/internal-compatibility", "isObject")
  @js.native
  def isObject(x: js.Any): /* is std.Object */ Boolean = js.native
  
  @JSImport("rxjs/internal-compatibility", "isObservable")
  @js.native
  def isObservable(input: js.Any): /* is rxjs.rxjs/internal/types.InteropObservable<any> */ Boolean = js.native
  
  @JSImport("rxjs/internal-compatibility", "isPromise")
  @js.native
  def isPromise(value: js.Any): /* is std.PromiseLike<any> */ Boolean = js.native
  
  @JSImport("rxjs/internal-compatibility", "isScheduler")
  @js.native
  def isScheduler(value: js.Any): /* is rxjs.rxjs/internal/types.SchedulerLike */ Boolean = js.native
  
  @JSImport("rxjs/internal-compatibility", "iterator")
  @js.native
  val iterator: js.Symbol = js.native
  
  @JSImport("rxjs/internal-compatibility", "noop")
  @js.native
  def noop(): Unit = js.native
  
  @JSImport("rxjs/internal-compatibility", "not")
  @js.native
  def not(pred: js.Function, thisArg: js.Any): js.Function = js.native
  
  @JSImport("rxjs/internal-compatibility", "observable")
  @js.native
  val observable: String | js.Symbol = js.native
  
  @JSImport("rxjs/internal-compatibility", "pipe")
  @js.native
  def pipe[T](): UnaryFunction[T, T] = js.native
  @JSImport("rxjs/internal-compatibility", "pipe")
  @js.native
  def pipe[T, A](fn1: UnaryFunction[T, A]): UnaryFunction[T, A] = js.native
  @JSImport("rxjs/internal-compatibility", "pipe")
  @js.native
  def pipe[T, A, B](fn1: UnaryFunction[T, A], fn2: UnaryFunction[A, B]): UnaryFunction[T, B] = js.native
  @JSImport("rxjs/internal-compatibility", "pipe")
  @js.native
  def pipe[T, A, B, C](fn1: UnaryFunction[T, A], fn2: UnaryFunction[A, B], fn3: UnaryFunction[B, C]): UnaryFunction[T, C] = js.native
  @JSImport("rxjs/internal-compatibility", "pipe")
  @js.native
  def pipe[T, A, B, C, D](
    fn1: UnaryFunction[T, A],
    fn2: UnaryFunction[A, B],
    fn3: UnaryFunction[B, C],
    fn4: UnaryFunction[C, D]
  ): UnaryFunction[T, D] = js.native
  @JSImport("rxjs/internal-compatibility", "pipe")
  @js.native
  def pipe[T, A, B, C, D, E](
    fn1: UnaryFunction[T, A],
    fn2: UnaryFunction[A, B],
    fn3: UnaryFunction[B, C],
    fn4: UnaryFunction[C, D],
    fn5: UnaryFunction[D, E]
  ): UnaryFunction[T, E] = js.native
  @JSImport("rxjs/internal-compatibility", "pipe")
  @js.native
  def pipe[T, A, B, C, D, E, F](
    fn1: UnaryFunction[T, A],
    fn2: UnaryFunction[A, B],
    fn3: UnaryFunction[B, C],
    fn4: UnaryFunction[C, D],
    fn5: UnaryFunction[D, E],
    fn6: UnaryFunction[E, F]
  ): UnaryFunction[T, F] = js.native
  @JSImport("rxjs/internal-compatibility", "pipe")
  @js.native
  def pipe[T, A, B, C, D, E, F, G](
    fn1: UnaryFunction[T, A],
    fn2: UnaryFunction[A, B],
    fn3: UnaryFunction[B, C],
    fn4: UnaryFunction[C, D],
    fn5: UnaryFunction[D, E],
    fn6: UnaryFunction[E, F],
    fn7: UnaryFunction[F, G]
  ): UnaryFunction[T, G] = js.native
  @JSImport("rxjs/internal-compatibility", "pipe")
  @js.native
  def pipe[T, A, B, C, D, E, F, G, H](
    fn1: UnaryFunction[T, A],
    fn2: UnaryFunction[A, B],
    fn3: UnaryFunction[B, C],
    fn4: UnaryFunction[C, D],
    fn5: UnaryFunction[D, E],
    fn6: UnaryFunction[E, F],
    fn7: UnaryFunction[F, G],
    fn8: UnaryFunction[G, H]
  ): UnaryFunction[T, H] = js.native
  @JSImport("rxjs/internal-compatibility", "pipe")
  @js.native
  def pipe[T, A, B, C, D, E, F, G, H, I](
    fn1: UnaryFunction[T, A],
    fn2: UnaryFunction[A, B],
    fn3: UnaryFunction[B, C],
    fn4: UnaryFunction[C, D],
    fn5: UnaryFunction[D, E],
    fn6: UnaryFunction[E, F],
    fn7: UnaryFunction[F, G],
    fn8: UnaryFunction[G, H],
    fn9: UnaryFunction[H, I]
  ): UnaryFunction[T, I] = js.native
  @JSImport("rxjs/internal-compatibility", "pipe")
  @js.native
  def pipe[T, A, B, C, D, E, F, G, H, I](
    fn1: UnaryFunction[T, A],
    fn2: UnaryFunction[A, B],
    fn3: UnaryFunction[B, C],
    fn4: UnaryFunction[C, D],
    fn5: UnaryFunction[D, E],
    fn6: UnaryFunction[E, F],
    fn7: UnaryFunction[F, G],
    fn8: UnaryFunction[G, H],
    fn9: UnaryFunction[H, I],
    fns: (UnaryFunction[_, _])*
  ): UnaryFunction[T, js.Object] = js.native
  
  @JSImport("rxjs/internal-compatibility", "rxSubscriber")
  @js.native
  val rxSubscriber: String | js.Symbol = js.native
  
  @JSImport("rxjs/internal-compatibility", "subscribeTo")
  @js.native
  def subscribeTo[T](result: ObservableInput[T]): js.Function1[
    /* subscriber */ typingsSlinky.rxjs.subscriberMod.Subscriber[T], 
    Unit | Subscription
  ] = js.native
  
  @JSImport("rxjs/internal-compatibility", "subscribeToArray")
  @js.native
  def subscribeToArray[T](array: ArrayLike[T]): js.Function1[/* subscriber */ typingsSlinky.rxjs.subscriberMod.Subscriber[T], Unit] = js.native
  
  @JSImport("rxjs/internal-compatibility", "subscribeToIterable")
  @js.native
  def subscribeToIterable[T](iterable: js.Iterable[T]): js.Function1[
    /* subscriber */ typingsSlinky.rxjs.subscriberMod.Subscriber[T], 
    typingsSlinky.rxjs.subscriberMod.Subscriber[T]
  ] = js.native
  
  @JSImport("rxjs/internal-compatibility", "subscribeToObservable")
  @js.native
  def subscribeToObservable[T](obj: js.Any): js.Function1[/* subscriber */ typingsSlinky.rxjs.subscriberMod.Subscriber[T], _] = js.native
  
  @JSImport("rxjs/internal-compatibility", "subscribeToPromise")
  @js.native
  def subscribeToPromise[T](promise: js.Thenable[T]): js.Function1[
    /* subscriber */ typingsSlinky.rxjs.subscriberMod.Subscriber[T], 
    typingsSlinky.rxjs.subscriberMod.Subscriber[T]
  ] = js.native
  
  @JSImport("rxjs/internal-compatibility", "subscribeToResult")
  @js.native
  def subscribeToResult[T, R](outerSubscriber: typingsSlinky.rxjs.outerSubscriberMod.OuterSubscriber[T, R], result: js.Any): js.UndefOr[Subscription] = js.native
  @JSImport("rxjs/internal-compatibility", "subscribeToResult")
  @js.native
  def subscribeToResult[T, R](
    outerSubscriber: typingsSlinky.rxjs.outerSubscriberMod.OuterSubscriber[T, R],
    result: js.Any,
    outerValue: T
  ): js.UndefOr[Subscription] = js.native
  @JSImport("rxjs/internal-compatibility", "subscribeToResult")
  @js.native
  def subscribeToResult[T, R](
    outerSubscriber: typingsSlinky.rxjs.outerSubscriberMod.OuterSubscriber[T, R],
    result: js.Any,
    outerValue: T,
    outerIndex: Double
  ): js.UndefOr[Subscription] = js.native
  @JSImport("rxjs/internal-compatibility", "subscribeToResult")
  @js.native
  def subscribeToResult[T, R](
    outerSubscriber: typingsSlinky.rxjs.outerSubscriberMod.OuterSubscriber[T, R],
    result: js.Any,
    outerValue: js.UndefOr[scala.Nothing],
    outerIndex: js.UndefOr[scala.Nothing],
    innerSubscriber: typingsSlinky.rxjs.innerSubscriberMod.InnerSubscriber[T, R]
  ): js.UndefOr[Subscription] = js.native
  @JSImport("rxjs/internal-compatibility", "subscribeToResult")
  @js.native
  def subscribeToResult[T, R](
    outerSubscriber: typingsSlinky.rxjs.outerSubscriberMod.OuterSubscriber[T, R],
    result: js.Any,
    outerValue: js.UndefOr[scala.Nothing],
    outerIndex: Double
  ): js.UndefOr[Subscription] = js.native
  
  @JSImport("rxjs/internal-compatibility", "toSubscriber")
  @js.native
  def toSubscriber[T](): typingsSlinky.rxjs.subscriberMod.Subscriber[T] = js.native
  @JSImport("rxjs/internal-compatibility", "toSubscriber")
  @js.native
  def toSubscriber[T](
    nextOrObserver: js.UndefOr[scala.Nothing],
    error: js.UndefOr[scala.Nothing],
    complete: js.Function0[Unit]
  ): typingsSlinky.rxjs.subscriberMod.Subscriber[T] = js.native
  @JSImport("rxjs/internal-compatibility", "toSubscriber")
  @js.native
  def toSubscriber[T](nextOrObserver: js.UndefOr[scala.Nothing], error: js.Function1[/* error */ js.Any, Unit]): typingsSlinky.rxjs.subscriberMod.Subscriber[T] = js.native
  @JSImport("rxjs/internal-compatibility", "toSubscriber")
  @js.native
  def toSubscriber[T](
    nextOrObserver: js.UndefOr[scala.Nothing],
    error: js.Function1[/* error */ js.Any, Unit],
    complete: js.Function0[Unit]
  ): typingsSlinky.rxjs.subscriberMod.Subscriber[T] = js.native
  @JSImport("rxjs/internal-compatibility", "toSubscriber")
  @js.native
  def toSubscriber[T](nextOrObserver: js.Function1[/* value */ T, Unit]): typingsSlinky.rxjs.subscriberMod.Subscriber[T] = js.native
  @JSImport("rxjs/internal-compatibility", "toSubscriber")
  @js.native
  def toSubscriber[T](
    nextOrObserver: js.Function1[/* value */ T, Unit],
    error: js.UndefOr[scala.Nothing],
    complete: js.Function0[Unit]
  ): typingsSlinky.rxjs.subscriberMod.Subscriber[T] = js.native
  @JSImport("rxjs/internal-compatibility", "toSubscriber")
  @js.native
  def toSubscriber[T](nextOrObserver: js.Function1[/* value */ T, Unit], error: js.Function1[/* error */ js.Any, Unit]): typingsSlinky.rxjs.subscriberMod.Subscriber[T] = js.native
  @JSImport("rxjs/internal-compatibility", "toSubscriber")
  @js.native
  def toSubscriber[T](
    nextOrObserver: js.Function1[/* value */ T, Unit],
    error: js.Function1[/* error */ js.Any, Unit],
    complete: js.Function0[Unit]
  ): typingsSlinky.rxjs.subscriberMod.Subscriber[T] = js.native
  @JSImport("rxjs/internal-compatibility", "toSubscriber")
  @js.native
  def toSubscriber[T](nextOrObserver: PartialObserver[T]): typingsSlinky.rxjs.subscriberMod.Subscriber[T] = js.native
  @JSImport("rxjs/internal-compatibility", "toSubscriber")
  @js.native
  def toSubscriber[T](nextOrObserver: PartialObserver[T], error: js.UndefOr[scala.Nothing], complete: js.Function0[Unit]): typingsSlinky.rxjs.subscriberMod.Subscriber[T] = js.native
  @JSImport("rxjs/internal-compatibility", "toSubscriber")
  @js.native
  def toSubscriber[T](nextOrObserver: PartialObserver[T], error: js.Function1[/* error */ js.Any, Unit]): typingsSlinky.rxjs.subscriberMod.Subscriber[T] = js.native
  @JSImport("rxjs/internal-compatibility", "toSubscriber")
  @js.native
  def toSubscriber[T](
    nextOrObserver: PartialObserver[T],
    error: js.Function1[/* error */ js.Any, Unit],
    complete: js.Function0[Unit]
  ): typingsSlinky.rxjs.subscriberMod.Subscriber[T] = js.native
  
  @JSImport("rxjs/internal-compatibility", "tryCatch")
  @js.native
  def tryCatch[T /* <: js.Function */](fn: T): T = js.native
  
  @JSImport("rxjs/internal-compatibility", "webSocket")
  @js.native
  def webSocket[T](urlConfigOrSource: String): typingsSlinky.rxjs.webSocketSubjectMod.WebSocketSubject[T] = js.native
  @JSImport("rxjs/internal-compatibility", "webSocket")
  @js.native
  def webSocket[T](urlConfigOrSource: WebSocketSubjectConfig[T]): typingsSlinky.rxjs.webSocketSubjectMod.WebSocketSubject[T] = js.native
}
