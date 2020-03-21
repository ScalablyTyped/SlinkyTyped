package typingsSlinky.rxWamp.mod

import typingsSlinky.autobahn.mod.IError
import typingsSlinky.autobahn.mod.ISubscription
import typingsSlinky.rxCore.Rx.Observer
import typingsSlinky.rxLite.Rx.IObservable
import typingsSlinky.rxLiteAggregates.Rx.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPubSubSubject
  extends Observable[IWampEvent]
     with Observer[IWampEvent] {
  var errors: IObservable[IError] = js.native
  var observable: Observable[IWampEvent] = js.native
  var observer: Observer[IWampEvent] = js.native
  var opened: IObservable[ISubscription] = js.native
}

