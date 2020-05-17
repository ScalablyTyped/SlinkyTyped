package typingsSlinky.activexLibreoffice.com_.sun.star.sheet

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.table.CellRangeAddress
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a pane in a view of a spreadsheet document.
  * @see com.sun.star.sheet.SpreadsheetViewPane
  */
@js.native
trait XViewPane extends XInterface {
  /** returns the first column that is visible in the pane. */
  var FirstVisibleColumn: Double = js.native
  /** returns the first row that is visible in the pane. */
  var FirstVisibleRow: Double = js.native
  /** returns the address of the cell range that consists of the cells which are visible in the pane. */
  val VisibleRange: CellRangeAddress = js.native
  /** returns the first column that is visible in the pane. */
  def getFirstVisibleColumn(): Double = js.native
  /** returns the first row that is visible in the pane. */
  def getFirstVisibleRow(): Double = js.native
  /** returns the address of the cell range that consists of the cells which are visible in the pane. */
  def getVisibleRange(): CellRangeAddress = js.native
  /** sets the first column that is visible in the pane. */
  def setFirstVisibleColumn(nFirstVisibleColumn: Double): Unit = js.native
  /** sets the first row that is visible in the pane. */
  def setFirstVisibleRow(nFirstVisibleRow: Double): Unit = js.native
}

object XViewPane {
  @scala.inline
  def apply(
    FirstVisibleColumn: Double,
    FirstVisibleRow: Double,
    VisibleRange: CellRangeAddress,
    acquire: () => Unit,
    getFirstVisibleColumn: () => Double,
    getFirstVisibleRow: () => Double,
    getVisibleRange: () => CellRangeAddress,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setFirstVisibleColumn: Double => Unit,
    setFirstVisibleRow: Double => Unit
  ): XViewPane = {
    val __obj = js.Dynamic.literal(FirstVisibleColumn = FirstVisibleColumn.asInstanceOf[js.Any], FirstVisibleRow = FirstVisibleRow.asInstanceOf[js.Any], VisibleRange = VisibleRange.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getFirstVisibleColumn = js.Any.fromFunction0(getFirstVisibleColumn), getFirstVisibleRow = js.Any.fromFunction0(getFirstVisibleRow), getVisibleRange = js.Any.fromFunction0(getVisibleRange), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setFirstVisibleColumn = js.Any.fromFunction1(setFirstVisibleColumn), setFirstVisibleRow = js.Any.fromFunction1(setFirstVisibleRow))
    __obj.asInstanceOf[XViewPane]
  }
  @scala.inline
  implicit class XViewPaneOps[Self <: XViewPane] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFirstVisibleColumn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FirstVisibleColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirstVisibleRow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FirstVisibleRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisibleRange(value: CellRangeAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VisibleRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetFirstVisibleColumn(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFirstVisibleColumn")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetFirstVisibleRow(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFirstVisibleRow")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetVisibleRange(value: () => CellRangeAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getVisibleRange")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetFirstVisibleColumn(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFirstVisibleColumn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetFirstVisibleRow(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFirstVisibleRow")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

