package typingsSlinky.activexLibreoffice.com_.sun.star.sdbcx

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XNameAccess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * used to specify a table in a database. A table is described by its name and one or more columns.
  *
  * In addition, it may contain indexes to improve the performance in the retrieval of the table's data and keys, and to define semantic rules for the
  * table.
  *
  * ** Note: ** All properties and columns of a table could by modified before it is appended to a database. In that case, the service is in fact a
  * descriptor. On existing tables, a user might alter columns, add or delete columns, indexes, and keys depending on the capabilities of the database and
  * on the user's privileges.
  * @see com.sun.star.sdbc.XDatabaseMetaData
  * @see com.sun.star.sdbcx.Privilege
  */
@js.native
trait Table
  extends XDataDescriptorFactory
     with XColumnsSupplier
     with XIndexesSupplier
     with XKeysSupplier
     with XRename
     with XAlterTable
     with XPropertySet {
  
  /** is the name of the table catalog. */
  var CatalogName: String = js.native
  
  /** supplies a comment on the table. Could be empty, if not supported by the driver. */
  var Description: String = js.native
  
  /** is the name of the table. */
  var Name: String = js.native
  
  /** is the name of the table schema. */
  var SchemaName: String = js.native
  
  /** indicates the type of the table like (TABLE, VIEW, SYSTEM TABLE). Could be empty, if not supported by the driver. */
  var Type: String = js.native
}
object Table {
  
  @scala.inline
  def apply(
    CatalogName: String,
    Columns: XNameAccess,
    Description: String,
    Indexes: XNameAccess,
    Keys: XIndexAccess,
    Name: String,
    PropertySetInfo: XPropertySetInfo,
    SchemaName: String,
    Type: String,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    alterColumnByIndex: (Double, XPropertySet) => Unit,
    alterColumnByName: (String, XPropertySet) => Unit,
    createDataDescriptor: () => XPropertySet,
    getColumns: () => XNameAccess,
    getIndexes: () => XNameAccess,
    getKeys: () => XIndexAccess,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    rename: String => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): Table = {
    val __obj = js.Dynamic.literal(CatalogName = CatalogName.asInstanceOf[js.Any], Columns = Columns.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], Indexes = Indexes.asInstanceOf[js.Any], Keys = Keys.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], SchemaName = SchemaName.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), alterColumnByIndex = js.Any.fromFunction2(alterColumnByIndex), alterColumnByName = js.Any.fromFunction2(alterColumnByName), createDataDescriptor = js.Any.fromFunction0(createDataDescriptor), getColumns = js.Any.fromFunction0(getColumns), getIndexes = js.Any.fromFunction0(getIndexes), getKeys = js.Any.fromFunction0(getKeys), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), rename = js.Any.fromFunction1(rename), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[Table]
  }
  
  @scala.inline
  implicit class TableMutableBuilder[Self <: Table] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCatalogName(value: String): Self = StObject.set(x, "CatalogName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaName(value: String): Self = StObject.set(x, "SchemaName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
