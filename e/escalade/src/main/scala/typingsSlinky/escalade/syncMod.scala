package typingsSlinky.escalade

import typingsSlinky.escalade.escaladeBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("escalade/sync", JSImport.Namespace)
@js.native
object syncMod extends js.Object {
  
  def apply(directory: String, callback: Callback): String | Unit = js.native
  
  type Callback = js.Function2[/* directory */ String, /* files */ js.Array[String], String | `false` | Unit]
}
