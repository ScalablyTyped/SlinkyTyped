package typingsSlinky.nodePersist.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-persist", "keys")
@js.native
object keys extends js.Object {
  
  def apply(): js.Promise[js.Array[String]] = js.native
  def apply(filter: FilterFunction[Datum]): js.Promise[js.Array[String]] = js.native
}
