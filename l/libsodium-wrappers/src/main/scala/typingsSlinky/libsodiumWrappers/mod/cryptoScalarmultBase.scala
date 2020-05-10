package typingsSlinky.libsodiumWrappers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers", "crypto_scalarmult_base")
@js.native
object cryptoScalarmultBase extends js.Object {
  def apply(privateKey: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  def apply(privateKey: js.typedarray.Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def apply(privateKey: js.typedarray.Uint8Array, outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = js.native
}

