package typingsSlinky.azdata.mod.connection

import typingsSlinky.azdata.mod.ServerInfo
import typingsSlinky.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("azdata", "connection.getServerInfo")
@js.native
object getServerInfo extends js.Object {
  def apply(connectionId: String): Thenable[ServerInfo] = js.native
}

