package typingsSlinky.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CrosshairTrackballTooltipSettingsBorder extends js.Object {
  /** Border color of the trackball tooltip.
    * @Default {null}
    */
  var color: js.UndefOr[String] = js.native
  /** Border width of the trackball tooltip.
    * @Default {null}
    */
  var width: js.UndefOr[Double] = js.native
}

object CrosshairTrackballTooltipSettingsBorder {
  @scala.inline
  def apply(): CrosshairTrackballTooltipSettingsBorder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CrosshairTrackballTooltipSettingsBorder]
  }
  @scala.inline
  implicit class CrosshairTrackballTooltipSettingsBorderOps[Self <: CrosshairTrackballTooltipSettingsBorder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

