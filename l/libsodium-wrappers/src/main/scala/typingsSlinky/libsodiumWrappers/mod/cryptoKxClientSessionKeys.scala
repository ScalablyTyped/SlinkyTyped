package typingsSlinky.libsodiumWrappers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers", "crypto_kx_client_session_keys")
@js.native
object cryptoKxClientSessionKeys extends js.Object {
  def apply(
    clientPublicKey: scala.scalajs.js.typedarray.Uint8Array,
    clientSecretKey: scala.scalajs.js.typedarray.Uint8Array,
    serverPublicKey: scala.scalajs.js.typedarray.Uint8Array
  ): CryptoKX = js.native
  def apply(
    clientPublicKey: scala.scalajs.js.typedarray.Uint8Array,
    clientSecretKey: scala.scalajs.js.typedarray.Uint8Array,
    serverPublicKey: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoKX = js.native
  def apply(
    clientPublicKey: scala.scalajs.js.typedarray.Uint8Array,
    clientSecretKey: scala.scalajs.js.typedarray.Uint8Array,
    serverPublicKey: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): CryptoKX = js.native
}

