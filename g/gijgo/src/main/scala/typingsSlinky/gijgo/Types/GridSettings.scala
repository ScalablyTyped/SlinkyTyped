package typingsSlinky.gijgo.Types

import typingsSlinky.gijgo.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridSettings[Entity] extends js.Object {
  //Configuration options
  var autoGenerateColumns: js.UndefOr[Boolean] = js.native
  var autoLoad: js.UndefOr[Boolean] = js.native
  //Events
  var beforeEmptyRowInsert: js.UndefOr[js.Function2[/* e */ js.Any, /* $row */ JQuery, _]] = js.native
  var bodyRowHeight: js.UndefOr[String] = js.native
  var cellDataBound: js.UndefOr[
    js.Function5[
      /* e */ js.Any, 
      /* $wrapper */ JQuery, 
      /* id */ String, 
      /* column */ GridColumn, 
      /* record */ Entity, 
      _
    ]
  ] = js.native
  var cellDataChanged: js.UndefOr[
    js.Function6[
      /* e */ js.Any, 
      /* $cell */ JQuery, 
      /* column */ GridColumn, 
      /* record */ Entity, 
      /* oldValue */ js.Any, 
      /* newValue */ js.Any, 
      _
    ]
  ] = js.native
  var columnHide: js.UndefOr[js.Function2[/* e */ js.Any, /* column */ GridColumn, _]] = js.native
  var columnReorder: js.UndefOr[Boolean] = js.native
  var columnShow: js.UndefOr[js.Function2[/* e */ js.Any, /* column */ GridColumn, _]] = js.native
  var columns: js.UndefOr[js.Array[GridColumn]] = js.native
  var dataBinding: js.UndefOr[js.Function2[/* e */ js.Any, /* records */ js.Array[Entity], _]] = js.native
  var dataBound: js.UndefOr[
    js.Function3[/* e */ js.Any, /* records */ js.Array[Entity], /* totalRecords */ Double, _]
  ] = js.native
  var dataFiltered: js.UndefOr[js.Function2[/* e */ js.Any, /* records */ js.Array[Entity], _]] = js.native
  var dataSource: js.UndefOr[js.Any] = js.native
  var defaultColumnSettings: js.UndefOr[GridColumn] = js.native
  var destroying: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.native
  var detailCollapse: js.UndefOr[js.Function3[/* e */ js.Any, /* detailWrapper */ JQuery, /* id */ String, _]] = js.native
  var detailExpand: js.UndefOr[js.Function3[/* e */ js.Any, /* detailWrapper */ JQuery, /* id */ String, _]] = js.native
  var detailTemplate: js.UndefOr[String] = js.native
  var fixedHeader: js.UndefOr[Boolean] = js.native
  var fontSize: js.UndefOr[String] = js.native
  var grouping: js.UndefOr[GridGrouping] = js.native
  var headerFilter: js.UndefOr[GridHeaderFilter] = js.native
  var headerRowHeight: js.UndefOr[String] = js.native
  var icons: js.UndefOr[GridIcons] = js.native
  var iconsLibrary: js.UndefOr[String] = js.native
  var initialized: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.native
  var inlineEditing: js.UndefOr[GridInlineEditing] = js.native
  var keepExpandedRows: js.UndefOr[Boolean] = js.native
  var locale: js.UndefOr[String] = js.native
  var mapping: js.UndefOr[js.Any] = js.native
  var minWidth: js.UndefOr[Double] = js.native
  var notFoundText: js.UndefOr[String] = js.native
  var optimisticPersistence: js.UndefOr[GridOptimisticPersistence] = js.native
  var orderNumberField: js.UndefOr[String] = js.native
  var pageChanging: js.UndefOr[js.Function2[/* e */ js.Any, /* newPage */ Double, _]] = js.native
  var pageSizeChange: js.UndefOr[js.Function2[/* e */ js.Any, /* newPage */ Double, _]] = js.native
  var pager: js.UndefOr[GridPager] = js.native
  var paramNames: js.UndefOr[GridParamNames] = js.native
  var params: js.UndefOr[js.Any] = js.native
  var primaryKey: js.UndefOr[String] = js.native
  var resizableColumns: js.UndefOr[Boolean] = js.native
  var resize: js.UndefOr[js.Function3[/* e */ js.Any, /* newWidth */ Double, /* oldWidth */ Double, _]] = js.native
  var resizeCheckInterval: js.UndefOr[Double] = js.native
  var responsive: js.UndefOr[Boolean] = js.native
  var rowDataBound: js.UndefOr[
    js.Function4[/* e */ js.Any, /* $row */ JQuery, /* id */ String, /* record */ Entity, _]
  ] = js.native
  var rowDataChanged: js.UndefOr[js.Function3[/* e */ js.Any, /* id */ String, /* record */ Entity, _]] = js.native
  var rowRemoving: js.UndefOr[
    js.Function4[/* e */ js.Any, /* $row */ JQuery, /* id */ String, /* record */ Entity, _]
  ] = js.native
  var rowReorder: js.UndefOr[Boolean] = js.native
  var rowReorderColumn: js.UndefOr[String] = js.native
  var rowSelect: js.UndefOr[
    js.Function4[/* e */ js.Any, /* $row */ JQuery, /* id */ String, /* record */ Entity, _]
  ] = js.native
  var rowUnselect: js.UndefOr[
    js.Function4[/* e */ js.Any, /* $row */ JQuery, /* id */ String, /* record */ Entity, _]
  ] = js.native
  var selectionMethod: js.UndefOr[String] = js.native
  var selectionType: js.UndefOr[String] = js.native
  var showHiddenColumnsAsDetails: js.UndefOr[Boolean] = js.native
  var title: js.UndefOr[String] = js.native
  var toolbarTemplate: js.UndefOr[String] = js.native
  var uiLibrary: js.UndefOr[String] = js.native
  var width: js.UndefOr[Double] = js.native
}

object GridSettings {
  @scala.inline
  def apply[Entity](): GridSettings[Entity] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridSettings[Entity]]
  }
  @scala.inline
  implicit class GridSettingsOps[Self[entity] <: GridSettings[entity], Entity] (val x: Self[Entity]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Entity] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Entity]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Entity] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Entity] with Other]
    @scala.inline
    def withAutoGenerateColumns(value: Boolean): Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoGenerateColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoGenerateColumns: Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoGenerateColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoLoad(value: Boolean): Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoLoad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoLoad: Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeEmptyRowInsert(value: (/* e */ js.Any, /* $row */ JQuery) => _): Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeEmptyRowInsert")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBeforeEmptyRowInsert: Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeEmptyRowInsert")(js.undefined)
        ret
    }
    @scala.inline
    def withBodyRowHeight(value: String): Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyRowHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBodyRowHeight: Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyRowHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withCellDataBound(
      value: (/* e */ js.Any, /* $wrapper */ JQuery, /* id */ String, /* column */ GridColumn, /* record */ Entity) => _
    ): Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellDataBound")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutCellDataBound: Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellDataBound")(js.undefined)
        ret
    }
    @scala.inline
    def withCellDataChanged(
      value: (/* e */ js.Any, /* $cell */ JQuery, /* column */ GridColumn, /* record */ Entity, /* oldValue */ js.Any, /* newValue */ js.Any) => _
    ): Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellDataChanged")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withoutCellDataChanged: Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellDataChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnHide(value: (/* e */ js.Any, /* column */ GridColumn) => _): Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnHide")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutColumnHide: Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnHide")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnReorder(value: Boolean): Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnReorder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnReorder: Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnReorder")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnShow(value: (/* e */ js.Any, /* column */ GridColumn) => _): Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnShow")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutColumnShow: Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnShow")(js.undefined)
        ret
    }
    @scala.inline
    def withColumns(value: js.Array[GridColumn]): Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumns: Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(js.undefined)
        ret
    }
    @scala.inline
    def withDataBinding(value: (/* e */ js.Any, /* records */ js.Array[Entity]) => _): Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataBinding")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDataBinding: Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataBinding")(js.undefined)
        ret
    }
    @scala.inline
    def withDataBound(value: (/* e */ js.Any, /* records */ js.Array[Entity], /* totalRecords */ Double) => _): Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataBound")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutDataBound: Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataBound")(js.undefined)
        ret
    }
    @scala.inline
    def withDataFiltered(value: (/* e */ js.Any, /* records */ js.Array[Entity]) => _): Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataFiltered")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDataFiltered: Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataFiltered")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSource(value: js.Any): Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSource: Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultColumnSettings(value: GridColumn): Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultColumnSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultColumnSettings: Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultColumnSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withDestroying(value: /* e */ js.Any => _): Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroying")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDestroying: Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroying")(js.undefined)
        ret
    }
    @scala.inline
    def withDetailCollapse(value: (/* e */ js.Any, /* detailWrapper */ JQuery, /* id */ String) => _): Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detailCollapse")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutDetailCollapse: Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detailCollapse")(js.undefined)
        ret
    }
    @scala.inline
    def withDetailExpand(value: (/* e */ js.Any, /* detailWrapper */ JQuery, /* id */ String) => _): Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detailExpand")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutDetailExpand: Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detailExpand")(js.undefined)
        ret
    }
    @scala.inline
    def withDetailTemplate(value: String): Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detailTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetailTemplate: Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detailTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withFixedHeader(value: Boolean): Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixedHeader: Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withFontSize(value: String): Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontSize: Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(js.undefined)
        ret
    }
    @scala.inline
    def withGrouping(value: GridGrouping): Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grouping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrouping: Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grouping")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderFilter(value: GridHeaderFilter): Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderFilter: Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderRowHeight(value: String): Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerRowHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderRowHeight: Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerRowHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withIcons(value: GridIcons): Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcons: Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icons")(js.undefined)
        ret
    }
    @scala.inline
    def withIconsLibrary(value: String): Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconsLibrary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconsLibrary: Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconsLibrary")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialized(value: /* e */ js.Any => _): Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialized")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutInitialized: Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialized")(js.undefined)
        ret
    }
    @scala.inline
    def withInlineEditing(value: GridInlineEditing): Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineEditing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInlineEditing: Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineEditing")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepExpandedRows(value: Boolean): Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepExpandedRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepExpandedRows: Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepExpandedRows")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: String): Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withMapping(value: js.Any): Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMapping: Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapping")(js.undefined)
        ret
    }
    @scala.inline
    def withMinWidth(value: Double): Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinWidth: Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withNotFoundText(value: String): Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notFoundText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotFoundText: Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notFoundText")(js.undefined)
        ret
    }
    @scala.inline
    def withOptimisticPersistence(value: GridOptimisticPersistence): Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimisticPersistence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptimisticPersistence: Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimisticPersistence")(js.undefined)
        ret
    }
    @scala.inline
    def withOrderNumberField(value: String): Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderNumberField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrderNumberField: Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderNumberField")(js.undefined)
        ret
    }
    @scala.inline
    def withPageChanging(value: (/* e */ js.Any, /* newPage */ Double) => _): Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageChanging")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPageChanging: Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageChanging")(js.undefined)
        ret
    }
    @scala.inline
    def withPageSizeChange(value: (/* e */ js.Any, /* newPage */ Double) => _): Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSizeChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPageSizeChange: Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSizeChange")(js.undefined)
        ret
    }
    @scala.inline
    def withPager(value: GridPager): Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPager: Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pager")(js.undefined)
        ret
    }
    @scala.inline
    def withParamNames(value: GridParamNames): Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paramNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParamNames: Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paramNames")(js.undefined)
        ret
    }
    @scala.inline
    def withParams(value: js.Any): Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParams: Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimaryKey(value: String): Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimaryKey: Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryKey")(js.undefined)
        ret
    }
    @scala.inline
    def withResizableColumns(value: Boolean): Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizableColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizableColumns: Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizableColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withResize(value: (/* e */ js.Any, /* newWidth */ Double, /* oldWidth */ Double) => _): Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutResize: Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize")(js.undefined)
        ret
    }
    @scala.inline
    def withResizeCheckInterval(value: Double): Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeCheckInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizeCheckInterval: Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeCheckInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withResponsive(value: Boolean): Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponsive: Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsive")(js.undefined)
        ret
    }
    @scala.inline
    def withRowDataBound(value: (/* e */ js.Any, /* $row */ JQuery, /* id */ String, /* record */ Entity) => _): Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowDataBound")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutRowDataBound: Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowDataBound")(js.undefined)
        ret
    }
    @scala.inline
    def withRowDataChanged(value: (/* e */ js.Any, /* id */ String, /* record */ Entity) => _): Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowDataChanged")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutRowDataChanged: Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowDataChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withRowRemoving(value: (/* e */ js.Any, /* $row */ JQuery, /* id */ String, /* record */ Entity) => _): Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowRemoving")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutRowRemoving: Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowRemoving")(js.undefined)
        ret
    }
    @scala.inline
    def withRowReorder(value: Boolean): Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowReorder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowReorder: Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowReorder")(js.undefined)
        ret
    }
    @scala.inline
    def withRowReorderColumn(value: String): Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowReorderColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowReorderColumn: Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowReorderColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withRowSelect(value: (/* e */ js.Any, /* $row */ JQuery, /* id */ String, /* record */ Entity) => _): Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowSelect")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutRowSelect: Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withRowUnselect(value: (/* e */ js.Any, /* $row */ JQuery, /* id */ String, /* record */ Entity) => _): Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowUnselect")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutRowUnselect: Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowUnselect")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionMethod(value: String): Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionMethod: Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionType(value: String): Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionType: Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionType")(js.undefined)
        ret
    }
    @scala.inline
    def withShowHiddenColumnsAsDetails(value: Boolean): Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHiddenColumnsAsDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowHiddenColumnsAsDetails: Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHiddenColumnsAsDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withToolbarTemplate(value: String): Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolbarTemplate: Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withUiLibrary(value: String): Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uiLibrary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUiLibrary: Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uiLibrary")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self[Entity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

