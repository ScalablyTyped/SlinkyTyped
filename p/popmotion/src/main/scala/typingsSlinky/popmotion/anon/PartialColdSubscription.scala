package typingsSlinky.popmotion.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<popmotion.popmotion/lib/action/types.ColdSubscription> */
@js.native
trait PartialColdSubscription extends js.Object {
  var stop: js.UndefOr[js.Function0[Unit]] = js.native
}

object PartialColdSubscription {
  @scala.inline
  def apply(): PartialColdSubscription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialColdSubscription]
  }
  @scala.inline
  implicit class PartialColdSubscriptionOps[Self <: PartialColdSubscription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStop(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutStop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop")(js.undefined)
        ret
    }
  }
  
}

