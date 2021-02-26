package typingsSlinky.baseX

import typingsSlinky.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("base-x", JSImport.Namespace)
  @js.native
  def apply(ALPHABET: String): BaseConverter = js.native
  
  @js.native
  trait BaseConverter extends StObject {
    
    def decode(string: String): Buffer = js.native
    
    def decodeUnsafe(string: String): js.UndefOr[Buffer] = js.native
    
    def encode(buffer: js.Array[Double]): String = js.native
    def encode(buffer: js.typedarray.Uint8Array): String = js.native
    def encode(buffer: Buffer): String = js.native
  }
}
