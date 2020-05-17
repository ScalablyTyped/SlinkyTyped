package typingsSlinky.betterScroll.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<better-scroll.better-scroll.MouseWheelOption> */
@js.native
trait PartialMouseWheelOption extends js.Object {
  var easeTime: js.UndefOr[Double] = js.native
  var invert: js.UndefOr[Boolean] = js.native
  var speed: js.UndefOr[Double] = js.native
}

object PartialMouseWheelOption {
  @scala.inline
  def apply(): PartialMouseWheelOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMouseWheelOption]
  }
  @scala.inline
  implicit class PartialMouseWheelOptionOps[Self <: PartialMouseWheelOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEaseTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easeTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEaseTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easeTime")(js.undefined)
        ret
    }
    @scala.inline
    def withInvert(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invert")(js.undefined)
        ret
    }
    @scala.inline
    def withSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speed")(js.undefined)
        ret
    }
  }
  
}

