package typingsSlinky.ejWebAll.ej.datavisualization.RangeNavigator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValueAxisSettings extends js.Object {
  /** Options for customizing the axis line.
    */
  var axisLine: js.UndefOr[ValueAxisSettingsAxisLine] = js.native
  /** Options for customizing the font of the axis.
    */
  var font: js.UndefOr[ValueAxisSettingsFont] = js.native
  /** Options for customizing the major grid lines.
    */
  var majorGridLines: js.UndefOr[ValueAxisSettingsMajorGridLines] = js.native
  /** Options for customizing the major tick lines in axis.
    */
  var majorTickLines: js.UndefOr[ValueAxisSettingsMajorTickLines] = js.native
  /** You can customize the range of the axis by setting minimum , maximum and interval.
    */
  var range: js.UndefOr[ValueAxisSettingsRange] = js.native
  /** If the range is not given explicitly, range will be calculated automatically. You can customize the automatic range calculation using rangePadding.
    * @Default {none}
    */
  var rangePadding: js.UndefOr[String] = js.native
  /** Toggles the visibility of axis in range navigator.
    * @Default {false}
    */
  var visible: js.UndefOr[Boolean] = js.native
}

object ValueAxisSettings {
  @scala.inline
  def apply(): ValueAxisSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValueAxisSettings]
  }
  @scala.inline
  implicit class ValueAxisSettingsOps[Self <: ValueAxisSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAxisLine(value: ValueAxisSettingsAxisLine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxisLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisLine")(js.undefined)
        ret
    }
    @scala.inline
    def withFont(value: ValueAxisSettingsFont): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFont: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(js.undefined)
        ret
    }
    @scala.inline
    def withMajorGridLines(value: ValueAxisSettingsMajorGridLines): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majorGridLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMajorGridLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majorGridLines")(js.undefined)
        ret
    }
    @scala.inline
    def withMajorTickLines(value: ValueAxisSettingsMajorTickLines): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majorTickLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMajorTickLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majorTickLines")(js.undefined)
        ret
    }
    @scala.inline
    def withRange(value: ValueAxisSettingsRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(js.undefined)
        ret
    }
    @scala.inline
    def withRangePadding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangePadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangePadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangePadding")(js.undefined)
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

