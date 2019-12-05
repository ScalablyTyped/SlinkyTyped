package typingsSlinky.rxDotWamp.rxDotWampMod

import typingsSlinky.autobahn.autobahnMod.IError
import typingsSlinky.autobahn.autobahnMod.ISubscription
import typingsSlinky.rxDashCore.Rx.Observer
import typingsSlinky.rxDashLite.Rx.IObservable
import typingsSlinky.rxDashLiteDashAggregates.Rx.Observable
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

