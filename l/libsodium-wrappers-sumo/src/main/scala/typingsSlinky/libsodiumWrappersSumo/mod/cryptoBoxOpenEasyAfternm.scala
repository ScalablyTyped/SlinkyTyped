package typingsSlinky.libsodiumWrappersSumo.mod

import typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
import typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libsodium-wrappers-sumo", "crypto_box_open_easy_afternm")
@js.native
object cryptoBoxOpenEasyAfternm extends js.Object {
  
  def apply(ciphertext: String, nonce: js.typedarray.Uint8Array, sharedKey: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  def apply(
    ciphertext: String,
    nonce: js.typedarray.Uint8Array,
    sharedKey: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def apply(
    ciphertext: String,
    nonce: js.typedarray.Uint8Array,
    sharedKey: js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = js.native
  def apply(
    ciphertext: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    sharedKey: js.typedarray.Uint8Array
  ): js.typedarray.Uint8Array = js.native
  def apply(
    ciphertext: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    sharedKey: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def apply(
    ciphertext: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    sharedKey: js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = js.native
}
