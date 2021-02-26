package typingsSlinky.multiformatsBaseX

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@multiformats/base-x", JSImport.Namespace)
  @js.native
  def apply(ALPHABET: String): BaseConverter = js.native
  
  @js.native
  trait BaseConverter extends StObject {
    
    def decode(string: String): js.typedarray.Uint8Array = js.native
    
    def decodeUnsafe(string: String): js.UndefOr[js.typedarray.Uint8Array] = js.native
    
    def encode(buffer: js.Array[Double]): String = js.native
    def encode(buffer: js.typedarray.Uint8Array): String = js.native
  }
}
