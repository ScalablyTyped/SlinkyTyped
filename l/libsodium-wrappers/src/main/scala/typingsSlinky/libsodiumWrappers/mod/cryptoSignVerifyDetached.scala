package typingsSlinky.libsodiumWrappers.mod

import typingsSlinky.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers", "crypto_sign_verify_detached")
@js.native
object cryptoSignVerifyDetached extends js.Object {
  def apply(
    signature: scala.scalajs.js.typedarray.Uint8Array,
    message: String,
    publicKey: scala.scalajs.js.typedarray.Uint8Array
  ): Boolean = js.native
  def apply(
    signature: scala.scalajs.js.typedarray.Uint8Array,
    message: Uint8Array,
    publicKey: scala.scalajs.js.typedarray.Uint8Array
  ): Boolean = js.native
}

