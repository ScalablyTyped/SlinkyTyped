package typingsSlinky.bitcoinjsLib.psbtMod

import typingsSlinky.bip174.interfacesMod.PsbtInput
import typingsSlinky.bip174.interfacesMod.TransactionInput
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PsbtInputExtended
  extends PsbtInput
     with TransactionInput
object PsbtInputExtended {
  
  @scala.inline
  def apply(hash: String | Buffer, index: Double): PsbtInputExtended = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[PsbtInputExtended]
  }
}
