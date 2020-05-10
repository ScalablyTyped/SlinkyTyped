package typingsSlinky.datatablesNet.DataTables

import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion "Static-Methods"
//#region "Settings"
@js.native
trait Settings extends js.Object {
  //#endregion "Features"
  //#region "Data"
  /**
    * Load data for the table's content from an Ajax source. Since: 1.10
    */
  var ajax: js.UndefOr[String | AjaxSettings | FunctionAjax] = js.native
  //#region "Features"
  /**
    * Feature control DataTables' smart column width handling. Since: 1.10
    */
  var autoWidth: js.UndefOr[Boolean] = js.native
  /**
    * Assign a column definition to one or more columns.. Since: 1.10
    */
  var columnDefs: js.UndefOr[js.Array[ColumnDefsSettings]] = js.native
  //#endregion "Data"
  //#region "Options"
  /**
    * Data to use as the display data for the table. Since: 1.10
    */
  var columns: js.UndefOr[js.Array[ColumnSettings]] = js.native
  //#endregion "Options"
  //#region "Callbacks"
  /**
    * Callback for whenever a TR element is created for the table's body. Since: 1.10
    */
  var createdRow: js.UndefOr[FunctionCreateRow] = js.native
  /**
    * Data to use as the display data for the table. Since: 1.10
    */
  var data: js.UndefOr[js.Array[_]] = js.native
  /**
    * Delay the loading of server-side data until second draw
    */
  var deferLoading: js.UndefOr[Double | js.Array[Double]] = js.native
  /**
    * Feature control deferred rendering for additional speed of initialisation. Since: 1.10
    */
  var deferRender: js.UndefOr[Boolean] = js.native
  /**
    * Destroy any existing table matching the selector and replace with the new options. Since: 1.10
    */
  var destroy: js.UndefOr[Boolean] = js.native
  /**
    * Initial paging start point. Since: 1.10
    */
  var displayStart: js.UndefOr[Double] = js.native
  /**
    * Define the table control elements to appear on the page and in what order. Since: 1.10
    */
  var dom: js.UndefOr[String] = js.native
  /**
    * Function that is called every time DataTables performs a draw. Since: 1.10
    */
  var drawCallback: js.UndefOr[FunctionDrawCallback] = js.native
  /**
    * Footer display callback function. Since: 1.10
    */
  var footerCallback: js.UndefOr[FunctionFooterCallback] = js.native
  /**
    * Number formatting callback function. Since: 1.10
    */
  var formatNumber: js.UndefOr[FunctionFormatNumber] = js.native
  /**
    * Header display callback function. Since: 1.10
    */
  var headerCallback: js.UndefOr[FunctionHeaderCallback] = js.native
  /**
    * Feature control table information display field. Since: 1.10
    */
  var info: js.UndefOr[Boolean] = js.native
  /**
    * Table summary information display callback. Since: 1.10
    */
  var infoCallback: js.UndefOr[FunctionInfoCallback] = js.native
  /**
    * Initialisation complete callback. Since: 1.10
    */
  var initComplete: js.UndefOr[FunctionInitComplete] = js.native
  /**
    * Use markup and classes for the table to be themed by jQuery UI ThemeRoller. Since: 1.10
    */
  var jQueryUI: js.UndefOr[Boolean] = js.native
  //#endregion "Callbacks"
  //#region "Language"
  var language: js.UndefOr[LanguageSettings] = js.native
  /**
    * Feature control the end user's ability to change the paging display length of the table. Since: 1.10
    */
  var lengthChange: js.UndefOr[Boolean] = js.native
  /**
    * Change the options in the page length select list. Since: 1.10
    */
  var lengthMenu: js.UndefOr[js.Array[(js.Array[Double | String]) | Double | String]] = js.native
  /**
    * Initial order (sort) to apply to the table. Since: 1.10
    */
  var order: js.UndefOr[js.Array[(js.Array[Double | String]) | Double | String]] = js.native
  /**
    * Control which cell the order event handler will be applied to in a column. Since: 1.10
    */
  var orderCellsTop: js.UndefOr[Boolean] = js.native
  /**
    * Highlight the columns being ordered in the table's body. Since: 1.10
    */
  var orderClasses: js.UndefOr[Boolean] = js.native
  /**
    * Ordering to always be applied to the table. Since: 1.10
    */
  var orderFixed: js.UndefOr[(js.Array[(js.Array[Double | String]) | Double | String]) | js.Object] = js.native
  /**
    * Multiple column ordering ability control. Since: 1.10
    */
  var orderMulti: js.UndefOr[Boolean] = js.native
  /**
    * Feature control ordering (sorting) abilities in DataTables. Since: 1.10
    */
  var ordering: js.UndefOr[Boolean] = js.native
  /**
    * Change the initial page length (number of rows per page). Since: 1.10
    */
  var pageLength: js.UndefOr[Double] = js.native
  /**
    * Enable or disable table pagination. Since: 1.10
    */
  var paging: js.UndefOr[Boolean] = js.native
  /**
    * Pagination button display options. Basic Types: numbers (1.10.8) simple, simple_numbers, full, full_numbers
    */
  var pagingType: js.UndefOr[String] = js.native
  /**
    * Pre-draw callback. Since: 1.10
    */
  var preDrawCallback: js.UndefOr[FunctionPreDrawCallback] = js.native
  /**
    * Feature control the processing indicator. Since: 1.10
    */
  var processing: js.UndefOr[Boolean] = js.native
  /**
    * Display component renderer types. Since: 1.10
    */
  var renderer: js.UndefOr[String | RendererSettings] = js.native
  /**
    * Enable or disable datatables responsive. Since: 1.10
    */
  var responsive: js.UndefOr[Boolean | js.Object] = js.native
  /**
    * Retrieve an existing DataTables instance. Since: 1.10
    */
  var retrieve: js.UndefOr[Boolean] = js.native
  /**
    * Row draw callback.. Since: 1.10
    */
  var rowCallback: js.UndefOr[FunctionRowCallback] = js.native
  /**
    * Data property name that DataTables will use to set <tr> element DOM IDs. Since: 1.10.8
    */
  var rowId: js.UndefOr[String] = js.native
  /**
    * Allow the table to reduce in height when a limited number of rows are shown. Since: 1.10
    */
  var scrollCollapse: js.UndefOr[Boolean] = js.native
  /**
    * Horizontal scrolling. Since: 1.10
    */
  var scrollX: js.UndefOr[Boolean] = js.native
  /**
    * Vertical scrolling. Since: 1.10 Exp: "200px"
    */
  var scrollY: js.UndefOr[String] = js.native
  /**
    * Set an initial filter in DataTables and / or filtering options. Since: 1.10
    */
  var search: js.UndefOr[SearchSettings | Boolean] = js.native
  /**
    * Define an initial search for individual columns. Since: 1.10
    */
  var searchCols: js.UndefOr[js.Array[SearchSettings]] = js.native
  /**
    * Set a throttle frequency for searching. Since: 1.10
    */
  var searchDelay: js.UndefOr[Double] = js.native
  /**
    * Set placeholder attribute for input type="text" tag elements. Since: 1.10
    */
  var searchPlaceholder: js.UndefOr[SearchSettings] = js.native
  /**
    * Feature control search (filtering) abilities Since: 1.10
    */
  var searching: js.UndefOr[Boolean] = js.native
  /**
    * Feature control DataTables' server-side processing mode. Since: 1.10
    */
  var serverSide: js.UndefOr[Boolean] = js.native
  /**
    * Saved state validity duration. Since: 1.10
    */
  var stateDuration: js.UndefOr[Double] = js.native
  /**
    * Callback that defines where and how a saved state should be loaded. Since: 1.10
    */
  var stateLoadCallback: js.UndefOr[FunctionStateLoadCallback] = js.native
  /**
    * State loaded - data manipulation callback. Since: 1.10
    */
  var stateLoadParams: js.UndefOr[FunctionStateLoadParams] = js.native
  /**
    * State loaded callback. Since: 1.10
    */
  var stateLoaded: js.UndefOr[FunctionStateLoaded] = js.native
  /**
    * State saving - restore table state on page reload. Since: 1.10
    */
  var stateSave: js.UndefOr[Boolean] = js.native
  /**
    * Callback that defines how the table state is stored and where. Since: 1.10
    */
  var stateSaveCallback: js.UndefOr[FunctionStateSaveCallback] = js.native
  /**
    * State save - data manipulation callback. Since: 1.10
    */
  var stateSaveParams: js.UndefOr[FunctionStateSaveParams] = js.native
  /**
    * Set the zebra stripe class names for the rows in the table. Since: 1.10
    */
  var stripeClasses: js.UndefOr[js.Array[String]] = js.native
  /**
    * Tab index control for keyboard navigation. Since: 1.10
    */
  var tabIndex: js.UndefOr[Double] = js.native
}

object Settings {
  @scala.inline
  def apply(): Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Settings]
  }
  @scala.inline
  implicit class SettingsOps[Self <: Settings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAjaxFunction3(
      value: (/* data */ js.Object, /* callback */ js.Function1[/* data */ js.Any, Unit], /* settings */ SettingsLegacy) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajax")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withAjax(value: String | AjaxSettings | FunctionAjax): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAjax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajax")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoWidth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnDefs(value: js.Array[ColumnDefsSettings]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnDefs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnDefs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnDefs")(js.undefined)
        ret
    }
    @scala.inline
    def withColumns(value: js.Array[ColumnSettings]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedRow(value: (/* row */ Node, /* data */ js.Array[js.Any] | js.Object, /* dataIndex */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdRow")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutCreatedRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdRow")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: js.Array[_]): Self = {
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
    def withDeferLoading(value: Double | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deferLoading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeferLoading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deferLoading")(js.undefined)
        ret
    }
    @scala.inline
    def withDeferRender(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deferRender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeferRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deferRender")(js.undefined)
        ret
    }
    @scala.inline
    def withDestroy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestroy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayStart")(js.undefined)
        ret
    }
    @scala.inline
    def withDom(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dom")(js.undefined)
        ret
    }
    @scala.inline
    def withDrawCallback(value: /* settings */ SettingsLegacy => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawCallback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDrawCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withFooterCallback(
      value: (/* tfoot */ Node, /* data */ js.Array[js.Any], /* start */ Double, /* end */ Double, /* display */ js.Array[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerCallback")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutFooterCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatNumber(value: /* formatNumber */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatNumber")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFormatNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderCallback(
      value: (/* thead */ Node, /* data */ js.Array[js.Any], /* start */ Double, /* end */ Double, /* display */ js.Array[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerCallback")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutHeaderCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withInfo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(js.undefined)
        ret
    }
    @scala.inline
    def withInfoCallback(
      value: (/* settings */ SettingsLegacy, /* start */ Double, /* end */ Double, /* mnax */ Double, /* total */ Double, /* pre */ String) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infoCallback")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withoutInfoCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infoCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withInitComplete(value: (/* settings */ SettingsLegacy, /* json */ js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initComplete")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutInitComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withJQueryUI(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jQueryUI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJQueryUI: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jQueryUI")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguage(value: LanguageSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
        ret
    }
    @scala.inline
    def withLengthChange(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lengthChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLengthChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lengthChange")(js.undefined)
        ret
    }
    @scala.inline
    def withLengthMenu(value: js.Array[(js.Array[Double | String]) | Double | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lengthMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLengthMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lengthMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withOrder(value: js.Array[(js.Array[Double | String]) | Double | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(js.undefined)
        ret
    }
    @scala.inline
    def withOrderCellsTop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderCellsTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrderCellsTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderCellsTop")(js.undefined)
        ret
    }
    @scala.inline
    def withOrderClasses(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderClasses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrderClasses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderClasses")(js.undefined)
        ret
    }
    @scala.inline
    def withOrderFixed(value: (js.Array[(js.Array[Double | String]) | Double | String]) | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderFixed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrderFixed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderFixed")(js.undefined)
        ret
    }
    @scala.inline
    def withOrderMulti(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderMulti")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrderMulti: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderMulti")(js.undefined)
        ret
    }
    @scala.inline
    def withOrdering(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ordering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrdering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ordering")(js.undefined)
        ret
    }
    @scala.inline
    def withPageLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageLength")(js.undefined)
        ret
    }
    @scala.inline
    def withPaging(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paging")(js.undefined)
        ret
    }
    @scala.inline
    def withPagingType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagingType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPagingType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagingType")(js.undefined)
        ret
    }
    @scala.inline
    def withPreDrawCallback(value: /* settings */ SettingsLegacy => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preDrawCallback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPreDrawCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preDrawCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processing")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderer(value: String | RendererSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderer")(js.undefined)
        ret
    }
    @scala.inline
    def withResponsive(value: Boolean | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponsive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsive")(js.undefined)
        ret
    }
    @scala.inline
    def withRetrieve(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retrieve")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetrieve: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retrieve")(js.undefined)
        ret
    }
    @scala.inline
    def withRowCallback(value: (/* row */ Node, /* data */ js.Array[js.Any] | js.Object, /* index */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowCallback")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutRowCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withRowId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowId")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollCollapse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollCollapse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollCollapse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollCollapse")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollX(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollX")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollY(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollY")(js.undefined)
        ret
    }
    @scala.inline
    def withSearch(value: SearchSettings | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchCols(value: js.Array[SearchSettings]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchCols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchCols: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchCols")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchPlaceholder(value: SearchSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchPlaceholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchPlaceholder")(js.undefined)
        ret
    }
    @scala.inline
    def withSearching(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searching")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearching: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searching")(js.undefined)
        ret
    }
    @scala.inline
    def withServerSide(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverSide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerSide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverSide")(js.undefined)
        ret
    }
    @scala.inline
    def withStateDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStateDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withStateLoadCallback(value: /* settings */ SettingsLegacy => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateLoadCallback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutStateLoadCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateLoadCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withStateLoadParams(value: (/* settings */ SettingsLegacy, /* data */ js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateLoadParams")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutStateLoadParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateLoadParams")(js.undefined)
        ret
    }
    @scala.inline
    def withStateLoaded(value: (/* settings */ SettingsLegacy, /* data */ js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateLoaded")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutStateLoaded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateLoaded")(js.undefined)
        ret
    }
    @scala.inline
    def withStateSave(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateSave")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStateSave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateSave")(js.undefined)
        ret
    }
    @scala.inline
    def withStateSaveCallback(value: (/* settings */ SettingsLegacy, /* data */ js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateSaveCallback")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutStateSaveCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateSaveCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withStateSaveParams(value: (/* settings */ SettingsLegacy, /* data */ js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateSaveParams")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutStateSaveParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateSaveParams")(js.undefined)
        ret
    }
    @scala.inline
    def withStripeClasses(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripeClasses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStripeClasses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripeClasses")(js.undefined)
        ret
    }
    @scala.inline
    def withTabIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(js.undefined)
        ret
    }
  }
  
}

