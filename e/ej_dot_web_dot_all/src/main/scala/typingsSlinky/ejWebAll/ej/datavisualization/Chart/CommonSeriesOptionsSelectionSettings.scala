package typingsSlinky.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommonSeriesOptionsSelectionSettings extends js.Object {
  /** Options for customizing the border of the series on selection.
    */
  var border: js.UndefOr[CommonSeriesOptionsSelectionSettingsBorder] = js.native
  /** Color of the series/point on selection.
    */
  var color: js.UndefOr[String] = js.native
  /** Custom pattern for the series on selection.
    */
  var customPattern: js.UndefOr[String] = js.native
  /** Enables/disables the ability to select a series/data point interactively.
    * @Default {false}
    */
  var enable: js.UndefOr[Boolean] = js.native
  /** Specifies whether the series or data point has to be selected.
    * @Default {series. See Mode}
    */
  var mode: js.UndefOr[Mode | String] = js.native
  /** Opacity of the series/point on selection.
    * @Default {0.6}
    */
  var opacity: js.UndefOr[Double] = js.native
  /** Specifies the pattern for the series/point on selection.
    * @Default {none. See Pattern}
    */
  var pattern: js.UndefOr[String] = js.native
  /** Specifies the drawn rectangle type.
    * @Default {xy}
    */
  var rangeType: js.UndefOr[RangeType | String] = js.native
  /** Specifies the type of selection.
    * @Default {single}
    */
  var `type`: js.UndefOr[SelectionType | String] = js.native
}

object CommonSeriesOptionsSelectionSettings {
  @scala.inline
  def apply(): CommonSeriesOptionsSelectionSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonSeriesOptionsSelectionSettings]
  }
  @scala.inline
  implicit class CommonSeriesOptionsSelectionSettingsOps[Self <: CommonSeriesOptionsSelectionSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBorder(value: CommonSeriesOptionsSelectionSettingsBorder): Self = {
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
    def withCustomPattern(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customPattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomPattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customPattern")(js.undefined)
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
    def withMode(value: Mode | String): Self = {
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
    def withPattern(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pattern")(js.undefined)
        ret
    }
    @scala.inline
    def withRangeType(value: RangeType | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeType")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: SelectionType | String): Self = {
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

