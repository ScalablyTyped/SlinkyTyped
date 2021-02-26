package typingsSlinky.exceljs.mod

import typingsSlinky.exceljs.exceljsStrings.custom
import typingsSlinky.exceljs.exceljsStrings.date
import typingsSlinky.exceljs.exceljsStrings.decimal
import typingsSlinky.exceljs.exceljsStrings.list
import typingsSlinky.exceljs.exceljsStrings.textLength
import typingsSlinky.exceljs.exceljsStrings.whole
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataValidation extends StObject {
  
  var allowBlank: js.UndefOr[Boolean] = js.native
  
  var error: js.UndefOr[String] = js.native
  
  var errorStyle: js.UndefOr[String] = js.native
  
  var errorTitle: js.UndefOr[String] = js.native
  
  var formulae: js.Array[_] = js.native
  
  var operator: js.UndefOr[DataValidationOperator] = js.native
  
  var prompt: js.UndefOr[String] = js.native
  
  var promptTitle: js.UndefOr[String] = js.native
  
  var showErrorMessage: js.UndefOr[Boolean] = js.native
  
  var showInputMessage: js.UndefOr[Boolean] = js.native
  
  var `type`: list | whole | decimal | date | textLength | custom = js.native
}
object DataValidation {
  
  @scala.inline
  def apply(formulae: js.Array[_], `type`: list | whole | decimal | date | textLength | custom): DataValidation = {
    val __obj = js.Dynamic.literal(formulae = formulae.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataValidation]
  }
  
  @scala.inline
  implicit class DataValidationMutableBuilder[Self <: DataValidation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowBlank(value: Boolean): Self = StObject.set(x, "allowBlank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowBlankUndefined: Self = StObject.set(x, "allowBlank", js.undefined)
    
    @scala.inline
    def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorStyle(value: String): Self = StObject.set(x, "errorStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorStyleUndefined: Self = StObject.set(x, "errorStyle", js.undefined)
    
    @scala.inline
    def setErrorTitle(value: String): Self = StObject.set(x, "errorTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorTitleUndefined: Self = StObject.set(x, "errorTitle", js.undefined)
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setFormulae(value: js.Array[_]): Self = StObject.set(x, "formulae", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormulaeVarargs(value: js.Any*): Self = StObject.set(x, "formulae", js.Array(value :_*))
    
    @scala.inline
    def setOperator(value: DataValidationOperator): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
    
    @scala.inline
    def setPrompt(value: String): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPromptTitle(value: String): Self = StObject.set(x, "promptTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPromptTitleUndefined: Self = StObject.set(x, "promptTitle", js.undefined)
    
    @scala.inline
    def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
    
    @scala.inline
    def setShowErrorMessage(value: Boolean): Self = StObject.set(x, "showErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowErrorMessageUndefined: Self = StObject.set(x, "showErrorMessage", js.undefined)
    
    @scala.inline
    def setShowInputMessage(value: Boolean): Self = StObject.set(x, "showInputMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowInputMessageUndefined: Self = StObject.set(x, "showInputMessage", js.undefined)
    
    @scala.inline
    def setType(value: list | whole | decimal | date | textLength | custom): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
