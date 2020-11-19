package typingsSlinky.ethersprojectAbi

import typingsSlinky.ethersprojectAbi.abstractCoderMod.Coder
import typingsSlinky.ethersprojectAbi.abstractCoderMod.Writer
import typingsSlinky.ethersprojectBytes.mod.BytesLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ethersproject/abi/lib/coders/fixed-bytes", JSImport.Namespace)
@js.native
object fixedBytesMod extends js.Object {
  
  @js.native
  class FixedBytesCoder protected () extends Coder {
    def this(size: Double, localName: String) = this()
    
    def encode(writer: Writer, value: BytesLike): Double = js.native
    
    val size: Double = js.native
  }
}
