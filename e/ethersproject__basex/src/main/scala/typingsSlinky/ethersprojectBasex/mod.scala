package typingsSlinky.ethersprojectBasex

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.ethersprojectBytes.mod.BytesLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ethersproject/basex", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val Base32: BaseX = js.native
  
  val Base58: BaseX = js.native
  
  @js.native
  class BaseX protected () extends js.Object {
    def this(alphabet: String) = this()
    
    var _alphabetMap: StringDictionary[Double] = js.native
    
    var _leader: String = js.native
    
    val alphabet: String = js.native
    
    val base: Double = js.native
    
    def decode(value: String): js.typedarray.Uint8Array = js.native
    
    def encode(value: BytesLike): String = js.native
  }
}
