package typingsSlinky.ejWebAll.ej.ReportViewer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  /** Fires before the ajax request process started.
    */
  var ajaxBeforeLoad: js.UndefOr[js.Function1[/* e */ AjaxBeforeLoadEventArgs, Unit]] = js.native
  /** Fires when ajax request failed.
    */
  var ajaxError: js.UndefOr[js.Function1[/* e */ AjaxErrorEventArgs, Unit]] = js.native
  /** Fires when ajax post call succeed.
    */
  var ajaxSuccess: js.UndefOr[js.Function1[/* e */ AjaxSuccessEventArgs, Unit]] = js.native
  /** Enables and disables the rendering of Viewer when default values are specified for the parameters.
    * @Default {true}
    */
  var autoRender: js.UndefOr[Boolean] = js.native
  /** Gets or sets the list of data sources for the RDLC report.
    * @Default {[]}
    */
  var dataSources: js.UndefOr[js.Array[DataSource]] = js.native
  /** Fires when the report viewer is destroyed successfully.If you want to perform any operation after destroying the reportviewer control,you can make use of the destroy event.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.native
  /** Fires during drill through action done in report.If you want to perform any operation when a drill through action is performed, you can make use of the drillThrough event.
    */
  var drillThrough: js.UndefOr[js.Function1[/* e */ DrillThroughEventArgs, Unit]] = js.native
  /** Enables and disables the data source credential block scroller.
    * @Default {true}
    */
  var enableDatasourceBlockScroller: js.UndefOr[Boolean] = js.native
  /** Enables and disables the drop-down parameter search.
    * @Default {false}
    */
  var enableDropDownSearch: js.UndefOr[Boolean] = js.native
  /** Enables and disables the Error Notification bar.
    * @Default {true}
    */
  var enableNotificationBar: js.UndefOr[Boolean] = js.native
  /** Enables or disables the page cache of report.
    * @Default {false}
    */
  var enablePageCache: js.UndefOr[Boolean] = js.native
  /** Enables and disables the PageVirtualization.
    * @Default {false}
    */
  var enablePageVirtualization: js.UndefOr[Boolean] = js.native
  /** Enables and disables the parameter block scroller.
    * @Default {true}
    */
  var enableParameterBlockScroller: js.UndefOr[Boolean] = js.native
  /** Fires when the export items are clicked. To perform any operation when the export items are clicked, use the exportItemClick event.
    */
  var exportItemClick: js.UndefOr[js.Function1[/* e */ ExportItemClickEventArgs, Unit]] = js.native
  /** Fires when the export progress is changed. To perform any operation when the export progress is changed, use the exportProgressChanged event.
    */
  var exportProgressChanged: js.UndefOr[js.Function1[/* e */ ExportProgressChangedEventArgs, Unit]] = js.native
  /** Specifies the export settings.
    */
  var exportSettings: js.UndefOr[ExportSettings] = js.native
  /** Fires when the hyperlink action is performed in the report. To perform any operation during the hyperlink action, use the hyperlink event.
    */
  var hyperlink: js.UndefOr[js.Function1[/* e */ HyperlinkEventArgs, Unit]] = js.native
  /** When set to true, adapts the report layout to fit the screen size of devices on which it renders.
    * @Default {true}
    */
  var isResponsive: js.UndefOr[Boolean] = js.native
  /** Specifies the locale for report viewer.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.native
  /** Specifies the page settings.
    */
  var pageSettings: js.UndefOr[PageSettings] = js.native
  /** Specifies the parameter settings.
    */
  var parameterSettings: js.UndefOr[ParameterSettings] = js.native
  /** Fires when the dependent parameter value is the parameter block. You can add custom user interface, loading indicator and modify the default progress text, using the
    * ParameterUpdateStateChange event.
    */
  var parameterUpdateStateChange: js.UndefOr[js.Function1[/* e */ ParameterUpdateStateChangeEventArgs, Unit]] = js.native
  /** Gets or sets the list of parameters associated with the report.
    * @Default {[]}
    */
  var parameters: js.UndefOr[js.Array[Parameter]] = js.native
  /** Enables and disables the print mode.
    * @Default {false}
    */
  var printMode: js.UndefOr[Boolean] = js.native
  /** Specifies the print option of the report.
    * @Default {ej.ReportViewer.PrintOptions.Default}
    */
  var printOption: js.UndefOr[PrintOptions | String] = js.native
  /** Fires when the print progress is changed. To perform any operation when the print progress is changed, use the printProgressChanged event.
    */
  var printProgressChanged: js.UndefOr[js.Function1[/* e */ PrintProgressChangedEventArgs, Unit]] = js.native
  /** Specifies the processing mode of the report.
    * @Default {ej.ReportViewer.ProcessingMode.Remote}
    */
  var processingMode: js.UndefOr[ProcessingMode | String] = js.native
  /** Specifies the render layout.
    * @Default {ej.ReportViewer.RenderMode.Default}
    */
  var renderMode: js.UndefOr[RenderMode | String] = js.native
  /** Fires before report rendering is completed.If you want to perform any operation before the rendering of report,you can make use of the renderingBegin event.
    */
  var renderingBegin: js.UndefOr[js.Function1[/* e */ RenderingBeginEventArgs, Unit]] = js.native
  /** Fires after report rendering completed.If you want to perform any operation after the rendering of report,you can make use of this renderingComplete event.
    */
  var renderingComplete: js.UndefOr[js.Function1[/* e */ RenderingCompleteEventArgs, Unit]] = js.native
  /** Fires when any error occurred while rendering the report.If you want to perform any operation when an error occurs in the report, you can make use of the reportError event.
    */
  var reportError: js.UndefOr[js.Function1[/* e */ ReportErrorEventArgs, Unit]] = js.native
  /** Fires when the report is being exported.If you want to perform any operation before exporting of report, you can make use of the reportExport event.
    */
  var reportExport: js.UndefOr[js.Function1[/* e */ ReportExportEventArgs, Unit]] = js.native
  /** Fires when the report is loaded.If you want to perform any operation after the successful loading of report, you can make use of the reportLoaded event.
    */
  var reportLoaded: js.UndefOr[js.Function1[/* e */ ReportLoadedEventArgs, Unit]] = js.native
  /** Gets or sets the path of the report file.
    * @Default {empty}
    */
  var reportPath: js.UndefOr[String] = js.native
  /** Fires when the report print action is performed in the report. To perform any operation during the report print action, use the ReportPrint event.
    */
  var reportPrint: js.UndefOr[js.Function1[/* e */ ReportPrintEventArgs, Unit]] = js.native
  /** Gets or sets the reports server URL.
    * @Default {empty}
    */
  var reportServerUrl: js.UndefOr[String] = js.native
  /** Specifies the report Web API service URL.
    * @Default {empty}
    */
  var reportServiceUrl: js.UndefOr[String] = js.native
  /** Specifies the token for authorizing reporting service url to process the reports.
    * @Default {empty}
    */
  var serviceAuthorizationToken: js.UndefOr[String] = js.native
  /** Fires when user clicks on a failed report item in the rendered report, before displaying error details dialog. If you want to show custom error detail or perform any action before
    * viewing error detail, you can make use of the showError event.
    */
  var showError: js.UndefOr[js.Function1[/* e */ ShowErrorEventArgs, Unit]] = js.native
  /** Gets or sets the showExceptionsInDialog for report viewer.
    * @Default {false}
    */
  var showExceptionsInDialog: js.UndefOr[Boolean] = js.native
  /** Render the ReportViewer height based on the report content size.
    * @Default {false}
    */
  var sizeToReportContent: js.UndefOr[Boolean] = js.native
  /** Fires when the toolbar items are clicked. To perform any operation when the toolbar items are clicked, use the toolBarItemClick event.
    */
  var toolBarItemClick: js.UndefOr[js.Function1[/* e */ ToolBarItemClickEventArgs, Unit]] = js.native
  /** This event will be triggered on rendering the Report Viewer toolbar.
    */
  var toolbarRendering: js.UndefOr[js.Function1[/* e */ ToolbarRenderingEventArgs, Unit]] = js.native
  /** Specifies the toolbar settings.
    */
  var toolbarSettings: js.UndefOr[ToolbarSettings] = js.native
  /** Fires when click the View Report Button.
    */
  var viewReportClick: js.UndefOr[js.Function1[/* e */ ViewReportClickEventArgs, Unit]] = js.native
  /** Gets or sets the zoom factor for report viewer.
    * @Default {1}
    */
  var zoomFactor: js.UndefOr[Double] = js.native
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
    def withAjaxBeforeLoad(value: /* e */ AjaxBeforeLoadEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxBeforeLoad")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAjaxBeforeLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxBeforeLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withAjaxError(value: /* e */ AjaxErrorEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAjaxError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxError")(js.undefined)
        ret
    }
    @scala.inline
    def withAjaxSuccess(value: /* e */ AjaxSuccessEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxSuccess")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAjaxSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxSuccess")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoRender(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoRender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoRender")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSources(value: js.Array[DataSource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSources")(js.undefined)
        ret
    }
    @scala.inline
    def withDestroy(value: /* e */ DestroyEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDestroy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.undefined)
        ret
    }
    @scala.inline
    def withDrillThrough(value: /* e */ DrillThroughEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drillThrough")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDrillThrough: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drillThrough")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableDatasourceBlockScroller(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableDatasourceBlockScroller")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableDatasourceBlockScroller: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableDatasourceBlockScroller")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableDropDownSearch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableDropDownSearch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableDropDownSearch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableDropDownSearch")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableNotificationBar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableNotificationBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableNotificationBar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableNotificationBar")(js.undefined)
        ret
    }
    @scala.inline
    def withEnablePageCache(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePageCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnablePageCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePageCache")(js.undefined)
        ret
    }
    @scala.inline
    def withEnablePageVirtualization(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePageVirtualization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnablePageVirtualization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePageVirtualization")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableParameterBlockScroller(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableParameterBlockScroller")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableParameterBlockScroller: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableParameterBlockScroller")(js.undefined)
        ret
    }
    @scala.inline
    def withExportItemClick(value: /* e */ ExportItemClickEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportItemClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutExportItemClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportItemClick")(js.undefined)
        ret
    }
    @scala.inline
    def withExportProgressChanged(value: /* e */ ExportProgressChangedEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportProgressChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutExportProgressChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportProgressChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withExportSettings(value: ExportSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExportSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withHyperlink(value: /* e */ HyperlinkEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hyperlink")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHyperlink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hyperlink")(js.undefined)
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
    def withPageSettings(value: PageSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withParameterSettings(value: ParameterSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameterSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameterSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameterSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withParameterUpdateStateChange(value: /* e */ ParameterUpdateStateChangeEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameterUpdateStateChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutParameterUpdateStateChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameterUpdateStateChange")(js.undefined)
        ret
    }
    @scala.inline
    def withParameters(value: js.Array[Parameter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(js.undefined)
        ret
    }
    @scala.inline
    def withPrintMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrintMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printMode")(js.undefined)
        ret
    }
    @scala.inline
    def withPrintOption(value: PrintOptions | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrintOption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printOption")(js.undefined)
        ret
    }
    @scala.inline
    def withPrintProgressChanged(value: /* e */ PrintProgressChangedEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printProgressChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPrintProgressChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printProgressChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessingMode(value: ProcessingMode | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processingMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessingMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processingMode")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderMode(value: RenderMode | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderMode")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderingBegin(value: /* e */ RenderingBeginEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderingBegin")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRenderingBegin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderingBegin")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderingComplete(value: /* e */ RenderingCompleteEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderingComplete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRenderingComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderingComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withReportError(value: /* e */ ReportErrorEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutReportError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportError")(js.undefined)
        ret
    }
    @scala.inline
    def withReportExport(value: /* e */ ReportExportEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportExport")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutReportExport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportExport")(js.undefined)
        ret
    }
    @scala.inline
    def withReportLoaded(value: /* e */ ReportLoadedEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportLoaded")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutReportLoaded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportLoaded")(js.undefined)
        ret
    }
    @scala.inline
    def withReportPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportPath")(js.undefined)
        ret
    }
    @scala.inline
    def withReportPrint(value: /* e */ ReportPrintEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportPrint")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutReportPrint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportPrint")(js.undefined)
        ret
    }
    @scala.inline
    def withReportServerUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportServerUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportServerUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportServerUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withReportServiceUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportServiceUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportServiceUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportServiceUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceAuthorizationToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceAuthorizationToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceAuthorizationToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceAuthorizationToken")(js.undefined)
        ret
    }
    @scala.inline
    def withShowError(value: /* e */ ShowErrorEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutShowError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showError")(js.undefined)
        ret
    }
    @scala.inline
    def withShowExceptionsInDialog(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showExceptionsInDialog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowExceptionsInDialog: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showExceptionsInDialog")(js.undefined)
        ret
    }
    @scala.inline
    def withSizeToReportContent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeToReportContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizeToReportContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeToReportContent")(js.undefined)
        ret
    }
    @scala.inline
    def withToolBarItemClick(value: /* e */ ToolBarItemClickEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolBarItemClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutToolBarItemClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolBarItemClick")(js.undefined)
        ret
    }
    @scala.inline
    def withToolbarRendering(value: /* e */ ToolbarRenderingEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarRendering")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutToolbarRendering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarRendering")(js.undefined)
        ret
    }
    @scala.inline
    def withToolbarSettings(value: ToolbarSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolbarSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withViewReportClick(value: /* e */ ViewReportClickEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewReportClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutViewReportClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewReportClick")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomFactor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomFactor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomFactor")(js.undefined)
        ret
    }
  }
  
}

