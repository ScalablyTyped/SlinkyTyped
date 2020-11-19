package typingsSlinky.activexLibreoffice.com_.sun.star.sdb.tools

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsSlinky.activexLibreoffice.com_.sun.star.sdbc.XConnection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * allows to alter the indexes of a table.
  * @see com.sun.star.sdb.DataSource.Settings
  * @see com.sun.star.sdbcx.XAppend
  * @see com.sun.star.sdbcx.XDrop
  * @since OOo 3.3
  */
@js.native
trait XIndexAlteration extends XConnectionSupplier {
  
  /**
    * creates a new object using the given descriptor and appends it to the related container. ** Note: ** The descriptor will not be changed and can be
    * used again to append another object.
    * @param table the table to be altered
    * @param descriptor the descriptor which should be serve to append a new object
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def addIndex(table: XPropertySet, descriptor: XPropertySet): Unit = js.native
  
  /**
    * drops an object of the related container identified by its name.
    * @param table the table to be altered
    * @param index the name of the column to be dropped
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def dropIndex(table: XPropertySet, index: String): Unit = js.native
}
object XIndexAlteration {
  
  @scala.inline
  def apply(
    ActiveConnection: XConnection,
    acquire: () => Unit,
    addIndex: (XPropertySet, XPropertySet) => Unit,
    dropIndex: (XPropertySet, String) => Unit,
    initialize: SeqEquiv[_] => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XIndexAlteration = {
    val __obj = js.Dynamic.literal(ActiveConnection = ActiveConnection.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addIndex = js.Any.fromFunction2(addIndex), dropIndex = js.Any.fromFunction2(dropIndex), initialize = js.Any.fromFunction1(initialize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XIndexAlteration]
  }
  
  @scala.inline
  implicit class XIndexAlterationOps[Self <: XIndexAlteration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddIndex(value: (XPropertySet, XPropertySet) => Unit): Self = this.set("addIndex", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDropIndex(value: (XPropertySet, String) => Unit): Self = this.set("dropIndex", js.Any.fromFunction2(value))
  }
}
