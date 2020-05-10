package typingsSlinky.libsodiumWrappersSumo.mod

import typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
import typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers-sumo", "crypto_pwhash_scryptsalsa208sha256")
@js.native
object cryptoPwhashScryptsalsa208sha256 extends js.Object {
  def apply(
    keyLength: Double,
    password: String,
    salt: js.typedarray.Uint8Array,
    opsLimit: Double,
    memLimit: Double
  ): js.typedarray.Uint8Array = js.native
  def apply(
    keyLength: Double,
    password: String,
    salt: js.typedarray.Uint8Array,
    opsLimit: Double,
    memLimit: Double,
    outputFormat: StringOutputFormat
  ): String = js.native
  def apply(
    keyLength: Double,
    password: String,
    salt: js.typedarray.Uint8Array,
    opsLimit: Double,
    memLimit: Double,
    outputFormat: Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = js.native
  def apply(
    keyLength: Double,
    password: js.typedarray.Uint8Array,
    salt: js.typedarray.Uint8Array,
    opsLimit: Double,
    memLimit: Double
  ): js.typedarray.Uint8Array = js.native
  def apply(
    keyLength: Double,
    password: js.typedarray.Uint8Array,
    salt: js.typedarray.Uint8Array,
    opsLimit: Double,
    memLimit: Double,
    outputFormat: StringOutputFormat
  ): String = js.native
  def apply(
    keyLength: Double,
    password: js.typedarray.Uint8Array,
    salt: js.typedarray.Uint8Array,
    opsLimit: Double,
    memLimit: Double,
    outputFormat: Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = js.native
}

