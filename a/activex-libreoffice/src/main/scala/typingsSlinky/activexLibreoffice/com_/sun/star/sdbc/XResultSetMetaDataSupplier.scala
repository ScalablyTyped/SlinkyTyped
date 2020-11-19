package typingsSlinky.activexLibreoffice.com_.sun.star.sdbc

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to the meta data of a result set.
  *
  * The number, types, and properties of a {@link ResultSet} 's columns are provided by the {@link com.sun.star.sdbc.XResultSetMetaData} interface
  * returned by the {@link com.sun.star.sdbc.XResultSetMetaDataSupplier.getMetaData()} method.
  */
@js.native
trait XResultSetMetaDataSupplier extends XInterface {
  
  /**
    * retrieves the number, types, and properties of a {@link ResultSet} 's columns.
    * @returns the meta data of the {@link ResultSet} .
    * @throws SQLException if a database access error occurs.
    */
  val MetaData: XResultSetMetaData = js.native
  
  /**
    * retrieves the number, types, and properties of a {@link ResultSet} 's columns.
    * @returns the meta data of the {@link ResultSet} .
    * @throws SQLException if a database access error occurs.
    */
  def getMetaData(): XResultSetMetaData = js.native
}
object XResultSetMetaDataSupplier {
  
  @scala.inline
  def apply(
    MetaData: XResultSetMetaData,
    acquire: () => Unit,
    getMetaData: () => XResultSetMetaData,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XResultSetMetaDataSupplier = {
    val __obj = js.Dynamic.literal(MetaData = MetaData.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getMetaData = js.Any.fromFunction0(getMetaData), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XResultSetMetaDataSupplier]
  }
  
  @scala.inline
  implicit class XResultSetMetaDataSupplierOps[Self <: XResultSetMetaDataSupplier] (val x: Self) extends AnyVal {
    
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
    def setMetaData(value: XResultSetMetaData): Self = this.set("MetaData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetMetaData(value: () => XResultSetMetaData): Self = this.set("getMetaData", js.Any.fromFunction0(value))
  }
}
