package typingsSlinky.reactNavigationMaterialBottomTabs.anon

import typingsSlinky.reactNavigation.mod.NavigationParams
import typingsSlinky.reactNavigation.mod.NavigationRoute
import typingsSlinky.reactNavigationMaterialBottomTabs.typesMod.NavigationTabProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultHandler extends js.Object {
  
  def defaultHandler(): Unit = js.native
  
  var navigation: NavigationTabProp[NavigationRoute[NavigationParams], NavigationParams] = js.native
}
object DefaultHandler {
  
  @scala.inline
  def apply(
    defaultHandler: () => Unit,
    navigation: NavigationTabProp[NavigationRoute[NavigationParams], NavigationParams]
  ): DefaultHandler = {
    val __obj = js.Dynamic.literal(defaultHandler = js.Any.fromFunction0(defaultHandler), navigation = navigation.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultHandler]
  }
  
  @scala.inline
  implicit class DefaultHandlerOps[Self <: DefaultHandler] (val x: Self) extends AnyVal {
    
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
    def setDefaultHandler(value: () => Unit): Self = this.set("defaultHandler", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNavigation(value: NavigationTabProp[NavigationRoute[NavigationParams], NavigationParams]): Self = this.set("navigation", value.asInstanceOf[js.Any])
  }
}
