package typingsSlinky.ethers

import typingsSlinky.ethers.typesMod.AsyncProvider
import typingsSlinky.ethers.typesMod.ConnectionInfo
import typingsSlinky.ethers.typesMod.Network
import typingsSlinky.ethers.typesMod.Networkish
import typingsSlinky.ethers.typesMod.TransactionRequest
import typingsSlinky.ethers.typesMod.TransactionResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethers/dist/types/providers", JSImport.Namespace)
@js.native
object providersMod extends js.Object {
  @js.native
  class EtherscanProvider ()
    extends typingsSlinky.ethers.etherscanProviderMod.EtherscanProvider {
    def this(network: Networkish) = this()
    def this(network: Networkish, apiKey: String) = this()
  }
  
  @js.native
  class FallbackProvider protected ()
    extends typingsSlinky.ethers.fallbackProviderMod.FallbackProvider {
    def this(providers: js.Array[typingsSlinky.ethers.providerMod.Provider]) = this()
  }
  
  @js.native
  class InfuraProvider ()
    extends typingsSlinky.ethers.infuraProviderMod.InfuraProvider {
    def this(network: Networkish) = this()
    def this(network: Networkish, apiAccessToken: String) = this()
  }
  
  @js.native
  class IpcProvider protected ()
    extends typingsSlinky.ethers.ipcProviderMod.IpcProvider {
    def this(path: String) = this()
    def this(path: String, network: Networkish) = this()
  }
  
  @js.native
  class JsonRpcProvider ()
    extends typingsSlinky.ethers.jsonRpcProviderMod.JsonRpcProvider {
    def this(url: String) = this()
    def this(url: ConnectionInfo) = this()
    def this(url: String, network: Networkish) = this()
    def this(url: ConnectionInfo, network: Networkish) = this()
  }
  
  @js.native
  class JsonRpcSigner protected ()
    extends typingsSlinky.ethers.jsonRpcProviderMod.JsonRpcSigner {
    def this(provider: typingsSlinky.ethers.jsonRpcProviderMod.JsonRpcProvider) = this()
    def this(provider: typingsSlinky.ethers.jsonRpcProviderMod.JsonRpcProvider, address: String) = this()
  }
  
  @js.native
  class Provider protected ()
    extends typingsSlinky.ethers.providerMod.Provider {
    def this(network: js.Promise[Network]) = this()
    def this(network: Networkish) = this()
  }
  
  @js.native
  class Web3Provider protected ()
    extends typingsSlinky.ethers.web3ProviderMod.Web3Provider {
    def this(web3Provider: AsyncProvider) = this()
    def this(web3Provider: AsyncProvider, network: Networkish) = this()
  }
  
  def getDefaultProvider(): typingsSlinky.ethers.providerMod.Provider = js.native
  def getDefaultProvider(network: String): typingsSlinky.ethers.providerMod.Provider = js.native
  def getDefaultProvider(network: Network): typingsSlinky.ethers.providerMod.Provider = js.native
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

