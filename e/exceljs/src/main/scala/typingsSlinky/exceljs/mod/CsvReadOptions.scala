package typingsSlinky.exceljs.mod

import typingsSlinky.exceljs.anon.PartialFastCsvParserOptio
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CsvReadOptions extends StObject {
  
  var dateFormats: js.Array[String] = js.native
  
  def map(value: js.Any, index: Double): js.Any = js.native
  
  var parserOptions: PartialFastCsvParserOptio = js.native
  
  var sheetName: String = js.native
}
object CsvReadOptions {
  
  @scala.inline
  def apply(
    dateFormats: js.Array[String],
    map: (js.Any, Double) => js.Any,
    parserOptions: PartialFastCsvParserOptio,
    sheetName: String
  ): CsvReadOptions = {
    val __obj = js.Dynamic.literal(dateFormats = dateFormats.asInstanceOf[js.Any], map = js.Any.fromFunction2(map), parserOptions = parserOptions.asInstanceOf[js.Any], sheetName = sheetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CsvReadOptions]
  }
  
  @scala.inline
  implicit class CsvReadOptionsMutableBuilder[Self <: CsvReadOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDateFormats(value: js.Array[String]): Self = StObject.set(x, "dateFormats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateFormatsVarargs(value: String*): Self = StObject.set(x, "dateFormats", js.Array(value :_*))
    
    @scala.inline
    def setMap(value: (js.Any, Double) => js.Any): Self = StObject.set(x, "map", js.Any.fromFunction2(value))
    
    @scala.inline
    def setParserOptions(value: PartialFastCsvParserOptio): Self = StObject.set(x, "parserOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSheetName(value: String): Self = StObject.set(x, "sheetName", value.asInstanceOf[js.Any])
  }
}
