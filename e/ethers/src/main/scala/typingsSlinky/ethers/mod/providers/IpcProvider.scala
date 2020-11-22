package typingsSlinky.ethers.mod.providers

import typingsSlinky.ethersprojectNetworks.typesMod.Networkish
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers", "providers.IpcProvider")
@js.native
class IpcProvider protected ()
  extends typingsSlinky.ethersprojectProviders.mod.IpcProvider {
  def this(path: String) = this()
  def this(path: String, network: Networkish) = this()
}
