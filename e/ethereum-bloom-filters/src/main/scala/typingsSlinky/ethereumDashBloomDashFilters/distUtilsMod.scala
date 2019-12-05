package typingsSlinky.ethereumDashBloomDashFilters

import typingsSlinky.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethereum-bloom-filters/dist/utils", JSImport.Namespace)
@js.native
object distUtilsMod extends js.Object {
  def bytesToHex(bytes: scala.scalajs.js.typedarray.Uint8Array): String = js.native
  def keccak256(data: String): String = js.native
  def keccak256(data: ArrayLike[Double]): String = js.native
  def padLeft(value: String, chars: Double): String = js.native
  def toByteArray(value: String): scala.scalajs.js.typedarray.Uint8Array = js.native
  def toByteArray(value: ArrayLike[Double]): scala.scalajs.js.typedarray.Uint8Array = js.native
}

