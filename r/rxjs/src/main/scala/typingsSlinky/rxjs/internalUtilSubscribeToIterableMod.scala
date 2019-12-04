package typingsSlinky.rxjs

import typingsSlinky.rxjs.internalSubscriberMod.Subscriber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/util/subscribeToIterable", JSImport.Namespace)
@js.native
object internalUtilSubscribeToIterableMod extends js.Object {
  def subscribeToIterable[T](iterable: js.Iterable[T]): js.Function1[/* subscriber */ Subscriber[T], Subscriber[T]] = js.native
}

