package typingsSlinky.bitwise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object bitwiseTypesMod {
  
  type Bits = js.Array[typingsSlinky.bitwise.bitwiseTypesMod.Bit]
  
  type BooleanBits = js.Array[scala.Boolean]
  
  type Byte = js.Tuple8[
    typingsSlinky.bitwise.bitwiseTypesMod.Bit, 
    typingsSlinky.bitwise.bitwiseTypesMod.Bit, 
    typingsSlinky.bitwise.bitwiseTypesMod.Bit, 
    typingsSlinky.bitwise.bitwiseTypesMod.Bit, 
    typingsSlinky.bitwise.bitwiseTypesMod.Bit, 
    typingsSlinky.bitwise.bitwiseTypesMod.Bit, 
    typingsSlinky.bitwise.bitwiseTypesMod.Bit, 
    typingsSlinky.bitwise.bitwiseTypesMod.Bit
  ]
  
  type Nibble = js.Tuple4[
    typingsSlinky.bitwise.bitwiseTypesMod.Bit, 
    typingsSlinky.bitwise.bitwiseTypesMod.Bit, 
    typingsSlinky.bitwise.bitwiseTypesMod.Bit, 
    typingsSlinky.bitwise.bitwiseTypesMod.Bit
  ]
}
