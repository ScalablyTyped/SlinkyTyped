package typingsSlinky.highcharts.mod

import typingsSlinky.highcharts.highchartsStrings.wordcloud
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.highcharts.mod.SeriesOptions because var conflicts: zIndex. Inlined id, index, legendIndex, mapData, name, stack, treemap, `type`, xAxis, yAxis */ @js.native
trait SeriesWordcloudOptions
  extends PlotWordcloudOptions
     with SeriesOptionsType {
  /**
    * Not available
    */
  var crisp: js.UndefOr[scala.Nothing] = js.native
  /**
    * Not available
    */
  var cropTreshold: js.UndefOr[scala.Nothing] = js.native
  /**
    * (Highcharts) An array of data points for the series. For the `wordcloud`
    * series type, points can be given in the following ways:
    *
    * 1. An array of arrays with 2 values. In this case, the values correspond
    * to `name,weight`. (see online documentation for example)
    *
    * 2. An array of objects with named values. The following snippet shows
    * only a few settings, see the complete options set below. If the total
    * number of data points exceeds the series' turboThreshold, this option is
    * not available. (see online documentation for example)
    */
  var data: js.UndefOr[js.Array[(js.Tuple2[String, Double]) | SeriesWordcloudDataOptions]] = js.native
  /**
    * Not available
    */
  var depth: js.UndefOr[scala.Nothing] = js.native
  /**
    * Not available
    */
  var edgeColor: js.UndefOr[scala.Nothing] = js.native
  /**
    * Not available
    */
  var groupPadding: js.UndefOr[scala.Nothing] = js.native
  /**
    * Not available
    */
  var groupZPadding: js.UndefOr[scala.Nothing] = js.native
  /**
    * Not available
    */
  var grouping: js.UndefOr[scala.Nothing] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) An id for the series. This can
    * be used after render time to get a pointer to the series object through
    * `chart.get()`.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The index of the series in the
    * chart, affecting the internal index in the `chart.series` array, the
    * visible Z index as well as the order in the legend.
    */
  var index: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The sequential index of the
    * series in the legend.
    */
  var legendIndex: js.UndefOr[Double] = js.native
  /**
    * (Highmaps) A map data object containing a `path` definition and
    * optionally additional properties to join in the data as per the `joinBy`
    * option.
    */
  var mapData: js.UndefOr[js.Array[SeriesMapDataOptions] | js.Any] = js.native
  /**
    * Not available
    */
  var maxPointWidth: js.UndefOr[scala.Nothing] = js.native
  /**
    * Not available
    */
  var minPointLength: js.UndefOr[scala.Nothing] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The name of the series as shown
    * in the legend, tooltip etc.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Not available
    */
  var pointPadding: js.UndefOr[scala.Nothing] = js.native
  /**
    * Not available
    */
  var pointWidth: js.UndefOr[scala.Nothing] = js.native
  /**
    * (Highcharts, Highstock) This option allows grouping series in a stacked
    * chart. The stack option can be a string or anything else, as long as the
    * grouped series' stack options match each other after conversion into a
    * string.
    */
  var stack: js.UndefOr[Double | String] = js.native
  var treemap: js.UndefOr[SeriesTreemapOptions] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) This property is only in
    * TypeScript non-optional and might be `undefined` in series objects from
    * unknown sources.
    */
  var `type`: String | wordcloud = js.native
  /**
    * (Highcharts, Highstock) When using dual or multiple x axes, this number
    * defines which xAxis the particular series is connected to. It refers to
    * either the axis id or the index of the axis in the xAxis array, with 0
    * being the first.
    */
  var xAxis: js.UndefOr[Double | String] = js.native
  /**
    * (Highcharts, Highstock) When using dual or multiple y axes, this number
    * defines which yAxis the particular series is connected to. It refers to
    * either the axis id or the index of the axis in the yAxis array, with 0
    * being the first.
    */
  var yAxis: js.UndefOr[Double | String] = js.native
}

object SeriesWordcloudOptions {
  @scala.inline
  def apply(`type`: String | wordcloud): SeriesWordcloudOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesWordcloudOptions]
  }
  @scala.inline
  implicit class SeriesWordcloudOptionsOps[Self <: SeriesWordcloudOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: String | wordcloud): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCrisp(value: scala.Nothing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crisp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrisp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crisp")(js.undefined)
        ret
    }
    @scala.inline
    def withCropTreshold(value: scala.Nothing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cropTreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCropTreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cropTreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: js.Array[(js.Tuple2[String, Double]) | SeriesWordcloudDataOptions]): Self = {
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
    def withDepth(value: scala.Nothing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDepth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depth")(js.undefined)
        ret
    }
    @scala.inline
    def withEdgeColor(value: scala.Nothing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEdgeColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeColor")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupPadding(value: scala.Nothing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupZPadding(value: scala.Nothing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupZPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupZPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupZPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withGrouping(value: scala.Nothing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grouping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrouping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grouping")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
        ret
    }
    @scala.inline
    def withLegendIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegendIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withMapData(value: js.Array[SeriesMapDataOptions] | js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMapData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapData")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxPointWidth(value: scala.Nothing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPointWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxPointWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPointWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMinPointLength(value: scala.Nothing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minPointLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinPointLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minPointLength")(js.undefined)
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
    def withPointPadding(value: scala.Nothing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withPointWidth(value: scala.Nothing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withStack(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stack")(js.undefined)
        ret
    }
    @scala.inline
    def withTreemap(value: SeriesTreemapOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treemap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTreemap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treemap")(js.undefined)
        ret
    }
    @scala.inline
    def withXAxis(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxis")(js.undefined)
        ret
    }
    @scala.inline
    def withYAxis(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxis")(js.undefined)
        ret
    }
  }
  
}

