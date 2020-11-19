package typingsSlinky.libsodiumWrappersSumo.mod

import typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
import typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libsodium-wrappers-sumo", "crypto_core_ristretto255_sub")
@js.native
object cryptoCoreRistretto255Sub extends js.Object {
  
  def apply(p: js.typedarray.Uint8Array, q: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  def apply(p: js.typedarray.Uint8Array, q: js.typedarray.Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def apply(p: js.typedarray.Uint8Array, q: js.typedarray.Uint8Array, outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = js.native
}
