package typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tooltip extends js.Object {
  /** enable showCustomLabelTooltip of circular gauge
    * @Default {false}
    */
  var showCustomLabelTooltip: js.UndefOr[Boolean] = js.native
  /** enable showLabelTooltip of circular gauge
    * @Default {false}
    */
  var showLabelTooltip: js.UndefOr[Boolean] = js.native
  /** Specify tooltip templateID of circular gauge
    * @Default {false}
    */
  var templateID: js.UndefOr[String] = js.native
}

object Tooltip {
  @scala.inline
  def apply(): Tooltip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Tooltip]
  }
  @scala.inline
  implicit class TooltipOps[Self <: Tooltip] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withShowCustomLabelTooltip(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCustomLabelTooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowCustomLabelTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCustomLabelTooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withShowLabelTooltip(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLabelTooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowLabelTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLabelTooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplateID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplateID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateID")(js.undefined)
        ret
    }
  }
  
}

