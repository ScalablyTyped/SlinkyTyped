package typingsSlinky.ethers.distTypesEthersMod

import typingsSlinky.ethers.distTypesUtilsTypesMod.AsyncProvider
import typingsSlinky.ethers.distTypesUtilsTypesMod.ConnectionInfo
import typingsSlinky.ethers.distTypesUtilsTypesMod.Network
import typingsSlinky.ethers.distTypesUtilsTypesMod.Networkish
import typingsSlinky.ethers.distTypesUtilsTypesMod.TransactionRequest
import typingsSlinky.ethers.distTypesUtilsTypesMod.TransactionResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethers/dist/types/ethers", "providers")
@js.native
object providers extends js.Object {
  @js.native
  class EtherscanProvider ()
    extends typingsSlinky.ethers.distTypesProvidersMod.EtherscanProvider {
    def this(network: Networkish) = this()
    def this(network: Networkish, apiKey: String) = this()
  }
  
  @js.native
  class FallbackProvider protected ()
    extends typingsSlinky.ethers.distTypesProvidersMod.FallbackProvider {
    def this(providers: js.Array[typingsSlinky.ethers.distTypesProvidersProviderMod.Provider]) = this()
  }
  
  @js.native
  class InfuraProvider ()
    extends typingsSlinky.ethers.distTypesProvidersMod.InfuraProvider {
    def this(network: Networkish) = this()
    def this(network: Networkish, apiAccessToken: String) = this()
  }
  
  @js.native
  class IpcProvider protected ()
    extends typingsSlinky.ethers.distTypesProvidersMod.IpcProvider {
    def this(path: String) = this()
    def this(path: String, network: Networkish) = this()
  }
  
  @js.native
  class JsonRpcProvider ()
    extends typingsSlinky.ethers.distTypesProvidersMod.JsonRpcProvider {
    def this(url: String) = this()
    def this(url: ConnectionInfo) = this()
    def this(url: String, network: Networkish) = this()
    def this(url: ConnectionInfo, network: Networkish) = this()
  }
  
  @js.native
  class JsonRpcSigner protected ()
    extends typingsSlinky.ethers.distTypesProvidersMod.JsonRpcSigner {
    def this(provider: typingsSlinky.ethers.distTypesProvidersJsonDashRpcDashProviderMod.JsonRpcProvider) = this()
    def this(
      provider: typingsSlinky.ethers.distTypesProvidersJsonDashRpcDashProviderMod.JsonRpcProvider,
      address: String
    ) = this()
  }
  
  @js.native
  class Provider protected ()
    extends typingsSlinky.ethers.distTypesProvidersMod.Provider {
    def this(network: js.Promise[Network]) = this()
    def this(network: Networkish) = this()
  }
  
  @js.native
  class Web3Provider protected ()
    extends typingsSlinky.ethers.distTypesProvidersMod.Web3Provider {
    def this(web3Provider: AsyncProvider) = this()
    def this(web3Provider: AsyncProvider, network: Networkish) = this()
  }
  
  def getDefaultProvider(): typingsSlinky.ethers.distTypesProvidersProviderMod.Provider = js.native
  def getDefaultProvider(network: String): typingsSlinky.ethers.distTypesProvidersProviderMod.Provider = js.native
  def getDefaultProvider(network: Network): typingsSlinky.ethers.distTypesProvidersProviderMod.Provider = js.native
  /* static members */
  @js.native
  object JsonRpcProvider extends js.Object {
    def hexlifyTransaction(transaction: TransactionRequest): js.Any = js.native
  }
  
  /* static members */
  @js.native
  object Provider extends js.Object {
    def checkTransactionResponse(transaction: js.Any): TransactionResponse = js.native
  }
  
}

