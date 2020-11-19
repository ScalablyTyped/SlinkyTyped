package typingsSlinky.libsodiumWrappersSumo.mod

import typingsSlinky.libsodiumWrappers.mod.KeyPair
import typingsSlinky.libsodiumWrappers.mod.StringKeyPair
import typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
import typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libsodium-wrappers-sumo", "crypto_box_curve25519xchacha20poly1305_keypair")
@js.native
object cryptoBoxCurve25519xchacha20poly1305Keypair extends js.Object {
  
  def apply(publicKey: js.typedarray.Uint8Array, secretKey: js.typedarray.Uint8Array): KeyPair = js.native
  def apply(
    publicKey: js.typedarray.Uint8Array,
    secretKey: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringKeyPair = js.native
  def apply(
    publicKey: js.typedarray.Uint8Array,
    secretKey: js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): KeyPair = js.native
}
