package typingsSlinky.exceljs.mod

import typingsSlinky.exceljs.exceljsStrings.NumbersignDIVSlash0Exclamationmark
import typingsSlinky.exceljs.exceljsStrings.NumbersignNAMEQuestionmark
import typingsSlinky.exceljs.exceljsStrings.NumbersignNSlashA
import typingsSlinky.exceljs.exceljsStrings.NumbersignNULLExclamationmark
import typingsSlinky.exceljs.exceljsStrings.NumbersignNUMExclamationmark
import typingsSlinky.exceljs.exceljsStrings.NumbersignREFExclamationmark
import typingsSlinky.exceljs.exceljsStrings.NumbersignVALUEExclamationmark
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _CellValue extends StObject
object _CellValue {
  
  @scala.inline
  def CellErrorValue(
    error: NumbersignNSlashA | NumbersignREFExclamationmark | NumbersignNAMEQuestionmark | NumbersignDIVSlash0Exclamationmark | NumbersignNULLExclamationmark | NumbersignVALUEExclamationmark | NumbersignNUMExclamationmark
  ): typingsSlinky.exceljs.mod.CellErrorValue = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.exceljs.mod.CellErrorValue]
  }
  
  @scala.inline
  def CellFormulaValue(date1904: Boolean, formula: String): typingsSlinky.exceljs.mod.CellFormulaValue = {
    val __obj = js.Dynamic.literal(date1904 = date1904.asInstanceOf[js.Any], formula = formula.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.exceljs.mod.CellFormulaValue]
  }
  
  @scala.inline
  def CellHyperlinkValue(hyperlink: String, text: String): typingsSlinky.exceljs.mod.CellHyperlinkValue = {
    val __obj = js.Dynamic.literal(hyperlink = hyperlink.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.exceljs.mod.CellHyperlinkValue]
  }
  
  @scala.inline
  def CellRichTextValue(richText: js.Array[RichText]): typingsSlinky.exceljs.mod.CellRichTextValue = {
    val __obj = js.Dynamic.literal(richText = richText.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.exceljs.mod.CellRichTextValue]
  }
  
  @scala.inline
  def CellSharedFormulaValue(date1904: Boolean, sharedFormula: String): typingsSlinky.exceljs.mod.CellSharedFormulaValue = {
    val __obj = js.Dynamic.literal(date1904 = date1904.asInstanceOf[js.Any], sharedFormula = sharedFormula.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.exceljs.mod.CellSharedFormulaValue]
  }
}
