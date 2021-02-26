package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.mod.DevExpress.core.dxElement
import typingsSlinky.devextreme.mod.DevExpress.ui.dxSpeedDialAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionElementComponent extends StObject {
  
  var actionElement: js.UndefOr[dxElement] = js.native
  
  var component: js.UndefOr[dxSpeedDialAction] = js.native
  
  var element: js.UndefOr[dxElement] = js.native
  
  var model: js.UndefOr[js.Any] = js.native
}
object ActionElementComponent {
  
  @scala.inline
  def apply(): ActionElementComponent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionElementComponent]
  }
  
  @scala.inline
  implicit class ActionElementComponentMutableBuilder[Self <: ActionElementComponent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionElement(value: dxElement): Self = StObject.set(x, "actionElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionElementUndefined: Self = StObject.set(x, "actionElement", js.undefined)
    
    @scala.inline
    def setComponent(value: dxSpeedDialAction): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    @scala.inline
    def setElement(value: dxElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    @scala.inline
    def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
  }
}
