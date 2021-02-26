package typingsSlinky.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the ConditionalFormatRule object, for use in `conditionalFormatRule.set({ ... })`. */
@js.native
trait ConditionalFormatRuleUpdateData extends StObject {
  
  /**
    *
    * The formula, if required, to evaluate the conditional format rule on.
    *
    * [Api set: ExcelApi 1.6]
    */
  var formula: js.UndefOr[String] = js.native
  
  /**
    *
    * The formula, if required, to evaluate the conditional format rule on in the user's language.
    *
    * [Api set: ExcelApi 1.6]
    */
  var formulaLocal: js.UndefOr[String] = js.native
  
  /**
    *
    * The formula, if required, to evaluate the conditional format rule on in R1C1-style notation.
    *
    * [Api set: ExcelApi 1.6]
    */
  var formulaR1C1: js.UndefOr[String] = js.native
}
object ConditionalFormatRuleUpdateData {
  
  @scala.inline
  def apply(): ConditionalFormatRuleUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalFormatRuleUpdateData]
  }
  
  @scala.inline
  implicit class ConditionalFormatRuleUpdateDataMutableBuilder[Self <: ConditionalFormatRuleUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormula(value: String): Self = StObject.set(x, "formula", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormulaLocal(value: String): Self = StObject.set(x, "formulaLocal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormulaLocalUndefined: Self = StObject.set(x, "formulaLocal", js.undefined)
    
    @scala.inline
    def setFormulaR1C1(value: String): Self = StObject.set(x, "formulaR1C1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormulaR1C1Undefined: Self = StObject.set(x, "formulaR1C1", js.undefined)
    
    @scala.inline
    def setFormulaUndefined: Self = StObject.set(x, "formula", js.undefined)
  }
}
