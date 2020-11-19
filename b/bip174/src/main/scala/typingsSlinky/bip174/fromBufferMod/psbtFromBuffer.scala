package typingsSlinky.bip174.fromBufferMod

import typingsSlinky.bip174.interfacesMod.TransactionFromBuffer
import typingsSlinky.bip174.parserMod.PsbtAttributes
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bip174/src/lib/parser/fromBuffer", "psbtFromBuffer")
@js.native
object psbtFromBuffer extends js.Object {
  
  def apply(buffer: Buffer, txGetter: TransactionFromBuffer): PsbtAttributes = js.native
}
