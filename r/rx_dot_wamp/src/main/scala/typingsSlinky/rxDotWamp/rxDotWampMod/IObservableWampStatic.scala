package typingsSlinky.rxDotWamp.rxDotWampMod

import typingsSlinky.autobahn.autobahnMod.Connection
import typingsSlinky.autobahn.autobahnMod.ICallOptions
import typingsSlinky.autobahn.autobahnMod.IConnectionOptions
import typingsSlinky.autobahn.autobahnMod.IPublication
import typingsSlinky.autobahn.autobahnMod.IPublishOptions
import typingsSlinky.autobahn.autobahnMod.IRegisterOptions
import typingsSlinky.autobahn.autobahnMod.IRegistration
import typingsSlinky.autobahn.autobahnMod.ISubscribeOptions
import typingsSlinky.autobahn.autobahnMod.ISubscription
import typingsSlinky.autobahn.autobahnMod.RegisterEndpoint
import typingsSlinky.autobahn.autobahnMod.Session
import typingsSlinky.rxDashLite.Rx.IObserver
import typingsSlinky.rxDashLiteDashAggregates.Rx.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def publishAsObservable(session: Session, topic: String, args: js.Array[_]): Observable[IPublication] = js.native
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
  def subscribeAsObservable(sessionOrObservable: Session, topic: String, options: ISubscribeOptions): Observable[IWampEvent] = js.native
  def subscribeAsObservable(
    sessionOrObservable: Session,
    topic: String,
    options: ISubscribeOptions,
    openObserver: IObserver[ISubscription]
  ): Observable[IWampEvent] = js.native
  def subscribeAsObservable(sessionOrObservable: Observable[Session], topic: String): Observable[IWampEvent] = js.native
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

