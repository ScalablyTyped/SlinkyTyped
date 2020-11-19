package typingsSlinky.ibmDb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ibm_db", "openSync")
@js.native
object openSync extends js.Object {
  
  def apply(connStr: String): Database = js.native
  def apply(connStr: String, options: Options): Database = js.native
  def apply(connStr: ConnStr): Database = js.native
  def apply(connStr: ConnStr, options: Options): Database = js.native
}
