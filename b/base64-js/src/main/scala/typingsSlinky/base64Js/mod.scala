package typingsSlinky.base64Js

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("base64-js", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def byteLength(b64: String): Double = js.native
  
  def fromByteArray(uint8: js.typedarray.Uint8Array): String = js.native
  
  def toByteArray(b64: String): js.typedarray.Uint8Array = js.native
}
