package typingsSlinky.reactBootstrapTable.mod

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Props
import typingsSlinky.reactBootstrapTable.AnonFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BootstrapTableProps extends Props[BootstrapTable] {
  /**
  	 * Automatically collapses open rows when doing a sort/filter/search action if those options have been specified.
  	 * Is an object with three possible fields: sort, filter, search. Each field is a flag to specify whether that
  	 * action type should cause expanded rows to close. All three fields default to false.
  	 */
  var autoCollapse: js.UndefOr[AnonFilter] = js.native
  /**
  	 * Add your own class names on the react-bs-container-body class
  	 */
  var bodyContainerClass: js.UndefOr[String] = js.native
  /**
  	 * Add css styles to the react-bs-container-body class.
  	 */
  var bodyStyle: js.UndefOr[CSSProperties] = js.native
  /**
  	 * Become a borderless table by setting bordered to false, default is true.
  	 */
  var bordered: js.UndefOr[Boolean] = js.native
  /**
  	 * Enable cell editing on table. cellEdit accept an object which have the following properties
  	 */
  var cellEdit: js.UndefOr[CellEdit[_]] = js.native
  /**
  	 * Enable column filter by setting columnFilter to true, default is false.
  	 * If enabled, there're input text field per column under the table, user can input your filter condition by each column.
  	 */
  var columnFilter: js.UndefOr[Boolean] = js.native
  /**
  	 * Enable condensed by setting condensed to true. Same as Bootstrap table class .table-condensed, default is false.
  	 */
  var condensed: js.UndefOr[Boolean] = js.native
  /**
  	 * Add your own class names on the react-bs-table-container class
  	 */
  var containerClass: js.UndefOr[String] = js.native
  /**
  	 * Add css styles to the react-bs-table-container class.
  	 * For example: containerStyle={ { background: '#00ff00' } }
  	 */
  var containerStyle: js.UndefOr[CSSProperties] = js.native
  /**
  	 * Set CSV filename (e.g. items.csv). Default is spreadsheet.csv
  	 */
  var csvFileName: js.UndefOr[String | js.Function0[String]] = js.native
  /**
  	 * Use data to specify the data that you want to display on table.
  	 */
  var data: js.Array[js.Object] = js.native
  /**
  	 * Enable row deletion by setting deleteRow to true, default is false.
  	 * If you enable row deletion, there's a button on the upper left side of table.
  	 */
  var deleteRow: js.UndefOr[Boolean] = js.native
  /**
  	 * Disable writing the header row when exporting to a CSV file.
  	 */
  var excludeCSVHeader: js.UndefOr[Boolean] = js.native
  /**
  	 * Assign some alternative options for expand row feature, expandColumnOptions
  	 * only have four available property currently.
  	 */
  var expandColumnOptions: js.UndefOr[ExpandColumnOptions] = js.native
  /**
  	 * Tell react-bootstrap-table what's content should be rendered in the expanding
  	 * content. This props accept a callback function and is suppose to be return JSX
  	 * or String.
  	 * expandComponent is always used with expandableRow, both of props are enable
  	 * the expand row functionality on table.
  	 */
  var expandComponent: js.UndefOr[js.Function1[/* row */ js.Any, String | ReactElement]] = js.native
  /**
  	 * Tell react-bootstrap-table which rows are able to expand. This prop accepts
  	 * a callback function and is suppose to be return an Array of row keys.
  	 * expandableRow is always used with expandComponent, both of props are enable
  	 * the expand row functionality on table.
  	 */
  var expandableRow: js.UndefOr[js.Function1[/* row */ js.Any, Boolean]] = js.native
  /**
  	 * Enable export csv function, default is false.
  	 * If you enable, there's a button on the upper left side of table.
  	 */
  var exportCSV: js.UndefOr[Boolean] = js.native
  /**
  	 * Used to specify the total number of rows (matching current filter/sort/size per page) in a remote data source.
  	 * Documented in examples, but missing from the main docs. Essential for remote data pagination calculations.
  	 */
  var fetchInfo: js.UndefOr[FetchInfo] = js.native
  /**
  	 * Add a footer to the table.
  	 */
  var footer: js.UndefOr[Boolean] = js.native
  /**
  	 * Data for the table footer. Format is an array of footer rows, each containing an array of column footer data.
  	 */
  var footerData: js.UndefOr[js.Array[js.Array[FooterData]]] = js.native
  /**
  	 * Add your own class names on the react-bs-container-header class
  	 */
  var headerContainerClass: js.UndefOr[String] = js.native
  /**
  	 * Add css styles to the react-bs-container-header class.
  	 */
  var headerStyle: js.UndefOr[CSSProperties] = js.native
  /**
  	 * Use height to set the height of table, default is 100%. The string needs to have a unit, e.g. 'px', '%'.
  	 */
  var height: js.UndefOr[String] = js.native
  /**
  	 * Enable hover by setting hover to true. Same as Bootstrap table class .table-hover, default is false.
  	 */
  var hover: js.UndefOr[Boolean] = js.native
  /**
  	 * If true, it will hide the pagination if there is only one page, default is false.
  	 */
  var ignoreSinglePage: js.UndefOr[Boolean] = js.native
  /**
  	 * Enable row insertion by setting insertRow to true, default is false.
  	 * If you enable row insertion, there's a button on the upper left side of table.
  	 */
  var insertRow: js.UndefOr[Boolean] = js.native
  /**
  	 * This prop will enable/disable the keyboard navigation cell by cell on table. This is new
  	 * feature from 3.0.0. Default is false. You can have a basic and simple keyboard navigation
  	 * feature on table by enabling keyBoardNav on BootstrapTable. For the usage of keyboard
  	 * navigation is you can click any cell to focus in or use ⬅ ⬆ ⬇ ➡ to natigate the cell.
  	 *
  	 * But if you want more advance features for keyboard navigation or to integrate with cell
  	 * editing, expand row or selection row, you may get interested to see how they work well
  	 * together: In the advance cases, you need to configure keyBoardNav as an object.
  	 */
  var keyBoardNav: js.UndefOr[Boolean | KeyboardNavigation] = js.native
  /**
  	 * Use keyField to tell table which column is unique. This is same as isKey in <TableHeaderColumn>
  	 * Tips: react-bootstrap-table support data manipulation(CRUD) so that we need to fetch correct row by a unique column.
  	 *       You need choose one of configuration to set the key field: isKey or keyField in <BootstrapTable>.
  	 */
  var keyField: js.UndefOr[String] = js.native
  /**
  	 * Set the maximum height of table. You need give a string with an unit(px) value like height.
  	 */
  var maxHeight: js.UndefOr[String] = js.native
  /**
  	 * Enable multi search by multiColumnSearch, default is false.
  	 * If you want to use multi search, you must enable search at first.
  	 * Tips: Use space to delimited search text. EX: 3 4, which means match all 3 or 4 datas in table.
  	 */
  var multiColumnSearch: js.UndefOr[Boolean] = js.native
  /**
  	 * Enable the multi sort on table and the number value is means max number of sorting column.
  	 */
  var multiColumnSort: js.UndefOr[Double] = js.native
  /**
  	 * For some options setting on this component, you can set the options attribute and give an object which contain following properties
  	 */
  var options: js.UndefOr[Options[_]] = js.native
  /**
  	 * Enable pagination by setting pagination to true, default is false.
  	 */
  var pagination: js.UndefOr[Boolean] = js.native
  /**
  	 * Normally, react-bootstrap-table handles all the data sorting/filtering/pagination/etc itself internally.
  	 * If this is true, you need to handle all of those manually outside the table. By default it is false.
  	 * This is used mostly with an external/central data store, for example Redux or a database that returns
  	 * already filtered/sorted/paged data.
  	 *
  	 * If a function given, which means you can choose which functionality should be handled with remote or not.Currently,
  	 * we have following functionality you can control: sort, pagination, cellEdit, insertRow, dropRow, filter, search,
  	 * exportCSV.
  	 */
  var remote: js.UndefOr[Boolean | (js.Function1[/* remobeObj */ RemoteObjSpec, RemoteObjSpec])] = js.native
  /**
  	 * Render react-s-alert notifications
  	 */
  var renderAlert: js.UndefOr[Boolean] = js.native
  /**
  	 * Specify a fix position for the vertical bar if it exist. Available is a number or Top and Bottom
  	 */
  var scrollTop: js.UndefOr[Double | ScrollPosition] = js.native
  /**
  	 * Enable search by setting search to true, default is false.
  	 * If enabled, there is a on the upper left side of the table. The default place holder is Search
  	 */
  var search: js.UndefOr[Boolean] = js.native
  /**
  	 * Set searchPlaceholder to change the placeholder in search field, default is Search.
  	 */
  var searchPlaceholder: js.UndefOr[String] = js.native
  /**
  	 * Enable row selection on table. SelectRow accept an object.
  	 */
  var selectRow: js.UndefOr[SelectRow[_]] = js.native
  /**
  	 * Strict search. Set this flag to apply search terms so that only rows that contain ALL terms are included in the
  	 * search results.
  	 */
  var strictSearch: js.UndefOr[Boolean] = js.native
  /**
  	 * Enable striped by setting striped to true. Same as Bootstrap table class .table-striped, default is false.
  	 */
  var striped: js.UndefOr[Boolean] = js.native
  /**
  	 * react-bootstrap-table separate two table element as header and body.
  	 * The tableBodyClass is for the table element in the body
  	 */
  var tableBodyClass: js.UndefOr[String] = js.native
  /**
  	 * Add your own class names on the react-bs-table class
  	 */
  var tableContainerClass: js.UndefOr[String] = js.native
  /**
  	 * Table footer custom class
  	 */
  var tableFooterClass: js.UndefOr[String] = js.native
  /**
  	 * react-bootstrap-table separate two table element as header and body.
  	 * The tableHeaderClass is for the table element in the header
  	 */
  var tableHeaderClass: js.UndefOr[String] = js.native
  /**
  	 * Add css styles to the react-bs-table class.
  	 */
  var tableStyle: js.UndefOr[CSSProperties] = js.native
  /**
  	 * Assign the class name of row(tr). This attribute accept a string or function and function is a better way to do more customization.
  	 * If a string given, means the value will be presented as the row class.
  	 * If a function given, will pass rowData and rowIndex as params and should return string for presenting class. for examples:
  	 * @example
  	 *    function trClassFormat(rowData,rowIndex) {
  	 *      return rowIndex % 2 == 0 ? "tr-odd" : "tr-even"; // return a class name.
  	 *    }
  	 */
  var trClassName: js.UndefOr[String | (js.Function2[/* rowData */ js.Any, /* rowIndex */ Double, String])] = js.native
  /**
  	 * Set a style to be used for the table rows. Example: https://github.com/AllenFang/react-bootstrap-table/blob/master/examples/js/style/tr-style-table.js
  	 */
  var trStyle: js.UndefOr[
    CSSProperties | (js.Function2[/* rowData */ js.Any, /* rowIndex */ Double, CSSProperties])
  ] = js.native
  /**
  	 * Bootstrap version to use, values include '3' or '4'. Defaults to '3'.
  	 */
  var version: js.UndefOr[BootstrapVersion] = js.native
  /**
  	 * Disable the automatic tabIndex for navigating between cells. This can be useful if you have a page with multiple
  	 * tables on the page, to stop the tab moving to another table. Default is false.
  	 */
  var withoutTabIndex: js.UndefOr[Boolean] = js.native
}

object BootstrapTableProps {
  @scala.inline
  def apply(data: js.Array[js.Object]): BootstrapTableProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapTableProps]
  }
  @scala.inline
  implicit class BootstrapTablePropsOps[Self <: BootstrapTableProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: js.Array[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoCollapse(value: AnonFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCollapse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoCollapse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCollapse")(js.undefined)
        ret
    }
    @scala.inline
    def withBodyContainerClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyContainerClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBodyContainerClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyContainerClass")(js.undefined)
        ret
    }
    @scala.inline
    def withBodyStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBodyStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withBordered(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bordered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBordered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bordered")(js.undefined)
        ret
    }
    @scala.inline
    def withCellEdit(value: CellEdit[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellEdit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellEdit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellEdit")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnFilter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withCondensed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("condensed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCondensed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("condensed")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerClass")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withCsvFileNameFunction0(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csvFileName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCsvFileName(value: String | js.Function0[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csvFileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCsvFileName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csvFileName")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleteRow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteRow")(js.undefined)
        ret
    }
    @scala.inline
    def withExcludeCSVHeader(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeCSVHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludeCSVHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeCSVHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandColumnOptions(value: ExpandColumnOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandColumnOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandColumnOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandColumnOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandComponent(value: /* row */ js.Any => String | ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandComponent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutExpandComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandableRow(value: /* row */ js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandableRow")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutExpandableRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandableRow")(js.undefined)
        ret
    }
    @scala.inline
    def withExportCSV(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportCSV")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExportCSV: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportCSV")(js.undefined)
        ret
    }
    @scala.inline
    def withFetchInfo(value: FetchInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFetchInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withFooter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFooter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footer")(js.undefined)
        ret
    }
    @scala.inline
    def withFooterData(value: js.Array[js.Array[FooterData]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFooterData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerData")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderContainerClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerContainerClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderContainerClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerContainerClass")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: String): Self = {
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
    def withHover(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hover")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreSinglePage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreSinglePage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreSinglePage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreSinglePage")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertRow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsertRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertRow")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyBoardNav(value: Boolean | KeyboardNavigation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyBoardNav")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyBoardNav: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyBoardNav")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyField")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxHeight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiColumnSearch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiColumnSearch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiColumnSearch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiColumnSearch")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiColumnSort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiColumnSort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiColumnSort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiColumnSort")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: Options[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withPagination(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPagination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagination")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoteFunction1(value: /* remobeObj */ RemoteObjSpec => RemoteObjSpec): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remote")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemote(value: Boolean | (js.Function1[/* remobeObj */ RemoteObjSpec, RemoteObjSpec])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remote")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemote: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remote")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderAlert(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderAlert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderAlert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderAlert")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollTop(value: Double | ScrollPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollTop")(js.undefined)
        ret
    }
    @scala.inline
    def withSearch(value: Boolean): Self = {
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
    def withSearchPlaceholder(value: String): Self = {
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
    def withSelectRow(value: SelectRow[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectRow")(js.undefined)
        ret
    }
    @scala.inline
    def withStrictSearch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictSearch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrictSearch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictSearch")(js.undefined)
        ret
    }
    @scala.inline
    def withStriped(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("striped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStriped: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("striped")(js.undefined)
        ret
    }
    @scala.inline
    def withTableBodyClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableBodyClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableBodyClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableBodyClass")(js.undefined)
        ret
    }
    @scala.inline
    def withTableContainerClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableContainerClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableContainerClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableContainerClass")(js.undefined)
        ret
    }
    @scala.inline
    def withTableFooterClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableFooterClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableFooterClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableFooterClass")(js.undefined)
        ret
    }
    @scala.inline
    def withTableHeaderClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableHeaderClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableHeaderClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableHeaderClass")(js.undefined)
        ret
    }
    @scala.inline
    def withTableStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withTrClassNameFunction2(value: (/* rowData */ js.Any, /* rowIndex */ Double) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trClassName")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withTrClassName(value: String | (js.Function2[/* rowData */ js.Any, /* rowIndex */ Double, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withTrStyleFunction2(value: (/* rowData */ js.Any, /* rowIndex */ Double) => CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trStyle")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withTrStyle(value: CSSProperties | (js.Function2[/* rowData */ js.Any, /* rowIndex */ Double, CSSProperties])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: BootstrapVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
    @scala.inline
    def withWithoutTabIndex(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withoutTabIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWithoutTabIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withoutTabIndex")(js.undefined)
        ret
    }
  }
  
}

