package typingsSlinky.activexLibreoffice.com_.sun.star.sheet

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.table.XCellRange
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows direct access to the cells in a named range or to the cells which are visible in a view, without the need to get the document object first.
  * @see com.sun.star.sheet.NamedRange
  * @see com.sun.star.sheet.DatabaseRange
  * @see com.sun.star.sheet.SpreadsheetViewPane
  */
@js.native
trait XCellRangeReferrer extends XInterface {
  /** returns the cell range object that is represented. */
  val ReferredCells: XCellRange = js.native
  /** returns the cell range object that is represented. */
  def getReferredCells(): XCellRange = js.native
}

object XCellRangeReferrer {
  @scala.inline
  def apply(
    ReferredCells: XCellRange,
    acquire: () => Unit,
    getReferredCells: () => XCellRange,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XCellRangeReferrer = {
    val __obj = js.Dynamic.literal(ReferredCells = ReferredCells.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getReferredCells = js.Any.fromFunction0(getReferredCells), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XCellRangeReferrer]
  }
  @scala.inline
  implicit class XCellRangeReferrerOps[Self <: XCellRangeReferrer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReferredCells(value: XCellRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReferredCells")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetReferredCells(value: () => XCellRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getReferredCells")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

