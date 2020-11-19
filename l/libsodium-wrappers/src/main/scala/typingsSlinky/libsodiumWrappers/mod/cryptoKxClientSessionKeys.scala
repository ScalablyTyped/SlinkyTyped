package typingsSlinky.libsodiumWrappers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libsodium-wrappers", "crypto_kx_client_session_keys")
@js.native
object cryptoKxClientSessionKeys extends js.Object {
  
  def apply(
    clientPublicKey: js.typedarray.Uint8Array,
    clientSecretKey: js.typedarray.Uint8Array,
    serverPublicKey: js.typedarray.Uint8Array
  ): CryptoKX = js.native
  def apply(
    clientPublicKey: js.typedarray.Uint8Array,
    clientSecretKey: js.typedarray.Uint8Array,
    serverPublicKey: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoKX = js.native
  def apply(
    clientPublicKey: js.typedarray.Uint8Array,
    clientSecretKey: js.typedarray.Uint8Array,
    serverPublicKey: js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): CryptoKX = js.native
}
