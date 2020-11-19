package typingsSlinky.reactNavigation.mod

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SceneViewProps extends js.Object {
  
  var component: ReactComponentClass[js.Object] = js.native
  
  var navigation: NavigationProp[_] = js.native
  
  var screenProps: js.Any = js.native
}
object SceneViewProps {
  
  @scala.inline
  def apply(component: ReactComponentClass[js.Object], navigation: NavigationProp[_], screenProps: js.Any): SceneViewProps = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], screenProps = screenProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneViewProps]
  }
  
  @scala.inline
  implicit class SceneViewPropsOps[Self <: SceneViewProps] (val x: Self) extends AnyVal {
    
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
    def setComponent(value: ReactComponentClass[js.Object]): Self = this.set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigation(value: NavigationProp[_]): Self = this.set("navigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenProps(value: js.Any): Self = this.set("screenProps", value.asInstanceOf[js.Any])
  }
}
