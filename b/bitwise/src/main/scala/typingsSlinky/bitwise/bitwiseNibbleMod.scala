package typingsSlinky.bitwise

import typingsSlinky.bitwise.bitwiseTypesMod.Bit
import typingsSlinky.bitwise.bitwiseTypesMod.UInt4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bitwise/nibble", JSImport.Namespace)
@js.native
object bitwiseNibbleMod extends js.Object {
  
  def read(nibble: UInt4): js.Tuple4[Bit, Bit, Bit, Bit] = js.native
  
  def write(nibble: js.Tuple4[Bit, Bit, Bit, Bit]): UInt4 = js.native
  
  @js.native
  object default extends js.Object {
    
    def read(nibble: UInt4): js.Tuple4[Bit, Bit, Bit, Bit] = js.native
    
    def write(nibble: js.Tuple4[Bit, Bit, Bit, Bit]): UInt4 = js.native
  }
}
