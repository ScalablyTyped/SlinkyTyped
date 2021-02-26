package typingsSlinky.rx

import typingsSlinky.rx.Rx.AnonymousObserver
import typingsSlinky.rx.Rx.AnonymousObserverStatic
import typingsSlinky.rx.Rx.AnonymousSubjectStatic
import typingsSlinky.rx.Rx.AsyncSubjectStatic
import typingsSlinky.rx.Rx.BehaviorSubject
import typingsSlinky.rx.Rx.BehaviorSubjectStatic
import typingsSlinky.rx.Rx.Comparer
import typingsSlinky.rx.Rx.CompositeDisposable
import typingsSlinky.rx.Rx.CompositeDisposableStatic
import typingsSlinky.rx.Rx.Disposable
import typingsSlinky.rx.Rx.DisposableStatic
import typingsSlinky.rx.Rx.IDisposable
import typingsSlinky.rx.Rx.IPromise
import typingsSlinky.rx.Rx.IScheduler
import typingsSlinky.rx.Rx.MockObserver
import typingsSlinky.rx.Rx.MockObserverStatic
import typingsSlinky.rx.Rx.Notification
import typingsSlinky.rx.Rx.NotificationStatic
import typingsSlinky.rx.Rx.Observable
import typingsSlinky.rx.Rx.ObservableStatic
import typingsSlinky.rx.Rx.ObserverStatic
import typingsSlinky.rx.Rx.Recorded
import typingsSlinky.rx.Rx.RecordedStatic
import typingsSlinky.rx.Rx.RefCountDisposable
import typingsSlinky.rx.Rx.RefCountDisposableStatic
import typingsSlinky.rx.Rx.ReplaySubjectStatic
import typingsSlinky.rx.Rx.SchedulerStatic
import typingsSlinky.rx.Rx.SerialDisposable
import typingsSlinky.rx.Rx.SerialDisposableStatic
import typingsSlinky.rx.Rx.SingleAssignmentDisposable
import typingsSlinky.rx.Rx.SingleAssignmentDisposableStatic
import typingsSlinky.rx.Rx.Subject
import typingsSlinky.rx.Rx.SubjectStatic
import typingsSlinky.rx.Rx.Subscription
import typingsSlinky.rx.Rx.SubscriptionStatic
import typingsSlinky.rx.Rx.TestScheduler
import typingsSlinky.rx.Rx.VirtualTimeScheduler
import typingsSlinky.rx.Rx.internals.AbstractObserver
import typingsSlinky.rx.Rx.internals.AbstractObserverStatic
import typingsSlinky.rx.Rx.internals.NotImplementedError
import typingsSlinky.rx.Rx.internals.NotSupportedError
import typingsSlinky.rx.Rx.internals.PriorityQueue
import typingsSlinky.rx.Rx.internals.PriorityQueueStatic
import typingsSlinky.rx.Rx.internals.SchedulePeriodicRecursive
import typingsSlinky.rx.Rx.internals.SchedulePeriodicRecursiveStatic
import typingsSlinky.rx.Rx.internals.ScheduledItem
import typingsSlinky.rx.Rx.internals.ScheduledItemStatic
import typingsSlinky.rx.anon.GetDisposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rxAllMod {
  
  @JSImport("rx.all", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rx.all", "AnonymousObserver")
  @js.native
  def AnonymousObserver: AnonymousObserverStatic = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rx.all", "AnonymousObserver")
  @js.native
  /**
    * Creates an observer from the specified OnNext, OnError, and OnCompleted actions.
    * @param {Any} onNext Observer's OnNext action implementation.
    * @param {Any} onError Observer's OnError action implementation.
    * @param {Any} onCompleted Observer's OnCompleted action implementation.
    */
  class AnonymousObserverCls[T] () extends AnonymousObserver[T] {
    def this(onNext: js.Function1[/* value */ T, Unit]) = this()
    def this(onNext: js.UndefOr[scala.Nothing], onError: js.Function1[/* exception */ js.Any, Unit]) = this()
    def this(onNext: js.Function1[/* value */ T, Unit], onError: js.Function1[/* exception */ js.Any, Unit]) = this()
    def this(
      onNext: js.UndefOr[scala.Nothing],
      onError: js.UndefOr[scala.Nothing],
      onCompleted: js.Function0[Unit]
    ) = this()
    def this(
      onNext: js.UndefOr[scala.Nothing],
      onError: js.Function1[/* exception */ js.Any, Unit],
      onCompleted: js.Function0[Unit]
    ) = this()
    def this(
      onNext: js.Function1[/* value */ T, Unit],
      onError: js.UndefOr[scala.Nothing],
      onCompleted: js.Function0[Unit]
    ) = this()
    def this(
      onNext: js.Function1[/* value */ T, Unit],
      onError: js.Function1[/* exception */ js.Any, Unit],
      onCompleted: js.Function0[Unit]
    ) = this()
  }
  
  @scala.inline
  def AnonymousObserver_=(x: AnonymousObserverStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AnonymousObserver")(x.asInstanceOf[js.Any])
  
  @JSImport("rx.all", "AnonymousSubject")
  @js.native
  def AnonymousSubject: AnonymousSubjectStatic = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rx.all", "AnonymousSubject")
  @js.native
  /**
    * Creates a subject that can only receive one value and that value is cached for all future observations.
    * @constructor
    */
  class AnonymousSubjectCls[T] () extends Subject[T]
  
  @scala.inline
  def AnonymousSubject_=(x: AnonymousSubjectStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AnonymousSubject")(x.asInstanceOf[js.Any])
  
  @JSImport("rx.all", "AsyncSubject")
  @js.native
  def AsyncSubject: AsyncSubjectStatic = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rx.all", "AsyncSubject")
  @js.native
  /**
    * Creates a subject that can only receive one value and that value is cached for all future observations.
    * @constructor
    */
  class AsyncSubjectCls[T] () extends Subject[T]
  
  @scala.inline
  def AsyncSubject_=(x: AsyncSubjectStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AsyncSubject")(x.asInstanceOf[js.Any])
  
  @JSImport("rx.all", "BehaviorSubject")
  @js.native
  def BehaviorSubject: BehaviorSubjectStatic = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rx.all", "BehaviorSubject")
  @js.native
  class BehaviorSubjectCls[T] protected () extends BehaviorSubject[T] {
    /**
      *  Initializes a new instance of the BehaviorSubject class which creates a subject that caches its last value and starts with the specified value.
      *  @param {Mixed} value Initial value sent to observers when no other value has been received by the subject yet.
      */
    def this(initialValue: T) = this()
  }
  
  @scala.inline
  def BehaviorSubject_=(x: BehaviorSubjectStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BehaviorSubject")(x.asInstanceOf[js.Any])
  
  @JSImport("rx.all", "CompositeDisposable")
  @js.native
  def CompositeDisposable: CompositeDisposableStatic = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rx.all", "CompositeDisposable")
  @js.native
  class CompositeDisposableCls protected () extends CompositeDisposable {
    /**
      * Represents a group of disposable resources that are disposed together.
      * @constructor
      */
    def this(disposables: IDisposable*) = this()
    /**
      * Represents a group of disposable resources that are disposed together.
      * @constructor
      */
    def this(disposables: js.Array[IDisposable]) = this()
  }
  
  @scala.inline
  def CompositeDisposable_=(x: CompositeDisposableStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CompositeDisposable")(x.asInstanceOf[js.Any])
  
  @JSImport("rx.all", "Disposable")
  @js.native
  def Disposable: DisposableStatic = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rx.all", "Disposable")
  @js.native
  class DisposableCls protected () extends Disposable {
    /**
      * Provides a set of static methods for creating Disposables.
      * @param {Function} dispose Action to run during the first call to dispose. The action is guaranteed to be run at most once.
      */
    def this(action: js.Function0[Unit]) = this()
  }
  
  @scala.inline
  def Disposable_=(x: DisposableStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Disposable")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rx.all", "HistoricalScheduler")
  @js.native
  class HistoricalSchedulerCls protected () extends VirtualTimeScheduler[Double, Double] {
    /**
      * Creates a new historical scheduler with the specified initial clock value.
      * @constructor
      * @param {Number} initialClock Initial value for the clock.
      * @param {Function} comparer Comparer to determine causality of events based on absolute time.
      */
    def this(initialClock: Double, comparer: Comparer[Double, Double]) = this()
  }
  
  @JSImport("rx.all", "MockObserver")
  @js.native
  def MockObserver: MockObserverStatic = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rx.all", "MockObserver")
  @js.native
  class MockObserverCls[T] protected () extends MockObserver[T] {
    def this(scheduler: IScheduler) = this()
  }
  
  @scala.inline
  def MockObserver_=(x: MockObserverStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MockObserver")(x.asInstanceOf[js.Any])
  
  @JSImport("rx.all", "Notification")
  @js.native
  def Notification: NotificationStatic = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rx.all", "Notification")
  @js.native
  class NotificationCls[T] protected () extends Notification[T] {
    def this(
      kind: js.Any,
      value: js.Any,
      exception: js.Any,
      accept: js.Any,
      acceptObservable: js.Any,
      toString: js.Any
    ) = this()
  }
  
  @scala.inline
  def Notification_=(x: NotificationStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Notification")(x.asInstanceOf[js.Any])
  
  @JSImport("rx.all", "Observable")
  @js.native
  def Observable: ObservableStatic = js.native
  @scala.inline
  def Observable_=(x: ObservableStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Observable")(x.asInstanceOf[js.Any])
  
  @JSImport("rx.all", "Observer")
  @js.native
  def Observer: ObserverStatic = js.native
  @scala.inline
  def Observer_=(x: ObserverStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Observer")(x.asInstanceOf[js.Any])
  
  @JSImport("rx.all", "Plan")
  @js.native
  class Plan[T] ()
    extends typingsSlinky.rx.Rx.Plan[T]
  
  object ReactiveTest {
    
    @JSImport("rx.all", "ReactiveTest")
    @js.native
    val ^ : js.Any = js.native
    
    /** Default virtual time used for creation of observable sequences in unit tests. */
    @JSImport("rx.all", "ReactiveTest.created")
    @js.native
    def created: Double = js.native
    @scala.inline
    def created_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("created")(x.asInstanceOf[js.Any])
    
    /** Default virtual time used to dispose subscriptions in unit tests. */
    @JSImport("rx.all", "ReactiveTest.disposed")
    @js.native
    def disposed: Double = js.native
    @scala.inline
    def disposed_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disposed")(x.asInstanceOf[js.Any])
    
    /**
      * Factory method for an OnCompleted notification record at a given time.
      *
      * @param ticks Recorded virtual time the OnCompleted notification occurs.
      * @return Recorded OnCompleted notification.
      */
    @JSImport("rx.all", "ReactiveTest.onCompleted")
    @js.native
    def onCompleted(ticks: Double): Recorded = js.native
    
    /**
      * Factory method for an OnError notification record at a given time with a given error.
      *
      * 1 - ReactiveTest.onNext(200, new Error('error'));
      * 2 - ReactiveTest.onNext(200, function (e) { return e.message === 'error'; });
      *
      * @param ticks Recorded virtual time the OnError notification occurs.
      * @param exception Recorded exception stored in the OnError notification.
      * @return Recorded OnError notification.
      */
    @JSImport("rx.all", "ReactiveTest.onError")
    @js.native
    def onError(ticks: Double, exception: js.Any): Recorded = js.native
    /**
      * Factory method for an OnError notification record at a given time with a given error.
      *
      * 1 - ReactiveTest.onNext(200, new Error('error'));
      * 2 - ReactiveTest.onNext(200, function (e) { return e.message === 'error'; });
      *
      * @param ticks Recorded virtual time the OnError notification occurs.
      * @param exception Recorded exception stored in the OnError notification.
      * @return Recorded OnError notification.
      */
    @JSImport("rx.all", "ReactiveTest.onError")
    @js.native
    def onError(ticks: Double, predicate: js.Function1[/* exception */ js.Any, Boolean]): Recorded = js.native
    
    /**
      * Factory method for an OnNext notification record at a given time with a given value or a predicate function.
      *
      * 1 - ReactiveTest.onNext(200, 42);
      * 2 - ReactiveTest.onNext(200, function (x) { return x.length == 2; });
      *
      * @param ticks Recorded virtual time the OnNext notification occurs.
      * @param value Recorded value stored in the OnNext notification or a predicate.
      * @return Recorded OnNext notification.
      */
    @JSImport("rx.all", "ReactiveTest.onNext")
    @js.native
    def onNext(ticks: Double, predicate: js.Function1[/* value */ js.Any, Boolean]): Recorded = js.native
    /**
      * Factory method for an OnNext notification record at a given time with a given value or a predicate function.
      *
      * 1 - ReactiveTest.onNext(200, 42);
      * 2 - ReactiveTest.onNext(200, function (x) { return x.length == 2; });
      *
      * @param ticks Recorded virtual time the OnNext notification occurs.
      * @param value Recorded value stored in the OnNext notification or a predicate.
      * @return Recorded OnNext notification.
      */
    @JSImport("rx.all", "ReactiveTest.onNext")
    @js.native
    def onNext(ticks: Double, value: js.Any): Recorded = js.native
    
    /**
      * Factory method for a subscription record based on a given subscription and disposal time.
      *
      * @param start Virtual time indicating when the subscription was created.
      * @param end Virtual time indicating when the subscription was disposed.
      * @return Subscription object.
      */
    @JSImport("rx.all", "ReactiveTest.subscribe")
    @js.native
    def subscribe(subscribeAt: Double): Subscription = js.native
    @JSImport("rx.all", "ReactiveTest.subscribe")
    @js.native
    def subscribe(subscribeAt: Double, unsubscribeAt: Double): Subscription = js.native
    
    /** Default virtual time used to subscribe to observable sequences in unit tests. */
    @JSImport("rx.all", "ReactiveTest.subscribed")
    @js.native
    def subscribed: Double = js.native
    @scala.inline
    def subscribed_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("subscribed")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("rx.all", "Recorded")
  @js.native
  def Recorded: RecordedStatic = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rx.all", "Recorded")
  @js.native
  class RecordedCls protected () extends Recorded {
    /**
      * Creates a new object recording the production of the specified value at the given virtual time.
      *
      * @constructor
      * @param {Number} time Virtual time the value was produced on.
      * @param {Mixed} value Value that was produced.
      * @param {Function} comparer An optional comparer.
      */
    def this(time: Double, value: js.Any) = this()
    def this(time: Double, value: js.Any, equalityComparer: Comparer[_, Boolean]) = this()
  }
  
  @scala.inline
  def Recorded_=(x: RecordedStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Recorded")(x.asInstanceOf[js.Any])
  
  @JSImport("rx.all", "RefCountDisposable")
  @js.native
  def RefCountDisposable: RefCountDisposableStatic = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rx.all", "RefCountDisposable")
  @js.native
  class RefCountDisposableCls protected () extends RefCountDisposable {
    /**
      * Initializes a new instance of the RefCountDisposable with the specified disposable.
      * @constructor
      * @param {Disposable} disposable Underlying disposable.
      */
    def this(disposable: IDisposable) = this()
  }
  
  @scala.inline
  def RefCountDisposable_=(x: RefCountDisposableStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RefCountDisposable")(x.asInstanceOf[js.Any])
  
  @JSImport("rx.all", "ReplaySubject")
  @js.native
  def ReplaySubject: ReplaySubjectStatic = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rx.all", "ReplaySubject")
  @js.native
  /**
    *  Initializes a new instance of the ReplaySubject class with the specified buffer size, window size and scheduler.
    *  @param {Number} [bufferSize] Maximum element count of the replay buffer.
    *  @param {Number} [windowSize] Maximum time length of the replay buffer.
    *  @param {Scheduler} [scheduler] Scheduler the observers are invoked on.
    */
  class ReplaySubjectCls[T] () extends Subject[T] {
    def this(bufferSize: Double) = this()
    def this(bufferSize: js.UndefOr[scala.Nothing], window: Double) = this()
    def this(bufferSize: Double, window: Double) = this()
    def this(bufferSize: js.UndefOr[scala.Nothing], window: js.UndefOr[scala.Nothing], scheduler: IScheduler) = this()
    def this(bufferSize: js.UndefOr[scala.Nothing], window: Double, scheduler: IScheduler) = this()
    def this(bufferSize: Double, window: js.UndefOr[scala.Nothing], scheduler: IScheduler) = this()
    def this(bufferSize: Double, window: Double, scheduler: IScheduler) = this()
  }
  
  @scala.inline
  def ReplaySubject_=(x: ReplaySubjectStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ReplaySubject")(x.asInstanceOf[js.Any])
  
  @JSImport("rx.all", "Scheduler")
  @js.native
  def Scheduler: SchedulerStatic = js.native
  @scala.inline
  def Scheduler_=(x: SchedulerStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Scheduler")(x.asInstanceOf[js.Any])
  
  @JSImport("rx.all", "SerialDisposable")
  @js.native
  def SerialDisposable: SerialDisposableStatic = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rx.all", "SerialDisposable")
  @js.native
  class SerialDisposableCls () extends SerialDisposable
  
  @scala.inline
  def SerialDisposable_=(x: SerialDisposableStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SerialDisposable")(x.asInstanceOf[js.Any])
  
  @JSImport("rx.all", "SingleAssignmentDisposable")
  @js.native
  def SingleAssignmentDisposable: SingleAssignmentDisposableStatic = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rx.all", "SingleAssignmentDisposable")
  @js.native
  class SingleAssignmentDisposableCls () extends SingleAssignmentDisposable
  
  @scala.inline
  def SingleAssignmentDisposable_=(x: SingleAssignmentDisposableStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SingleAssignmentDisposable")(x.asInstanceOf[js.Any])
  
  @JSImport("rx.all", "Subject")
  @js.native
  def Subject: SubjectStatic = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rx.all", "Subject")
  @js.native
  /**
    * Creates a subject.
    */
  class SubjectCls[T] () extends Subject[T]
  
  @scala.inline
  def Subject_=(x: SubjectStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Subject")(x.asInstanceOf[js.Any])
  
  @JSImport("rx.all", "Subscription")
  @js.native
  def Subscription: SubscriptionStatic = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rx.all", "Subscription")
  @js.native
  class SubscriptionCls protected () extends Subscription {
    /**
      * Creates a new subscription object with the given virtual subscription and unsubscription time.
      *
      * @constructor
      * @param {Number} subscribe Virtual time at which the subscription occurred.
      * @param {Number} unsubscribe Virtual time at which the unsubscription occurred.
      */
    def this(subscribeAt: Double) = this()
    def this(subscribeAt: Double, unsubscribeAt: Double) = this()
  }
  
  @scala.inline
  def Subscription_=(x: SubscriptionStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Subscription")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rx.all", "TestScheduler")
  @js.native
  class TestSchedulerCls () extends TestScheduler
  
  object config {
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("rx.all", "config.Promise")
    @js.native
    class Promise[T] protected () extends IPromise[T] {
      def this(resolver: js.Function2[
                /* resolvePromise */ js.Function1[/* value */ T, Unit], 
                /* rejectPromise */ js.Function1[/* reason */ js.Any, Unit], 
                Unit
              ]) = this()
    }
  }
  
  object helpers {
    
    @JSImport("rx.all", "helpers")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rx.all", "helpers.asArray")
    @js.native
    def asArray: js.Function1[/* repeated */ js.Any, js.Array[js.Any]] = js.native
    @scala.inline
    def asArray_=(x: js.Function1[/* repeated */ js.Any, js.Array[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("asArray")(x.asInstanceOf[js.Any])
    
    @JSImport("rx.all", "helpers.defaultComparer")
    @js.native
    def defaultComparer: js.Function2[/* left */ js.Any, /* right */ js.Any, Boolean] = js.native
    @scala.inline
    def defaultComparer_=(x: js.Function2[/* left */ js.Any, /* right */ js.Any, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultComparer")(x.asInstanceOf[js.Any])
    
    @JSImport("rx.all", "helpers.defaultError")
    @js.native
    def defaultError: js.Function1[/* err */ js.Any, Unit] = js.native
    @scala.inline
    def defaultError_=(x: js.Function1[/* err */ js.Any, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultError")(x.asInstanceOf[js.Any])
    
    @JSImport("rx.all", "helpers.defaultKeySerializer")
    @js.native
    def defaultKeySerializer: js.Function1[/* key */ js.Any, String] = js.native
    @scala.inline
    def defaultKeySerializer_=(x: js.Function1[/* key */ js.Any, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultKeySerializer")(x.asInstanceOf[js.Any])
    
    @JSImport("rx.all", "helpers.defaultNow")
    @js.native
    def defaultNow: js.Function0[Double] = js.native
    @scala.inline
    def defaultNow_=(x: js.Function0[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultNow")(x.asInstanceOf[js.Any])
    
    @JSImport("rx.all", "helpers.defaultSubComparer")
    @js.native
    def defaultSubComparer: js.Function2[/* left */ js.Any, /* right */ js.Any, Double] = js.native
    @scala.inline
    def defaultSubComparer_=(x: js.Function2[/* left */ js.Any, /* right */ js.Any, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultSubComparer")(x.asInstanceOf[js.Any])
    
    @JSImport("rx.all", "helpers.identity")
    @js.native
    def identity: js.Function1[/* value */ js.Any, js.Any] = js.native
    @scala.inline
    def identity_=(x: js.Function1[/* value */ js.Any, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("identity")(x.asInstanceOf[js.Any])
    
    @JSImport("rx.all", "helpers.isFunction")
    @js.native
    def isFunction: js.Function1[/* value */ js.Any, Boolean] = js.native
    @scala.inline
    def isFunction_=(x: js.Function1[/* value */ js.Any, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isFunction")(x.asInstanceOf[js.Any])
    
    @JSImport("rx.all", "helpers.isPromise")
    @js.native
    def isPromise: js.Function1[/* p */ js.Any, Boolean] = js.native
    @scala.inline
    def isPromise_=(x: js.Function1[/* p */ js.Any, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isPromise")(x.asInstanceOf[js.Any])
    
    @JSImport("rx.all", "helpers.noop")
    @js.native
    def noop: js.Function0[Unit] = js.native
    @scala.inline
    def noop_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("noop")(x.asInstanceOf[js.Any])
    
    @JSImport("rx.all", "helpers.not")
    @js.native
    def not: js.Function1[/* value */ js.Any, Boolean] = js.native
    
    @JSImport("rx.all", "helpers.notDefined")
    @js.native
    def notDefined: js.Function1[/* value */ js.Any, Boolean] = js.native
    @scala.inline
    def notDefined_=(x: js.Function1[/* value */ js.Any, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("notDefined")(x.asInstanceOf[js.Any])
    
    @JSImport("rx.all", "helpers.notImplemented")
    @js.native
    def notImplemented: js.Function0[NotImplementedError] = js.native
    @scala.inline
    def notImplemented_=(x: js.Function0[NotImplementedError]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("notImplemented")(x.asInstanceOf[js.Any])
    
    @JSImport("rx.all", "helpers.notSupported")
    @js.native
    def notSupported: js.Function0[NotSupportedError] = js.native
    @scala.inline
    def notSupported_=(x: js.Function0[NotSupportedError]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("notSupported")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def not_=(x: js.Function1[/* value */ js.Any, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("not")(x.asInstanceOf[js.Any])
  }
  
  object internals {
    
    @JSImport("rx.all", "internals")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rx.all", "internals.AbstractObserver")
    @js.native
    def AbstractObserver: AbstractObserverStatic = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("rx.all", "internals.AbstractObserver")
    @js.native
    class AbstractObserverCls[T] () extends AbstractObserver[T]
    
    @scala.inline
    def AbstractObserver_=(x: AbstractObserverStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AbstractObserver")(x.asInstanceOf[js.Any])
    
    @JSImport("rx.all", "internals.PriorityQueue")
    @js.native
    def PriorityQueue: PriorityQueueStatic = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("rx.all", "internals.PriorityQueue")
    @js.native
    class PriorityQueueCls[T] protected () extends PriorityQueue[T] {
      def this(capacity: Double) = this()
    }
    
    @scala.inline
    def PriorityQueue_=(x: PriorityQueueStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PriorityQueue")(x.asInstanceOf[js.Any])
    
    @JSImport("rx.all", "internals.SchedulePeriodicRecursive")
    @js.native
    def SchedulePeriodicRecursive: SchedulePeriodicRecursiveStatic = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("rx.all", "internals.SchedulePeriodicRecursive")
    @js.native
    class SchedulePeriodicRecursiveCls protected () extends SchedulePeriodicRecursive {
      def this(scheduler: js.Any, state: js.Any, period: js.Any, action: js.Any) = this()
    }
    
    @scala.inline
    def SchedulePeriodicRecursive_=(x: SchedulePeriodicRecursiveStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SchedulePeriodicRecursive")(x.asInstanceOf[js.Any])
    
    @JSImport("rx.all", "internals.ScheduledItem")
    @js.native
    def ScheduledItem: ScheduledItemStatic = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("rx.all", "internals.ScheduledItem")
    @js.native
    class ScheduledItemCls[TTime] protected () extends ScheduledItem[TTime] {
      def this(
        scheduler: IScheduler,
        state: js.Any,
        action: js.Function2[/* scheduler */ IScheduler, /* state */ js.Any, IDisposable],
        dueTime: TTime
      ) = this()
      def this(
        scheduler: IScheduler,
        state: js.Any,
        action: js.Function2[/* scheduler */ IScheduler, /* state */ js.Any, IDisposable],
        dueTime: TTime,
        comparer: Comparer[TTime, Double]
      ) = this()
    }
    
    @scala.inline
    def ScheduledItem_=(x: ScheduledItemStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ScheduledItem")(x.asInstanceOf[js.Any])
    
    @JSImport("rx.all", "internals.addProperties")
    @js.native
    def addProperties: js.Function2[/* obj */ js.Any, /* repeated */ js.Any, Unit] = js.native
    @scala.inline
    def addProperties_=(x: js.Function2[/* obj */ js.Any, /* repeated */ js.Any, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("addProperties")(x.asInstanceOf[js.Any])
    
    @JSImport("rx.all", "internals.addRef")
    @js.native
    def addRef: js.Function2[/* xs */ Observable[js.Any], /* r */ GetDisposable, Observable[js.Any]] = js.native
    @scala.inline
    def addRef_=(x: js.Function2[/* xs */ Observable[js.Any], /* r */ GetDisposable, Observable[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("addRef")(x.asInstanceOf[js.Any])
    
    @JSImport("rx.all", "internals.bindCallback")
    @js.native
    def bindCallback: js.Function3[/* func */ js.Function, /* thisArg */ js.Any, /* argCount */ Double, js.Function] = js.native
    @scala.inline
    def bindCallback_=(x: js.Function3[/* func */ js.Function, /* thisArg */ js.Any, /* argCount */ Double, js.Function]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bindCallback")(x.asInstanceOf[js.Any])
    
    @JSImport("rx.all", "internals.inherits")
    @js.native
    def inherits: js.Function2[/* child */ js.Any, /* parent */ js.Any, Unit] = js.native
    @scala.inline
    def inherits_=(x: js.Function2[/* child */ js.Any, /* parent */ js.Any, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inherits")(x.asInstanceOf[js.Any])
    
    @JSImport("rx.all", "internals.isEqual")
    @js.native
    def isEqual: js.Function2[/* left */ js.Any, /* right */ js.Any, Boolean] = js.native
    @scala.inline
    def isEqual_=(x: js.Function2[/* left */ js.Any, /* right */ js.Any, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isEqual")(x.asInstanceOf[js.Any])
  }
}
