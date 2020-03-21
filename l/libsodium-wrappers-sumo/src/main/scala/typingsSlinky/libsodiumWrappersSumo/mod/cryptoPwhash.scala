package typingsSlinky.libsodiumWrappersSumo.mod

import typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
import typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
import typingsSlinky.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers-sumo", "crypto_pwhash")
@js.native
object cryptoPwhash extends js.Object {
  def apply(
    keyLength: Double,
    password: String,
    salt: scala.scalajs.js.typedarray.Uint8Array,
    opsLimit: Double,
    memLimit: Double,
    algorithm: Double
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def apply(
    keyLength: Double,
    password: String,
    salt: scala.scalajs.js.typedarray.Uint8Array,
    opsLimit: Double,
    memLimit: Double,
    algorithm: Double,
    outputFormat: StringOutputFormat
  ): String = js.native
  def apply(
    keyLength: Double,
    password: String,
    salt: scala.scalajs.js.typedarray.Uint8Array,
    opsLimit: Double,
    memLimit: Double,
    algorithm: Double,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def apply(
    keyLength: Double,
    password: Uint8Array,
    salt: scala.scalajs.js.typedarray.Uint8Array,
    opsLimit: Double,
    memLimit: Double,
    algorithm: Double
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def apply(
    keyLength: Double,
    password: Uint8Array,
    salt: scala.scalajs.js.typedarray.Uint8Array,
    opsLimit: Double,
    memLimit: Double,
    algorithm: Double,
    outputFormat: StringOutputFormat
  ): String = js.native
  def apply(
    keyLength: Double,
    password: Uint8Array,
    salt: scala.scalajs.js.typedarray.Uint8Array,
    opsLimit: Double,
    memLimit: Double,
    algorithm: Double,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
}

