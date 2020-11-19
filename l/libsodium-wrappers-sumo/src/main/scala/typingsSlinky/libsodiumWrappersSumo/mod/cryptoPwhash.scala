package typingsSlinky.libsodiumWrappersSumo.mod

import typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
import typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libsodium-wrappers-sumo", "crypto_pwhash")
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
