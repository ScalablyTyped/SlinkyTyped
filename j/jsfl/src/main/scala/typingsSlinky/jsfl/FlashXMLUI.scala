package typingsSlinky.jsfl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlashXMLUI extends StObject {
  
  def accept(): js.Any = js.native
  
  def cancel(): js.Any = js.native
  
  def get(): js.Any = js.native
  
  def getControlItemElement(): js.Any = js.native
  
  def getEnabled(): js.Any = js.native
  
  def getVisible(): js.Any = js.native
  
  def set(): js.Any = js.native
  
  def setControItemElement(): js.Any = js.native
  
  def setControItemElements(): js.Any = js.native
  
  def setEnabled(): js.Any = js.native
  
  def setVisible(): js.Any = js.native
}
object FlashXMLUI {
  
  @scala.inline
  def apply(
    accept: () => js.Any,
    cancel: () => js.Any,
    get: () => js.Any,
    getControlItemElement: () => js.Any,
    getEnabled: () => js.Any,
    getVisible: () => js.Any,
    set: () => js.Any,
    setControItemElement: () => js.Any,
    setControItemElements: () => js.Any,
    setEnabled: () => js.Any,
    setVisible: () => js.Any
  ): FlashXMLUI = {
    val __obj = js.Dynamic.literal(accept = js.Any.fromFunction0(accept), cancel = js.Any.fromFunction0(cancel), get = js.Any.fromFunction0(get), getControlItemElement = js.Any.fromFunction0(getControlItemElement), getEnabled = js.Any.fromFunction0(getEnabled), getVisible = js.Any.fromFunction0(getVisible), set = js.Any.fromFunction0(set), setControItemElement = js.Any.fromFunction0(setControItemElement), setControItemElements = js.Any.fromFunction0(setControItemElements), setEnabled = js.Any.fromFunction0(setEnabled), setVisible = js.Any.fromFunction0(setVisible))
    __obj.asInstanceOf[FlashXMLUI]
  }
  
  @scala.inline
  implicit class FlashXMLUIMutableBuilder[Self <: FlashXMLUI] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccept(value: () => js.Any): Self = StObject.set(x, "accept", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCancel(value: () => js.Any): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet(value: () => js.Any): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetControlItemElement(value: () => js.Any): Self = StObject.set(x, "getControlItemElement", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetEnabled(value: () => js.Any): Self = StObject.set(x, "getEnabled", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetVisible(value: () => js.Any): Self = StObject.set(x, "getVisible", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSet(value: () => js.Any): Self = StObject.set(x, "set", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetControItemElement(value: () => js.Any): Self = StObject.set(x, "setControItemElement", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetControItemElements(value: () => js.Any): Self = StObject.set(x, "setControItemElements", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetEnabled(value: () => js.Any): Self = StObject.set(x, "setEnabled", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetVisible(value: () => js.Any): Self = StObject.set(x, "setVisible", js.Any.fromFunction0(value))
  }
}
