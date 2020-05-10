package typingsSlinky.devextreme.mod.DevExpress.viz

import typingsSlinky.devextreme.AnonAggregateByCategory
import typingsSlinky.devextreme.AnonAllowSlidersSwap
import typingsSlinky.devextreme.AnonBarGroupPadding
import typingsSlinky.devextreme.AnonElementEventModel
import typingsSlinky.devextreme.AnonImage
import typingsSlinky.devextreme.AnonInvalidRangeColor
import typingsSlinky.devextreme.AnonOpacity
import typingsSlinky.devextreme.AnonOpacityWidth
import typingsSlinky.devextreme.AnonRight
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
  /** Specifies the options for the range selector's background. */
  var background: js.UndefOr[AnonImage] = js.native
  /** Specifies the RangeSelector's behavior options. */
  var behavior: js.UndefOr[AnonAllowSlidersSwap] = js.native
  /** Specifies the options required to display a chart as the range selector's background. */
  var chart: js.UndefOr[AnonBarGroupPadding] = js.native
  /** Specifies the color of the parent page element. */
  var containerBackgroundColor: js.UndefOr[String] = js.native
  /** Specifies a data source for the scale values and for the chart at the background. */
  var dataSource: js.UndefOr[js.Array[_] | DataSource | DataSourceOptions | String] = js.native
  /** Specifies the data source field that provides data for the scale. */
  var dataSourceField: js.UndefOr[String] = js.native
  /** Range selector's indent options. */
  var indent: js.UndefOr[AnonRight] = js.native
  /** A function that is executed after the widget's value is changed. */
  var onValueChanged: js.UndefOr[js.Function1[/* e */ AnonElementEventModel, _]] = js.native
  /** Specifies options of the range selector's scale. */
  var scale: js.UndefOr[AnonAggregateByCategory] = js.native
  /** Specifies the color of the selected range. */
  var selectedRangeColor: js.UndefOr[String] = js.native
  /** Specifies how the selected range should behave when data is updated. Applies only when the RangeSelector is bound to a data source. */
  var selectedRangeUpdateMode: js.UndefOr[auto | keep | reset | shift] = js.native
  /** Specifies range selector shutter options. */
  var shutter: js.UndefOr[AnonOpacity] = js.native
  /** Specifies the appearance of the range selector's slider handles. */
  var sliderHandle: js.UndefOr[AnonOpacityWidth] = js.native
  /** Defines the options of the range selector slider markers. */
  var sliderMarker: js.UndefOr[AnonInvalidRangeColor] = js.native
  /** The selected range (initial or current). Equals the entire scale when not set. */
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
    def withBackground(value: AnonImage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(js.undefined)
        ret
    }
    @scala.inline
    def withBehavior(value: AnonAllowSlidersSwap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("behavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBehavior: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("behavior")(js.undefined)
        ret
    }
    @scala.inline
    def withChart(value: AnonBarGroupPadding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chart")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerBackgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerBackgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSource(value: js.Array[_] | DataSource | DataSourceOptions | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSourceField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSourceField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSourceField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSourceField")(js.undefined)
        ret
    }
    @scala.inline
    def withIndent(value: AnonRight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indent")(js.undefined)
        ret
    }
    @scala.inline
    def withOnValueChanged(value: /* e */ AnonElementEventModel => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onValueChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnValueChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onValueChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withScale(value: AnonAggregateByCategory): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedRangeColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedRangeColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedRangeColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedRangeColor")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedRangeUpdateMode(value: auto | keep | reset | shift): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedRangeUpdateMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedRangeUpdateMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedRangeUpdateMode")(js.undefined)
        ret
    }
    @scala.inline
    def withShutter(value: AnonOpacity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shutter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShutter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shutter")(js.undefined)
        ret
    }
    @scala.inline
    def withSliderHandle(value: AnonOpacityWidth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sliderHandle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSliderHandle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sliderHandle")(js.undefined)
        ret
    }
    @scala.inline
    def withSliderMarker(value: AnonInvalidRangeColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sliderMarker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSliderMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sliderMarker")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: (js.Array[Double | String | js.Date]) | VizRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

