package typingsSlinky.activexLibreoffice.com_.sun.star.sdbcx

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XNameAccess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is used to specify the index for a database table. It refers to one or more columns of a table.
  *
  * ** Note: ** All properties and columns of an index could by modified before they are appended to a table. In that case the service is a data
  * descriptor.
  */
@js.native
trait Index
  extends XDataDescriptorFactory
     with XColumnsSupplier
     with XPropertySet {
  
  /** is the name of the index catalog, may be empty. */
  var Catalog: String = js.native
  
  /** indicates that the index is clustered. */
  var IsClustered: Boolean = js.native
  
  /** indicates that the index is used for the primary key. */
  var IsPrimaryKeyIndex: Boolean = js.native
  
  /** indicates that the index allow only unique values. */
  var IsUnique: Boolean = js.native
  
  /** is the name of the index. */
  var Name: String = js.native
}
object Index {
  
  @scala.inline
  def apply(
    Catalog: String,
    Columns: XNameAccess,
    IsClustered: Boolean,
    IsPrimaryKeyIndex: Boolean,
    IsUnique: Boolean,
    Name: String,
    PropertySetInfo: XPropertySetInfo,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    createDataDescriptor: () => XPropertySet,
    getColumns: () => XNameAccess,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): Index = {
    val __obj = js.Dynamic.literal(Catalog = Catalog.asInstanceOf[js.Any], Columns = Columns.asInstanceOf[js.Any], IsClustered = IsClustered.asInstanceOf[js.Any], IsPrimaryKeyIndex = IsPrimaryKeyIndex.asInstanceOf[js.Any], IsUnique = IsUnique.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), createDataDescriptor = js.Any.fromFunction0(createDataDescriptor), getColumns = js.Any.fromFunction0(getColumns), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[Index]
  }
  
  @scala.inline
  implicit class IndexMutableBuilder[Self <: Index] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCatalog(value: String): Self = StObject.set(x, "Catalog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsClustered(value: Boolean): Self = StObject.set(x, "IsClustered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPrimaryKeyIndex(value: Boolean): Self = StObject.set(x, "IsPrimaryKeyIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsUnique(value: Boolean): Self = StObject.set(x, "IsUnique", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
