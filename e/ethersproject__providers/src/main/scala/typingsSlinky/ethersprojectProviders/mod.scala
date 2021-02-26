package typingsSlinky.ethersprojectProviders

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.ethersprojectAbstractProvider.mod.TransactionRequest
import typingsSlinky.ethersprojectNetworks.typesMod.Network
import typingsSlinky.ethersprojectNetworks.typesMod.Networkish
import typingsSlinky.ethersprojectProviders.fallbackProviderMod.FallbackProviderConfig
import typingsSlinky.ethersprojectProviders.formatterMod.FormatFunc
import typingsSlinky.ethersprojectProviders.web3ProviderMod.ExternalProvider
import typingsSlinky.ethersprojectProviders.web3ProviderMod.JsonRpcFetchFunc
import typingsSlinky.ethersprojectWeb.mod.ConnectionInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ethersproject/providers", "AlchemyProvider")
  @js.native
  class AlchemyProvider ()
    extends typingsSlinky.ethersprojectProviders.alchemyProviderMod.AlchemyProvider {
    def this(network: Networkish) = this()
    def this(network: js.UndefOr[Networkish], apiKey: js.Any) = this()
  }
  /* static members */
  object AlchemyProvider {
    
    @JSImport("@ethersproject/providers", "AlchemyProvider.getApiKey")
    @js.native
    def getApiKey(apiKey: js.Any): js.Any = js.native
    
    @JSImport("@ethersproject/providers", "AlchemyProvider.getUrl")
    @js.native
    def getUrl(network: Network, apiKey: String): ConnectionInfo = js.native
    
    @JSImport("@ethersproject/providers", "AlchemyProvider.getWebSocketProvider")
    @js.native
    def getWebSocketProvider(): typingsSlinky.ethersprojectProviders.alchemyProviderMod.AlchemyWebSocketProvider = js.native
    @JSImport("@ethersproject/providers", "AlchemyProvider.getWebSocketProvider")
    @js.native
    def getWebSocketProvider(network: js.UndefOr[Networkish], apiKey: js.Any): typingsSlinky.ethersprojectProviders.alchemyProviderMod.AlchemyWebSocketProvider = js.native
    @JSImport("@ethersproject/providers", "AlchemyProvider.getWebSocketProvider")
    @js.native
    def getWebSocketProvider(network: Networkish): typingsSlinky.ethersprojectProviders.alchemyProviderMod.AlchemyWebSocketProvider = js.native
  }
  
  @JSImport("@ethersproject/providers", "AlchemyWebSocketProvider")
  @js.native
  class AlchemyWebSocketProvider ()
    extends typingsSlinky.ethersprojectProviders.alchemyProviderMod.AlchemyWebSocketProvider {
    def this(network: Networkish) = this()
    def this(network: js.UndefOr[Networkish], apiKey: js.Any) = this()
  }
  
  @JSImport("@ethersproject/providers", "BaseProvider")
  @js.native
  class BaseProvider protected ()
    extends typingsSlinky.ethersprojectProviders.baseProviderMod.BaseProvider {
    def this(network: js.Promise[Network]) = this()
    /**
      *  ready
      *
      *  A Promise<Network> that resolves only once the provider is ready.
      *
      *  Sub-classes that call the super with a network without a chainId
      *  MUST set this. Standard named networks have a known chainId.
      *
      */
    def this(network: Networkish) = this()
  }
  /* static members */
  object BaseProvider {
    
    @JSImport("@ethersproject/providers", "BaseProvider.getFormatter")
    @js.native
    def getFormatter(): typingsSlinky.ethersprojectProviders.formatterMod.Formatter = js.native
    
    @JSImport("@ethersproject/providers", "BaseProvider.getNetwork")
    @js.native
    def getNetwork(network: Networkish): Network = js.native
  }
  
  @JSImport("@ethersproject/providers", "CloudflareProvider")
  @js.native
  class CloudflareProvider ()
    extends typingsSlinky.ethersprojectProviders.cloudflareProviderMod.CloudflareProvider {
    def this(network: Networkish) = this()
    def this(network: js.UndefOr[Networkish], apiKey: js.Any) = this()
  }
  /* static members */
  object CloudflareProvider {
    
    @JSImport("@ethersproject/providers", "CloudflareProvider.getApiKey")
    @js.native
    def getApiKey(apiKey: js.Any): js.Any = js.native
    
    @JSImport("@ethersproject/providers", "CloudflareProvider.getUrl")
    @js.native
    def getUrl(network: Network): String = js.native
    @JSImport("@ethersproject/providers", "CloudflareProvider.getUrl")
    @js.native
    def getUrl(network: Network, apiKey: js.Any): String = js.native
  }
  
  @JSImport("@ethersproject/providers", "EtherscanProvider")
  @js.native
  class EtherscanProvider ()
    extends typingsSlinky.ethersprojectProviders.etherscanProviderMod.EtherscanProvider {
    def this(network: Networkish) = this()
    def this(network: js.UndefOr[Networkish], apiKey: String) = this()
  }
  
  @JSImport("@ethersproject/providers", "FallbackProvider")
  @js.native
  class FallbackProvider protected ()
    extends typingsSlinky.ethersprojectProviders.fallbackProviderMod.FallbackProvider {
    def this(providers: js.Array[
            typingsSlinky.ethersprojectAbstractProvider.mod.Provider | FallbackProviderConfig
          ]) = this()
    def this(
      providers: js.Array[
            typingsSlinky.ethersprojectAbstractProvider.mod.Provider | FallbackProviderConfig
          ],
      quorum: Double
    ) = this()
  }
  
  @JSImport("@ethersproject/providers", "Formatter")
  @js.native
  class Formatter ()
    extends typingsSlinky.ethersprojectProviders.formatterMod.Formatter
  /* static members */
  object Formatter {
    
    @JSImport("@ethersproject/providers", "Formatter.allowFalsish")
    @js.native
    def allowFalsish(format: FormatFunc, replaceValue: js.Any): FormatFunc = js.native
    
    @JSImport("@ethersproject/providers", "Formatter.allowNull")
    @js.native
    def allowNull(format: FormatFunc): FormatFunc = js.native
    @JSImport("@ethersproject/providers", "Formatter.allowNull")
    @js.native
    def allowNull(format: FormatFunc, nullValue: js.Any): FormatFunc = js.native
    
    @JSImport("@ethersproject/providers", "Formatter.arrayOf")
    @js.native
    def arrayOf(format: FormatFunc): FormatFunc = js.native
    
    @JSImport("@ethersproject/providers", "Formatter.check")
    @js.native
    def check(format: StringDictionary[FormatFunc], `object`: js.Any): js.Any = js.native
  }
  
  @JSImport("@ethersproject/providers", "InfuraProvider")
  @js.native
  class InfuraProvider ()
    extends typingsSlinky.ethersprojectProviders.infuraProviderMod.InfuraProvider {
    def this(network: Networkish) = this()
    def this(network: js.UndefOr[Networkish], apiKey: js.Any) = this()
  }
  /* static members */
  object InfuraProvider {
    
    @JSImport("@ethersproject/providers", "InfuraProvider.getApiKey")
    @js.native
    def getApiKey(apiKey: js.Any): js.Any = js.native
    
    @JSImport("@ethersproject/providers", "InfuraProvider.getUrl")
    @js.native
    def getUrl(network: Network, apiKey: js.Any): ConnectionInfo = js.native
    
    @JSImport("@ethersproject/providers", "InfuraProvider.getWebSocketProvider")
    @js.native
    def getWebSocketProvider(): typingsSlinky.ethersprojectProviders.infuraProviderMod.InfuraWebSocketProvider = js.native
    @JSImport("@ethersproject/providers", "InfuraProvider.getWebSocketProvider")
    @js.native
    def getWebSocketProvider(network: js.UndefOr[Networkish], apiKey: js.Any): typingsSlinky.ethersprojectProviders.infuraProviderMod.InfuraWebSocketProvider = js.native
    @JSImport("@ethersproject/providers", "InfuraProvider.getWebSocketProvider")
    @js.native
    def getWebSocketProvider(network: Networkish): typingsSlinky.ethersprojectProviders.infuraProviderMod.InfuraWebSocketProvider = js.native
  }
  
  @JSImport("@ethersproject/providers", "InfuraWebSocketProvider")
  @js.native
  class InfuraWebSocketProvider ()
    extends typingsSlinky.ethersprojectProviders.infuraProviderMod.InfuraWebSocketProvider {
    def this(network: Networkish) = this()
    def this(network: js.UndefOr[Networkish], apiKey: js.Any) = this()
  }
  
  @JSImport("@ethersproject/providers", "IpcProvider")
  @js.native
  class IpcProvider protected ()
    extends typingsSlinky.ethersprojectProviders.ipcProviderMod.IpcProvider {
    def this(path: String) = this()
    def this(path: String, network: Networkish) = this()
  }
  
  @JSImport("@ethersproject/providers", "JsonRpcProvider")
  @js.native
  class JsonRpcProvider ()
    extends typingsSlinky.ethersprojectProviders.jsonRpcProviderMod.JsonRpcProvider {
    def this(url: String) = this()
    def this(url: ConnectionInfo) = this()
    def this(url: js.UndefOr[scala.Nothing], network: Networkish) = this()
    def this(url: String, network: Networkish) = this()
    def this(url: ConnectionInfo, network: Networkish) = this()
  }
  /* static members */
  object JsonRpcProvider {
    
    @JSImport("@ethersproject/providers", "JsonRpcProvider.defaultUrl")
    @js.native
    def defaultUrl(): String = js.native
    
    @JSImport("@ethersproject/providers", "JsonRpcProvider.hexlifyTransaction")
    @js.native
    def hexlifyTransaction(transaction: TransactionRequest): StringDictionary[String] = js.native
    @JSImport("@ethersproject/providers", "JsonRpcProvider.hexlifyTransaction")
    @js.native
    def hexlifyTransaction(transaction: TransactionRequest, allowExtra: StringDictionary[Boolean]): StringDictionary[String] = js.native
  }
  
  @JSImport("@ethersproject/providers", "JsonRpcSigner")
  @js.native
  class JsonRpcSigner protected ()
    extends typingsSlinky.ethersprojectProviders.jsonRpcProviderMod.JsonRpcSigner {
    def this(
      constructorGuard: js.Any,
      provider: typingsSlinky.ethersprojectProviders.jsonRpcProviderMod.JsonRpcProvider
    ) = this()
    def this(
      constructorGuard: js.Any,
      provider: typingsSlinky.ethersprojectProviders.jsonRpcProviderMod.JsonRpcProvider,
      addressOrIndex: String
    ) = this()
    def this(
      constructorGuard: js.Any,
      provider: typingsSlinky.ethersprojectProviders.jsonRpcProviderMod.JsonRpcProvider,
      addressOrIndex: Double
    ) = this()
  }
  
  @JSImport("@ethersproject/providers", "NodesmithProvider")
  @js.native
  class NodesmithProvider ()
    extends typingsSlinky.ethersprojectProviders.nodesmithProviderMod.NodesmithProvider {
    def this(network: Networkish) = this()
    def this(network: js.UndefOr[Networkish], apiKey: js.Any) = this()
  }
  /* static members */
  object NodesmithProvider {
    
    @JSImport("@ethersproject/providers", "NodesmithProvider.getApiKey")
    @js.native
    def getApiKey(apiKey: js.Any): js.Any = js.native
    
    @JSImport("@ethersproject/providers", "NodesmithProvider.getUrl")
    @js.native
    def getUrl(network: Network): String = js.native
    @JSImport("@ethersproject/providers", "NodesmithProvider.getUrl")
    @js.native
    def getUrl(network: Network, apiKey: js.Any): String = js.native
  }
  
  @JSImport("@ethersproject/providers", "PocketProvider")
  @js.native
  class PocketProvider ()
    extends typingsSlinky.ethersprojectProviders.pocketProviderMod.PocketProvider {
    def this(network: Networkish) = this()
    def this(network: js.UndefOr[Networkish], apiKey: js.Any) = this()
  }
  /* static members */
  object PocketProvider {
    
    @JSImport("@ethersproject/providers", "PocketProvider.getApiKey")
    @js.native
    def getApiKey(apiKey: js.Any): js.Any = js.native
    
    @JSImport("@ethersproject/providers", "PocketProvider.getUrl")
    @js.native
    def getUrl(network: Network, apiKey: js.Any): ConnectionInfo = js.native
  }
  
  @JSImport("@ethersproject/providers", "Provider")
  @js.native
  abstract class Provider ()
    extends typingsSlinky.ethersprojectAbstractProvider.mod.Provider
  /* static members */
  object Provider {
    
    @JSImport("@ethersproject/providers", "Provider.isProvider")
    @js.native
    def isProvider(value: js.Any): /* is @ethersproject/abstract-provider.@ethersproject/abstract-provider.Provider */ Boolean = js.native
  }
  
  @JSImport("@ethersproject/providers", "Resolver")
  @js.native
  class Resolver protected ()
    extends typingsSlinky.ethersprojectProviders.baseProviderMod.Resolver {
    def this(
      provider: typingsSlinky.ethersprojectProviders.baseProviderMod.BaseProvider,
      address: String,
      name: String
    ) = this()
  }
  
  @JSImport("@ethersproject/providers", "StaticJsonRpcProvider")
  @js.native
  class StaticJsonRpcProvider ()
    extends typingsSlinky.ethersprojectProviders.urlJsonRpcProviderMod.StaticJsonRpcProvider {
    def this(url: String) = this()
    def this(url: ConnectionInfo) = this()
    def this(url: js.UndefOr[scala.Nothing], network: Networkish) = this()
    def this(url: String, network: Networkish) = this()
    def this(url: ConnectionInfo, network: Networkish) = this()
  }
  
  @JSImport("@ethersproject/providers", "UrlJsonRpcProvider")
  @js.native
  abstract class UrlJsonRpcProvider ()
    extends typingsSlinky.ethersprojectProviders.urlJsonRpcProviderMod.UrlJsonRpcProvider {
    def this(network: Networkish) = this()
    def this(network: js.UndefOr[Networkish], apiKey: js.Any) = this()
  }
  /* static members */
  object UrlJsonRpcProvider {
    
    @JSImport("@ethersproject/providers", "UrlJsonRpcProvider.getApiKey")
    @js.native
    def getApiKey(apiKey: js.Any): js.Any = js.native
    
    @JSImport("@ethersproject/providers", "UrlJsonRpcProvider.getUrl")
    @js.native
    def getUrl(network: Network, apiKey: js.Any): String | ConnectionInfo = js.native
  }
  
  @JSImport("@ethersproject/providers", "Web3Provider")
  @js.native
  class Web3Provider protected ()
    extends typingsSlinky.ethersprojectProviders.web3ProviderMod.Web3Provider {
    def this(provider: ExternalProvider) = this()
    def this(provider: JsonRpcFetchFunc) = this()
    def this(provider: ExternalProvider, network: Networkish) = this()
    def this(provider: JsonRpcFetchFunc, network: Networkish) = this()
  }
  
  @JSImport("@ethersproject/providers", "WebSocketProvider")
  @js.native
  class WebSocketProvider protected ()
    extends typingsSlinky.ethersprojectProviders.websocketProviderMod.WebSocketProvider {
    def this(url: String) = this()
    def this(url: String, network: Networkish) = this()
  }
  /* static members */
  object WebSocketProvider {
    
    @JSImport("@ethersproject/providers", "WebSocketProvider.defaultUrl")
    @js.native
    def defaultUrl(): String = js.native
  }
  
  @JSImport("@ethersproject/providers", "getDefaultProvider")
  @js.native
  def getDefaultProvider(): typingsSlinky.ethersprojectProviders.baseProviderMod.BaseProvider = js.native
  @JSImport("@ethersproject/providers", "getDefaultProvider")
  @js.native
  def getDefaultProvider(network: js.UndefOr[scala.Nothing], options: js.Any): typingsSlinky.ethersprojectProviders.baseProviderMod.BaseProvider = js.native
  @JSImport("@ethersproject/providers", "getDefaultProvider")
  @js.native
  def getDefaultProvider(network: String): typingsSlinky.ethersprojectProviders.baseProviderMod.BaseProvider = js.native
  @JSImport("@ethersproject/providers", "getDefaultProvider")
  @js.native
  def getDefaultProvider(network: String, options: js.Any): typingsSlinky.ethersprojectProviders.baseProviderMod.BaseProvider = js.native
  @JSImport("@ethersproject/providers", "getDefaultProvider")
  @js.native
  def getDefaultProvider(network: Network): typingsSlinky.ethersprojectProviders.baseProviderMod.BaseProvider = js.native
  @JSImport("@ethersproject/providers", "getDefaultProvider")
  @js.native
  def getDefaultProvider(network: Network, options: js.Any): typingsSlinky.ethersprojectProviders.baseProviderMod.BaseProvider = js.native
  
  @JSImport("@ethersproject/providers", "getNetwork")
  @js.native
  def getNetwork(network: Networkish): Network = js.native
  
  @JSImport("@ethersproject/providers", "isCommunityResourcable")
  @js.native
  def isCommunityResourcable(value: js.Any): /* is @ethersproject/providers.@ethersproject/providers/lib/formatter.CommunityResourcable */ Boolean = js.native
  
  @JSImport("@ethersproject/providers", "isCommunityResource")
  @js.native
  def isCommunityResource(value: js.Any): Boolean = js.native
  
  @JSImport("@ethersproject/providers", "showThrottleMessage")
  @js.native
  def showThrottleMessage(): Unit = js.native
}
