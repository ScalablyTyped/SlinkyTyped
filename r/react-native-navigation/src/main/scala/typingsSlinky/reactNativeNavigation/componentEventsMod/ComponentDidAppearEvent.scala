package typingsSlinky.reactNativeNavigation.componentEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComponentDidAppearEvent extends ComponentEvent {
  
  var componentName: String = js.native
  
  var componentType: ComponentType = js.native
  
  var passProps: js.UndefOr[js.Object] = js.native
}
object ComponentDidAppearEvent {
  
  @scala.inline
  def apply(componentId: String, componentName: String, componentType: ComponentType): ComponentDidAppearEvent = {
    val __obj = js.Dynamic.literal(componentId = componentId.asInstanceOf[js.Any], componentName = componentName.asInstanceOf[js.Any], componentType = componentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentDidAppearEvent]
  }
  
  @scala.inline
  implicit class ComponentDidAppearEventOps[Self <: ComponentDidAppearEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setComponentName(value: String): Self = this.set("componentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentType(value: ComponentType): Self = this.set("componentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassProps(value: js.Object): Self = this.set("passProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassProps: Self = this.set("passProps", js.undefined)
  }
}
