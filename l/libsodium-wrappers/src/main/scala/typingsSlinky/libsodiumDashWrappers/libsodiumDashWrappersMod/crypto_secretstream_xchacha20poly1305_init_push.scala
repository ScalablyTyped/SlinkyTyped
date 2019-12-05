package typingsSlinky.libsodiumDashWrappers.libsodiumDashWrappersMod

import typingsSlinky.libsodiumDashWrappers.Anon_Header
import typingsSlinky.libsodiumDashWrappers.Anon_HeaderState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers", "crypto_secretstream_xchacha20poly1305_init_push")
@js.native
object crypto_secretstream_xchacha20poly1305_init_push extends js.Object {
  def apply(key: scala.scalajs.js.typedarray.Uint8Array): Anon_Header = js.native
  def apply(key: scala.scalajs.js.typedarray.Uint8Array, outputFormat: StringOutputFormat): Anon_HeaderState = js.native
  def apply(key: scala.scalajs.js.typedarray.Uint8Array, outputFormat: Uint8ArrayOutputFormat): Anon_Header = js.native
}

