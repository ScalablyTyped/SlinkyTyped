package typingsSlinky.igniteUi.Infragistics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectionWrapper extends StObject {
  
  def execCommand(name: js.Object, args: js.Object): Unit = js.native
  
  def focus(): Unit = js.native
  
  def getSelectedItem(): Unit = js.native
  
  def getSelectionAsText(): Unit = js.native
  
  def insertElement(element: js.Object): Unit = js.native
  
  def insertTable(table: js.Object): Unit = js.native
  
  def replaceNode(newNode: js.Object): Unit = js.native
  
  def select(element: js.Object): Unit = js.native
}
object SelectionWrapper {
  
  @scala.inline
  def apply(
    execCommand: (js.Object, js.Object) => Unit,
    focus: () => Unit,
    getSelectedItem: () => Unit,
    getSelectionAsText: () => Unit,
    insertElement: js.Object => Unit,
    insertTable: js.Object => Unit,
    replaceNode: js.Object => Unit,
    select: js.Object => Unit
  ): SelectionWrapper = {
    val __obj = js.Dynamic.literal(execCommand = js.Any.fromFunction2(execCommand), focus = js.Any.fromFunction0(focus), getSelectedItem = js.Any.fromFunction0(getSelectedItem), getSelectionAsText = js.Any.fromFunction0(getSelectionAsText), insertElement = js.Any.fromFunction1(insertElement), insertTable = js.Any.fromFunction1(insertTable), replaceNode = js.Any.fromFunction1(replaceNode), select = js.Any.fromFunction1(select))
    __obj.asInstanceOf[SelectionWrapper]
  }
  
  @scala.inline
  implicit class SelectionWrapperMutableBuilder[Self <: SelectionWrapper] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecCommand(value: (js.Object, js.Object) => Unit): Self = StObject.set(x, "execCommand", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFocus(value: () => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSelectedItem(value: () => Unit): Self = StObject.set(x, "getSelectedItem", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSelectionAsText(value: () => Unit): Self = StObject.set(x, "getSelectionAsText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInsertElement(value: js.Object => Unit): Self = StObject.set(x, "insertElement", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInsertTable(value: js.Object => Unit): Self = StObject.set(x, "insertTable", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReplaceNode(value: js.Object => Unit): Self = StObject.set(x, "replaceNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSelect(value: js.Object => Unit): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
  }
}
