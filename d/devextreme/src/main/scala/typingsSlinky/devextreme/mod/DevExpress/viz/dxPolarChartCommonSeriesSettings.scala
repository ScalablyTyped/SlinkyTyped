package typingsSlinky.devextreme.mod.DevExpress.viz

import typingsSlinky.devextreme.devextremeStrings.area
import typingsSlinky.devextreme.devextremeStrings.bar
import typingsSlinky.devextreme.devextremeStrings.line
import typingsSlinky.devextreme.devextremeStrings.scatter
import typingsSlinky.devextreme.devextremeStrings.stackedbar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxPolarChartCommonSeriesSettings extends dxPolarChartSeriesTypesCommonPolarChartSeries {
  /** An object that specifies configuration options for all series of the area type in the chart. */
  var area: js.UndefOr[js.Any] = js.native
  /** An object that specifies configuration options for all series of the 'bar' type in the chart. */
  var bar: js.UndefOr[js.Any] = js.native
  /** An object that specifies configuration options for all series of the 'line' type in the chart. */
  var line: js.UndefOr[js.Any] = js.native
  /** An object that specifies configuration options for all series of the 'scatter' type in the chart. */
  var scatter: js.UndefOr[js.Any] = js.native
  /** An object that specifies configuration options for all series of the 'stackedBar' type in the chart. */
  var stackedbar: js.UndefOr[js.Any] = js.native
  /** Sets a series type. */
  var `type`: js.UndefOr[area | bar | line | scatter | stackedbar] = js.native
}

object dxPolarChartCommonSeriesSettings {
  @scala.inline
  def apply(): dxPolarChartCommonSeriesSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxPolarChartCommonSeriesSettings]
  }
  @scala.inline
  implicit class dxPolarChartCommonSeriesSettingsOps[Self <: dxPolarChartCommonSeriesSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArea(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("area")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("area")(js.undefined)
        ret
    }
    @scala.inline
    def withBar(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bar")(js.undefined)
        ret
    }
    @scala.inline
    def withLine(value: js.Any): Self = {
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
    def withScatter(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scatter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scatter")(js.undefined)
        ret
    }
    @scala.inline
    def withStackedbar(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackedbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackedbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackedbar")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: area | bar | line | scatter | stackedbar): Self = {
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

