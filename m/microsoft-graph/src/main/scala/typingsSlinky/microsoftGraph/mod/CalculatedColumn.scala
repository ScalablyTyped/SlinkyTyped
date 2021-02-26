package typingsSlinky.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CalculatedColumn extends StObject {
  
  // For dateTime output types, the format of the value. Must be one of dateOnly or dateTime.
  var format: js.UndefOr[NullableOption[String]] = js.native
  
  // The formula used to compute the value for this column.
  var formula: js.UndefOr[NullableOption[String]] = js.native
  
  // The output type used to format values in this column. Must be one of boolean, currency, dateTime, number, or text.
  var outputType: js.UndefOr[NullableOption[String]] = js.native
}
object CalculatedColumn {
  
  @scala.inline
  def apply(): CalculatedColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalculatedColumn]
  }
  
  @scala.inline
  implicit class CalculatedColumnMutableBuilder[Self <: CalculatedColumn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormat(value: NullableOption[String]): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatNull: Self = StObject.set(x, "format", null)
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setFormula(value: NullableOption[String]): Self = StObject.set(x, "formula", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormulaNull: Self = StObject.set(x, "formula", null)
    
    @scala.inline
    def setFormulaUndefined: Self = StObject.set(x, "formula", js.undefined)
    
    @scala.inline
    def setOutputType(value: NullableOption[String]): Self = StObject.set(x, "outputType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputTypeNull: Self = StObject.set(x, "outputType", null)
    
    @scala.inline
    def setOutputTypeUndefined: Self = StObject.set(x, "outputType", js.undefined)
  }
}
