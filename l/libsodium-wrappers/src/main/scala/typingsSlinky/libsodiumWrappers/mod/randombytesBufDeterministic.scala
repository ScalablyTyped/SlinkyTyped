package typingsSlinky.libsodiumWrappers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers", "randombytes_buf_deterministic")
@js.native
object randombytesBufDeterministic extends js.Object {
  def apply(length: Double, seed: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  def apply(length: Double, seed: js.typedarray.Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def apply(length: Double, seed: js.typedarray.Uint8Array, outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = js.native
}

