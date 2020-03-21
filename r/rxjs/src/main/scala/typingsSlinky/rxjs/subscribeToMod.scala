package typingsSlinky.rxjs

import typingsSlinky.rxjs.subscriberMod.Subscriber
import typingsSlinky.rxjs.subscriptionMod.Subscription
import typingsSlinky.rxjs.typesMod.ObservableInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/util/subscribeTo", JSImport.Namespace)
@js.native
object subscribeToMod extends js.Object {
  def subscribeTo[T](result: ObservableInput[T]): js.Function1[/* subscriber */ Subscriber[T], Unit | Subscription] = js.native
}

