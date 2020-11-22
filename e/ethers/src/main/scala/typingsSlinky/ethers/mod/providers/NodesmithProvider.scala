package typingsSlinky.ethers.mod.providers

import typingsSlinky.ethersprojectNetworks.typesMod.Network
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers", "providers.NodesmithProvider")
@js.native
class NodesmithProvider ()
  extends typingsSlinky.ethersprojectProviders.mod.NodesmithProvider
/* static members */
@JSImport("ethers", "providers.NodesmithProvider")
@js.native
object NodesmithProvider extends js.Object {
  
  def getApiKey(apiKey: js.Any): js.Any = js.native
  
  def getUrl(network: Network): String = js.native
  def getUrl(network: Network, apiKey: js.Any): String = js.native
}
