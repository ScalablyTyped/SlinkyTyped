package typingsSlinky.dynatable.JQueryDynatable

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Readers extends js.Object {
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
  implicit class ReadersOps[Self <: Readers] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_attributeReader(value: (/* cell */ Element, /* record */ js.Any) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_attributeReader")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def without_attributeReader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_attributeReader")(js.undefined)
        ret
    }
    @scala.inline
    def with_rowReader(value: (/* index */ Double, /* thisRef */ js.Any, /* record */ js.Any) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_rowReader")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def without_rowReader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_rowReader")(js.undefined)
        ret
    }
  }
  
}

