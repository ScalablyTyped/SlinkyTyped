package typingsSlinky.ejWebAll.ej.PivotChart

import typingsSlinky.ejWebAll.ej.Pivot.AnalysisMode
import typingsSlinky.ejWebAll.ej.Pivot.OperationalMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  /** Triggers when it reaches the client-side after any AJAX request.
    */
  var afterServiceInvoke: js.UndefOr[js.Function1[/* e */ AfterServiceInvokeEventArgs, Unit]] = js.native
  /** Sets the mode for the pivot chart widget to bind either the OLAP or relational datasource.
    * @Default {ej.Pivot.AnalysisMode.Pivot}
    */
  var analysisMode: js.UndefOr[AnalysisMode | String] = js.native
  /** To override x axis for particular series, create an axis object by providing unique name by using name property and add it to axes array.
    * @Default {[]}
    */
  var axes: js.UndefOr[js.Array[_]] = js.native
  /** Triggers before performing export operation in the pivot chart.
    */
  var beforeExport: js.UndefOr[js.Function1[/* e */ BeforeExportEventArgs, Unit]] = js.native
  /** Triggers before rendering multiple series with multiple axes.
    */
  var beforeSeriesRender: js.UndefOr[js.Function1[/* e */ BeforeSeriesRenderEventArgs, Unit]] = js.native
  /** Triggers before any AJAX request is passed from the pivot chart to service methods.
    */
  var beforeServiceInvoke: js.UndefOr[js.Function1[/* e */ BeforeServiceInvokeEventArgs, Unit]] = js.native
  /** Options available to configure the properties of entire series. You can also override the options for specific series by using the series collection.
    * @Default {{}}
    */
  var commonSeriesOptions: js.UndefOr[CommonSeriesOptions] = js.native
  /** Specifies the CSS class to the pivot chart for achieving the custom theme.
    * @Default {â€œâ€}
    */
  var cssClass: js.UndefOr[String] = js.native
  /** Object is utilized to pass additional information between the client-end and the service-end while operating the control in the server mode.
    * @Default {{}}
    */
  var customObject: js.UndefOr[js.Any] = js.native
  /** Initializes the datasource for the pivot chart widget, when it functions completely on the client-side.
    * @Default {{}}
    */
  var dataSource: js.UndefOr[DataSource] = js.native
  /** Triggers when performing drill up/down operation in the pivot chart control.
    */
  var drillSuccess: js.UndefOr[js.Function1[/* e */ DrillSuccessEventArgs, Unit]] = js.native
  /** Allows you to enable the 3D view of the pivot chart.
    * @Default {false}
    */
  var enable3D: js.UndefOr[Boolean] = js.native
  /** Allows you to enable/disable context menu options in the pivot chart.
    * @Default {false}
    */
  var enableContextMenu: js.UndefOr[Boolean] = js.native
  /** Allows you to render the complete pivot chart on drill operation, when expanding and collapsing members are shown in multi-level labels.
    * @Default {false}
    */
  var enableMultiLevelLabels: js.UndefOr[Boolean] = js.native
  /** Allows you to view the pivot chart from right to left.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[Boolean] = js.native
  /** Allows you to enable &quot;withCredentials&quot; property inside XMLHttpRequest object for CORS(Cross-Origin Resource Sharing) request.
    * @Default {false}
    */
  var enableXHRCredentials: js.UndefOr[Boolean] = js.native
  /** Allows you to enable the responsiveness of pivot chart in the browser layout.
    * @Default {false}
    */
  var isResponsive: js.UndefOr[Boolean] = js.native
  /** You can customize the legend items and their labels.
    * @Default {{}}
    */
  var legend: js.UndefOr[js.Any] = js.native
  /** Triggers when the pivot chart starts to render.
    */
  var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, Unit]] = js.native
  /** Allows you to set the localized language for the widget.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.native
  /** Sets the mode for the pivot chart widget to bind the data source either in the server-side or client-side.
    * @Default {ej.Pivot.OperationalMode.ClientMode}
    */
  var operationalMode: js.UndefOr[OperationalMode | String] = js.native
  /** This is a horizontal axis that contains options to configure the axis and it is the primary x-axis for all series in the series array. To override x-axis for particular series,
    * create an axis object by providing a unique name by using the name property and add it to the axes array. Then, assign the name to the seriesâ€™s xAxisName property to link both
    * the axis and the series.
    * @Default {{}}
    */
  var primaryXAxis: js.UndefOr[js.Any] = js.native
  /** This is a vertical axis that contains options to configure the axis. This is the primary y-axis for all the series in the series array. To override y-axis for particular series,
    * create an axis object by providing a unique name by using the name property and add it to the axes array. Then, assign the name to the seriesâ€™s yAxisName property to link both
    * the axis and the series.
    * @Default {{}}
    */
  var primaryYAxis: js.UndefOr[js.Any] = js.native
  /** Triggers when the pivot chart widget completes all operations at client-side after the AJAX request.
    */
  var renderComplete: js.UndefOr[js.Function1[/* e */ RenderCompleteEventArgs, Unit]] = js.native
  /** Triggers when the error occurs on the AJAX request.
    */
  var renderFailure: js.UndefOr[js.Function1[/* e */ RenderFailureEventArgs, Unit]] = js.native
  /** Triggers when the pivot chart successfully reaches the client-side after the AJAX request.
    */
  var renderSuccess: js.UndefOr[js.Function1[/* e */ RenderSuccessEventArgs, Unit]] = js.native
  /** Allows you to rotate the angle of pivot chart in 3D view.
    * @Default {0}
    */
  var rotation: js.UndefOr[Double] = js.native
  /** Allows you to set the custom name for methods at service-end, when you are communicating on AJAX post.
    * @Default {{}}
    */
  var serviceMethodSettings: js.UndefOr[ServiceMethodSettings] = js.native
  /** Options to customize the size of the pivot chart control.
    * @Default {{}}
    */
  var size: js.UndefOr[js.Any] = js.native
  /** Options for customizing the title of PivotChart.
    */
  var title: js.UndefOr[Title] = js.native
  /** Connects the service by using the specified URL for any server updates while operating the control in the server mode.
    * @Default {â€œâ€}
    */
  var url: js.UndefOr[String] = js.native
  /** Options for enabling the zooming feature of the pivot chart.
    * @Default {{}}
    */
  var zooming: js.UndefOr[Zooming] = js.native
}

object Model {
  @scala.inline
  def apply(): Model = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Model]
  }
  @scala.inline
  implicit class ModelOps[Self <: Model] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterServiceInvoke(value: /* e */ AfterServiceInvokeEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterServiceInvoke")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfterServiceInvoke: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterServiceInvoke")(js.undefined)
        ret
    }
    @scala.inline
    def withAnalysisMode(value: AnalysisMode | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("analysisMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnalysisMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("analysisMode")(js.undefined)
        ret
    }
    @scala.inline
    def withAxes(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axes")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeExport(value: /* e */ BeforeExportEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeExport")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeExport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeExport")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeSeriesRender(value: /* e */ BeforeSeriesRenderEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeSeriesRender")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeSeriesRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeSeriesRender")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeServiceInvoke(value: /* e */ BeforeServiceInvokeEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeServiceInvoke")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeServiceInvoke: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeServiceInvoke")(js.undefined)
        ret
    }
    @scala.inline
    def withCommonSeriesOptions(value: CommonSeriesOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commonSeriesOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommonSeriesOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commonSeriesOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withCssClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClass")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomObject(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomObject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customObject")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSource(value: DataSource): Self = {
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
    def withDrillSuccess(value: /* e */ DrillSuccessEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drillSuccess")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDrillSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drillSuccess")(js.undefined)
        ret
    }
    @scala.inline
    def withEnable3D(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable3D")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnable3D: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable3D")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableContextMenu(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableContextMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableContextMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableContextMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableMultiLevelLabels(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableMultiLevelLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableMultiLevelLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableMultiLevelLabels")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableRTL(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRTL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableRTL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRTL")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableXHRCredentials(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableXHRCredentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableXHRCredentials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableXHRCredentials")(js.undefined)
        ret
    }
    @scala.inline
    def withIsResponsive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isResponsive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsResponsive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isResponsive")(js.undefined)
        ret
    }
    @scala.inline
    def withLegend(value: js.Any): Self = {
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
    def withLoad(value: /* e */ LoadEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withOperationalMode(value: OperationalMode | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationalMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperationalMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationalMode")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimaryXAxis(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryXAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimaryXAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryXAxis")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimaryYAxis(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryYAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimaryYAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryYAxis")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderComplete(value: /* e */ RenderCompleteEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderComplete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRenderComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderFailure(value: /* e */ RenderFailureEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderFailure")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRenderFailure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderFailure")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderSuccess(value: /* e */ RenderSuccessEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderSuccess")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRenderSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderSuccess")(js.undefined)
        ret
    }
    @scala.inline
    def withRotation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotation")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceMethodSettings(value: ServiceMethodSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceMethodSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceMethodSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceMethodSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: Title): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
    @scala.inline
    def withZooming(value: Zooming): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zooming")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZooming: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zooming")(js.undefined)
        ret
    }
  }
  
}

