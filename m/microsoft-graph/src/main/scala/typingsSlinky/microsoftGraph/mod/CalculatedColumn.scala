package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CalculatedColumn extends js.Object {
  
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
  implicit class CalculatedColumnOps[Self <: CalculatedColumn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFormat(value: NullableOption[String]): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setFormatNull: Self = this.set("format", null)
    
    @scala.inline
    def setFormula(value: NullableOption[String]): Self = this.set("formula", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormula: Self = this.set("formula", js.undefined)
    
    @scala.inline
    def setFormulaNull: Self = this.set("formula", null)
    
    @scala.inline
    def setOutputType(value: NullableOption[String]): Self = this.set("outputType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputType: Self = this.set("outputType", js.undefined)
    
    @scala.inline
    def setOutputTypeNull: Self = this.set("outputType", null)
  }
}
