package typingsSlinky.ejWebAll.ej.datavisualization.HeatMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TooltipSettingsAnimation extends js.Object {
  /** Defines the animation effect for the tooltip that should be shown when the mouse hovers over rows/columns.
    * @Default {none}
    */
  var effect: js.UndefOr[Effect | String] = js.native
  /** Defines the animation speed for the tooltip that should be shown when the mouse hovers over rows/columns.
    * @Default {0}
    */
  var speed: js.UndefOr[Double] = js.native
}

object TooltipSettingsAnimation {
  @scala.inline
  def apply(): TooltipSettingsAnimation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TooltipSettingsAnimation]
  }
  @scala.inline
  implicit class TooltipSettingsAnimationOps[Self <: TooltipSettingsAnimation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEffect(value: Effect | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEffect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effect")(js.undefined)
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

