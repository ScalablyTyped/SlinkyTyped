package typingsSlinky.activexLibreoffice.com_.sun.star.table

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides methods to access the contents of a cell in a table.
  * @see com.sun.star.table.Cell
  */
@js.native
trait XCell extends XInterface {
  
  /**
    * returns the error value of the cell.
    *
    * If the cell does not contain a formula, the error is always zero.
    */
  val Error: Double = js.native
  
  /**
    * returns the formula string of a cell.
    *
    * Even if the cell does not contain a formula, an assignment of this attribute's value to another cell's formula attribute would create the same cell
    * content. This is because this attribute contains the original text value of a string cell. The value of a **value cell** will be formatted using the
    * number format's default format or the formula string, including "=", of a formula cell.
    */
  var Formula: String = js.native
  
  /** returns the type of the cell. */
  val Type: CellContentType = js.native
  
  /**
    * returns the floating point value of the cell.
    *
    * For a **value cell** the value is returned, for a **string cell** zero is returned and for a **formula cell** the result value of a formula is
    * returned.
    */
  var Value: Double = js.native
  
  /**
    * returns the error value of the cell.
    *
    * If the cell does not contain a formula, the error is always zero.
    */
  def getError(): Double = js.native
  
  /**
    * returns the formula string of a cell.
    *
    * Even if the cell does not contain a formula, an assignment of this attribute's value to another cell's formula attribute would create the same cell
    * content. This is because this attribute contains the original text value of a string cell. The value of a **value cell** will be formatted using the
    * number format's default format or the formula string, including "=", of a formula cell.
    */
  def getFormula(): String = js.native
  
  /** returns the type of the cell. */
  def getType(): CellContentType = js.native
  
  /**
    * returns the floating point value of the cell.
    *
    * For a **value cell** the value is returned, for a **string cell** zero is returned and for a **formula cell** the result value of a formula is
    * returned.
    */
  def getValue(): Double = js.native
  
  /**
    * sets a formula into the cell.
    *
    * When assigned, the string will be interpreted and a value, text or formula cell is created, depending on the text and the number format.
    */
  def setFormula(aFormula: String): Unit = js.native
  
  /**
    * sets a floating point value into the cell.
    *
    * After a call to this method the type of the cell is CellContentType::VALUE.
    */
  def setValue(nValue: Double): Unit = js.native
}
object XCell {
  
  @scala.inline
  def apply(
    Error: Double,
    Formula: String,
    Type: CellContentType,
    Value: Double,
    acquire: () => Unit,
    getError: () => Double,
    getFormula: () => String,
    getType: () => CellContentType,
    getValue: () => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setFormula: String => Unit,
    setValue: Double => Unit
  ): XCell = {
    val __obj = js.Dynamic.literal(Error = Error.asInstanceOf[js.Any], Formula = Formula.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getError = js.Any.fromFunction0(getError), getFormula = js.Any.fromFunction0(getFormula), getType = js.Any.fromFunction0(getType), getValue = js.Any.fromFunction0(getValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setFormula = js.Any.fromFunction1(setFormula), setValue = js.Any.fromFunction1(setValue))
    __obj.asInstanceOf[XCell]
  }
  
  @scala.inline
  implicit class XCellMutableBuilder[Self <: XCell] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: Double): Self = StObject.set(x, "Error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormula(value: String): Self = StObject.set(x, "Formula", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetError(value: () => Double): Self = StObject.set(x, "getError", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFormula(value: () => String): Self = StObject.set(x, "getFormula", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetType(value: () => CellContentType): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetValue(value: () => Double): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetFormula(value: String => Unit): Self = StObject.set(x, "setFormula", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetValue(value: Double => Unit): Self = StObject.set(x, "setValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setType(value: CellContentType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
