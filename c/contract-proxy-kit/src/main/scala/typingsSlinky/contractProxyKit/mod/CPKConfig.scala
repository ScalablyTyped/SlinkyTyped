package typingsSlinky.contractProxyKit.mod

import typingsSlinky.contractProxyKit.anon.Typeofethers
import typingsSlinky.ethers.mod.ethers.Signer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.contractProxyKit.mod.Web3SpecificConfig
  - typingsSlinky.contractProxyKit.mod.EthersSpecificConfig
*/
trait CPKConfig extends js.Object
object CPKConfig {
  
  @scala.inline
  def Web3SpecificConfig(web3: js.Object): CPKConfig = {
    val __obj = js.Dynamic.literal(web3 = web3.asInstanceOf[js.Any])
    __obj.asInstanceOf[CPKConfig]
  }
  
  @scala.inline
  def EthersSpecificConfig(ethers: Typeofethers, signer: Signer): CPKConfig = {
    val __obj = js.Dynamic.literal(ethers = ethers.asInstanceOf[js.Any], signer = signer.asInstanceOf[js.Any])
    __obj.asInstanceOf[CPKConfig]
  }
}
