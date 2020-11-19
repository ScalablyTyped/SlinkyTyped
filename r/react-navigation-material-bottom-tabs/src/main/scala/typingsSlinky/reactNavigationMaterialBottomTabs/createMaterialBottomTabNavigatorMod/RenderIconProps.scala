package typingsSlinky.reactNavigationMaterialBottomTabs.createMaterialBottomTabNavigatorMod

import typingsSlinky.reactNavigation.mod.NavigationRoute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenderIconProps extends js.Object {
  
  var focused: Boolean = js.native
  
  var horizontal: js.UndefOr[Boolean] = js.native
  
  var route: NavigationRoute[_] = js.native
  
  var tintColor: js.UndefOr[String] = js.native
}
object RenderIconProps {
  
  @scala.inline
  def apply(focused: Boolean, route: NavigationRoute[_]): RenderIconProps = {
    val __obj = js.Dynamic.literal(focused = focused.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderIconProps]
  }
  
  @scala.inline
  implicit class RenderIconPropsOps[Self <: RenderIconProps] (val x: Self) extends AnyVal {
    
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
    def setFocused(value: Boolean): Self = this.set("focused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoute(value: NavigationRoute[_]): Self = this.set("route", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontal(value: Boolean): Self = this.set("horizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHorizontal: Self = this.set("horizontal", js.undefined)
    
    @scala.inline
    def setTintColor(value: String): Self = this.set("tintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTintColor: Self = this.set("tintColor", js.undefined)
  }
}
