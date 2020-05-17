package typingsSlinky.betterScroll.mod

import typingsSlinky.betterScroll.anon.Fn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EaseOption extends js.Object {
  var bounce: js.UndefOr[Fn] = js.native
  var swipe: js.UndefOr[Fn] = js.native
  var swipeBounce: js.UndefOr[Fn] = js.native
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
    def withBounce(value: Fn): Self = {
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
    def withSwipe(value: Fn): Self = {
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
    def withSwipeBounce(value: Fn): Self = {
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

