package typingsSlinky.pubsubJs.PubSubJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClearAllSubscriptions extends js.Object {
  def clearAllSubscriptions(): js.Any = js.native
}

object ClearAllSubscriptions {
  @scala.inline
  def apply(clearAllSubscriptions: () => js.Any): ClearAllSubscriptions = {
    val __obj = js.Dynamic.literal(clearAllSubscriptions = js.Any.fromFunction0(clearAllSubscriptions))
    __obj.asInstanceOf[ClearAllSubscriptions]
  }
  @scala.inline
  implicit class ClearAllSubscriptionsOps[Self <: ClearAllSubscriptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClearAllSubscriptions(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearAllSubscriptions")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

