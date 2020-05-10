package typingsSlinky.libsodiumWrappers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers", "crypto_sign_ed25519_sk_to_curve25519")
@js.native
object cryptoSignEd25519SkToCurve25519 extends js.Object {
  def apply(edSk: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  def apply(edSk: js.typedarray.Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def apply(edSk: js.typedarray.Uint8Array, outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = js.native
}

