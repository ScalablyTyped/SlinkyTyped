package typingsSlinky.dynatable.JQueryDynatable

import org.scalajs.dom.raw.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Readers extends StObject {
  
  /**
    * Function that interprets the cell into data
    *
    * @param cell A html node of the target cell
    * @param record A data object representing the current line of data
    * @return the data for the current cell
    *
    * @default defaultAttributeReader
    *
    * @example
    * function exampleAttributeReader(cell, record) {
    *    return $(cell).html();
    * };
    */
  var _attributeReader: js.UndefOr[js.Function2[/* cell */ Element, /* record */ js.Any, _]] = js.native
  
  /**
    * Function that interprets the row into data
    *
    * @param index The index of the current row (from 0 to the perPage value)
    * @param thisRef
    * @param record
    * @return the data for the current row
    *
    * @default null
    *
    * @example
    * function exampleRowReader(index, this, record) {
    *     //...
    * };
    */
  var _rowReader: js.UndefOr[js.Function3[/* index */ Double, /* thisRef */ js.Any, /* record */ js.Any, _]] = js.native
}
object Readers {
  
  @scala.inline
  def apply(): Readers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Readers]
  }
  
  @scala.inline
  implicit class ReadersMutableBuilder[Self <: Readers] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set_attributeReader(value: (/* cell */ Element, /* record */ js.Any) => _): Self = StObject.set(x, "_attributeReader", js.Any.fromFunction2(value))
    
    @scala.inline
    def set_attributeReaderUndefined: Self = StObject.set(x, "_attributeReader", js.undefined)
    
    @scala.inline
    def set_rowReader(value: (/* index */ Double, /* thisRef */ js.Any, /* record */ js.Any) => _): Self = StObject.set(x, "_rowReader", js.Any.fromFunction3(value))
    
    @scala.inline
    def set_rowReaderUndefined: Self = StObject.set(x, "_rowReader", js.undefined)
  }
}
