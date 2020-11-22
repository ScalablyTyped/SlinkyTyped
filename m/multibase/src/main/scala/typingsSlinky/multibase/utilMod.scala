package typingsSlinky.multibase

import typingsSlinky.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("multibase/dist/src/util", JSImport.Namespace)
@js.native
object utilMod extends js.Object {
  
  def concat(arrs: js.Array[ArrayLike[Double]], length: Double): js.typedarray.Uint8Array = js.native
  
  def decodeText(bytes: js.typedarray.ArrayBuffer): String = js.native
  def decodeText(bytes: js.typedarray.ArrayBufferView): String = js.native
  
  def encodeText(text: String): js.typedarray.Uint8Array = js.native
}
