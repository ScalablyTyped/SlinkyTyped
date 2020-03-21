package typingsSlinky.rxjs.internalCompatibilityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal-compatibility", "subscribeToIterable")
@js.native
object subscribeToIterable extends js.Object {
  def apply[T](iterable: js.Iterable[T]): js.Function1[
    /* subscriber */ typingsSlinky.rxjs.subscriberMod.Subscriber[T], 
    typingsSlinky.rxjs.subscriberMod.Subscriber[T]
  ] = js.native
}

