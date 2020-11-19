package typingsSlinky.rxWamp.mod

import typingsSlinky.autobahn.mod.Connection
import typingsSlinky.autobahn.mod.ICallOptions
import typingsSlinky.autobahn.mod.IConnectionOptions
import typingsSlinky.autobahn.mod.IPublication
import typingsSlinky.autobahn.mod.IPublishOptions
import typingsSlinky.autobahn.mod.IRegisterOptions
import typingsSlinky.autobahn.mod.IRegistration
import typingsSlinky.autobahn.mod.ISubscribeOptions
import typingsSlinky.autobahn.mod.ISubscription
import typingsSlinky.autobahn.mod.RegisterEndpoint
import typingsSlinky.autobahn.mod.Session
import typingsSlinky.rx.Rx.IObserver
import typingsSlinky.rx.Rx.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IObservableWampStatic extends js.Object {
  
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
