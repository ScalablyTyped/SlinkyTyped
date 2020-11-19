package typingsSlinky.ftpd.mod

import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.node.netMod.Server
import typingsSlinky.node.netMod.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ftpd", "FtpConnection")
@js.native
class FtpConnection () extends EventEmitter {
  
  var cwd: String = js.native
  
  var dataSocket: Socket = js.native
  
  var hasQuit: Boolean = js.native
  
   // the actual data socket
  var mode: String = js.native
  
  var pasv: Server = js.native
  
  var pbszReceived: Boolean = js.native
  
  var root: String = js.native
  
  // State for handling TLS upgrades.
  var secure: Boolean = js.native
  
  var server: FtpServer = js.native
  
  var socket: Socket = js.native
  
  var username: String = js.native
}
