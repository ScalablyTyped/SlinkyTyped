package typingsSlinky.activexLibreoffice.com_.sun.star.sdb

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.sdbc.XRowSet
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * uses a row set as datasource.
  * @see XRowSetChangeBroadcaster
  */
@js.native
trait XRowSetSupplier extends XInterface {
  /**
    * provides access to the data source.
    * @returns the {@link RowSet} object
    */
  var RowSet: XRowSet = js.native
  /**
    * provides access to the data source.
    * @returns the {@link RowSet} object
    */
  def getRowSet(): XRowSet = js.native
  /**
    * sets the data source.
    * @param xDataSource the {@link RowSet} object to set
    */
  def setRowSet(xDataSource: XRowSet): Unit = js.native
}

object XRowSetSupplier {
  @scala.inline
  def apply(
    RowSet: XRowSet,
    acquire: () => Unit,
    getRowSet: () => XRowSet,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setRowSet: XRowSet => Unit
  ): XRowSetSupplier = {
    val __obj = js.Dynamic.literal(RowSet = RowSet.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getRowSet = js.Any.fromFunction0(getRowSet), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setRowSet = js.Any.fromFunction1(setRowSet))
    __obj.asInstanceOf[XRowSetSupplier]
  }
  @scala.inline
  implicit class XRowSetSupplierOps[Self <: XRowSetSupplier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRowSet(value: XRowSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RowSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetRowSet(value: () => XRowSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRowSet")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetRowSet(value: XRowSet => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRowSet")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

