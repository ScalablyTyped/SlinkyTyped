package typingsSlinky.bitwise

import typingsSlinky.bitwise.bitwiseTypesMod.Bit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bitwiseMod {
  
  object default {
    
    @JSImport("bitwise/integer", "default.getBit")
    @js.native
    def getBit(int32: Double, position: Double): Bit = js.native
    
    @JSImport("bitwise/integer", "default.setBit")
    @js.native
    def setBit(int32: Double, position: Double, value: Bit): Bit = js.native
    
    @JSImport("bitwise/integer", "default.toggleBit")
    @js.native
    def toggleBit(int32: Double, position: Double): Double = js.native
  }
  
  @JSImport("bitwise/integer", "getBit")
  @js.native
  def getBit(int32: Double, position: Double): Bit = js.native
  
  @JSImport("bitwise/integer", "setBit")
  @js.native
  def setBit(int32: Double, position: Double, value: Bit): Bit = js.native
  
  @JSImport("bitwise/integer", "toggleBit")
  @js.native
  def toggleBit(int32: Double, position: Double): Double = js.native
}
