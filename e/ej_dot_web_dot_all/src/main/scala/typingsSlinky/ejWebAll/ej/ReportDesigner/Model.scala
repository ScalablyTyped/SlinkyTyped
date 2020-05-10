package typingsSlinky.ejWebAll.ej.ReportDesigner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  /** This event will be triggered before AJAX loads.
    */
  var ajaxBeforeLoad: js.UndefOr[js.Function1[/* e */ AjaxBeforeLoadEventArgs, Unit]] = js.native
  /** This event will be triggered when AJAX result is failed.
    */
  var ajaxError: js.UndefOr[js.Function1[/* e */ AjaxErrorEventArgs, Unit]] = js.native
  /** This event will be triggered when AJAX result is succeeded.
    */
  var ajaxSuccess: js.UndefOr[js.Function1[/* e */ AjaxSuccessEventArgs, Unit]] = js.native
  /** Shows or hides the items of configuration pane in ReportDesigner control.
    */
  var configurePaneSettings: js.UndefOr[ConfigurePaneSettings] = js.native
  /** This event will be triggered when the Report Designer widget is created.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.native
  /** This event will be triggered when the Report Designer widget is destroyed.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.native
  /** Specifies the locale for report designer.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.native
  /** This event will be triggered while initiating new data click action. You can suppress the new data creation panel and perform custom actions.
    */
  var newDataClick: js.UndefOr[js.Function1[/* e */ NewDataClickEventArgs, Unit]] = js.native
  /** This event will be triggered while clicking open menu items.
    */
  var openReportClick: js.UndefOr[js.Function1[/* e */ OpenReportClickEventArgs, Unit]] = js.native
  /** Shows or hides the create, edit, and delete options in data source and dataset panels.
    * @Default {ej.ReportDesigner.Permission.All}
    */
  var permissionSettings: js.UndefOr[PermissionSettings] = js.native
  /** This event will be triggered while previewing the report in RDLC mode. It can be used to suppress the preview data dialog in RDLC mode.
    */
  var previewReport: js.UndefOr[js.Function1[/* e */ PreviewReportEventArgs, Unit]] = js.native
  /** Gets or sets the list of custom data extension items.
    * @Default {[]}
    */
  var reportDataExtensions: js.UndefOr[js.Array[ReportDataExtension]] = js.native
  /** Gets or sets the list of custom report items.
    * @Default {[]}
    */
  var reportItemExtensions: js.UndefOr[js.Array[ReportItemExtension]] = js.native
  /** This event will be triggered when the report is modified.
    */
  var reportModified: js.UndefOr[js.Function1[/* e */ ReportModifiedEventArgs, Unit]] = js.native
  /** This event will be triggered when the report is opened.
    */
  var reportOpened: js.UndefOr[js.Function1[/* e */ ReportOpenedEventArgs, Unit]] = js.native
  /** Gets or sets the report path of server.
    * @Default {null}
    */
  var reportPath: js.UndefOr[String] = js.native
  /** This event will be triggered when the report is saved.
    */
  var reportSaved: js.UndefOr[js.Function1[/* e */ ReportSavedEventArgs, Unit]] = js.native
  /** Gets or sets the reports server URL.
    * @Default {null}
    */
  var reportServerUrl: js.UndefOr[String] = js.native
  /** Gets or sets the report type.
    * @Default {ej.ReportDesigner.ReportType.RDL}
    */
  var reportType: js.UndefOr[String] = js.native
  /** This event will be triggered when the save menu items are clicked.
    */
  var saveReportClick: js.UndefOr[js.Function1[/* e */ SaveReportClickEventArgs, Unit]] = js.native
  /** Gets or sets the serviceAuthorizationToken to access the Report Server API services.
    * @Default {empty}
    */
  var serviceAuthorizationToken: js.UndefOr[String] = js.native
  /** Gets or sets the URL of the  WebAPI service; it will be used for processing the report.
    * @Default {null}
    */
  var serviceUrl: js.UndefOr[String] = js.native
  /** Gets or sets the tenant name of the user groups; it will be used when integrating report designer with server.
    * @Default {null}
    */
  var tenantName: js.UndefOr[String] = js.native
  /** This event will be triggered while clicking the toolbar items.
    */
  var toolbarClick: js.UndefOr[js.Function1[/* e */ ToolbarClickEventArgs, Unit]] = js.native
  /** This event will be triggered on rendering the Report Designer toolbar.
    */
  var toolbarRendering: js.UndefOr[js.Function1[/* e */ ToolbarRenderingEventArgs, Unit]] = js.native
  /** Defines the settings of the ReportDesigner toolbar.
    */
  var toolbarSettings: js.UndefOr[ToolbarSettings] = js.native
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
    def withConfigurePaneSettings(value: ConfigurePaneSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configurePaneSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigurePaneSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configurePaneSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withCreate(value: /* e */ CreateEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.undefined)
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
    def withNewDataClick(value: /* e */ NewDataClickEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newDataClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutNewDataClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newDataClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenReportClick(value: /* e */ OpenReportClickEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openReportClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOpenReportClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openReportClick")(js.undefined)
        ret
    }
    @scala.inline
    def withPermissionSettings(value: PermissionSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissionSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPermissionSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissionSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviewReport(value: /* e */ PreviewReportEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewReport")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPreviewReport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewReport")(js.undefined)
        ret
    }
    @scala.inline
    def withReportDataExtensions(value: js.Array[ReportDataExtension]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportDataExtensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportDataExtensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportDataExtensions")(js.undefined)
        ret
    }
    @scala.inline
    def withReportItemExtensions(value: js.Array[ReportItemExtension]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportItemExtensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportItemExtensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportItemExtensions")(js.undefined)
        ret
    }
    @scala.inline
    def withReportModified(value: /* e */ ReportModifiedEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportModified")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutReportModified: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportModified")(js.undefined)
        ret
    }
    @scala.inline
    def withReportOpened(value: /* e */ ReportOpenedEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportOpened")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutReportOpened: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportOpened")(js.undefined)
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
    def withReportSaved(value: /* e */ ReportSavedEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportSaved")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutReportSaved: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportSaved")(js.undefined)
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
    def withReportType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportType")(js.undefined)
        ret
    }
    @scala.inline
    def withSaveReportClick(value: /* e */ SaveReportClickEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveReportClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSaveReportClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveReportClick")(js.undefined)
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
    def withServiceUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withTenantName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tenantName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTenantName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tenantName")(js.undefined)
        ret
    }
    @scala.inline
    def withToolbarClick(value: /* e */ ToolbarClickEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutToolbarClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarClick")(js.undefined)
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
  }
  
}

