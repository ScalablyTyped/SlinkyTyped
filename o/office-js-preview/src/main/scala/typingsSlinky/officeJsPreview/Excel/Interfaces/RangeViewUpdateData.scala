package typingsSlinky.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the RangeView object, for use in `rangeView.set({ ... })`. */
@js.native
trait RangeViewUpdateData extends StObject {
  
  /**
    *
    * Represents the formula in A1-style notation.
    *
    * [Api set: ExcelApi 1.3]
    */
  var formulas: js.UndefOr[js.Array[js.Array[_]]] = js.native
  
  /**
    *
    * Represents the formula in A1-style notation, in the user's language and number-formatting locale.  For example, the English "=SUM(A1, 1.5)" formula would become "=SUMME(A1; 1,5)" in German.
    *
    * [Api set: ExcelApi 1.3]
    */
  var formulasLocal: js.UndefOr[js.Array[js.Array[_]]] = js.native
  
  /**
    *
    * Represents the formula in R1C1-style notation.
    *
    * [Api set: ExcelApi 1.3]
    */
  var formulasR1C1: js.UndefOr[js.Array[js.Array[_]]] = js.native
  
  /**
    *
    * Represents Excel's number format code for the given cell.
    *
    * [Api set: ExcelApi 1.3]
    */
  var numberFormat: js.UndefOr[js.Array[js.Array[_]]] = js.native
  
  /**
    *
    * Represents the raw values of the specified range view. The data returned could be of type string, number, or a boolean. Cells that contain an error will return the error string.
    *
    * [Api set: ExcelApi 1.3]
    */
  var values: js.UndefOr[js.Array[js.Array[_]]] = js.native
}
object RangeViewUpdateData {
  
  @scala.inline
  def apply(): RangeViewUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeViewUpdateData]
  }
  
  @scala.inline
  implicit class RangeViewUpdateDataMutableBuilder[Self <: RangeViewUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormulas(value: js.Array[js.Array[_]]): Self = StObject.set(x, "formulas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormulasLocal(value: js.Array[js.Array[_]]): Self = StObject.set(x, "formulasLocal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormulasLocalUndefined: Self = StObject.set(x, "formulasLocal", js.undefined)
    
    @scala.inline
    def setFormulasLocalVarargs(value: js.Array[js.Any]*): Self = StObject.set(x, "formulasLocal", js.Array(value :_*))
    
    @scala.inline
    def setFormulasR1C1(value: js.Array[js.Array[_]]): Self = StObject.set(x, "formulasR1C1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormulasR1C1Undefined: Self = StObject.set(x, "formulasR1C1", js.undefined)
    
    @scala.inline
    def setFormulasR1C1Varargs(value: js.Array[js.Any]*): Self = StObject.set(x, "formulasR1C1", js.Array(value :_*))
    
    @scala.inline
    def setFormulasUndefined: Self = StObject.set(x, "formulas", js.undefined)
    
    @scala.inline
    def setFormulasVarargs(value: js.Array[js.Any]*): Self = StObject.set(x, "formulas", js.Array(value :_*))
    
    @scala.inline
    def setNumberFormat(value: js.Array[js.Array[_]]): Self = StObject.set(x, "numberFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberFormatUndefined: Self = StObject.set(x, "numberFormat", js.undefined)
    
    @scala.inline
    def setNumberFormatVarargs(value: js.Array[js.Any]*): Self = StObject.set(x, "numberFormat", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: js.Array[js.Array[_]]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: js.Array[js.Any]*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
