package typingsSlinky.canvasjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartOptions extends js.Object {
  /**
    * Sets the duration of animation in milliseconds.
    * Default: 1200
    * Example: 1000, 500 etc.
    */
  var animationDuration: js.UndefOr[Double] = js.native
  /**
    * Enables Animation while rendering the Chart.
    * Default: true
    * Example: false, true
    */
  var animationEnabled: js.UndefOr[Boolean] = js.native
  /**
    * axisX object lets you set various parameters of X Axis like interval, grid lines, etc. It is mostly horizontal, except when we are working with Bar Charts, where axisX is vertical.
    */
  var axisX: js.UndefOr[ChartAxisXOptions | js.Array[ChartAxisXOptions]] = js.native
  /**
    * axisX2 is the secondary axis which renders on the opposite of primary axis (axisX).
    * It is mostly horizontal on top, except when we are working with Bar Charts, where axisX2 is vertical on right.
    */
  var axisX2: js.UndefOr[ChartAxisXOptions | js.Array[ChartAxisXOptions]] = js.native
  /**
    * axisY object lets you set various parameters of Y Axis like interval, grid lines, etc. It is mostly vertical, except when we are working with Bar Charts, where axisY is horizontal.
    */
  var axisY: js.UndefOr[ChartAxisYOptions | js.Array[ChartAxisYOptions]] = js.native
  /**
    * axisY2 is the secondary axis which renders on the opposite of primary axis (axisY). It is mostly vertical, except when we are working with Bar Charts, where axisY2 is horizontal.
    */
  var axisY2: js.UndefOr[ChartAxisYOptions | js.Array[ChartAxisYOptions]] = js.native
  /**
    * Sets the background color of entire Chart Area. Values can be "HTML Color Name", "hex code" or "rgba values"
    * Default: "white"
    * Example: "yellow", "#F5DEB3"..
    */
  var backgroundColor: js.UndefOr[String] = js.native
  /**
    * Sets the colorSet of the Chart. Color Set is an array of colors that are used to render data. Various predefined Color Sets are bundled along with the library.
    * You can either choose from the pre-defined Color Sets or define your own Color Set.
    * Default: "colorset1" or as defined in the selected theme
    * Example: "colorSet1", "colorSet2", "colorSet3"
    */
  var colorSet: js.UndefOr[String] = js.native
  /**
    * CanvasJS allows you to localize various culture / language / country specific elements in the Chart like number formatting style – where you can choose
    * which character to use as a decimal separator and as a digit group separator (also referred to as a thousand separator).
    * By default CanvasJS is set to Neutral English Culture – "en".
    * Default: "en"
    */
  var culture: js.UndefOr[String] = js.native
  /**
    * data is an array of dataSeries Objects.
    */
  var data: js.Array[ChartDataSeriesOptions] = js.native
  /**
    * dataPointMaxWidth sets the maximum width of dataPoints in column / bar, ohlc and candlestick, charts.
    * This allows you to limit the width of dataPoints when there are very few of them in the chart.
    * At the same time, when the number of dataPoints increase, chart reduces their width so that they don’t overlap.
    * Default : Automatically calculated based on the chart size.
    * Example : 10, 20, 30, etc.
    */
  var dataPointMaxWidth: js.UndefOr[Double] = js.native
  /**
    * Setting exportEnabled to true enables the export feature. As of now JPG & PNG formats are supported. Export feature is available in all Chart Types.
    * Default: false
    * Options: true, false
    */
  var exportEnabled: js.UndefOr[Boolean] = js.native
  /**
    * While exporting any chart, "Chart" is used as the default fine name with corresponding extension "jpg" or "png". You can override this name using exportFileName property.
    * Default: Chart
    */
  var exportFileName: js.UndefOr[String] = js.native
  /**
    * Sets the width of the Chart
    * Default: Takes chart container’s height by default. If the height is not set for the chart container, defaults to 400.
    * Example: 260, 300, 400
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * Enables / Disables Chart interactivity like toolTip, mouse and touch events.
    * Default: true
    * Example: false, true
    */
  var interactivityEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Whenever the chart contains multiple dataSeries, it is recommended to represent each dataSeries in a legend.
    * This way it becomes easier for the user to know what exactly is represented by each of the dataSeries.
    * In case of Pie and Doughnut charts, an entry is created for each dataPoint and in rest of the chart types entries are created for each dataSeries.
    * You can selectively show or hide a dataSeries in the Legend using showInLegend property of dataSeries.
    */
  var legend: js.UndefOr[ChartLegendOptions] = js.native
  /**
    * subtitles is a collection of subtitle elements. This allows you to have as many subtitles as you want in a chart.
    * subtitle allows you to set content, appearance and position of Chart’s subtitle. subtitle is very much like title except that its font size is lesser than title by default.
    */
  var subtitles: js.UndefOr[js.Array[ChartTitleOptions]] = js.native
  /**
    * Sets the theme of the Chart. Various predefined themes are bundled along with the library. User can easily switch these themes by changing theme property to the below mentioned options.
    * Default: "theme1"
    * Options: "theme1","theme2", "theme3"
    */
  var theme: js.UndefOr[String] = js.native
  /**
    * Title allows you to set content, appearance and position of Chart’s Title.
    */
  var title: ChartTitleOptions = js.native
  /**
    * toolTip object lets user set behaviour of toolTip at global level like enabling/disabling animation, setting Border Color, sharing toolTip between multiple dataSeries, etc.
    * You can also disable the toolTip by setting enabled property to false.
    */
  var toolTip: js.UndefOr[ChartToolTipOptions] = js.native
  /**
    * Sets the width of the Chart.
    * Default: Takes chart container’s width by default. If the width is not set for the chart container, defaults to 500.
    * Example: 380, 500, 720
    */
  var width: js.UndefOr[Double] = js.native
  /**
    * Setting zoomEnabled to true enables zooming and panning feature of Chart.
    * This way you can zoom into an area of interest when there is a large amount of data.
    * This will also allow you to pan through the chart.
    * If not set, the property is automatically enabled for large number of dataPoints. You can switch between zooming & panning using the toolbar that appears on the chart.
    * After Zooming in, you can reset the chart by clicking the reset button.
    * Default: false
    * Options: true, false
    */
  var zoomEnabled: js.UndefOr[Boolean] = js.native
}

object ChartOptions {
  @scala.inline
  def apply(data: js.Array[ChartDataSeriesOptions], title: ChartTitleOptions): ChartOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartOptions]
  }
  @scala.inline
  implicit class ChartOptionsOps[Self <: ChartOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: js.Array[ChartDataSeriesOptions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: ChartTitleOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnimationDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimationEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withAxisX(value: ChartAxisXOptions | js.Array[ChartAxisXOptions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxisX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisX")(js.undefined)
        ret
    }
    @scala.inline
    def withAxisX2(value: ChartAxisXOptions | js.Array[ChartAxisXOptions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisX2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxisX2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisX2")(js.undefined)
        ret
    }
    @scala.inline
    def withAxisY(value: ChartAxisYOptions | js.Array[ChartAxisYOptions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxisY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisY")(js.undefined)
        ret
    }
    @scala.inline
    def withAxisY2(value: ChartAxisYOptions | js.Array[ChartAxisYOptions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisY2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxisY2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisY2")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withColorSet(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorSet")(js.undefined)
        ret
    }
    @scala.inline
    def withCulture(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("culture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCulture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("culture")(js.undefined)
        ret
    }
    @scala.inline
    def withDataPointMaxWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataPointMaxWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataPointMaxWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataPointMaxWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withExportEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExportEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withExportFileName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportFileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExportFileName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportFileName")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withInteractivityEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactivityEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInteractivityEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactivityEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withLegend(value: ChartLegendOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legend")(js.undefined)
        ret
    }
    @scala.inline
    def withSubtitles(value: js.Array[ChartTitleOptions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubtitles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitles")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
    @scala.inline
    def withToolTip(value: ChartToolTipOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolTip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolTip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolTip")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomEnabled")(js.undefined)
        ret
    }
  }
  
}

