package typingsSlinky.libsodiumWrappersSumo.mod

import typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
import typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers-sumo", "crypto_sign_ed25519_sk_to_pk")
@js.native
object cryptoSignEd25519SkToPk extends js.Object {
  def apply(privateKey: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  def apply(privateKey: js.typedarray.Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def apply(privateKey: js.typedarray.Uint8Array, outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = js.native
}

