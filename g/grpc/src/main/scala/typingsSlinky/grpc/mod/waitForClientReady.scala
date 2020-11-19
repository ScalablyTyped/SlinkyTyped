package typingsSlinky.grpc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grpc", "waitForClientReady")
@js.native
object waitForClientReady extends js.Object {
  
  def apply(client: Client, deadline: Deadline, callback: js.Function1[/* error */ js.Error | Null, Unit]): Unit = js.native
}
