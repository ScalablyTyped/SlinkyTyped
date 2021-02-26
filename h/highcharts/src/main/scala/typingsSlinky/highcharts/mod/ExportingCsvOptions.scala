package typingsSlinky.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportingCsvOptions extends StObject {
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Options for annotations in the
    * export-data table.
    */
  var annotations: js.UndefOr[ExportingCsvAnnotationsOptions] = js.native
  
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
  implicit class ExportingCsvOptionsMutableBuilder[Self <: ExportingCsvOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnnotations(value: ExportingCsvAnnotationsOptions): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
    
    @scala.inline
    def setColumnHeaderFormatter(value: js.Function): Self = StObject.set(x, "columnHeaderFormatter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnHeaderFormatterNull: Self = StObject.set(x, "columnHeaderFormatter", null)
    
    @scala.inline
    def setColumnHeaderFormatterUndefined: Self = StObject.set(x, "columnHeaderFormatter", js.undefined)
    
    @scala.inline
    def setDateFormat(value: String): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateFormatUndefined: Self = StObject.set(x, "dateFormat", js.undefined)
    
    @scala.inline
    def setDecimalPoint(value: String): Self = StObject.set(x, "decimalPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecimalPointNull: Self = StObject.set(x, "decimalPoint", null)
    
    @scala.inline
    def setDecimalPointUndefined: Self = StObject.set(x, "decimalPoint", js.undefined)
    
    @scala.inline
    def setItemDelimiter(value: String): Self = StObject.set(x, "itemDelimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemDelimiterNull: Self = StObject.set(x, "itemDelimiter", null)
    
    @scala.inline
    def setItemDelimiterUndefined: Self = StObject.set(x, "itemDelimiter", js.undefined)
    
    @scala.inline
    def setLineDelimiter(value: String): Self = StObject.set(x, "lineDelimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineDelimiterUndefined: Self = StObject.set(x, "lineDelimiter", js.undefined)
  }
}
