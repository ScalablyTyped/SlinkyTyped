package typingsSlinky.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DragEnd extends StObject {
  
  var dataTypes: String | js.Array[String] = js.native
  
  def drag(param0: org.scalajs.dom.raw.Event): Unit = js.native
  
  def dragEnd(param0: org.scalajs.dom.raw.Event): Unit = js.native
  
  def dragStart(param0: org.scalajs.dom.raw.Event, param1: js.Object): Unit = js.native
  
  def linkStyle(param0: js.Object): Unit = js.native
  
  var selector: String = js.native
}
object DragEnd {
  
  @scala.inline
  def apply(
    dataTypes: String | js.Array[String],
    drag: org.scalajs.dom.raw.Event => Unit,
    dragEnd: org.scalajs.dom.raw.Event => Unit,
    dragStart: (org.scalajs.dom.raw.Event, js.Object) => Unit,
    linkStyle: js.Object => Unit,
    selector: String
  ): DragEnd = {
    val __obj = js.Dynamic.literal(dataTypes = dataTypes.asInstanceOf[js.Any], drag = js.Any.fromFunction1(drag), dragEnd = js.Any.fromFunction1(dragEnd), dragStart = js.Any.fromFunction2(dragStart), linkStyle = js.Any.fromFunction1(linkStyle), selector = selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragEnd]
  }
  
  @scala.inline
  implicit class DragEndMutableBuilder[Self <: DragEnd] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataTypes(value: String | js.Array[String]): Self = StObject.set(x, "dataTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataTypesVarargs(value: String*): Self = StObject.set(x, "dataTypes", js.Array(value :_*))
    
    @scala.inline
    def setDrag(value: org.scalajs.dom.raw.Event => Unit): Self = StObject.set(x, "drag", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDragEnd(value: org.scalajs.dom.raw.Event => Unit): Self = StObject.set(x, "dragEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDragStart(value: (org.scalajs.dom.raw.Event, js.Object) => Unit): Self = StObject.set(x, "dragStart", js.Any.fromFunction2(value))
    
    @scala.inline
    def setLinkStyle(value: js.Object => Unit): Self = StObject.set(x, "linkStyle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
  }
}
