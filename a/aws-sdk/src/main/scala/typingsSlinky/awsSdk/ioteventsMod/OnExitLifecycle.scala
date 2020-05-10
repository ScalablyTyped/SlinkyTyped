package typingsSlinky.awsSdk.ioteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnExitLifecycle extends js.Object {
  /**
    * Specifies the actions that are performed when the state is exited and the condition is TRUE.
    */
  var events: js.UndefOr[Events] = js.native
}

object OnExitLifecycle {
  @scala.inline
  def apply(): OnExitLifecycle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnExitLifecycle]
  }
  @scala.inline
  implicit class OnExitLifecycleOps[Self <: OnExitLifecycle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvents(value: Events): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(js.undefined)
        ret
    }
  }
  
}

