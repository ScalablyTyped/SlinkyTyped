package typingsSlinky.crc32

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("crc-32", "bstr")
  @js.native
  def bstr(data: String): Double = js.native
  @JSImport("crc-32", "bstr")
  @js.native
  def bstr(data: String, seed: Double): Double = js.native
  
  @JSImport("crc-32", "buf")
  @js.native
  def buf(data: js.Array[Double]): Double = js.native
  @JSImport("crc-32", "buf")
  @js.native
  def buf(data: js.Array[Double], seed: Double): Double = js.native
  @JSImport("crc-32", "buf")
  @js.native
  def buf(data: js.typedarray.Uint8Array): Double = js.native
  @JSImport("crc-32", "buf")
  @js.native
  def buf(data: js.typedarray.Uint8Array, seed: Double): Double = js.native
  
  @JSImport("crc-32", "str")
  @js.native
  def str(data: String): Double = js.native
  @JSImport("crc-32", "str")
  @js.native
  def str(data: String, seed: Double): Double = js.native
  
  @JSImport("crc-32", "version")
  @js.native
  val version: String = js.native
}
