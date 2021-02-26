package typingsSlinky.jsGraphAlgorithms.JsGraphs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueueNode[T] extends StObject {
  
  var next: QueueNode[T] | Null = js.native
  
  var value: T = js.native
}
object QueueNode {
  
  @scala.inline
  def apply[T](value: T): QueueNode[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueueNode[T]]
  }
  
  @scala.inline
  implicit class QueueNodeMutableBuilder[Self <: QueueNode[_], T] (val x: Self with QueueNode[T]) extends AnyVal {
    
    @scala.inline
    def setNext(value: QueueNode[T]): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextNull: Self = StObject.set(x, "next", null)
    
    @scala.inline
    def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
