package typingsSlinky.base64DashJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("base64-js", JSImport.Namespace)
@js.native
object base64DashJsMod extends js.Object {
  def byteLength(encoded: String): Double = js.native
  def fromByteArray(bytes: scala.scalajs.js.typedarray.Uint8Array): String = js.native
  def toByteArray(encoded: String): scala.scalajs.js.typedarray.Uint8Array = js.native
}

