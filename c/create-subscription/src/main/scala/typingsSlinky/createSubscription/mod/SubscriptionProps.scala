package typingsSlinky.createSubscription.mod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionProps[S, T] extends js.Object {
  var source: S
  def children(value: T): TagMod[Any]
}

object SubscriptionProps {
  @scala.inline
  def apply[S, T](children: T => TagMod[Any], source: S): SubscriptionProps[S, T] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), source = source.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SubscriptionProps[S, T]]
  }
}

