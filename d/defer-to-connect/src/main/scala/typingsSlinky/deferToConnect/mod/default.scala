package typingsSlinky.deferToConnect.mod

import typingsSlinky.node.netMod.Socket
import typingsSlinky.node.tlsMod.TLSSocket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("defer-to-connect", JSImport.Default)
@js.native
object default extends js.Object {
  
  def apply(socket: Socket, fn: js.Function0[Unit]): Unit = js.native
  def apply(socket: Socket, fn: Listeners): Unit = js.native
  def apply(socket: TLSSocket, fn: js.Function0[Unit]): Unit = js.native
  def apply(socket: TLSSocket, fn: Listeners): Unit = js.native
}
