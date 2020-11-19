package typingsSlinky.msnodesql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("msnodesql", "open")
@js.native
object open extends js.Object {
  
  def apply(connectionString: String): Connection = js.native
  def apply(connectionString: String, callback: OpenCallback): Connection = js.native
}
