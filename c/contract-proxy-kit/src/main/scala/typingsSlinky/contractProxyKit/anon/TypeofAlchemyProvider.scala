package typingsSlinky.contractProxyKit.anon

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.ethers.mod.ethers.providers.AlchemyProvider
import typingsSlinky.ethersprojectNetworks.typesMod.Network
import typingsSlinky.ethersprojectNetworks.typesMod.Networkish
import typingsSlinky.ethersprojectProviders.alchemyProviderMod.AlchemyWebSocketProvider
import typingsSlinky.ethersprojectWeb.mod.ConnectionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofAlchemyProvider extends Instantiable0[AlchemyProvider] {
  
  def getApiKey(apiKey: js.Any): js.Any = js.native
  
  def getUrl(network: Network, apiKey: String): ConnectionInfo = js.native
  
  def getWebSocketProvider(): AlchemyWebSocketProvider = js.native
  def getWebSocketProvider(network: js.UndefOr[Networkish], apiKey: js.Any): AlchemyWebSocketProvider = js.native
  def getWebSocketProvider(network: Networkish): AlchemyWebSocketProvider = js.native
}
