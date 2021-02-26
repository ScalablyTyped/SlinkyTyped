package typingsSlinky.datatablesNet

import typingsSlinky.datatablesNet.DataTables.Api
import typingsSlinky.datatablesNet.DataTables.JQueryDataTables
import typingsSlinky.datatablesNet.DataTables.Settings
import typingsSlinky.datatablesNet.DataTables.StaticFunctions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends StObject {
  
  def DataTable(): Api = js.native
  def DataTable(opts: Settings): Api = js.native
  
  /**
    * Returns JQuery object
    *
    * Usage:
    * $( selector ).dataTable();
    */
  def dataTable(): JQueryDataTables = js.native
  @JSName("dataTable")
  var dataTable_Original: StaticFunctions = js.native
}
