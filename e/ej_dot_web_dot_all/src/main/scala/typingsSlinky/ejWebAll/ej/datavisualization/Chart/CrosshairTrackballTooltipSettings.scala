package typingsSlinky.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CrosshairTrackballTooltipSettings extends js.Object {
  /** Options for customizing the trackball tooltip border.
    */
  var border: js.UndefOr[CrosshairTrackballTooltipSettingsBorder] = js.native
  /** Background color of the trackball tooltip.
    * @Default {null}
    */
  var fill: js.UndefOr[String] = js.native
  /** Specifies the mode of the trackball tooltip.
    * @Default {float. See CrosshairMode}
    */
  var mode: js.UndefOr[CrosshairMode | String] = js.native
  /** Opacity value of the trackball tooltip.
    * @Default {1}
    */
  var opacity: js.UndefOr[Double] = js.native
  /** Rounded corner x value of the trackball tooltip.
    * @Default {3}
    */
  var rx: js.UndefOr[Double] = js.native
  /** Rounded corner y value of the trackball tooltip.
    * @Default {3}
    */
  var ry: js.UndefOr[Double] = js.native
}

object CrosshairTrackballTooltipSettings {
  @scala.inline
  def apply(): CrosshairTrackballTooltipSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CrosshairTrackballTooltipSettings]
  }
  @scala.inline
  implicit class CrosshairTrackballTooltipSettingsOps[Self <: CrosshairTrackballTooltipSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBorder(value: CrosshairTrackballTooltipSettingsBorder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(js.undefined)
        ret
    }
    @scala.inline
    def withFill(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: CrosshairMode | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(js.undefined)
        ret
    }
    @scala.inline
    def withRx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRx: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rx")(js.undefined)
        ret
    }
    @scala.inline
    def withRy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ry")(js.undefined)
        ret
    }
  }
  
}

