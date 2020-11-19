package typingsSlinky.rxjs

import typingsSlinky.rxjs.subscriberMod.Subscriber
import typingsSlinky.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/internal/util/subscribeToArray", JSImport.Namespace)
@js.native
object subscribeToArrayMod extends js.Object {
  
  def subscribeToArray[T](array: ArrayLike[T]): js.Function1[/* subscriber */ Subscriber[T], Unit] = js.native
}
