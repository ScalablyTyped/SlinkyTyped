package typingsSlinky.datatablesNet.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion "order-methods"
//#region "page-methods"
@js.native
trait PageMethods extends js.Object {
  
  /**
    * Get the current page of the table.
    */
  def apply(): Double = js.native
  def apply(page: String): Api = js.native
  /**
    * Set the current page of the table.
    *
    * @param page Index or 'first', 'next', 'previous', 'last'
    */
  def apply(page: Double): Api = js.native
  
  /**
    * Get paging information about the table
    */
  def info(): PageMethodeModelInfoReturn = js.native
  
  /**
    * Get the table's page length.
    */
  def len(): Double = js.native
  /**
    * Set the table's page length.
    *
    * @param length Page length to set. use -1 to show all records.
    */
  def len(length: Double): Api = js.native
}
