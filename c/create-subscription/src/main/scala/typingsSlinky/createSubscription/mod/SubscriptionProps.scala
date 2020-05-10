package typingsSlinky.createSubscription.mod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscriptionProps[S, T] extends js.Object {
  var source: S = js.native
  def children(value: T): TagMod[Any] = js.native
}

object SubscriptionProps {
  @scala.inline
  def apply[S, T](children: T => TagMod[Any], source: S): SubscriptionProps[S, T] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionProps[S, T]]
  }
  @scala.inline
  implicit class SubscriptionPropsOps[Self[s, t] <: SubscriptionProps[s, t], S, T] (val x: Self[S, T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[S, T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[S, T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[S, T]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[S, T]) with Other]
    @scala.inline
    def withChildren(value: T => TagMod[Any]): Self[S, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSource(value: S): Self[S, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

