package typingsSlinky.bitcoinjsLib.addressMod

import typingsSlinky.bitcoinjsLib.networksMod.Network
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bitcoinjs-lib/types/address", "toOutputScript")
@js.native
object toOutputScript extends js.Object {
  
  def apply(address: String): Buffer = js.native
  def apply(address: String, network: Network): Buffer = js.native
}
