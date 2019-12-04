package typingsSlinky.rxjs.internalDashCompatibilityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal-compatibility", "subscribeToIterable")
@js.native
object subscribeToIterable extends js.Object {
  def apply[T](iterable: js.Iterable[T]): js.Function1[
    /* subscriber */ typingsSlinky.rxjs.internalSubscriberMod.Subscriber[T], 
    typingsSlinky.rxjs.internalSubscriberMod.Subscriber[T]
  ] = js.native
}

