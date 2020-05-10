package typingsSlinky.libsodiumWrappersSumo.mod

import typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
import typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers-sumo", "crypto_secretbox_keygen")
@js.native
object cryptoSecretboxKeygen extends js.Object {
  def apply(): js.typedarray.Uint8Array = js.native
  def apply(outputFormat: StringOutputFormat): String = js.native
  def apply(outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = js.native
}

