package typingsSlinky.ethersprojectProviders

import typingsSlinky.ethersprojectAbstractProvider.mod.BlockTag
import typingsSlinky.ethersprojectAbstractProvider.mod.TransactionResponse
import typingsSlinky.ethersprojectNetworks.typesMod.Networkish
import typingsSlinky.ethersprojectProviders.baseProviderMod.BaseProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object etherscanProviderMod {
  
  @JSImport("@ethersproject/providers/lib/etherscan-provider", "EtherscanProvider")
  @js.native
  class EtherscanProvider () extends BaseProvider {
    def this(network: Networkish) = this()
    def this(network: js.UndefOr[Networkish], apiKey: String) = this()
    
    val apiKey: String = js.native
    
    val baseUrl: String = js.native
    
    def getHistory(addressOrName: String): js.Promise[js.Array[TransactionResponse]] = js.native
    def getHistory(addressOrName: String, startBlock: js.UndefOr[BlockTag], endBlock: BlockTag): js.Promise[js.Array[TransactionResponse]] = js.native
    def getHistory(addressOrName: String, startBlock: BlockTag): js.Promise[js.Array[TransactionResponse]] = js.native
    def getHistory(addressOrName: js.Promise[String]): js.Promise[js.Array[TransactionResponse]] = js.native
    def getHistory(addressOrName: js.Promise[String], startBlock: js.UndefOr[BlockTag], endBlock: BlockTag): js.Promise[js.Array[TransactionResponse]] = js.native
    def getHistory(addressOrName: js.Promise[String], startBlock: BlockTag): js.Promise[js.Array[TransactionResponse]] = js.native
    
    def isCommunityResource(): Boolean = js.native
  }
}
