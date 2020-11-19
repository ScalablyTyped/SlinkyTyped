package typingsSlinky.libsodiumWrappers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libsodium-wrappers", "crypto_pwhash")
@js.native
object cryptoPwhash extends js.Object {
  
  def apply(
    keyLength: Double,
    password: String,
    salt: js.typedarray.Uint8Array,
    opsLimit: Double,
    memLimit: Double,
    algorithm: Double
  ): js.typedarray.Uint8Array = js.native
  def apply(
    keyLength: Double,
    password: String,
    salt: js.typedarray.Uint8Array,
    opsLimit: Double,
    memLimit: Double,
    algorithm: Double,
    outputFormat: StringOutputFormat
  ): String = js.native
  def apply(
    keyLength: Double,
    password: String,
    salt: js.typedarray.Uint8Array,
    opsLimit: Double,
    memLimit: Double,
    algorithm: Double,
    outputFormat: Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = js.native
  def apply(
    keyLength: Double,
    password: js.typedarray.Uint8Array,
    salt: js.typedarray.Uint8Array,
    opsLimit: Double,
    memLimit: Double,
    algorithm: Double
  ): js.typedarray.Uint8Array = js.native
  def apply(
    keyLength: Double,
    password: js.typedarray.Uint8Array,
    salt: js.typedarray.Uint8Array,
    opsLimit: Double,
    memLimit: Double,
    algorithm: Double,
    outputFormat: StringOutputFormat
  ): String = js.native
  def apply(
    keyLength: Double,
    password: js.typedarray.Uint8Array,
    salt: js.typedarray.Uint8Array,
    opsLimit: Double,
    memLimit: Double,
    algorithm: Double,
    outputFormat: Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = js.native
}
