package typingsSlinky.ejWebAll.ej.datavisualization.SunburstChart

import typingsSlinky.ejWebAll.ej.datavisualization.Sunburst.SunburstHighlightMode
import typingsSlinky.ejWebAll.ej.datavisualization.Sunburst.SunburstHighlightType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HighlightSettings extends js.Object {
  /** Color of the levels/point on highlight.
    * @Default {red}
    */
  var color: js.UndefOr[String] = js.native
  /** Enables/disables the ability to highlight the levels or point interactively.
    * @Default {false}
    */
  var enable: js.UndefOr[Boolean] = js.native
  /** Specifies whether the levels or point has to be highlighted.
    * @Default {point. See Mode}
    */
  var mode: js.UndefOr[SunburstHighlightMode | String] = js.native
  /** Opacity of the levels/point on highlight.
    * @Default {0.5}
    */
  var opacity: js.UndefOr[Double] = js.native
  /** Specifies whether the levels or data point has to be highlighted.
    * @Default {opacity. See Mode}
    */
  var `type`: js.UndefOr[SunburstHighlightType | String] = js.native
}

object HighlightSettings {
  @scala.inline
  def apply(): HighlightSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HighlightSettings]
  }
  @scala.inline
  implicit class HighlightSettingsOps[Self <: HighlightSettings] (val x: Self) extends AnyVal {
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
    def withEnable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: SunburstHighlightMode | String): Self = {
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
    def withType(value: SunburstHighlightType | String): Self = {
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
  }
  
}

