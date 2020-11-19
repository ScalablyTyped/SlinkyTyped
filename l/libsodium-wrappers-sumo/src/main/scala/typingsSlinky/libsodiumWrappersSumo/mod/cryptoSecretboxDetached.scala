package typingsSlinky.libsodiumWrappersSumo.mod

import typingsSlinky.libsodiumWrappers.mod.SecretBox
import typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
import typingsSlinky.libsodiumWrappers.mod.StringSecretBox
import typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libsodium-wrappers-sumo", "crypto_secretbox_detached")
@js.native
object cryptoSecretboxDetached extends js.Object {
  
  def apply(message: String, nonce: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): SecretBox = js.native
  def apply(
    message: String,
    nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringSecretBox = js.native
  def apply(
    message: String,
    nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): SecretBox = js.native
  def apply(message: js.typedarray.Uint8Array, nonce: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): SecretBox = js.native
  def apply(
    message: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringSecretBox = js.native
  def apply(
    message: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): SecretBox = js.native
}
