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
  * @see SheetFilterDescriptor
  */
@js.native
trait XSheetFilterDescriptor extends XInterface {
  /** returns the collection of filter fields. */
  var FilterFields: SafeArray[TableFilterField] = js.native
  /** returns the collection of filter fields. */
  def getFilterFields(): SafeArray[TableFilterField] = js.native
  /** sets a new collection of filter fields. */
  def setFilterFields(aFilterFields: SeqEquiv[TableFilterField]): Unit = js.native
}

object XSheetFilterDescriptor {
  @scala.inline
  def apply(
    FilterFields: SafeArray[TableFilterField],
    acquire: () => Unit,
    getFilterFields: () => SafeArray[TableFilterField],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setFilterFields: SeqEquiv[TableFilterField] => Unit
  ): XSheetFilterDescriptor = {
    val __obj = js.Dynamic.literal(FilterFields = FilterFields.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getFilterFields = js.Any.fromFunction0(getFilterFields), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setFilterFields = js.Any.fromFunction1(setFilterFields))
    __obj.asInstanceOf[XSheetFilterDescriptor]
  }
  @scala.inline
  implicit class XSheetFilterDescriptorOps[Self <: XSheetFilterDescriptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilterFields(value: SafeArray[TableFilterField]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FilterFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetFilterFields(value: () => SafeArray[TableFilterField]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFilterFields")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetFilterFields(value: SeqEquiv[TableFilterField] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFilterFields")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

