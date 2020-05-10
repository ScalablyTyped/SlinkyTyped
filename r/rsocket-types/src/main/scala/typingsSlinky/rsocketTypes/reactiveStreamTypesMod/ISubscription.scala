package typingsSlinky.rsocketTypes.reactiveStreamTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISubscription extends js.Object {
  def cancel(): Unit = js.native
  def request(n: Double): Unit = js.native
}

object ISubscription {
  @scala.inline
  def apply(cancel: () => Unit, request: Double => Unit): ISubscription = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), request = js.Any.fromFunction1(request))
    __obj.asInstanceOf[ISubscription]
  }
  @scala.inline
  implicit class ISubscriptionOps[Self <: ISubscription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancel(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRequest(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

