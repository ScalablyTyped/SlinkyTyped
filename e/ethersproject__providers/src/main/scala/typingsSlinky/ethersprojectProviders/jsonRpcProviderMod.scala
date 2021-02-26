package typingsSlinky.ethersprojectProviders

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.ethersprojectAbstractProvider.mod.TransactionRequest
import typingsSlinky.ethersprojectAbstractProvider.mod.TransactionResponse
import typingsSlinky.ethersprojectAbstractSigner.mod.Signer
import typingsSlinky.ethersprojectAbstractSigner.mod.TypedDataSigner
import typingsSlinky.ethersprojectNetworks.typesMod.Networkish
import typingsSlinky.ethersprojectProviders.anon.DeferrableTransactionRequ
import typingsSlinky.ethersprojectProviders.baseProviderMod.BaseProvider
import typingsSlinky.ethersprojectWeb.mod.ConnectionInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsonRpcProviderMod {
  
  @JSImport("@ethersproject/providers/lib/json-rpc-provider", "JsonRpcProvider")
  @js.native
  class JsonRpcProvider () extends BaseProvider {
    def this(url: String) = this()
    def this(url: ConnectionInfo) = this()
    def this(url: js.UndefOr[scala.Nothing], network: Networkish) = this()
    def this(url: String, network: Networkish) = this()
    def this(url: ConnectionInfo, network: Networkish) = this()
    
    var _nextId: Double = js.native
    
    var _pendingFilter: js.Promise[Double] = js.native
    
    def _startPending(): Unit = js.native
    
    val connection: ConnectionInfo = js.native
    
    def getSigner(): JsonRpcSigner = js.native
    def getSigner(addressOrIndex: String): JsonRpcSigner = js.native
    def getSigner(addressOrIndex: Double): JsonRpcSigner = js.native
    
    def getUncheckedSigner(): UncheckedJsonRpcSigner = js.native
    def getUncheckedSigner(addressOrIndex: String): UncheckedJsonRpcSigner = js.native
    def getUncheckedSigner(addressOrIndex: Double): UncheckedJsonRpcSigner = js.native
    
    def listAccounts(): js.Promise[js.Array[String]] = js.native
    
    def prepareRequest(method: String, params: js.Any): js.Tuple2[String, js.Array[_]] = js.native
    
    def send(method: String, params: js.Array[_]): js.Promise[_] = js.native
  }
  /* static members */
  object JsonRpcProvider {
    
    @JSImport("@ethersproject/providers/lib/json-rpc-provider", "JsonRpcProvider.defaultUrl")
    @js.native
    def defaultUrl(): String = js.native
    
    @JSImport("@ethersproject/providers/lib/json-rpc-provider", "JsonRpcProvider.hexlifyTransaction")
    @js.native
    def hexlifyTransaction(transaction: TransactionRequest): StringDictionary[String] = js.native
    @JSImport("@ethersproject/providers/lib/json-rpc-provider", "JsonRpcProvider.hexlifyTransaction")
    @js.native
    def hexlifyTransaction(transaction: TransactionRequest, allowExtra: StringDictionary[Boolean]): StringDictionary[String] = js.native
  }
  
  @JSImport("@ethersproject/providers/lib/json-rpc-provider", "JsonRpcSigner")
  @js.native
  class JsonRpcSigner protected ()
    extends Signer
       with TypedDataSigner {
    def this(constructorGuard: js.Any, provider: JsonRpcProvider) = this()
    def this(constructorGuard: js.Any, provider: JsonRpcProvider, addressOrIndex: String) = this()
    def this(constructorGuard: js.Any, provider: JsonRpcProvider, addressOrIndex: Double) = this()
    
    var _address: String = js.native
    
    var _index: Double = js.native
    
    def connectUnchecked(): JsonRpcSigner = js.native
    
    @JSName("provider")
    val provider_JsonRpcSigner: JsonRpcProvider = js.native
    
    def sendTransaction(transaction: DeferrableTransactionRequ): js.Promise[TransactionResponse] = js.native
    
    def sendUncheckedTransaction(transaction: DeferrableTransactionRequ): js.Promise[String] = js.native
    
    def signTransaction(transaction: DeferrableTransactionRequ): js.Promise[String] = js.native
    
    def unlock(password: String): js.Promise[Boolean] = js.native
  }
  
  @js.native
  trait UncheckedJsonRpcSigner extends JsonRpcSigner
}
