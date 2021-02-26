package typingsSlinky.qlikVisualizationextensions.ExtensionAPI

import typingsSlinky.qlikVisualizationextensions.qlikVisualizationextensionsStrings.button
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICustomButton extends ICustomControl {
  
  var action: valueOrfunc[Unit] = js.native
  
  var component: button = js.native
}
object ICustomButton {
  
  @scala.inline
  def apply(action: valueOrfunc[Unit], component: button, label: String, ref: String, `type`: String): ICustomButton = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICustomButton]
  }
  
  @scala.inline
  implicit class ICustomButtonMutableBuilder[Self <: ICustomButton] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: valueOrfunc[Unit]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionFunction0(value: () => Unit): Self = StObject.set(x, "action", js.Any.fromFunction0(value))
    
    @scala.inline
    def setComponent(value: button): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
  }
}
