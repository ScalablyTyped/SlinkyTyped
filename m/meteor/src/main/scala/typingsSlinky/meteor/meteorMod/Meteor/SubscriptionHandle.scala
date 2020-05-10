package typingsSlinky.meteor.meteorMod.Meteor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** utils **/
/** Pub/Sub **/
@js.native
trait SubscriptionHandle extends js.Object {
  def ready(): Boolean = js.native
  def stop(): Unit = js.native
}

object SubscriptionHandle {
  @scala.inline
  def apply(ready: () => Boolean, stop: () => Unit): SubscriptionHandle = {
    val __obj = js.Dynamic.literal(ready = js.Any.fromFunction0(ready), stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[SubscriptionHandle]
  }
  @scala.inline
  implicit class SubscriptionHandleOps[Self <: SubscriptionHandle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReady(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ready")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStop(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

