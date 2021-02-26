package typingsSlinky.devexpressUtils

import typingsSlinky.devexpressUtils.constMod.ConstInterval
import typingsSlinky.devexpressUtils.intervalsMod.SparseIntervals
import typingsSlinky.devexpressUtils.iteratorMod.SparseIntervalsIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object objectsIteratorMod {
  
  @JSImport("@devexpress/utils/lib/intervals/sparse/objects-iterator", "SparseObjectsIterator")
  @js.native
  class SparseObjectsIterator[T /* <: ConstInterval */, ObjT] protected () extends SparseIntervalsIterator[T] {
    def this(sparseIntervals: SparseIntervals[T], objects: js.Array[ObjT]) = this()
    
    var obj: ObjT = js.native
    
    var objects: js.Array[ObjT] = js.native
  }
}
