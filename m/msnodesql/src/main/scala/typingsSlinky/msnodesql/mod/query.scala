package typingsSlinky.msnodesql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("msnodesql", "query")
@js.native
object query extends js.Object {
  
  def apply(connectionString: String, query: String): StreamEvents = js.native
  def apply(connectionString: String, query: String, callback: QueryCallback[_]): StreamEvents = js.native
  def apply(connectionString: String, query: String, params: js.Array[_]): StreamEvents = js.native
  def apply(connectionString: String, query: String, params: js.Array[_], callback: QueryCallback[_]): StreamEvents = js.native
}
