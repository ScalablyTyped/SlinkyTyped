package typingsSlinky.datatablesNet

import typingsSlinky.datatablesNet.DataTables.Api
import typingsSlinky.datatablesNet.DataTables.JQueryDataTables
import typingsSlinky.datatablesNet.DataTables.Settings
import typingsSlinky.datatablesNet.DataTables.StaticFunctions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  @JSName("dataTable")
  var dataTable_Original: StaticFunctions = js.native
  def DataTable(): Api = js.native
  def DataTable(opts: Settings): Api = js.native
  /**
    * Returns JQuery object
    *
    * Usage:
    * $( selector ).dataTable();
    */
  def dataTable(): JQueryDataTables = js.native
}

