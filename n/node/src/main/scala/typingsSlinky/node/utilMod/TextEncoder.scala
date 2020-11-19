package typingsSlinky.node.utilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("util", "TextEncoder")
@js.native
class TextEncoder () extends js.Object {
  
  def encode(): js.typedarray.Uint8Array = js.native
  def encode(input: String): js.typedarray.Uint8Array = js.native
  
  def encodeInto(input: String, output: js.typedarray.Uint8Array): EncodeIntoResult = js.native
  
  val encoding: String = js.native
}
