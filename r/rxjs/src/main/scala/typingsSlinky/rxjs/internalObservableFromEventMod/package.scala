package typingsSlinky.rxjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object internalObservableFromEventMod {
  import typingsSlinky.std.ArrayLike

  type FromEventTarget[T] = EventTargetLike[T] | ArrayLike[EventTargetLike[T]]
  type NodeEventHandler = js.Function1[/* repeated */ js.Any, Unit]
}
