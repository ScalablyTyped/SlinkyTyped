package typingsSlinky.ethers

import typingsSlinky.ethers.jsonRpcProviderMod.JsonRpcProvider
import typingsSlinky.ethers.typesMod.Networkish
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethers/dist/types/providers/infura-provider", JSImport.Namespace)
@js.native
object infuraProviderMod extends js.Object {
  @js.native
  class InfuraProvider () extends JsonRpcProvider {
    def this(network: Networkish) = this()
    def this(network: Networkish, apiAccessToken: String) = this()
    val apiAccessToken: String = js.native
  }
  
}

