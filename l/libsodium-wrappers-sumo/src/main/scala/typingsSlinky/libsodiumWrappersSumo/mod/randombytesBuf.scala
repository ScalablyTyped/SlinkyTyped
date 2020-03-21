package typingsSlinky.libsodiumWrappersSumo.mod

import typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
import typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers-sumo", "randombytes_buf")
@js.native
object randombytesBuf extends js.Object {
  def apply(length: Double): scala.scalajs.js.typedarray.Uint8Array = js.native
  def apply(length: Double, outputFormat: StringOutputFormat): String = js.native
  def apply(length: Double, outputFormat: Uint8ArrayOutputFormat): scala.scalajs.js.typedarray.Uint8Array = js.native
}

