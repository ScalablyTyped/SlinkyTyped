package typingsSlinky.rxjs

import typingsSlinky.rxjs.internalSubscriberMod.Subscriber
import typingsSlinky.rxjs.internalSubscriptionMod.Subscription
import typingsSlinky.rxjs.internalTypesMod.ObservableInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/util/subscribeTo", JSImport.Namespace)
@js.native
object internalUtilSubscribeToMod extends js.Object {
  def subscribeTo[T](result: ObservableInput[T]): js.Function1[/* subscriber */ Subscriber[T], Unit | Subscription] = js.native
}

