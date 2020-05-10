package typingsSlinky.reactNavigationMaterialBottomTabs

import typingsSlinky.reactNavigation.mod.NavigationParams
import typingsSlinky.reactNavigation.mod.NavigationRoute
import typingsSlinky.reactNavigationMaterialBottomTabs.typesMod.NavigationTabProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDefaultHandler extends js.Object {
  var navigation: NavigationTabProp[NavigationRoute[NavigationParams], NavigationParams] = js.native
  def defaultHandler(): Unit = js.native
}

object AnonDefaultHandler {
  @scala.inline
  def apply(
    defaultHandler: () => Unit,
    navigation: NavigationTabProp[NavigationRoute[NavigationParams], NavigationParams]
  ): AnonDefaultHandler = {
    val __obj = js.Dynamic.literal(defaultHandler = js.Any.fromFunction0(defaultHandler), navigation = navigation.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDefaultHandler]
  }
  @scala.inline
  implicit class AnonDefaultHandlerOps[Self <: AnonDefaultHandler] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultHandler(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultHandler")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNavigation(value: NavigationTabProp[NavigationRoute[NavigationParams], NavigationParams]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigation")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

