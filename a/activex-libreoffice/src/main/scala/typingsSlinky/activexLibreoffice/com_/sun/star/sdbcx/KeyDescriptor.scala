package typingsSlinky.activexLibreoffice.com_.sun.star.sdbcx

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XNameAccess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is used to define a new key for a table.
  * @see com.sun.star.sdbcx.Key
  */
@js.native
trait KeyDescriptor
  extends Descriptor
     with XColumnsSupplier {
  
  /**
    * is the rule which is applied for deletions; only used for foreign keys.
    * @see com.sun.star.sdbc.KeyRule
    */
  var DeleteRule: Double = js.native
  
  /** is the name of the referenced table, only used for foreign keys. */
  var ReferencedTable: String = js.native
  
  /**
    * indicates the type of the key.
    * @see com.sun.star.sdbcx.KeyType
    */
  var Type: Double = js.native
  
  /**
    * is the rule which is applied for updates; only used for foreign keys.
    * @see com.sun.star.sdbc.KeyRule
    */
  var UpdateRule: Double = js.native
}
object KeyDescriptor {
  
  @scala.inline
  def apply(
    Columns: XNameAccess,
    DeleteRule: Double,
    Name: String,
    PropertySetInfo: XPropertySetInfo,
    ReferencedTable: String,
    Type: Double,
    UpdateRule: Double,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    getColumns: () => XNameAccess,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): KeyDescriptor = {
    val __obj = js.Dynamic.literal(Columns = Columns.asInstanceOf[js.Any], DeleteRule = DeleteRule.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], ReferencedTable = ReferencedTable.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], UpdateRule = UpdateRule.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getColumns = js.Any.fromFunction0(getColumns), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[KeyDescriptor]
  }
  
  @scala.inline
  implicit class KeyDescriptorMutableBuilder[Self <: KeyDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeleteRule(value: Double): Self = StObject.set(x, "DeleteRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferencedTable(value: String): Self = StObject.set(x, "ReferencedTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Double): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateRule(value: Double): Self = StObject.set(x, "UpdateRule", value.asInstanceOf[js.Any])
  }
}
