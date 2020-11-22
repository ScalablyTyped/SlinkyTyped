package typingsSlinky.ethers.ethersMod.providers

import typingsSlinky.ethersprojectNetworks.typesMod.Network
import typingsSlinky.ethersprojectNetworks.typesMod.Networkish
import typingsSlinky.ethersprojectWeb.mod.ConnectionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers/lib/ethers", "providers.InfuraProvider")
@js.native
class InfuraProvider ()
  extends typingsSlinky.ethersprojectProviders.mod.InfuraProvider
/* static members */
@JSImport("ethers/lib/ethers", "providers.InfuraProvider")
@js.native
object InfuraProvider extends js.Object {
  
  def getApiKey(apiKey: js.Any): js.Any = js.native
  
  def getUrl(network: Network, apiKey: js.Any): ConnectionInfo = js.native
  
  def getWebSocketProvider(): typingsSlinky.ethersprojectProviders.infuraProviderMod.InfuraWebSocketProvider = js.native
  def getWebSocketProvider(network: js.UndefOr[Networkish], apiKey: js.Any): typingsSlinky.ethersprojectProviders.infuraProviderMod.InfuraWebSocketProvider = js.native
  def getWebSocketProvider(network: Networkish): typingsSlinky.ethersprojectProviders.infuraProviderMod.InfuraWebSocketProvider = js.native
}
