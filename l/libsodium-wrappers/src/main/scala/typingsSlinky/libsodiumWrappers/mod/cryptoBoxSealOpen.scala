package typingsSlinky.libsodiumWrappers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libsodium-wrappers", "crypto_box_seal_open")
@js.native
object cryptoBoxSealOpen extends js.Object {
  
  def apply(ciphertext: String, publicKey: js.typedarray.Uint8Array, privateKey: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  def apply(
    ciphertext: String,
    publicKey: js.typedarray.Uint8Array,
    privateKey: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def apply(
    ciphertext: String,
    publicKey: js.typedarray.Uint8Array,
    privateKey: js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = js.native
  def apply(
    ciphertext: js.typedarray.Uint8Array,
    publicKey: js.typedarray.Uint8Array,
    privateKey: js.typedarray.Uint8Array
  ): js.typedarray.Uint8Array = js.native
  def apply(
    ciphertext: js.typedarray.Uint8Array,
    publicKey: js.typedarray.Uint8Array,
    privateKey: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def apply(
    ciphertext: js.typedarray.Uint8Array,
    publicKey: js.typedarray.Uint8Array,
    privateKey: js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = js.native
}
