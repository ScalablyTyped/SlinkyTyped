package typingsSlinky.libsodiumWrappers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers", "crypto_sign_ed25519_pk_to_curve25519")
@js.native
object cryptoSignEd25519PkToCurve25519 extends js.Object {
  def apply(edPk: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  def apply(edPk: js.typedarray.Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def apply(edPk: js.typedarray.Uint8Array, outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = js.native
}

