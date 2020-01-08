package typingsSlinky.node.utilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("util", "TextEncoder")
@js.native
class TextEncoder () extends js.Object {
  val encoding: String = js.native
  def encode(): scala.scalajs.js.typedarray.Uint8Array = js.native
  def encode(input: String): scala.scalajs.js.typedarray.Uint8Array = js.native
  def encodeInto(input: String, output: scala.scalajs.js.typedarray.Uint8Array): EncodeIntoResult = js.native
}

