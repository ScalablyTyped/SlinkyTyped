package typingsSlinky.activexLibreoffice.com_.sun.star.sdbcx

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XNameAccess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is used to define a table of a database. A table is described by its name and one or more columns and the keys for semantic rules.
  *
  * In addition, it may contain keys, and to define semantic rules for the table. ** Note: ** Indexes can only be appended when the table is already
  * appended at the database.
  * @see com.sun.star.sdbcx.Table
  */
@js.native
trait TableDescriptor
  extends Descriptor
     with XColumnsSupplier
     with XKeysSupplier {
  
  /** is the name of the table catalog. */
  var CatalogName: String = js.native
  
  /** supplies a comment on the table, Could be empty if not supported by the driver. */
  var Description: String = js.native
  
  /** is the name of the table schema. */
  var SchemaName: String = js.native
}
object TableDescriptor {
  
  @scala.inline
  def apply(
    CatalogName: String,
    Columns: XNameAccess,
    Description: String,
    Keys: XIndexAccess,
    Name: String,
    PropertySetInfo: XPropertySetInfo,
    SchemaName: String,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    getColumns: () => XNameAccess,
    getKeys: () => XIndexAccess,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): TableDescriptor = {
    val __obj = js.Dynamic.literal(CatalogName = CatalogName.asInstanceOf[js.Any], Columns = Columns.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], Keys = Keys.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], SchemaName = SchemaName.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getColumns = js.Any.fromFunction0(getColumns), getKeys = js.Any.fromFunction0(getKeys), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[TableDescriptor]
  }
  
  @scala.inline
  implicit class TableDescriptorOps[Self <: TableDescriptor] (val x: Self) extends AnyVal {
    
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
    def setCatalogName(value: String): Self = this.set("CatalogName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaName(value: String): Self = this.set("SchemaName", value.asInstanceOf[js.Any])
  }
}
