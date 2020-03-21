package typingsSlinky.libsodiumWrappersSumo.mod

import typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
import typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
import typingsSlinky.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers-sumo", "crypto_pwhash_scryptsalsa208sha256")
@js.native
object cryptoPwhashScryptsalsa208sha256 extends js.Object {
  def apply(
    keyLength: Double,
    password: String,
    salt: scala.scalajs.js.typedarray.Uint8Array,
    opsLimit: Double,
    memLimit: Double
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def apply(
    keyLength: Double,
    password: String,
    salt: scala.scalajs.js.typedarray.Uint8Array,
    opsLimit: Double,
    memLimit: Double,
    outputFormat: StringOutputFormat
  ): String = js.native
  def apply(
    keyLength: Double,
    password: String,
    salt: scala.scalajs.js.typedarray.Uint8Array,
    opsLimit: Double,
    memLimit: Double,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def apply(
    keyLength: Double,
    password: Uint8Array,
    salt: scala.scalajs.js.typedarray.Uint8Array,
    opsLimit: Double,
    memLimit: Double
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def apply(
    keyLength: Double,
    password: Uint8Array,
    salt: scala.scalajs.js.typedarray.Uint8Array,
    opsLimit: Double,
    memLimit: Double,
    outputFormat: StringOutputFormat
  ): String = js.native
  def apply(
    keyLength: Double,
    password: Uint8Array,
    salt: scala.scalajs.js.typedarray.Uint8Array,
    opsLimit: Double,
    memLimit: Double,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
}

