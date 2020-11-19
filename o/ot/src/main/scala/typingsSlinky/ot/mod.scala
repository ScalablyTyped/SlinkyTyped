package typingsSlinky.ot

import typingsSlinky.ot.anon.Anchor
import typingsSlinky.ot.mod.Selection.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ot", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val version: String = js.native
  
  @js.native
  class Selection () extends js.Object {
    
    def equals(other: Selection): Boolean = js.native
    
    var ranges: js.Array[Range] = js.native
  }
  /* static members */
  @js.native
  object Selection extends js.Object {
    
    def createCursor(position: Double): Selection = js.native
    
    @js.native
    class Range protected () extends js.Object {
      def this(anchor: Double, head: Double) = this()
      
      var anchor: Double = js.native
      
      def equals(other: Range): Boolean = js.native
      
      var head: Double = js.native
      
      def isEmpty(): Boolean = js.native
      
      def transform(operation: TextOperation): Range = js.native
    }
    /* static members */
    @js.native
    object Range extends js.Object {
      
      def fromJSON(`object`: Anchor): Range = js.native
    }
  }
  
  @js.native
  class TextOperation () extends js.Object {
    
    @JSName("apply")
    def apply(code: String): String = js.native
    
    var baseLength: Double = js.native
    
    def compose(operation: TextOperation): TextOperation = js.native
    
    def delete(length: Double): TextOperation = js.native
    
    def insert(str: String): TextOperation = js.native
    
    var ops: SerializedTextOperation = js.native
    
    def retain(length: Double): TextOperation = js.native
    
    var targetLength: Double = js.native
    
    def toJSON(): SerializedTextOperation = js.native
  }
  /* static members */
  @js.native
  object TextOperation extends js.Object {
    
    def fromJSON(operation: SerializedTextOperation): TextOperation = js.native
    
    def isDelete(operation: String): Boolean = js.native
    def isDelete(operation: Double): Boolean = js.native
    
    def isInsert(operation: String): Boolean = js.native
    def isInsert(operation: Double): Boolean = js.native
    
    def isRetain(operation: String): Boolean = js.native
    def isRetain(operation: Double): Boolean = js.native
    
    def transform(left: TextOperation, right: TextOperation): TextOperation = js.native
  }
  
  type SerializedTextOperation = js.Array[String | Double]
}
