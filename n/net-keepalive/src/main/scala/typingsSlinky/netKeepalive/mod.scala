package typingsSlinky.netKeepalive

import typingsSlinky.netKeepalive.anon.Handle
import typingsSlinky.node.netMod.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("net-keepalive", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def getKeepAliveInterval(socket: NodeJSSocketWithFileDescriptor): Double = js.native
  
  def getKeepAliveProbes(socket: NodeJSSocketWithFileDescriptor): Double = js.native
  
  def getUserTimeout(socket: NodeJSSocketWithFileDescriptor): Double = js.native
  
  def setKeepAliveInterval(socket: NodeJSSocketWithFileDescriptor, intvl: Double): Boolean = js.native
  
  def setKeepAliveProbes(socket: NodeJSSocketWithFileDescriptor, cnt: Double): Boolean = js.native
  
  def setUserTimeout(socket: NodeJSSocketWithFileDescriptor, timeout: Double): Boolean = js.native
  
  type NodeJSSocketWithFileDescriptor = Socket | Handle
}
