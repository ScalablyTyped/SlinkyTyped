package typingsSlinky.ethersprojectProviders

import typingsSlinky.ethersprojectNetworks.typesMod.Network
import typingsSlinky.ethersprojectNetworks.typesMod.Networkish
import typingsSlinky.ethersprojectProviders.formatterMod.CommunityResourcable
import typingsSlinky.ethersprojectProviders.urlJsonRpcProviderMod.UrlJsonRpcProvider
import typingsSlinky.ethersprojectProviders.websocketProviderMod.WebSocketProvider
import typingsSlinky.ethersprojectWeb.mod.ConnectionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ethersproject/providers/lib/alchemy-provider", JSImport.Namespace)
@js.native
object alchemyProviderMod extends js.Object {
  
  @js.native
  class AlchemyProvider () extends UrlJsonRpcProvider
  /* static members */
  @js.native
  object AlchemyProvider extends js.Object {
    
    def getApiKey(apiKey: js.Any): js.Any = js.native
    
    def getUrl(network: Network, apiKey: String): ConnectionInfo = js.native
    
    def getWebSocketProvider(): AlchemyWebSocketProvider = js.native
    def getWebSocketProvider(network: js.UndefOr[Networkish], apiKey: js.Any): AlchemyWebSocketProvider = js.native
    def getWebSocketProvider(network: Networkish): AlchemyWebSocketProvider = js.native
  }
  
  @js.native
  class AlchemyWebSocketProvider ()
    extends WebSocketProvider
       with CommunityResourcable {
    def this(network: Networkish) = this()
    def this(network: js.UndefOr[Networkish], apiKey: js.Any) = this()
    
    val apiKey: String = js.native
    
    /* InferMemberOverrides */
    override def lookupAddress(address: String): js.Promise[String] = js.native
    
    /* InferMemberOverrides */
    override def resolveName(name: String): js.Promise[String] = js.native
  }
}
