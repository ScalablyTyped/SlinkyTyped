package typingsSlinky.protobufjsBase64

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@protobufjs/base64", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def decode(string: String, buffer: js.typedarray.Uint8Array, offset: Double): Double = js.native
  
  def encode(buffer: js.typedarray.Uint8Array, start: Double, end: Double): String = js.native
  
  def length(string: String): Double = js.native
  
  def test(string: String): Boolean = js.native
}
