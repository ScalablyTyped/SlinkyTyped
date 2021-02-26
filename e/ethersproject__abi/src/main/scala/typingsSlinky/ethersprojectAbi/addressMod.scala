package typingsSlinky.ethersprojectAbi

import typingsSlinky.ethersprojectAbi.abstractCoderMod.Coder
import typingsSlinky.ethersprojectAbi.abstractCoderMod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object addressMod {
  
  @JSImport("@ethersproject/abi/lib/coders/address", "AddressCoder")
  @js.native
  class AddressCoder protected () extends Coder {
    def this(localName: String) = this()
    
    def encode(writer: Writer, value: String): Double = js.native
  }
}
