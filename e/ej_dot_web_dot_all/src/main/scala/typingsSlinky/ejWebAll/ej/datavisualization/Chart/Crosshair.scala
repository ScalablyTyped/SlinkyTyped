package typingsSlinky.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Crosshair extends js.Object {
  /** Options for customizing the crosshair line.
    */
  var line: js.UndefOr[CrosshairLine] = js.native
  /** Options for customizing the marker in crosshair.
    */
  var marker: js.UndefOr[CrosshairMarker] = js.native
  /** Options for customizing the trackball tooltip.
    */
  var trackballTooltipSettings: js.UndefOr[CrosshairTrackballTooltipSettings] = js.native
  /** Specifies the type of the crosshair. It can be trackball or crosshair
    * @Default {crosshair. See CrosshairType}
    */
  var `type`: js.UndefOr[CrosshairType | String] = js.native
  /** Show/hides the crosshair/trackball visibility.
    * @Default {false}
    */
  var visible: js.UndefOr[Boolean] = js.native
}

object Crosshair {
  @scala.inline
  def apply(): Crosshair = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Crosshair]
  }
  @scala.inline
  implicit class CrosshairOps[Self <: Crosshair] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLine(value: CrosshairLine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line")(js.undefined)
        ret
    }
    @scala.inline
    def withMarker(value: CrosshairMarker): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackballTooltipSettings(value: CrosshairTrackballTooltipSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackballTooltipSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackballTooltipSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackballTooltipSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: CrosshairType | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
  }
  
}

