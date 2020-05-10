package typingsSlinky.rxLiteTesting.Rx

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.rxCore.Rx.Observer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MockObserver[T] extends Observer[T] {
  var messages: js.Array[Recorded] = js.native
}

@JSGlobal("Rx.MockObserver")
@js.native
object MockObserver extends TopLevel[MockObserverStatic]

