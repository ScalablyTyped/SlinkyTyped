package typingsSlinky.bip174

import typingsSlinky.bip174.bip174Strings.`{ pubkey: Buffer; signature: Buffer; }`
import typingsSlinky.bip174.srcLibInterfacesMod.KeyValue
import typingsSlinky.bip174.srcLibInterfacesMod.PartialSig
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bip174/src/lib/converter/input/partialSig", JSImport.Namespace)
@js.native
object srcLibConverterInputPartialSigMod extends js.Object {
  val expected: `{ pubkey: Buffer; signature: Buffer; }` = js.native
  def canAddToArray(array: js.Array[PartialSig], item: PartialSig, dupeSet: Set[String]): Boolean = js.native
  def check(data: js.Any): /* is bip174.bip174/src/lib/interfaces.PartialSig */ Boolean = js.native
  def decode(keyVal: KeyValue): PartialSig = js.native
  def encode(pSig: PartialSig): KeyValue = js.native
}

