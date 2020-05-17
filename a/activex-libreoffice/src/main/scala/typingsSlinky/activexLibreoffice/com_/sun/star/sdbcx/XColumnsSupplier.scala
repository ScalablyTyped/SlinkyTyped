package typingsSlinky.activexLibreoffice.com_.sun.star.sdbcx

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XNameAccess
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides the access to a container of columns, typically used for tables and indexes. */
@js.native
trait XColumnsSupplier extends XInterface {
  /**
    * returns the container of columns.
    * @returns the columns
    */
  val Columns: XNameAccess = js.native
  /**
    * returns the container of columns.
    * @returns the columns
    */
  def getColumns(): XNameAccess = js.native
}

object XColumnsSupplier {
  @scala.inline
  def apply(
    Columns: XNameAccess,
    acquire: () => Unit,
    getColumns: () => XNameAccess,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XColumnsSupplier = {
    val __obj = js.Dynamic.literal(Columns = Columns.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getColumns = js.Any.fromFunction0(getColumns), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XColumnsSupplier]
  }
  @scala.inline
  implicit class XColumnsSupplierOps[Self <: XColumnsSupplier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumns(value: XNameAccess): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetColumns(value: () => XNameAccess): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getColumns")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

