package typingsSlinky.bip174

import typingsSlinky.bip174.bip174Strings.`{ masterFingerprint: Buffer; extendedPubkey: Buffer; path: string; }`
import typingsSlinky.bip174.srcLibInterfacesMod.GlobalXpub
import typingsSlinky.bip174.srcLibInterfacesMod.KeyValue
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bip174/src/lib/converter/global/globalXpub", JSImport.Namespace)
@js.native
object srcLibConverterGlobalGlobalXpubMod extends js.Object {
  val expected: `{ masterFingerprint: Buffer; extendedPubkey: Buffer; path: string; }` = js.native
  def canAddToArray(array: js.Array[GlobalXpub], item: GlobalXpub, dupeSet: Set[String]): Boolean = js.native
  def check(data: js.Any): /* is bip174.bip174/src/lib/interfaces.GlobalXpub */ Boolean = js.native
  def decode(keyVal: KeyValue): GlobalXpub = js.native
  def encode(data: GlobalXpub): KeyValue = js.native
}

