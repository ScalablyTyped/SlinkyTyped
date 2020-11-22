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

@JSImport("@devexpress/utils/lib/intervals/boundary", JSImport.Namespace)
@js.native
object boundaryMod extends js.Object {
  
  @js.native
  class BoundaryInterval protected ()
    extends MutableInterval
       with IEquatable[BoundaryInterval]
       with ICloneable[BoundaryInterval]
       with ISupportCopyFrom[BoundaryInterval]
       with IReproducibleInterval[BoundaryInterval] {
    def this(start: Double, end: Double) = this()
    
    def expand(interval: BoundaryInterval): this.type = js.native
  }
  /* static members */
  @js.native
  object BoundaryInterval extends js.Object {
    
    def makeByConstInterval(interval: ConstInterval): BoundaryInterval = js.native
    
    def normalized(pointA: Double, pointB: Double): BoundaryInterval = js.native
  }
}
