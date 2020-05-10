package typingsSlinky.highcharts.mod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A callback function to modify
    * the CSV before parsing it. Return the modified string.
    */
  var beforeParse: js.UndefOr[DataBeforeParseCallbackFunction] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A two-dimensional array
    * representing the input data on tabular form. This input can be used when
    * the data is already parsed, for example from a grid view component. Each
    * cell can be a string or number. If not switchRowsAndColumns is set, the
    * columns are interpreted as series.
    */
  var columns: js.UndefOr[js.Array[js.Array[DataValueType]]] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A URL to a remote JSON dataset,
    * structured as a column array. Will be fetched when the chart is created
    * using Ajax.
    */
  var columnsURL: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The callback that is evaluated
    * when the data is finished loading, optionally from an external source,
    * and parsed. The first argument passed is a finished chart options object,
    * containing the series. These options can be extended with additional
    * options and passed directly to the chart constructor.
    */
  var complete: js.UndefOr[DataCompleteCallbackFunction] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A comma delimited string to be
    * parsed. Related options are startRow, endRow, startColumn and endColumn
    * to delimit what part of the table is used. The lineDelimiter and
    * itemDelimiter options define the CSV delimiter formats.
    *
    * The built-in CSV parser doesn't support all flavours of CSV, so in some
    * cases it may be necessary to use an external CSV parser. See this example
    * of parsing CSV through the MIT licensed Papa Parse library.
    */
  var csv: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) An URL to a remote CSV dataset.
    * Will be fetched when the chart is created using Ajax.
    */
  var csvURL: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Sets the refresh rate for data
    * polling when importing remote dataset by setting data.csvURL,
    * data.rowsURL, data.columnsURL, or data.googleSpreadsheetKey.
    *
    * Note that polling must be enabled by setting data.enablePolling to true.
    *
    * The value is the number of seconds between pollings. It cannot be set to
    * less than 1 second.
    */
  var dataRefreshRate: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Which of the predefined date
    * formats in Date.prototype.dateFormats to use to parse date values.
    * Defaults to a best guess based on what format gives valid and ordered
    * dates. Valid options include: `YYYY/mm/dd`, `dd/mm/YYYY`, `mm/dd/YYYY`,
    * `dd/mm/YY`, `mm/dd/YY`.
    */
  var dateFormat: js.UndefOr[OptionsDateFormatValue] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The decimal point used for
    * parsing numbers in the CSV.
    *
    * If both this and data.delimiter is set to `undefined`, the parser will
    * attempt to deduce the decimal point automatically.
    */
  var decimalPoint: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Enables automatic refetching of
    * remote datasets every _n_ seconds (defined by setting
    * data.dataRefreshRate).
    *
    * Only works when either data.csvURL, data.rowsURL, data.columnsURL, or
    * data.googleSpreadsheetKey.
    */
  var enablePolling: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) In tabular input data, the last
    * column (indexed by 0) to use. Defaults to the last column containing
    * data.
    */
  var endColumn: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) In tabular input data, the last
    * row (indexed by 0) to use. Defaults to the last row containing data.
    */
  var endRow: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Gantt) Whether to use the first row in the data
    * set as series names.
    */
  var firstRowAsNames: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The key for a Google Spreadsheet
    * to load. See general information on GS.
    */
  var googleSpreadsheetKey: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The Google Spreadsheet worksheet
    * to use in combination with googleSpreadsheetKey. The available id's from
    * your sheet can be read from
    * `https://spreadsheets.google.com/feeds/worksheets/{key}/public/basic`.
    */
  var googleSpreadsheetWorksheet: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Item or cell delimiter for
    * parsing CSV. Defaults to the tab character `\t` if a tab character is
    * found in the CSV string, if not it defaults to `,`.
    *
    * If this is set to false or undefined, the parser will attempt to deduce
    * the delimiter automatically.
    */
  var itemDelimiter: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Line delimiter for parsing CSV.
    */
  var lineDelimiter: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A callback function to parse
    * string representations of dates into JavaScript timestamps. Should return
    * an integer timestamp on success.
    */
  var parseDate: js.UndefOr[DataParseDateCallbackFunction] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A callback function to access
    * the parsed columns, the two-dimentional input data array directly, before
    * they are interpreted into series data and categories. Return `false` to
    * stop completion, or call `this.complete()` to continue async.
    */
  var parsed: js.UndefOr[DataParsedCallbackFunction] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The same as the columns input
    * option, but defining rows intead of columns.
    */
  var rows: js.UndefOr[js.Array[js.Array[DataValueType]]] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A URL to a remote JSON dataset,
    * structured as a row array. Will be fetched when the chart is created
    * using Ajax.
    */
  var rowsURL: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) An array containing dictionaries
    * for each series. A dictionary exists of Point property names as the key
    * and the CSV column index as the value.
    */
  var seriesMapping: js.UndefOr[js.Array[Dictionary[Double]]] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) In tabular input data, the first
    * column (indexed by 0) to use.
    */
  var startColumn: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) In tabular input data, the first
    * row (indexed by 0) to use.
    */
  var startRow: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Switch rows and columns of the
    * input data, so that `this.columns` effectively becomes the rows of the
    * data set, and the rows are interpreted as series.
    */
  var switchRowsAndColumns: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) An HTML table or the id of such
    * to be parsed as input data. Related options are `startRow`, `endRow`,
    * `startColumn` and `endColumn` to delimit what part of the table is used.
    */
  var table: js.UndefOr[String | HTMLElement] = js.native
}

object DataOptions {
  @scala.inline
  def apply(): DataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataOptions]
  }
  @scala.inline
  implicit class DataOptionsOps[Self <: DataOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBeforeParse(value: /* csv */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeParse")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeParse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeParse")(js.undefined)
        ret
    }
    @scala.inline
    def withColumns(value: js.Array[js.Array[DataValueType]]): Self = {
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
    def withColumnsURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnsURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnsURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnsURL")(js.undefined)
        ret
    }
    @scala.inline
    def withComplete(value: /* chartOptions */ Options => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.undefined)
        ret
    }
    @scala.inline
    def withCsv(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csv")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCsv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csv")(js.undefined)
        ret
    }
    @scala.inline
    def withCsvURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csvURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCsvURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csvURL")(js.undefined)
        ret
    }
    @scala.inline
    def withDataRefreshRate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataRefreshRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataRefreshRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataRefreshRate")(js.undefined)
        ret
    }
    @scala.inline
    def withDateFormat(value: OptionsDateFormatValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withDecimalPoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimalPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecimalPoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimalPoint")(js.undefined)
        ret
    }
    @scala.inline
    def withEnablePolling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePolling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnablePolling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePolling")(js.undefined)
        ret
    }
    @scala.inline
    def withEndColumn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withEndRow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endRow")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstRowAsNames(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstRowAsNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstRowAsNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstRowAsNames")(js.undefined)
        ret
    }
    @scala.inline
    def withGoogleSpreadsheetKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googleSpreadsheetKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGoogleSpreadsheetKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googleSpreadsheetKey")(js.undefined)
        ret
    }
    @scala.inline
    def withGoogleSpreadsheetWorksheet(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googleSpreadsheetWorksheet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGoogleSpreadsheetWorksheet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googleSpreadsheetWorksheet")(js.undefined)
        ret
    }
    @scala.inline
    def withItemDelimiter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemDelimiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemDelimiter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemDelimiter")(js.undefined)
        ret
    }
    @scala.inline
    def withLineDelimiter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineDelimiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineDelimiter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineDelimiter")(js.undefined)
        ret
    }
    @scala.inline
    def withParseDate(value: /* dateValue */ String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseDate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutParseDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseDate")(js.undefined)
        ret
    }
    @scala.inline
    def withParsed(value: /* columns */ js.Array[js.Array[js.Any]] => js.UndefOr[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parsed")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutParsed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parsed")(js.undefined)
        ret
    }
    @scala.inline
    def withRows(value: js.Array[js.Array[DataValueType]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(js.undefined)
        ret
    }
    @scala.inline
    def withRowsURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowsURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowsURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowsURL")(js.undefined)
        ret
    }
    @scala.inline
    def withSeriesMapping(value: js.Array[Dictionary[Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesMapping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeriesMapping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesMapping")(js.undefined)
        ret
    }
    @scala.inline
    def withStartColumn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withStartRow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startRow")(js.undefined)
        ret
    }
    @scala.inline
    def withSwitchRowsAndColumns(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("switchRowsAndColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwitchRowsAndColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("switchRowsAndColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withTableHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("table")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTable(value: String | HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("table")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("table")(js.undefined)
        ret
    }
  }
  
}

