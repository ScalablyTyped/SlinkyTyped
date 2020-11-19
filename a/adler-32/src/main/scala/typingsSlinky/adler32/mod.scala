package typingsSlinky.adler32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("adler-32", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def bstr(data: String): Double = js.native
  def bstr(data: String, seed: Double): Double = js.native
  
  def buf(data: js.Array[Double]): Double = js.native
  def buf(data: js.Array[Double], seed: Double): Double = js.native
  def buf(data: js.typedarray.Uint8Array): Double = js.native
  def buf(data: js.typedarray.Uint8Array, seed: Double): Double = js.native
  
  def str(data: String): Double = js.native
  def str(data: String, seed: Double): Double = js.native
  
  val version: String = js.native
}
