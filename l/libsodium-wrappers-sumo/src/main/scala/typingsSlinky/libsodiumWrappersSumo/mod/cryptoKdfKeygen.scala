package typingsSlinky.libsodiumWrappersSumo.mod

import typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
import typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers-sumo", "crypto_kdf_keygen")
@js.native
object cryptoKdfKeygen extends js.Object {
  def apply(): scala.scalajs.js.typedarray.Uint8Array = js.native
  def apply(outputFormat: StringOutputFormat): String = js.native
  def apply(outputFormat: Uint8ArrayOutputFormat): scala.scalajs.js.typedarray.Uint8Array = js.native
}

