package typingsSlinky.exceljs.mod

import typingsSlinky.exceljs.exceljsStrings.NumbersignDIVSlash0Exclamationmark
import typingsSlinky.exceljs.exceljsStrings.NumbersignNAMEQuestionmark
import typingsSlinky.exceljs.exceljsStrings.NumbersignNSlashA
import typingsSlinky.exceljs.exceljsStrings.NumbersignNULLExclamationmark
import typingsSlinky.exceljs.exceljsStrings.NumbersignNUMExclamationmark
import typingsSlinky.exceljs.exceljsStrings.NumbersignREFExclamationmark
import typingsSlinky.exceljs.exceljsStrings.NumbersignVALUEExclamationmark
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class CellErrorValueOps[Self <: CellErrorValue] (val x: Self) extends AnyVal {
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
    def setError(
      value: NumbersignNSlashA | NumbersignREFExclamationmark | NumbersignNAMEQuestionmark | NumbersignDIVSlash0Exclamationmark | NumbersignNULLExclamationmark | NumbersignVALUEExclamationmark | NumbersignNUMExclamationmark
    ): Self = this.set("error", value.asInstanceOf[js.Any])
  }
  
}

