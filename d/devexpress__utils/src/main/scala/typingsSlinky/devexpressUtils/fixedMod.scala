package typingsSlinky.devexpressUtils

import typingsSlinky.devexpressUtils.constMod.ConstInterval
import typingsSlinky.devexpressUtils.mutableMod.MutableInterval
import typingsSlinky.devexpressUtils.reproducibleMod.IReproducibleInterval
import typingsSlinky.devexpressUtils.typesMod.ICloneable
import typingsSlinky.devexpressUtils.typesMod.IEquatable
import typingsSlinky.devexpressUtils.typesMod.ISupportCopyFrom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fixedMod {
  
  @JSImport("@devexpress/utils/lib/intervals/fixed", "FixedInterval")
  @js.native
  class FixedInterval protected ()
    extends MutableInterval
       with IEquatable[FixedInterval]
       with ICloneable[FixedInterval]
       with ISupportCopyFrom[FixedInterval]
       with IReproducibleInterval[FixedInterval] {
    def this(start: Double, length: Double) = this()
    
    def expand(interval: FixedInterval): this.type = js.native
  }
  /* static members */
  object FixedInterval {
    
    @JSImport("@devexpress/utils/lib/intervals/fixed", "FixedInterval.fromPositions")
    @js.native
    def fromPositions(start: Double, end: Double): FixedInterval = js.native
    
    @JSImport("@devexpress/utils/lib/intervals/fixed", "FixedInterval.makeByConstInterval")
    @js.native
    def makeByConstInterval(interval: ConstInterval): FixedInterval = js.native
  }
}
