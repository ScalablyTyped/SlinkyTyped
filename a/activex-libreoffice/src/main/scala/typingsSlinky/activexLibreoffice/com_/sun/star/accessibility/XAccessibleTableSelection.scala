package typingsSlinky.activexLibreoffice.com_.sun.star.accessibility

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XAccessibleTableSelection extends XInterface {
  def selectColumn(column: Double): Boolean = js.native
  def selectRow(row: Double): Boolean = js.native
  def unselectColumn(column: Double): Boolean = js.native
  def unselectRow(row: Double): Boolean = js.native
}

object XAccessibleTableSelection {
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    selectColumn: Double => Boolean,
    selectRow: Double => Boolean,
    unselectColumn: Double => Boolean,
    unselectRow: Double => Boolean
  ): XAccessibleTableSelection = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), selectColumn = js.Any.fromFunction1(selectColumn), selectRow = js.Any.fromFunction1(selectRow), unselectColumn = js.Any.fromFunction1(unselectColumn), unselectRow = js.Any.fromFunction1(unselectRow))
    __obj.asInstanceOf[XAccessibleTableSelection]
  }
  @scala.inline
  implicit class XAccessibleTableSelectionOps[Self <: XAccessibleTableSelection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSelectColumn(value: Double => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectColumn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSelectRow(value: Double => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectRow")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUnselectColumn(value: Double => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unselectColumn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUnselectRow(value: Double => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unselectRow")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

