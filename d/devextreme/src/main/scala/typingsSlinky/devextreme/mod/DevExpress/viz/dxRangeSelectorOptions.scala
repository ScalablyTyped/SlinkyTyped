package typingsSlinky.devextreme.mod.DevExpress.viz

import typingsSlinky.devextreme.anon.AggregateByCategory
import typingsSlinky.devextreme.anon.AllowSlidersSwap
import typingsSlinky.devextreme.anon.BarGroupPadding
import typingsSlinky.devextreme.anon.ElementEventModel
import typingsSlinky.devextreme.anon.Image
import typingsSlinky.devextreme.anon.InvalidRangeColor
import typingsSlinky.devextreme.anon.Opacity
import typingsSlinky.devextreme.anon.OpacityWidth
import typingsSlinky.devextreme.anon.Right
import typingsSlinky.devextreme.devextremeStrings.auto
import typingsSlinky.devextreme.devextremeStrings.keep
import typingsSlinky.devextreme.devextremeStrings.reset
import typingsSlinky.devextreme.devextremeStrings.shift
import typingsSlinky.devextreme.mod.DevExpress.data.DataSource
import typingsSlinky.devextreme.mod.DevExpress.data.DataSourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxRangeSelectorOptions extends BaseWidgetOptions[dxRangeSelector] {
  /** @name dxRangeSelector.Options.background */
  var background: js.UndefOr[Image] = js.native
  /** @name dxRangeSelector.Options.behavior */
  var behavior: js.UndefOr[AllowSlidersSwap] = js.native
  /** @name dxRangeSelector.Options.chart */
  var chart: js.UndefOr[BarGroupPadding] = js.native
  /** @name dxRangeSelector.Options.containerBackgroundColor */
  var containerBackgroundColor: js.UndefOr[String] = js.native
  /** @name dxRangeSelector.Options.dataSource */
  var dataSource: js.UndefOr[js.Array[_] | DataSource | DataSourceOptions | String] = js.native
  /** @name dxRangeSelector.Options.dataSourceField */
  var dataSourceField: js.UndefOr[String] = js.native
  /** @name dxRangeSelector.Options.indent */
  var indent: js.UndefOr[Right] = js.native
  /** @name dxRangeSelector.Options.onValueChanged */
  var onValueChanged: js.UndefOr[js.Function1[/* e */ ElementEventModel, _]] = js.native
  /** @name dxRangeSelector.Options.scale */
  var scale: js.UndefOr[AggregateByCategory] = js.native
  /** @name dxRangeSelector.Options.selectedRangeColor */
  var selectedRangeColor: js.UndefOr[String] = js.native
  /** @name dxRangeSelector.Options.selectedRangeUpdateMode */
  var selectedRangeUpdateMode: js.UndefOr[auto | keep | reset | shift] = js.native
  /** @name dxRangeSelector.Options.shutter */
  var shutter: js.UndefOr[Opacity] = js.native
  /** @name dxRangeSelector.Options.sliderHandle */
  var sliderHandle: js.UndefOr[OpacityWidth] = js.native
  /** @name dxRangeSelector.Options.sliderMarker */
  var sliderMarker: js.UndefOr[InvalidRangeColor] = js.native
  /** @name dxRangeSelector.Options.value */
  var value: js.UndefOr[(js.Array[Double | String | js.Date]) | VizRange] = js.native
}

object dxRangeSelectorOptions {
  @scala.inline
  def apply(): dxRangeSelectorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxRangeSelectorOptions]
  }
  @scala.inline
  implicit class dxRangeSelectorOptionsOps[Self <: dxRangeSelectorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBackground(value: Image): Self = this.set("background", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    @scala.inline
    def setBehavior(value: AllowSlidersSwap): Self = this.set("behavior", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBehavior: Self = this.set("behavior", js.undefined)
    @scala.inline
    def setChart(value: BarGroupPadding): Self = this.set("chart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChart: Self = this.set("chart", js.undefined)
    @scala.inline
    def setContainerBackgroundColor(value: String): Self = this.set("containerBackgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerBackgroundColor: Self = this.set("containerBackgroundColor", js.undefined)
    @scala.inline
    def setDataSourceVarargs(value: js.Any*): Self = this.set("dataSource", js.Array(value :_*))
    @scala.inline
    def setDataSource(value: js.Array[_] | DataSource | DataSourceOptions | String): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    @scala.inline
    def setDataSourceField(value: String): Self = this.set("dataSourceField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSourceField: Self = this.set("dataSourceField", js.undefined)
    @scala.inline
    def setIndent(value: Right): Self = this.set("indent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndent: Self = this.set("indent", js.undefined)
    @scala.inline
    def setOnValueChanged(value: /* e */ ElementEventModel => _): Self = this.set("onValueChanged", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnValueChanged: Self = this.set("onValueChanged", js.undefined)
    @scala.inline
    def setScale(value: AggregateByCategory): Self = this.set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    @scala.inline
    def setSelectedRangeColor(value: String): Self = this.set("selectedRangeColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedRangeColor: Self = this.set("selectedRangeColor", js.undefined)
    @scala.inline
    def setSelectedRangeUpdateMode(value: auto | keep | reset | shift): Self = this.set("selectedRangeUpdateMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedRangeUpdateMode: Self = this.set("selectedRangeUpdateMode", js.undefined)
    @scala.inline
    def setShutter(value: Opacity): Self = this.set("shutter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShutter: Self = this.set("shutter", js.undefined)
    @scala.inline
    def setSliderHandle(value: OpacityWidth): Self = this.set("sliderHandle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSliderHandle: Self = this.set("sliderHandle", js.undefined)
    @scala.inline
    def setSliderMarker(value: InvalidRangeColor): Self = this.set("sliderMarker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSliderMarker: Self = this.set("sliderMarker", js.undefined)
    @scala.inline
    def setValueVarargs(value: (Double | String | js.Date)*): Self = this.set("value", js.Array(value :_*))
    @scala.inline
    def setValue(value: (js.Array[Double | String | js.Date]) | VizRange): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

