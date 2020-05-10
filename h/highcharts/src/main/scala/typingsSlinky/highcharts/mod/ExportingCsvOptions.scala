package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportingCsvOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Formatter callback for the
    * column headers. Parameters are:
    *
    * - `item` - The series or axis object)
    *
    * - `key` - The point key, for example y or z
    *
    * - `keyLength` - The amount of value keys for this item, for example a
    * range series has the keys `low` and `high` so the key length is 2.
    *
    * If useMultiLevelHeaders is true, columnHeaderFormatter by default returns
    * an object with columnTitle and topLevelColumnTitle for each key. Columns
    * with the same topLevelColumnTitle have their titles merged into a single
    * cell with colspan for table/Excel export.
    *
    * If `useMultiLevelHeaders` is false, or for CSV export, it returns the
    * series name, followed by the key if there is more than one key.
    *
    * For the axis it returns the axis title or "Category" or "DateTime" by
    * default.
    *
    * Return `false` to use Highcharts' proposed header.
    */
  var columnHeaderFormatter: js.UndefOr[js.Function | Null] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Which date format to use for
    * exported dates on a datetime X axis. See `Highcharts.dateFormat`.
    */
  var dateFormat: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Which decimal point to use for
    * exported CSV. Defaults to the same as the browser locale, typically `.`
    * (English) or `,` (German, French etc).
    */
  var decimalPoint: js.UndefOr[String | Null] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The item delimiter in the
    * exported data. Use `;` for direct exporting to Excel. Defaults to a best
    * guess based on the browser locale. If the locale _decimal point_ is `,`,
    * the `itemDelimiter` defaults to `;`, otherwise the `itemDelimiter`
    * defaults to `,`.
    */
  var itemDelimiter: js.UndefOr[String | Null] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The line delimiter in the
    * exported data, defaults to a newline.
    */
  var lineDelimiter: js.UndefOr[String] = js.native
}

object ExportingCsvOptions {
  @scala.inline
  def apply(): ExportingCsvOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportingCsvOptions]
  }
  @scala.inline
  implicit class ExportingCsvOptionsOps[Self <: ExportingCsvOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnHeaderFormatter(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnHeaderFormatter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnHeaderFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnHeaderFormatter")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnHeaderFormatterNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnHeaderFormatter")(null)
        ret
    }
    @scala.inline
    def withDateFormat(value: String): Self = {
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
    def withDecimalPointNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimalPoint")(null)
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
    def withItemDelimiterNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemDelimiter")(null)
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
  }
  
}

