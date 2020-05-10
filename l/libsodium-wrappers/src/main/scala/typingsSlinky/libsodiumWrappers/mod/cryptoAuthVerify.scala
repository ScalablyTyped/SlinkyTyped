package typingsSlinky.libsodiumWrappers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers", "crypto_auth_verify")
@js.native
object cryptoAuthVerify extends js.Object {
  def apply(tag: js.typedarray.Uint8Array, message: String, key: js.typedarray.Uint8Array): Boolean = js.native
  def apply(tag: js.typedarray.Uint8Array, message: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): Boolean = js.native
}

