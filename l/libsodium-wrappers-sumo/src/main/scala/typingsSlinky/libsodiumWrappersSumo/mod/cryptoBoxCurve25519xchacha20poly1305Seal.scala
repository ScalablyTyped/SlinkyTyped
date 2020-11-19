package typingsSlinky.libsodiumWrappersSumo.mod

import typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
import typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libsodium-wrappers-sumo", "crypto_box_curve25519xchacha20poly1305_seal")
@js.native
object cryptoBoxCurve25519xchacha20poly1305Seal extends js.Object {
  
  def apply(message: js.typedarray.Uint8Array, publicKey: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  def apply(
    message: js.typedarray.Uint8Array,
    publicKey: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def apply(
    message: js.typedarray.Uint8Array,
    publicKey: js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = js.native
}
