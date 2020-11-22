package typingsSlinky.ethersprojectJsonWallets.crowdsaleMod

import typingsSlinky.ethersprojectAbstractSigner.mod.ExternallyOwnedAccount
import typingsSlinky.ethersprojectBytes.mod.Bytes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ethersproject/json-wallets/lib/crowdsale", "decrypt")
@js.native
object decrypt extends js.Object {
  
  def apply(json: String, password: String): ExternallyOwnedAccount = js.native
  def apply(json: String, password: Bytes): ExternallyOwnedAccount = js.native
}
