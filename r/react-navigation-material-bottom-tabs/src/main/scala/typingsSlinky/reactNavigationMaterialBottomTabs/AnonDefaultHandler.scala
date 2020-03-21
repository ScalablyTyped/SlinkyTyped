package typingsSlinky.reactNavigationMaterialBottomTabs

import typingsSlinky.reactNavigation.mod.NavigationParams
import typingsSlinky.reactNavigation.mod.NavigationRoute
import typingsSlinky.reactNavigationMaterialBottomTabs.typesMod.NavigationTabProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDefaultHandler extends js.Object {
  var navigation: NavigationTabProp[NavigationRoute[NavigationParams], NavigationParams]
  def defaultHandler(): Unit
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
}

