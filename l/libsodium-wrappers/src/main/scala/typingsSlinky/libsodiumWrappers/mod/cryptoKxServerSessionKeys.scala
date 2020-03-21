package typingsSlinky.libsodiumWrappers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers", "crypto_kx_server_session_keys")
@js.native
object cryptoKxServerSessionKeys extends js.Object {
  def apply(
    serverPublicKey: scala.scalajs.js.typedarray.Uint8Array,
    serverSecretKey: scala.scalajs.js.typedarray.Uint8Array,
    clientPublicKey: scala.scalajs.js.typedarray.Uint8Array
  ): CryptoKX = js.native
  def apply(
    serverPublicKey: scala.scalajs.js.typedarray.Uint8Array,
    serverSecretKey: scala.scalajs.js.typedarray.Uint8Array,
    clientPublicKey: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoKX = js.native
  def apply(
    serverPublicKey: scala.scalajs.js.typedarray.Uint8Array,
    serverSecretKey: scala.scalajs.js.typedarray.Uint8Array,
    clientPublicKey: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): CryptoKX = js.native
}

