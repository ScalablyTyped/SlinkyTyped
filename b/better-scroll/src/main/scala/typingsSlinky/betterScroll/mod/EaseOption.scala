package typingsSlinky.betterScroll.mod

import typingsSlinky.betterScroll.AnonFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EaseOption extends js.Object {
  var bounce: js.UndefOr[AnonFn] = js.native
  var swipe: js.UndefOr[AnonFn] = js.native
  var swipeBounce: js.UndefOr[AnonFn] = js.native
}

object EaseOption {
  @scala.inline
  def apply(): EaseOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EaseOption]
  }
  @scala.inline
  implicit class EaseOptionOps[Self <: EaseOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBounce(value: AnonFn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBounce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounce")(js.undefined)
        ret
    }
    @scala.inline
    def withSwipe(value: AnonFn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwipe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipe")(js.undefined)
        ret
    }
    @scala.inline
    def withSwipeBounce(value: AnonFn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeBounce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwipeBounce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeBounce")(js.undefined)
        ret
    }
  }
  
}

