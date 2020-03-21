package typingsSlinky.libsodiumWrappersSumo.mod

import typingsSlinky.libsodiumWrappers.mod.CryptoKX
import typingsSlinky.libsodiumWrappers.mod.StringCryptoKX
import typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
import typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers-sumo", "crypto_kx_client_session_keys")
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

