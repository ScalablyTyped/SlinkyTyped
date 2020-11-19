package typingsSlinky.rxWamp.mod

import typingsSlinky.autobahn.mod.IError
import typingsSlinky.autobahn.mod.ISubscription
import typingsSlinky.rx.Rx.IObservable
import typingsSlinky.rx.Rx.Observable
import typingsSlinky.rx.Rx.Observer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPubSubSubject
  extends Observable[IWampEvent]
     with Observer[IWampEvent] {
  
  var errors: IObservable[IError] = js.native
  
  var observable: Observable[IWampEvent] = js.native
  
  var observer: Observer[IWampEvent] = js.native
  
  var opened: IObservable[ISubscription] = js.native
}
