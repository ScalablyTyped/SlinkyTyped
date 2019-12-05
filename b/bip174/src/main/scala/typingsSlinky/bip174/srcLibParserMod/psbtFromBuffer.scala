package typingsSlinky.bip174.srcLibParserMod

import typingsSlinky.bip174.srcLibInterfacesMod.TransactionFromBuffer
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bip174/src/lib/parser", "psbtFromBuffer")
@js.native
object psbtFromBuffer extends js.Object {
  def apply(buffer: Buffer, txGetter: TransactionFromBuffer): PsbtAttributes = js.native
}

