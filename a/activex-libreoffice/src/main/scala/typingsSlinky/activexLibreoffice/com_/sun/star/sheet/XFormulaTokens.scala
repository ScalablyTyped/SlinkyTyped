package typingsSlinky.activexLibreoffice.com_.sun.star.sheet

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** gives access to a formula as token sequence. */
@js.native
trait XFormulaTokens extends StObject {
  
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
  implicit class XFormulaTokensMutableBuilder[Self <: XFormulaTokens] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetTokens(value: () => SafeArray[FormulaToken]): Self = StObject.set(x, "getTokens", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetTokens(value: SeqEquiv[FormulaToken] => Unit): Self = StObject.set(x, "setTokens", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTokens(value: SafeArray[FormulaToken]): Self = StObject.set(x, "Tokens", value.asInstanceOf[js.Any])
  }
}
