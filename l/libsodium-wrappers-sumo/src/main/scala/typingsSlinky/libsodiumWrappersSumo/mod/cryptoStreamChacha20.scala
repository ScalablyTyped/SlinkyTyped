package typingsSlinky.libsodiumWrappersSumo.mod

import typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
import typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libsodium-wrappers-sumo", "crypto_stream_chacha20")
@js.native
object cryptoStreamChacha20 extends js.Object {
  
  def apply(outLength: Double, key: js.typedarray.Uint8Array, nonce: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  def apply(
    outLength: Double,
    key: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def apply(
    outLength: Double,
    key: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = js.native
}
