package typingsSlinky.rxjs

import typingsSlinky.rxjs.subscriberMod.Subscriber
import typingsSlinky.rxjs.subscriptionMod.Subscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIndex[T] extends js.Object {
  var index: Double = js.native
  var keys: js.Array[String] = js.native
  var obj: js.Object = js.native
  var subscriber: Subscriber[js.Tuple2[String, T]] = js.native
  var subscription: Subscription = js.native
}

object AnonIndex {
  @scala.inline
  def apply[T](
    index: Double,
    keys: js.Array[String],
    obj: js.Object,
    subscriber: Subscriber[js.Tuple2[String, T]],
    subscription: Subscription
  ): AnonIndex[T] = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], obj = obj.asInstanceOf[js.Any], subscriber = subscriber.asInstanceOf[js.Any], subscription = subscription.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIndex[T]]
  }
  @scala.inline
  implicit class AnonIndexOps[Self[t] <: AnonIndex[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withIndex(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeys(value: js.Array[String]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObj(value: js.Object): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("obj")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubscriber(value: Subscriber[js.Tuple2[String, T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubscription(value: Subscription): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscription")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

