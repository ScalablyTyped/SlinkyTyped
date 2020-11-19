package typingsSlinky.libsodiumWrappers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libsodium-wrappers", "crypto_box_easy_afternm")
@js.native
object cryptoBoxEasyAfternm extends js.Object {
  
  def apply(message: String, nonce: js.typedarray.Uint8Array, sharedKey: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  def apply(
    message: String,
    nonce: js.typedarray.Uint8Array,
    sharedKey: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def apply(
    message: String,
    nonce: js.typedarray.Uint8Array,
    sharedKey: js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = js.native
  def apply(
    message: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    sharedKey: js.typedarray.Uint8Array
  ): js.typedarray.Uint8Array = js.native
  def apply(
    message: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    sharedKey: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def apply(
    message: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    sharedKey: js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = js.native
}
