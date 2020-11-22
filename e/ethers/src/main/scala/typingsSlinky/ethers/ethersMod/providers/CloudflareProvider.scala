package typingsSlinky.ethers.ethersMod.providers

import typingsSlinky.ethersprojectNetworks.typesMod.Network
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers/lib/ethers", "providers.CloudflareProvider")
@js.native
class CloudflareProvider ()
  extends typingsSlinky.ethersprojectProviders.mod.CloudflareProvider
/* static members */
@JSImport("ethers/lib/ethers", "providers.CloudflareProvider")
@js.native
object CloudflareProvider extends js.Object {
  
  def getApiKey(apiKey: js.Any): js.Any = js.native
  
  def getUrl(network: Network): String = js.native
  def getUrl(network: Network, apiKey: js.Any): String = js.native
}
