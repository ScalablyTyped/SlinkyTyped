package typingsSlinky.jqueryAjaxfile.anon

import org.scalajs.dom.raw.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddDisposeCallback extends StObject {
  
  def addDisposeCallback(node: org.scalajs.dom.raw.Element, callback: js.Function): Unit = js.native
  
  def cleanNode(node: Node): org.scalajs.dom.raw.Element = js.native
  
  def removeDisposeCallback(node: org.scalajs.dom.raw.Element, callback: js.Function): Unit = js.native
  
  def removeNode(node: Node): Unit = js.native
}
object AddDisposeCallback {
  
  @scala.inline
  def apply(
    addDisposeCallback: (org.scalajs.dom.raw.Element, js.Function) => Unit,
    cleanNode: Node => org.scalajs.dom.raw.Element,
    removeDisposeCallback: (org.scalajs.dom.raw.Element, js.Function) => Unit,
    removeNode: Node => Unit
  ): AddDisposeCallback = {
    val __obj = js.Dynamic.literal(addDisposeCallback = js.Any.fromFunction2(addDisposeCallback), cleanNode = js.Any.fromFunction1(cleanNode), removeDisposeCallback = js.Any.fromFunction2(removeDisposeCallback), removeNode = js.Any.fromFunction1(removeNode))
    __obj.asInstanceOf[AddDisposeCallback]
  }
  
  @scala.inline
  implicit class AddDisposeCallbackMutableBuilder[Self <: AddDisposeCallback] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddDisposeCallback(value: (org.scalajs.dom.raw.Element, js.Function) => Unit): Self = StObject.set(x, "addDisposeCallback", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCleanNode(value: Node => org.scalajs.dom.raw.Element): Self = StObject.set(x, "cleanNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveDisposeCallback(value: (org.scalajs.dom.raw.Element, js.Function) => Unit): Self = StObject.set(x, "removeDisposeCallback", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRemoveNode(value: Node => Unit): Self = StObject.set(x, "removeNode", js.Any.fromFunction1(value))
  }
}
