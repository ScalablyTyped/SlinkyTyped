package typingsSlinky.bitwise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type Bits = js.Array[typingsSlinky.bitwise.typesMod.Bit]
  
  type BooleanBits = js.Array[scala.Boolean]
  
  type Byte = js.Tuple8[
    typingsSlinky.bitwise.typesMod.Bit, 
    typingsSlinky.bitwise.typesMod.Bit, 
    typingsSlinky.bitwise.typesMod.Bit, 
    typingsSlinky.bitwise.typesMod.Bit, 
    typingsSlinky.bitwise.typesMod.Bit, 
    typingsSlinky.bitwise.typesMod.Bit, 
    typingsSlinky.bitwise.typesMod.Bit, 
    typingsSlinky.bitwise.typesMod.Bit
  ]
  
  type Nibble = js.Tuple4[
    typingsSlinky.bitwise.typesMod.Bit, 
    typingsSlinky.bitwise.typesMod.Bit, 
    typingsSlinky.bitwise.typesMod.Bit, 
    typingsSlinky.bitwise.typesMod.Bit
  ]
}
