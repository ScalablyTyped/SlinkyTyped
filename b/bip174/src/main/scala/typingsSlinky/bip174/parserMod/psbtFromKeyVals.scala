package typingsSlinky.bip174.parserMod

import typingsSlinky.bip174.fromBufferMod.PsbtFromKeyValsArg
import typingsSlinky.bip174.interfacesMod.Transaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bip174/src/lib/parser", "psbtFromKeyVals")
@js.native
object psbtFromKeyVals extends js.Object {
  def apply(unsignedTx: Transaction, hasGlobalMapKeyValsInputKeyValsOutputKeyVals: PsbtFromKeyValsArg): PsbtAttributes = js.native
}

