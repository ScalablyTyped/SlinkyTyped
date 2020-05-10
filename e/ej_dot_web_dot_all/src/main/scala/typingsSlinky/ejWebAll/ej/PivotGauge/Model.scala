package typingsSlinky.ejWebAll.ej.PivotGauge

import typingsSlinky.ejWebAll.ej.Pivot.AnalysisMode
import typingsSlinky.ejWebAll.ej.Pivot.OperationalMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  /** Triggers when it reaches client-side after any AJAX request.
    */
  var afterServiceInvoke: js.UndefOr[js.Function1[/* e */ AfterServiceInvokeEventArgs, Unit]] = js.native
  /** Sets the mode for the PivotGauge widget for binding either OLAP or Relational data source.
    * @Default {ej.Pivot.AnalysisMode.Pivot}
    */
  var analysisMode: js.UndefOr[AnalysisMode | String] = js.native
  /** Triggers before populating the pivot engine on operating in client mode.
    */
  var beforePivotEnginePopulate: js.UndefOr[js.Function1[/* e */ BeforePivotEnginePopulateEventArgs, Unit]] = js.native
  /** Triggers before any AJAX request is passed from PivotGauge to service methods.
    */
  var beforeServiceInvoke: js.UndefOr[js.Function1[/* e */ BeforeServiceInvokeEventArgs, Unit]] = js.native
  /** Sets the number of columns to arrange the Pivot Gauges.
    * @Default {0}
    */
  var columnsCount: js.UndefOr[Double] = js.native
  /** Specifies the CSS class to PivotGauge to achieve custom theme.
    * @Default {â€œâ€}
    */
  var cssClass: js.UndefOr[String] = js.native
  /** Object utilized to pass additional information between client-end and service-end on operating in server mode.
    * @Default {{}}
    */
  var customObject: js.UndefOr[js.Any] = js.native
  /** Initializes the data source for the PivotGauge widget, when it functions completely on client-side.
    * @Default {{}}
    */
  var dataSource: js.UndefOr[DataSource] = js.native
  /** Enables/disables the animation of pointer in PivotGauge.
    * @Default {false}
    */
  var enableAnimation: js.UndefOr[Boolean] = js.native
  /** Allows the user to view PivotGauge from right to left.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[Boolean] = js.native
  /** Enables/disables tooltip visibility in PivotGauge.
    * @Default {false}
    */
  var enableTooltip: js.UndefOr[Boolean] = js.native
  /** Allows you to enable &quot;withCredentials&quot; property inside XMLHttpRequest object for CORS(Cross-Origin Resource Sharing) request.
    * @Default {false}
    */
  var enableXHRCredentials: js.UndefOr[Boolean] = js.native
  /** Specify the frame details of PivotGauge here.
    * @Default {Object}
    */
  var frame: js.UndefOr[Frame] = js.native
  /** Allows the user to enable PivotGaugeâ€™s responsiveness in the browser layout.
    * @Default {false}
    */
  var isResponsive: js.UndefOr[Boolean] = js.native
  /** Allows the user to change the format of the label values in PivotGauge.
    * @Default {null}
    */
  var labelFormatSettings: js.UndefOr[LabelFormatSettings] = js.native
  /** Triggers when PivotGauge started loading at client-side.
    */
  var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, Unit]] = js.native
  /** Allows the user to set the localized language for the widget.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.native
  /** Sets the mode for the PivotGauge widget for binding data source either in server-side or client-side.
    * @Default {ej.Pivot.OperationalMode.ClientMode}
    */
  var operationalMode: js.UndefOr[OperationalMode | String] = js.native
  /** Triggers when PivotGauge widget completes all operations at client-side after any AJAX request.
    */
  var renderComplete: js.UndefOr[js.Function1[/* e */ RenderCompleteEventArgs, Unit]] = js.native
  /** Triggers when any error occurred during AJAX request.
    */
  var renderFailure: js.UndefOr[js.Function1[/* e */ RenderFailureEventArgs, Unit]] = js.native
  /** Triggers when PivotGauge successfully reaches client-side after any AJAX request.
    */
  var renderSuccess: js.UndefOr[js.Function1[/* e */ RenderSuccessEventArgs, Unit]] = js.native
  /** Sets the number of rows to arrange the Pivot Gauges.
    * @Default {0}
    */
  var rowsCount: js.UndefOr[Double] = js.native
  /** Sets the scale values such as pointers, indicators, etc... for PivotGauge.
    * @Default {{}}
    */
  var scales: js.UndefOr[js.Any] = js.native
  /** Allows the user to set the custom name for the methods at service-end, communicated during AJAX post.
    * @Default {{}}
    */
  var serviceMethodSettings: js.UndefOr[ServiceMethodSettings] = js.native
  /** Enables/disables the header labels in PivotGauge.
    * @Default {true}
    */
  var showHeaderLabel: js.UndefOr[Boolean] = js.native
  /** Connects the service using the specified URL for any server updates on server mode operation.
    * @Default {â€œâ€}
    */
  var url: js.UndefOr[String] = js.native
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
    def withBeforePivotEnginePopulate(value: /* e */ BeforePivotEnginePopulateEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforePivotEnginePopulate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforePivotEnginePopulate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforePivotEnginePopulate")(js.undefined)
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
    def withColumnsCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnsCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnsCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnsCount")(js.undefined)
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
    def withEnableAnimation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAnimation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAnimation")(js.undefined)
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
    def withEnableTooltip(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableTooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableTooltip")(js.undefined)
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
    def withFrame(value: Frame): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frame")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrame: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frame")(js.undefined)
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
    def withLabelFormatSettings(value: LabelFormatSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFormatSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelFormatSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFormatSettings")(js.undefined)
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
    def withRowsCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowsCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowsCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowsCount")(js.undefined)
        ret
    }
    @scala.inline
    def withScales(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scales")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScales: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scales")(js.undefined)
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
    def withShowHeaderLabel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHeaderLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowHeaderLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHeaderLabel")(js.undefined)
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
  }
  
}

