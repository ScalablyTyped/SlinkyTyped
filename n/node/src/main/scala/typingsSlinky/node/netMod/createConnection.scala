package typingsSlinky.node.netMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("net", "createConnection")
@js.native
object createConnection extends js.Object {
  
  def apply(options: NetConnectOpts): Socket = js.native
  def apply(options: NetConnectOpts, connectionListener: js.Function0[Unit]): Socket = js.native
  def apply(path: String): Socket = js.native
  def apply(path: String, connectionListener: js.Function0[Unit]): Socket = js.native
  def apply(port: Double): Socket = js.native
  def apply(port: Double, host: js.UndefOr[scala.Nothing], connectionListener: js.Function0[Unit]): Socket = js.native
  def apply(port: Double, host: String): Socket = js.native
  def apply(port: Double, host: String, connectionListener: js.Function0[Unit]): Socket = js.native
}
