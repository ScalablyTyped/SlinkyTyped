package typingsSlinky.promisePg.mod

import typingsSlinky.q.mod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("promise-pg", "connect")
@js.native
object connect extends js.Object {
  
  def apply(connection: String): Promise[Client] = js.native
  def apply(connection: typingsSlinky.pg.mod.ClientConfig): Promise[Client] = js.native
}
