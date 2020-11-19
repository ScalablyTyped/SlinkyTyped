package typingsSlinky.libsodiumWrappers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libsodium-wrappers", "crypto_hash")
@js.native
object cryptoHash extends js.Object {
  
  def apply(message: String): js.typedarray.Uint8Array = js.native
  def apply(message: String, outputFormat: StringOutputFormat): String = js.native
  def apply(message: String, outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = js.native
  def apply(message: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  def apply(message: js.typedarray.Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def apply(message: js.typedarray.Uint8Array, outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = js.native
}
