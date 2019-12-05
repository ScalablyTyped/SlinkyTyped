package typingsSlinky.bitcoinjsDashLib.typesAddressMod

import typingsSlinky.bitcoinjsDashLib.typesNetworksMod.Network
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bitcoinjs-lib/types/address", "toOutputScript")
@js.native
object toOutputScript extends js.Object {
  def apply(address: String): Buffer = js.native
  def apply(address: String, network: Network): Buffer = js.native
}

