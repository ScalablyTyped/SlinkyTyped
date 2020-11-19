package typingsSlinky.libsodiumWrappersSumo.mod

import typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
import typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libsodium-wrappers-sumo", "crypto_sign_ed25519_sk_to_curve25519")
@js.native
object cryptoSignEd25519SkToCurve25519 extends js.Object {
  
  def apply(edSk: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  def apply(edSk: js.typedarray.Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def apply(edSk: js.typedarray.Uint8Array, outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = js.native
}
