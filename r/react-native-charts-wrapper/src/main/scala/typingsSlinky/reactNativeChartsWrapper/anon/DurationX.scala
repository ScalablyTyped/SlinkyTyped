package typingsSlinky.reactNativeChartsWrapper.anon

import typingsSlinky.reactNativeChartsWrapper.mod.EasingType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DurationX extends js.Object {
  var durationX: js.UndefOr[Double] = js.native
  var durationY: js.UndefOr[Double] = js.native
  var easingX: js.UndefOr[EasingType] = js.native
  var easingY: js.UndefOr[EasingType] = js.native
}

object DurationX {
  @scala.inline
  def apply(): DurationX = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DurationX]
  }
  @scala.inline
  implicit class DurationXOps[Self <: DurationX] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDurationX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDurationX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationX")(js.undefined)
        ret
    }
    @scala.inline
    def withDurationY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDurationY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationY")(js.undefined)
        ret
    }
    @scala.inline
    def withEasingX(value: EasingType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easingX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEasingX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easingX")(js.undefined)
        ret
    }
    @scala.inline
    def withEasingY(value: EasingType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easingY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEasingY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easingY")(js.undefined)
        ret
    }
  }
  
}

