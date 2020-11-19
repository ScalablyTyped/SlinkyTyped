package typingsSlinky.libsodiumWrappers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libsodium-wrappers", "randombytes_buf")
@js.native
object randombytesBuf extends js.Object {
  
  def apply(length: Double): js.typedarray.Uint8Array = js.native
  def apply(length: Double, outputFormat: StringOutputFormat): String = js.native
  def apply(length: Double, outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = js.native
}
