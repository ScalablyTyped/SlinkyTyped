package typingsSlinky.ethers.mod.ethers.providers

import typingsSlinky.ethersprojectNetworks.typesMod.Network
import typingsSlinky.ethersprojectNetworks.typesMod.Networkish
import typingsSlinky.ethersprojectWeb.mod.ConnectionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers", "ethers.providers.AlchemyProvider")
@js.native
class AlchemyProvider ()
  extends typingsSlinky.ethers.ethersMod.providers.AlchemyProvider
/* static members */
@JSImport("ethers", "ethers.providers.AlchemyProvider")
@js.native
object AlchemyProvider extends js.Object {
  
  def getApiKey(apiKey: js.Any): js.Any = js.native
  
  def getUrl(network: Network, apiKey: String): ConnectionInfo = js.native
  
  def getWebSocketProvider(): typingsSlinky.ethersprojectProviders.alchemyProviderMod.AlchemyWebSocketProvider = js.native
  def getWebSocketProvider(network: js.UndefOr[Networkish], apiKey: js.Any): typingsSlinky.ethersprojectProviders.alchemyProviderMod.AlchemyWebSocketProvider = js.native
  def getWebSocketProvider(network: Networkish): typingsSlinky.ethersprojectProviders.alchemyProviderMod.AlchemyWebSocketProvider = js.native
}
