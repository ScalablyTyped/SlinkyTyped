package typingsSlinky.createDashSubscription

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object createDashSubscriptionMod {
  import slinky.core.ReactComponentClass

  type Subscription[S, T] = ReactComponentClass[SubscriptionProps[S, T]]
  type Unsubscribe = js.Function0[js.Any]
}
