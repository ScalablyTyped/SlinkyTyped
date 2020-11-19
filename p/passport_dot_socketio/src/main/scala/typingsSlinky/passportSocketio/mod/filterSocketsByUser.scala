package typingsSlinky.passportSocketio.mod

import typingsSlinky.socketIo.mod.Server
import typingsSlinky.socketIo.mod.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("passport.socketio", "filterSocketsByUser")
@js.native
object filterSocketsByUser extends js.Object {
  
  def apply(io: Server, filter: js.Function1[/* user */ js.Any, Boolean]): js.Array[Socket] = js.native
}
