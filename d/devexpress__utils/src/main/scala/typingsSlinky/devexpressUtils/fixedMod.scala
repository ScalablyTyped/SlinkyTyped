package typingsSlinky.devexpressUtils

import typingsSlinky.devexpressUtils.constMod.ConstInterval
import typingsSlinky.devexpressUtils.mutableMod.MutableInterval
import typingsSlinky.devexpressUtils.reproducibleMod.IReproducibleInterval
import typingsSlinky.devexpressUtils.typesMod.ICloneable
import typingsSlinky.devexpressUtils.typesMod.IEquatable
import typingsSlinky.devexpressUtils.typesMod.ISupportCopyFrom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@devexpress/utils/lib/intervals/fixed", JSImport.Namespace)
@js.native
object fixedMod extends js.Object {
  
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
  @js.native
  object FixedInterval extends js.Object {
    
    def fromPositions(start: Double, end: Double): FixedInterval = js.native
    
    def makeByConstInterval(interval: ConstInterval): FixedInterval = js.native
  }
}
