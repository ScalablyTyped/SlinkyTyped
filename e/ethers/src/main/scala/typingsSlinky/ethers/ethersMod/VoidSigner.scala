package typingsSlinky.ethers.ethersMod

import typingsSlinky.ethersprojectAbstractProvider.mod.Provider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers/lib/ethers", "VoidSigner")
@js.native
class VoidSigner protected ()
  extends typingsSlinky.ethersprojectAbstractSigner.mod.VoidSigner {
  def this(address: String) = this()
  def this(address: String, provider: Provider) = this()
}
