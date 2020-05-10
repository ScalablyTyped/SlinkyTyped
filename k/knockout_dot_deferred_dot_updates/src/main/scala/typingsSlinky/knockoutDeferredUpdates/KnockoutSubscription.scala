package typingsSlinky.knockoutDeferredUpdates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutSubscription extends js.Object {
  var deferUpdates: Boolean = js.native
}

object KnockoutSubscription {
  @scala.inline
  def apply(deferUpdates: Boolean): KnockoutSubscription = {
    val __obj = js.Dynamic.literal(deferUpdates = deferUpdates.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutSubscription]
  }
  @scala.inline
  implicit class KnockoutSubscriptionOps[Self <: KnockoutSubscription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeferUpdates(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deferUpdates")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

