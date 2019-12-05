package typingsSlinky.indefiniteDashObservable

import typingsSlinky.indefiniteDashObservable.distTypesMod.Observer
import typingsSlinky.indefiniteDashObservable.distTypesMod.ObserverOrNext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("indefinite-observable/dist/wrapWithObserver", JSImport.Namespace)
@js.native
object distWrapWithObserverMod extends js.Object {
  def default[T](listener: ObserverOrNext[T]): Observer[T] = js.native
  def wrapWithObserver[T](listener: ObserverOrNext[T]): Observer[T] = js.native
}

