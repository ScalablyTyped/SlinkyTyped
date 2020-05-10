package typingsSlinky.ejWebAll.ej.datavisualization.HeatMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TooltipSettingsPosition extends js.Object {
  /** Sets the arrow position again popup.
    */
  var stem: js.UndefOr[TooltipSettingsPositionStem] = js.native
  /** Sets the Tooltip position against target.
    */
  var target: js.UndefOr[TooltipSettingsPositionTarget] = js.native
}

object TooltipSettingsPosition {
  @scala.inline
  def apply(): TooltipSettingsPosition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TooltipSettingsPosition]
  }
  @scala.inline
  implicit class TooltipSettingsPositionOps[Self <: TooltipSettingsPosition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStem(value: TooltipSettingsPositionStem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stem")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget(value: TooltipSettingsPositionTarget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
  }
  
}

