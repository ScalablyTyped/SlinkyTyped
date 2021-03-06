package typingsSlinky.devexpressUtils

import typingsSlinky.devexpressUtils.constMod.ConstInterval
import typingsSlinky.devexpressUtils.intervalsMod.SparseIntervals
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iteratorMod {
  
  @JSImport("@devexpress/utils/lib/intervals/sparse/iterator", "SparseIntervalsIterator")
  @js.native
  class SparseIntervalsIterator[T /* <: ConstInterval */] protected () extends StObject {
    def this(sparseIntervals: SparseIntervals[T]) = this()
    
    var curr: js.Any = js.native
    
    var index: Double = js.native
    
    /* protected */ def initObject(): Unit = js.native
    
    var intervalIndex: js.Any = js.native
    
    val isStarted: Boolean = js.native
    
    def moveNext(): Boolean = js.native
    
    def movePrev(): Boolean = js.native
    
    var posInInterval: js.Any = js.native
    
    var sparseIntervals: js.Any = js.native
  }
}
