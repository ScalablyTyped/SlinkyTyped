package typingsSlinky.exceljs.exceljsMod

import typingsSlinky.exceljs.exceljsStrings.`#DIV/0!`
import typingsSlinky.exceljs.exceljsStrings.`#N/A`
import typingsSlinky.exceljs.exceljsStrings.`#NAME?`
import typingsSlinky.exceljs.exceljsStrings.`#NULL!`
import typingsSlinky.exceljs.exceljsStrings.`#NUM!`
import typingsSlinky.exceljs.exceljsStrings.`#REF!`
import typingsSlinky.exceljs.exceljsStrings.`#VALUE!`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellErrorValue extends _CellValue {
  var error: `#N/A` | `#REF!` | `#NAME?` | `#DIV/0!` | `#NULL!` | `#VALUE!` | `#NUM!`
}

object CellErrorValue {
  @scala.inline
  def apply(error: `#N/A` | `#REF!` | `#NAME?` | `#DIV/0!` | `#NULL!` | `#VALUE!` | `#NUM!`): CellErrorValue = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CellErrorValue]
  }
}

