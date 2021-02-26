package typingsSlinky.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Calculate extends StObject {
  
  /** Add the custom formulas with function in CalcEngine library
    * @param {string} pass the formula name
    * @param {string} pass the custom function name to call
    * @returns {void}
    */
  def addCustomFunction(FormulaName: String, FunctionName: String): Unit = js.native
  
  /** Adds a named range to the NamedRanges collection
    * @param {string} pass the namedRange's name
    * @param {string} pass the cell range of NamedRange
    * @returns {void}
    */
  def addNamedRange(Name: String, cellRange: String): Unit = js.native
  
  /** Accepts a possible parsed formula and returns the calculated value without quotes.
    * @param {string} pass the cell range to adjust its range
    * @returns {string}
    */
  def adjustRangeArg(Name: String): String = js.native
  
  /** When a formula cell changes, call this method to clear it from its dependent cells.
    * @param {string} pass the changed cell address
    * @returns {void}
    */
  def clearFormulaDependentCells(Cell: String): Unit = js.native
  
  /** Call this method to clear whether an exception was raised during the computation of a library function.
    * @returns {void}
    */
  def clearLibraryComputationException(): Unit = js.native
  
  /** Get the column index from a cell reference passed in.
    * @param {string} pass the cell address
    * @returns {void}
    */
  def colIndex(Cell: String): Unit = js.native
  
  /** Evaluates a parsed formula.
    * @param {string} pass the parsed formula
    * @returns {string}
    */
  def computeFormula(Formula: String): String = js.native
  
  /** Evaluates a parsed formula.
    * @param {string} pass the parsed formula
    * @returns {string}
    */
  def computedValue(Formula: String): String = js.native
  
  var defaults: Model = js.native
  
  var model: Model = js.native
}
object Calculate {
  
  @scala.inline
  def apply(
    addCustomFunction: (String, String) => Unit,
    addNamedRange: (String, String) => Unit,
    adjustRangeArg: String => String,
    clearFormulaDependentCells: String => Unit,
    clearLibraryComputationException: () => Unit,
    colIndex: String => Unit,
    computeFormula: String => String,
    computedValue: String => String,
    defaults: typingsSlinky.ejWebAll.ej.Model,
    model: typingsSlinky.ejWebAll.ej.Model
  ): Calculate = {
    val __obj = js.Dynamic.literal(addCustomFunction = js.Any.fromFunction2(addCustomFunction), addNamedRange = js.Any.fromFunction2(addNamedRange), adjustRangeArg = js.Any.fromFunction1(adjustRangeArg), clearFormulaDependentCells = js.Any.fromFunction1(clearFormulaDependentCells), clearLibraryComputationException = js.Any.fromFunction0(clearLibraryComputationException), colIndex = js.Any.fromFunction1(colIndex), computeFormula = js.Any.fromFunction1(computeFormula), computedValue = js.Any.fromFunction1(computedValue), defaults = defaults.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any])
    __obj.asInstanceOf[Calculate]
  }
  
  @scala.inline
  implicit class CalculateMutableBuilder[Self <: Calculate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddCustomFunction(value: (String, String) => Unit): Self = StObject.set(x, "addCustomFunction", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAddNamedRange(value: (String, String) => Unit): Self = StObject.set(x, "addNamedRange", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAdjustRangeArg(value: String => String): Self = StObject.set(x, "adjustRangeArg", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClearFormulaDependentCells(value: String => Unit): Self = StObject.set(x, "clearFormulaDependentCells", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClearLibraryComputationException(value: () => Unit): Self = StObject.set(x, "clearLibraryComputationException", js.Any.fromFunction0(value))
    
    @scala.inline
    def setColIndex(value: String => Unit): Self = StObject.set(x, "colIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setComputeFormula(value: String => String): Self = StObject.set(x, "computeFormula", js.Any.fromFunction1(value))
    
    @scala.inline
    def setComputedValue(value: String => String): Self = StObject.set(x, "computedValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDefaults(value: typingsSlinky.ejWebAll.ej.Model): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModel(value: typingsSlinky.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Model extends StObject
}
