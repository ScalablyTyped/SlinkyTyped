package typingsSlinky.libsodiumWrappersSumo.mod

import typingsSlinky.libsodiumWrappers.anon.Header
import typingsSlinky.libsodiumWrappers.anon.State
import typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
import typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libsodium-wrappers-sumo", "crypto_secretstream_xchacha20poly1305_init_push")
@js.native
object cryptoSecretstreamXchacha20poly1305InitPush extends js.Object {
  
  def apply(key: js.typedarray.Uint8Array): Header = js.native
  def apply(key: js.typedarray.Uint8Array, outputFormat: StringOutputFormat): State = js.native
  def apply(key: js.typedarray.Uint8Array, outputFormat: Uint8ArrayOutputFormat): Header = js.native
}
