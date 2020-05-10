package typingsSlinky.echarts.echarts.EChartOption.Tooltip

import typingsSlinky.echarts.echartsStrings.series
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Format extends js.Object {
  // Value of axis
  var axisValue: js.UndefOr[Double | String] = js.native
  // Label of axis value
  var axisValueLabel: js.UndefOr[String] = js.native
  // Color of data
  var color: js.UndefOr[String] = js.native
  var componentType: js.UndefOr[series] = js.native
  // Original data as input
  var data: js.UndefOr[js.Any] = js.native
  // Data index in input data array
  var dataIndex: js.UndefOr[Double] = js.native
  // data dimension index, for example 0 or 1 or 2 ...
  // Only work in `radar` series.
  var dimensionIndex: js.UndefOr[Double] = js.native
  // dimension names list
  var dimensionNames: js.UndefOr[js.Array[String]] = js.native
  // encoding info of coordinate system
  // Key: coord, like ('x' 'y' 'radius' 'angle')
  // value: Must be an array, not null/undefined. Contain dimension indices, like:
  // {
  //     x: [2] // values on dimension index 2 are mapped to x axis.
  //     y: [0] // values on dimension index 0 are mapped to y axis.
  // }
  var encode: js.UndefOr[js.Object] = js.native
  // item marker, string of HTMLElement
  var marker: js.UndefOr[String] = js.native
  // Data name, or category name
  var name: js.UndefOr[String] = js.native
  // the percentage of pie chart
  var percent: js.UndefOr[Double] = js.native
  // Series index in option.series
  var seriesIndex: js.UndefOr[Double] = js.native
  // Series name
  var seriesName: js.UndefOr[String] = js.native
  // Series type
  var seriesType: js.UndefOr[String] = js.native
  // Value of data
  var value: js.UndefOr[Double | js.Array[_]] = js.native
}

object Format {
  @scala.inline
  def apply(): Format = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Format]
  }
  @scala.inline
  implicit class FormatOps[Self <: Format] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAxisValue(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxisValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisValue")(js.undefined)
        ret
    }
    @scala.inline
    def withAxisValueLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisValueLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxisValueLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisValueLabel")(js.undefined)
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
    def withComponentType(value: series): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponentType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentType")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withDataIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withDimensionIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensionIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDimensionIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensionIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withDimensionNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensionNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDimensionNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensionNames")(js.undefined)
        ret
    }
    @scala.inline
    def withEncode(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encode")(js.undefined)
        ret
    }
    @scala.inline
    def withMarker(value: String): Self = {
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
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withPercent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPercent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percent")(js.undefined)
        ret
    }
    @scala.inline
    def withSeriesIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeriesIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withSeriesName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeriesName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesName")(js.undefined)
        ret
    }
    @scala.inline
    def withSeriesType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeriesType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesType")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: Double | js.Array[_]): Self = {
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

