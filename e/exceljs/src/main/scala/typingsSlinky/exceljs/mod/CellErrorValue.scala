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

@js.native
trait CellErrorValue extends _CellValue {
  
  var error: NumbersignNSlashA | NumbersignREFExclamationmark | NumbersignNAMEQuestionmark | NumbersignDIVSlash0Exclamationmark | NumbersignNULLExclamationmark | NumbersignVALUEExclamationmark | NumbersignNUMExclamationmark = js.native
}
object CellErrorValue {
  
  @scala.inline
  def apply(
    error: NumbersignNSlashA | NumbersignREFExclamationmark | NumbersignNAMEQuestionmark | NumbersignDIVSlash0Exclamationmark | NumbersignNULLExclamationmark | NumbersignVALUEExclamationmark | NumbersignNUMExclamationmark
  ): CellErrorValue = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellErrorValue]
  }
  
  @scala.inline
  implicit class CellErrorValueMutableBuilder[Self <: CellErrorValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(
      value: NumbersignNSlashA | NumbersignREFExclamationmark | NumbersignNAMEQuestionmark | NumbersignDIVSlash0Exclamationmark | NumbersignNULLExclamationmark | NumbersignVALUEExclamationmark | NumbersignNUMExclamationmark
    ): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
  }
}
