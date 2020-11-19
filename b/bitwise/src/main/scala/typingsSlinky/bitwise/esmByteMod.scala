package typingsSlinky.bitwise

import typingsSlinky.bitwise.typesMod.Bit
import typingsSlinky.bitwise.typesMod.UInt8
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bitwise/esm/byte", JSImport.Namespace)
@js.native
object esmByteMod extends js.Object {
  
  def read(byte: UInt8): js.Tuple8[Bit, Bit, Bit, Bit, Bit, Bit, Bit, Bit] = js.native
  
  def write(byte: js.Tuple8[Bit, Bit, Bit, Bit, Bit, Bit, Bit, Bit]): UInt8 = js.native
  
  @js.native
  object default extends js.Object {
    
    def read(byte: UInt8): js.Tuple8[Bit, Bit, Bit, Bit, Bit, Bit, Bit, Bit] = js.native
    
    def write(byte: js.Tuple8[Bit, Bit, Bit, Bit, Bit, Bit, Bit, Bit]): UInt8 = js.native
  }
}
