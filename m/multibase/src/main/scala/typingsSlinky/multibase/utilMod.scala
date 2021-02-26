package typingsSlinky.multibase

import typingsSlinky.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("multibase/dist/src/util", "concat")
  @js.native
  def concat(arrs: js.Array[ArrayLike[Double]], length: Double): js.typedarray.Uint8Array = js.native
  
  @JSImport("multibase/dist/src/util", "decodeText")
  @js.native
  def decodeText(bytes: js.typedarray.ArrayBuffer): String = js.native
  @JSImport("multibase/dist/src/util", "decodeText")
  @js.native
  def decodeText(bytes: js.typedarray.ArrayBufferView): String = js.native
  
  @JSImport("multibase/dist/src/util", "encodeText")
  @js.native
  def encodeText(text: String): js.typedarray.Uint8Array = js.native
}
