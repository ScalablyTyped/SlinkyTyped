package typingsSlinky.cryptoHash.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("crypto-hash", "sha256")
@js.native
object sha256 extends js.Object {
  def apply(input: String): js.Promise[String] = js.native
  def apply(input: String, options: OptionBufferOutput): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def apply(input: String, options: OptionsHexOutput): js.Promise[String] = js.native
  def apply(input: js.typedarray.ArrayBuffer): js.Promise[String] = js.native
  def apply(input: js.typedarray.ArrayBufferView): js.Promise[String] = js.native
  def apply(input: js.typedarray.ArrayBufferView, options: OptionBufferOutput): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def apply(input: js.typedarray.ArrayBufferView, options: OptionsHexOutput): js.Promise[String] = js.native
  def apply(input: js.typedarray.ArrayBuffer, options: OptionBufferOutput): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def apply(input: js.typedarray.ArrayBuffer, options: OptionsHexOutput): js.Promise[String] = js.native
}

