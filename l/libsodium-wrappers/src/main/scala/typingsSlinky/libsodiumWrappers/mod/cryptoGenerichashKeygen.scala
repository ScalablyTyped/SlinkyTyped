package typingsSlinky.libsodiumWrappers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers", "crypto_generichash_keygen")
@js.native
object cryptoGenerichashKeygen extends js.Object {
  def apply(): js.typedarray.Uint8Array = js.native
  def apply(outputFormat: StringOutputFormat): String = js.native
  def apply(outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = js.native
}

