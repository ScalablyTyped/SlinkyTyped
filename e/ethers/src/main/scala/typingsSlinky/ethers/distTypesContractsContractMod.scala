package typingsSlinky.ethers

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.ethers.distTypesContractsContractMod.Bucket
import typingsSlinky.ethers.distTypesContractsContractMod.Contract
import typingsSlinky.ethers.distTypesContractsInterfaceMod.Interface
import typingsSlinky.ethers.distTypesUtilsTypesMod.BigNumber
import typingsSlinky.ethers.distTypesUtilsTypesMod.ContractFunction
import typingsSlinky.ethers.distTypesUtilsTypesMod.EventFilter
import typingsSlinky.ethers.distTypesUtilsTypesMod.Listener
import typingsSlinky.ethers.distTypesUtilsTypesMod.MinimalProvider
import typingsSlinky.ethers.distTypesUtilsTypesMod.ParamType
import typingsSlinky.ethers.distTypesUtilsTypesMod.Signer
import typingsSlinky.ethers.distTypesUtilsTypesMod.TransactionRequest
import typingsSlinky.ethers.distTypesUtilsTypesMod.TransactionResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethers/dist/types/contracts/contract", JSImport.Namespace)
@js.native
object distTypesContractsContractMod extends js.Object {
  @js.native
  class Contract protected ()
    extends /* name */ StringDictionary[ContractFunction | js.Any] {
    def this(addressOrName: String, contractInterface: String, signerOrProvider: MinimalProvider) = this()
    def this(addressOrName: String, contractInterface: String, signerOrProvider: Signer) = this()
    def this(
      addressOrName: String,
      contractInterface: js.Array[String | ParamType],
      signerOrProvider: MinimalProvider
    ) = this()
    def this(addressOrName: String, contractInterface: js.Array[String | ParamType], signerOrProvider: Signer) = this()
    def this(addressOrName: String, contractInterface: Interface, signerOrProvider: MinimalProvider) = this()
    def this(addressOrName: String, contractInterface: Interface, signerOrProvider: Signer) = this()
    var _addEventListener: js.Any = js.native
    var _events: js.Any = js.native
    var _getEventFilter: js.Any = js.native
    val address: String = js.native
    val addressPromise: js.Promise[String] = js.native
    val deployTransaction: TransactionResponse = js.native
    val estimate: Bucket[js.Function1[/* repeated */ _, js.Promise[BigNumber]]] = js.native
    val filters: Bucket[js.Function1[/* repeated */ _, EventFilter]] = js.native
    val functions: Bucket[ContractFunction] = js.native
    val interface: Interface = js.native
    val provider: MinimalProvider = js.native
    val signer: Signer = js.native
    def addEventLisener(eventName: String, listener: Listener): Contract = js.native
    def addEventLisener(eventName: EventFilter, listener: Listener): Contract = js.native
    def attach(addressOrName: String): Contract = js.native
    def connect(signerOrProvider: MinimalProvider): Contract = js.native
    def connect(signerOrProvider: Signer): Contract = js.native
    def deploy(bytecode: String, args: js.Any*): js.Promise[Contract] = js.native
    def deployed(): js.Promise[Contract] = js.native
    def emit(eventName: String, args: js.Any*): Boolean = js.native
    def emit(eventName: EventFilter, args: js.Any*): Boolean = js.native
    def fallback(): js.Promise[TransactionResponse] = js.native
    def fallback(overrides: TransactionRequest): js.Promise[TransactionResponse] = js.native
    def listenerCount(): Double = js.native
    def listenerCount(eventName: String): Double = js.native
    def listenerCount(eventName: EventFilter): Double = js.native
    def listeners(eventName: String): js.Array[Listener] = js.native
    def listeners(eventName: EventFilter): js.Array[Listener] = js.native
    def on(event: String, listener: Listener): Contract = js.native
    def on(event: EventFilter, listener: Listener): Contract = js.native
    def once(event: String, listener: Listener): Contract = js.native
    def once(event: EventFilter, listener: Listener): Contract = js.native
    def removeAllListeners(eventName: String): Contract = js.native
    def removeAllListeners(eventName: EventFilter): Contract = js.native
    def removeListener(eventName: js.Any, listener: Listener): Contract = js.native
  }
  
  type Bucket[T] = StringDictionary[T]
}

