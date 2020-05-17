package typingsSlinky.activexLibreoffice.com_.sun.star.sheet

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** gives access to a formula as token sequence. */
@js.native
trait XFormulaTokens extends js.Object {
  /** returns the formula as sequence of tokens. */
  var Tokens: SafeArray[FormulaToken] = js.native
  /** returns the formula as sequence of tokens. */
  def getTokens(): SafeArray[FormulaToken] = js.native
  /** sets the formula as sequence of tokens. */
  def setTokens(aTokens: SeqEquiv[FormulaToken]): Unit = js.native
}

object XFormulaTokens {
  @scala.inline
  def apply(
    Tokens: SafeArray[FormulaToken],
    getTokens: () => SafeArray[FormulaToken],
    setTokens: SeqEquiv[FormulaToken] => Unit
  ): XFormulaTokens = {
    val __obj = js.Dynamic.literal(Tokens = Tokens.asInstanceOf[js.Any], getTokens = js.Any.fromFunction0(getTokens), setTokens = js.Any.fromFunction1(setTokens))
    __obj.asInstanceOf[XFormulaTokens]
  }
  @scala.inline
  implicit class XFormulaTokensOps[Self <: XFormulaTokens] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTokens(value: SafeArray[FormulaToken]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tokens")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetTokens(value: () => SafeArray[FormulaToken]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTokens")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetTokens(value: SeqEquiv[FormulaToken] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTokens")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

