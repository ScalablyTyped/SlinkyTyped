package typingsSlinky.ethers.mod

import typingsSlinky.ethersprojectNetworks.typesMod.Network
import typingsSlinky.ethersprojectProviders.baseProviderMod.BaseProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers", "getDefaultProvider")
@js.native
object getDefaultProvider extends js.Object {
  
  def apply(): BaseProvider = js.native
  def apply(network: js.UndefOr[scala.Nothing], options: js.Any): BaseProvider = js.native
  def apply(network: String): BaseProvider = js.native
  def apply(network: String, options: js.Any): BaseProvider = js.native
  def apply(network: Network): BaseProvider = js.native
  def apply(network: Network, options: js.Any): BaseProvider = js.native
}
