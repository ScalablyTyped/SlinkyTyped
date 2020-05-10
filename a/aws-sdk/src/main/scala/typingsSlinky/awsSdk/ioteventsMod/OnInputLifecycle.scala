package typingsSlinky.awsSdk.ioteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnInputLifecycle extends js.Object {
  /**
    * Specifies the actions performed when the condition evaluates to TRUE.
    */
  var events: js.UndefOr[Events] = js.native
  /**
    * Specifies the actions performed, and the next state entered, when a condition evaluates to TRUE.
    */
  var transitionEvents: js.UndefOr[TransitionEvents] = js.native
}

object OnInputLifecycle {
  @scala.inline
  def apply(): OnInputLifecycle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnInputLifecycle]
  }
  @scala.inline
  implicit class OnInputLifecycleOps[Self <: OnInputLifecycle] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withTransitionEvents(value: TransitionEvents): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitionEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionEvents")(js.undefined)
        ret
    }
  }
  
}

