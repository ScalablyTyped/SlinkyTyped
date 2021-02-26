package typingsSlinky.rxWamp

import typingsSlinky.autobahn.mod.Connection
import typingsSlinky.autobahn.mod.ICallOptions
import typingsSlinky.autobahn.mod.IConnectionOptions
import typingsSlinky.autobahn.mod.IError
import typingsSlinky.autobahn.mod.IEvent
import typingsSlinky.autobahn.mod.IPublication
import typingsSlinky.autobahn.mod.IPublishOptions
import typingsSlinky.autobahn.mod.IRegisterOptions
import typingsSlinky.autobahn.mod.IRegistration
import typingsSlinky.autobahn.mod.ISubscribeOptions
import typingsSlinky.autobahn.mod.ISubscription
import typingsSlinky.autobahn.mod.RegisterEndpoint
import typingsSlinky.autobahn.mod.Session
import typingsSlinky.rx.Rx.IObservable
import typingsSlinky.rx.Rx.IObserver
import typingsSlinky.rx.Rx.Observable
import typingsSlinky.rx.Rx.Observer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rx.wamp", "Subscriber")
  @js.native
  class Subscriber () extends StObject {
    
    def dispose(): Unit = js.native
    
    def to(topic: String, options: ISubscribeOptions): Subscriber = js.native
    def to(
      topic: String,
      options: ISubscribeOptions,
      observerOrOnNext: js.UndefOr[scala.Nothing],
      onError: js.UndefOr[scala.Nothing],
      onCompleted: js.Function0[Unit]
    ): Subscriber = js.native
    def to(
      topic: String,
      options: ISubscribeOptions,
      observerOrOnNext: js.UndefOr[scala.Nothing],
      onError: js.Function1[/* exception */ js.Any, Unit]
    ): Subscriber = js.native
    def to(
      topic: String,
      options: ISubscribeOptions,
      observerOrOnNext: js.UndefOr[scala.Nothing],
      onError: js.Function1[/* exception */ js.Any, Unit],
      onCompleted: js.Function0[Unit]
    ): Subscriber = js.native
    def to(
      topic: String,
      options: ISubscribeOptions,
      observerOrOnNext: js.Function1[/* value */ IWampEvent, Unit]
    ): Subscriber = js.native
    def to(
      topic: String,
      options: ISubscribeOptions,
      observerOrOnNext: js.Function1[/* value */ IWampEvent, Unit],
      onError: js.UndefOr[scala.Nothing],
      onCompleted: js.Function0[Unit]
    ): Subscriber = js.native
    def to(
      topic: String,
      options: ISubscribeOptions,
      observerOrOnNext: js.Function1[/* value */ IWampEvent, Unit],
      onError: js.Function1[/* exception */ js.Any, Unit]
    ): Subscriber = js.native
    def to(
      topic: String,
      options: ISubscribeOptions,
      observerOrOnNext: js.Function1[/* value */ IWampEvent, Unit],
      onError: js.Function1[/* exception */ js.Any, Unit],
      onCompleted: js.Function0[Unit]
    ): Subscriber = js.native
    def to(topic: String, options: ISubscribeOptions, observerOrOnNext: IObserver[IWampEvent]): Subscriber = js.native
    def to(
      topic: String,
      options: ISubscribeOptions,
      observerOrOnNext: IObserver[IWampEvent],
      onError: js.UndefOr[scala.Nothing],
      onCompleted: js.Function0[Unit]
    ): Subscriber = js.native
    def to(
      topic: String,
      options: ISubscribeOptions,
      observerOrOnNext: IObserver[IWampEvent],
      onError: js.Function1[/* exception */ js.Any, Unit]
    ): Subscriber = js.native
    def to(
      topic: String,
      options: ISubscribeOptions,
      observerOrOnNext: IObserver[IWampEvent],
      onError: js.Function1[/* exception */ js.Any, Unit],
      onCompleted: js.Function0[Unit]
    ): Subscriber = js.native
  }
  
  @js.native
  trait IObservableWampStatic extends StObject {
    
    def callAsObservable[TResult](session: Session, procedure: String): js.Function2[
        /* args */ js.UndefOr[js.Array[_]], 
        /* kwargs */ js.UndefOr[js.Any], 
        Observable[TResult]
      ] = js.native
    def callAsObservable[TResult](session: Session, procedure: String, options: ICallOptions): js.Function2[
        /* args */ js.UndefOr[js.Array[_]], 
        /* kwargs */ js.UndefOr[js.Any], 
        Observable[TResult]
      ] = js.native
    
    def fromConnection(options: IConnectionOptions): Observable[Session] = js.native
    def fromConnection(
      options: IConnectionOptions,
      keepReconnecting: js.UndefOr[scala.Nothing],
      factory: js.Function1[/* options */ js.UndefOr[IConnectionOptions], Connection]
    ): Observable[Session] = js.native
    def fromConnection(options: IConnectionOptions, keepReconnecting: Boolean): Observable[Session] = js.native
    def fromConnection(
      options: IConnectionOptions,
      keepReconnecting: Boolean,
      factory: js.Function1[/* options */ js.UndefOr[IConnectionOptions], Connection]
    ): Observable[Session] = js.native
    
    def fromPubSubPattern(session: Session, topic: String, options: ISubscribeOptions): IPubSubSubject = js.native
    def fromPubSubPattern(
      session: Session,
      topic: String,
      options: ISubscribeOptions,
      openObserver: IObserver[ISubscription]
    ): IPubSubSubject = js.native
    
    def publishAsObservable(session: Session, topic: String): Observable[IPublication] = js.native
    def publishAsObservable(
      session: Session,
      topic: String,
      args: js.UndefOr[scala.Nothing],
      kwargs: js.UndefOr[scala.Nothing],
      options: IPublishOptions
    ): Observable[IPublication] = js.native
    def publishAsObservable(session: Session, topic: String, args: js.UndefOr[scala.Nothing], kwargs: js.Any): Observable[IPublication] = js.native
    def publishAsObservable(
      session: Session,
      topic: String,
      args: js.UndefOr[scala.Nothing],
      kwargs: js.Any,
      options: IPublishOptions
    ): Observable[IPublication] = js.native
    def publishAsObservable(session: Session, topic: String, args: js.Array[_]): Observable[IPublication] = js.native
    def publishAsObservable(
      session: Session,
      topic: String,
      args: js.Array[_],
      kwargs: js.UndefOr[scala.Nothing],
      options: IPublishOptions
    ): Observable[IPublication] = js.native
    def publishAsObservable(session: Session, topic: String, args: js.Array[_], kwargs: js.Any): Observable[IPublication] = js.native
    def publishAsObservable(session: Session, topic: String, args: js.Array[_], kwargs: js.Any, options: IPublishOptions): Observable[IPublication] = js.native
    
    def registerAsObservable(
      sessionOrObservable: Session,
      procedure: String,
      endpoint: RegisterEndpoint,
      options: IRegisterOptions
    ): Observable[IRegistration] = js.native
    def registerAsObservable(
      sessionOrObservable: Observable[Session],
      procedure: String,
      endpoint: RegisterEndpoint,
      options: IRegisterOptions
    ): Observable[IRegistration] = js.native
    
    def subscribeAsObservable(sessionOrObservable: Session, topic: String): Observable[IWampEvent] = js.native
    def subscribeAsObservable(
      sessionOrObservable: Session,
      topic: String,
      options: js.UndefOr[scala.Nothing],
      openObserver: IObserver[ISubscription]
    ): Observable[IWampEvent] = js.native
    def subscribeAsObservable(sessionOrObservable: Session, topic: String, options: ISubscribeOptions): Observable[IWampEvent] = js.native
    def subscribeAsObservable(
      sessionOrObservable: Session,
      topic: String,
      options: ISubscribeOptions,
      openObserver: IObserver[ISubscription]
    ): Observable[IWampEvent] = js.native
    def subscribeAsObservable(sessionOrObservable: Observable[Session], topic: String): Observable[IWampEvent] = js.native
    def subscribeAsObservable(
      sessionOrObservable: Observable[Session],
      topic: String,
      options: js.UndefOr[scala.Nothing],
      openObserver: IObserver[ISubscription]
    ): Observable[IWampEvent] = js.native
    def subscribeAsObservable(sessionOrObservable: Observable[Session], topic: String, options: ISubscribeOptions): Observable[IWampEvent] = js.native
    def subscribeAsObservable(
      sessionOrObservable: Observable[Session],
      topic: String,
      options: ISubscribeOptions,
      openObserver: IObserver[ISubscription]
    ): Observable[IWampEvent] = js.native
    
    def subscriber(sessionOrObservable: Session): Subscriber = js.native
    def subscriber(sessionOrObservable: Observable[_]): Subscriber = js.native
  }
  
  @js.native
  trait IPubSubSubject
    extends Observable[IWampEvent]
       with Observer[IWampEvent] {
    
    var errors: IObservable[IError] = js.native
    
    var observable: Observable[IWampEvent] = js.native
    
    var observer: Observer[IWampEvent] = js.native
    
    var opened: IObservable[ISubscription] = js.native
  }
  
  @js.native
  trait IWampEvent extends StObject {
    
    var args: js.UndefOr[js.Array[_]] = js.native
    
    var details: js.UndefOr[IEvent] = js.native
    
    var kwargs: js.UndefOr[js.Any] = js.native
  }
  object IWampEvent {
    
    @scala.inline
    def apply(): IWampEvent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IWampEvent]
    }
    
    @scala.inline
    implicit class IWampEventMutableBuilder[Self <: IWampEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgs(value: js.Array[_]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      @scala.inline
      def setArgsVarargs(value: js.Any*): Self = StObject.set(x, "args", js.Array(value :_*))
      
      @scala.inline
      def setDetails(value: IEvent): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
      
      @scala.inline
      def setKwargs(value: js.Any): Self = StObject.set(x, "kwargs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKwargsUndefined: Self = StObject.set(x, "kwargs", js.undefined)
    }
  }
  
  /* augmented module */
  object rxAugmentingMod {
    
    // Patch ObservableStatic to contain observableWamp methods.
    type ObservableStatic = IObservableWampStatic
  }
}
