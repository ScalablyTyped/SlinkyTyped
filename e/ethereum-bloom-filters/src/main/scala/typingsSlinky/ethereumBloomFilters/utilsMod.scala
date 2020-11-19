package typingsSlinky.ethereumBloomFilters

import typingsSlinky.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethereum-bloom-filters/dist/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  
  def bytesToHex(bytes: js.typedarray.Uint8Array): String = js.native
  
  def keccak256(data: String): String = js.native
  def keccak256(data: ArrayLike[Double]): String = js.native
  
  def padLeft(value: String, chars: Double): String = js.native
  
  def toByteArray(value: String): js.typedarray.Uint8Array = js.native
  def toByteArray(value: ArrayLike[Double]): js.typedarray.Uint8Array = js.native
}
