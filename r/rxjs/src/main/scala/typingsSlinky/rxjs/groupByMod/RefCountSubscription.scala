package typingsSlinky.rxjs.groupByMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RefCountSubscription extends js.Object {
  var attemptedToUnsubscribe: Boolean = js.native
  var closed: Boolean = js.native
  var count: Double = js.native
  def unsubscribe(): Unit = js.native
}

object RefCountSubscription {
  @scala.inline
  def apply(attemptedToUnsubscribe: Boolean, closed: Boolean, count: Double, unsubscribe: () => Unit): RefCountSubscription = {
    val __obj = js.Dynamic.literal(attemptedToUnsubscribe = attemptedToUnsubscribe.asInstanceOf[js.Any], closed = closed.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], unsubscribe = js.Any.fromFunction0(unsubscribe))
    __obj.asInstanceOf[RefCountSubscription]
  }
  @scala.inline
  implicit class RefCountSubscriptionOps[Self <: RefCountSubscription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttemptedToUnsubscribe(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attemptedToUnsubscribe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClosed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnsubscribe(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsubscribe")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

