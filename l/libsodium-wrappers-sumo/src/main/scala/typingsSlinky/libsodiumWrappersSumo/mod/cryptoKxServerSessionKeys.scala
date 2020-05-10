package typingsSlinky.libsodiumWrappersSumo.mod

import typingsSlinky.libsodiumWrappers.mod.CryptoKX
import typingsSlinky.libsodiumWrappers.mod.StringCryptoKX
import typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
import typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers-sumo", "crypto_kx_server_session_keys")
@js.native
object cryptoKxServerSessionKeys extends js.Object {
  def apply(
    serverPublicKey: js.typedarray.Uint8Array,
    serverSecretKey: js.typedarray.Uint8Array,
    clientPublicKey: js.typedarray.Uint8Array
  ): CryptoKX = js.native
  def apply(
    serverPublicKey: js.typedarray.Uint8Array,
    serverSecretKey: js.typedarray.Uint8Array,
    clientPublicKey: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoKX = js.native
  def apply(
    serverPublicKey: js.typedarray.Uint8Array,
    serverSecretKey: js.typedarray.Uint8Array,
    clientPublicKey: js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): CryptoKX = js.native
}

