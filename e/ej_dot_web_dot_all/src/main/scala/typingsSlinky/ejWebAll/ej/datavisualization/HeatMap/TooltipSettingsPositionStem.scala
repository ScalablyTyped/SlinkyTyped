package typingsSlinky.ejWebAll.ej.datavisualization.HeatMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TooltipSettingsPositionStem extends js.Object {
  /** Sets the arrow position again popup based on horizontal(x) value
    * @Default {center}
    */
  var horizontal: js.UndefOr[Horizontal | String] = js.native
  /** Sets the arrow position again popup based on vertical(y) value
    * @Default {bottom}
    */
  var vertical: js.UndefOr[Vertical | String] = js.native
}

object TooltipSettingsPositionStem {
  @scala.inline
  def apply(): TooltipSettingsPositionStem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TooltipSettingsPositionStem]
  }
  @scala.inline
  implicit class TooltipSettingsPositionStemOps[Self <: TooltipSettingsPositionStem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHorizontal(value: Horizontal | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontal")(js.undefined)
        ret
    }
    @scala.inline
    def withVertical(value: Vertical | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVertical: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertical")(js.undefined)
        ret
    }
  }
  
}

