package typingsSlinky.ethers.mod.ethers.providers

import typingsSlinky.ethersprojectNetworks.typesMod.Networkish
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers", "ethers.providers.WebSocketProvider")
@js.native
class WebSocketProvider protected ()
  extends typingsSlinky.ethers.ethersMod.providers.WebSocketProvider {
  def this(url: String) = this()
  def this(url: String, network: Networkish) = this()
}
/* static members */
@JSImport("ethers", "ethers.providers.WebSocketProvider")
@js.native
object WebSocketProvider extends js.Object {
  
  def defaultUrl(): String = js.native
}
