package typingsSlinky.activexLibreoffice.com_.sun.star.sheet

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to the settings of a field in a subtotal descriptor.
  * @see com.sun.star.sheet.SubTotalField
  * @see com.sun.star.sheet.SubTotalDescriptor
  */
@js.native
trait XSubTotalField extends XInterface {
  /** returns the column by which entries are grouped. */
  var GroupColumn: Double = js.native
  /** returns the definitions of which columns should have subtotals added to them. */
  var SubTotalColumns: SafeArray[SubTotalColumn] = js.native
  /** returns the column by which entries are grouped. */
  def getGroupColumn(): Double = js.native
  /** returns the definitions of which columns should have subtotals added to them. */
  def getSubTotalColumns(): SafeArray[SubTotalColumn] = js.native
  /** sets the column by which entries are grouped. */
  def setGroupColumn(nGroupColumn: Double): Unit = js.native
  /** sets the definitions of which columns should have subtotals added to them. */
  def setSubTotalColumns(aSubTotalColumns: SeqEquiv[SubTotalColumn]): Unit = js.native
}

object XSubTotalField {
  @scala.inline
  def apply(
    GroupColumn: Double,
    SubTotalColumns: SafeArray[SubTotalColumn],
    acquire: () => Unit,
    getGroupColumn: () => Double,
    getSubTotalColumns: () => SafeArray[SubTotalColumn],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setGroupColumn: Double => Unit,
    setSubTotalColumns: SeqEquiv[SubTotalColumn] => Unit
  ): XSubTotalField = {
    val __obj = js.Dynamic.literal(GroupColumn = GroupColumn.asInstanceOf[js.Any], SubTotalColumns = SubTotalColumns.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getGroupColumn = js.Any.fromFunction0(getGroupColumn), getSubTotalColumns = js.Any.fromFunction0(getSubTotalColumns), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setGroupColumn = js.Any.fromFunction1(setGroupColumn), setSubTotalColumns = js.Any.fromFunction1(setSubTotalColumns))
    __obj.asInstanceOf[XSubTotalField]
  }
  @scala.inline
  implicit class XSubTotalFieldOps[Self <: XSubTotalField] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroupColumn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubTotalColumns(value: SafeArray[SubTotalColumn]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubTotalColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetGroupColumn(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGroupColumn")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSubTotalColumns(value: () => SafeArray[SubTotalColumn]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSubTotalColumns")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetGroupColumn(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setGroupColumn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetSubTotalColumns(value: SeqEquiv[SubTotalColumn] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSubTotalColumns")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

