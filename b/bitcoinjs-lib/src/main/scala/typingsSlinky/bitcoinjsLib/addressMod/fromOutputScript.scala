package typingsSlinky.bitcoinjsLib.addressMod

import typingsSlinky.bitcoinjsLib.networksMod.Network
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bitcoinjs-lib/types/address", "fromOutputScript")
@js.native
object fromOutputScript extends js.Object {
  
  def apply(output: Buffer): String = js.native
  def apply(output: Buffer, network: Network): String = js.native
}
