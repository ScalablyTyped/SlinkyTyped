package typingsSlinky.activexLibreoffice.com_.sun.star.sheet

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to a collection of filter conditions (filter fields).
  *
  * This interface uses the {@link TableFilterField2} struct, whereas the {@link XSheetFilterDescriptor} interface uses the {@link TableFilterField}
  * struct.
  * @see SheetFilterDescriptor
  * @since OOo 3.2
  */
@js.native
trait XSheetFilterDescriptor2 extends XInterface {
  /** returns the collection of filter fields. */
  var FilterFields2: SafeArray[TableFilterField2] = js.native
  /** returns the collection of filter fields. */
  def getFilterFields2(): SafeArray[TableFilterField2] = js.native
  /** sets a new collection of filter fields. */
  def setFilterFields2(aFilterFields: SeqEquiv[TableFilterField2]): Unit = js.native
}

object XSheetFilterDescriptor2 {
  @scala.inline
  def apply(
    FilterFields2: SafeArray[TableFilterField2],
    acquire: () => Unit,
    getFilterFields2: () => SafeArray[TableFilterField2],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setFilterFields2: SeqEquiv[TableFilterField2] => Unit
  ): XSheetFilterDescriptor2 = {
    val __obj = js.Dynamic.literal(FilterFields2 = FilterFields2.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getFilterFields2 = js.Any.fromFunction0(getFilterFields2), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setFilterFields2 = js.Any.fromFunction1(setFilterFields2))
    __obj.asInstanceOf[XSheetFilterDescriptor2]
  }
  @scala.inline
  implicit class XSheetFilterDescriptor2Ops[Self <: XSheetFilterDescriptor2] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilterFields2(value: SafeArray[TableFilterField2]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FilterFields2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetFilterFields2(value: () => SafeArray[TableFilterField2]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFilterFields2")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetFilterFields2(value: SeqEquiv[TableFilterField2] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFilterFields2")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

