package typingsSlinky.ethers.mod.providers

import typingsSlinky.ethersprojectNetworks.typesMod.Network
import typingsSlinky.ethersprojectWeb.mod.ConnectionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers", "providers.PocketProvider")
@js.native
class PocketProvider ()
  extends typingsSlinky.ethersprojectProviders.mod.PocketProvider
/* static members */
@JSImport("ethers", "providers.PocketProvider")
@js.native
object PocketProvider extends js.Object {
  
  def getApiKey(apiKey: js.Any): js.Any = js.native
  
  def getUrl(network: Network, apiKey: js.Any): ConnectionInfo = js.native
}
