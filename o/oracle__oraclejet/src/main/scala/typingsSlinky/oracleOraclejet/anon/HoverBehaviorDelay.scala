package typingsSlinky.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HoverBehaviorDelay extends js.Object {
  var animationDuration: js.UndefOr[Double] = js.native
  var hoverBehaviorDelay: js.UndefOr[Double] = js.native
  var svgStyle: js.UndefOr[js.Object] = js.native
}

object HoverBehaviorDelay {
  @scala.inline
  def apply(): HoverBehaviorDelay = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HoverBehaviorDelay]
  }
  @scala.inline
  implicit class HoverBehaviorDelayOps[Self <: HoverBehaviorDelay] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimationDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withHoverBehaviorDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverBehaviorDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoverBehaviorDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverBehaviorDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withSvgStyle(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svgStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSvgStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svgStyle")(js.undefined)
        ret
    }
  }
  
}

