package typingsSlinky.createSubscription

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Subscription[S, T] = slinky.core.ReactComponentClass[typingsSlinky.createSubscription.mod.SubscriptionProps[S, T]]
  type Unsubscribe = js.Function0[js.Any]
}
