package typingsSlinky.bip174

import typingsSlinky.bip174.parserMod.PsbtAttributes
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bip174/src/lib/parser/toBuffer", JSImport.Namespace)
@js.native
object toBufferMod extends js.Object {
  def psbtToBuffer(hasGlobalMapInputsOutputs: PsbtAttributes): Buffer = js.native
  def psbtToKeyVals(hasGlobalMapInputsOutputs: PsbtAttributes): AnonGlobalKeyVals = js.native
}

