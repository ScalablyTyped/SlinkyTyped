package typingsSlinky.libsodiumWrappersSumo.mod

import typingsSlinky.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers-sumo", "crypto_onetimeauth_verify")
@js.native
object cryptoOnetimeauthVerify extends js.Object {
  def apply(
    hash: scala.scalajs.js.typedarray.Uint8Array,
    message: String,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): Boolean = js.native
  def apply(
    hash: scala.scalajs.js.typedarray.Uint8Array,
    message: Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): Boolean = js.native
}

