package typingsSlinky.activexLibreoffice.com_.sun.star.chart2.data

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.FormulaToken
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Interface specific to spreadsheet data provider backend. */
@js.native
trait XSheetDataProvider extends XInterface {
  
  def createDataSequenceByFormulaTokens(aTokens: SeqEquiv[FormulaToken]): XDataSequence = js.native
  
  def createDataSequenceByFormulaTokensPossible(aTokens: SeqEquiv[FormulaToken]): Boolean = js.native
}
object XSheetDataProvider {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    createDataSequenceByFormulaTokens: SeqEquiv[FormulaToken] => XDataSequence,
    createDataSequenceByFormulaTokensPossible: SeqEquiv[FormulaToken] => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XSheetDataProvider = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createDataSequenceByFormulaTokens = js.Any.fromFunction1(createDataSequenceByFormulaTokens), createDataSequenceByFormulaTokensPossible = js.Any.fromFunction1(createDataSequenceByFormulaTokensPossible), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XSheetDataProvider]
  }
  
  @scala.inline
  implicit class XSheetDataProviderMutableBuilder[Self <: XSheetDataProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateDataSequenceByFormulaTokens(value: SeqEquiv[FormulaToken] => XDataSequence): Self = StObject.set(x, "createDataSequenceByFormulaTokens", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateDataSequenceByFormulaTokensPossible(value: SeqEquiv[FormulaToken] => Boolean): Self = StObject.set(x, "createDataSequenceByFormulaTokensPossible", js.Any.fromFunction1(value))
  }
}
