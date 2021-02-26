package typingsSlinky.ethersprojectAbi

import typingsSlinky.ethersprojectAbi.abstractCoderMod.Coder
import typingsSlinky.ethersprojectAbi.abstractCoderMod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object booleanMod {
  
  @JSImport("@ethersproject/abi/lib/coders/boolean", "BooleanCoder")
  @js.native
  class BooleanCoder protected () extends Coder {
    def this(localName: String) = this()
    
    def encode(writer: Writer, value: Boolean): Double = js.native
  }
}
