package typingsSlinky.activexLibreoffice.com_.sun.star.sdbcx

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XNameAccess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is used to define a new key for a table. */
@js.native
trait Key
  extends XDataDescriptorFactory
     with XColumnsSupplier
     with XPropertySet {
  /**
    * is the rule which is applied for deletions; only used for foreign keys.
    * @see com.sun.star.sdbc.KeyRule
    */
  var DeleteRule: Double = js.native
  /** is the name of the key */
  var Name: String = js.native
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

object Key {
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
    createDataDescriptor: () => XPropertySet,
    getColumns: () => XNameAccess,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): Key = {
    val __obj = js.Dynamic.literal(Columns = Columns.asInstanceOf[js.Any], DeleteRule = DeleteRule.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], ReferencedTable = ReferencedTable.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], UpdateRule = UpdateRule.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), createDataDescriptor = js.Any.fromFunction0(createDataDescriptor), getColumns = js.Any.fromFunction0(getColumns), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[Key]
  }
  @scala.inline
  implicit class KeyOps[Self <: Key] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeleteRule(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeleteRule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReferencedTable(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReferencedTable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateRule(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdateRule")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

