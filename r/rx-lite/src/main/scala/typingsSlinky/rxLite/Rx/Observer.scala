package typingsSlinky.rxLite.Rx

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Observer[T] extends IObserver[T] {
  def asObserver(): Observer[T] = js.native
  def toNotifier(): js.Function1[/* notification */ Notification[T], Unit] = js.native
}

@JSGlobal("Rx.Observer")
@js.native
object Observer extends TopLevel[ObserverStatic]

