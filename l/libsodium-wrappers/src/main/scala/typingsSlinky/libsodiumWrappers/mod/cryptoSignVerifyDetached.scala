package typingsSlinky.libsodiumWrappers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libsodium-wrappers", "crypto_sign_verify_detached")
@js.native
object cryptoSignVerifyDetached extends js.Object {
  
  def apply(signature: js.typedarray.Uint8Array, message: String, publicKey: js.typedarray.Uint8Array): Boolean = js.native
  def apply(
    signature: js.typedarray.Uint8Array,
    message: js.typedarray.Uint8Array,
    publicKey: js.typedarray.Uint8Array
  ): Boolean = js.native
}
