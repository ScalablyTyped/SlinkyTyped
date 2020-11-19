package typingsSlinky.node.dgramMod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dgram", "createSocket")
@js.native
object createSocket extends js.Object {
  
  def apply(options: SocketOptions): Socket = js.native
  def apply(options: SocketOptions, callback: js.Function2[/* msg */ Buffer, /* rinfo */ RemoteInfo, Unit]): Socket = js.native
  def apply(`type`: SocketType): Socket = js.native
  def apply(`type`: SocketType, callback: js.Function2[/* msg */ Buffer, /* rinfo */ RemoteInfo, Unit]): Socket = js.native
}
