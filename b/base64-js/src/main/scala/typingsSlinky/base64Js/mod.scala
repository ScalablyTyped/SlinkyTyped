package typingsSlinky.base64Js

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("base64-js", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def byteLength(encoded: String): Double = js.native
  
  def fromByteArray(bytes: js.typedarray.Uint8Array): String = js.native
  
  def toByteArray(encoded: String): js.typedarray.Uint8Array = js.native
}
