package typingsSlinky.ethersprojectAbi

import typingsSlinky.ethersprojectAbi.abstractCoderMod.Coder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ethersproject/abi/lib/coders/bytes", JSImport.Namespace)
@js.native
object bytesMod extends js.Object {
  
  @js.native
  class BytesCoder protected () extends DynamicBytesCoder {
    def this(localName: String) = this()
  }
  
  @js.native
  class DynamicBytesCoder protected () extends Coder {
    def this(`type`: String, localName: String) = this()
  }
}
