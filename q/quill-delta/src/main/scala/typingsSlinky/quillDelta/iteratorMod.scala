package typingsSlinky.quillDelta

import typingsSlinky.quillDelta.opMod.Op
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iteratorMod {
  
  @JSImport("quill-delta/dist/Iterator", JSImport.Default)
  @js.native
  class default protected () extends Iterator {
    def this(ops: js.Array[Op]) = this()
  }
  
  @js.native
  trait Iterator extends StObject {
    
    def hasNext(): Boolean = js.native
    
    var index: Double = js.native
    
    def next(): Op = js.native
    def next(length: Double): Op = js.native
    
    var offset: Double = js.native
    
    var ops: js.Array[Op] = js.native
    
    def peek(): Op = js.native
    
    def peekLength(): Double = js.native
    
    def peekType(): String = js.native
    
    def rest(): js.Array[Op] = js.native
  }
}
