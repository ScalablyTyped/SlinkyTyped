package typingsSlinky.activexLibreoffice.com_.sun.star.sdb

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.sdbc.XRowSet
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class XRowSetSupplierMutableBuilder[Self <: XRowSetSupplier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetRowSet(value: () => XRowSet): Self = StObject.set(x, "getRowSet", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRowSet(value: XRowSet): Self = StObject.set(x, "RowSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetRowSet(value: XRowSet => Unit): Self = StObject.set(x, "setRowSet", js.Any.fromFunction1(value))
  }
}
