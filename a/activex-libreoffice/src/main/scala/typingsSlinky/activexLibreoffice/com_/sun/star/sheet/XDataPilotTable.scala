package typingsSlinky.activexLibreoffice.com_.sun.star.sheet

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.table.CellRangeAddress
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides methods to control a data pilot table which has already been created.
  * @see com.sun.star.sheet.DataPilotTable
  */
@js.native
trait XDataPilotTable extends XInterface {
  /** returns the address of the cell range that contains the data pilot table. */
  val OutputRange: CellRangeAddress = js.native
  /** returns the address of the cell range that contains the data pilot table. */
  def getOutputRange(): CellRangeAddress = js.native
  /** recreates the data pilot table with current data from the source cell range. */
  def refresh(): Unit = js.native
}

object XDataPilotTable {
  @scala.inline
  def apply(
    OutputRange: CellRangeAddress,
    acquire: () => Unit,
    getOutputRange: () => CellRangeAddress,
    queryInterface: `type` => js.Any,
    refresh: () => Unit,
    release: () => Unit
  ): XDataPilotTable = {
    val __obj = js.Dynamic.literal(OutputRange = OutputRange.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getOutputRange = js.Any.fromFunction0(getOutputRange), queryInterface = js.Any.fromFunction1(queryInterface), refresh = js.Any.fromFunction0(refresh), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XDataPilotTable]
  }
  @scala.inline
  implicit class XDataPilotTableOps[Self <: XDataPilotTable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOutputRange(value: CellRangeAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetOutputRange(value: () => CellRangeAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOutputRange")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRefresh(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refresh")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

