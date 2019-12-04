package typingsSlinky.rxjs.internalDashCompatibilityMod

import typingsSlinky.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal-compatibility", "subscribeToArray")
@js.native
object subscribeToArray extends js.Object {
  def apply[T](array: ArrayLike[T]): js.Function1[/* subscriber */ typingsSlinky.rxjs.internalSubscriberMod.Subscriber[T], Unit] = js.native
}

