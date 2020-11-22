package typingsSlinky.ethersprojectProviders.mod

import typingsSlinky.ethersprojectNetworks.typesMod.Networkish
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ethersproject/providers", "EtherscanProvider")
@js.native
class EtherscanProvider ()
  extends typingsSlinky.ethersprojectProviders.etherscanProviderMod.EtherscanProvider {
  def this(network: Networkish) = this()
  def this(network: js.UndefOr[Networkish], apiKey: String) = this()
}
