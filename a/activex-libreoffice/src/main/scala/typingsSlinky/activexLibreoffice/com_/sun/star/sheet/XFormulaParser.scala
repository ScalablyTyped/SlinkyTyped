package typingsSlinky.activexLibreoffice.com_.sun.star.sheet

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.com_.sun.star.table.CellAddress
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** converts between text and token representations of formulas. */
@js.native
trait XFormulaParser extends js.Object {
  /** parses a formula into a sequence of tokens. */
  def parseFormula(aFormula: String, aReferencePos: CellAddress): SafeArray[FormulaToken] = js.native
  /** converts a formula into a string. */
  def printFormula(aTokens: SeqEquiv[FormulaToken], aReferencePos: CellAddress): String = js.native
}

object XFormulaParser {
  @scala.inline
  def apply(
    parseFormula: (String, CellAddress) => SafeArray[FormulaToken],
    printFormula: (SeqEquiv[FormulaToken], CellAddress) => String
  ): XFormulaParser = {
    val __obj = js.Dynamic.literal(parseFormula = js.Any.fromFunction2(parseFormula), printFormula = js.Any.fromFunction2(printFormula))
    __obj.asInstanceOf[XFormulaParser]
  }
  @scala.inline
  implicit class XFormulaParserOps[Self <: XFormulaParser] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParseFormula(value: (String, CellAddress) => SafeArray[FormulaToken]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseFormula")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withPrintFormula(value: (SeqEquiv[FormulaToken], CellAddress) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printFormula")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

