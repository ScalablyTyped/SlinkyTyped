package typingsSlinky.contractProxyKit.anon

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.ethers.mod.ethers.providers.InfuraProvider
import typingsSlinky.ethersprojectNetworks.typesMod.Network
import typingsSlinky.ethersprojectNetworks.typesMod.Networkish
import typingsSlinky.ethersprojectProviders.infuraProviderMod.InfuraWebSocketProvider
import typingsSlinky.ethersprojectWeb.mod.ConnectionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofInfuraProvider extends Instantiable0[InfuraProvider] {
  
  def getApiKey(apiKey: js.Any): js.Any = js.native
  
  def getUrl(network: Network, apiKey: js.Any): ConnectionInfo = js.native
  
  def getWebSocketProvider(): InfuraWebSocketProvider = js.native
  def getWebSocketProvider(network: js.UndefOr[Networkish], apiKey: js.Any): InfuraWebSocketProvider = js.native
  def getWebSocketProvider(network: Networkish): InfuraWebSocketProvider = js.native
}
