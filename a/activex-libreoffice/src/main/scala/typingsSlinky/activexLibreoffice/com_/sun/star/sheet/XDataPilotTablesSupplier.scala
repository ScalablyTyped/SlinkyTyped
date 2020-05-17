package typingsSlinky.activexLibreoffice.com_.sun.star.sheet

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * grants access to a collection of data pilot tables.
  * @see com.sun.star.sheet.Spreadsheet
  */
@js.native
trait XDataPilotTablesSupplier extends XInterface {
  /**
    * Returns the collection of data pilot tables.
    * @see com.sun.star.sheet.DataPilotTables
    */
  val DataPilotTables: XDataPilotTables = js.native
  /**
    * Returns the collection of data pilot tables.
    * @see com.sun.star.sheet.DataPilotTables
    */
  def getDataPilotTables(): XDataPilotTables = js.native
}

object XDataPilotTablesSupplier {
  @scala.inline
  def apply(
    DataPilotTables: XDataPilotTables,
    acquire: () => Unit,
    getDataPilotTables: () => XDataPilotTables,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XDataPilotTablesSupplier = {
    val __obj = js.Dynamic.literal(DataPilotTables = DataPilotTables.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getDataPilotTables = js.Any.fromFunction0(getDataPilotTables), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XDataPilotTablesSupplier]
  }
  @scala.inline
  implicit class XDataPilotTablesSupplierOps[Self <: XDataPilotTablesSupplier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataPilotTables(value: XDataPilotTables): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataPilotTables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetDataPilotTables(value: () => XDataPilotTables): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDataPilotTables")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

