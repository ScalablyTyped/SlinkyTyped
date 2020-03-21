package typingsSlinky.libsodiumWrappers.mod

import typingsSlinky.libsodiumWrappers.AnonHeader
import typingsSlinky.libsodiumWrappers.AnonState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers", "crypto_secretstream_xchacha20poly1305_init_push")
@js.native
object cryptoSecretstreamXchacha20poly1305InitPush extends js.Object {
  def apply(key: scala.scalajs.js.typedarray.Uint8Array): AnonHeader = js.native
  def apply(key: scala.scalajs.js.typedarray.Uint8Array, outputFormat: StringOutputFormat): AnonState = js.native
  def apply(key: scala.scalajs.js.typedarray.Uint8Array, outputFormat: Uint8ArrayOutputFormat): AnonHeader = js.native
}

