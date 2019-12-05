package typingsSlinky.rxDashCoreDashBinding.Rx

import typingsSlinky.rxDashCore.Rx.IDisposable
import typingsSlinky.rxDashCore.Rx.Observer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISubject[T]
  extends Observable[T]
     with Observer[T]
     with IDisposable {
  def hasObservers(): Boolean = js.native
}

