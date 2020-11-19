package typingsSlinky.mssql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mssql", "Table")
@js.native
class Table () extends js.Object {
  def this(tableName: String) = this()
  
  var columns: typingsSlinky.mssql.mod.columns = js.native
  
  var create: Boolean = js.native
  
  var database: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var path: js.UndefOr[String] = js.native
  
  var rows: typingsSlinky.mssql.mod.rows = js.native
  
  var schema: js.UndefOr[String] = js.native
  
  var temporary: js.UndefOr[Boolean] = js.native
}
